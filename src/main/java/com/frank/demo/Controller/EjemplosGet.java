/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.frank.demo.Controller;

import com.frank.demo.helpers.ViewRouteHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author frank
 */
@Slf4j
@Controller
@RequestMapping("/")
public class EjemplosGet {

    //GET EXEMPLO: SERVER/INDEX
//    @GetMapping("/index")
//    public String index() {
//        log.info("ESTAS EN INDEX EJEMPLOS GET ");
//        return ViewRouteHelper.INDEX;
//    }
//GET EXEMPLO: SERVER/hello?name=someName
//    @GetMapping("/hello")
//    public ModelAndView hellowParams1(@RequestParam(name = "name", required = false, defaultValue = "null") String name) {
//        ModelAndView mv = new ModelAndView("home/hello");
//        mv.addObject("name", name);
//        return mv;
//    }
    //GET EXEMPLO: SERVER/someName
//    @GetMapping("/hello")
//    public ModelAndView hellowParams2(@RequestParam(name = "name") String name) {
//        ModelAndView mv = new ModelAndView("home/hello");
//        mv.addObject("name", name);
//        return mv;
//    }
//
//    //GET EXEMPLO: SERVER/someName
//    @GetMapping("/")
//    public RedirectView redirectToHomeIndex() {
//        return new RedirectView("index");
//    }
}
