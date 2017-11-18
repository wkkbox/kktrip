package com.tp.trip.common.dto;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/7
 * Time: 15:56
 * Version:V1.0
 */
public class Result<T> {
    /*   显示总数*/
    private int total;
  /*  分页的每一页的数据*/
    private List<T> rows;

    public void setTotal(int total) {
        this.total = total;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {

        return total;
    }

    public List<T> getRows() {
        return rows;
    }
}
