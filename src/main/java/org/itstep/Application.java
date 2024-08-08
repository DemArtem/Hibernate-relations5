package org.itstep;

import org.itstep.one_to_one_unit.AddressRepository;
import org.itstep.one_to_one_unit.EmployeeRepository;
import org.itstep.one_to_one_unit.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;

    public static void main(String[] args) {
        
SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //one-to-one unidirectional
        employeeService.getEmployees().forEach(System.out::println);

        employeeService.deleteEmployeeById(1L);

        employeeService.getAddresses().forEach(System.out::println);

        addressRepository.findByCityAndStreet("Minsk","Pobediteley st").forEach(System.out::println);

    }
} 