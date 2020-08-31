package com.leery.qCreate.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.entity.Brand;


/**
 * 品牌
 *
 * @author leery
 * @since  2020-08-31 09:13:29
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);

}

