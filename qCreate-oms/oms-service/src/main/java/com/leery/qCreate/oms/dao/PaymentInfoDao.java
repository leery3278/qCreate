package com.leery.qCreate.oms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.oms.entity.PaymentInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfo> {
	
}
