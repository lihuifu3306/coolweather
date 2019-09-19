package com.example.coolweather.fastjson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String into;
    }
    public class CarWash {
        @SerializedName("txt")
        public String into;
    }
    public class Sport{
        @SerializedName("txt")
        public String into;
    }
}
