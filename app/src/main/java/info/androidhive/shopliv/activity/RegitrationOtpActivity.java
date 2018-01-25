package info.androidhive.shopliv.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import info.androidhive.shopliv.R;
import info.androidhive.shopliv.other.CustomButton;
import info.androidhive.shopliv.other.CustomTextView;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_regitration_otp)
public class RegitrationOtpActivity extends RoboActivity {




    @InjectView(R.id.btn_reg_otp_next)
    CustomButton mBtnNext;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                finish();
            }
        });


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

}
