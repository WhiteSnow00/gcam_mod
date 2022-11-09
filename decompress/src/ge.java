import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

class ge
{
    public final ei a;
    public final HashSet b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    private final List g;
    
    public ge(final int e, final int f, final ei a, final aan aan) {
        this.g = new ArrayList();
        this.b = new HashSet();
        this.c = false;
        this.d = false;
        this.e = e;
        this.f = f;
        this.a = a;
        aan.a(new gd(this));
    }
    
    public void a() {
        if (this.d) {
            return;
        }
        if (fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: ");
            sb.append(this);
            sb.append(" has called complete.");
            sb.toString();
        }
        this.d = true;
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
    }
    
    public void b() {
    }
    
    final void c(final Runnable runnable) {
        this.g.add(runnable);
    }
    
    final void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b.isEmpty()) {
            this.a();
            return;
        }
        final ArrayList list = new ArrayList(this.b);
        final int size = list.size();
        int i = 0;
        while (i < size) {
            final aan aan = (aan)list.get(i);
            synchronized (aan) {
                Label_0167: {
                    if (aan.a) {
                        monitorexit(aan);
                        break Label_0167;
                    }
                    aan.a = true;
                    aan.c = true;
                    final aam b = aan.b;
                    monitorexit(aan);
                    if (b != null) {
                        try {
                            b.a();
                        }
                        finally {
                            synchronized (aan) {
                                aan.c = false;
                                aan.notifyAll();
                            }
                        }
                    }
                    synchronized (aan) {
                        aan.c = false;
                        aan.notifyAll();
                        monitorexit(aan);
                        ++i;
                    }
                }
            }
            break;
        }
    }
    
    public final void e(final aan aan) {
        this.b();
        this.b.add(aan);
    }
    
    final void f(final int e, final int n) {
        switch (n - 1) {
            default: {
                if (this.e != 1) {
                    if (fi.R(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: For fragment ");
                        sb.append(this.a);
                        sb.append(" mFinalState = ");
                        sb.append((Object)a.f(this.e));
                        sb.append(" -> ");
                        sb.append((Object)a.f(e));
                        sb.append(". ");
                        sb.toString();
                    }
                    this.e = e;
                    break;
                }
                break;
            }
            case 2: {
                if (fi.R(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.a);
                    sb2.append(" mFinalState = ");
                    sb2.append((Object)a.f(this.e));
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append((Object)a.j(this.f));
                    sb2.append(" to REMOVING.");
                    sb2.toString();
                }
                this.e = 1;
                this.f = 3;
                return;
            }
            case 1: {
                if (this.e == 1) {
                    if (fi.R(2)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: For fragment ");
                        sb3.append(this.a);
                        sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb3.append((Object)a.j(this.f));
                        sb3.append(" to ADDING.");
                        sb3.toString();
                    }
                    this.e = 2;
                    this.f = 2;
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        sb.append((Object)a.f(this.e));
        sb.append("} {mLifecycleImpact = ");
        sb.append((Object)a.j(this.f));
        sb.append("} {mFragment = ");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
