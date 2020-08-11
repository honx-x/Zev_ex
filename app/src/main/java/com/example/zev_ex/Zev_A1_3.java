package com.example.zev_ex;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Zev_A1_3 extends Fragment {

    Spinner a1_3_spinner;
    ArrayAdapter arrayAdapter;

    Zev_Home mainActivity;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.zev_a1_3, container, false);

        mainActivity = (Zev_Home) getActivity();

        ArrayList arrayList = new ArrayList<>();

        arrayList.add("최신순");
        arrayList.add("오래된순");
        arrayList.add("가까운순");

        a1_3_spinner = rootview.findViewById(R.id.a1_3_spinner);
        arrayAdapter = new ArrayAdapter<>(mainActivity.getApplicationContext(),android.R.layout.simple_spinner_dropdown_item, arrayList);
        a1_3_spinner.setAdapter(arrayAdapter);



        return rootview;


    }


}