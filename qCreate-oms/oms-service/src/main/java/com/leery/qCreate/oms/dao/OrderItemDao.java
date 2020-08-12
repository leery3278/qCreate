package com.leery.qCreate.oms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.oms.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItem> {
	
}
