package com.example.couchbaseCRUD.CouchbaseCRUD.repo;

import com.example.couchbaseCRUD.CouchbaseCRUD.model.Employee;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositary extends CouchbaseRepository<Employee, Integer> {
    
    Employee findByName(String name);
    Employee findById(int id);

}
