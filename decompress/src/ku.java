import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ku
{
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public mv h;
    mr i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    Bundle p;
    
    public ku(final int a) {
        this.a = a;
        this.n = false;
    }
    
    final void a(final mv h) {
        final mv h2 = this.h;
        if (h == h2) {
            return;
        }
        if (h2 != null) {
            h2.m(this.i);
        }
        if ((this.h = h) != null) {
            final mr i = this.i;
            if (i != null) {
                h.g(i);
            }
        }
    }
}
