package com.example.dubhacks2019.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.Karmen.bitcal.UnityPlayerActivity;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dubhacks2019.AddGoalActivity;
import com.example.dubhacks2019.R;
import com.example.dubhacks2019.UnityActiviy;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final Button unity_button = root.findViewById(R.id.AnimationButton);
        unity_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                System.out.println("widget button pressed");
                Intent animate = new Intent(getActivity(), UnityPlayerActivity.class);
                animate.putExtra("arguments", "data from android");
                startActivity(animate);
            }
        });
        return root;
    }
}