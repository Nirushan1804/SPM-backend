package com.Westine.HotelWestine.repository;

import com.Westine.HotelWestine.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
