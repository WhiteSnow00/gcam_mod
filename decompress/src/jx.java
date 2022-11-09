import android.widget.ListAdapter;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jx
{
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public DialogInterface$OnClickListener h;
    public CharSequence i;
    public DialogInterface$OnClickListener j;
    public boolean k;
    public DialogInterface$OnDismissListener l;
    public DialogInterface$OnKeyListener m;
    public ListAdapter n;
    public DialogInterface$OnClickListener o;
    public View p;
    public boolean q;
    public int r;
    
    public jx(final Context a) {
        this.r = -1;
        this.a = a;
        this.k = true;
        this.b = (LayoutInflater)a.getSystemService("layout_inflater");
    }
}
