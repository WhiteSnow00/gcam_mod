import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efy implements oun
{
    private final efs a;
    
    public efy(final efs a) {
        this.a = a;
    }
    
    public static efy b(final efs efs) {
        return new efy(efs);
    }
    
    public final Intent a() {
        final Intent intent = this.a.a.getIntent();
        pqf.k(intent);
        return intent;
    }
}
