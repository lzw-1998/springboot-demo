package com.hanz.stuspringdemo.dao;

import com.hanz.stuspringdemo.domain.TestGenerator;

public interface TestGeneratorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestGenerator record);

    int insertSelective(TestGenerator record);

    TestGenerator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestGenerator record);

    int updateByPrimaryKey(TestGenerator record);
}