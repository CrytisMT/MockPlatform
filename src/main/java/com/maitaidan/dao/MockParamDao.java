package com.maitaidan.dao;

import com.maitaidan.model.MockParam;

import java.util.List;

/**
 * Created by Crytis on 2016/4/5.
 * Just test.
 */
public interface MockParamDao {
    List<MockParam> getMockParamById(int mockId);
}
