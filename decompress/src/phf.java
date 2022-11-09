// 
// Decompiled by Procyon v0.6.0
// 

public final class phf
{
    final Object[] a;
    Object[] b;
    int c;
    
    public phf() {
        final Object[] array = new Object[5];
        this.a = array;
        this.b = array;
    }
    
    public final void a(final Object o) {
        int c;
        if ((c = this.c) == 4) {
            final Object[] b = new Object[5];
            this.b[4] = b;
            this.b = b;
            c = 0;
        }
        this.b[c] = o;
        this.c = c + 1;
    }
    
    public final void b(final Object o) {
        this.a[0] = o;
    }
    
    public final boolean c(final psr psr) {
        Object[] a = this.a;
    Label_0068:
        while (true) {
            int i = 0;
            if (a == null) {
                return false;
            }
            while (i < 4) {
                final Object o = a[i];
                if (o == null) {
                    break;
                }
                if (o == phl.a) {
                    psr.cc();
                    break Label_0068;
                }
                if (o instanceof phj) {
                    psr.cd(((phj)o).a);
                    break Label_0068;
                }
                if (o instanceof phk) {
                    psr.bY(((phk)o).a);
                }
                else {
                    psr.ce(o);
                }
                ++i;
            }
            a = (Object[])a[4];
        }
        return true;
    }
}
