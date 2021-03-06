package com.leery.qCreate.pms.controller;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import com.leery.qCreate.pms.entity.Category;
import com.leery.qCreate.pms.service.CategoryService;
import com.leery.qCreate.pms.vo.CategoryVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


/**
 * 商品三级分类
 *
 * @author leery
 * @since 2020-09-01 08:05:29
 */
@Api(tags = "商品三级分类管理")
@RestController
@RequestMapping("pms/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("{pid}")
    public Resp<List<CategoryVO>> queryCategoryVO(@PathVariable("pid") Long pid) {
        List<CategoryVO> categoryVOS = categoryService.queryCategoryVO(pid);
        return Resp.ok(categoryVOS);
    }

    @ApiOperation("根据分类等级或者父id查询分类")
    @GetMapping
    public Resp<List<Category>> queryCategoryByPidOrLevel(@RequestParam(value = "parentCid", required = false) Long parentCid, @RequestParam(value = "level", defaultValue = "0") Integer level) {
        // 如果没传level,则level默认=0,即查询全部
        List<Category> categories = categoryService.queryCategoryByPidOrLevel(parentCid, level);
        return Resp.ok(categories);
    }

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:category:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = categoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{catId}")
    @PreAuthorize("hasAuthority('pms:category:info')")
    public Resp<Category> info(@PathVariable("catId") Long catId) {
        Category category = categoryService.getById(catId);

        return Resp.ok(category);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:category:save')")
    public Resp<Object> save(@RequestBody Category category) {
        categoryService.save(category);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:category:update')")
    public Resp<Object> update(@RequestBody Category category) {
        categoryService.updateById(category);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:category:delete')")
    public Resp<Object> delete(@RequestBody Long[] catIds) {
        categoryService.removeByIds(Arrays.asList(catIds));

        return Resp.ok(null);
    }

}
