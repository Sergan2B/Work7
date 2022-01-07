package com.example.work7.ui.notifications;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.work7.R;
import com.example.work7.databinding.FragmentNotificationDownBinding;

import java.util.ArrayList;

public class FragmentNotificationUp extends Fragment {

    ArrayList<Integer> list = new ArrayList<>();
    FragmentNotificationDownBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentNotificationDownBinding.inflate(inflater, container, false);
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        NotificationAdapter notificationAdapter = new NotificationAdapter(list);
        binding.rvDown.setAdapter(notificationAdapter);
    }

    private void loadData() {
        list.add(R.drawable.x3x);
        list.add(R.drawable.x2x);
        list.add(R.drawable.x1x);
        list.add(R.drawable.x6x);
        list.add(R.drawable.x5x);
        list.add(R.drawable.x4x);
        list.add(R.drawable.x8x);
        list.add(R.drawable.x7x);
    }
}