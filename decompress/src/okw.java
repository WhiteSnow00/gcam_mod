// 
// Decompiled by Procyon v0.6.0
// 

public abstract class okw extends oky implements omk
{
    public okp f;
    
    public okw() {
        this.f = okp.a;
    }
    
    final okp i() {
        final okp f = this.f;
        if (f.c) {
            this.f = f.c();
        }
        return this.f;
    }
    
    public final void j(final okk okk) {
        if (okk.a == this.H(6)) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}
