import android.content.IntentFilter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ks extends kr
{
    public final li a;
    final /* synthetic */ kw b;
    
    public ks(final kw b, final li a) {
        this.b = b;
        super(b);
        this.a = a;
    }
    
    @Override
    public final IntentFilter a() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }
    
    @Override
    public final void b() {
        this.b.J();
    }
}
