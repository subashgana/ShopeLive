package info.androidhive.shopliv.other;

/**
 * Created by subash on 1/6/2018.
 */

import android.content.Context;
import android.graphics.Typeface;

 public class TypeFactory {

    private String A_BOLD= "Cocogoose.ttf";
    private String A_LIGHT="Cocogooselight.ttf";

    Typeface CocogooseBold;
    Typeface CocogooseLight;

    public TypeFactory(Context context){
        CocogooseBold = Typeface.createFromAsset(context.getAssets(),A_BOLD);
        CocogooseLight = Typeface.createFromAsset(context.getAssets(),A_LIGHT);
    }

}