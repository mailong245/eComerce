package com.mailong245.tcdt.ecomerce.controller;

import com.mailong245.tcdt.ecomerce.database.DAO.StudentRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    @Autowired
    private StudentRepository studentRepository;

//    @ResponseBody
    @RequestMapping(path = {"", "/"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String Hello() {
        logger.info("LOGGER SAY HELLO");

        logger.info("Hello 1");

        return "HelloApi?name=long";
    }

}
