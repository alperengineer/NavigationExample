package com.aok.navigationexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


public class SecondFragment extends Fragment {

    public SecondFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button2 = view.findViewById(R.id.goToFragment1_btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFirsFragment(view);
            }
        });

        TextView textView = view.findViewById(R.id.secondFragmentTextView);

    }

    public void goToFirsFragment(View view){

        NavDirections navDirections = SecondFragmentDirections.actionSecondFragmentToFirstFragment();
        Navigation.findNavController(view).navigate(navDirections);

    }
}