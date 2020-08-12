package com.leery.qCreate.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.oms.entity.OrderItem;

/**
 * 订单项信息
 *
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
public interface OrderItemService extends IService<OrderItem> {

    PageVo queryPage(QueryCondition params);
}

