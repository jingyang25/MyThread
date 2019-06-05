package com.gupao.ticket;

public class Person {

    private String userNo;

    private String username;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userNo='" + userNo + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
