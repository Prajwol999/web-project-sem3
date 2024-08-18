package com.example.prajwol.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderPojo {
    private Integer id;
    private Integer itemId;
    private Integer userId;
    private String deliveryDate;
    private String deliveryTime;
    private String deliveryStatus;
    private String paymentStatus;
    private String Color;
    private String Size;
    private Integer Quantity;
}
