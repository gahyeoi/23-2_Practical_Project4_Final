package com.crud.bean;

import java.util.Date;

public class BoardVO {
    private int seq;
    private String title;
    private String content;
    private String mood;
    private String weather;
    private Date regdate;

    public int getSeq() {
        return seq;
    }
    public void setSeq(int seq) {
        this.seq = seq;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getMood(){
        return mood;
    }
    public void setMood(String mood){
        this.mood = mood;
    }
    public String getWeather(){
        return weather;
    }
    public void setWeather(String weather){
        this.weather = weather;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

}