package com.tp.trip.common.dto;

/**
 * User: Administrator
 * Date: 2017/11/7
 * Time: 15:56
 * Version:V1.0
 */
public class Page {
    @Override
    public String toString() {
        return "Page{" +
                "page=" + page +
                ", rows=" + rows +
                '}';
    }

    /*前台传过来的当前页*/
    private  int page;
    /*前台传过来的每页数据*/
    private  int rows;
   /* private  int offset;*/

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getOffset() {
        return (page-1)*rows;
    }
}
