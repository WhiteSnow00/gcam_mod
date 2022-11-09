import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osf implements osi
{
    private final Context a;
    
    static {
        osf.class.getSimpleName();
    }
    
    public osf(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @Override
    public final nxg a(final ota ota) {
        return null;
    }
    
    @Override
    public final osx b() {
        return ors.a();
    }
    
    @Override
    public final osy c() {
        osy osy;
        if ((osy = ors.b()) == null) {
            osy = osh.a(this.a);
        }
        return osy;
    }
    
    @Override
    public final osz d() {
        return null;
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final boolean f(final osx osx) {
        if (osx == null) {
            return ors.c();
        }
        return ors.d(osx);
    }
}
