package com.example.memegifgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import java.util.Random;
import java.util.ArrayList;
import android.widget.Button;
import android.view.View;

// The AndroidManifest.xml file must be within every applications root directory
// Its provides essential information about your app without the need  for the OS to read other files

public class MainActivity extends AppCompatActivity {

    WebView webView;
    Button button;

    Random r;

    String summaryStart, summaryEnd;
    int lastImage = 0, currentImage;

    ArrayList<String> animation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  // creates a saved instance of the app so when the data
        // of memory it saves the state so you don't lose it.
        setContentView(R.layout.activity_main);  // shows the layout on screen


        // Used to uniquely identify each object on view
        webView = findViewById(R.id.webView1);         // binds the xml view with Java using its ID.
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        button = (Button) findViewById(R.id.button);

        r = new Random();

        summaryStart = "<html><body><center><img width=\"100%\" src=\"file:///android_asset/";
        summaryEnd = "\"/></center></body></html>";


        // stores gif into an  ArrayList
        animation = new ArrayList<>();

        animation.add("image_1.gif");
        animation.add("image_2.gif");
        animation.add("image_3.gif");
        animation.add("image_4.gif");
        animation.add("image_5.gif");
        animation.add("image_6.gif");
        animation.add("image_7.gif");
        animation.add("image_8.gif");
        animation.add("image_9.gif");
        animation.add("image_10.gif");
        animation.add("image_11.gif");
        animation.add("image_12.gif");
        animation.add("image_13.gif");
        animation.add("image_14.gif");
        animation.add("image_15.gif");
        animation.add("image_16.gif");
        animation.add("image_17.gif");
        animation.add("image_18.gif");
        animation.add("image_19.gif");
        animation.add("image_20.gif");
        animation.add("image_21.gif");
        animation.add("image_22.gif");
        animation.add("image_23.gif");
        animation.add("image_24.gif");
        animation.add("image_25.gif");
        animation.add("image_26.gif");
        animation.add("image_27.gif");
        animation.add("image_28.gif");
        animation.add("image_29.gif");
        animation.add("image_30.gif");
        animation.add("image_31.gif");
        animation.add("image_32.gif");
        animation.add("image_33.gif");
        animation.add("image_34.gif");
        animation.add("image_35.gif");
        animation.add("image_36.gif");
        animation.add("image_37.gif");
        animation.add("image_38.gif");
        animation.add("image_39.gif");
        animation.add("image_40.gif");
        animation.add("image_41.gif");
        animation.add("image_42.gif");
        animation.add("image_43.gif");
        animation.add("image_44.gif");
        animation.add("image_45.gif");
        animation.add("image_46.gif");
        animation.add("image_47.gif");
        animation.add("image_48.gif");
        animation.add("image_49.gif");
        animation.add("image_50.gif");
        animation.add("image_51.gif");
        animation.add("image_52.gif");
        animation.add("image_53.gif");
        animation.add("image_54.gif");
        animation.add("image_55.gif");
        animation.add("image_56.gif");
        animation.add("image_57.gif");
        animation.add("image_58.gif");
        animation.add("image_59.gif");
        animation.add("image_60.gif");
        animation.add("image_61.gif");
        animation.add("image_62.gif");
        animation.add("image_63.gif");
        animation.add("image_64.gif");
        animation.add("image_65.gif");
        animation.add("image_66.gif");
        animation.add("image_67.gif");
        animation.add("image_68.gif");
        animation.add("image_69.gif");
        animation.add("image_70.gif");
        animation.add("image_71.gif");
        animation.add("image_72.gif");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // get random gif or jpeg

                    do {
                        currentImage = r.nextInt(animation.size());
                    }
                    while (lastImage == currentImage);
                    webView.loadDataWithBaseURL("file://android_assets",
                    summaryStart + animation.get(currentImage) + summaryEnd, "text/html",
                            "utf-8", null);

                    lastImage = currentImage;

            }
        });


    }
}
