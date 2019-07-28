package com.louis.kitty.admin.model;

import java.util.Date;

/**
 * Created by gongxianghua on 2019/7/28.
 */
public class Clue {

    /**  */
    private Long id;
    /**  */
    private String clueSource;
    /**  */
    private String clueNote;
    /**  */
    private Integer customLevel;
    /**  */
    private String clueName;
    /**  */
    private java.util.Date gmtCreate;
    /**  */
    private String clueAddress;
    /**  */
    private String clueHead;
    /**  */
    private Integer uId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClueSource() {
        return clueSource;
    }

    public void setClueSource(String clueSource) {
        this.clueSource = clueSource;
    }

    public String getClueNote() {
        return clueNote;
    }

    public void setClueNote(String clueNote) {
        this.clueNote = clueNote;
    }

    public Integer getCustomLevel() {
        return customLevel;
    }

    public void setCustomLevel(Integer customLevel) {
        this.customLevel = customLevel;
    }

    public String getClueName() {
        return clueName;
    }

    public void setClueName(String clueName) {
        this.clueName = clueName;
    }

    public java.util.Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(java.util.Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getClueAddress() {
        return clueAddress;
    }

    public void setClueAddress(String clueAddress) {
        this.clueAddress = clueAddress;
    }

    public String getClueHead() {
        return clueHead;
    }

    public void setClueHead(String clueHead) {
        this.clueHead = clueHead;
    }

    public Integer getUId() {
        return uId;
    }

    public void setUId(Integer uId) {
        this.uId = uId;
    }
}
