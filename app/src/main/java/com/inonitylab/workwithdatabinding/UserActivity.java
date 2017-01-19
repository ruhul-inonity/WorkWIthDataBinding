package com.inonitylab.workwithdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.inonitylab.workwithdatabinding.databinding.ActivityUserBinding;
import com.inonitylab.workwithdatabinding.models.ObservableUser;

public class UserActivity extends AppCompatActivity {

    public ObservableUser observableUser;
    private ActivityUserBinding userBinding;
    private static final String TAG = "UserActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        observableUser = new ObservableUser("Jack","Sparrow","java",100);
        userBinding = DataBindingUtil.setContentView(this,R.layout.activity_user);
       // setContentView(R.layout.activity_user);
        userBinding.setUser(observableUser);
    }

    public void UpdateUserData(View view){
        Log.d(TAG, ".............UpdateUserData: ");
        observableUser.setFirstName(userBinding.editTextFirstName.getText().toString());
        observableUser.setLastName(userBinding.editTextLastName.getText().toString());
        observableUser.setLanguage(userBinding.editTextLanguage.getText().toString());
        observableUser.setRating(Integer.valueOf(userBinding.editTextRating.getText().toString()));
    }
}
