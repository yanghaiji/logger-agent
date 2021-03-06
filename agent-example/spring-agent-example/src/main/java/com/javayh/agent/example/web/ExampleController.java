package com.javayh.agent.example.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author hai ji
 * @version 1.0.0
 * @since 2022-06-27
 */
@Slf4j
@RestController
@RequestMapping(value = "test")
public class ExampleController {

    @GetMapping(value = "/agent")
    public String getName(){
        log.info("ewohefo");
        return "JavaYh Agent";
    }


    @PostMapping(value = "/agent")
    public String getNam3(@RequestBody Map<String,Object> map){
        log.info("ewohefo");
        return "JavaYh Agent";
    }


    @GetMapping
    public String getName2(){
        log.info("ewohefo");
        return "JavaYh Agent";
    }
}
