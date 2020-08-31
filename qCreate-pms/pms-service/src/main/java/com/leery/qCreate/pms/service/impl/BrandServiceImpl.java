package com.leery.qCreate.pms.service.impl;

import com.leery.qCreate.pms.dao.BrandDao;
import com.leery.qCreate.pms.entity.Brand;
import com.leery.qCreate.pms.service.BrandService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, Brand> implements BrandService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Brand> page = this.page(
            new Query<Brand>().getPage(params),
            new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}