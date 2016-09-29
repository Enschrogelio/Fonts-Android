package www.ensch.fonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        TextView tv=(TextView)findViewById(R.id.letra);
        Typeface face=Typeface.createFromAsset(getAssets(), "fonts/fzerogplegendfont.ttf");
        tv.setTypeface(face);
        */
        }
}
