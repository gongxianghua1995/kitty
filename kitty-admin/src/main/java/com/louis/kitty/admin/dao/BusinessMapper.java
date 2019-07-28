package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Business;

import java.util.List;


/**
 * ---------------------------
 * 商机 (BusinessMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 09:53:10
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface BusinessMapper {

	/**
	 * 添加商机
	 * @param record
	 * @return
	 */
    int add(Business record);

    /**
     * 删除商机
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改商机
     * @param record
     * @return
     */
    int update(Business record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Business findById(Long id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<Business> findPage();
    
}