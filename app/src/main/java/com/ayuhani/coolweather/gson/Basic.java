package com.ayuhani.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wang on 2018/5/23.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
