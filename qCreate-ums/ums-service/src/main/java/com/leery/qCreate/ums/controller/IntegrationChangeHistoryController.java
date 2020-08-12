package com.leery.qCreate.ums.controller;

import java.util.Arrays;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import com.leery.qCreate.ums.entity.IntegrationChangeHistory;
import com.leery.qCreate.ums.service.IntegrationChangeHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 积分变化历史记录
 * @author jiangli
 * @since  2020-01-27 19:50:04
 */
@Api(tags = "积分变化历史记录 管理")
@RestController
@RequestMapping("ums/integrationchangehistory")
public class IntegrationChangeHistoryController {
    @Autowired
    private IntegrationChangeHistoryService integrationChangeHistoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:integrationchangehistory:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = integrationChangeHistoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:integrationchangehistory:info')")
    public Resp<IntegrationChangeHistory> info(@PathVariable("id") Long id){
		IntegrationChangeHistory integrationChangeHistory = integrationChangeHistoryService.getById(id);

        return Resp.ok(integrationChangeHistory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:integrationchangehistory:save')")
    public Resp<Object> save(@RequestBody IntegrationChangeHistory integrationChangeHistory){
		integrationChangeHistoryService.save(integrationChangeHistory);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:integrationchangehistory:update')")
    public Resp<Object> update(@RequestBody IntegrationChangeHistory integrationChangeHistory){
		integrationChangeHistoryService.updateById(integrationChangeHistory);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:integrationchangehistory:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		integrationChangeHistoryService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}