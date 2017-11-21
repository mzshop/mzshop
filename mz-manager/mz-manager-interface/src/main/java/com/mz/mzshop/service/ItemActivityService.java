package com.mz.mzshop.service;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.pojo.vo.TbItemActivityCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 21:16
 * Version:V1.0
 */
public interface ItemActivityService {
    List<TreeNode> getItemActivity();

    Result<TbItemActivityCustom> getItemActivityByPage(Page page, NormalOrder order, TbItemCatQuery query);

    int removeItemActivityById(List<Long> ids);
}
