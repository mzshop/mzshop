package com.mz.mzshop.service;


import com.mz.mzshop.pojo.po.TbContent;
import com.mz.mzshop.pojo.po.TbItemCat;
import com.mz.mzshop.pojo.po.TbNotice;

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
}
