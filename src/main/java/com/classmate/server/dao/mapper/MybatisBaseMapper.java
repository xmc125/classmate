package com.classmate.server.dao.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MybatisBaseMapper<T, P, E> {

    int countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(P id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(E example);

    T selectByPrimaryKey(P id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
