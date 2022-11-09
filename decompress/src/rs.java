import android.view.ViewPropertyAnimator;
import android.view.View;
import java.util.Collection;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rs implements Runnable
{
    final /* synthetic */ RecyclerView a;
    private final /* synthetic */ int b;
    
    public rs(final RecyclerView a) {
        this.a = a;
    }
    
    public rs(final RecyclerView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final RecyclerView a = this.a;
                if (!a.s || a.isLayoutRequested()) {
                    return;
                }
                final RecyclerView a2 = this.a;
                if (!a2.q) {
                    a2.requestLayout();
                    return;
                }
                if (a2.u) {
                    a2.t = true;
                    return;
                }
                a2.r();
                return;
            }
            case 0: {
                final sa b = this.a.B;
                Label_0592: {
                    if (b != null) {
                        final boolean empty = b.b.isEmpty();
                        final boolean b2 = empty ^ true;
                        final boolean empty2 = b.d.isEmpty();
                        final boolean b3 = empty2 ^ true;
                        final boolean b4 = b.e.isEmpty() ^ true;
                        final boolean b5 = b.c.isEmpty() ^ true;
                        boolean b6 = b4;
                        if (!b2) {
                            b6 = b4;
                            if (!b3) {
                                b6 = b4;
                                if (!b5) {
                                    if (!b4) {
                                        break Label_0592;
                                    }
                                    b6 = true;
                                }
                            }
                        }
                        final ArrayList b7 = b.b;
                        for (int size = b7.size(), i = 0; i < size; ++i) {
                            final st st = (st)b7.get(i);
                            final View a3 = st.a;
                            final ViewPropertyAnimator animate = a3.animate();
                            b.k.add(st);
                            animate.setDuration(120L).alpha(0.0f).setListener((Animator$AnimatorListener)new qb(b, st, animate, a3)).start();
                        }
                        b.b.clear();
                        if (b3) {
                            final ArrayList list = new ArrayList();
                            list.addAll(b.d);
                            b.g.add(list);
                            b.d.clear();
                            final qa qa = new qa(b, list, 1);
                            if (b2) {
                                ik.B(((qh)list.get(0)).a.a, qa, 120L);
                            }
                            else {
                                qa.run();
                            }
                        }
                        if (b6) {
                            final ArrayList list2 = new ArrayList();
                            list2.addAll(b.e);
                            b.h.add(list2);
                            b.e.clear();
                            final qa qa2 = new qa(b, list2);
                            if (b2) {
                                ik.B(((qg)list2.get(0)).a.a, qa2, 120L);
                            }
                            else {
                                qa2.run();
                            }
                        }
                        long n = 120L;
                        if (b5) {
                            final ArrayList list3 = new ArrayList();
                            list3.addAll(b.c);
                            b.f.add(list3);
                            b.c.clear();
                            final qa qa3 = new qa(b, list3, 2);
                            if (!b2 && !b3 && !b6) {
                                qa3.run();
                            }
                            else {
                                long n2 = 0L;
                                if (empty) {
                                    n = 0L;
                                }
                                long n3;
                                if (!empty2) {
                                    n3 = 250L;
                                }
                                else {
                                    n3 = 0L;
                                }
                                if (b6) {
                                    n2 = 250L;
                                }
                                ik.B(((st)list3.get(0)).a, qa3, n + Math.max(n3, n2));
                            }
                        }
                    }
                }
                this.a.L = false;
            }
        }
    }
}
