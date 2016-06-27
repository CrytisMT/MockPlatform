package com.maitaidan.controller;

import com.maitaidan.model.GeneralResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Crytis on 2016/3/30.
 * Just test.
 */
@RestController("config")
public class ConfigController {
    private Logger logger = LoggerFactory.getLogger(ConfigController.class);

    @RequestMapping("addAPI")
    public GeneralResult addAPI(){
        return null;
    }
}
