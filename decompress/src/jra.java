import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jra extends BasePendingResult
{
    private final jrf a;
    
    public jra(final jrf a) {
        super(null);
        this.a = a;
    }
    
    @Override
    protected final jrf a(final Status status) {
        return this.a;
    }
}
