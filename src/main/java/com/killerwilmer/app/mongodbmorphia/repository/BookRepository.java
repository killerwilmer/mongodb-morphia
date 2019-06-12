package com.killerwilmer.app.mongodbmorphia.repository;

import com.killerwilmer.app.mongodbmorphia.entity.Book;
import org.bson.types.ObjectId;

public interface BookRepository extends CrudRepository<Book, ObjectId> {
}
