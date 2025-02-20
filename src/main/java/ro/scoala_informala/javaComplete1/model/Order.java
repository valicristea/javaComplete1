package ro.scoala_informala.javaComplete1.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private int id;
    List<Product> productList = new ArrayList<>();

}
