package com.louis.kitty.admin.controller;

import java.util.List;

import com.louis.kitty.admin.model.Contract;
import com.louis.kitty.admin.sevice.ContractService;
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
 *  (ContractController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:16:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("contract")
public class ContractController {

	@Autowired
	private ContractService contractService;

	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@PreAuthorize("hasAuthority('sys:contract:add') AND hasAuthority('sys:contract:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Contract record) {
		return HttpResult.ok(contractService.save(record));
	}

    /**
     * 删除
     * @param records
     * @return
     */
	@PreAuthorize("hasAuthority('sys:contactor:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Contract> records) {
		return HttpResult.ok(contractService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	@PreAuthorize("hasAuthority('sys:contract:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(contractService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	@PreAuthorize("hasAuthority('sys:contract:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(contractService.findById(id));
	}
}
