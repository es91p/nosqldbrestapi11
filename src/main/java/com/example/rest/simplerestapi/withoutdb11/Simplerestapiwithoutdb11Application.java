package com.example.rest.simplerestapi.withoutdb11;

import com.example.rest.simplerestapi.withoutdb11.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController("/orders")
public class Simplerestapiwithoutdb11Application {

	public static void main(String[] args) {
		System.out.println("Entry into - Simplerestapiwithoutdb11Application - main()");
		SpringApplication.run(Simplerestapiwithoutdb11Application.class, args);
		System.out.println("Exit from - Simplerestapiwithoutdb11Application - main()");

	}


	@Autowired
	private NoDBDAO noDBDAO = new NoDBDAO();

	@PostMapping("addOrder")
	public Orders createOrder(@RequestBody Orders order) {
		noDBDAO.getOrders.add(order);
		return order;
	}
	@GetMapping("allOreders")
	public List<Orders> createOrder() {
		return noDBDAO.getOrders;

	}

	@GetMapping("allOreders11")
	public List<Orders> createOrder11() {
		return noDBDAO.getOrders11;
	}

	@GetMapping("/")
	public String getMessage() {
		return "A new order  can be addded";

	}

}
