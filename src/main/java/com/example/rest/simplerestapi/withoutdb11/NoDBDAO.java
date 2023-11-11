package com.example.rest.simplerestapi.withoutdb11;

import com.example.rest.simplerestapi.withoutdb11.model.Orders;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class NoDBDAO {
    public List<Orders> ordersList = new ArrayList<>();
    public List<Orders> getOrders = Stream.of(
            new Orders(101,"book", 1000.00, 5),
            new Orders(102,"laptop", 10000.00, 1),
            new Orders(103,"tv", 2000.00, 1))
            .collect(Collectors.toList());

    public List<Orders> getOrders11 = Arrays.asList(
                    new Orders(201, "book1", 1000.00, 5),
                    new Orders(202, "laptop1", 10000.00, 1),
                    new Orders(203, "tv1", 2000.00, 1));


}
