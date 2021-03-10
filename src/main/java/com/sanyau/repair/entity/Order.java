package com.sanyau.repair.entity;

import java.math.BigDecimal;

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
@ApiModel(value="Order对象", description="")
@TableName("`order`")       // 因为与数据库关键字冲突，所以注解设定表名
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单序号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单id")
    private String orderId;

    @ApiModelProperty(value = "订单创建时间")
    private Date orderCreateTime;

    @ApiModelProperty(value = "订单完成时间")
    private Date orderFinishTime;

    @ApiModelProperty(value = "订单费用")
    private BigDecimal orderPrice;

    @ApiModelProperty(value = "订单状态")
    private String orderState;

    @ApiModelProperty(value = "订单支付时间")
    private Date orderPayTime;

    @ApiModelProperty(value = "订单内容描述")
    private String userDesc;

    @ApiModelProperty(value = "订单维修人")
    private String masterAccount;

    @ApiModelProperty(value = "订单报修人")
    private String userName;

    @ApiModelProperty(value = "订单报修类型")
    private String repairType;

    @ApiModelProperty(value = "订单报修图片信息")
    private String pictureUser;

    @ApiModelProperty(value = "订单完成图片信息")
    private String pictureMaster;

    @ApiModelProperty(value = "评分")
    private Integer grade;

    @ApiModelProperty(value = "师傅电话")
    private String masterPhone;

    @ApiModelProperty(value = "支付金额")
    private BigDecimal orderMoney;

    @ApiModelProperty(value = "学生电话")
    private String userPhone;

    @ApiModelProperty(value = "报修社区信息")
    private String userCommunity;

    @ApiModelProperty(value = "学生id")
    private String userId;

    @ApiModelProperty(value = "报修房间号")
    private String userApartment;

    @ApiModelProperty(value = "确认订单是否收费")
    private String orderType;

    @ApiModelProperty(value = "支付状态")
    private String payState;


}
