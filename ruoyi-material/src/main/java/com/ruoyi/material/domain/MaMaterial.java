package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物资记录对象 ma_material
 *
 * @author ruoyi
 * @date 2023-01-24
 */
public class MaMaterial extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long mid;

    /**
     * 物资标题
     */
    @Excel(name = "物资标题")
    private String mtitle;

    /**
     * 物资详细信息
     */
    @Excel(name = "物资详细信息")
    private String mdetail;


    /**
     * 图片id
     */
    @Excel(name = "图片id")
    private Long mimagid;

    /**
     * 地址
     */
    @Excel(name = "地址")
    private String maddress;

    /**
     * 物资状态（0待审核 1审核通过 2已使用）
     */
    @Excel(name = "物资状态", readConverterExp = "0=待审核,1=审核通过,2=已使用")
    private String mstatus;

    /**
     * 图片名称
     */
    @Excel(name = "图片名称")
    private String imgname;
    /**
     * 图片路径
     */
    @Excel(name = "图片路径")
    private String imgpath;

    /**
     * 物资类型
     */
    @Excel(name = "物资类型")
    private Long mtype;

    /**
     * 物资数量
     */
    @Excel(name = "物资数量")
    private String mnum;

    /**
     * 删除标志（0正常 1删除）
     */
    private String delFlag;

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getMid() {
        return mid;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMdetail(String mdetail) {
        this.mdetail = mdetail;
    }

    public String getMdetail() {
        return mdetail;
    }


    public Long getMimagid() {
        return mimagid;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    public String getMaddress() {
        return maddress;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setMimagid(Long mimagid) {
        this.mimagid = mimagid;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public Long getMtype() {
        return mtype;
    }

    public void setMtype(Long mtype) {
        this.mtype = mtype;
    }

    public String getMnum() {
        return mnum;
    }

    public void setMnum(String mnum) {
        this.mnum = mnum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("mid", getMid()).append("mtitle", getMtitle()).append("mdetail", getMdetail())

                .append("mimagid", getMimagid()).append("maddress", getMaddress()).append("mstatus", getMstatus()).append("delFlag", getDelFlag()).append("createBy", getCreateBy()).append("createTime", getCreateTime()).append("updateBy", getUpdateBy()).append("updateTime", getUpdateTime()).append("remark", getRemark()).append("imgname", getImgname()).append("imgpath", getImgpath()).append("matype",getMtype()).append("mnum",getMnum()).toString();
    }
}
