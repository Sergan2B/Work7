package com.example.work7.ui.home;

public class HomeViewModel {
    private String tvDescription, tvData;

    public String getTvDescription() {
        return tvDescription;
    }

    public String getTvData() {
        return tvData;
    }

    public int getIvImageHome() {
        return ivImageHome;
    }

    private int ivImageHome;

    public HomeViewModel(String tvDescription, String tvData, int ivImageHome) {
        this.tvDescription = tvDescription;
        this.tvData = tvData;
        this.ivImageHome = ivImageHome;
    }
}
