import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class azm
{
    final Object a;
    public List b;
    azm c;
    azm d;
    
    azm() {
        this(null);
    }
    
    public azm(final Object a) {
        this.d = this;
        this.c = this;
        this.a = a;
    }
    
    public final int a() {
        final List b = this.b;
        if (b != null) {
            return b.size();
        }
        return 0;
    }
    
    public final Object b() {
        final int a = this.a();
        if (a > 0) {
            return this.b.remove(a - 1);
        }
        return null;
    }
}
