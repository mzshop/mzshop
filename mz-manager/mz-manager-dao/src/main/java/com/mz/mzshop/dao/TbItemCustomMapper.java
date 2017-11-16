package com.mz.mzshop.dao;

import com.mz.mzshop.common.dto.Order;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.pojo.vo.TbItemCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCustomMapper {
    int countItems();

    List<TbItemCustom> listItemsByPage(@Param("page") Page page,@Param("order") Order order);
}