import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

final class c
{
    final int a;
    final Method b;
    
    public c(final int a, final Method b) {
        this.a = a;
        (this.b = b).setAccessible(true);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return this.a == c.a && this.b.getName().equals(c.b.getName());
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b.getName().hashCode();
    }
}
