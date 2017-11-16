package com.mz.mzshop.service.impl;

import com.mz.mzshop.common.dto.Order;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.dao.TbItemCustomMapper;
import com.mz.mzshop.dao.TbItemMapper;
import com.mz.mzshop.pojo.vo.TbItemCustom;
import com.mz.mzshop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 15:45
 * Version:V1.0
 */
@Service
public class ItemServiceImpl implements ItemService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    TbItemMapper itemDao;

    @Autowired
    TbItemCustomMapper itemCustomDao;
    @Override
    public Result<TbItemCustom> getItemsByPage(Page page, Order order) {
        Result<TbItemCustom> result=null;
        try {
            result=new Result<TbItemCustom>();
            result.setTotal(itemCustomDao.countItems());
            result.setRows(itemCustomDao.listItemsByPage(page,order));
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
}
