package com.service.music;

import javax.persistence.*;

@Entity
@Table(schema = "musicservice", name = "track")
public class Track {
    private String id;
    private String name;
    private Author author;
    private Integer year;

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = {CascadeType.ALL})
    @JoinColumn(name = "authorId")
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
