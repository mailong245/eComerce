package com.mailong245.tcdt.ecomerce.database.DAO;


import com.mailong245.tcdt.ecomerce.database.BO.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findByName(String name);
    Student findByGrade(String grade);
}