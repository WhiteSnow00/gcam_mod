import android.media.MediaFormat;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbp implements mbl
{
    public final List a;
    public final mbz b;
    private boolean c;
    private boolean d;
    private volatile niz e;
    private final Object f;
    private final ofn g;
    private final ofn h;
    private final ofn i;
    
    public mbp(final mbz b) {
        this.g = ofn.f();
        this.h = ofn.f();
        this.i = ofn.f();
        this.b = b;
        this.a = Collections.synchronizedList(new ArrayList<Object>());
        this.c = false;
        this.d = false;
        this.e = nii.a;
        this.f = new Object();
    }
    
    @Override
    public final oey a() {
        monitorenter(this);
        try {
            if (!this.d) {
                final oey n = ofi.n(true);
                monitorexit(this);
                return n;
            }
            if (!this.c) {
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    ((mbq)iterator.next()).e();
                }
            }
            this.c = true;
            final ofn f = ofn.f();
            ofi.w(this.b.b(), new mbo(f), odx.a);
            monitorexit(this);
            return f;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void b() {
        monitorenter(this);
        try {
            if (!this.d) {
                synchronized (this.f) {
                    this.g.o(null);
                    this.h.o(null);
                    monitorexit(this.f);
                    this.i.o(null);
                    this.b.c();
                    final Iterator iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        ((mbq)iterator.next()).c();
                    }
                    this.d = true;
                    return;
                }
            }
            throw new IllegalStateException("MediaEncoder already started.");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final mbr c(final MediaFormat mediaFormat) {
        final ofn f = ofn.f();
        final mbr mbr = new mbr(mediaFormat, this.b.a(mce.a(f)));
        final mbn mbn = new mbn(this, mediaFormat, f);
        synchronized (mbr.a) {
            mbr.b = new nit(mbn, mbr.b);
            return mbr;
        }
    }
}
