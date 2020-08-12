package com.leery.qCreate.ums.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leery.qCreate.ums.dao.GrowthChangeHistoryDao;
import com.leery.qCreate.ums.entity.GrowthChangeHistory;
import com.leery.qCreate.ums.service.GrowthChangeHistoryService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistory> implements GrowthChangeHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<GrowthChangeHistory> page = this.page(
                new Query<GrowthChangeHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}