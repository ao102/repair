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
@ApiModel(value="MaterialGroup对象", description="")
public class MaterialGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String materialGroupName;

    private String materialType;


}
