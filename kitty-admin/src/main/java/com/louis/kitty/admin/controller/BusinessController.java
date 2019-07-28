package com.louis.kitty.admin.controller;

import java.util.List;

import com.louis.kitty.admin.model.Business;
import com.louis.kitty.admin.sevice.BusinessService;
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
 * 商机 (BusinessController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 09:53:10
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("business")
public class BusinessController {

	@Autowired
	private BusinessService businessService;

	/**
	 * 保存商机
	 * @param record
	 * @return
	 */	
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Business record) {
		return HttpResult.ok(businessService.save(record));
	}

    /**
     * 删除商机
     * @param records
     * @return
     */
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Business> records) {
		return HttpResult.ok(businessService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */    
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(businessService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */ 	
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(businessService.findById(id));
	}

	//我的合同
	@GetMapping(value="/findByUid")
	public HttpResult findByUid(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(businessService.findByUserId(pageRequest));
	}
}
