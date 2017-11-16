package com.mz.mzshop.service;

import com.mz.mzshop.common.dto.Order;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.pojo.vo.TbItemCustom;


/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 15:41
 * Version:V1.0
 */
public interface ItemService {
    Result<TbItemCustom> getItemsByPage(Page page, Order order);
}
