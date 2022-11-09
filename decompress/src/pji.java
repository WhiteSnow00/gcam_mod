import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class pji implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final pjq[] a;
    
    public pji(final pjq[] a) {
        a.getClass();
        this.a = a;
    }
    
    private final Object readResolve() {
        final pjq[] a = this.a;
        pjq pjq = pjr.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            pjq = pjq.ch(a[i]);
        }
        return pjq;
    }
}
