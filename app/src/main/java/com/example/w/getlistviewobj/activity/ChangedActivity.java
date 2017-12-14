package com.example.w.getlistviewobj.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.w.getlistviewobj.R;
import com.example.w.getlistviewobj.adapter.WorkPlanGroupAdapter;
import com.example.w.getlistviewobj.bean.ItemPlanGroupBean;

import java.util.ArrayList;
import java.util.List;
// changed_listview.getChildAt(i-changed_listview.getFirstVisiblePosition());
public class ChangedActivity extends AppCompatActivity {

    String datas;
    ListView changed_listview;
    List<ItemPlanGroupBean> itemPlanGroupBeanList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changed);
        initView();
    }

    private void initView() {
        changed_listview = (ListView) findViewById(R.id.changed_listview);

        for (int i = 0; i < 100; i++) {
            itemPlanGroupBeanList.add(new ItemPlanGroupBean(
                    R.mipmap.ic_launcher_round,
                    R.color.colorPrimaryDark,
                    "张海斌" + i
            ));
        }

        changed_listview.setAdapter(new WorkPlanGroupAdapter(this, itemPlanGroupBeanList));

        changed_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                WorkPlanGroupAdapter adpter= (WorkPlanGroupAdapter) adapterView.getAdapter();
                ItemPlanGroupBean item=(ItemPlanGroupBean)adpter.getItem(i);//拿到当前数据值并强转   adpter.getItem(i)即为当前数据对象

                datas = item.getItemNameTv();
                Toast.makeText(getApplicationContext(), "你点击了第" + datas + "项!", Toast.LENGTH_SHORT).show();
                Log.e("111111111111111111: ",datas );
                Intent intent = new Intent(getApplicationContext(),WorkPlanActivity.class);
                intent.putExtra("datas",datas);
                setResult(RESULT_OK,intent );
                finish();
            }
        });
    }
}
