import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class noy extends nrv
{
    boolean a;
    final /* synthetic */ Object b;
    
    public noy(final Object b) {
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return !this.a;
    }
    
    @Override
    public final Object next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
