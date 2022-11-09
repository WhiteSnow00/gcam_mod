import java.util.Iterator;
import java.util.Collection;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class bgf extends BroadcastReceiver
{
    final /* synthetic */ bgg a;
    
    public bgf(final bgg a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final bgg a = this.a;
        final boolean a2 = a.a;
        a.a = bgg.a(context);
        final bgg a3 = this.a;
        final boolean a4 = a3.a;
        if (a2 != a4) {
            final auy b = a3.b;
            if (a4) {
                synchronized (b.b) {
                    final bgq a5 = b.a;
                    for (final bhj bhj : biv.g(a5.a)) {
                        if (!bhj.l() && !bhj.k()) {
                            bhj.c();
                            if (!a5.c) {
                                bhj.b();
                            }
                            else {
                                a5.b.add(bhj);
                            }
                        }
                    }
                }
            }
        }
    }
}
