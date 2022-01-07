package com.example.work7.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.work7.R;
import com.example.work7.databinding.FragmentDashboardBinding;
import com.example.work7.ui.home.HomeAdapter;
import com.example.work7.ui.home.HomeViewModel;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private DashboardAdapter homeAdapter;
    private ArrayList<DashboardViewModel> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        homeAdapter = new DashboardAdapter(list);
        binding.recDashboard.setAdapter(homeAdapter);
    }
    private void loadData() {
        list.add(new DashboardViewModel(R.drawable.x1x));
        list.add(new DashboardViewModel(R.drawable.x3x));
        list.add(new DashboardViewModel(R.drawable.x5x));
        list.add(new DashboardViewModel(R.drawable.x7x));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}