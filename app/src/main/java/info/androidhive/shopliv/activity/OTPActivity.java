package info.androidhive.shopliv.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import info.androidhive.shopliv.R;
import info.androidhive.shopliv.other.CustomButton;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;


@ContentView(R.layout.activity_otp)
public class OTPActivity  extends RoboActivity {


    @InjectView(R.id.btn_otp_next)
    CustomButton mBtnnext;

    @InjectView()
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mBtnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ChangePasswordActivity.class));
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);

            }
        });

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

}

