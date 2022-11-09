import android.os.HandlerThread;
import com.google.android.apps.camera.brella.examplestore.beholder.BeholderExampleStoreDataTtlService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buh implements oun
{
    private final /* synthetic */ int a;
    
    public buh() {
    }
    
    public buh(final int a) {
        this.a = a;
    }
    
    public static nju a() {
        final nju a = nih.a;
        pqf.k(a);
        return a;
    }
    
    public static BeholderExampleStoreDataTtlService b() {
        return new BeholderExampleStoreDataTtlService();
    }
    
    public static final nns c() {
        final nns m = nns.m(byp.a("on_shutter", "BOOL"));
        pqf.k(m);
        final nns i = nns.m(byp.a("photo_mode", "INTEGER"));
        pqf.k(i);
        final nns n = nns.n(byq.a("pixel_data", m, new byb(1)), byq.a("metadata", i, new byb()));
        pqf.k(n);
        return n;
    }
    
    public static cfu d() {
        return new cfu();
    }
    
    public static jga e() {
        return new jfm();
    }
}
