import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class alj implements alc
{
    public final List a;
    public Object b;
    public final alu c;
    public ali d;
    
    public alj(final alu c) {
        this.a = new ArrayList();
        this.c = c;
    }
    
    @Override
    public final void a(final Object b) {
        this.b = b;
        this.e(this.d, b);
    }
    
    public abstract boolean b(final ana p0);
    
    public abstract boolean c(final Object p0);
    
    public final void d(final ali d) {
        if (this.d != d) {
            this.e(this.d = d, this.b);
        }
    }
    
    public final void e(final ali ali, final Object o) {
        if (!this.a.isEmpty()) {
            if (ali != null) {
                if (o != null) {
                    if (!this.c(o)) {
                        final List a = this.a;
                        synchronized (((alf)ali).b) {
                            final ArrayList list = new ArrayList();
                            for (final String s : a) {
                                if (((alf)ali).c(s)) {
                                    final aiy a2 = aiy.a();
                                    String.format("Constraints met for %s", s);
                                    a2.d(new Throwable[0]);
                                    list.add(s);
                                }
                            }
                            final ale a3 = ((alf)ali).a;
                            if (a3 != null) {
                                a3.e(list);
                            }
                            return;
                        }
                    }
                }
                final List a4 = this.a;
                synchronized (((alf)ali).b) {
                    final ale a5 = ((alf)ali).a;
                    if (a5 != null) {
                        a5.f(a4);
                    }
                }
            }
        }
    }
}
