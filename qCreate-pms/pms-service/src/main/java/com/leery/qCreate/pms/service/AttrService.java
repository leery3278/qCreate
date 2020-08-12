package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.Attr;
import com.leery.qCreate.pms.vo.AttrVO;


/**
 * 商品属性
 *
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);

	PageVo queryAttrByCidAndType(QueryCondition queryCondition, Long cid, Integer type);

	void saveAttrVO(AttrVO attrVO);

	Attr getByAttrId(Long attrId);
}

