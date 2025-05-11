package advanced.java11.exercise.orderAnalysis;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderAnalysis {
    public static void main(String[] args) {
        // 제품 목록 생성
        Product laptop = new Product("노트북", "전자제품", 1200000);
        Product phone = new Product("스마트폰", "전자제품", 800000);
        Product book = new Product("자바 책", "도서", 30000);
        Product headphone = new Product("헤드폰", "전자제품", 120000);
        Product tablet = new Product("태블릿", "전자제품", 500000);
        Product charger = new Product("충전기", "액세서리", 25000);

        // 주문 목록 생성
        List<Order> orders = Arrays.asList(
                new Order(1, "김철수", Arrays.asList(laptop, headphone), LocalDate.of(2023, 3, 15)),
                new Order(2, "이영희", Arrays.asList(phone, charger), LocalDate.of(2023, 4, 20)),
                new Order(3, "박민수", Arrays.asList(book, tablet), LocalDate.of(2023, 5, 10)),
                new Order(4, "최지원", Arrays.asList(laptop, phone, charger), LocalDate.of(2023, 5, 22)),
                new Order(5, "김철수", Arrays.asList(tablet, book), LocalDate.of(2023, 6, 5))
        );

        // 1. 총액이 100만원 이상인 주문의 ID 목록을 반환하기
        List<Integer> answer1 = orders.stream()
                .filter(order -> order.getTotalAmount() >= 1000000)
                .map(Order::getOrderId)
                .toList();
        System.out.println("총액 100만원 이상 주문 ID: " + answer1);

        // 2. 각 고객별 총 주문 금액을 계산하여 맵으로 반환하기
        Map<String, Double> answer2 = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getTotalAmount)
                ));
        System.out.println("고객별 총 주문 금액: " + answer2);

        // 3. 모든 주문에서 가장 많이 구매된 제품 카테고리를 찾기
        String answer3 = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("없음");
        System.out.println("가장 많이 구매된 카테고리: " + answer3);

        // 4. 2023년 5월 이후의 주문에서 구매된 모든 제품의 이름을 중복 없이 반환하기
        List<String> answer4 = orders.stream()
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2023, 4, 30)))
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getName)
                .distinct()
                .toList();
        System.out.println("5월 이후 구매된 제품: " + answer4);

        // 5. 각 제품 카테고리별 평균 가격을 계산하기
        Map<String, Double> answer5 = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));
        System.out.println("카테고리별 평균 가격: " + answer5);

        // 6. 모든 주문을 날짜별로 그룹화하고, 각 날짜의 총 주문 금액을 계산하기
        Map<LocalDate, Double> answer6 = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getOrderDate,
                        Collectors.summingDouble(Order::getTotalAmount)
                ));
        System.out.println("날짜별 총 주문 금액: " + answer6);
    }
}
