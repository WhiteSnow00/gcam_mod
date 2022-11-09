// 
// Decompiled by Procyon v0.6.0
// 

public final class dsg implements krc
{
    public final AutoCloseable a;
    final /* synthetic */ dsh b;
    
    public dsg(final dsh b, final AutoCloseable a) {
        this.b = b;
        this.a = a;
    }
    
    public final AutoCloseable a() {
        final AutoCloseable a = this.a;
        a.getClass();
        return a;
    }
    
    @Override
    public final void close() {
        if (this.a == null) {
            return;
        }
        final ofn f = ofn.f();
        final ofn f2 = ofn.f();
        this.b.c.execute(new dsf(f2, f));
        this.b.d.execute(new dse(this, f, f2));
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
        sb.append("GLFenceGuarded[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
