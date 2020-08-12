package com.leery.qCreate.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.sms.entity.SeckillPromotion;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface SeckillPromotionDao extends BaseMapper<SeckillPromotion> {
	
}
