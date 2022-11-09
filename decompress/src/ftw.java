// 
// Decompiled by Procyon v0.6.0
// 

public final class ftw extends kwp
{
    final /* synthetic */ ofn a;
    
    public ftw(final ofn a) {
        this.a = a;
    }
    
    @Override
    public final void d(final ljm ljm) {
        if (ljm == null) {
            this.a.a(new NullPointerException("Null metadata provided."));
            return;
        }
        this.a.o(ljm);
    }
}
