package com.inonitylab.workwithdatabinding.models;

import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by csl on 1/19/17.
 */

public class UserClickHandler {
    public void onClickButton(View view){
        Log.d("UserClickHandler", "onClickButton:.... clicked ");
        if (view instanceof Button){
            int times = Integer.parseInt(view.getTag().toString());
            times +=1;
            ((Button) view).setText("Clicked "+times+" times");
            view.setTag(times);
        }
    }
}
