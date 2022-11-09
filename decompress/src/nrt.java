import java.util.ConcurrentModificationException;

// 
// Decompiled by Procyon v0.6.0
// 

final class nrt
{
    public Object a;
    
    public nrt() {
    }
    
    public final void a(final Object o, final Object a) {
        if (this.a == o) {
            this.a = a;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
