// 
// Decompiled by Procyon v0.6.0
// 

final class nwj implements Appendable
{
    int a;
    final /* synthetic */ Appendable b;
    final /* synthetic */ String c;
    
    public nwj(final Appendable b) {
        this.b = b;
        this.c = ":";
        this.a = 2;
    }
    
    @Override
    public final Appendable append(final char c) {
        if (this.a == 0) {
            this.b.append(this.c);
            this.a = 2;
        }
        this.b.append(c);
        --this.a;
        return this;
    }
    
    @Override
    public final Appendable append(final CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Appendable append(final CharSequence charSequence, final int n, final int n2) {
        throw new UnsupportedOperationException();
    }
}
