package org.itstep.one_to_one_unit;

import org.itstep.one_to_one_unit.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
} 