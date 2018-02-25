package com.march4ourlives.alexcamai.march_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.Gallery;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    LinearLayout mLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a LinearLayout in which to add the ImageView
        mLinearLayout = new LinearLayout(this);

        // Instantiate an ImageView and define its properties
        ImageView i = new ImageView(this);
        i.setImageResource(R.drawable.march_official);

        // set the ImageView bounds to match the Drawable's dimensions
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new Gallery.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT));

        // Add the ImageView to the layout and set the layout as the content view
        mLinearLayout.addView(i);
        setContentView(mLinearLayout);
    }


}