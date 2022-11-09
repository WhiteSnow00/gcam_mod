// 
// Decompiled by Procyon v0.6.0
// 

public final class edv implements Runnable
{
    final /* synthetic */ nir a;
    final /* synthetic */ edx b;
    
    public edv(final edx b, final nir a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.a(this.b.d.getPreview(2));
    }
}
