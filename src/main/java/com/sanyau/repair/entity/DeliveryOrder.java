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
 * @since 2021-03-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="DeliveryOrder对象", description="")
public class DeliveryOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "出库订单号")
    private String deliveryOrderId;

    @ApiModelProperty(value = "出库总数量")
    private Long deliveryTotal;

    @ApiModelProperty(value = "师傅账号")
    private String masterAccount;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "出库订单状态")
    private Integer deliveryOrderState;


}
