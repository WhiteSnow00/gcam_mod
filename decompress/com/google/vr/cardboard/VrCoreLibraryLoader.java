// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import android.os.Parcel;
import android.os.IBinder;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.os.RemoteException;
import android.os.IInterface;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import android.util.Log;
import android.content.Context;

public class VrCoreLibraryLoader
{
    public static long loadNativeDlsymMethod(final Context context) {
        return 0L;
    }
    
    public static long loadNativeGvrLibrary(final Context context) {
        return loadNativeGvrLibrary(context, osw.b, osw.a);
    }
    
    public static long loadNativeGvrLibrary(final Context ex, final osw osw, final osw osw2) {
        try {
            try {
                final ApplicationInfo applicationInfo = ((Context)ex).getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                if (applicationInfo == null) {
                    throw new otd(8);
                }
                if (!applicationInfo.enabled) {
                    throw new otd(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new otd(4);
                }
                final String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new otd(4);
                }
                final String substring = string.substring(1);
                final osw a = osw.a(substring);
                if (a == null) {
                    throw new otd(4);
                }
                final int c = a.c;
                final int c2 = osw.c;
                Label_0151: {
                    if (c <= c2) {
                        if (c >= c2) {
                            final int d = a.d;
                            final int d2 = osw.d;
                            if (d > d2) {
                                break Label_0151;
                            }
                            if (d >= d2) {
                                final int e = a.e;
                                final int e2 = osw.e;
                                if (e > e2 || e >= e2) {
                                    break Label_0151;
                                }
                            }
                        }
                        Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", substring, osw.toString()));
                        throw new otd(4);
                    }
                }
                final Context x = pjf.x((Context)ex);
                pjf.x((Context)ex);
                final int a2 = pjf.a;
                final oud b = pjf.b;
                final bje bje = null;
                if (b == null) {
                    final IBinder y = pjf.y(pjf.x((Context)ex).getClassLoader());
                    oud b2;
                    if (y == null) {
                        b2 = null;
                    }
                    else {
                        final IInterface queryLocalInterface = y.queryLocalInterface("com.google.vr.vrcore.library.api.IVrCreator");
                        if (queryLocalInterface instanceof oud) {
                            b2 = (oud)queryLocalInterface;
                        }
                        else {
                            b2 = new oud(y);
                        }
                    }
                    pjf.b = b2;
                }
                final oud b3 = pjf.b;
                final bjf b4 = ObjectWrapper.b(x);
                final bjf b5 = ObjectWrapper.b(ex);
                final Parcel a3 = b3.a();
                bjg.e(a3, (IInterface)b4);
                bjg.e(a3, (IInterface)b5);
                final Parcel y2 = b3.y(4, a3);
                final IBinder strongBinder = y2.readStrongBinder();
                bje bje2;
                if (strongBinder == null) {
                    bje2 = bje;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
                    if (queryLocalInterface2 instanceof oue) {
                        bje2 = (oue)queryLocalInterface2;
                    }
                    else {
                        bje2 = new oue(strongBinder);
                    }
                }
                y2.recycle();
                if (bje2 == null) {
                    Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                    return 0L;
                }
                if (a2 < 19) {
                    final int c3 = osw2.c;
                    final int d3 = osw2.d;
                    final int e3 = osw2.e;
                    final Parcel a4 = bje2.a();
                    a4.writeInt(c3);
                    a4.writeInt(d3);
                    a4.writeInt(e3);
                    final Parcel y3 = bje2.y(2, a4);
                    final long long1 = y3.readLong();
                    y3.recycle();
                    return long1;
                }
                final String string2 = osw.toString();
                final String string3 = osw2.toString();
                final Parcel a5 = bje2.a();
                a5.writeString(string2);
                a5.writeString(string3);
                final Parcel y4 = bje2.y(5, a5);
                final long long2 = y4.readLong();
                y4.recycle();
                return long2;
            }
            catch (final RemoteException ex) {}
            catch (final UnsatisfiedLinkError ex) {}
            catch (final SecurityException ex) {}
            catch (final IllegalStateException ex) {}
            catch (final IllegalArgumentException ex) {}
            catch (final otd ex) {}
        }
        catch (final PackageManager$NameNotFoundException ex2) {
            throw new otd(VrCoreUtils.a((Context)ex));
        }
        final String value = String.valueOf(ex);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 49);
        sb.append("Failed to load native GVR library from VrCore:\n  ");
        sb.append(value);
        Log.e("VrCoreLibraryLoader", sb.toString());
        return 0L;
    }
}
