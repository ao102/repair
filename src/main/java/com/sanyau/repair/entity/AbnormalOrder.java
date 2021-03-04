package com.sanyau.repair.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
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
