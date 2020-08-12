package com.leery.qCreate.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.oms.entity.Order;
import com.leery.qCreate.oms.vo.OrderSubmitVO;

/**
 * 订单
 *
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
public interface OrderService extends IService<Order> {

    PageVo queryPage(QueryCondition params);

	Order saveOrder(OrderSubmitVO orderSubmitVO);
}

