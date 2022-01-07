package com.example.work7.ui.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.work7.R;

import java.util.ArrayList;


public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder> {


    private ArrayList<DashboardViewModel> homeViewModels;

    public DashboardAdapter(ArrayList<DashboardViewModel> homeViewModels) {
        this.homeViewModels = homeViewModels;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DashboardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {
        holder.onBind(homeViewModels.get(position));
    }

    @Override
    public int getItemCount() {
        return homeViewModels.size();
    }

    static class DashboardViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivImageDashboard;

        public DashboardViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImageDashboard = itemView.findViewById(R.id.image_dashboard);
        }

        public void onBind(DashboardViewModel homeViewModel) {
            ivImageDashboard.setImageResource(homeViewModel.getIvImage());
        }
    }
}
