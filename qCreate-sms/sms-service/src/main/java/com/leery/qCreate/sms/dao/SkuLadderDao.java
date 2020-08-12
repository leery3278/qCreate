package com.leery.qCreate.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.sms.entity.SkuLadder;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadder> {
	
}
