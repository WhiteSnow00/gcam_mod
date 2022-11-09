import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class kpi implements oen
{
    final /* synthetic */ kpj a;
    
    public kpi(final kpj a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        Log.w("Failed to get MediaLimit. Stick with the default.", t);
    }
}
