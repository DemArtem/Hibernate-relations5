package org.itstep.one_to_one_bi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface PersonRepository extends JpaRepository<Person, Long> {
} 