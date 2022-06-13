package com.Repository.terrapay;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.terrapay.Order;

public class OrderRepositoryClass {
	@Repository
	public interface OrderRepository extends JpaRepository<Order, Integer>{



}
}