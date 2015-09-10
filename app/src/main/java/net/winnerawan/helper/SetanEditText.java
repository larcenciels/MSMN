package net.winnerawan.helper;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by winnerawan on 09/09/15.
 */
public class SetanEditText extends EditText {

    public SetanEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public SetanEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SetanEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface font = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Light.ttf");
            setTypeface(font);
        }
    }

}

