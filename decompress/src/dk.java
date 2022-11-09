import java.io.Writer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.io.PrintWriter;

// 
// Decompiled by Procyon v0.6.0
// 

final class dk extends fr implements fg
{
    final fi a;
    boolean b;
    int c;
    
    public dk(final fi a) {
        a.f();
        final et j = a.j;
        if (j != null) {
            j.c.getClassLoader();
        }
        this.c = -1;
        this.a = a;
    }
    
    final void a(final int n) {
        if (!this.j) {
            return;
        }
        if (fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Bump nesting in ");
            sb.append(this);
            sb.append(" by ");
            sb.append(n);
            sb.toString();
        }
        for (int size = this.d.size(), i = 0; i < size; ++i) {
            final fq fq = this.d.get(i);
            final ei b = fq.b;
            if (b != null) {
                b.z += n;
                if (fi.R(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bump nesting of ");
                    sb2.append(fq.b);
                    sb2.append(" to ");
                    sb2.append(fq.b.z);
                    sb2.toString();
                }
            }
        }
    }
    
    @Override
    public final void b() {
        this.n();
        this.a.D(this, false);
    }
    
    public final void c(final String s, final PrintWriter printWriter) {
        this.d(s, printWriter, true);
    }
    
    public final void d(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(s);
            printWriter.println("Operations:");
            for (int size = this.d.size(), i = 0; i < size; ++i) {
                final fq fq = this.d.get(i);
                String string = null;
                switch (fq.a) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(fq.a);
                        string = sb.toString();
                        break;
                    }
                    case 10: {
                        string = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string = "ATTACH";
                        break;
                    }
                    case 6: {
                        string = "DETACH";
                        break;
                    }
                    case 5: {
                        string = "SHOW";
                        break;
                    }
                    case 4: {
                        string = "HIDE";
                        break;
                    }
                    case 3: {
                        string = "REMOVE";
                        break;
                    }
                    case 2: {
                        string = "REPLACE";
                        break;
                    }
                    case 1: {
                        string = "ADD";
                        break;
                    }
                    case 0: {
                        string = "NULL";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string);
                printWriter.print(" ");
                printWriter.println(fq.b);
                if (b) {
                    if (fq.d != 0 || fq.e != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(fq.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(fq.e));
                    }
                    if (fq.f != 0 || fq.g != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(fq.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(fq.g));
                    }
                }
            }
        }
    }
    
    @Override
    public final boolean e(final ArrayList list, final ArrayList list2) {
        if (fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            sb.toString();
        }
        list.add(this);
        list2.add(false);
        if (this.j) {
            final fi a = this.a;
            if (a.b == null) {
                a.b = new ArrayList();
            }
            a.b.add(this);
        }
        return true;
    }
    
    @Override
    public final void f() {
        this.i(false);
    }
    
    @Override
    public final void g() {
        this.i(true);
    }
    
    @Override
    public final void h(final int n, final ei ei, final String g) {
        final String v = ei.V;
        if (v != null) {
            adc.a(ei, v);
        }
        final Class<? extends ei> class1 = ei.getClass();
        final int modifiers = class1.getModifiers();
        if (!class1.isAnonymousClass() && Modifier.isPublic(modifiers) && (!class1.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (g != null) {
                final String g2 = ei.G;
                if (g2 != null && !g.equals(g2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(ei);
                    sb.append(": was ");
                    sb.append(ei.G);
                    sb.append(" now ");
                    sb.append(g);
                    throw new IllegalStateException(sb.toString());
                }
                ei.G = g;
            }
            if (n != 0) {
                if (n == -1) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Can't add fragment ");
                    sb2.append(ei);
                    sb2.append(" with tag ");
                    sb2.append(g);
                    sb2.append(" to container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int e = ei.E;
                if (e != 0 && e != n) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(ei);
                    sb3.append(": was ");
                    sb3.append(ei.E);
                    sb3.append(" now ");
                    sb3.append(n);
                    throw new IllegalStateException(sb3.toString());
                }
                ei.E = n;
                ei.F = n;
            }
            this.k(new fq(1, ei));
            ei.A = this.a;
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(class1.getCanonicalName());
        sb4.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(sb4.toString());
    }
    
    final void i(final boolean b) {
        if (!this.b) {
            if (fi.R(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                sb.toString();
                final PrintWriter printWriter = new PrintWriter(new fv());
                this.c("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            if (this.j) {
                this.c = this.a.f.getAndIncrement();
            }
            else {
                this.c = -1;
            }
            this.a.C(this, b);
            return;
        }
        throw new IllegalStateException("commit already called");
    }
    
    @Override
    public final void j(final ei ei) {
        final fi a = ei.A;
        if (a != null && a != this.a) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            sb.append(ei.toString());
            sb.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(sb.toString());
        }
        this.k(new fq(3, ei));
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }
}
