package com.leery.qCreate.oms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.oms.entity.OrderSetting;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * @author jiangli
 * @since  2020-01-30 10:17:57
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSetting> {
	
}
