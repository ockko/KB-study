package advanced.java11.ch17.problem1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {
    private String productName;
    private String brand;
    private String category;
    private int price;
}
