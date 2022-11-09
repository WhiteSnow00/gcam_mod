import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class omv extends ojr
{
    final omw a;
    ojt b;
    final /* synthetic */ omx c;
    
    public omv(final omx c) {
        this.c = c;
        this.a = new omw(c);
        this.b = this.b();
    }
    
    private final ojt b() {
        if (this.a.hasNext()) {
            return this.a.a().r();
        }
        return null;
    }
    
    public final byte a() {
        final ojt b = this.b;
        if (b != null) {
            final byte a = b.a();
            if (!this.b.hasNext()) {
                this.b = this.b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }
    
    public final boolean hasNext() {
        return this.b != null;
    }
}
