import com.google.android.apps.camera.brella.mediastore.MediaListeningService;
import java.util.concurrent.Executor;
import android.content.Context;
import com.google.android.apps.camera.brella.examplestore.beholder.BeholderExampleStoreDataTtlService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzx extends cac implements ewc
{
    public static final nsd a;
    public final Integer b;
    public final BeholderExampleStoreDataTtlService c;
    public boolean d;
    public int e;
    private final cxl j;
    private final jqt k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/inapptrainer/BrellaInAppTrainerImpl");
    }
    
    public bzx(final Context context, final Executor executor, final cxl j, final jqt k, final klv klv, final kjm kjm, final ewy ewy, final String s, final BeholderExampleStoreDataTtlService c) {
        super(context, executor, kjm, ewy, s);
        this.j = j;
        this.k = k;
        this.b = (Integer)klv.aQ();
        this.e = 80;
        this.c = c;
    }
    
    public final void a(final String s, final int n) {
        final Context f = this.f;
        final Executor g = this.g;
        final jyz a = jza.a();
        a.d(s);
        a.c(n);
        a.b(s);
        final keg a2 = kas.c(f, g, a.a()).a(this.g, mer.b);
        final bzu bzu = new bzu();
        final Executor a3 = kel.a;
        final kem kem = (kem)a2;
        kem.i(a3, bzu);
        kem.h(kel.a, new bzt(s));
    }
    
    @Override
    public final void b() {
        if (!MediaListeningService.a(this.f)) {
            a.l(bzx.a.b(), "Fails to schedule media listener service.", '\u0107');
        }
        final String concat = String.valueOf(this.h).concat("/analytics");
        final String concat2 = String.valueOf(this.h).concat("/train");
        final cxl j = this.j;
        final cxo a = cxr.a;
        j.b();
        if (this.j.a(cxr.s).g()) {
            this.e = (int)this.j.a(cxr.s).c();
        }
        ofi.w(lou.a(this.k.l()), new bzv(this, concat, concat2), odx.a);
    }
}
