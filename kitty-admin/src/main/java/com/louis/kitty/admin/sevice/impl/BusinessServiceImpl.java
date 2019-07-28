package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import com.louis.kitty.admin.dao.BusinessMapper;
import com.louis.kitty.admin.model.Business;
import com.louis.kitty.admin.sevice.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;


/**
 * ---------------------------
 * 商机 (BusinessServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 09:53:10
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessMapper businessMapper;

	@Override
	public int save(Business record) {
		if(record.getId() == null || record.getId() == 0) {
			return businessMapper.add(record);
		}
		return businessMapper.update(record);
	}

	@Override
	public int delete(Business record) {
		return businessMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Business> records) {
		for(Business record:records) {
			delete(record);
		}
		return 1;
	}


	@Override
	public Business findById(Long id) {
		return businessMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		PageResult pageResult = null;
		String name = SysUserServiceImpl.getColumnFilterValue(pageRequest, "name");
		if(name != null) {
			if(name != null) {
				pageResult = MybatisPageHelper.findPage(pageRequest, businessMapper, "findPageByName", name);
			}
		} else {
			pageResult = MybatisPageHelper.findPage(pageRequest, businessMapper);
		}
		return pageResult;
	}
	
}
