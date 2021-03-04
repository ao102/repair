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
@ApiModel(value="Repository对象", description="")
public class Repository implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String repoId;

    private String materialId;

    private String materialName;

    private BigDecimal materialPrice;

    @ApiModelProperty(value = "实时材料数量")
    private Long materialAmount;

    private String materialBrand;

    private String materialMetric;

    private String masterAccount;

    private String materialType;

    @ApiModelProperty(value = "总数")
    private Long repoMaterialTotal;

    @ApiModelProperty(value = "返库数量")
    private Long returnMaterialAmout;


}
