package com.leery.qCreate.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;
import com.leery.qCreate.pms.dao.SkuInfoDao;
import com.leery.qCreate.pms.dao.SkuSaleAttrValueDao;
import com.leery.qCreate.pms.entity.SkuInfo;
import com.leery.qCreate.pms.entity.SkuSaleAttrValue;
import com.leery.qCreate.pms.service.SkuInfoService;
import com.leery.qCreate.pms.service.SkuSaleAttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValue> implements SkuSaleAttrValueService {

	@Autowired
	private SkuInfoService skuInfoService;

	@Autowired
	private SkuInfoDao skuInfoDao;

	@Override
	public PageVo queryPage(QueryCondition params) {
		IPage<SkuSaleAttrValue> page = this.page(
				new Query<SkuSaleAttrValue>().getPage(params),
				new QueryWrapper<>()
		);

		return new PageVo(page);
	}

	@Override
	public List<SkuSaleAttrValue> querySkuSaleAttrValueBySkuId(Long spuId) {
		// 查询出所有的sku
		List<SkuInfo> skuInfos = skuInfoDao.selectList(new QueryWrapper<SkuInfo>().eq("spu_id",spuId));
		// 获取所有的skuId
		List<Long> skuIds = new ArrayList<>();
		for(SkuInfo skuInfo:skuInfos) {
			skuIds.add(skuInfo.getSkuId());
		}
		// 查询出spu下所有sku对应的销售属性及值
		List<SkuSaleAttrValue> skuSaleAttrValueEntities = this.list(new QueryWrapper<SkuSaleAttrValue>().in("sku_id", skuIds));
		return skuSaleAttrValueEntities;
	}

}