package com.mz.mzshop.dao;

import com.mz.mzshop.pojo.po.TbItemActivity;
import com.mz.mzshop.pojo.po.TbItemActivityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemActivityMapper {
    int countByExample(TbItemActivityExample example);

    int deleteByExample(TbItemActivityExample example);

    int insert(TbItemActivity record);

    int insertSelective(TbItemActivity record);

    List<TbItemActivity> selectByExample(TbItemActivityExample example);

    int updateByExampleSelective(@Param("record") TbItemActivity record, @Param("example") TbItemActivityExample example);

    int updateByExample(@Param("record") TbItemActivity record, @Param("example") TbItemActivityExample example);
}