import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class niv extends AbstractList
{
    final /* synthetic */ Object[] a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    
    public niv(final Object[] a, final Object c) {
        this.a = a;
        this.b = "#version 300 es";
        this.c = c;
    }
    
    @Override
    public final Object get(final int n) {
        switch (n) {
            default: {
                return this.a[n - 2];
            }
            case 1: {
                return this.c;
            }
            case 0: {
                return this.b;
            }
        }
    }
    
    @Override
    public final int size() {
        return this.a.length + 2;
    }
}
