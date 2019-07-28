package com.louis.kitty.admin.sevice;


import com.louis.kitty.admin.model.Contract;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

/**
 * ---------------------------
 *  (ContractService)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:16:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface ContractService extends CurdService<Contract> {

    PageResult findByUserId(PageRequest pageRequest);
}
