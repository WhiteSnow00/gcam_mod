import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class kor implements oen
{
    final /* synthetic */ kot a;
    
    public kor(final kot a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        Log.e("AudioEncoder", "Stopping recording due to: ", t);
        this.a.l.a(kov.j);
    }
    
    @Override
    public final void b(final Object o) {
    }
}
