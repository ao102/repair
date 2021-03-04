package com.sanyau.repair.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author WildSky
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="StudentInfo对象", description="")
public class StudentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String studentName;

    @ApiModelProperty(value = "学号")
    private String studentId;

    @ApiModelProperty(value = "手机号")
    private String studentPhone;

    @ApiModelProperty(value = "宿舍号")
    private String studentDormitoryId;

    @ApiModelProperty(value = "openid")
    private String openid;

    @ApiModelProperty(value = "用户班级")
    private String studentClass;

    @ApiModelProperty(value = "用户所在学院")
    private String studentCollege;

    @ApiModelProperty(value = "楼号")
    private String studentApartment;

    @ApiModelProperty(value = "注册时间(前端不需要提交，以由mybatis-plus托管)")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


}
