// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.base.api;

import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.List;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInstaller$SessionInfo;
import android.util.Log;
import android.content.pm.Signature;
import android.content.Context;

public final class VrCoreUtils
{
    public static int a(final Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            return 0;
        }
        try {
            if (context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 0).enabled) {
                final PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
                if (!otc.a(packageInfo, otc.a)) {
                    boolean b;
                    if (pjf.c != null) {
                        b = pjf.c;
                    }
                    else {
                        b = pjf.z(context);
                    }
                    if (!b || !otc.a(packageInfo, otc.b)) {
                        return 9;
                    }
                }
                return 0;
            }
            return 2;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            List allSessions;
            try {
                allSessions = context.getPackageManager().getPackageInstaller().getAllSessions();
            }
            catch (final RuntimeException ex2) {
                final String value = String.valueOf(ex2);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 45);
                sb.append("Failure querying package installer sessions: ");
                sb.append(value);
                Log.w("VrCoreUtils", sb.toString());
                allSessions = null;
            }
            if (allSessions != null) {
                final Iterator iterator = allSessions.iterator();
                while (iterator.hasNext()) {
                    if ("com.google.vr.vrcore".equals(((PackageInstaller$SessionInfo)iterator.next()).getAppPackageName())) {
                        return 3;
                    }
                }
            }
            final PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.getApplicationInfo("com.google.vr.vrcore", 8192).enabled) {
                    return 3;
                }
            }
            catch (final PackageManager$NameNotFoundException ex3) {}
            return 1;
        }
    }
    
    public static int getVrCoreClientApiVersion(final Context context) {
        try {
            final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (applicationInfo.enabled) {
                final Bundle metaData = applicationInfo.metaData;
                int int1 = 0;
                if (metaData != null) {
                    int1 = applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
                }
                return int1;
            }
            throw new otd(2);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new otd(a(context));
        }
    }
}
