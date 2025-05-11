package advanced.java11.exercise.orderAnalysis;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String category;
    private double price;
}
