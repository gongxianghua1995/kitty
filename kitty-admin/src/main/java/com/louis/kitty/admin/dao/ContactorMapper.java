package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.CompanyCustomer;
import com.louis.kitty.admin.model.Contactor;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * ---------------------------
 *  (ContactorMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-26 20:16:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface ContactorMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(Contactor record);

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
    int update(Contactor record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Contactor findById(Long id);

    /**
     * 基础分页查询
     * @param record
     * @return
     */    
    List<Contactor> findPage();

    List<Contactor> findPageByName(@Param(value="name") String name);
    
}