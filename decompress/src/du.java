import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class du extends dv
{
    private final boolean c;
    private boolean d;
    private en e;
    
    public du(final ge ge, final aan aan, final boolean c) {
        super(ge, aan);
        this.d = false;
        this.c = c;
    }
    
    final en a(final Context context) {
        if (!this.d) {
            final ge a = super.a;
            final en c = bo.c(context, a.a, a.e == 2, this.c);
            this.e = c;
            this.d = true;
            return c;
        }
        return this.e;
    }
}
