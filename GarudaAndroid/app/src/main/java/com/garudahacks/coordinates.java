package com.garudahacks;

import com.google.firebase.database.IgnoreExtraProperties;

public class coordinates {
    //@IgnoreExtraProperties
    public double lat;
    public double longi;
    public String key;

    public coordinates() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public coordinates(double lat, double longi, String key) {
        this.lat = lat;
        this.longi = longi;
        this.key = key;
    }
    
    public double getLat(){
        return lat;
    }

    public double getLongi(){
        return longi;
    }

    public String getKey(){
        return key;
    }

    public void setLat(double a){
        lat = a;
    }

    public void setLongi(double o){
        longi = o;
    }

    public void setKey(String e){
        key = e;
    }
}
