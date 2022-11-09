import android.app.Notification;
import android.os.Bundle;
import android.app.PendingIntent;
import java.util.ArrayList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fy
{
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public fz i;
    public boolean j;
    public Bundle k;
    public String l;
    public final Notification m;
    @Deprecated
    public final ArrayList n;
    
    @Deprecated
    public fy(final Context a) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.j = false;
        final Notification m = new Notification();
        this.m = m;
        this.a = a;
        this.l = null;
        m.when = System.currentTimeMillis();
        m.audioStreamType = -1;
        this.h = 0;
        this.n = new ArrayList();
    }
    
    public static CharSequence b(final CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence subSequence = charSequence;
        if (charSequence.length() > 5120) {
            subSequence = charSequence.subSequence(0, 5120);
        }
        return subSequence;
    }
    
    public final Bundle a() {
        if (this.k == null) {
            this.k = new Bundle();
        }
        return this.k;
    }
    
    public final void c(final int icon) {
        this.m.icon = icon;
    }
    
    public final void d(final fz i) {
        if (this.i != i && (this.i = i) != null && i.b != this) {
            i.b = this;
            final fy b = i.b;
            if (b != null) {
                b.d(i);
            }
        }
    }
}
