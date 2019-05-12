package com.manthan.cc.repository;

import com.manthan.cc.entity.RepaymentStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepaymentStatusRepository extends CrudRepository<RepaymentStatus, Long> {
}
