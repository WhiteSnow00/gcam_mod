// 
// Decompiled by Procyon v0.6.0
// 

public final class pqs extends pqq
{
    public final Runnable a;
    
    public pqs(final Runnable a, final long n, final pqr pqr) {
        a.getClass();
        pqr.getClass();
        super(n, pqr);
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.run();
        }
        finally {
            this.h.k();
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(poe.a(this.a));
        sb.append('@');
        sb.append(poe.b(this.a));
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(']');
        return sb.toString();
    }
}
