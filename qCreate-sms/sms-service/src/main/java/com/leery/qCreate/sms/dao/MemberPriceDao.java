package com.leery.qCreate.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.sms.entity.MemberPrice;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
