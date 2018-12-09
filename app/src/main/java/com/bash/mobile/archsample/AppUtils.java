package com.bash.mobile.archsample;

import android.util.Log;

public class AppUtils {
    public static void writeErrorLog(String tag,String message) {
        try {
            Log.e(tag,message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeDebugLog(String tag, String message) {
        try {
            Log.d(tag,message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
