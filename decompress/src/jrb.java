import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jrb extends BasePendingResult
{
    public jrb(final jqw jqw) {
        super(jqw);
    }
    
    @Override
    protected final jrf a(final Status status) {
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
