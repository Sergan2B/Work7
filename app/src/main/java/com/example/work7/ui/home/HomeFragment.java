package com.example.work7.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.work7.R;
import com.example.work7.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeViewModel> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        homeAdapter = new HomeAdapter(list);
        binding.homeRecycle.setAdapter(homeAdapter);
    }

    private void loadData() {
        list.add(new HomeViewModel("29 сентября", "Быть или не быть.", R.drawable.x1x));
        list.add(new HomeViewModel("26 сентября", "Агрессия.", R.drawable.x2x));
        list.add(new HomeViewModel("23 сентября", "Четыре сезона.", R.drawable.x3x));
        list.add(new HomeViewModel("21 сентября", "Минимализм.", R.drawable.x4x));
        list.add(new HomeViewModel("17 сентября", "Без комментариев.", R.drawable.x5x));
        list.add(new HomeViewModel("16 сентября", "Баннер для созыва.", R.drawable.x6x));
        list.add(new HomeViewModel("13 сентября", "Форма хорошая.", R.drawable.x7x));
        list.add(new HomeViewModel("12 сентября", "Какой-нибудь текст", R.drawable.x8x));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}