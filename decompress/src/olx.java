import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class olx
{
    public static final olx a;
    public static final olx b;
    
    static {
        a = new olv();
        b = new olw();
    }
    
    public olx() {
    }
    
    public abstract List b(final Object p0, final long p1);
    
    public abstract void c(final Object p0, final long p1);
    
    public abstract void d(final Object p0, final Object p1, final long p2);
}
