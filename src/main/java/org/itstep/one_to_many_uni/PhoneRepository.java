package org.itstep.one_to_many_uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface PhoneRepository extends JpaRepository<Phone, Long> {
} 