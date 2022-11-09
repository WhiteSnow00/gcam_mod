import android.os.Parcel;
import java.util.concurrent.TimeUnit;
import java.util.ArrayDeque;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otm extends otn
{
    public static final Parcelable$Creator CREATOR;
    public static final ArrayDeque a;
    public static final Object b;
    public int c;
    public otr[] d;
    public boolean e;
    public otj f;
    public long g;
    public int h;
    public final otx[] i;
    
    static {
        a = new ArrayDeque();
        b = new Object();
        CREATOR = (Parcelable$Creator)new oti(4);
    }
    
    public otm() {
        this.d = new otr[16];
        this.f = new otj();
        this.i = new otx[16];
        for (int i = 0; i < 16; ++i) {
            this.d[i] = new otr();
            this.i[i] = new otx();
        }
        this.b();
    }
    
    public static long a() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }
    
    @Override
    public final void b() {
        super.b();
        this.c = 0;
        this.h = 0;
        this.e = false;
        this.g = 0L;
    }
    
    @Override
    public final void c(final Parcel parcel) {
        final int dataPosition = parcel.dataPosition() + parcel.readInt();
        super.c(parcel);
        final int dataPosition2 = parcel.dataPosition();
        final int n = 0;
        if (dataPosition2 < dataPosition) {
            otn.g(this.c = parcel.readInt());
            for (int i = 0; i < this.c; ++i) {
                this.d[i].a(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            final boolean e = parcel.readInt() != 0;
            this.e = e;
            if (e) {
                this.f.a(parcel);
            }
        }
        if (parcel.dataPosition() < dataPosition) {
            this.g = parcel.readLong();
        }
        if (parcel.dataPosition() < dataPosition) {
            otn.g(this.h = parcel.readInt());
            for (int j = n; j < this.h; ++j) {
                this.i[j].a(parcel);
            }
        }
        parcel.setDataPosition(dataPosition);
    }
    
    @Override
    public final void d() {
        this.b();
        synchronized (otm.b) {
            final ArrayDeque a = otm.a;
            if (!a.contains(this)) {
                a.add(this);
            }
        }
    }
    
    @Override
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final void e(final int e) {
        super.e(e);
        otn.f(e, this.c, this.d);
        otn.f(this.f.e = e, this.h, this.i);
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        int n2 = 24;
        final int n3 = 0;
        for (int i = 0; i < super.l; ++i) {
            final oth oth = super.m[i];
            n2 += 24;
        }
        for (int j = 0; j < super.n; ++j) {
            final otk otk = super.o[j];
            n2 += 20;
        }
        for (int k = 0; k < super.p; ++k) {
            final oto oto = super.q[k];
            n2 += 24;
        }
        for (int l = 0; l < super.r; ++l) {
            final otq otq = super.s[l];
            n2 += 28;
        }
        for (int n4 = 0; n4 < super.t; ++n4) {
            final otw otw = super.u[n4];
            n2 += 28;
        }
        int n5 = n2 + 8;
        for (int n6 = 0; n6 < this.c; ++n6) {
            final otr otr = this.d[n6];
            n5 += 24;
        }
        n5 += 4;
        int n7 = n5;
        if (this.e) {
            n7 = n5 + 20;
        }
        n7 += 12;
        for (int n8 = 0; n8 < this.h; ++n8) {
            final otx otx = this.i[n8];
            n7 += 20;
        }
        parcel.writeInt(n7);
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.c);
        for (int n9 = 0; n9 < this.c; ++n9) {
            this.d[n9].writeToParcel(parcel, n);
        }
        parcel.writeInt((int)(this.e ? 1 : 0));
        if (this.e) {
            this.f.writeToParcel(parcel, n);
        }
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        for (int n10 = n3; n10 < this.h; ++n10) {
            this.i[n10].writeToParcel(parcel, n);
        }
        if (parcel.dataPosition() - dataPosition == n7) {
            return;
        }
        throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
    }
}
