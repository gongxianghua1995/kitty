package com.louis.kitty.admin.controller;

import java.util.List;

import com.louis.kitty.admin.model.PersonalInformation;
import com.louis.kitty.admin.sevice.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.louis.kitty.core.http.HttpResult;
import com.louis.kitty.core.page.PageRequest;


/**
 * ---------------------------
 * 个人客户信息表 (PersonalInformationController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 10:51:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("personalInformation")
public class PersonalInformationController {

	@Autowired
	private PersonalInformationService personalInformationService;

	/**
	 * 保存个人客户信息表
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody PersonalInformation record) {
		return HttpResult.ok(personalInformationService.save(record));
	}

    /**
     * 删除个人客户信息表
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<PersonalInformation> records) {
		return HttpResult.ok(personalInformationService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(personalInformationService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(personalInformationService.findById(id));
	}
}
