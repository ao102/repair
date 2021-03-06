package com.sanyau.repair.entity;

import java.math.BigDecimal;
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
@ApiModel(value="AddMaterialInfo对象", description="")
public class AddMaterialInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty(value = "材料ID")
    private String addMaterialId;

    @ApiModelProperty(value = "材料名")
    private String addMaterialName;

    @ApiModelProperty(value = "出库数量")
    private String addAmount;

    @ApiModelProperty(value = "材料单位")
    private String addMaterialMetric;

    @ApiModelProperty(value = "材料类型")
    private String addMaterialType;

    @ApiModelProperty(value = "材料单价")
    private BigDecimal addMaterialUnitPrice;

    @ApiModelProperty(value = "材料品牌")
    private String addMaterialBrand;

    @ApiModelProperty(value = "出库订单ID")
    private Long addMaterialInfoOrderId;


}
