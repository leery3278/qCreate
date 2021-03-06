package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.SpuComment;


/**
 * 商品评价
 *
 * @author jiangli
 * @since  2020-01-10 04:05:29
 */
public interface SpuCommentService extends IService<SpuComment> {

    PageVo queryPage(QueryCondition params);
}

