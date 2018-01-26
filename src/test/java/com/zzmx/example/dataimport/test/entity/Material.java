package com.zzmx.example.dataimport.test.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2018/1/26 20:24
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2018/1/26 20:24
 * @Version 1.0
 */
public class Material {

    private Integer materialId;

    private String materialCatalogCode;

    private String material;

    private String materialName;

    private String materialSpec;

    private String materialPicNum;

    private String materialDesc;

    private String unitCode;

    private Integer swFreeitem1;
    private Integer swFreeitem2;
    private Integer swFreeitem3;
    private Integer swFreeitem4;

    private Integer materialStatus;
    private Integer priceScopeFlag;
    private BigDecimal priceL;
    private BigDecimal priceH;
    private Date priceValidDate;

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getMaterialCatalogCode() {
        return materialCatalogCode;
    }

    public void setMaterialCatalogCode(String materialCatalogCode) {
        this.materialCatalogCode = materialCatalogCode;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialSpec() {
        return materialSpec;
    }

    public void setMaterialSpec(String materialSpec) {
        this.materialSpec = materialSpec;
    }

    public String getMaterialPicNum() {
        return materialPicNum;
    }

    public void setMaterialPicNum(String materialPicNum) {
        this.materialPicNum = materialPicNum;
    }

    public String getMaterialDesc() {
        return materialDesc;
    }

    public void setMaterialDesc(String materialDesc) {
        this.materialDesc = materialDesc;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Integer getSwFreeitem1() {
        return swFreeitem1;
    }

    public void setSwFreeitem1(Integer swFreeitem1) {
        this.swFreeitem1 = swFreeitem1;
    }

    public Integer getSwFreeitem2() {
        return swFreeitem2;
    }

    public void setSwFreeitem2(Integer swFreeitem2) {
        this.swFreeitem2 = swFreeitem2;
    }

    public Integer getSwFreeitem3() {
        return swFreeitem3;
    }

    public void setSwFreeitem3(Integer swFreeitem3) {
        this.swFreeitem3 = swFreeitem3;
    }

    public Integer getSwFreeitem4() {
        return swFreeitem4;
    }

    public void setSwFreeitem4(Integer swFreeitem4) {
        this.swFreeitem4 = swFreeitem4;
    }

    public Integer getMaterialStatus() {
        return materialStatus;
    }

    public void setMaterialStatus(Integer materialStatus) {
        this.materialStatus = materialStatus;
    }

    public Integer getPriceScopeFlag() {
        return priceScopeFlag;
    }

    public void setPriceScopeFlag(Integer priceScopeFlag) {
        this.priceScopeFlag = priceScopeFlag;
    }

    public BigDecimal getPriceL() {
        return priceL;
    }

    public void setPriceL(BigDecimal priceL) {
        this.priceL = priceL;
    }

    public BigDecimal getPriceH() {
        return priceH;
    }

    public void setPriceH(BigDecimal priceH) {
        this.priceH = priceH;
    }

    public Date getPriceValidDate() {
        return priceValidDate;
    }

    public void setPriceValidDate(Date priceValidDate) {
        this.priceValidDate = priceValidDate;
    }
}
