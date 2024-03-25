package com.basic.backendproject;


import jakarta.persistence.*;

@Table(name = "books")
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id=0;


    @Column(name = "title")
    private String title=null;

    @Column(name = "type")
    private String type=null;

    @Column(name = "description")
    private String description=null;


    @Column(name = "filename")
    private String filename=null;


    @Column(name = "height")
    private int height=0;


    @Column(name = "width")
    private int width=0;


    @Column(name = "price")
    private float price=0;


    @Column(name = "rating")
    private int rating=0;


    @Column(name = "trend")
    private String trend=null;

    public Books() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }


    //adding constructor

    public Books(String title, String type, String description, String filename, int height, int width, int price, int rating, String trend) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.filename = filename;
        this.height = height;
        this.width = width;
        this.price = price;
        this.rating = rating;
        this.trend = trend;
    }


    //update constructor



}
