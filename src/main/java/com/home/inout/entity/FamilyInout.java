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
 * 家庭收支信息
 * </p>
 *
 * @author Fant.J
 * @since 2020-02-29
 */
@ApiModel(value="FamilyInout对象", description="家庭收支信息")
public class FamilyInout implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "家庭id")
    private Integer familyId;

    @ApiModelProperty(value = "家庭收入")
    private BigDecimal income;

    @ApiModelProperty(value = "家庭支出")
    private BigDecimal outcome;

    @ApiModelProperty(value = "合计")
    private BigDecimal total;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getOutcome() {
        return outcome;
    }

    public void setOutcome(BigDecimal outcome) {
        this.outcome = outcome;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "FamilyInout{" +
        "id=" + id +
        ", familyId=" + familyId +
        ", income=" + income +
        ", outcome=" + outcome +
        ", total=" + total +
        ", updateTime=" + updateTime +
        "}";
    }
}
