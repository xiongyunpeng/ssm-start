package com.seecen.entity;

import java.util.List;

/**
 * Created by asus on 2018/1/19.
 */
public class Page<T>  {
    private int currentPage=1;
    private int pageSize=10;
    private int total;
    private List<T> list;
    private T condition;

    public int getStart(){
        return (currentPage-1)*pageSize;
    }
    public int getEnd(){
        return currentPage*pageSize;
    }

    public int getPageTotal(){
        return (int) Math.ceil(total*1.0/pageSize);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getCondition() {
        return condition;
    }

    public void setCondition(T condition) {
        this.condition = condition;
    }
}
