package com.example.pc.myapplicationtp;

/**
 * Created by PC on 13/03/2016.
 */



import java.io.Serializable;
import java.util.List;


public class Book implements Serializable{
    private String title;
    private String authors;
    private String editor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getIconcover() {
        return iconcover;
    }

    public void setIconcover(int iconcover) {
        this.iconcover = iconcover;
    }

    private String year;
    private String summary;
    private int cover;
    private int iconcover;

    public Book(String title, String authors, String editor, String year, String summary, int cover, int iconcover) {
        this.title = title;
        this.authors = authors;
        this.editor = editor;
        this.year = year;
        this.summary = summary;
        this.cover = cover;
        this.iconcover = iconcover;
    }
}
