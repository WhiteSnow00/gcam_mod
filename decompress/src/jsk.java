// 
// Decompiled by Procyon v0.6.0
// 

public final class jsk implements Runnable
{
    final /* synthetic */ jsl a;
    
    public jsk(final jsl a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final jqo b = this.a.a.b;
        b.k(String.valueOf(b.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
