package polymorphism.com.ohgiraffers.hw1.model.dto;

import lombok.*;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class AniBook extends Book {
    private int accessAge;

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }
}
