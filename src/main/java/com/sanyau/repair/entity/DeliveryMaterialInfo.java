package com.sanyau.repair.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="DeliveryMaterialInfo对象", description="")
public class DeliveryMaterialInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "材料ID")
    private String materialId;

    @ApiModelProperty(value = "材料名")
    private String materialName;

    @ApiModelProperty(value = "出库数量")
    private String deliveryAmount;

    @ApiModelProperty(value = "材料单位")
    private String materialMetric;

    @ApiModelProperty(value = "材料类型")
    private String materialType;

    @ApiModelProperty(value = "材料单价")
    private BigDecimal materialUnitPrice;

    @ApiModelProperty(value = "材料品牌")
    private String materialBrand;

    @ApiModelProperty(value = "出库订单ID")
    private Long deliveryOrderId;

    @ApiModelProperty(value = "出库订单状态")
    private Integer deliveryOrderState;


}
