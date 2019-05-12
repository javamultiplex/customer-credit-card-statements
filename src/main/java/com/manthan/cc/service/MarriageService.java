package com.manthan.cc.service;

import com.manthan.cc.entity.Marriage;
import com.manthan.cc.repository.MarriageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarriageService {

    private final MarriageRepository marriageRepository;

    @Autowired
    public MarriageService(MarriageRepository marriageRepository) {
        this.marriageRepository = marriageRepository;
    }

    /**
     * @param id
     * @return
     */
    public Marriage findById(long id) {
        Optional<Marriage> marriage = marriageRepository.findById(id);
        return marriage.orElseGet(Marriage::new);
    }
}
