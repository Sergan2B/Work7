package com.example.work7.ui.dashboard;

public class DashboardViewModel {
    public Integer getIvImage() {
        return ivImage;
    }

    public void setIvImage(Integer ivImage) {
        this.ivImage = ivImage;
    }

    private Integer ivImage;

    public DashboardViewModel(Integer ivImage) {
        this.ivImage = ivImage;
    }
}
