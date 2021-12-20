package com.example.couchbaseCRUD.CouchbaseCRUD.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.example.couchbaseCRUD.CouchbaseCRUD"})
public class EmployeeConfig extends AbstractCouchbaseConfiguration {

    @Override
    public String getConnectionString() {
        return "localhost";
    }

    @Override
    public String getUserName() {
        return "Administrator";
    }

    @Override
    public String getPassword() {
        return "pulsesg";
    }

    @Override
    public String getBucketName() {
        return "Employee";
    }
}
