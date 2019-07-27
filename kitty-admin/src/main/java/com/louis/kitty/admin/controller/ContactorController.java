package com.louis.kitty.admin.controller;

import java.util.List;

import com.louis.kitty.admin.model.Contactor;
import com.louis.kitty.admin.sevice.ContactorService;
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
 *  (ContactorController)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:16:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
@RestController
@RequestMapping("contactor")
public class ContactorController {

	@Autowired
	private ContactorService contactorService;

	/**
	 * 保存
	 * @param record
	 * @return
	 */
	@PreAuthorize("hasAuthority('sys:contactor:add') AND hasAuthority('sys:contactor:edit')")
	@PostMapping(value="/save")
	public HttpResult save(@RequestBody Contactor record) {
		return HttpResult.ok(contactorService.save(record));
	}

    /**
     * 删除
     * @param records
     * @return
     */
	@PreAuthorize("hasAuthority('sys:contactor:delete')")
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<Contactor> records) {
		return HttpResult.ok(contactorService.delete(records));
	}

    /**
     * 基础分页查询
     * @param pageRequest
     * @return
     */
	@PreAuthorize("hasAuthority('sys:contactor:view')")
	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(contactorService.findPage(pageRequest));
	}
	
    /**
     * 根据主键查询
     * @param id
     * @return
     */
	@PreAuthorize("hasAuthority('sys:contactor:view')")
	@GetMapping(value="/findById")
	public HttpResult findById(@RequestParam Long id) {
		return HttpResult.ok(contactorService.findById(id));
	}
}
