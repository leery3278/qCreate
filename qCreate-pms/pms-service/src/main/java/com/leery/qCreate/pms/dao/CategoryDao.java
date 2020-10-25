package com.leery.qCreate.pms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.pms.entity.Category;
import com.leery.qCreate.pms.vo.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品三级分类
 * @author leery
 * @since  2020-09-01 08:05:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {

	List<CategoryVO> queryCategoryVO(Long pid);
	
}
