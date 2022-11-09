import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class oc extends qs
{
    final /* synthetic */ od a;
    
    public oc(final od a, final View view) {
        this.a = a;
        super(view);
    }
    
    @Override
    public final nn a() {
        final oe i = this.a.a.i;
        if (i == null) {
            return null;
        }
        return i.a();
    }
    
    public final boolean b() {
        this.a.a.m();
        return true;
    }
    
    public final boolean c() {
        final og a = this.a.a;
        if (a.k != null) {
            return false;
        }
        a.k();
        return true;
    }
}
