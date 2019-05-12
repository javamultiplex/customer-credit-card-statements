package com.manthan.cc.repository;

import com.manthan.cc.entity.Education;
import com.manthan.cc.entity.Marriage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarriageRepository extends CrudRepository<Marriage,Long> {
}
