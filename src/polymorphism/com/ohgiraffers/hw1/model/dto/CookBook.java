package polymorphism.com.ohgiraffers.hw1.model.dto;

import lombok.*;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class CookBook extends Book {
    private boolean coupon;

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }
}
