import android.app.Fragment;
import j$.util.function.Consumer$VivifiedWrapper;
import java.util.function.Consumer;
import android.os.CancellationSignal;
import android.view.Menu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ContextMenu;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.content.Intent;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.KeyEvent;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class exr extends kf
{
    private int k;
    protected final ewy s;
    protected final fkz t;
    
    public exr() {
        this.s = new ewy();
        this.t = new fkz();
    }
    
    private final void m() {
        --this.k;
    }
    
    private final void n() {
        if (this.k++ == 0) {
            for (final exn exn : this.s.a) {
                if (exn instanceof ewj) {
                    ((ewj)exn).a();
                }
            }
        }
    }
    
    @Override
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        for (final exn exn : this.s.a) {
            if (exn instanceof evr && ((evr)exn).a()) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        for (final exn exn : this.s.a) {
            if (exn instanceof evs && ((evs)exn).a()) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public final void finish() {
        for (final exn exn : this.s.a) {
            if (exn instanceof hdm) {
                ((hdm)exn).b();
            }
        }
        super.finish();
    }
    
    public final void onActionModeFinished(final ActionMode actionMode) {
        for (final exn exn : this.s.a) {
            if (exn instanceof evt) {
                ((evt)exn).a();
            }
        }
        super.onActionModeFinished(actionMode);
    }
    
    public final void onActionModeStarted(final ActionMode actionMode) {
        for (final exn exn : this.s.a) {
            if (exn instanceof evu) {
                ((evu)exn).a();
            }
        }
        super.onActionModeStarted(actionMode);
    }
    
    @Override
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        for (final exn exn : this.s.a) {
            if (exn instanceof ewz) {
                ((ewz)exn).a(n, n2);
            }
        }
        super.onActivityResult(n, n2, intent);
    }
    
    public final void onAttachedToWindow() {
        final ewy s = this.s;
        final ewl b = ewl.b;
        s.b(b);
        s.j = b;
        super.onAttachedToWindow();
    }
    
    @Override
    public void onBackPressed() {
        for (final exn exn : this.s.a) {
            if (exn instanceof evw && ((evw)exn).bl()) {
                return;
            }
        }
        super.onBackPressed();
    }
    
    @Override
    public final void onConfigurationChanged(final Configuration configuration) {
        for (final exn exn : this.s.a) {
            if (exn instanceof evx) {
                ((evx)exn).y(configuration);
            }
        }
        super.onConfigurationChanged(configuration);
    }
    
    public final boolean onContextItemSelected(final MenuItem menuItem) {
        final Iterator iterator = this.s.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final exn exn = (exn)iterator.next();
            if (exn instanceof exa) {
                b |= ((exa)exn).a();
            }
        }
        return b;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.t.c();
        final ewy s = this.s;
        final ewk c = new ewk(bundle, 2);
        s.b(c);
        s.c = c;
        super.onCreate(bundle);
        this.t.b();
    }
    
    public final void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
        for (final exn exn : this.s.a) {
            if (exn instanceof exc) {
                ((exc)exn).a();
            }
        }
    }
    
    public final boolean onCreateOptionsMenu(final Menu menu) {
        final Iterator iterator = this.s.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final exn exn = (exn)iterator.next();
            if (exn instanceof exd) {
                b |= ((exd)exn).a();
            }
        }
        return b || super.onCreateOptionsMenu(menu);
    }
    
    @Override
    protected void onDestroy() {
        this.t.e();
        final ewy s = this.s;
        s.a(s.h);
        s.a(s.g);
        s.a(s.f);
        s.a(s.c);
        for (final exn exn : s.a) {
            if (exn instanceof exe) {
                ((exe)exn).bh();
            }
        }
        super.onDestroy();
        this.t.d();
    }
    
    public final void onDetachedFromWindow() {
        final ewy s = this.s;
        s.a(s.j);
        for (final exn exn : s.a) {
            if (exn instanceof evy) {
                ((evy)exn).a();
            }
        }
        super.onDetachedFromWindow();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        for (final exn exn : this.s.a) {
            if (exn instanceof evz && ((evz)exn).f(n, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        for (final exn exn : this.s.a) {
            if (exn instanceof ewa && ((ewa)exn).i(n)) {
                return true;
            }
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    @Override
    public final void onLowMemory() {
        for (final exn exn : this.s.a) {
            if (exn instanceof exf) {
                ((exf)exn).a();
            }
        }
        super.onLowMemory();
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        for (final exn exn : this.s.a) {
            if (exn instanceof ewb) {
                ((ewb)exn).z(intent);
            }
        }
        super.onNewIntent(intent);
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        for (final exn exn : this.s.a) {
            if (exn instanceof exg && ((exg)exn).a()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
    
    @Override
    protected void onPause() {
        this.t.g();
        final ewy s = this.s;
        s.a(s.i);
        s.a(s.e);
        for (final exn exn : s.a) {
            if (exn instanceof exh) {
                ((exh)exn).bi();
            }
        }
        super.onPause();
        this.t.f();
    }
    
    @Override
    protected final void onPostCreate(final Bundle bundle) {
        final ewy s = this.s;
        final ewk g = new ewk(bundle, 1);
        s.b(g);
        s.g = g;
        super.onPostCreate(bundle);
    }
    
    @Override
    protected final void onPostResume() {
        final ewy s = this.s;
        final ewl a = ewl.a;
        s.b(a);
        s.i = a;
        super.onPostResume();
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        final Iterator iterator = this.s.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final exn exn = (exn)iterator.next();
            if (exn instanceof exi) {
                b |= ((exi)exn).a();
            }
        }
        return b || super.onPrepareOptionsMenu(menu);
    }
    
    @Override
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        for (final exn exn : this.s.a) {
            if (exn instanceof ewe) {
                ((ewe)exn).f(n, array, array2);
            }
        }
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected final void onRestoreInstanceState(final Bundle bundle) {
        final ewy s = this.s;
        final ewk h = new ewk(bundle);
        s.b(h);
        s.h = h;
        super.onRestoreInstanceState(bundle);
    }
    
    @Override
    protected void onResume() {
        this.t.i();
        final ewy s = this.s;
        final ewl f = ewl.f;
        s.b(f);
        s.e = f;
        super.onResume();
        this.t.h();
    }
    
    @Override
    protected final void onSaveInstanceState(final Bundle bundle) {
        final ewy s = this.s;
        final ewk f = new ewk(bundle, 3);
        s.b(f);
        s.f = f;
        super.onSaveInstanceState(bundle);
    }
    
    @Override
    protected void onStart() {
        this.t.k();
        final ewy s = this.s;
        final ewl g = ewl.g;
        s.b(g);
        s.d = g;
        super.onStart();
        this.t.j();
    }
    
    @Override
    protected void onStop() {
        this.t.m();
        final ewy s = this.s;
        s.a(s.d);
        for (final exn exn : s.a) {
            if (exn instanceof exm) {
                ((exm)exn).e();
            }
        }
        super.onStop();
        this.t.l();
    }
    
    public final void onUserInteraction() {
        for (final exn exn : this.s.a) {
            if (exn instanceof ewg) {
                ((ewg)exn).a();
            }
        }
        super.onUserInteraction();
    }
    
    protected final void onUserLeaveHint() {
        for (final exn exn : this.s.a) {
            if (exn instanceof ewh) {
                ((ewh)exn).a();
            }
        }
        super.onUserLeaveHint();
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        for (final exn exn : this.s.a) {
            if (exn instanceof ewi) {
                ((ewi)exn).C(b);
            }
        }
        super.onWindowFocusChanged(b);
    }
    
    public final void startActivity(final Intent intent) {
        this.n();
        super.startActivity(intent);
        this.m();
    }
    
    public final void startActivity(final Intent intent, final Bundle bundle) {
        this.n();
        super.startActivity(intent, bundle);
        this.m();
    }
    
    public final void startActivityForResult(final Intent intent, final int n) {
        this.n();
        super.startActivityForResult(intent, n);
        this.m();
    }
    
    public final void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        this.n();
        super.startActivityForResult(intent, n, bundle);
        this.m();
    }
    
    public final void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n) {
        this.n();
        super.startActivityFromFragment(fragment, intent, n);
        this.m();
    }
    
    public final void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n, final Bundle bundle) {
        this.n();
        super.startActivityFromFragment(fragment, intent, n, bundle);
        this.m();
    }
}
