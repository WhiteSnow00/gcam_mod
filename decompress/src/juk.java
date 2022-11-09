import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class juk extends jue
{
    public final IBinder g;
    final /* synthetic */ jum h;
    
    public juk(final jum h, final int n, final IBinder g, final Bundle bundle) {
        this.h = h;
        super(h, n, bundle);
        this.g = g;
    }
    
    @Override
    protected final void a(final jps jps) {
        final juz q = this.h.q;
        if (q != null) {
            q.a(jps);
        }
        System.currentTimeMillis();
    }
    
    @Override
    protected final boolean c() {
        try {
            final IBinder g = this.g;
            jvu.a(g);
            final String interfaceDescriptor = g.getInterfaceDescriptor();
            if (!this.h.d().equals(interfaceDescriptor)) {
                final String d = this.h.d();
                final StringBuilder sb = new StringBuilder(d.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(d);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            final IInterface c = this.h.c(this.g);
            if (c != null && (this.h.A(2, 4, c) || this.h.A(3, 4, c))) {
                final jum h = this.h;
                h.l = null;
                final juy p = h.p;
                if (p != null) {
                    p.a.b();
                }
                return true;
            }
            return false;
        }
        catch (final RemoteException ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
