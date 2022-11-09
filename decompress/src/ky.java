import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class ky extends Dialog
{
    private kg a;
    private final hy b;
    
    public ky(final Context context, int a) {
        super(context, a(context, a));
        this.b = new kx(this);
        final kg b = this.b();
        a = a(context, a);
        ((kw)b).D = a;
        b.m();
    }
    
    private static int a(final Context context, final int n) {
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968992, typedValue, true);
            return typedValue.resourceId;
        }
        return n;
    }
    
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.b().c(view, viewGroup$LayoutParams);
    }
    
    public final kg b() {
        if (this.a == null) {
            this.a = kg.p(this);
        }
        return this.a;
    }
    
    final boolean c(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final void d() {
        this.b().n(1);
    }
    
    public final void dismiss() {
        super.dismiss();
        this.b().f();
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        this.getWindow().getDecorView();
        return hg.x(this.b, keyEvent);
    }
    
    public final View findViewById(final int n) {
        return this.b().b(n);
    }
    
    public final void invalidateOptionsMenu() {
        this.b().e();
    }
    
    protected void onCreate(final Bundle bundle) {
        this.b().d();
        super.onCreate(bundle);
        this.b().m();
    }
    
    protected final void onStop() {
        super.onStop();
        this.b().g();
    }
    
    public void setContentView(final int n) {
        this.b().i(n);
    }
    
    public void setContentView(final View view) {
        this.b().j(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.b().k(view, viewGroup$LayoutParams);
    }
    
    public final void setTitle(final int title) {
        super.setTitle(title);
        this.b().l(this.getContext().getString(title));
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.b().l(title);
    }
}
