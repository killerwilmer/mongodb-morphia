package com.killerwilmer.app.mongodbmorphia.repository;

import com.mongodb.WriteResult;
import dev.morphia.Key;
import dev.morphia.query.Query;
import dev.morphia.query.UpdateOperations;
import dev.morphia.query.UpdateResults;

import java.io.Serializable;

public interface CrudRepository<T, ID extends Serializable> {

    Key<T> create(T entity);

    T read(ID id);

    UpdateResults update(T entity, UpdateOperations<T> operations);

    UpdateResults update(Query<T> query, UpdateOperations<T> operations);

    WriteResult delete(T entity);

    UpdateOperations<T> createOperations();

    Query<T> createQuery();

}
