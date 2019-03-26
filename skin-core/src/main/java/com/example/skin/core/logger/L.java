package com.example.skin.core.logger;

import android.util.Log;

/**
 * @author allen
 * @date 2019/3/26
 */

public class L {

    private static final String TAG = "Skin-Core";


    public static void i(String msg) {
        Log.i(TAG, msg);
    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }


}
