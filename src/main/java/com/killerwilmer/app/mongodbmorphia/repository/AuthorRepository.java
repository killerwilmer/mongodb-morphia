package com.killerwilmer.app.mongodbmorphia.repository;

import com.killerwilmer.app.mongodbmorphia.entity.Author;
import org.bson.types.ObjectId;

public interface AuthorRepository extends CrudRepository<Author, ObjectId>{}
