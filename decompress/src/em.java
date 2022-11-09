import android.view.LayoutInflater$Factory2;
import android.view.MenuItem;
import android.view.Menu;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class em extends we implements aae
{
    final er a;
    boolean b;
    boolean c;
    boolean d;
    final i e;
    
    public em() {
        this.a = new er(new el(this));
        this.e = new i(this);
        this.d = true;
        this.A().b("android:support:lifecycle", new ek(this));
        this.k(new ej(this));
    }
    
    private static boolean h(final fi fi, final h h) {
        final Iterator iterator = fi.a.f().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ei ei = (ei)iterator.next();
            if (ei != null) {
                final et b = ei.B;
                em a;
                if (b == null) {
                    a = null;
                }
                else {
                    a = ((el)b).a;
                }
                int n2 = n;
                if (a != null) {
                    n2 = (n | (h(ei.w(), h) ? 1 : 0));
                }
                final fu x = ei.X;
                n = n2;
                if (x != null) {
                    n = n2;
                    if (x.aD().a.a(h.d)) {
                        ei.X.b.e(h);
                        n = (true ? 1 : 0);
                    }
                }
                if (!ei.ab.a.a(h.d)) {
                    continue;
                }
                ei.ab.e(h);
                n = (true ? 1 : 0);
            }
        }
        return n != 0;
    }
    
    public final fi c() {
        return this.a.a();
    }
    
    final View d(final View view, final String s, final Context context, final AttributeSet set) {
        return ((LayoutInflater$Factory2)this.a.a.e.c).onCreateView(view, s, context, set);
    }
    
    public final void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("  ");
        final String string = sb.toString();
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.b);
        printWriter.print(" mResumed=");
        printWriter.print(this.c);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        if (this.getApplication() != null) {
            adn.a(this).b(string, fileDescriptor, printWriter, array);
        }
        this.a.a().B(s, fileDescriptor, printWriter, array);
    }
    
    final void e() {
        while (h(this.c(), h.c)) {}
    }
    
    @Deprecated
    public void f() {
        this.invalidateOptionsMenu();
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        this.a.b();
        super.onActivityResult(n, n2, intent);
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.b();
        this.a.a.e.o(configuration);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.e.c(g.a);
        this.a.a.e.p();
    }
    
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0) {
            return super.onCreatePanelMenu(0, menu) | this.a.a.e.O(menu, this.getMenuInflater());
        }
        return super.onCreatePanelMenu(n, menu);
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View d = this.d(view, s, context, set);
        if (d == null) {
            return super.onCreateView(view, s, context, set);
        }
        return d;
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        final View d = this.d(null, s, context, set);
        if (d == null) {
            return super.onCreateView(s, context, set);
        }
        return d;
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.a.a.e.q();
        this.e.c(g.f);
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.a.a.e.r();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        switch (n) {
            default: {
                return false;
            }
            case 6: {
                return this.a.a.e.N(menuItem);
            }
            case 0: {
                return this.a.a.e.P(menuItem);
            }
        }
    }
    
    public final void onMultiWindowModeChanged(final boolean b) {
        this.a.a.e.s(b);
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.a.b();
    }
    
    public final void onPanelClosed(final int n, final Menu menu) {
        int n2 = n;
        if (n == 0) {
            this.a.a.e.t(menu);
            n2 = 0;
        }
        super.onPanelClosed(n2, menu);
    }
    
    protected void onPause() {
        super.onPause();
        this.c = false;
        this.a.a.e.v();
        this.e.c(g.d);
    }
    
    public final void onPictureInPictureModeChanged(final boolean b) {
        this.a.a.e.w(b);
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.e.c(g.c);
        this.a.a.e.x();
    }
    
    public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n == 0) {
            return super.onPreparePanel(0, view, menu) | this.a.a.e.Q(menu);
        }
        return super.onPreparePanel(n, view, menu);
    }
    
    @Override
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.a.b();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected void onResume() {
        super.onResume();
        this.c = true;
        this.a.b();
        this.a.c();
    }
    
    protected void onStart() {
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            this.a.a.e.n();
        }
        this.a.b();
        this.a.c();
        this.e.c(g.b);
        this.a.a.e.y();
    }
    
    public final void onStateNotSaved() {
        this.a.b();
    }
    
    protected void onStop() {
        super.onStop();
        this.d = true;
        this.e();
        this.a.a.e.A();
        this.e.c(g.e);
    }
}
