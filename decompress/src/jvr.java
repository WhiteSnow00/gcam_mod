import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class jvr implements jqy
{
    final /* synthetic */ jqz a;
    final /* synthetic */ kej b;
    final /* synthetic */ jvt c;
    
    public jvr(final jqz a, final kej b, final jvt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Status status) {
        if (status.b()) {
            this.b.b(this.c.a(this.a.m(TimeUnit.MILLISECONDS)));
            return;
        }
        this.b.a(jvh.a(status));
    }
}
