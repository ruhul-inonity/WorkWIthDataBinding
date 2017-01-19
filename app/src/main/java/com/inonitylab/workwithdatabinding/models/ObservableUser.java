package com.inonitylab.workwithdatabinding.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.inonitylab.workwithdatabinding.BR;

/**
 * Created by csl on 1/19/17.
 */

public class ObservableUser extends BaseObservable {

    private String firstName;
    private String lastName;
    private String language;
    private int rating;


    public ObservableUser(String firstName, String lastName, String language, int rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
        this.rating = rating;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
        notifyPropertyChanged(BR.language);
    }

    @Bindable
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        notifyPropertyChanged(BR.rating);
    }
}
