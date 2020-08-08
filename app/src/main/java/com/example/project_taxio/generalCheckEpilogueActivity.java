package com.example.project_taxio;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.project_taxio.MainActivity;
import com.example.project_taxio.R;

import java.util.ArrayList;

public class generalCheckEpilogueActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView title_text;
    Button edit_epilogue;
    ListView listView;
    Epilogue_listAdapter epilogue_listAdapter;
    ArrayList<Epilogue_list_item> list_itemArrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.general_check_epilogue_activity);

        toolbar = (Toolbar)findViewById(R.id.bar); // 툴바를 액티비티의 앱바로 지정
        setSupportActionBar(toolbar); //툴바를 현재 액션바로 설정
        ActionBar actionBar = getSupportActionBar(); //현재 액션바를 가져옴
        actionBar.setDisplayShowTitleEnabled(false); //액션바의 타이틀 삭제
        actionBar.setDisplayHomeAsUpEnabled(true); //홈으로 가기 버튼 활성화

        edit_epilogue = findViewById(R.id.edit_epilogue);
        listView = findViewById(R.id.epilogues);

        list_itemArrayList = new ArrayList<Epilogue_list_item>();

        epilogue_listAdapter = new Epilogue_listAdapter(generalCheckEpilogueActivity.this, list_itemArrayList);
        listView.setAdapter(epilogue_listAdapter);

        title_text = findViewById(R.id.title_text);
        title_text.setClickable(true);

        title_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(generalCheckEpilogueActivity.this, generalMainActivity.class);
                startActivity(i);
                finish();
            }
        });

        edit_epilogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(generalCheckEpilogueActivity.this, generalWriteEpilogueActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {//toolbar의 back키 눌렀을 시
        switch (item.getItemId()){
            case android.R.id.home:{//이전 화면으로 돌아감
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
