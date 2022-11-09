import android.util.SparseArray;
import android.os.Bundle;
import java.util.Collection;
import android.view.KeyCharacterMap$KeyData;
import android.view.KeyEvent;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.view.SubMenu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.res.Resources;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class mv implements he
{
    private static final int[] j;
    public final Context a;
    public mt b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public my h;
    public boolean i;
    private final Resources k;
    private boolean l;
    private final boolean m;
    private final ArrayList n;
    private boolean o;
    private final ArrayList p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private final CopyOnWriteArrayList x;
    private boolean y;
    
    static {
        j = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public mv(final Context a) {
        boolean m = false;
        this.r = 0;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = new ArrayList();
        this.x = new CopyOnWriteArrayList();
        this.y = false;
        this.a = a;
        final Resources resources = a.getResources();
        this.k = resources;
        this.c = new ArrayList();
        this.n = new ArrayList();
        this.o = true;
        this.d = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(a).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            m = true;
        }
        this.m = m;
    }
    
    private final void E(final int n, final boolean b) {
        if (n >= 0 && n < this.c.size()) {
            this.c.remove(n);
            if (b) {
                this.l(true);
            }
        }
    }
    
    public final boolean A(final MenuItem menuItem, final nj nj, final int n) {
        final my my = (my)menuItem;
        if (my != null && my.isEnabled()) {
            final boolean n2 = my.n();
            final hu o = my.o;
            final boolean b = o != null && o.d();
            boolean b2;
            if (my.m()) {
                b2 = (n2 | my.expandActionView());
                if (b2) {
                    this.i(true);
                    return true;
                }
            }
            else if (!my.hasSubMenu() && !b) {
                if ((n & 0x1) == 0x0) {
                    this.i(true);
                    return n2;
                }
                b2 = n2;
            }
            else {
                if ((n & 0x4) == 0x0) {
                    this.i(false);
                }
                if (!my.hasSubMenu()) {
                    my.l(new nr(this.a, this, my));
                }
                final nr k = my.k;
                if (b) {
                    o.c((SubMenu)k);
                }
                boolean b3;
                if (this.x.isEmpty()) {
                    b3 = false;
                }
                else {
                    boolean f = nj != null && nj.f(k);
                    final Iterator iterator = this.x.iterator();
                    while (true) {
                        b3 = f;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final WeakReference weakReference = (WeakReference)iterator.next();
                        final nj nj2 = (nj)weakReference.get();
                        if (nj2 == null) {
                            this.x.remove(weakReference);
                        }
                        else {
                            if (f) {
                                continue;
                            }
                            f = nj2.f(k);
                        }
                    }
                }
                b2 = (n2 | b3);
                if (!b2) {
                    this.i(true);
                    return false;
                }
            }
            return b2;
        }
        return false;
    }
    
    final void B() {
        this.l(this.q = true);
    }
    
    final void C() {
        this.l(this.o = true);
    }
    
    public final void D() {
        this.r = 1;
    }
    
    public mv a() {
        return this;
    }
    
    public final MenuItem add(final int n) {
        return this.c(0, 0, 0, this.k.getString(n));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.c(n, n2, n3, this.k.getString(n4));
    }
    
    public final MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.c(n, n2, n3, charSequence);
    }
    
    public final MenuItem add(final CharSequence charSequence) {
        return this.c(0, 0, 0, charSequence);
    }
    
    public final int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, int i, final MenuItem[] array2) {
        final PackageManager packageManager = this.a.getPackageManager();
        final int n4 = 0;
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        if ((i & 0x1) == 0x0) {
            this.removeGroup(n);
            i = n4;
        }
        else {
            i = n4;
        }
        while (i < size) {
            final ResolveInfo resolveInfo = queryIntentActivityOptions.get(i);
            Intent intent2;
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[resolveInfo.specificIndex];
            }
            final Intent e = new Intent(intent2);
            e.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            final MenuItem c = this.c(n, n2, n3, resolveInfo.loadLabel(packageManager));
            c.setIcon(resolveInfo.loadIcon(packageManager));
            ((my)c).e = e;
            if (array2 != null && resolveInfo.specificIndex >= 0) {
                array2[resolveInfo.specificIndex] = c;
            }
            ++i;
        }
        return size;
    }
    
    public final SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.k.getString(n));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.k.getString(n4));
    }
    
    public final SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final MenuItem c = this.c(n, n2, n3, charSequence);
        final Context a = this.a;
        final my my = (my)c;
        final nr nr = new nr(a, this, my);
        my.l(nr);
        return (SubMenu)nr;
    }
    
    public final SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    final my b(final int n, final KeyEvent keyEvent) {
        final ArrayList w = this.w;
        w.clear();
        this.j(w, n, keyEvent);
        if (w.isEmpty()) {
            return null;
        }
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        keyEvent.getKeyData(keyCharacterMap$KeyData);
        final int size = w.size();
        if (size == 1) {
            return (my)w.get(0);
        }
        final boolean x = this.x();
        for (int i = 0; i < size; ++i) {
            final my my = w.get(i);
            char c;
            if (x) {
                c = my.h;
            }
            else {
                c = my.f;
            }
            if ((c == keyCharacterMap$KeyData.meta[0] && (metaState & 0x2) == 0x0) || (c == keyCharacterMap$KeyData.meta[2] && (metaState & 0x2) != 0x0) || (x && c == '\b' && n == 67)) {
                return my;
            }
        }
        return null;
    }
    
    protected final MenuItem c(int i, final int n, final int n2, final CharSequence charSequence) {
        final int n3 = n2 >> 16;
        if (n3 >= 0 && n3 < 6) {
            final int n4 = mv.j[n3] << 16 | (char)n2;
            final my my = new my(this, i, n, n2, n4, charSequence, this.r);
            final ArrayList c = this.c;
            while (true) {
                for (i = c.size() - 1; i >= 0; --i) {
                    if (((my)c.get(i)).c <= n4) {
                        ++i;
                        c.add(i, my);
                        this.l(true);
                        return (MenuItem)my;
                    }
                }
                i = 0;
                continue;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }
    
    public final void clear() {
        final my h = this.h;
        if (h != null) {
            this.t(h);
        }
        this.c.clear();
        this.l(true);
    }
    
    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        this.l(false);
    }
    
    public final void close() {
        this.i(true);
    }
    
    protected String d() {
        return "android:menu:actionviewstates";
    }
    
    public final ArrayList e() {
        this.k();
        return this.p;
    }
    
    public final ArrayList f() {
        if (!this.o) {
            return this.n;
        }
        this.n.clear();
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final my my = this.c.get(i);
            if (my.isVisible()) {
                this.n.add(my);
            }
        }
        this.o = false;
        this.q = true;
        return this.n;
    }
    
    public final MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            final my my = this.c.get(i);
            if (my.a == n) {
                return (MenuItem)my;
            }
            if (my.hasSubMenu()) {
                final MenuItem item = ((SubMenu)my.k).findItem(n);
                if (item != null) {
                    return item;
                }
            }
        }
        return null;
    }
    
    public final void g(final nj nj) {
        this.h(nj, this.a);
    }
    
    public final MenuItem getItem(final int n) {
        return this.c.get(n);
    }
    
    public final void h(final nj nj, final Context context) {
        this.x.add(new WeakReference(nj));
        nj.b(context, this);
        this.q = true;
    }
    
    public final boolean hasVisibleItems() {
        if (this.i) {
            return true;
        }
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (((my)this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public final void i(final boolean b) {
        if (this.v) {
            return;
        }
        this.v = true;
        for (final WeakReference weakReference : this.x) {
            final nj nj = (nj)weakReference.get();
            if (nj == null) {
                this.x.remove(weakReference);
            }
            else {
                nj.c(this, b);
            }
        }
        this.v = false;
    }
    
    public final boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.b(n, keyEvent) != null;
    }
    
    final void j(final List list, final int n, final KeyEvent keyEvent) {
        final boolean x = this.x();
        final int modifiers = keyEvent.getModifiers();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (!keyEvent.getKeyData(keyCharacterMap$KeyData) && n != 67) {
            return;
        }
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final my my = this.c.get(i);
            if (my.hasSubMenu()) {
                my.k.j(list, n, keyEvent);
            }
            char c;
            if (x) {
                c = my.h;
            }
            else {
                c = my.f;
            }
            int n2;
            if (x) {
                n2 = my.i;
            }
            else {
                n2 = my.g;
            }
            if ((modifiers & 0x1100F) == (n2 & 0x1100F) && c != '\0' && (c == keyCharacterMap$KeyData.meta[0] || c == keyCharacterMap$KeyData.meta[2] || (x && c == '\b' && n == 67)) && my.isEnabled()) {
                list.add(my);
            }
        }
    }
    
    public final void k() {
        final ArrayList f = this.f();
        if (!this.q) {
            return;
        }
        final Iterator iterator = this.x.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final WeakReference weakReference = (WeakReference)iterator.next();
            final nj nj = (nj)weakReference.get();
            if (nj == null) {
                this.x.remove(weakReference);
            }
            else {
                b |= nj.e();
            }
        }
        if (b) {
            this.d.clear();
            this.p.clear();
            for (int size = f.size(), i = 0; i < size; ++i) {
                final my my = f.get(i);
                if (my.o()) {
                    this.d.add(my);
                }
                else {
                    this.p.add(my);
                }
            }
        }
        else {
            this.d.clear();
            this.p.clear();
            this.p.addAll(this.f());
        }
        this.q = false;
    }
    
    public final void l(final boolean b) {
        if (!this.s) {
            if (b) {
                this.o = true;
                this.q = true;
            }
            if (!this.x.isEmpty()) {
                this.s();
                for (final WeakReference weakReference : this.x) {
                    final nj nj = (nj)weakReference.get();
                    if (nj == null) {
                        this.x.remove(weakReference);
                    }
                    else {
                        nj.i();
                    }
                }
                this.r();
            }
        }
        else {
            this.t = true;
            if (b) {
                this.u = true;
            }
        }
    }
    
    public final void m(final nj nj) {
        for (final WeakReference weakReference : this.x) {
            final nj nj2 = (nj)weakReference.get();
            if (nj2 == null || nj2 == nj) {
                this.x.remove(weakReference);
            }
        }
    }
    
    public final void n(final Bundle bundle) {
        final SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(this.d());
        for (int size = this.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((nr)item.getSubMenu()).n(bundle);
            }
        }
        final int int1 = bundle.getInt("android:menu:expandedactionview");
        if (int1 > 0) {
            final MenuItem item2 = this.findItem(int1);
            if (item2 != null) {
                item2.expandActionView();
            }
        }
    }
    
    public final void o(final Bundle bundle) {
        final int size = this.size();
        SparseArray sparseArray = null;
        SparseArray sparseArray2;
        for (int i = 0; i < size; ++i, sparseArray = sparseArray2) {
            final MenuItem item = this.getItem(i);
            final View actionView = item.getActionView();
            sparseArray2 = sparseArray;
            if (actionView != null) {
                sparseArray2 = sparseArray;
                if (actionView.getId() != -1) {
                    SparseArray sparseArray3;
                    if ((sparseArray3 = sparseArray) == null) {
                        sparseArray3 = new SparseArray();
                    }
                    actionView.saveHierarchyState(sparseArray3);
                    sparseArray2 = sparseArray3;
                    if (item.isActionViewExpanded()) {
                        bundle.putInt("android:menu:expandedactionview", item.getItemId());
                        sparseArray2 = sparseArray3;
                    }
                }
            }
            if (item.hasSubMenu()) {
                ((nr)item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(this.d(), sparseArray);
        }
    }
    
    public void p(final mt b) {
        this.b = b;
    }
    
    public final boolean performIdentifierAction(final int n, final int n2) {
        return this.z(this.findItem(n), n2);
    }
    
    public final boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final my b = this.b(n, keyEvent);
        final boolean b2 = b != null && this.z((MenuItem)b, n2);
        if ((n2 & 0x2) != 0x0) {
            this.i(true);
        }
        return b2;
    }
    
    public final void q(final int n, final CharSequence e, final int n2, final Drawable f, final View g) {
        final Resources k = this.k;
        if (g != null) {
            this.g = g;
            this.e = null;
            this.f = null;
        }
        else {
            if (n > 0) {
                this.e = k.getText(n);
            }
            else if (e != null) {
                this.e = e;
            }
            if (n2 > 0) {
                this.f = aah.a(this.a, n2);
            }
            else if (f != null) {
                this.f = f;
            }
            this.g = null;
        }
        this.l(false);
    }
    
    public final void r() {
        this.s = false;
        if (this.t) {
            this.t = false;
            this.l(this.u);
        }
    }
    
    public final void removeGroup(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                final int n2 = i;
                if (((my)this.c.get(i)).b == n) {
                    if (n2 >= 0) {
                        for (int size2 = this.c.size(), n3 = 0; n3 < size2 - n2 && this.c.get(n2).b == n; ++n3) {
                            this.E(n2, false);
                        }
                        this.l(true);
                    }
                    return;
                }
            }
            final int n2 = -1;
            continue;
        }
    }
    
    public final void removeItem(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (((my)this.c.get(i)).a == n) {
                    this.E(i, true);
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public final void s() {
        if (!this.s) {
            this.s = true;
            this.t = false;
            this.u = false;
        }
    }
    
    public final void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final my my = this.c.get(i);
            if (my.b == n) {
                my.j(b);
                my.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupDividerEnabled(final boolean y) {
        this.y = y;
    }
    
    public final void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final my my = this.c.get(i);
            if (my.b == n) {
                my.setEnabled(enabled);
            }
        }
    }
    
    public final void setGroupVisible(final int n, final boolean b) {
        final int size = this.c.size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            final my my = this.c.get(i);
            int n3 = n2;
            if (my.b == n) {
                n3 = n2;
                if (my.s(b)) {
                    n3 = 1;
                }
            }
            ++i;
            n2 = n3;
        }
        if (n2 != 0) {
            this.l(true);
        }
    }
    
    public void setQwertyMode(final boolean l) {
        this.l = l;
        this.l(false);
    }
    
    public final int size() {
        return this.c.size();
    }
    
    public boolean t(final my my) {
        final boolean empty = this.x.isEmpty();
        boolean g = false;
        if (!empty && this.h == my) {
            this.s();
            for (final WeakReference weakReference : this.x) {
                final nj nj = (nj)weakReference.get();
                if (nj == null) {
                    this.x.remove(weakReference);
                }
                else {
                    final boolean b = g = nj.g(my);
                    if (b) {
                        g = b;
                        break;
                    }
                    continue;
                }
            }
            this.r();
            if (g) {
                this.h = null;
            }
            return g;
        }
        return false;
    }
    
    public boolean u(final mv mv, final MenuItem menuItem) {
        final mt b = this.b;
        return b != null && b.G(mv, menuItem);
    }
    
    public boolean v(final my h) {
        final boolean empty = this.x.isEmpty();
        boolean h2 = false;
        if (empty) {
            return false;
        }
        this.s();
        final Iterator iterator = this.x.iterator();
        boolean b;
        while (true) {
            b = h2;
            if (!iterator.hasNext()) {
                break;
            }
            final WeakReference weakReference = (WeakReference)iterator.next();
            final nj nj = (nj)weakReference.get();
            if (nj == null) {
                this.x.remove(weakReference);
            }
            else {
                b = (h2 = nj.h(h));
                if (b) {
                    break;
                }
                continue;
            }
        }
        this.r();
        if (b) {
            this.h = h;
        }
        return b;
    }
    
    public boolean w() {
        return this.y;
    }
    
    public boolean x() {
        return this.l;
    }
    
    public boolean y() {
        return this.m;
    }
    
    public final boolean z(final MenuItem menuItem, final int n) {
        return this.A(menuItem, null, n);
    }
}
