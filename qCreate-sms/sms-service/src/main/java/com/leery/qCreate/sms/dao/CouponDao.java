package com.leery.qCreate.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.sms.entity.Coupon;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface CouponDao extends BaseMapper<Coupon> {
	
}
