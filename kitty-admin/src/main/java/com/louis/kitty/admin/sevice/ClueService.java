package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.Clue;
import com.louis.kitty.core.page.PageRequest;
import com.louis.kitty.core.page.PageResult;
import com.louis.kitty.core.service.CurdService;

/**
 * ---------------------------
 *  (ClueService)         
 * ---------------------------
 * 作者：  kitty-generator
 * 时间：  2019-07-28 09:53:10
 * 说明：  我是由代码生成器生生成的
 * ---------------------------
 */
public interface ClueService extends CurdService<Clue> {
    PageResult findByUserId(PageRequest pageRequest);
}
