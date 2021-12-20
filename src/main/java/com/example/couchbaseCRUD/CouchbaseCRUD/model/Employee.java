package com.example.couchbaseCRUD.CouchbaseCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private int EmpId;

    @Field
    private String name;

}
