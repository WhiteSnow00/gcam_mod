import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dpv implements oun
{
    private final pii a;
    private final pii b;
    
    public dpv(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static dpv b(final pii pii, final pii pii2) {
        return new dpv(pii, pii2);
    }
    
    public final Handler a() {
        final kjk kjk = (kjk)this.a.get();
        final kpo kpo = (kpo)this.b.get();
        return kpo.e(kjk, "MicrovideoQSharedStartup");
    }
}
