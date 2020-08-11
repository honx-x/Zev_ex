package com.example.zev_ex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapView;

public class Zev_A2_4 extends Fragment {

    Zev_Home mainActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.zev_a2_4, container, false);

        mainActivity = (Zev_Home) getActivity();

        MapView a2_4_map_view = new MapView(mainActivity);
        ViewGroup mapViewContainer = rootview.findViewById(R.id.a2_4_map_view);

        mapViewContainer.addView(a2_4_map_view);




        return rootview;
    }
}