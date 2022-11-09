// 
// Decompiled by Procyon v0.6.0
// 

package com;

import android.content.Context;
import android.app.Application;
import android.preference.PreferenceManager;
import android.app.AppGlobals;

public class ctgcam
{
    public static int MenuValue(final String s) {
        final Application initialApplication = AppGlobals.getInitialApplication();
        final Context applicationContext = ((Context)initialApplication).createPackageContext(initialApplication.getPackageName(), 1).getApplicationContext();
        int n;
        if ((n = (PreferenceManager.getDefaultSharedPreferences(applicationContext).contains(s) ? 1 : 0)) != 0) {
            n = Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(applicationContext).getString(s, (String)null));
        }
        return n;
    }
    
    public static String getHdrModel() {
        final int menuValue = MenuValue("pref_model_back_key");
        if (menuValue != 3) {
            if (menuValue == 4) {
                return "walleye";
            }
            if (menuValue == 5) {
                return "taimen";
            }
            if (menuValue == 6) {
                return "blueline";
            }
            if (menuValue == 7) {
                return "crosshatch";
            }
            if (menuValue == 8) {
                return "sargo";
            }
            if (menuValue == 9) {
                return "bonito";
            }
            if (menuValue == 10) {
                return "flame";
            }
            if (menuValue == 11) {
                return "coral";
            }
            if (menuValue == 12) {
                return "sunfish";
            }
            if (menuValue == 13) {
                return "bramble";
            }
            if (menuValue == 14) {
                return "redfin";
            }
        }
        return "marlin";
    }
}
