import android.database.Cursor;
import android.app.ActivityManager;
import android.hardware.SensorManager;
import java.io.InputStream;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import java.io.IOException;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbr
{
    public static final fbq a;
    
    static {
        a = new fbq();
    }
    
    public static fbq a(Context path, Uri uri) {
        final ContentResolver contentResolver = ((Context)path).getContentResolver();
        final boolean equals = "content".equals(uri.getScheme());
        final int n = 1;
        final fbp fbp = null;
        Label_0115: {
            if (equals) {
                uri = (Uri)contentResolver.query(uri, new String[] { "_data" }, (String)null, (String[])null, (String)null);
                if (uri == null) {
                    path = null;
                    break Label_0115;
                }
                try {
                    final int columnIndexOrThrow = ((Cursor)uri).getColumnIndexOrThrow("_data");
                    if (!((Cursor)uri).moveToFirst()) {
                        ((Cursor)uri).close();
                        break Label_0115;
                    }
                    ((Cursor)uri).getString(columnIndexOrThrow);
                    break Label_0115;
                }
                finally {
                    ((Cursor)uri).close();
                }
            }
            path = uri.getPath();
        }
        if (path == null) {
            return fbr.a;
        }
        final InputStream a = fbo.a((String)path);
        fbp fbp2 = null;
        Label_0747: {
            if (a == null) {
                fbp2 = fbp;
            }
            else {
                uri = (Uri)lmx.m(a);
                try {
                    a.close();
                }
                catch (final IOException ex) {
                    a.k(fbp.a.b(), "Failed to close stream: %s", ex, '\u05f1');
                }
                boolean b;
                int a2;
                int a3;
                int a4;
                int a5;
                boolean b2;
                boolean b3;
                if (uri != null) {
                    try {
                        fbp.d((apf)uri, "FirstPhotoDate");
                        fbp.d((apf)uri, "LastPhotoDate");
                        fbp.a((apf)uri, "SourcePhotosCount");
                        if (((apf)uri).e("http://ns.google.com/photos/1.0/panorama/", "ProjectionType")) {
                            final String s = (String)((apu)uri).l("http://ns.google.com/photos/1.0/panorama/", "ProjectionType", 0);
                        }
                        b = fbp.b((apf)uri, "UsePanoramaViewer");
                        try {
                            a2 = fbp.a((apf)uri, "CroppedAreaImageWidthPixels");
                            try {
                                a3 = fbp.a((apf)uri, "CroppedAreaImageHeightPixels");
                                try {
                                    a4 = fbp.a((apf)uri, "FullPanoWidthPixels");
                                    try {
                                        a5 = fbp.a((apf)uri, "FullPanoHeightPixels");
                                        try {
                                            fbp.a((apf)uri, "CroppedAreaLeftPixels");
                                            fbp.a((apf)uri, "CroppedAreaTopPixels");
                                            fbp.a((apf)uri, "LargestValidInteriorRectLeft");
                                            fbp.a((apf)uri, "LargestValidInteriorRectTop");
                                            fbp.a((apf)uri, "LargestValidInteriorRectWidth");
                                            fbp.a((apf)uri, "LargestValidInteriorRectHeight");
                                            if (((apf)uri).e("http://ns.google.com/photos/1.0/panorama/", "IsPhotosphere")) {
                                                b2 = fbp.b((apf)uri, "IsPhotosphere");
                                            }
                                            else {
                                                b2 = fbp.b((apf)uri, "UsePanoramaViewer");
                                            }
                                            b3 = (a2 > 0 && a3 > 0 && a4 > 0 && a5 > 0);
                                        }
                                        catch (final ape ape) {}
                                    }
                                    catch (final ape ape2) {}
                                }
                                catch (final ape ape3) {}
                            }
                            catch (final ape ape4) {}
                        }
                        catch (final ape ape5) {}
                    }
                    catch (final ape ape6) {
                        b = false;
                    }
                    a2 = 0;
                    a3 = 0;
                    a4 = 0;
                    a5 = 0;
                    b3 = false;
                    b2 = false;
                }
                else {
                    b3 = false;
                    a2 = 0;
                    a3 = 0;
                    a4 = 0;
                    a5 = 0;
                    b = false;
                    b2 = false;
                }
                uri = (Uri)new BitmapFactory$Options();
                ((BitmapFactory$Options)uri).inJustDecodeBounds = true;
                final InputStream a6 = fbo.a((String)path);
                if (a6 == null) {
                    a.l(fbp.a.c(), "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata", '\u05f0');
                    fbp2 = fbp;
                }
                else {
                    BitmapFactory.decodeStream(a6, (Rect)null, (BitmapFactory$Options)uri);
                    try {
                        a6.close();
                    }
                    catch (final IOException ex2) {
                        a.k(fbp.a.b(), "Failed to close stream: %s", ex2, '\u05ef');
                    }
                    final int outWidth = ((BitmapFactory$Options)uri).outWidth;
                    final int outHeight = ((BitmapFactory$Options)uri).outHeight;
                    int n2;
                    if (!b3) {
                        if (outHeight + outHeight != outWidth) {
                            fbp2 = fbp;
                            break Label_0747;
                        }
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    final double n3 = outWidth;
                    final double n4 = outHeight;
                    Double.isNaN(n3);
                    Double.isNaN(n4);
                    final double n5 = n3 / n4;
                    final double n6 = a2;
                    final double n7 = a3;
                    Double.isNaN(n6);
                    Double.isNaN(n7);
                    final double n8 = n6 / n7;
                    if (n2 == 0 && !fbp.c(n5, n8, 0.001)) {
                        a.l(fbp.a.c(), "Pano metadata does not match file dimensions.", '\u05ed');
                        fbp2 = fbp;
                    }
                    else {
                        if (n2 == 0) {
                            final double n9 = a4;
                            final double n10 = a5;
                            Double.isNaN(n9);
                            Double.isNaN(n10);
                            if (!fbp.c(n9 / n10, 2.0, 0.1)) {
                                a.l(fbp.a.c(), "Pano metadata invalid: Full pano dimension not 2:1.", '\u05ec');
                                fbp2 = fbp;
                                break Label_0747;
                            }
                        }
                        if (n2 != 0) {
                            fbp2 = new fbp(outWidth, outHeight);
                        }
                        else {
                            fbp2 = new fbp(b, a2, a3, a4, a5, b2);
                        }
                    }
                }
            }
        }
        if (fbp2 == null) {
            return fbr.a;
        }
        return new fbq(fbp2);
    }
    
    public static boolean b(final cxl cxl, final SensorManager sensorManager, final ActivityManager activityManager) {
        return cxl.k(cyb.b) && sensorManager.getSensorList(4).size() > 0 && !c(activityManager);
    }
    
    public static boolean c(final ActivityManager activityManager) {
        try {
            return activityManager.isLowRamDevice();
        }
        catch (final NoSuchMethodError noSuchMethodError) {
            return false;
        }
    }
}
