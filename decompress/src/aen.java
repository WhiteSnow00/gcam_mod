import androidx.preference.PreferenceGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aen implements Runnable
{
    final /* synthetic */ PreferenceGroup a;
    
    public aen(final PreferenceGroup a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
