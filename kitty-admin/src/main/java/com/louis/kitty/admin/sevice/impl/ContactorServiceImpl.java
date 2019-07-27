package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import com.louis.kitty.admin.dao.ContactorMapper;
import com.louis.kitty.admin.model.Contactor;
import com.louis.kitty.admin.sevice.ContactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;



/**
 * ---------------------------
 *  (ContactorServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:16:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class ContactorServiceImpl implements ContactorService {

	@Autowired
	private ContactorMapper contactorMapper;

	@Override
	public int save(Contactor record) {
		if(record.getId() == null || record.getId() == 0) {
			return contactorMapper.add(record);
		}
		return contactorMapper.update(record);
	}

	@Override
	public int delete(Contactor record) {
		return contactorMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Contactor> records) {
		for(Contactor record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Contactor findById(Long id) {
		return contactorMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		return MybatisPageHelper.findPage(pageRequest, contactorMapper);
	}
	
}
