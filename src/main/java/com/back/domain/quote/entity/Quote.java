package com.back.domain.quote.entity;

public class Quote {

    public int id;
    public String content;
    public String author;

    public Quote(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}