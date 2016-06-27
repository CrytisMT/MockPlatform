package com.maitaidan.controller;

import com.google.common.collect.Maps;
import com.maitaidan.service.MockService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Crytis on 2016/3/18.
 * Just test.
 */

@Controller
public class MockController {

    private Logger logger = LoggerFactory.getLogger(MockController.class);
    @Resource
    private MockService mockService;

    @RequestMapping(value = "mockserver", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String mockServer(HttpServletRequest request, HttpServletResponse response, String url, @RequestBody String body) {
        if (StringUtils.isNotBlank(url)) {
            url = url.replaceAll("/mockserver", "");
        }

        logger.info("请求uri:{}", url);
        Map parameterMap = Maps.newHashMap(request.getParameterMap());
        parameterMap.remove("url");
        return mockService.getMockResult(url, parameterMap);
    }

}
