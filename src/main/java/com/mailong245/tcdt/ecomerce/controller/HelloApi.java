package com.mailong245.tcdt.ecomerce.controller;


import com.mailong245.tcdt.ecomerce.database.BO.Student;
import com.mailong245.tcdt.ecomerce.database.DAO.StudentRepository;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloApi {

    private static final Logger logger = LogManager.getLogger(HelloApi.class);

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(path = "/HelloApi", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String helloAPI(@RequestParam String name) {

        logger.info("name: " + name);

        Student student = studentRepository.findByName(name);

        logger.info(student);

        return "fetch complete";

    }
}
