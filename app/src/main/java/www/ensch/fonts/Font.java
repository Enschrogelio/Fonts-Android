package www.ensch.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by x on 9/25/2016.
 */

public class Font extends TextView {

    public Font(Context context, AttributeSet attrs){
    super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),
                "fonts/fzerogplegendfont.ttf"));

    }

}
