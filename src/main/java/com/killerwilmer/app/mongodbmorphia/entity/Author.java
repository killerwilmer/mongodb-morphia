package com.killerwilmer.app.mongodbmorphia.entity;

import dev.morphia.annotations.*;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;

import java.util.Set;

@Entity("authors")
@Indexes({
        @Index(fields = { @Field("name") })
}
)
@Getter
@Setter
public class Author {
    @Id
    private ObjectId id;
    private String name;
    @Reference
    private Set<Book> books;

    public Author() {}

    // No args Constructor
    public Author(String name) {
        this.name = name;
    }

    // Getters and Setters omitted for brevity
}
