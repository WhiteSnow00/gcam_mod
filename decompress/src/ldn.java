// 
// Decompiled by Procyon v0.6.0
// 

public final class ldn implements leb
{
    private static final krc a;
    private final kwz b;
    private final led c;
    private kvx d;
    
    static {
        a = new kqz();
    }
    
    public ldn(final kwz b, final led c) {
        this.d = null;
        this.b = b;
        this.c = c;
    }
    
    public static leb e(final kwz kwz, final led led) {
        led.getClass();
        return new ldn(kwz, led);
    }
    
    public static leb f(final kwz kwz) {
        if (kwz instanceof ldw && ((ldw)kwz).f() > 0L) {
            return new ldn(kwz, led.g());
        }
        return g(kwz);
    }
    
    public static leb g(final kwz kwz) {
        final boolean b = kwz instanceof ldw;
        boolean b2 = true;
        if (b) {
            if (((ldw)kwz).f() > 0L) {
                b2 = false;
            }
        }
        njo.e(b2, "Cannot create a streamResult from a stream that uses more than 0 bytesPerImage");
        return new ldn(kwz, null);
    }
    
    @Override
    public final krc a() {
        final led c = this.c;
        if (c != null) {
            return c.a();
        }
        return ldn.a;
    }
    
    @Override
    public final krc b() {
        final led c = this.c;
        if (c != null) {
            return c.b();
        }
        return ldn.a;
    }
    
    @Override
    public final kvx c() {
        synchronized (this) {
            return this.d;
        }
    }
    
    @Override
    public final kwz d() {
        return this.b;
    }
    
    @Override
    public final lju h() {
        monitorenter(this);
        monitorexit(this);
        return null;
    }
    
    @Override
    public final void i(final lea lea) {
        synchronized (this) {
            lea.h();
        }
    }
    
    @Override
    public final void j(final kvx d) {
        synchronized (this) {
            this.d = d;
        }
    }
    
    @Override
    public final void k(final lju lju) {
        monitorenter(this);
        if (lju == null) {
            monitorexit(this);
            return;
        }
        try {
            lju.close();
            throw new IllegalStateException("External results must never receive images.");
        }
        finally {
            monitorexit(this);
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final kvx d = this.d;
            Object value;
            if (d == null) {
                value = null;
            }
            else {
                value = d.b;
            }
            final String value2 = String.valueOf(value);
            final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 21);
            sb.append("ExternalStreamResult-");
            sb.append(value2);
            return sb.toString();
        }
    }
}
