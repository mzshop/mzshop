package com.mz.mzshop.dao;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.pojo.vo.TbItemActivityCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/19
 * Time: 11:30
 * Version:V1.0
 */
public interface TbItemActivityCustomMapper {
    int countItemActivity(@Param("query") TbItemCatQuery query);

    List<TbItemActivityCustom> listItemActivityByPage(@Param("page") Page page,@Param("order") NormalOrder order,@Param("query") TbItemCatQuery query);
}
