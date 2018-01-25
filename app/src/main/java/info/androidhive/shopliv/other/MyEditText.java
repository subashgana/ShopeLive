package info.androidhive.shopliv.other;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

import info.androidhive.shopliv.R;

/**
 * Created by subash on 1/9/2018.
 */

public class MyEditText extends EditText {

    private int typefaceType;
    private TypeFactory mFontFactory;

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context, attrs);
    }

    public MyEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context, attrs);
    }

    public MyEditText(Context context) {
        super(context);
    }

    private void applyCustomFont(Context context, AttributeSet attrs) {


        TypedArray array = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomTextView,
                0, 0);
        try {
            typefaceType = array.getInteger(R.styleable.CustomTextView_font_name, 0);
        } finally {
            array.recycle();
        }
        if (!isInEditMode()) {
            setTypeface(getTypeFace(typefaceType));
        }

    }

    public Typeface getTypeFace(int type) {
        if (mFontFactory == null)
            mFontFactory = new TypeFactory(getContext());

        switch (type) {
            case CustomTextView.Constants.A_BOLD:
                return mFontFactory.CocogooseBold;

            case CustomTextView.Constants.A_LIGHT:
                return mFontFactory.CocogooseLight;


            default:
                return mFontFactory.CocogooseBold;
        }
    }

    public interface Constants {
        int A_BOLD = 1,
                A_LIGHT = 2,
                A_REGULAR = 3,
                O_LIGHT = 4,
                O_REGULAR=5;
    }


}
