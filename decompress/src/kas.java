import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import android.os.IInterface;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kas implements jyy
{
    private final kaj a;
    
    public kas(final kaj a) {
        this.a = a;
    }
    
    public static keg c(final Context context, final Executor executor, final jza jza) {
        final kej kej = new kej();
        executor.execute(new kao(context, kej, executor, jza));
        return kej.a;
    }
    
    @Override
    public final keg a() {
        final kej kej = new kej();
        final kar kar = new kar(kej);
        try {
            final kaj a = this.a;
            final Parcel a2 = a.a();
            bjg.e(a2, (IInterface)kar);
            a.z(4, a2);
        }
        catch (final RemoteException ex) {
            kej.c(new jqq(new Status(8, njt.b((Throwable)ex))));
        }
        return kej.a;
    }
    
    @Override
    public final keg b() {
        final kej kej = new kej();
        final kaq kaq = new kaq(kej);
        try {
            final kaj a = this.a;
            final Parcel a2 = a.a();
            a2.writeInt(0);
            bjg.e(a2, (IInterface)kaq);
            a.z(3, a2);
        }
        catch (final RemoteException ex) {
            kej.c(new jqq(new Status(8, njt.b((Throwable)ex))));
        }
        return kej.a;
    }
}
