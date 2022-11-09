import java.util.concurrent.ScheduledExecutorService;
import android.os.Looper;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmn implements oun
{
    private final /* synthetic */ int a;
    
    public bmn() {
    }
    
    public bmn(final int a) {
        this.a = a;
    }
    
    public static bmn a(final pii pii) {
        return new bmn();
    }
    
    public static final bmm b() {
        return new bmm();
    }
    
    public static bpy c() {
        return new bpy();
    }
    
    public static final kjn d() {
        final ofn f = ofn.f();
        kjm.b.execute(new lsv(f, 1));
        final cyn a = dna.a();
        final bua bua = new bua(kjm.a, f);
        int n;
        if (!a.a(cyn.c)) {
            n = 128;
        }
        else {
            n = 512;
        }
        return new bto(bua, n);
    }
}
