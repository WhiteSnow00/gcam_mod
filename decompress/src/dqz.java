import android.graphics.Bitmap;
import java.util.Map;
import java.util.Collections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqz implements hhz
{
    private static final nsd a;
    private final drs b;
    private final Set c;
    private final cyn d;
    private final hxg e;
    private final dqx f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gallery/processing/ProcessingSessionManagerListener");
    }
    
    public dqz(final hxg e, final drs b, final dqx f, final cyn d) {
        this.c = Collections.newSetFromMap((Map<Object, Boolean>)new ConcurrentHashMap());
        this.e = e;
        this.b = b;
        this.f = f;
        this.d = d;
    }
    
    private final void a(final him him) {
        this.c.add(him);
        if (!this.f.b(him).g()) {
            a.k(dqz.a.c(), "Refusing to remove %s from processingMediaManager because it is not present. It's likely the mediaStoreInsertion future was canceled", him, '\u0373');
            return;
        }
        this.f.d(him).close();
    }
    
    @Override
    public final void i(final him him) {
        this.a(him);
    }
    
    @Override
    public final void k(final him him) {
        this.a(him);
    }
    
    @Override
    public final void n(final him him, final krd krd) {
        if (this.c.contains(him)) {
            return;
        }
        final dqu dqu = (dqu)this.f.b(him).f();
        if (dqu == null) {
            a.k(dqz.a.c(), "#onSessionProgress update for neither completed nor queued shot %s", him, '\u036d');
            return;
        }
        dqu.d(krd);
    }
    
    @Override
    public final void o(final him him, final hih hih, final hip hip) {
        this.f.e(him, new dqu(hih));
        if (hip == hip.a) {
            drk drk = drk.a;
            final hio a = hio.a;
            switch (hih.c.ordinal()) {
                case 17: {
                    drk = drk.i;
                    break;
                }
                case 16: {
                    if (this.d.b(cyn.c)) {
                        drk = drk.j;
                        break;
                    }
                    drk = drk.h;
                    break;
                }
                case 13: {
                    drk = drk.g;
                    break;
                }
                case 12: {
                    drk = drk.f;
                    break;
                }
                case 10: {
                    drk = drk.e;
                    break;
                }
                case 6: {
                    drk = drk.c;
                    break;
                }
                case 5: {
                    drk = drk.b;
                    break;
                }
                case 4: {
                    drk = drk.d;
                    break;
                }
            }
            this.b.b(hih.a, drk);
        }
    }
    
    @Override
    public final void p(final him him) {
        if (this.c.contains(him)) {
            return;
        }
        final dqu dqu = (dqu)this.f.b(him).f();
        if (dqu == null) {
            a.k(dqz.a.c(), "#onSessionUpdated Update for neither completed nor queued shot %s", him, '\u0371');
            return;
        }
        final niz a = this.e.a(him);
        if (a.g()) {
            dqu.c((aza)a.c());
            return;
        }
        a.k(dqz.a.b(), "thumbnailDrawable not present for shot %s", him, '\u0370');
    }
    
    @Override
    public final void v(final him him) {
        this.a(him);
    }
}
