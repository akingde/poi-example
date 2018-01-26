package com.zzmx.example.dataimport.test.dto;

/**
 * ${DESCRIPTION}
 *
 * @CreateUser Kevin.Zhou
 * @CreateTime 2018/1/26 20:35
 * @ModifyUser Kevin.Zhou
 * @ModifiedTime 2018/1/26 20:35
 * @Version 1.0
 */
public class MaterialDTO {
    private String material;
    private String materialName;
    private String materialPicNum;
    private String materialDesc;
    private String materialSpec;
    private String unitCode;


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

    public String getMaterialSpec() {
        return materialSpec;
    }

    public void setMaterialSpec(String materialSpec) {
        this.materialSpec = materialSpec;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    @Override
    public String toString() {
        return "MaterialDTO{" +
                "material='" + material + '\'' +
                ", materialName='" + materialName + '\'' +
                ", materialPicNum='" + materialPicNum + '\'' +
                ", materialDesc='" + materialDesc + '\'' +
                ", materialSpec='" + materialSpec + '\'' +
                ", unitCode='" + unitCode + '\'' +
                '}';
    }
}
