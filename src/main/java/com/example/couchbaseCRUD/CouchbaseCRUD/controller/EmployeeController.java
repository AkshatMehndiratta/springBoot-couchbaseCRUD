package com.example.couchbaseCRUD.CouchbaseCRUD.controller;

import com.example.couchbaseCRUD.CouchbaseCRUD.model.Employee;
import com.example.couchbaseCRUD.CouchbaseCRUD.repo.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepositary repositary;

    @PostMapping("/Employee")
    public String addEmployee(@RequestBody Employee employee){
        repositary.save(employee);
        return "added";
    }

    @PostMapping("/Employees")
    public String addAllEmployee(@RequestBody Iterable<Employee> employee){
        repositary.saveAll(employee);
        return "added";
    }

    @GetMapping("/EmployeeById/{EmpId}")
    public Employee getById(@PathVariable int EmpId){
        return repositary.findById(EmpId);
    }

    @GetMapping("/EmployeeByIdParam")
    public Employee getByIdParam(@RequestParam int EmpId){
        return repositary.findById(EmpId);
    }

    @GetMapping("/Employee")
    public List<Employee> getAll(){
        return repositary.findAll();
    }

    @GetMapping("/EmployeeByName/{name}")
    public Employee getByName(@PathVariable String name){
        return repositary.findByName(name);
    }

    @GetMapping("/EmployeeByNameParam")
    public Employee getByNameParam(@RequestParam String name){
        return repositary.findByName(name);
    }

    @DeleteMapping("/Employee/{EmpId}")
    public String deleteEmployeeById(@PathVariable int EmpId){
        repositary.deleteById(EmpId);
        return "Deleted";
    }

    @DeleteMapping("/Employees")
    public String deleteAllEmployee(){
        repositary.deleteAll();
        return "Deleted";
    }

    @PutMapping("/Employee/{EmpId}")
    public String updateEmployeeyId(@RequestBody Employee employee){
        repositary.findById(employee.getEmpId());
        repositary.save(employee);
        return "updated";
    }

}
