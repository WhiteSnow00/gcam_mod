// 
// Decompiled by Procyon v0.6.0
// 

final class njg extends nij
{
    final /* synthetic */ njh f;
    
    public njg(final njh f, final njk njk, final CharSequence charSequence) {
        this.f = f;
        super(njk, charSequence);
    }
    
    @Override
    public final int a(final int n) {
        return n + this.f.a.length();
    }
    
    @Override
    public final int b(int i) {
        final int length = this.f.a.length();
        final int length2 = this.b.length();
    Label_0021:
        while (i <= length2 - length) {
            for (int j = 0; j < length; ++j) {
                if (this.b.charAt(j + i) != this.f.a.charAt(j)) {
                    ++i;
                    continue Label_0021;
                }
            }
            return i;
        }
        return -1;
    }
}
