package com.maitaidan.model;

/**
 * Created by Crytis on 2016/4/5.
 * Just test.
 * 带有参数、结果的mock
 */
public class MockParam {
    private int id;
    private int mockId;
    private String expectParam;
    private String result;

    @Override
    public String toString() {
        return "MockParam{" +
                "expectParam='" + expectParam + '\'' +
                ", id=" + id +
                ", mockId=" + mockId +
                ", result='" + result + '\'' +
                '}';
    }

    public String getExpectParam() {
        return expectParam;
    }

    public void setExpectParam(String expectParam) {
        this.expectParam = expectParam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMockId() {
        return mockId;
    }

    public void setMockId(int mockId) {
        this.mockId = mockId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
