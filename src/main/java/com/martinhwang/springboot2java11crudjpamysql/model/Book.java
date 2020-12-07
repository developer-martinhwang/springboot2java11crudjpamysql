package com.martinhwang.springboot2java11crudjpamysql.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Books")
@EntityListeners(AuditingEntityListener.class)
public class Book {
    private int id;
    private String title;
    private String author;
    private String bookImageUrl;
    private String synopsis;
    private Date createdAt;
    private Date updatedAt;
    private int chapter;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title", nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="author", nullable = false)
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name="bookImage_url", nullable = false)
    public String getBookImageUrl() {
        return bookImageUrl;
    }
    public void setBookImageUrl(String bookImageUrl) {
        this.bookImageUrl = bookImageUrl;
    }

    @Column(name="synopsis", nullable = false)
    public String getSynopsis() { return synopsis; }
    public void setSynopsis(String synopsis) { this.synopsis = synopsis; }

    @Column(name="created_at", nullable = false)
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name="updated_at", nullable = false)
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name="chapter", nullable = false)
    public int getChapter() {
        return chapter;
    }
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }
}
