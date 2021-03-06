package com.dragon.project.tool.tool.mapper;

import com.dragon.project.tool.tool.domain.Tool;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2019/6/17 16:27
 * @description： 常用工具(Tool)$desc Dao层
 * @modified By：
 * @version: 1.0.0
 */
public interface BgToolMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param toolId 主键
     * @return 实例对象
     */
    Tool selectToolById(Integer toolId);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tool 实例对象
     * @return 对象列表
     */
    List<Tool> selectToolList(Tool tool);

    /**
     * 新增数据
     *
     * @param tool 实例对象
     * @return 影响行数
     */
    int insertTool(Tool tool);

    /**
     * 修改数据
     *
     * @param tool 实例对象
     * @return 影响行数
     */
    int updateTool(Tool tool);

    /**
     * 通过主键删除数据
     *
     * @param toolId 主键
     * @return 影响行数
     */
    int deleteToolByIds(Integer[] toolId);

}