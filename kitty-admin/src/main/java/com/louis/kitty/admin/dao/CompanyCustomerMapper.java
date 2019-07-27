package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.CompanyCustomer;
import com.louis.kitty.admin.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * ---------------------------
 *  (CompanyCustomerMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:05:12
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface CompanyCustomerMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(CompanyCustomer record);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改
     * @param record
     * @return
     */
    int update(CompanyCustomer record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    CompanyCustomer findById(Long id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<CompanyCustomer> findPage();

    List<CompanyCustomer> findPageByName(@Param(value="name") String name);
    
}