import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pjw implements Serializable, pjl, pjz
{
    public final pjl f;
    
    public pjw(final pjl f) {
        this.f = f;
    }
    
    protected abstract Object b(final Object p0);
    
    public pjl c(final Object o, final pjl pjl) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
    
    @Override
    public final StackTraceElement cn() {
        return pkh.a(this);
    }
    
    @Override
    public final void e(Object o) {
        pjw pjw = this;
        pjl f;
        while (true) {
            pjw.getClass();
            f = pjw.f;
            f.getClass();
            try {
                o = pjw.b(o);
                if (o == pjs.a) {
                    return;
                }
            }
            finally {
                final Throwable t;
                o = pip.a(t);
            }
            pjw.h();
            if (!(f instanceof pjw)) {
                break;
            }
            pjw = (pjw)f;
        }
        f.e(o);
    }
    
    @Override
    public final pjz g() {
        Object f;
        if (!((f = this.f) instanceof pjz)) {
            f = null;
        }
        return (pjz)f;
    }
    
    protected void h() {
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Serializable s = pkh.a(this);
        if (s == null) {
            s = this.getClass().getName();
        }
        sb.append(s);
        return sb.toString();
    }
}
