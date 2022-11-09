import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hld
{
    public static final nsd a;
    private final String b;
    private final int c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/settings/upgrader/SettingsUpgrader");
    }
    
    public hld(final String b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    protected static final String c(final SharedPreferences sharedPreferences, final String s) {
        String string = null;
        try {
            string = sharedPreferences.getString(s, (String)null);
        }
        catch (final ClassCastException ex) {
            a.m(hld.a.b(), "error reading old value, removing and returning default", '\u092b', ex);
        }
        sharedPreferences.edit().remove(s).apply();
        return string;
    }
    
    protected abstract void a(final hjx p0, final int p1);
    
    protected int b(final hjx hjx) {
        return hjx.b(this.b, this.c);
    }
    
    public final void d(final hjx hjx) {
        try {
            final int b = this.b(hjx);
            if (b != this.c) {
                this.a(hjx, b);
            }
            hjx.i(this.b, this.c);
        }
        catch (final Exception ex) {
            a.m(hld.a.b(), "exception during upgrade", '\u092c', ex);
            throw ex;
        }
    }
}
