import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqa implements hub
{
    private static final nsd a;
    private final kse b;
    private final cxl c;
    private final lfw d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/app/CacheCameraInfoBehavior");
    }
    
    public bqa(final lfw d, final kse b, final cxl c) {
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.b.f("#cacheDeviceInfo");
        final lfj b = der.b(this.d, this.c, lfu.b);
        if (b != null) {
            final fxu f = this.d.f(b);
            f.w();
            final Iterator iterator = f.z().iterator();
            while (iterator.hasNext()) {
                this.d.f((lfj)iterator.next()).w();
            }
            ((lfv)f).a.x();
            f.y();
        }
        else {
            a.l(bqa.a.c(), "No back-facing camera found.", 'I');
        }
        this.b.g();
    }
}
