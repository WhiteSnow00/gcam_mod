import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.content.Intent;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kak extends bje implements kal
{
    public kak(final IBinder binder) {
        super(binder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
    }
    
    @Override
    public final int e(final Intent intent, int int1, final int n) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)intent);
        a.writeInt(int1);
        a.writeInt(n);
        final Parcel y = this.y(5, a);
        int1 = y.readInt();
        y.recycle();
        return int1;
    }
    
    @Override
    public final IBinder f(final Intent intent) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)intent);
        final Parcel y = this.y(3, a);
        final IBinder strongBinder = y.readStrongBinder();
        y.recycle();
        return strongBinder;
    }
    
    @Override
    public final void g(final jwx jwx) {
        final Parcel a = this.a();
        bjg.e(a, (IInterface)jwx);
        this.z(1, a);
    }
    
    @Override
    public final void h() {
        this.z(2, this.a());
    }
    
    @Override
    public final void i(final Intent intent) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)intent);
        this.z(7, a);
    }
    
    @Override
    public final void j(final int n) {
        final Parcel a = this.a();
        a.writeInt(n);
        this.z(4, a);
    }
    
    @Override
    public final boolean k(final Intent intent) {
        final Parcel a = this.a();
        bjg.c(a, (Parcelable)intent);
        final Parcel y = this.y(6, a);
        final boolean f = bjg.f(y);
        y.recycle();
        return f;
    }
}
