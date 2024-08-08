package org.itstep;

import org.itstep.many_to_many_uni.AuthorRepository;
import org.itstep.many_to_many_uni.BookRepository;
import org.itstep.one_to_many_uni.PhoneRepository;
import org.itstep.one_to_many_uni.SubscriberRepository;
import org.itstep.one_to_one_bi.PersonRepository;
import org.itstep.one_to_one_uni.AddressRepository;
import org.itstep.one_to_one_uni.EmployeeRepository;
import org.itstep.one_to_one_uni.EmployeeService;
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

    @Autowired
    PersonRepository personRepository;

    @Autowired
    SubscriberRepository subscriberRepository;

    @Autowired
    PhoneRepository phoneRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public static void main(String[] args) {
        
SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //one to one
        employeeService.getEmployees().forEach(System.out::println);
        employeeService.deleteEmployeeById(1L);
        employeeService.getAddresses().forEach(System.out::println);
        addressRepository.findByCityAndStreet("Minsk","Pobediteley st").forEach(System.out::println);

        //one to many
        subscriberRepository.findAll().forEach(System.out::println);
        phoneRepository.findAll().forEach(System.out::println);

        //many to many
        bookRepository.findAll().forEach(System.out::println);
        authorRepository.findAll().forEach(System.out::println);
    }
} 