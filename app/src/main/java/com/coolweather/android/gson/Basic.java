package com.coolweather.android.gson;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/11.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;      //对应城市名

    @SerializedName("id")
    public String weatherId;     //对应城市天气id

    public Update update;

    public class Update{
         @SerializedName("loc")
         public String updateTime; //对应城市天气更新时间
    }
}

