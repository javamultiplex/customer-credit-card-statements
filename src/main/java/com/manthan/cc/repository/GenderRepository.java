package com.manthan.cc.repository;

import com.manthan.cc.entity.Education;
import com.manthan.cc.entity.Gender;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends CrudRepository<Gender,Long> {
}
