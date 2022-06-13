package com.Service.terrapay;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.terrapay.Order;
import com.Repository.terrapay.OrderRepositoryClass.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	public Order saveOrder(Order order) {
		return repo.save(order);
	}

	public Order saveOrderDetails(Order order) {

		return null;
	}

	public Optional<Order> getOrderById(Integer orderid) {

		return repo.findById(orderid);
	}

	public Optional<Order> getOrderByPinCode(Integer pincode) {

		return repo.findById(pincode);
	}
}
