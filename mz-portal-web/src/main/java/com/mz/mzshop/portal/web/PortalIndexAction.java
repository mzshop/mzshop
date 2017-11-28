package com.mz.mzshop.portal.web;


import com.mz.mzshop.common.util.PropKit;
import com.mz.mzshop.pojo.po.TbContent;
import com.mz.mzshop.pojo.po.TbItemCat;
import com.mz.mzshop.pojo.po.TbNotice;
import com.mz.mzshop.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * User: 柴畅
 * Version:V1.0
 */
@Controller
public class PortalIndexAction {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/")
    public String portalIndex(Model model){
        //第一步：使用service去查，根据tb_content_category的ID去查
        Long id = PropKit.use("ftp.properties").getLong("ftp.gallery");
        List<TbContent> list = contentService.listContentsByCid(id);

        //从数据库里面查询tb_notice放到model中
        TbNotice tbNotice = contentService.tbNoticeByStatus(1);

        //从数据查找商品类别tb_item_cat
        List<TbItemCat> listTbItemCat = contentService.listTbItemCat(1);
        //第二步：存放到model中
        model.addAttribute("ad1List", list);
        model.addAttribute("tbNotice",tbNotice);
        model.addAttribute("listTbItemCat",listTbItemCat);
        //第三步：返回首页
        return "index";
    }

}
