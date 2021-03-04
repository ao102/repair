package com.sanyau.repair.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("repair_details")
@ApiModel(value="Details对象", description="")
public class Details implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String repairDetails;

    private String reapirType;


}
