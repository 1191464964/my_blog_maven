package com.dragon.project.tool.toolCategory.service;

import com.dragon.project.tool.toolCategory.domain.ToolCategory;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2019/6/17 16:27
 * @description： 工具的分类(ToolCategory)$desc Service层
 * @modified By：
 * @version: 1.0.0
 */
public interface ToolCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param toolCategoryId 主键
     * @return 实例对象
     */
    ToolCategory selectToolCategoryById(Integer toolCategoryId);

    /**
     * 查询多条数据
     *
     * @param toolCategory 带有查询条件的toolCategory
     * @return 对象列表
     */
    List<ToolCategory> selectToolCategoryList(ToolCategory toolCategory);

    /**
     * 新增数据
     *
     * @param toolCategory 实例对象
     * @return 受影响的行数
     */
    int insertToolCategory(ToolCategory toolCategory);

    /**
     * 修改数据
     *
     * @param toolCategory 实例对象
     * @return 受影响的行数
     */
    int updateToolCategory(ToolCategory toolCategory);

    /**
     * 通过主键删除数据
     *
     * @param toolCategoryId 主键
     * @return 受影响的行数
     */
    int deleteToolCategoryByIds(Integer[] toolCategoryId);

}