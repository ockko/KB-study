package polymorphism.com.ohgiraffers.hw1.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Book {
    private String title;
    private String author;
    private String publisher;
}
