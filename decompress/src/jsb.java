import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class jsb implements jqy
{
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ jsd b;
    
    public jsb(final jsd b, final BasePendingResult a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Status status) {
        this.b.a.remove(this.a);
    }
}
