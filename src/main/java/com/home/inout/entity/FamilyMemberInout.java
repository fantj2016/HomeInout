package com.home.inout.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 家庭成员收支信息
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@ApiModel(value="FamilyMemberInout对象", description="家庭成员收支信息")
public class FamilyMemberInout implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "家庭id")
    private Integer familyMemberId;

    @ApiModelProperty(value = "收支类型")
    private Integer inoutTypeId;

    @ApiModelProperty(value = "涉及金额")
    private BigDecimal amout;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(Integer familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public Integer getInoutTypeId() {
        return inoutTypeId;
    }

    public void setInoutTypeId(Integer inoutTypeId) {
        this.inoutTypeId = inoutTypeId;
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public void setAmout(BigDecimal amout) {
        this.amout = amout;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "FamilyMemberInout{" +
        "id=" + id +
        ", familyMemberId=" + familyMemberId +
        ", inoutTypeId=" + inoutTypeId +
        ", amout=" + amout +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
