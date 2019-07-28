package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.Clue;

import java.util.List;


/**
 * ---------------------------
 *  (ClueMapper)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 09:53:10
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface ClueMapper {

	/**
	 * 添加
	 * @param record
	 * @return
	 */
    int add(Clue record);

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
    int update(Clue record);
    
    /**
     * 根据主键查询
     * @param id
     * @return
     */    
    Clue findById(Long id);

    /**
     * 基础分页查询
     * @param
     * @return
     */    
    List<Clue> findPage();
    
}