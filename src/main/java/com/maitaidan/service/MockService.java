package com.maitaidan.service;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.maitaidan.config.JsonUtil;
import com.maitaidan.dao.MockDao;
import com.maitaidan.dao.MockParamDao;
import com.maitaidan.model.Mock;
import com.maitaidan.model.MockParam;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Crytis on 2016/3/30.
 * Just test.
 */
@Service
public class MockService {

    @Autowired
    MockDao mockDao;
    @Autowired
    MockParamDao mockParamDao;

    private Logger logger = LoggerFactory.getLogger(MockService.class);

    public String getMockResult(String uri, Map parameterMap) {
        String result;
        if (StringUtils.isBlank(uri)) {
            return null;
        }
        List<Mock> mockList = mockDao.getMockByURI(uri);
        Mock mockInstance = mockList.size() > 0 ? mockList.get(0) : null;
        if (mockInstance == null) {
            logger.warn("uri:{}获取的结果是0");
            return null;
        }
        if (parameterMap == null || parameterMap.isEmpty()) {
            logger.info("url:{}没有参数,返回默认值", uri);
            return mockInstance.getDefaultResult();
        }
        if (mockInstance.getUseParam() == 1) {
            result = getResultByParam(mockInstance, parameterMap);
        }else {
            result = mockInstance.getDefaultResult();
        }

        return result;
    }

    private String getResultByParam(Mock mock, Map arrayParam) {
        if (mock == null || arrayParam == null) {
            return "";
        }
        //arrayParam value是个数组
        HashMap<String, String> param = Maps.newHashMapWithExpectedSize(arrayParam.size());
        for (Object key : arrayParam.keySet()) {
            String value[]=(String[])arrayParam.get(key);
            param.put((String) key, value[0]);
        }

        logger.info("参数列表:{}",param);

        List<MockParam> mockParams = mockParamDao.getMockParamById(mock.getId());
        if (mockParams.isEmpty()) {
            return mock.getDefaultResult();
        }

        for (MockParam mockParam : mockParams) {
            HashMap<String,String> parsedResult = JsonUtil.parse(mockParam.getExpectParam(), HashMap.class);
            MapDifference difference = Maps.difference(param, parsedResult);
            if (difference.areEqual()) {
                return mockParam.getResult();
            }
        }


        return mock.getDefaultResult();
    }

}
