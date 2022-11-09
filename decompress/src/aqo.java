// 
// Decompiled by Procyon v0.6.0
// 

final class aqo implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ asx b;
    final /* synthetic */ aqp c;
    
    public aqo(final aqp c, final boolean a, final asx b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.a.a.a(this.a, this.b);
    }
}
