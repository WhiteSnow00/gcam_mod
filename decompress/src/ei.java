import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.content.res.Configuration;
import android.app.Activity;
import android.view.LayoutInflater$Factory2;
import android.os.Parcelable;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.UUID;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public class ei implements ComponentCallbacks, View$OnCreateContextMenuListener, k, ad, aex
{
    static final Object g;
    public fi A;
    et B;
    fi C;
    public ei D;
    int E;
    int F;
    String G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    public boolean M;
    public ViewGroup N;
    public View O;
    boolean P;
    boolean Q;
    public ef R;
    boolean S;
    LayoutInflater T;
    boolean U;
    public String V;
    h W;
    fu X;
    final t Y;
    aew Z;
    public final ArrayList aa;
    i ab;
    int h;
    Bundle i;
    SparseArray j;
    Bundle k;
    Boolean l;
    String m;
    public Bundle n;
    ei o;
    String p;
    int q;
    public Boolean r;
    boolean s;
    public boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    int z;
    
    static {
        g = new Object();
    }
    
    public ei() {
        this.h = -1;
        this.m = UUID.randomUUID().toString();
        this.p = null;
        this.r = null;
        this.C = new fi();
        this.Q = true;
        new ed(this);
        this.W = h.e;
        this.Y = new t();
        new AtomicInteger();
        this.aa = new ArrayList();
        this.C();
    }
    
    @Deprecated
    public static ei W(final Context context, final String s) {
        try {
            return es.a(context.getClassLoader(), s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final InvocationTargetException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": calling Fragment constructor caused an exception");
            throw new eg(sb.toString(), ex);
        }
        catch (final NoSuchMethodException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": could not find Fragment constructor");
            throw new eg(sb2.toString(), ex2);
        }
        catch (final IllegalAccessException ex3) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to instantiate fragment ");
            sb3.append(s);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new eg(sb3.toString(), ex3);
        }
        catch (final InstantiationException ex4) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Unable to instantiate fragment ");
            sb4.append(s);
            sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new eg(sb4.toString(), ex4);
        }
    }
    
    private final int m() {
        if (this.W != h.b && this.D != null) {
            return Math.min(this.W.ordinal(), this.D.m());
        }
        return this.W.ordinal();
    }
    
    public final aev A() {
        return this.Z.a;
    }
    
    public void B(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.E));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.F));
        printWriter.print(" mTag=");
        printWriter.println(this.G);
        printWriter.print(s);
        printWriter.print("mState=");
        printWriter.print(this.h);
        printWriter.print(" mWho=");
        printWriter.print(this.m);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.z);
        printWriter.print(s);
        printWriter.print("mAdded=");
        printWriter.print(this.s);
        printWriter.print(" mRemoving=");
        printWriter.print(this.t);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.v);
        printWriter.print(" mInLayout=");
        printWriter.println(this.w);
        printWriter.print(s);
        printWriter.print("mHidden=");
        printWriter.print(this.H);
        printWriter.print(" mDetached=");
        printWriter.print(this.I);
        printWriter.print(" mMenuVisible=");
        printWriter.print(true);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(s);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.J);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Q);
        if (this.A != null) {
            printWriter.print(s);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.A);
        }
        if (this.B != null) {
            printWriter.print(s);
            printWriter.print("mHost=");
            printWriter.println(this.B);
        }
        if (this.D != null) {
            printWriter.print(s);
            printWriter.print("mParentFragment=");
            printWriter.println(this.D);
        }
        if (this.n != null) {
            printWriter.print(s);
            printWriter.print("mArguments=");
            printWriter.println(this.n);
        }
        if (this.i != null) {
            printWriter.print(s);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.i);
        }
        if (this.j != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.j);
        }
        if (this.k != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.k);
        }
        ei ei = null;
        Label_0500: {
            if ((ei = this.o) == null) {
                final fi a = this.A;
                if (a != null) {
                    final String p4 = this.p;
                    if (p4 != null) {
                        ei = a.b(p4);
                        break Label_0500;
                    }
                }
                ei = null;
            }
        }
        if (ei != null) {
            printWriter.print(s);
            printWriter.print("mTarget=");
            printWriter.print(ei);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.q);
        }
        printWriter.print(s);
        printWriter.print("mPopDirection=");
        printWriter.println(this.P());
        if (this.o() != 0) {
            printWriter.print(s);
            printWriter.print("getEnterAnim=");
            printWriter.println(this.o());
        }
        if (this.p() != 0) {
            printWriter.print(s);
            printWriter.print("getExitAnim=");
            printWriter.println(this.p());
        }
        if (this.q() != 0) {
            printWriter.print(s);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(this.q());
        }
        if (this.r() != 0) {
            printWriter.print(s);
            printWriter.print("getPopExitAnim=");
            printWriter.println(this.r());
        }
        if (this.N != null) {
            printWriter.print(s);
            printWriter.print("mContainer=");
            printWriter.println(this.N);
        }
        if (this.O != null) {
            printWriter.print(s);
            printWriter.print("mView=");
            printWriter.println(this.O);
        }
        if (this.s() != null) {
            adn.a(this).b(s, fileDescriptor, printWriter, array);
        }
        printWriter.print(s);
        final StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.C);
        sb.append(":");
        printWriter.println(sb.toString());
        final fi c = this.C;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append("  ");
        c.B(sb2.toString(), fileDescriptor, printWriter, array);
    }
    
    public final void C() {
        this.ab = new i(this);
        this.Z = aew.a(this);
    }
    
    @Deprecated
    public void D(final int n, final int n2, final Intent intent) {
        if (fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(n);
            sb.append(" resultCode: ");
            sb.append(n2);
            sb.append(" data: ");
            sb.append(intent);
            sb.toString();
        }
    }
    
    public void E() {
        this.M = true;
    }
    
    public void F() {
        this.M = true;
    }
    
    public void G() {
        this.M = true;
    }
    
    final void H() {
        this.Y(this.O);
        this.C.z(2);
    }
    
    final void I(final Bundle bundle) {
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.C.I(parcelable);
                this.C.p();
            }
        }
    }
    
    public final void J(int b, int c, int d, final int e) {
        if (this.R == null && b == 0) {
            if (c == 0) {
                if (d == 0) {
                    if (e == 0) {
                        return;
                    }
                    b = 0;
                    c = 0;
                    d = 0;
                }
                else {
                    b = 0;
                    c = 0;
                }
            }
            else {
                b = 0;
            }
        }
        this.u().b = b;
        this.u().c = c;
        this.u().d = d;
        this.u().e = e;
    }
    
    public final void K(final Bundle n) {
        final fi a = this.A;
        if (a != null && a.T()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.n = n;
    }
    
    final void L(final View m) {
        this.u().m = m;
    }
    
    final void M(final int f) {
        if (this.R == null && f == 0) {
            return;
        }
        this.u();
        this.R.f = f;
    }
    
    final void N(final boolean a) {
        if (this.R == null) {
            return;
        }
        this.u().a = a;
    }
    
    final void O(final ArrayList g, final ArrayList h) {
        this.u();
        final ef r = this.R;
        r.g = g;
        r.h = h;
    }
    
    final boolean P() {
        final ef r = this.R;
        return r != null && r.a;
    }
    
    public final boolean Q() {
        return this.B != null && this.s;
    }
    
    final boolean R() {
        return this.z > 0;
    }
    
    public final void S() {
    }
    
    public final void T() {
    }
    
    @Deprecated
    public final LayoutInflater U() {
        final et b = this.B;
        if (b != null) {
            final el el = (el)b;
            final LayoutInflater cloneInContext = el.a.getLayoutInflater().cloneInContext((Context)el.a);
            cloneInContext.setFactory2((LayoutInflater$Factory2)this.C.c);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
    
    public final void V() {
    }
    
    public final void X() {
        this.M = true;
        final et b = this.B;
        Activity b2;
        if (b == null) {
            b2 = null;
        }
        else {
            b2 = b.b;
        }
        if (b2 != null) {
            this.M = true;
        }
    }
    
    public void Y(final View view) {
    }
    
    final LayoutInflater Z() {
        return this.T = this.n();
    }
    
    public final i aD() {
        return this.ab;
    }
    
    public ep bE() {
        return new ee(this);
    }
    
    public final ac bg() {
        if (this.A == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.m() != h.b.ordinal()) {
            final fk t = this.A.t;
            ac ac;
            if ((ac = t.f.get(this.m)) == null) {
                ac = new ac();
                t.f.put(this.m, ac);
            }
            return ac;
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    
    public void d(final Context context) {
        this.M = true;
        final et b = this.B;
        Activity b2;
        if (b == null) {
            b2 = null;
        }
        else {
            b2 = b.b;
        }
        if (b2 != null) {
            this.M = true;
        }
    }
    
    public void e(final Bundle bundle) {
        this.M = true;
        this.I(bundle);
        final fi c = this.C;
        if (c.i > 0) {
            return;
        }
        c.p();
    }
    
    public void f() {
        this.M = true;
    }
    
    public void g() {
        this.M = true;
    }
    
    public void h(final Bundle bundle) {
    }
    
    public void i() {
        this.M = true;
    }
    
    public void j() {
        this.M = true;
    }
    
    public void k(final Bundle bundle) {
        this.M = true;
    }
    
    public void l(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.C.G();
        this.y = true;
        this.X = new fu(this.bg());
        final View y = this.y(layoutInflater, viewGroup, bundle);
        this.O = y;
        if (y != null) {
            this.X.d();
            gz.w(this.O, this.X);
            a.b(this.O, this.X);
            aal.b(this.O, this.X);
            this.Y.g(this.X);
            return;
        }
        if (this.X.b == null) {
            this.X = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }
    
    public LayoutInflater n() {
        return this.U();
    }
    
    public final int o() {
        final ef r = this.R;
        if (r == null) {
            return 0;
        }
        return r.b;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        this.M = true;
    }
    
    public final void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        final em v = this.v();
        if (v != null) {
            v.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void onLowMemory() {
        this.M = true;
    }
    
    public final int p() {
        final ef r = this.R;
        if (r == null) {
            return 0;
        }
        return r.c;
    }
    
    public final int q() {
        final ef r = this.R;
        if (r == null) {
            return 0;
        }
        return r.d;
    }
    
    public final int r() {
        final ef r = this.R;
        if (r == null) {
            return 0;
        }
        return r.e;
    }
    
    public final Context s() {
        final et b = this.B;
        if (b == null) {
            return null;
        }
        return b.c;
    }
    
    @Deprecated
    public final void startActivityForResult(final Intent intent, final int n) {
        if (this.B == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" not attached to Activity");
            throw new IllegalStateException(sb.toString());
        }
        final fi x = this.x();
        if (x.n != null) {
            x.o.addLast(new ff(this.m, n));
            final wn n2 = x.n;
            n2.d.e.add(n2.a);
            n2.d.d(n2.b, n2.c, intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    
    public final Context t() {
        final Context s = this.s();
        if (s != null) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.m);
        if (this.E != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.E));
        }
        if (this.G != null) {
            sb.append(" tag=");
            sb.append(this.G);
        }
        sb.append(")");
        return sb.toString();
    }
    
    public final ef u() {
        if (this.R == null) {
            this.R = new ef();
        }
        return this.R;
    }
    
    public final em v() {
        final et b = this.B;
        if (b == null) {
            return null;
        }
        return (em)b.b;
    }
    
    public final fi w() {
        if (this.B != null) {
            return this.C;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final fi x() {
        final fi a = this.A;
        if (a != null) {
            return a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }
    
    public View y(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return null;
    }
    
    public final View z() {
        final View o = this.O;
        if (o != null) {
            return o;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }
}
