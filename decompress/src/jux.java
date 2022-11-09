import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jux extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public jpu[] i;
    public jpu[] j;
    public boolean k;
    public int l;
    public boolean m;
    public final String n;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(4);
    }
    
    public jux(final int a, final int b, final int c, final String d, final IBinder e, final Scope[] f, final Bundle g, Account h, final jpu[] i, final jpu[] j, final boolean k, final int l, final boolean m, final String n) {
        this.a = a;
        this.b = b;
        this.c = c;
        if ("com.google.android.gms".equals(d)) {
            this.d = "com.google.android.gms";
        }
        else {
            this.d = d;
        }
        if (a < 2) {
            h = null;
            Account h2 = null;
            Label_0192: {
                if (e != null) {
                    final IInterface queryLocalInterface = e.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    jvk jvk;
                    if (queryLocalInterface instanceof jvk) {
                        jvk = (jvk)queryLocalInterface;
                    }
                    else {
                        jvk = new jvk(e);
                    }
                    if (jvk != null) {
                        final long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            try {
                                final Parcel y = jvk.y(2, jvk.a());
                                final Account account = (Account)bjg.a(y, Account.CREATOR);
                                y.recycle();
                                Binder.restoreCallingIdentity(clearCallingIdentity);
                            }
                            finally {}
                        }
                        catch (final RemoteException ex) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            h2 = h;
                            break Label_0192;
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                    else {
                        h2 = h;
                    }
                }
                else {
                    h2 = h;
                }
            }
            this.h = h2;
        }
        else {
            this.e = e;
            this.h = h;
        }
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public jux(final int b, final String n) {
        this.a = 6;
        this.c = jpx.c;
        this.b = b;
        this.k = true;
        this.n = n;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        ul.a(this, parcel, n);
    }
}
