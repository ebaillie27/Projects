package com.revature.baileysbarista.Controllers;

import javax.servlet.http.HttpSession;

import com.revature.baileysbarista.Models.Classes;
import com.revature.baileysbarista.Models.HasClass;
import com.revature.baileysbarista.Services.ClassesService;
import com.revature.baileysbarista.Services.HasClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassesController
 */
@RestController
@RequestMapping("class")
public class ClassesController {

    @Autowired
    ClassesService cs;
    @Autowired
    HasClassService hcs;

    @PostMapping("/create")
    public String CreateClass(@RequestBody Classes classes, HttpSession session) {
        String userType = (String)session.getAttribute("userType");
        
        if(userType.equals("Bailey")){
            System.out.println("Imhere");
            cs.createClasses(classes);
            return ("Success");
        }
        return (userType);
    }

    @PostMapping("/addclass/{id}")
    public String addClasstoMatrix(@PathVariable int id, HttpSession session){
        int userId = (int)session.getAttribute("id");
        HasClass hasclass1 = new HasClass(0,userId,id,"Joined");
        hcs.Addclasstostudent(hasclass1);
        return "Sucess";
} 
    
}