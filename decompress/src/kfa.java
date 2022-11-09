import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfa implements jrf
{
    public final kew a;
    private final Status b;
    
    public kfa(final Status b, final kew a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Status a() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        boolean b = true;
        if (this.a.a != 1) {
            b = false;
        }
        return String.format("OptInOptionsResultImpl[%s]", b);
    }
}
