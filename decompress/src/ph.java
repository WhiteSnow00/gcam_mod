import android.view.View;
import android.content.DialogInterface;
import android.widget.ListView;
import android.util.Log;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ph implements DialogInterface$OnClickListener, po
{
    kc a;
    final /* synthetic */ pp b;
    private ListAdapter c;
    private CharSequence d;
    
    public ph(final pp b) {
        this.b = b;
    }
    
    public final int a() {
        return 0;
    }
    
    public final int b() {
        return 0;
    }
    
    public final Drawable c() {
        return null;
    }
    
    public final CharSequence d() {
        return this.d;
    }
    
    public final void e(final ListAdapter c) {
        this.c = c;
    }
    
    public final void f(final Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
    
    public final void g(final int n) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
    
    public final void h(final int n) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
    
    public final void i(final CharSequence d) {
        this.d = d;
    }
    
    public final void j(final int n) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
    
    public final void k() {
        final kc a = this.a;
        if (a != null) {
            a.dismiss();
            this.a = null;
        }
    }
    
    public final void l(final int textDirection, final int textAlignment) {
        if (this.c == null) {
            return;
        }
        final kb kb = new kb(this.b.a);
        final CharSequence d = this.d;
        if (d != null) {
            kb.e(d);
        }
        final ListAdapter c = this.c;
        final int selectedItemPosition = this.b.getSelectedItemPosition();
        final jx a = kb.a;
        a.n = c;
        a.o = (DialogInterface$OnClickListener)this;
        a.r = selectedItemPosition;
        a.q = true;
        final kc b = kb.b();
        this.a = b;
        final ListView f = b.a.f;
        f.setTextDirection(textDirection);
        f.setTextAlignment(textAlignment);
        this.a.show();
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int selection) {
        this.b.setSelection(selection);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick((View)null, selection, this.c.getItemId(selection));
        }
        this.k();
    }
    
    public final boolean u() {
        final kc a = this.a;
        return a != null && a.isShowing();
    }
}
