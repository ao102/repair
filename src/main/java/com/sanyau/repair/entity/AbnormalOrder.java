package com.sanyau.repair.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
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
@ApiModel(value="AbnormalOrder对象", description="")
public class AbnormalOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String orderId;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Date returnTime;

    private String returnName;

    private String requestName;

    private String reason;

    private String image;

    private String abnType;

    private String pictureStu;

    private String state;

    private String returnPhone;

    private String requestPhone;

    private String requestAddress;

    private String studentId;

    private String stuDesc;


}
