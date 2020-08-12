package com.leery.qCreate.oms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.oms.entity.OrderReturnApply;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApply> {
	
}
