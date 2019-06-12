package com.killerwilmer.app.mongodbmorphia.repository.impl;

import com.killerwilmer.app.mongodbmorphia.entity.Author;
import com.killerwilmer.app.mongodbmorphia.repository.AuthorRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepositoryImpl extends BaseRepository<Author, ObjectId> implements AuthorRepository {

    public AuthorRepositoryImpl() {
        super(Author.class);
    }

}
