import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class kap extends jsu
{
    final /* synthetic */ kej a;
    final /* synthetic */ kaj b;
    
    public kap(final kej a, final kaj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Status status) {
        if (status.g == 0) {
            this.a.b(new kas(this.b));
            return;
        }
        this.a.a(new jqq(status));
    }
}
