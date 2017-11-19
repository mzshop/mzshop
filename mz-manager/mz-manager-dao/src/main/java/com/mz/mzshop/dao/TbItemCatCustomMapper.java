package com.mz.mzshop.dao;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.pojo.vo.TbItemCatCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/18
 * Time: 22:26
 * Version:V1.0
 */
public interface TbItemCatCustomMapper {
    int countItemCats(@Param("query") TbItemCatQuery query);

    List<TbItemCatCustom> listItemCatsByPage(@Param("page") Page page,@Param("order") NormalOrder order, @Param("query") TbItemCatQuery query);
}
