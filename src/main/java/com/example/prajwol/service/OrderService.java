package com.example.prajwol.service;


import com.example.prajwol.entity.Order;

import com.example.prajwol.pojo.OrderPojo;
import java.util.List;
import java.util.Optional;

public interface OrderService {

        void saveOrder(OrderPojo orderPojo);

        List<Order> findAll();
        List<Order> findByUserId(Integer userId);
        Optional<Order> findById(Integer id);

        void deleteById(Integer id);



    }


