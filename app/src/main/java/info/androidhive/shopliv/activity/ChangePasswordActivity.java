package info.androidhive.shopliv.activity;

import android.os.Bundle;

import info.androidhive.shopliv.R;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;


@ContentView(R.layout.activity_change_password)
public class ChangePasswordActivity extends RoboActivity {



    @InjectView()
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

}
