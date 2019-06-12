package com.killerwilmer.app.mongodbmorphia.repository.impl;

import com.killerwilmer.app.mongodbmorphia.entity.Book;
import com.killerwilmer.app.mongodbmorphia.repository.BookRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl extends BaseRepository<Book, ObjectId> implements BookRepository {

    public BookRepositoryImpl() {
        super(Book.class);
    }

}
