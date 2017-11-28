package com.mz.mzshop.portal.web;


import com.mz.mzshop.common.dto.Page2;
import com.mz.mzshop.common.util.PropKit;
import com.mz.mzshop.pojo.po.*;
import com.mz.mzshop.pojo.vo.TbItemCustom2;
import com.mz.mzshop.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
        //查询活动标题tb_item_activity
        List<TbItemActivity> tbItemActivityList = contentService.listTbItemActivity(1);
        //下方展示商品
        List<TbItemCustom2> TbItemCustom2 = contentService.listTbItemByAid(1);
        //第二步：存放到model中
        model.addAttribute("ad1List", list);
        model.addAttribute("tbNotice",tbNotice);
        model.addAttribute("listTbItemCat",listTbItemCat);
        model.addAttribute("listTbItemActivities",tbItemActivityList);
        model.addAttribute("listItem",TbItemCustom2);
        //第三步：返回首页
        return "index";
    }
    @RequestMapping("directByPage")
    public String directByPage(Model model, HttpServletRequest request, Page2 page2){
        //从数据查找商品类别tb_item_cat
        List<TbItemCat> listTbItemCat = contentService.listTbItemCat(1);


        // 设置每页四个数据
        int pageSize = 4;
        page2.setPageSize(pageSize);
        // 如果不是从分页按钮传过来，设置当前页数为1
        int curPage = page2.getCurrentPage();
        if (curPage == 0) {
            curPage = 1;
            page2.setCurrentPage(curPage);
        }
        //设置开始下标
        int startRow = page2.getStartRow();
        if (page2.getCurrentPage() != 0) {
            startRow = getStartRowBycurrentPage(curPage, pageSize);
        }
        page2.setStartRow(startRow);

        List<TbItem> tbItemList = contentService.listItemByCid(page2);

        Integer totalCounts = contentService.getTotalCountsForItem(page2);
        int totalPages = totalCounts.intValue() % pageSize == 0 ? totalCounts.intValue() / pageSize : totalCounts.intValue() / pageSize + 1;

        page2.setTotalPage(totalPages);
        model.addAttribute("tbItemList",tbItemList);
        model.addAttribute("page2",page2);
        model.addAttribute("listTbItemCat",listTbItemCat);

        return "direct";

    }

    private int getStartRowBycurrentPage(int currentPage, int pageSize) {
        int startRow = 0;
        if (currentPage == 1) {
            return startRow = 0;
        }
        startRow = (currentPage - 1) * pageSize;
        return startRow;
    }



}
