package com.example.couchbaseCRUD.CouchbaseCRUD.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.example.couchbaseCRUD.CouchbaseCRUD"})
public class EmployeeConfig extends AbstractCouchbaseConfiguration {

    @Value("${spring.couchbase.bootstrap-hosts}")
    private String bootStrapHosts;

    @Value("${spring.couchbase.bucket.name}")
    private String bucketName;

    @Value("${spring.couchbase.bucket.password}")
    private String bucketPassword;

    @Override
    public String getConnectionString() {
        return bootStrapHosts;
    }

    @Override
    public String getUserName() {
        return "Administrator";
    }

    @Override
    public String getPassword() {
        return bucketPassword;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }
}
