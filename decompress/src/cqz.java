import android.os.ParcelFileDescriptor;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqz
{
    public final jdv a;
    public final hif b;
    private final Executor c;
    private final kse d;
    
    public cqz(final jdv a, final hif b, final kse d) {
        this.c = mcn.h("VidFile");
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final cgr a(final ParcelFileDescriptor parcelFileDescriptor) {
        synchronized (this) {
            return new cgj(parcelFileDescriptor);
        }
    }
    
    public final cgr b(final llk llk) {
        synchronized (this) {
            final hie a = this.b.a(System.currentTimeMillis(), drk.a, null);
            return new cgm(a, a.a(llk.j), this.c, this.d);
        }
    }
}
