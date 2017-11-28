package com.mz.mzshop.dao;

import com.mz.mzshop.common.dto.Order;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Page2;
import com.mz.mzshop.pojo.po.TbItem;
import com.mz.mzshop.pojo.vo.TbItemCustom;
import com.mz.mzshop.pojo.vo.TbItemCustom2;
import com.mz.mzshop.pojo.vo.TbItemQuery;
import com.mz.mzshop.pojo.vo.TbSearchItemCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCustomMapper {
    int countItems(@Param("query")TbItemQuery query);

    List<TbItemCustom> listItemsByPage(@Param("page") Page page, @Param("order") Order order,@Param("query")TbItemQuery query);

    int coutItemsByCat(@Param("page2") Page2 page2);

    List<TbItem> listItemsByCat(@Param("page2") Page2 page2);

    List<TbItemCustom2> listItemByAid(@Param("aid")Integer aid);

    List<TbSearchItemCustom> getSearchItemList();

}