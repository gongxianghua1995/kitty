package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import com.louis.kitty.admin.dao.ContractMapper;
import com.louis.kitty.admin.model.Contract;
import com.louis.kitty.admin.sevice.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;


/**
 * ---------------------------
 *  (ContractServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:16:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ContractMapper contractMapper;

	@Override
	public int save(Contract record) {
		if(record.getId() == null || record.getId() == 0) {
			return contractMapper.add(record);
		}
		return contractMapper.update(record);
	}

	@Override
	public int delete(Contract record) {
		return contractMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Contract> records) {
		for(Contract record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Contract findById(Long id) {
		return contractMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		PageResult pageResult = null;
		String name = SysUserServiceImpl.getColumnFilterValue(pageRequest, "name");
		if(name != null) {
			if(name != null) {
				pageResult = MybatisPageHelper.findPage(pageRequest, contractMapper, "findPageByName", name);
			}
		} else {
			pageResult = MybatisPageHelper.findPage(pageRequest, contractMapper);
		}
		return pageResult;
	}
	
}
