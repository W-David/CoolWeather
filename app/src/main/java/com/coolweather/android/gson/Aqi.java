package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Aqi {
    public AqiCity city;
    public class AqiCity{
        public String aqi;
        public String pm25;
    }
}
