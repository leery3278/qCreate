package com.leery.qCreate.sms.service.impl;

import com.leery.qCreate.sms.dao.SeckillSkuRelationDao;
import com.leery.qCreate.sms.entity.SeckillSkuRelation;
import com.leery.qCreate.sms.service.SeckillSkuRelationService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelation> implements SeckillSkuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillSkuRelation> page = this.page(
                new Query<SeckillSkuRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}