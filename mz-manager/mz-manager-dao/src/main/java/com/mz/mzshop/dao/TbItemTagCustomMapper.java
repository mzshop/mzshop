package com.mz.mzshop.dao;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.pojo.vo.TbItemTagCustom;
import com.mz.mzshop.pojo.vo.TbItemTagQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/20
 * Time: 11:58
 * Version:V1.0
 */
public interface TbItemTagCustomMapper {
    int countItemTags(@Param("query") TbItemTagQuery query);

    List<TbItemTagCustom> listItemTagsByPage(@Param("page") Page page,@Param("order") NormalOrder order,@Param("query") TbItemTagQuery query);
}
