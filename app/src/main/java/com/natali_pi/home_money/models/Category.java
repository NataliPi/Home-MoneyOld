package com.natali_pi.home_money.models;

import com.natali_pi.home_money.utils.App;

/**
 * Created by Natali-Pi on 24.11.2017.
 */

public class Category {
    private String id;
    private String photo;
    private String name;

    public Category(String filliner) {
        this.name = filliner;
    }
public boolean isStandard(){
        return id.equals(name);
}
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPhoto() {
        if (photo != null && !photo.equals("")) {
            return App.BASE_URL + App.PICTURE_URL + photo;
        } else {
            return null;
        }
    }

    public String getName() {
        return name;
    }
}
