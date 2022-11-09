// 
// Decompiled by Procyon v0.6.0
// 

public final class ayt implements aza
{
    public final boolean a;
    private final aza b;
    private final awc c;
    private int d;
    private boolean e;
    private final ayn f;
    
    public ayt(final aza b, final boolean a, final awc c, final ayn f) {
        bit.a(b);
        this.b = b;
        this.a = a;
        this.c = c;
        bit.a(f);
        this.f = f;
    }
    
    @Override
    public final int a() {
        return this.b.a();
    }
    
    @Override
    public final Class b() {
        return this.b.b();
    }
    
    @Override
    public final Object c() {
        return this.b.c();
    }
    
    public final void d() {
        synchronized (this) {
            if (!this.e) {
                ++this.d;
                return;
            }
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            if (this.d > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (!this.e) {
                this.e = true;
                this.b.e();
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }
    
    public final void f() {
        synchronized (this) {
            int d = this.d;
            if (d > 0) {
                --d;
                this.d = d;
                monitorexit(this);
                if (d == 0) {
                    final ayn f = this.f;
                    final awc c = this.c;
                    f.e.d(c);
                    if (this.a) {
                        f.f.d(c, (aza)this);
                        return;
                    }
                    f.c.a(this, false);
                }
                return;
            }
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final boolean a = this.a;
            final String value = String.valueOf(this.f);
            final String value2 = String.valueOf(this.c);
            final int d = this.d;
            final boolean e = this.e;
            final String value3 = String.valueOf(this.b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 107 + String.valueOf(value2).length() + String.valueOf(value3).length());
            sb.append("EngineResource{isMemoryCacheable=");
            sb.append(a);
            sb.append(", listener=");
            sb.append(value);
            sb.append(", key=");
            sb.append(value2);
            sb.append(", acquired=");
            sb.append(d);
            sb.append(", isRecycled=");
            sb.append(e);
            sb.append(", resource=");
            sb.append(value3);
            sb.append('}');
            return sb.toString();
        }
    }
}
