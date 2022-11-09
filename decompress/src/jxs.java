import android.os.Parcel;
import java.util.ArrayList;
import android.graphics.Bitmap;
import java.util.List;
import com.google.android.gms.common.data.BitmapTeleporter;
import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxs extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public Bundle b;
    public String c;
    public final ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public jxw j;
    public jxv k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    long p;
    
    static {
        CREATOR = (Parcelable$Creator)new jxt();
    }
    
    public jxs(final String a, Bundle b, final String c, final ApplicationErrorReport applicationErrorReport, final String e, final BitmapTeleporter f, final String g, List h, final boolean i, final jxw j, final jxv k, final boolean l, final Bitmap m, final String n, final boolean o, final long p16) {
        this.a = a;
        if (b == null) {
            b = new Bundle();
        }
        this.b = b;
        this.c = c;
        ApplicationErrorReport d;
        if (applicationErrorReport != null) {
            d = applicationErrorReport;
        }
        else {
            d = new ApplicationErrorReport();
        }
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (h == null) {
            h = new ArrayList();
        }
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p16;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        jxt.a(this, parcel, n);
    }
}
