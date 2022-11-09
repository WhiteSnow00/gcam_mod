import android.os.Parcel;
import java.util.ArrayDeque;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class otn implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final ArrayDeque j;
    public static final Object k;
    public int l;
    public oth[] m;
    public int n;
    public otk[] o;
    public int p;
    public oto[] q;
    public int r;
    public otq[] s;
    public int t;
    public otw[] u;
    
    static {
        j = new ArrayDeque();
        k = new Object();
        CREATOR = (Parcelable$Creator)new oti(3);
    }
    
    public otn() {
        this.m = new oth[16];
        this.o = new otk[16];
        this.q = new oto[16];
        this.s = new otq[16];
        this.u = new otw[16];
        for (int i = 0; i < 16; ++i) {
            this.m[i] = new oth();
            this.o[i] = new otk();
            this.q[i] = new oto();
            this.s[i] = new otq();
            this.u[i] = new otw();
        }
        this.b();
    }
    
    static void f(final int e, final int n, final otl[] array) {
        for (int i = 0; i < n; ++i) {
            array[i].e = e;
        }
    }
    
    protected static final void g(final int n) {
        if (n >= 0 && n < 16) {
            return;
        }
        final StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid event count: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void b() {
        this.l = 0;
        this.n = 0;
        this.p = 0;
        this.r = 0;
        this.t = 0;
    }
    
    public void c(final Parcel parcel) {
        parcel.readInt();
        g(this.l = parcel.readInt());
        final int n = 0;
        for (int i = 0; i < this.l; ++i) {
            this.m[i].a(parcel);
        }
        g(this.n = parcel.readInt());
        for (int j = 0; j < this.n; ++j) {
            this.o[j].a(parcel);
        }
        g(this.p = parcel.readInt());
        for (int k = 0; k < this.p; ++k) {
            this.q[k].a(parcel);
        }
        g(this.r = parcel.readInt());
        for (int l = 0; l < this.r; ++l) {
            this.s[l].a(parcel);
        }
        g(this.t = parcel.readInt());
        for (int n2 = n; n2 < this.t; ++n2) {
            this.u[n2].a(parcel);
        }
    }
    
    public void d() {
        this.b();
        synchronized (otn.k) {
            final ArrayDeque j = otn.j;
            if (!j.contains(this)) {
                j.add(this);
            }
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void e(final int n) {
        f(n, this.l, this.m);
        f(n, this.n, this.o);
        f(n, this.p, this.q);
        f(n, this.r, this.s);
        f(n, this.t, this.u);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(1);
        parcel.writeInt(this.l);
        final int n2 = 0;
        for (int i = 0; i < this.l; ++i) {
            this.m[i].writeToParcel(parcel, n);
        }
        parcel.writeInt(this.n);
        for (int j = 0; j < this.n; ++j) {
            this.o[j].writeToParcel(parcel, n);
        }
        parcel.writeInt(this.p);
        for (int k = 0; k < this.p; ++k) {
            this.q[k].writeToParcel(parcel, n);
        }
        parcel.writeInt(this.r);
        for (int l = 0; l < this.r; ++l) {
            this.s[l].writeToParcel(parcel, n);
        }
        parcel.writeInt(this.t);
        for (int n3 = n2; n3 < this.t; ++n3) {
            this.u[n3].writeToParcel(parcel, n);
        }
    }
}
