package com.software.management.dao.model;

/**
 * 自行车信息实体类
 *
 * @author spy
 */
public class BicycleModel {
    private int biId;
    private String biName;
    private String biPoint;
    private Boolean biState;
    private String biJd;
    private String biWd;

    public int getBiId() {
        return biId;
    }

    public void setBiId(int biId) {
        this.biId = biId;
    }

    public String getBiName() {
        return biName;
    }

    public void setBiName(String biName) {
        this.biName = biName;
    }

    public String getBiPoint() {
        return biPoint;
    }

    public void setBiPoint(String biPoint) {
        this.biPoint = biPoint;
    }

    public Boolean getBiState() {
        return biState;
    }

    public void setBiState(Boolean biState) {
        this.biState = biState;
    }

    public String getBiJd() {
        return biJd;
    }

    public void setBiJd(String biJd) {
        this.biJd = biJd;
    }

    public String getBiWd() {
        return biWd;
    }

    public void setBiWd(String biWd) {
        this.biWd = biWd;
    }
}
