package com.example.zev_ex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.navigation.NavigationView;

import net.daum.mf.map.api.MapView;

public class Zev_Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    Fragment Zev_M1, Zev_A1_1, Zev_A1_2, Zev_A1_3, Zev_A2_1, Zev_A2_3;
    FrameLayout main_frame;
    DrawerLayout drawerLayout;
    NavigationView nav_view;
    Button btn_menu;
    TextView main_txt;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zev_home);

        Zev_M1 = new Zev_M1();
        Zev_A1_1 = new Zev_A1_1();
        Zev_A1_2 = new Zev_A1_2();
        Zev_A1_3 = new Zev_A1_3();
        Zev_A2_1 = new Zev_A2_1();
        Zev_A2_3 = new Zev_A2_3();


        drawerLayout = findViewById(R.id.home_drawer);
        main_frame = findViewById(R.id.main_frame);
        btn_menu = findViewById(R.id.btn_menu);
        nav_view = findViewById(R.id.nav_view);
        main_txt = findViewById(R.id.main_txt);



        main_txt.setOnClickListener(this);


        btn_menu.setOnClickListener(new View.OnClickListener() { // nav_btn클릭시 nav_view호출
            @Override
            public void onClick(View view) {

                drawerLayout.openDrawer(nav_view);

            }
        });

        nav_view.setNavigationItemSelectedListener(this);


        // 카카오 맵 테스트

/*        MapView mapView = new MapView(this);
        ViewGroup mapViewContainer = findViewById(R.id.main_frame);

        mapViewContainer.addView(mapView);*/






        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_M1).commitAllowingStateLoss();


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_a1_1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_A1_1).commit();
        } else if (id == R.id.nav_a1_2){
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_A1_2).commit();
        } else if (id == R.id.nav_a1_3) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_A1_3).commit();
        }else if (id == R.id.nav_a2_1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_A2_1).commit();
        }else if (id == R.id.nav_a2_2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_M1).commit();
        }else if (id == R.id.nav_a2_3) {
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_A2_3).commit();
        }


        drawerLayout.closeDrawer(Gravity.LEFT);


        return false;
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        if(id == R.id.main_txt){
            getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, Zev_M1).commit();
        }

    }
}