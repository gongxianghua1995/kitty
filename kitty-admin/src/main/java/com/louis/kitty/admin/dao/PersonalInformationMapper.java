package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.PersonalInformation;

import java.util.List;


/**
 * ---------------------------
 * 个人客户信息表 (PersonalInformationMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 10:51:44
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface PersonalInformationMapper {

	/**
	 * 添加个人客户信息表
	 * @param record
	 * @return
	 */
    int add(PersonalInformation record);

    /**
     * 删除个人客户信息表
     * @param id
     * @return
     */
    int delete(Long id);
    
    /**
     * 修改个人客户信息表
     * @param record
     * @return
     */
    int update(PersonalInformation record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    PersonalInformation findById(Long id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<PersonalInformation> findPage();
    
}