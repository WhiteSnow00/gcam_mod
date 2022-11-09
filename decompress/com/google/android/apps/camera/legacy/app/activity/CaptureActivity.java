// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.activity;

import android.content.pm.PackageInfo;
import android.content.Intent;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

public class CaptureActivity extends CameraActivity
{
    private static final nsd u;
    
    static {
        u = nsd.g("com/google/android/apps/camera/legacy/app/activity/CaptureActivity");
    }
    
    @Override
    protected final void onCreate(Bundle packageInfo) {
        super.onCreate(packageInfo);
        bmx.f(this.getIntent());
        final String callingPackage = this.getCallingPackage();
        final Intent intent = this.getIntent();
        int n = 0;
        int i = 0;
        intent.putExtra("include_location_in_exif", false);
        packageInfo = null;
        Label_0060: {
            if (callingPackage == null) {
                break Label_0060;
            }
            try {
                packageInfo = (Bundle)this.getPackageManager().getPackageInfo(callingPackage, 4096);
                break Label_0060;
                CaptureActivity.u.c().E(1255).o("getCallingPackage() returned null.");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                a.k(CaptureActivity.u.c(), "Unable to get PackageInfo for %s", callingPackage, '\u04ec');
            }
        }
        int n2;
        if (packageInfo != null && ((PackageInfo)packageInfo).requestedPermissions != null) {
            n = 0;
            n2 = 0;
            while (i < ((PackageInfo)packageInfo).requestedPermissions.length) {
                int n3 = n;
                if (((PackageInfo)packageInfo).requestedPermissions[i].equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    n3 = n;
                    if ((((PackageInfo)packageInfo).requestedPermissionsFlags[i] & 0x2) != 0x0) {
                        a.k(CaptureActivity.u.c(), "Coarse location is granted to %s", callingPackage, '\u04eb');
                        n3 = 1;
                    }
                }
                int n4 = n2;
                if (((PackageInfo)packageInfo).requestedPermissions[i].equals("android.permission.ACCESS_FINE_LOCATION")) {
                    n4 = n2;
                    if ((((PackageInfo)packageInfo).requestedPermissionsFlags[i] & 0x2) != 0x0) {
                        a.k(CaptureActivity.u.c(), "Fine location is granted to %s", callingPackage, '\u04ea');
                        n4 = 1;
                    }
                }
                ++i;
                n = n3;
                n2 = n4;
            }
        }
        else {
            n2 = 0;
        }
        if (n != 0 && n2 != 0) {
            a.l(CaptureActivity.u.c(), "Allowing location in intent", '\u04e9');
            this.getIntent().putExtra("include_location_in_exif", true);
            return;
        }
        a.k(CaptureActivity.u.c(), "Package %s doesn't have location permissions, location info won't be included in EXIF", callingPackage, '\u04e8');
    }
}
