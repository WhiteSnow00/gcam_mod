import android.os.PowerManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egn implements oun
{
    private final pii a;
    
    public egn(final pii a) {
        this.a = a;
    }
    
    public static PowerManager b(final egi egi) {
        final PowerManager powerManager = (PowerManager)egi.a(egi.j);
        pqf.k(powerManager);
        return powerManager;
    }
    
    public final PowerManager a() {
        return b((egi)this.a.get());
    }
}
