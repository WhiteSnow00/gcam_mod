import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class als extends alu
{
    private final BroadcastReceiver f;
    
    static {
        aiy.b("BrdcstRcvrCnstrntTrckr");
    }
    
    public als(final Context context, final apa apa) {
        super(context, apa);
        this.f = new alr(this);
    }
    
    public abstract IntentFilter a();
    
    public abstract void c(final Intent p0);
    
    @Override
    public final void d() {
        final aiy a = aiy.a();
        String.format("%s: registering receiver", this.getClass().getSimpleName());
        a.d(new Throwable[0]);
        this.a.registerReceiver(this.f, this.a());
    }
    
    @Override
    public final void e() {
        final aiy a = aiy.a();
        String.format("%s: unregistering receiver", this.getClass().getSimpleName());
        a.d(new Throwable[0]);
        this.a.unregisterReceiver(this.f);
    }
}
