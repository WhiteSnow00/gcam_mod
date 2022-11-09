import android.os.Handler;
import java.util.Iterator;
import android.database.Cursor;
import android.net.Uri;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.os.Build;
import android.os.AsyncTask;

// 
// Decompiled by Procyon v0.6.0
// 

final class lpb extends AsyncTask
{
    final /* synthetic */ lpc a;
    private int b;
    private int c;
    
    public lpb(final lpc a) {
        this.a = a;
    }
    
    private final int b(final String s) {
        if (lpc.c.contains(Build.MANUFACTURER)) {
            final lpc a = this.a;
            try {
                if (a.e.getApplicationInfo("com.google.android.googlequicksearchbox", 0).enabled) {
                    return 2;
                }
            }
            catch (final PackageManager$NameNotFoundException ex) {
                Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
            }
            return 3;
        }
        Cursor query = null;
        Label_0251: {
            try {
                try {
                    query = this.a.d.getContentResolver().query(Uri.parse(s), (String[])null, (String)null, (String[])null, (String)null);
                    if (query != null) {
                        try {
                            if (query.getCount() != 0) {
                                if (!query.moveToFirst()) {
                                    query.close();
                                    return 16;
                                }
                                if (query.getType(0) != 3) {
                                    query.close();
                                    return 17;
                                }
                                try {
                                    int int1;
                                    if ((int1 = Integer.parseInt(query.getString(0))) > 12) {
                                        int1 = 12;
                                    }
                                    if (lpy.a(int1) == 0) {
                                        query.close();
                                        return 14;
                                    }
                                    final int a2 = lpy.a(int1);
                                    query.close();
                                    return a2;
                                }
                                catch (final NumberFormatException ex2) {
                                    Log.e("LensSdkParamsReader", "Unable to parse Lens version code value.", (Throwable)ex2);
                                    query.close();
                                    return 18;
                                }
                            }
                        }
                        finally {
                            break Label_0251;
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                    return 6;
                }
                finally {}
            }
            catch (final Exception ex3) {
                Log.e("LensSdkParamsReader", "Failed to start Lens due to unexpected exception.", (Throwable)ex3);
                return 6;
            }
            query = null;
        }
        if (query != null) {
            query.close();
        }
    }
    
    public final void a(int a, final int n) {
        if (a == 0) {
            throw null;
        }
        if (n != 0) {
            final lpc a2 = this.a;
            final lpz g = a2.g;
            final okt okt = (okt)g.H(5);
            okt.o(g);
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final lpz lpz = (lpz)okt.b;
            final lpz f = lpz.f;
            lpz.d = a - 2;
            a = (lpz.a | 0x4);
            lpz.a = a;
            lpz.e = n - 2;
            lpz.a = (a | 0x8);
            a2.g = (lpz)okt.h();
            final lpc a3 = this.a;
            a3.h = true;
            final Iterator iterator = a3.f.iterator();
            while (iterator.hasNext()) {
                ((loz)iterator.next()).a(this.a.g);
            }
            this.a.f.clear();
            return;
        }
        throw null;
    }
    
    protected final void onPreExecute() {
        new Handler(this.a.d.getMainLooper()).postDelayed((Runnable)new lpa(this), 4000L);
    }
}
