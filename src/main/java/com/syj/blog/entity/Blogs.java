package com.syj.blog.entity;

import java.util.Date;

/**
 * 博客表
 */
public class Blogs {
    private int blogsId;
    private String blogsName;
    private String blogsContext;
    private int blogsStatus;
    private int blogsClick;
    private Date blogsDate;
    private int blogsClassifyId;
    private int userId;


    public int getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(int blogsId) {
        this.blogsId = blogsId;
    }

    public String getBlogsName() {
        return blogsName;
    }

    public void setBlogsName(String blogsName) {
        this.blogsName = blogsName;
    }

    public String getBlogsContext() {
        return blogsContext;
    }

    public void setBlogsContext(String blogsContext) {
        this.blogsContext = blogsContext;
    }

    public int getBlogsStatus() {
        return blogsStatus;
    }

    public void setBlogsStatus(int blogsStatus) {
        this.blogsStatus = blogsStatus;
    }

    public int getBlogsClick() {
        return blogsClick;
    }

    public void setBlogsClick(int blogsClick) {
        this.blogsClick = blogsClick;
    }

    public Date getBlogsDate() {
        return blogsDate;
    }

    public void setBlogsDate(Date blogsDate) {
        this.blogsDate = blogsDate;
    }

    public int getBlogsClassifyId() {
        return blogsClassifyId;
    }

    public void setBlogsClassifyId(int blogsClassifyId) {
        this.blogsClassifyId = blogsClassifyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "blogs{" +
                "blogsId=" + blogsId +
                ", blogsName='" + blogsName + '\'' +
                ", blogsContext='" + blogsContext + '\'' +
                ", blogsStatus=" + blogsStatus +
                ", blogsClick=" + blogsClick +
                ", blogsDate=" + blogsDate +
                ", blogsClassifyId=" + blogsClassifyId +
                ", userId=" + userId +
                '}';
    }
}
