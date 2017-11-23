package com.tp.trip.common.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/9
 * Time: 16:32
 * Version:V1.0
 */
public class Order {
    private String order;
    private String sort;

    @Override
    public String toString() {
        return "Order{" +
                "order='" + order + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }

    /*此方法非常精髓，有get方法mybatis是调用get方法。此方法主要是为了联合排序，个人觉得很鸡肋*/
    public List<String> getOrderParams() {
        /*order is order ruler*/
        String[] split1= order.split(",");
        /*sort is order colnum*/
        String[] split2= sort.split(",");
        List<String> list=new ArrayList<>();
        for (int i=0;i<split1.length;i++){
            list.add(split2[i]+" "+split1[i]);
        }
        return list;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
