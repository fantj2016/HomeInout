package com.home.inout.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 每个家庭消费类型排名
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@ApiModel(value="BigdataFamilyInoutTypeRank对象", description="每个家庭消费类型排名")
public class BigdataFamilyInoutTypeRank implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "家庭名称")
    private String familyName;

    @ApiModelProperty(value = "消费类型")
    private String typeName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "BigdataFamilyInoutTypeRank{" +
        "id=" + id +
        ", familyName=" + familyName +
        ", typeName=" + typeName +
        "}";
    }
}
