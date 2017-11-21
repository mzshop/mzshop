package com.mz.mzshop.dao;

import com.mz.mzshop.pojo.po.TbItemTag;
import com.mz.mzshop.pojo.po.TbItemTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemTagMapper {
    int countByExample(TbItemTagExample example);

    int deleteByExample(TbItemTagExample example);

    int insert(TbItemTag record);

    int insertSelective(TbItemTag record);

    List<TbItemTag> selectByExample(TbItemTagExample example);

    int updateByExampleSelective(@Param("record") TbItemTag record, @Param("example") TbItemTagExample example);

    int updateByExample(@Param("record") TbItemTag record, @Param("example") TbItemTagExample example);
}