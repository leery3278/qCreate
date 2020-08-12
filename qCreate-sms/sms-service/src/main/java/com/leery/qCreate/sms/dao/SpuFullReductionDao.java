package com.leery.qCreate.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.sms.entity.SpuFullReduction;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface SpuFullReductionDao extends BaseMapper<SpuFullReduction> {
	
}
