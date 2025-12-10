package org.example.dto;


public class Member extends Dto {
    private int memid;
    private String loginId;
    private String password;
    private String name;
    private String regDate;
    private String updateDate;

    public Member(int memid, String regDate, String updateDate, String loginId, String password, String name) {
        this.memid = memid;
        this.loginId = loginId;
        this.password = password;
        this.regDate = regDate;
        this.updateDate = updateDate;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemid() {
        return memid;
    }

    public void setMemid(int memid) {
        this.memid = memid;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUpdateDate() {

        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
