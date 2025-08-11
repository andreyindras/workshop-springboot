package com.courseudemy.course.repositories;

import com.courseudemy.course.entities.OrderItem;
import com.courseudemy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
