package hw.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private String bNo;
    private int category;
    private String title;
    private String author;
}
