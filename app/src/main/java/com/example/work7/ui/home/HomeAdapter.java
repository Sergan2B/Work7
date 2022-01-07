package com.example.work7.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.work7.R;

import java.util.ArrayList;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {


    private ArrayList<HomeViewModel> homeViewModels;

    public HomeAdapter(ArrayList<HomeViewModel> homeViewModels) {
        this.homeViewModels = homeViewModels;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.onBind(homeViewModels.get(position));
    }

    @Override
    public int getItemCount() {
        return homeViewModels.size();
    }

    static class HomeViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDescription, tvData;
        private ImageView ivImageHome;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDescription = itemView.findViewById(R.id.text_home_description);
            tvData = itemView.findViewById(R.id.text_home_data);
            ivImageHome = itemView.findViewById(R.id.imageView);
        }

        public void onBind(HomeViewModel homeViewModel) {
            tvDescription.setText(homeViewModel.getTvDescription());
            tvData.setText(homeViewModel.getTvData());
            ivImageHome.setImageResource(homeViewModel.getIvImageHome());
        }
    }
}
