package com.classmate.server.dao.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MybatisBlobMapper<T, P, E> extends MybatisBaseMapper<T, P, E> {

    List<T> selectByExampleWithBLOBs(E example);

    int updateByExampleWithBLOBs(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeyWithBLOBs(T record);
}
