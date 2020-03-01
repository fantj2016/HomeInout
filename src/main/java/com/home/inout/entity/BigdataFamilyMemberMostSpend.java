package com.home.inout.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 家庭里最能花的人以及其消费类型
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@ApiModel(value="BigdataFamilyMemberMostSpend对象", description="家庭里最能花的人以及其消费类型")
public class BigdataFamilyMemberMostSpend implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @ApiModelProperty(value = "家庭名字")
    private String familyName;

    @ApiModelProperty(value = "家庭最能花成员名字")
    private String familyMemberName;

    @ApiModelProperty(value = "消费类型")
    private String inoutType;

    @ApiModelProperty(value = "统计时间")
    private LocalDateTime createTime;


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

    public String getFamilyMemberName() {
        return familyMemberName;
    }

    public void setFamilyMemberName(String familyMemberName) {
        this.familyMemberName = familyMemberName;
    }

    public String getInoutType() {
        return inoutType;
    }

    public void setInoutType(String inoutType) {
        this.inoutType = inoutType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BigdataFamilyMemberMostSpend{" +
        "id=" + id +
        ", familyName=" + familyName +
        ", familyMemberName=" + familyMemberName +
        ", inoutType=" + inoutType +
        ", createTime=" + createTime +
        "}";
    }
}
