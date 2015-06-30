package com.networktool.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.networktool.dao.T1DaoImpl;
import com.networktool.model.T1;

@Controller
public class T1Controller {
    @Autowired
    T1DaoImpl t1Dao;
    @RequestMapping("gett1")
    public ModelAndView getT1Objects() {
        List<T1> t1s = t1Dao.findAllT1();
        System.out.println(t1s);
        return new ModelAndView("T1Test", "t1s", t1s);
    }
}
