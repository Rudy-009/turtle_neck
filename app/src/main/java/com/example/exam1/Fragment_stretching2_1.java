package com.example.exam1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_stretching2_1 extends Fragment {
    private View view;

    public static Fragment_stretching2_1 newInstance(){
        Fragment_stretching2_1 frag_stretching2_1 = new Fragment_stretching2_1();
        return frag_stretching2_1;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_fragment_stretching2_1,container,false);
        return view;
    }
}
