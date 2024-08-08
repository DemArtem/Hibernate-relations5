package org.itstep.one_to_one_unit;

import org.itstep.one_to_one_unit.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
    //Custom methods
    //Найти адреса с данным городом
    List<Address> findByCity(String city);
    //Найти первые два адреса в данном городе
    List<Address> findTop2ByCity(String city);
    //Найти адреса с данным городом и улицей
    List<Address> findByCityAndStreet(String city, String street);
    //Найти адреса с городом, начинающимся на букву
    List<Address> findByCityStartingWith(String prefix);
    List<Address> findByCityEndingWith(String suffix);
    List<Address> findByCityContaining(String infix);
    List<Address> findByCityLike(String likePattern);
    List<Address> findByCityOrStreet(String city, String street);
    List<Address> findByCityOrderByStreet(String city);
}