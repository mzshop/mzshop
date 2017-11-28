package com.mz.mzshop.service.impl;

import com.mz.mzshop.dao.TbItemCustomMapper;
import com.mz.mzshop.pojo.vo.TbSearchItemCustom;
import com.mz.mzshop.service.SearchItemService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:48
 * Version:V1.0
 */
@Service
public class SearchItemServiceImpl implements SearchItemService{
    @Autowired
    private TbItemCustomMapper itemCustomDao;

    @Autowired
    private SolrServer solrServer;

    @Override
    public void importAllItems() throws IOException, SolrServerException {
        //采集数据
        List<TbSearchItemCustom> list = itemCustomDao.getSearchItemList();

        //采集数据遍历
        for (TbSearchItemCustom searchItem : list) {
            //拿到solr的文档域
            SolrInputDocument document = new SolrInputDocument();
            //向文档对象中添加域：对应schema.xml配置文件中的域名
            document.addField("id", searchItem.getId());
            document.addField("item_title", searchItem.getTitle());
            document.addField("item_normal_price", searchItem.getNormalPrice());
            document.addField("item_price", searchItem.getPrice());
            document.addField("item_coupon", searchItem.getCoupon());
            document.addField("item_sold_num", searchItem.getSoldNum());
            document.addField("item_image", searchItem.getImage());
            document.addField("item_cat_name", searchItem.getCatName());
            document.addField("item_activity_name", searchItem.getActivityName());
            //写入索引库
            solrServer.add(document);
        }
        solrServer.commit();
    }

}
