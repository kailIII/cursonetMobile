package net.develemento.cursonetMobile;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        
        super.loadUrl("file:///android_asset/www/index.html",6000);
    }
}
