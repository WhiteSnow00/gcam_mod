import java.util.ArrayList;
import android.content.ComponentName;
import android.os.Bundle;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.KeyEvent;
import android.app.Activity;
import android.content.Intent;
import android.os.LocaleList;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class kf extends em implements gi
{
    private kg k;
    
    public kf() {
        this.A().b("androidx:appcompat", new kd(this));
        this.k(new ke(this));
    }
    
    private final void m() {
        gz.w(this.getWindow().getDecorView(), this);
        a.b(this.getWindow().getDecorView(), this);
        aal.b(this.getWindow().getDecorView(), this);
    }
    
    @Override
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.m();
        this.i().c(view, viewGroup$LayoutParams);
    }
    
    protected final void attachBaseContext(final Context context) {
        final kw kw = (kw)this.i();
        kw.A = true;
        final int r = kw.r(context, kw.q());
        final boolean d = kw.d;
        final Configuration configuration = null;
        Object o = null;
        Label_0932: {
            if (d && context instanceof ContextThemeWrapper) {
                final Configuration t = kw.t(context, r, null);
                try {
                    ((ContextThemeWrapper)context).applyOverrideConfiguration(t);
                    o = context;
                    break Label_0932;
                }
                catch (final IllegalStateException ex) {}
            }
            if (context instanceof lv) {
                final Configuration t2 = kw.t(context, r, null);
                try {
                    ((lv)context).a(t2);
                    o = context;
                    break Label_0932;
                }
                catch (final IllegalStateException ex2) {}
            }
            o = context;
            if (kw.c) {
                final Configuration configuration2 = new Configuration();
                configuration2.uiMode = -1;
                configuration2.fontScale = 0.0f;
                final Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
                final Configuration configuration4 = context.getResources().getConfiguration();
                configuration3.uiMode = configuration4.uiMode;
                Configuration configuration5 = configuration;
                if (!configuration3.equals(configuration4)) {
                    final Configuration configuration6 = new Configuration();
                    configuration6.fontScale = 0.0f;
                    configuration5 = configuration6;
                    if (configuration4 != null) {
                        if (configuration3.diff(configuration4) == 0) {
                            configuration5 = configuration6;
                        }
                        else {
                            if (configuration3.fontScale != configuration4.fontScale) {
                                configuration6.fontScale = configuration4.fontScale;
                            }
                            if (configuration3.mcc != configuration4.mcc) {
                                configuration6.mcc = configuration4.mcc;
                            }
                            if (configuration3.mnc != configuration4.mnc) {
                                configuration6.mnc = configuration4.mnc;
                            }
                            final LocaleList locales = configuration3.getLocales();
                            final LocaleList locales2 = configuration4.getLocales();
                            if (!locales.equals((Object)locales2)) {
                                configuration6.setLocales(locales2);
                                configuration6.locale = configuration4.locale;
                            }
                            if (configuration3.touchscreen != configuration4.touchscreen) {
                                configuration6.touchscreen = configuration4.touchscreen;
                            }
                            if (configuration3.keyboard != configuration4.keyboard) {
                                configuration6.keyboard = configuration4.keyboard;
                            }
                            if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                                configuration6.keyboardHidden = configuration4.keyboardHidden;
                            }
                            if (configuration3.navigation != configuration4.navigation) {
                                configuration6.navigation = configuration4.navigation;
                            }
                            if (configuration3.navigationHidden != configuration4.navigationHidden) {
                                configuration6.navigationHidden = configuration4.navigationHidden;
                            }
                            if (configuration3.orientation != configuration4.orientation) {
                                configuration6.orientation = configuration4.orientation;
                            }
                            if ((configuration3.screenLayout & 0xF) != (configuration4.screenLayout & 0xF)) {
                                configuration6.screenLayout |= (configuration4.screenLayout & 0xF);
                            }
                            if ((configuration3.screenLayout & 0xC0) != (configuration4.screenLayout & 0xC0)) {
                                configuration6.screenLayout |= (configuration4.screenLayout & 0xC0);
                            }
                            if ((configuration3.screenLayout & 0x30) != (configuration4.screenLayout & 0x30)) {
                                configuration6.screenLayout |= (configuration4.screenLayout & 0x30);
                            }
                            if ((configuration3.screenLayout & 0x300) != (configuration4.screenLayout & 0x300)) {
                                configuration6.screenLayout |= (configuration4.screenLayout & 0x300);
                            }
                            if ((configuration3.colorMode & 0x3) != (configuration4.colorMode & 0x3)) {
                                configuration6.colorMode |= (configuration4.colorMode & 0x3);
                            }
                            if ((configuration3.colorMode & 0xC) != (configuration4.colorMode & 0xC)) {
                                configuration6.colorMode |= (configuration4.colorMode & 0xC);
                            }
                            if ((configuration3.uiMode & 0xF) != (configuration4.uiMode & 0xF)) {
                                configuration6.uiMode |= (configuration4.uiMode & 0xF);
                            }
                            if ((configuration3.uiMode & 0x30) != (configuration4.uiMode & 0x30)) {
                                configuration6.uiMode |= (configuration4.uiMode & 0x30);
                            }
                            if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                                configuration6.screenWidthDp = configuration4.screenWidthDp;
                            }
                            if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                                configuration6.screenHeightDp = configuration4.screenHeightDp;
                            }
                            if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                                configuration6.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                            }
                            configuration5 = configuration6;
                            if (configuration3.densityDpi != configuration4.densityDpi) {
                                configuration6.densityDpi = configuration4.densityDpi;
                                configuration5 = configuration6;
                            }
                        }
                    }
                }
                final Configuration t3 = kw.t(context, r, configuration5);
                o = new lv(context, 2132017860);
                ((lv)o).a(t3);
                try {
                    if (context.getTheme() != null) {
                        gt.a(((lv)o).getTheme());
                    }
                }
                catch (final NullPointerException ex3) {}
            }
        }
        super.attachBaseContext((Context)o);
    }
    
    @Override
    public final Intent bf() {
        return fw.a(this);
    }
    
    public final void closeOptionsMenu() {
        final ju h = this.h();
        if (this.getWindow().hasFeature(0) && (h == null || !h.k())) {
            super.closeOptionsMenu();
        }
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final ju h = this.h();
        return (keyCode == 82 && h != null && h.o(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }
    
    @Override
    public final void f() {
        this.i().e();
    }
    
    public final View findViewById(final int n) {
        return this.i().b(n);
    }
    
    public final MenuInflater getMenuInflater() {
        final kw kw = (kw)this.i();
        if (kw.j == null) {
            kw.D();
            final ju i = kw.i;
            Context context;
            if (i != null) {
                context = i.b();
            }
            else {
                context = kw.f;
            }
            kw.j = new mb(context);
        }
        return kw.j;
    }
    
    public final ju h() {
        return this.i().a();
    }
    
    public final kg i() {
        if (this.k == null) {
            this.k = kg.o(this);
        }
        return this.k;
    }
    
    public final void invalidateOptionsMenu() {
        this.i().e();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final kw kw = (kw)this.i();
        if (kw.u && kw.r) {
            final ju a = kw.a();
            if (a != null) {
                a.q();
            }
        }
        ot.d().e(kw.f);
        kw.N(false);
    }
    
    public final void onContentChanged() {
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.i().f();
    }
    
    @Override
    public final boolean onMenuItemSelected(int size, final MenuItem menuItem) {
        final boolean onMenuItemSelected = super.onMenuItemSelected(size, menuItem);
        boolean b = true;
        if (onMenuItemSelected) {
            return true;
        }
        final ju h = this.h();
        if (menuItem.getItemId() == 16908332 && h != null && (h.a() & 0x4) != 0x0) {
            final Intent a = fw.a(this);
            if (a != null) {
                if (this.shouldUpRecreateTask(a)) {
                    final gj gj = new gj((Context)this);
                    Intent intent;
                    if ((intent = this.bf()) == null) {
                        intent = fw.a(this);
                    }
                    if (intent != null) {
                        ComponentName componentName;
                        if ((componentName = intent.getComponent()) == null) {
                            componentName = intent.resolveActivity(gj.b.getPackageManager());
                        }
                        size = gj.a.size();
                        try {
                            for (Intent intent2 = fw.b(gj.b, componentName); intent2 != null; intent2 = fw.b(gj.b, intent2.getComponent())) {
                                gj.a.add(size, intent2);
                            }
                            gj.a.add(intent);
                        }
                        catch (final PackageManager$NameNotFoundException ex) {
                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                            throw new IllegalArgumentException((Throwable)ex);
                        }
                    }
                    if (gj.a.isEmpty()) {
                        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                    }
                    final ArrayList a2 = gj.a;
                    final Intent[] array = a2.toArray(new Intent[a2.size()]);
                    array[0] = new Intent(array[0]).addFlags(268484608);
                    aaf.c(gj.b, array, null);
                    try {
                        this.finishAffinity();
                    }
                    catch (final IllegalStateException ex2) {
                        this.finish();
                    }
                }
                else {
                    this.navigateUpTo(a);
                }
            }
            else {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    protected void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        ((kw)this.i()).C();
    }
    
    @Override
    protected void onPostResume() {
        super.onPostResume();
        final ju a = ((kw)this.i()).a();
        if (a != null) {
            a.h(true);
        }
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        final kw kw = (kw)this.i();
        kw.B = true;
        kw.J();
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        this.i().g();
    }
    
    protected final void onTitleChanged(final CharSequence charSequence, final int n) {
        super.onTitleChanged(charSequence, n);
        this.i().l(charSequence);
    }
    
    public final void openOptionsMenu() {
        final ju h = this.h();
        if (this.getWindow().hasFeature(0) && (h == null || !h.p())) {
            super.openOptionsMenu();
        }
    }
    
    @Override
    public final void setContentView(final int n) {
        this.m();
        this.i().i(n);
    }
    
    @Override
    public final void setContentView(final View view) {
        this.m();
        this.i().j(view);
    }
    
    @Override
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.m();
        this.i().k(view, viewGroup$LayoutParams);
    }
    
    public final void setTheme(final int n) {
        super.setTheme(n);
        ((kw)this.i()).D = n;
    }
}
