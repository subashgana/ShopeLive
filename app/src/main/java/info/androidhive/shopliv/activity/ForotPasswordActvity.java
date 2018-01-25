package info.androidhive.shopliv.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import info.androidhive.shopliv.R;
import info.androidhive.shopliv.other.CustomButton;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_forot_password_actvity)
public class ForotPasswordActvity extends RoboActivity {

    @InjectView(R.id.btn_fpa_next)
    CustomButton mBtnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBtnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), OTPActivity.class));
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
