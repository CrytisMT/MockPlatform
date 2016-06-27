package com.maitaidan.dao;

import com.maitaidan.model.Mock;

import java.util.List;

/**
 * Created by Crytis on 2016/3/30.
 * Just test.
 */
public interface MockDao {
    List<Mock> getMockByURI(String uri);
}
