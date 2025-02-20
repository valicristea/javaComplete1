package ro.scoala_informala.javaComplete1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private List<Order> orderList;

}
