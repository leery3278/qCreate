package com.leery.qCreate.ums.service.impl;

import com.leery.qCreate.ums.dao.MemberLevelDao;
import com.leery.qCreate.ums.entity.MemberLevel;
import com.leery.qCreate.ums.service.MemberLevelService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;


@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevel> implements MemberLevelService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberLevel> page = this.page(
                new Query<MemberLevel>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}