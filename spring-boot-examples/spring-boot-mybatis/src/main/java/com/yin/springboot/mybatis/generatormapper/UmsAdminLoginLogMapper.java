package com.yin.springboot.mybatis.generatormapper;

import com.yin.springboot.mybatis.generatormodel.UmsAdminLoginLog;
import com.yin.springboot.mybatis.generatormodel.UmsAdminLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminLoginLogMapper {
    int countByExample(UmsAdminLoginLogExample example);

    int deleteByExample(UmsAdminLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByExample(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);
}