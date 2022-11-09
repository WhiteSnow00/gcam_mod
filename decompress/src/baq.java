import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class baq implements ThreadFactory
{
    final boolean a;
    private final String b;
    private int c;
    
    public baq(final String b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        synchronized (this) {
            final String b = this.b;
            final int c = this.c;
            final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 25);
            sb.append("glide-");
            sb.append(b);
            sb.append("-thread-");
            sb.append(c);
            final bap bap = new bap(this, runnable, sb.toString());
            ++this.c;
            return bap;
        }
    }
}
