package com.manthan.cc.service;

import com.manthan.cc.entity.RepaymentStatus;
import com.manthan.cc.repository.RepaymentStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RepaymentStatusService {

    private final RepaymentStatusRepository repaymentStatusRepository;

    @Autowired
    public RepaymentStatusService(RepaymentStatusRepository repaymentStatusRepository) {
        this.repaymentStatusRepository = repaymentStatusRepository;
    }

    /**
     * @param id
     * @return
     */
    public RepaymentStatus findById(long id) {
        Optional<RepaymentStatus> repaymentStatus = repaymentStatusRepository.findById(id);
        return repaymentStatus.orElseGet(RepaymentStatus::new);
    }
}
