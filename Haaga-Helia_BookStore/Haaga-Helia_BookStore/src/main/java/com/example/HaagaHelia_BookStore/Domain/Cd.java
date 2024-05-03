package com.example.HaagaHelia_BookStore.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Cd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Artist is required")
    private String artist;
    @NotBlank(message = "Songname is required")
    private String songName;
    @NotBlank(message = "album is required")
    private String album;
    private int release_year;
    private String tag;
    private double price;
    @ManyToOne
    @JoinColumn(name = "categoryId")

    private Category category;

    public Cd() {
        super();
        this.artist = null;
        this.album = null;
        this.tag = null;

    }

    public Cd(String artist, String songName, String album, String tag, int release_year, double price,
            Category category) {
        super();
        this.artist = artist;
        this.songName = songName;
        this.album = album;
        this.tag = tag;
        this.release_year = release_year;
        this.price = price;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        if (this.category != null)
            return "CD [id=" + id + ", artist=" + artist + ", Song Name=" + songName + "album=" + album + ", tag="
                    + tag + ", release_year="
                    + release_year + ", price=" + price + ", category=" + this.getCategory() + "]";
        else
            return "CD [id=" + id + ", artist=" + artist + ", Song Name=" + songName + ", album=" + album + ", tag="
                    + tag + ", release_year="
                    + release_year + ", price=" + price + "]";
    }

}
