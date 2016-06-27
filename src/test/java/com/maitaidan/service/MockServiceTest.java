package com.maitaidan.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Crytis on 2016/3/30.
 * Just test.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class MockServiceTest {

    @Resource
    MockService mockService;

    @org.junit.Test
    public void getMockResult() throws Exception {
        String mockResult = mockService.getMockResult("a", null);
        System.out.println(mockResult);
    }
}