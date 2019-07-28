package com.louis.kitty.admin.sevice.impl;

import java.util.List;

import com.louis.kitty.admin.dao.ClueMapper;
import com.louis.kitty.admin.model.Clue;
import com.louis.kitty.admin.sevice.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.kitty.core.page.MybatisPageHelper;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;


/**
 * ---------------------------
 *  (ClueServiceImpl)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 09:53:10
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@Service
public class ClueServiceImpl implements ClueService {

	@Autowired
	private ClueMapper clueMapper;

	@Override
	public int save(Clue record) {
		if(record.getId() == null || record.getId() == 0) {
			return clueMapper.add(record);
		}
		return clueMapper.update(record);
	}

	@Override
	public int delete(Clue record) {
		return clueMapper.delete(record.getId());
	}

	@Override
	public int delete(List<Clue> records) {
		for(Clue record:records) {
			delete(record);
		}
		return 1;
	}

	@Override
	public Clue findById(Long id) {
		return clueMapper.findById(id);
	}

	@Override
	public PageResult findPage(PageRequest pageRequest) {
		PageResult pageResult = null;
		String name = SysUserServiceImpl.getColumnFilterValue(pageRequest, "name");
		if(name != null) {
			if(name != null) {
				pageResult = MybatisPageHelper.findPage(pageRequest, clueMapper, "findPageByName", name);
			}
		} else {
			pageResult = MybatisPageHelper.findPage(pageRequest, clueMapper);
		}
		return pageResult;
	}
	
}
