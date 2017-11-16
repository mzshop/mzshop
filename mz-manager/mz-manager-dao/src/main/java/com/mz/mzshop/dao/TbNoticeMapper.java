package com.mz.mzshop.dao;

import com.mz.mzshop.pojo.po.TbNotice;
import com.mz.mzshop.pojo.po.TbNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbNoticeMapper {
    int countByExample(TbNoticeExample example);

    int deleteByExample(TbNoticeExample example);

    int insert(TbNotice record);

    int insertSelective(TbNotice record);

    List<TbNotice> selectByExample(TbNoticeExample example);

    int updateByExampleSelective(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByExample(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);
}