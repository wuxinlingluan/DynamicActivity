package com.github.test;

/**
 * Created by fatchao
 * 日期  2017/3/10.
 * 邮箱  fat_chao@163.com
 */

//RecyclerView的item点击事件
public interface RvListener {

    void onItemClick(int id, int position);
    void onItemLongClick(int id, int position);
}
