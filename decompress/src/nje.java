// 
// Decompiled by Procyon v0.6.0
// 

final class nje extends nij
{
    final /* synthetic */ njf f;
    
    public nje(final njf f, final njk njk, final CharSequence charSequence) {
        this.f = f;
        super(njk, charSequence);
    }
    
    @Override
    public final int a(final int n) {
        return n + 1;
    }
    
    @Override
    public final int b(int i) {
        final nio a = this.f.a;
        final CharSequence b = this.b;
        final int length = b.length();
        njo.w(i, length);
        while (i < length) {
            final int n = i;
            if (a.b(b.charAt(i))) {
                return n;
            }
            ++i;
        }
        return -1;
    }
}
