package com.mz.mzshop.service;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.pojo.vo.TbItemTagCustom;
import com.mz.mzshop.pojo.vo.TbItemTagQuery;

import java.util.List; /**
 * User: Administrator
 * Date: 2017/11/20
 * Time: 11:54
 * Version:V1.0
 */
public interface ItemTagService {
    Result<TbItemTagCustom> getItemTagsByPage(Page page, NormalOrder order, TbItemTagQuery query);

    int removeItemTagsById(List<Long> ids);
}
