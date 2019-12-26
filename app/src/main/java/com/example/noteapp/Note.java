package com.example.noteapp;

public class Note {
    String id;
    int mark;
    String date;
    String title;
    String txt;

    public Note(String id, int mark, String date, String title, String txt) {
        this.id = id;
        this.mark = mark;
        this.date = date;
        this.title = title;
        this.txt = txt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
