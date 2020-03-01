package com.home.inout.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 收支类型
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@ApiModel(value="InoutType对象", description="收支类型")
@Data
public class InoutType implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "收支描述")
    private String description;

    @ApiModelProperty(value = "收支类型标识")
    private String type;

}
