package com.software.management.dao.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 租赁点实体类
 *
 * @author spy
 */
@ApiModel(value = "租赁点实体类")
public class LeasePointModel {
    @ApiModelProperty(value = "租赁点唯一标识")
    private Long lpId;
    @ApiModelProperty(value = "租赁点名称")
    private String lpName;
    @ApiModelProperty(value = "租赁点经度")
    private String lpJd;
    @ApiModelProperty(value = "租赁点纬度")
    private String lpWd;
    @ApiModelProperty(value = "租赁点自行车数量")
    private Long lpBinumber;
    @ApiModelProperty(value = "租赁点管理员数量")
    private Long lpLeaser;

    public Long getLpId() {
        return lpId;
    }

    public void setLpId(Long lpId) {
        this.lpId = lpId;
    }

    public String getLpName() {
        return lpName;
    }

    public void setLpName(String lpName) {
        this.lpName = lpName;
    }

    public String getLpJd() {
        return lpJd;
    }

    public void setLpJd(String lpJd) {
        this.lpJd = lpJd;
    }

    public String getLpWd() {
        return lpWd;
    }

    public void setLpWd(String lpWd) {
        this.lpWd = lpWd;
    }

    public Long getLpBinumber() {
        return lpBinumber;
    }

    public void setLpBinumber(Long lpBinumber) {
        this.lpBinumber = lpBinumber;
    }

    public Long getLpLeaser() {
        return lpLeaser;
    }

    public void setLpLeaser(Long lpLeaser) {
        this.lpLeaser = lpLeaser;
    }
}