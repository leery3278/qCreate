package com.leery.qCreate.oms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.oms.entity.OrderReturnReason;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReason> {
	
}
