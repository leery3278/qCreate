package com.leery.qCreate.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.sms.entity.CategoryBounds;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分类积分设置
 * @author jiangli
 * @since  2020-01-11 18:31:30
 */
@Mapper
public interface CategoryBoundsDao extends BaseMapper<CategoryBounds> {
	
}
