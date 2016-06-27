package com.maitaidan.model;

import java.util.Date;

/**
 * Created by Crytis on 2016/3/30.
 * Just test.
 */
public class Mock {

    private int id;
    private String firstBusinessLine;
    private String secondBusinessLine;
    private String uri;
    private String param;
    private String defaultResult;
    private String desc;
    private Date createTime;
    private Date updateTime;
    private int useParam;
    private int recordLog;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDefaultResult() {
        return defaultResult;
    }

    public void setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getRecordLog() {
        return recordLog;
    }

    public void setRecordLog(int recordLog) {
        this.recordLog = recordLog;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getUseParam() {
        return useParam;
    }

    public void setUseParam(int useParam) {
        this.useParam = useParam;
    }

    public String getSecondBusinessLine() {
        return secondBusinessLine;
    }

    public void setSecondBusinessLine(String secondBusinessLine) {
        this.secondBusinessLine = secondBusinessLine;
    }

    public String getFirstBusinessLine() {
        return firstBusinessLine;
    }

    public void setFirstBusinessLine(String firstBusinessLine) {
        this.firstBusinessLine = firstBusinessLine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean hasParam() {
        return this.useParam == 1;
    }

    public boolean hasLog() {
        return this.recordLog == 1;
    }

    @Override
    public String toString() {
        return "Mock{" +
                "createTime=" + createTime +
                ", id=" + id +
                ", firstBusinessLine='" + firstBusinessLine + '\'' +
                ", secondBusinessLine='" + secondBusinessLine + '\'' +
                ", uri='" + uri + '\'' +
                ", param='" + param + '\'' +
                ", defaultResult='" + defaultResult + '\'' +
                ", desc='" + desc + '\'' +
                ", updateTime=" + updateTime +
                ", useParam=" + useParam +
                ", recordLog=" + recordLog +
                '}';
    }
}
