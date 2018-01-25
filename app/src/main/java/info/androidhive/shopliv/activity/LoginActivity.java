package info.androidhive.shopliv.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import info.androidhive.shopliv.R;
import info.androidhive.shopliv.other.CustomTextView;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_login)
public class LoginActivity extends RoboActivity {


    @InjectView(R.id.textView)
    CustomTextView mTVForgot;

    @InjectView(R.id.textView3)
    CustomTextView mTVRegister;
    @InjectView()
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTVForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ForotPasswordActvity.class));
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });


        mTVRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

    }

}
