package com.empresa.lucas.app.Fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.empresa.lucas.app.R;

public class FragmentProfile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_profile, container, false);
        return view;

    }

    public static FragmentProfile newInstance() {
        return new FragmentProfile();
    }

}
