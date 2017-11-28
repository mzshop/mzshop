package com.mz.mzshop.service;


import com.mz.mzshop.common.dto.Page2;
import com.mz.mzshop.pojo.po.*;
import com.mz.mzshop.pojo.vo.TbItemCustom2;

import java.util.List;

public interface ContentService
{
    /**
     * 根据内容分类的编号查询出内容
     * @param id
     *@return
     */
    List<TbContent> listContentsByCid(Long id);

    TbNotice tbNoticeByStatus(int i);

    List<TbItemCat> listTbItemCat(int i);

    List<TbItemActivity> listTbItemActivity(int i);

    List<TbItemCustom2> listTbItemByAid(int i);

    List<TbItem> listItemByCid(Page2 page2);

    Integer getTotalCountsForItem(Page2 page2);
}
