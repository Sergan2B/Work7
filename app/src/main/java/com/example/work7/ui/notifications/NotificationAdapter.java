package com.example.work7.ui.notifications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.work7.R;

import java.util.ArrayList;


public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder> {

    private ArrayList<Integer> homeViewModels;

    public NotificationAdapter(ArrayList<Integer> homeViewModels) {
        this.homeViewModels = homeViewModels;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotificationViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationViewHolder holder, int position) {
        holder.onBind(homeViewModels.get(position));
    }

    @Override
    public int getItemCount() {
        return homeViewModels.size();
    }

    static class NotificationViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivImageHome;

        public NotificationViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImageHome = itemView.findViewById(R.id.imageViewNot);
        }

        public void onBind(Integer homeViewModel) {
            ivImageHome.setImageResource(homeViewModel);
            Glide.with(itemView).load(homeViewModel).centerCrop().into(ivImageHome);
        }
    }
}
