package com.example.w.getlistviewobj.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.w.getlistviewobj.R;

public class WorkPlanActivity extends AppCompatActivity {

    TextView changed_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {//按钮点击
        changed_click = (TextView) findViewById(R.id.changed_click);
        changed_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        ChangedActivity.class);
                startActivityForResult(intent, RESULT_CODE);
            }
        });
    }

    final int RESULT_CODE = 102;
    String datas;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_CODE) {
            if (resultCode == RESULT_OK) {
                datas = data.getStringExtra("datas");
                changed_click.setText(datas);
            }
        }
    }

}
