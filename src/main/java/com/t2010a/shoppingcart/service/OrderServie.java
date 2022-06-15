package com.t2010a.shoppingcart.service;

import com.t2010a.shoppingcart.entity.Order;
import com.t2010a.shoppingcart.repository.OrderRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class OrderServie {
    final OrderRepository orderRepository;

    public OrderServie(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Page<Order> findAll(int page, int limit,
                               Specification<Order> orderSpecification) {
        return orderRepository.findAll(
                orderSpecification, PageRequest.of(page - 1, limit, Sort.by(Sort.Direction.ASC, "createdAt")));
    }

}
