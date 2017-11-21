package com.mz.mzshop.web;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.pojo.vo.TbItemTagCustom;
import com.mz.mzshop.pojo.vo.TbItemTagQuery;
import com.mz.mzshop.service.ItemTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 19:29
 * Version:V1.0
 */
@Controller
public class ItemTagAction {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ItemTagService itemTagService;


    @RequestMapping("/itemTags")
    @ResponseBody
    public Result<TbItemTagCustom> listItemTagsByPage(Page page, NormalOrder order, TbItemTagQuery query){
        Result<TbItemTagCustom> result=null;
        try {
            result=itemTagService.getItemTagsByPage(page,order,query);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("itemTags/batchRemove")
    @ResponseBody
    public int removeItemTagsById(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=itemTagService.removeItemTagsById(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
