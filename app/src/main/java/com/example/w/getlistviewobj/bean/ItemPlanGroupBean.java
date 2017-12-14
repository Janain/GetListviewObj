package com.example.w.getlistviewobj.bean;

/**
 * Created by wangjj on 2017/9/12.
 *  拜访计划中的 下属列表Item
 */

public class ItemPlanGroupBean {
    public int ItemIconImg;
    public int ItemBackImg;
    public String ItemNameTv;

    public ItemPlanGroupBean(int itemIconImg, int itemBackImg, String itemNameTv) {
        ItemIconImg = itemIconImg;
        ItemBackImg = itemBackImg;
        ItemNameTv = itemNameTv;
    }

    public int getItemIconImg() {
        return ItemIconImg;
    }

    public void setItemIconImg(int itemIconImg) {
        ItemIconImg = itemIconImg;
    }

    public int getItemBackImg() {
        return ItemBackImg;
    }

    public void setItemBackImg(int itemBackImg) {
        ItemBackImg = itemBackImg;
    }

    public String getItemNameTv() {
        return ItemNameTv;
    }

    public void setItemNameTv(String itemNameTv) {
        ItemNameTv = itemNameTv;
    }
}

