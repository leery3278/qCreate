package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.AttrAttrgroupRelation;

import java.util.List;


/**
 * 属性&属性分组关联
 *
 * @author leery
 * @since 2020-09-01 08:05:29
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageVo queryPage(QueryCondition params);

	void deleteByAttrIdAndAttrGroupId(List<AttrAttrgroupRelation> relations);

    AttrAttrgroupRelation selectById(Long id);

}

