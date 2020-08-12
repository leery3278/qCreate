package com.leery.qCreate.pms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leery.qCreate.pms.entity.Category;
import com.leery.qCreate.pms.vo.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品三级分类
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {

	List<CategoryVO> queryCategoryVO(Long pid);
	
}
