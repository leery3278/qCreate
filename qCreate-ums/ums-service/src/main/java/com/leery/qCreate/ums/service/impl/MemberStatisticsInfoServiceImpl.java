package com.leery.qCreate.ums.service.impl;

import com.leery.qCreate.ums.dao.MemberStatisticsInfoDao;
import com.leery.qCreate.ums.entity.MemberStatisticsInfo;
import com.leery.qCreate.ums.service.MemberStatisticsInfoService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfo> implements MemberStatisticsInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberStatisticsInfo> page = this.page(
                new Query<MemberStatisticsInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}