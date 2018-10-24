package com.test;

/**
 * Actor 角色类：复合产品
 */
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;

    public String getType() {
        return type;
    }

    public String getSex() {
        return sex;
    }

    public String getFace() {
        return face;
    }

    public String getCostume() {
        return costume;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
