package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.Category;
import com.leery.qCreate.pms.vo.CategoryVO;

import java.util.List;


/**
 * 商品三级分类
 *
 * @author leery
 * @since  2020-09-01 08:05:29
 */
public interface CategoryService extends IService<Category> {

    /**
     * 根据分类等级或者父id查询分类
     * @param parentCid
     * @param level
     * @return
     */
    List<Category> queryCategoryByPidOrLevel(Long parentCid, Integer level);

    PageVo queryPage(QueryCondition params);

	List<CategoryVO> queryCategoryVO(Long pid);
}

