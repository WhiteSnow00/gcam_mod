import com.google.android.gms.common.api.Status;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khv implements jrf
{
    public final List a;
    private final Status b;
    
    public khv(final Status b, final List a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Status a() {
        return this.b;
    }
}
