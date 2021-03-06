package com.leery.qCreate.pms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.pms.entity.Brand;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
@Mapper
public interface BrandDao extends BaseMapper<Brand> {
	
}
