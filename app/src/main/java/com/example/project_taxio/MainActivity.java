package com.example.project_taxio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar(); //ActionBar 대신 ToolBar로 변경 Method
        setDrawer(); //NavigationDrawer Method
    }

    //ActionBar 대신 ToolBar로 변경 Method
    public void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar); // 툴바를 액티비티의 앱바로 지정
        setSupportActionBar(toolbar); //툴바를 현재 액션바로 설정
        ActionBar actionBar = getSupportActionBar(); //현재 액션바를 가져옴
        actionBar.setDisplayShowTitleEnabled(false); //액션바의 타이틀 삭제
        actionBar.setDisplayHomeAsUpEnabled(true); //홈으로 가기 버튼 활성화
    }

    //NavigationDrawer Method
    public void setDrawer() {
        drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView drawer = findViewById(R.id.drawer);

        drawer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setChecked(true);
                drawerLayout.closeDrawers();

                int id = menuItem.getItemId();

                if (id == R.id.drawer_schTrip) {

                } else if (id == R.id.drawer_myInfo) {


                } else if (id == R.id.drawer_setting) {

                }

                return true;
            }
        });
    }
}
