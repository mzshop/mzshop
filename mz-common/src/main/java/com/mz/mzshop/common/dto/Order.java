package com.mz.mzshop.common.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/11
 * Time: 16:10
 * Version:V1.0
 */
public class Order {
    private String sort;
    private String order;
    public List<String> getOrderParam(){
        String[] sorts=this.sort.split(",");
        String[] orders=this.order.split(",");
        List<String> list=new ArrayList<String>();
        for (int i=0;i<sorts.length;i++){
            String orderParam = "(i."+sorts[i]+" USING gbk) "+orders[i];
            list.add(orderParam);
        }
        return list;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
