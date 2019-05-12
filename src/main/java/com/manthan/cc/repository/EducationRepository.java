package com.manthan.cc.repository;

import com.manthan.cc.entity.Education;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends CrudRepository<Education,Long> {
}
