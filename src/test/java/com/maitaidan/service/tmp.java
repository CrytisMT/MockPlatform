package com.maitaidan.service;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Crytis on 2016/4/5.
 * Just test.
 */
public class tmp {
    @Test
    public void test() {
        HashMap<String, String> a = Maps.newHashMap();
        a.put("a", "ddd");
        a.put("b", "ddd");
        System.out.println(a);


        HashMap<String, String> map1 = Maps.newHashMap();
        map1.put("a", new String("test"));
        HashMap<String, String> map2 = Maps.newHashMap();
        map2.put("a", "test");

        MapDifference<String, String> difference = Maps.difference(map1, map2);
        System.out.println(difference);
    }
}
