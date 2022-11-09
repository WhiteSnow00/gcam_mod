// 
// Decompiled by Procyon v0.6.0
// 

public final class okk
{
    public final omj a;
    public final Object b;
    final omj c;
    public final okx d;
    
    public okk() {
    }
    
    public okk(final omj a, final Object b, final omj c, final okx d) {
        if (a == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (d.c == onv.k && c == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int a() {
        return this.d.b;
    }
    
    public final onv b() {
        return this.d.c;
    }
    
    public final void c() {
        final boolean d = this.d.d;
    }
    
    public final void d(final Object o) {
        if (this.d.a() != onw.h) {
            return;
        }
        final olc a = this.d.a;
        ((Integer)o).intValue();
        throw null;
    }
}
