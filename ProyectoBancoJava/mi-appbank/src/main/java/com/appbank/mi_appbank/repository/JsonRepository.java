package com.appbank.mi_appbank.repository;

import java.util.List;
import java.util.Optional;

public interface JsonRepository<T> {
 List<T> findAll();//read
 Optional<T> findById(String id);//read
 void save(T entity);//create
 void update(T entity);//update
 void delete(String id);//delete
}
