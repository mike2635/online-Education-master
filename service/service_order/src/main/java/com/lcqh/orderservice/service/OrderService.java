package com.lcqh.orderservice.service;

import com.lcqh.orderservice.entity.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author lcqh
 * @since 2020-08-16
 */
public interface OrderService extends IService<Order> {

    String createOrders(String courseId, String memberId);
}
