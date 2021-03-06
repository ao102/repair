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
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="AdminRole对象", description="")
public class AdminRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;


}
