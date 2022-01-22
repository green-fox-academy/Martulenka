package com.greenfoxacademy.libraryexample.models;

public class Book {
    private static int nextId = 0;

    private int id;
    private String title;
    private String author;
    private Integer releaseYear;

    public Book(String title, String author, Integer releaseYear) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    // create here all the getters and setters for the fields
    public int getId(){
        return id;
    }

    public int getNextId(){
        return nextId;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Integer getReleaseYear(){
        return releaseYear;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNextId(int nextId){
        this.nextId = nextId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setReleaseYear(Integer releaseYear){
        this.releaseYear = releaseYear;
    }

}