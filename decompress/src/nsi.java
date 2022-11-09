// 
// Decompiled by Procyon v0.6.0
// 

final class nsi extends ntp
{
    public Object[] a;
    public int b;
    
    public nsi() {
        this.a = new Object[8];
        this.b = 0;
    }
    
    public final int a(final nsx nsx) {
        for (int i = 0; i < this.b; ++i) {
            if (this.a[i + i].equals(nsx)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final int b() {
        return this.b;
    }
    
    @Override
    public final nsx c(final int n) {
        if (n < this.b) {
            return (nsx)this.a[n + n];
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final Object d(final nsx nsx) {
        final int a = this.a(nsx);
        if (a != -1) {
            return nsx.d(this.a[a + a + 1]);
        }
        return null;
    }
    
    @Override
    public final Object e(final int n) {
        if (n < this.b) {
            return this.a[n + n + 1];
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; ++i) {
            sb.append(" '");
            sb.append(this.c(i));
            sb.append("': ");
            sb.append(this.e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
