import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;

// 
// Decompiled by Procyon v0.6.0
// 

final class mph
{
    private final moi a;
    
    public mph() {
        this.a = moi.b();
    }
    
    public final mpi a(final mny mny, final String s, final boolean b, mpd a) {
        final mpf mpf = new mpf(a, mny, s, b);
        final nja a2 = nja.a(s, "");
        final mpi mpi = (mpi)this.a.get(a2);
        Object o;
        if (mpi == null) {
            a = (mpd)mpf.a();
            final mpi mpi2 = (mpi)this.a.putIfAbsent(a2, a);
            if (mpi2 == null) {
                final Context e = mny.e;
                final mpi mpi3 = (mpi)a;
                mpy.c.putIfAbsent(a2, new mpe(mpi3));
                if (!mpy.b) {
                    synchronized (mpy.a) {
                        if (!mpy.b) {
                            e.registerReceiver((BroadcastReceiver)new mpy(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            mpy.b = true;
                        }
                    }
                }
                mpl.a.putIfAbsent(a2, new mpg(mpi3));
                o = a;
            }
            else {
                o = mpi2;
            }
        }
        else {
            o = mpi;
        }
        final mpi mpi4 = (mpi)o;
        final boolean h = mpi4.h;
        njo.i(true, "Package %s cannot be registered both with and without stickyAccountSupport", s);
        return mpi4;
    }
}
