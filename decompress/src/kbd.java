import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbd extends kca
{
    final /* synthetic */ kej a;
    
    public kbd(final kej a) {
        this.a = a;
    }
    
    @Override
    public final void b(final kby kby) {
        final Status a = kby.a;
        if (a == null) {
            this.a.c(new jqq(new Status(8, "Got null status from location service")));
            return;
        }
        if (a.g == 0) {
            this.a.b(true);
            return;
        }
        this.a.c(jvh.a(a));
    }
    
    @Override
    public final void c() {
    }
}
