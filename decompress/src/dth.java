import java.util.concurrent.locks.ReentrantReadWriteLock;
import j$.util.function.Supplier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dth implements Supplier
{
    public final ReentrantReadWriteLock a;
    public dwf b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    
    public dth(final cxl cxl) {
        this.a = new ReentrantReadWriteLock();
        this.b = dwf.a;
        final float floatValue = (float)cxl.g(cxs.Y).c();
        this.c = floatValue;
        final float max = Math.max((float)cxl.g(cxs.Z).c(), floatValue);
        this.d = max;
        final float floatValue2 = (float)cxl.g(cxs.aa).c();
        this.e = floatValue2;
        this.f = Math.max((float)cxl.g(cxs.ab).c(), floatValue2);
        this.g = Math.min((float)cxl.g(cxs.ac).c(), max);
    }
}
