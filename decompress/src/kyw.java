// 
// Decompiled by Procyon v0.6.0
// 

public final class kyw
{
    private final long a;
    
    public kyw() {
        synchronized (lbi.class) {
            final int c = lbi.c;
            lbi.c = c + 1;
            monitorexit(lbi.class);
            this.a = c;
        }
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final StringBuilder sb = new StringBuilder(32);
        sb.append("FrameServer-");
        sb.append(a);
        return sb.toString();
    }
}
