// 
// Decompiled by Procyon v0.6.0
// 

final class aqp implements asg
{
    final /* synthetic */ aqq a;
    
    public aqp(final aqq a) {
        this.a = a;
    }
    
    @Override
    public final void a(final boolean b, final asx asx) {
        this.a.b.post((Runnable)new aqo(this, b, asx));
    }
}
