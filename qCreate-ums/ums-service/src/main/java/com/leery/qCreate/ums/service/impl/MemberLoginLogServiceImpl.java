package com.leery.qCreate.ums.service.impl;

import com.leery.qCreate.ums.dao.MemberLoginLogDao;
import com.leery.qCreate.ums.entity.MemberLoginLog;
import com.leery.qCreate.ums.service.MemberLoginLogService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

@Service("memberLoginLogService")
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogDao, MemberLoginLog> implements MemberLoginLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberLoginLog> page = this.page(
                new Query<MemberLoginLog>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}