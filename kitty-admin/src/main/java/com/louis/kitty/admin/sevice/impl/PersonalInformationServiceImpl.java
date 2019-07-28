package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import com.louis.kitty.admin.dao.PersonalInformationMapper;
import com.louis.kitty.admin.model.PersonalInformation;
import com.louis.kitty.admin.sevice.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;


/**
 * ---------------------------
 * 个人客户信息表 (PersonalInformationServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 10:51:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class PersonalInformationServiceImpl implements PersonalInformationService {

	@Autowired
	private PersonalInformationMapper personalInformationMapper;

	@Override
	public int save(PersonalInformation record) {
		if(record.getId() == null || record.getId() == 0) {
			return personalInformationMapper.add(record);
		}
		return personalInformationMapper.update(record);
	}

	@Override
	public int delete(PersonalInformation record) {
		return personalInformationMapper.delete(record.getId());
	}

	@Override
	public int delete(List<PersonalInformation> records) {
		for(PersonalInformation record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public PersonalInformation findById(Long id) {
		return personalInformationMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		PageResult pageResult = null;
		String name = SysUserServiceImpl.getColumnFilterValue(pageRequest, "name");
		if(name != null) {
			if(name != null) {
				pageResult = MybatisPageHelper.findPage(pageRequest, personalInformationMapper, "findPageByName", name);
			}
		} else {
			pageResult = MybatisPageHelper.findPage(pageRequest, personalInformationMapper);
		}
		return pageResult;
	}
	
}
