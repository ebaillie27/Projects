package com.revature.baileysbarista.Services;

import com.revature.baileysbarista.Models.HasClass;
import com.revature.baileysbarista.Repositories.HasClassRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HasClassService
 */
@Service
public class HasClassService {

    @Autowired 
    HasClassRepository hcr;

    public void Addclasstostudent(HasClass hasclass){
        hcr.save(hasclass);
    }
}