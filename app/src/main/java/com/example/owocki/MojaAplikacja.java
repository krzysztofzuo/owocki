package com.example.owocki;

import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;

public class MojaAplikacja extends Application {
    public static String[] NAME;
    public static TypedArray IMAGE;
    public static String[] DESCRIPTION;
    public static int SIZE;

    @Override
    public void onCreate() {
        super.onCreate();

        //Pobranie danych z xml-a
        Resources resources = getResources();
        NAME = resources.getStringArray(R.array.names);
        IMAGE = resources.obtainTypedArray(R.array.pictures);
        DESCRIPTION = resources.getStringArray(R.array.descriptions);

        //Czy rozmiary tablic się zgadzają
        int size0 = NAME.length;
        int size1 = IMAGE.length();
        int size2 = DESCRIPTION.length;

        if (size0 == size1 && size1 == size2) SIZE = size0;
        else SIZE = 0;
    }
}
