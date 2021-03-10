package com.sanyau.repair.entity;

import java.math.BigDecimal;

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
@ApiModel(value="MaterialInfo对象", description="")
public class MaterialInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String materialId;

    private String materialName;

    private Long materialTotal;

    private String materialMetric;

    private BigDecimal materialPrice;

    private String materialBrand;

    private String materialType;

    private String remarks;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private String addPeople;

    @ApiModelProperty(value = "材料出库数量")
    private Long materialDeliveryAmount;

    @ApiModelProperty(value = "材料返库数量")
    private Long materialReturnAmount;


}
