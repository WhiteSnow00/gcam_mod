import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class mqb
{
    public final Object a;
    public volatile Map b;
    public njp c;
    
    public mqb(final njp c) {
        this.a = new Object();
        this.c = c;
    }
    
    public final boolean a(final Map b) {
        b.getClass();
        synchronized (this.a) {
            if (this.b == null) {
                this.b = b;
                this.c = null;
                return true;
            }
            return this.b.equals(b);
        }
    }
}
