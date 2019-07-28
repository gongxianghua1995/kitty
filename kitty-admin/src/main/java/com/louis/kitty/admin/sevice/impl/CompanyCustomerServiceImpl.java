package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import com.louis.kitty.admin.dao.CompanyCustomerMapper;
import com.louis.kitty.admin.model.CompanyCustomer;
import com.louis.kitty.admin.sevice.CompanyCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;


/**
 * ---------------------------
 *  (CompanyCustomerServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:05:12
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class CompanyCustomerServiceImpl implements CompanyCustomerService {

	@Autowired
	private CompanyCustomerMapper companyCustomerMapper;

	@Override
	public int save(CompanyCustomer record) {
		if(record.getId() == null || record.getId() == 0) {
			return companyCustomerMapper.add(record);
		}
		return companyCustomerMapper.update(record);
	}

	@Override
	public int delete(CompanyCustomer record) {
		return companyCustomerMapper.delete(record.getId());
	}

	@Override
	public int delete(List<CompanyCustomer> records) {
		for(CompanyCustomer record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public CompanyCustomer findById(Long id) {
		return companyCustomerMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {

		PageResult pageResult = null;
		String name = SysUserServiceImpl.getColumnFilterValue(pageRequest, "name");
		if(name != null) {
			if(name != null) {
				pageResult = MybatisPageHelper.findPage(pageRequest, companyCustomerMapper, "findPageByName", name);
			}
		} else {
			pageResult = MybatisPageHelper.findPage(pageRequest, companyCustomerMapper);
		}
		return pageResult;
	}

	@Override
	public PageResult findByUserId(PageRequest pageRequest) {
		PageResult pageResult = null;
		Long uid = Long.parseLong(SysUserServiceImpl.getColumnFilterValue(pageRequest, "uid"));
		pageResult = MybatisPageHelper.findPage(pageRequest, companyCustomerMapper, "findPageByUid", uid);
		return pageResult;
	}
	
}
