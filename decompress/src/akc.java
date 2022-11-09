import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akc extends be
{
    final Context c;
    
    public akc(final Context c, final int n, final int n2) {
        super(n, n2);
        this.c = c;
    }
    
    @Override
    public final void a(final afh afh) {
        if (this.b >= 10) {
            afh.m(new Object[] { "reschedule_needed", 1 });
            return;
        }
        this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}
