package com.louis.kitty.admin.controller;

import java.util.List;

import com.louis.kitty.admin.model.CompanyCustomer;
import com.louis.kitty.admin.sevice.CompanyCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
 *  (CompanyCustomerController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:05:12
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("companyCustomer")
public class CompanyCustomerController {

	@Autowired
	private CompanyCustomerService companyCustomerService;

	/**
	 * 保存
	 * @param record
	 * @return
	 */
//	@PreAuthorize("hasAuthority('sys:customer:add') AND hasAuthority('sys:customer:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody CompanyCustomer record) {
		return HttpResult.ok(companyCustomerService.save(record));
	}

    /**
     * 删除
     * @param records
     * @return
     */
//	@PreAuthorize("hasAuthority('sys:customer:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<CompanyCustomer> records) {
		return HttpResult.ok(companyCustomerService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
//	@PreAuthorize("hasAuthority('sys:customer:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(companyCustomerService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
//	@PreAuthorize("hasAuthority('sys:customer:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(companyCustomerService.findById(id));
	}
}
