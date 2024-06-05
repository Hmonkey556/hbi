package com.yupi.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 图表信息表
 * @TableName chart
 */
@TableName(value ="chart")
@Data
public class Chart implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    @TableField(value = "ID")
    private Long id;

    /**
     * 分析目标
     */
    @TableField(value = "GOAL")
    private String goal;

    /**
     * 图表数据
     */
    @TableField(value = "CHART_DATA")
    private String chartData;

    /**
     * 图表类型
     */
    @TableField(value = "CHART_TYPE")
    private String chartType;

    /**
     * 生成的图表数据
     */
    @TableField(value = "GEN_CHART")
    private String genChart;

    /**
     * 生成的分析结论
     */
    @TableField(value = "GEN_RESULT")
    private String genResult;

    /**
     * 创建用户 id
     */
    @TableField(value = "USER_ID")
    private Long userId;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableField(value = "IS_DELETE")
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}