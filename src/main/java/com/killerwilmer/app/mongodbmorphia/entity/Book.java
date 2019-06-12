package com.killerwilmer.app.mongodbmorphia.entity;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.time.LocalDate;

@Entity("books")
@Getter
@Setter
public class Book {
    @Id
    private ObjectId id;
    private String title;
    @Property("published")
    private LocalDate publicationDate;

    // No args Constructor
    public Book() {}

    public Book(String title, LocalDate publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    // Getters and Setters omitted for brevity
}
