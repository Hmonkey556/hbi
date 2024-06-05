package com.yupi.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@TableName(value = "user")
@Data
public class User implements Serializable {

    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    @TableField(value = "ID")
    private Long id;

    /**
     * 用户账号
     */
    @TableField(value = "USER_ACCOUNT")
    private String userAccount;

    /**
     * 用户密码
     */
    @TableField(value = "USER_PASSWORD")
    private String userPassword;

//    /**
//     * 开放平台id
//     */
//    @TableField(value = "UNION_ID")
//    private String unionId;
//
//    /**
//     * 公众号openId
//     */
//    @TableField(value = "WECHAT_OPEN_ID")
//    private String mpOpenId;

    /**
     * 用户昵称
     */
    @TableField(value = "USER_NAME")
    private String userName;

    /**
     * 用户头像
     */
    @TableField(value = "USER_AVATAR")
    private String userAvatar;

//    /**
//     * 用户简介
//     */
//    @TableField(value = "USER_PROFILE")
//    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    @TableField(value = "USER_ROLE")
    private String userRole;

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