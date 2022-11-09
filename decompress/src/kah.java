import android.app.job.JobParameters;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.content.Intent;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kah extends bje implements kai
{
    public kah(final IBinder binder) {
        super(binder, "com.google.android.gms.learning.internal.training.IInAppJobService");
    }
    
    @Override
    public final int e(final Intent intent, int int1, final int n) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)intent);
        a.writeInt(int1);
        a.writeInt(n);
        final Parcel y = this.y(4, a);
        int1 = y.readInt();
        y.recycle();
        return int1;
    }
    
    @Override
    public final void f() {
        this.z(2, this.a());
    }
    
    @Override
    public final void g(final Intent intent) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)intent);
        this.z(6, a);
    }
    
    @Override
    public final void h(final int n) {
        final Parcel a = this.a();
        a.writeInt(n);
        this.z(3, a);
    }
    
    @Override
    public final boolean i(final jwx jwx, final jwx jwx2) {
        final Parcel a = this.a();
        bjg.e(a, (IInterface)jwx);
        bjg.e(a, (IInterface)jwx2);
        final Parcel y = this.y(9, a);
        final boolean f = bjg.f(y);
        y.recycle();
        return f;
    }
    
    @Override
    public final boolean j(final JobParameters jobParameters) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)jobParameters);
        final Parcel y = this.y(7, a);
        final boolean f = bjg.f(y);
        y.recycle();
        return f;
    }
    
    @Override
    public final boolean k(final JobParameters jobParameters) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)jobParameters);
        final Parcel y = this.y(8, a);
        final boolean f = bjg.f(y);
        y.recycle();
        return f;
    }
    
    @Override
    public final boolean l(final Intent intent) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)intent);
        final Parcel y = this.y(5, a);
        final boolean f = bjg.f(y);
        y.recycle();
        return f;
    }
}
