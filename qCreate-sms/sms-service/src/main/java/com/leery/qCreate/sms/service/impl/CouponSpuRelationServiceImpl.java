package com.leery.qCreate.sms.service.impl;

import com.leery.qCreate.sms.dao.CouponSpuRelationDao;
import com.leery.qCreate.sms.entity.CouponSpuRelation;
import com.leery.qCreate.sms.service.CouponSpuRelationService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelation> implements CouponSpuRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponSpuRelation> page = this.page(
                new Query<CouponSpuRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}