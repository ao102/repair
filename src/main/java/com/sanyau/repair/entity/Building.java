package com.sanyau.repair.entity;

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
@ApiModel(value="Building对象", description="")
public class Building implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @ApiModelProperty(value = "楼名(北区公寓1）")
    private String buildingName;

    @ApiModelProperty(value = "属于那个区域")
    private String regionType;


}
