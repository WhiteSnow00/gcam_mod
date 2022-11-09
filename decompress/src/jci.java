import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jci
{
    public final View a;
    public int b;
    private Animator c;
    
    public jci(final View a) {
        this.b = 3;
        this.c = (Animator)new AnimatorSet();
        this.a = a;
    }
    
    public final void a() {
        this.c.cancel();
        nov.C(this.b == 3, "State should be stable with no animation", new Object[0]);
    }
    
    public final void b() {
        this.b = 3;
    }
    
    public final void c() {
        this.a();
        this.b = 1;
        (this.c = AnimatorInflater.loadAnimator(this.a.getContext(), 17498112)).setDuration(200L);
        this.c.setTarget((Object)this.a);
        this.c.addListener((Animator$AnimatorListener)new jcg(this));
        this.c.start();
        nov.A(this.c.isStarted());
    }
    
    public final void d() {
        this.a();
        this.b = 2;
        (this.c = AnimatorInflater.loadAnimator(this.a.getContext(), 17498113)).setDuration(200L);
        this.c.setTarget((Object)this.a);
        this.c.addListener((Animator$AnimatorListener)new jch(this));
        this.c.start();
    }
}
