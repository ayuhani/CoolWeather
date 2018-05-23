package com.ayuhani.coolweather.gson;

/**
 * Created by wang on 2018/5/23.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
