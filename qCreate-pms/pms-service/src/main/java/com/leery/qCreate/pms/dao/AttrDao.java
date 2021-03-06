package com.leery.qCreate.pms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.pms.entity.Attr;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
@Mapper
public interface AttrDao extends BaseMapper<Attr> {
	
}
