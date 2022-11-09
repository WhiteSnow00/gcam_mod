import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzt
{
    public final lvj a;
    private final lyp b;
    
    public lzt(final lyp b) {
        this.a = lwt.i(2);
        this.b = b;
    }
    
    public final lzu a() {
        final lyp b = this.b;
        return new lzu(b, lyv.h(b, new lzs(this)));
    }
    
    public final void b(final mde mde) {
        this.a.add(mde);
    }
}
