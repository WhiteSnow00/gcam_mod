import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class ojq extends ojr
{
    final /* synthetic */ ojw a;
    private int b;
    private final int c;
    
    public ojq(final ojw a) {
        this.a = a;
        this.b = 0;
        this.c = a.d();
    }
    
    public final byte a() {
        final int b = this.b;
        if (b < this.c) {
            this.b = b + 1;
            return this.a.b(b);
        }
        throw new NoSuchElementException();
    }
    
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
