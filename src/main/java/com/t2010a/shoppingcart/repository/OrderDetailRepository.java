package com.t2010a.shoppingcart.repository;

import com.t2010a.shoppingcart.entity.OrderDetail;
import com.t2010a.shoppingcart.entity.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId>, JpaSpecificationExecutor<OrderDetail> {
}
