package com.manthan.cc.service;

import com.manthan.cc.entity.Gender;
import com.manthan.cc.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenderService {

    private final GenderRepository genderRepository;

    @Autowired
    public GenderService(GenderRepository genderRepository) {
        this.genderRepository = genderRepository;
    }

    /**
     * @param id
     * @return
     */
    public Gender findById(long id) {
        Optional<Gender> gender = genderRepository.findById(id);
        return gender.orElseGet(Gender::new);
    }
}
