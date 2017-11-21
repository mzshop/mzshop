package com.mz.mzshop.service;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.pojo.vo.TbItemCatCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 19:33
 * Version:V1.0
 */
public interface ItemCatService {
    List<TreeNode> getItemCats();

    Result<TbItemCatCustom> getItemCatsByPage(Page page, NormalOrder order, TbItemCatQuery query);

    int removeItemCatsById(List<Long> ids);
}
