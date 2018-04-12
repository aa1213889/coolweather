package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/11.
 */

public class AQI {
    @SerializedName("city")
    public AQICity aqiCity;

    public  class  AQICity{

        public String aqi;
//"aqi":{"city":{"aqi":"26","pm25":"11","qlty":"优"}}

        public String pm25;
    }
}
