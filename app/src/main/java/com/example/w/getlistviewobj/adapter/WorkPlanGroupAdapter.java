package com.example.w.getlistviewobj.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.w.getlistviewobj.R;
import com.example.w.getlistviewobj.bean.ItemPlanGroupBean;

import java.util.List;


/**
 * Created by wangjj on 2017/9/12.
 *  组员工作计划
 */

public class WorkPlanGroupAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<ItemPlanGroupBean> mList;
    public WorkPlanGroupAdapter(Context context, List<ItemPlanGroupBean> list){
        mList = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        WorkPlanGroupAdapter.ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new WorkPlanGroupAdapter.ViewHolder();
            view = mInflater.inflate(R.layout.item_plan_group,null);
            viewHolder. groupIconImage = view.findViewById(R.id.item_plan_group_icon);
            viewHolder. nextImg = view.findViewById(R.id.item_plan_group_next);
            viewHolder. nameTv = view.findViewById(R.id.item_plan_group_name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (WorkPlanGroupAdapter.ViewHolder) view.getTag();
        }
        ItemPlanGroupBean bean = mList.get(position);
        viewHolder. groupIconImage.setImageResource(bean.getItemIconImg());
        viewHolder. nextImg.setImageResource(R.mipmap.ic_launcher_round);
        viewHolder. nameTv.setText(bean.getItemNameTv());



        return view;
    }
    class ViewHolder {
          ImageView groupIconImage;
          ImageView nextImg;
          TextView nameTv;
    }
}
