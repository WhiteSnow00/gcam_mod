import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjn implements SeekBar$OnSeekBarChangeListener
{
    final /* synthetic */ jjq a;
    
    public jjn(final jjq a) {
        this.a = a;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, int s, final boolean b) {
        if (b) {
            if (this.a.H.r()) {
                final jjq a = this.a;
                if (a.L) {
                    a.H.q(s, a.U);
                    this.a.u.a();
                    return;
                }
            }
            njo.e((float)((kkz)this.a.e).d != 0.0f, "max zoom value hasn't been initialized properly");
            this.a.a.incrementAndGet();
            final jjq a2 = this.a;
            final int r = s - a2.S;
            a2.E.getDimensionPixelSize(2131166445);
            final int n = (int)(a2.E.getDimensionPixelSize(2131166419) / (float)a2.E.getDimensionPixelSize(2131166445) * a2.G.getMax());
            final int max = a2.G.getMax();
            final int n2 = n / 30;
            if (Math.abs(r) < n / 2 && a2.R == 0 && r != 0) {
                a2.R = r;
                s = a2.S;
            }
            else {
                final int r2 = a2.R;
                if (r2 != 0) {
                    if (r2 > n2) {
                        a2.R = r2 - n2;
                    }
                    else if (r2 < -n2) {
                        a2.R = r2 + n2;
                    }
                    else {
                        a2.Q(s);
                    }
                    final int n3 = s - a2.R;
                    if (n3 < 0) {
                        a2.Q(s);
                        s = 0;
                    }
                    else if (n3 <= max && s != max) {
                        s = n3;
                    }
                    else {
                        a2.Q(s);
                        s = max;
                    }
                }
            }
            final int max2 = this.a.G.getMax();
            final float floatValue = (float)((kkz)this.a.f).d;
            final double pow = Math.pow((float)((kkz)this.a.e).d / (float)((kkz)this.a.f).d, s / (float)max2);
            final klv s2 = this.a.s;
            final double n4 = floatValue;
            Double.isNaN(n4);
            final Float value = (float)(n4 * pow);
            s2.aR(value);
            final jjq a3 = this.a;
            a3.t.aR(a3.g.aQ());
            if (this.a.a.intValue() > 1) {
                this.a.g.aR(value);
                if (this.a.a.intValue() == 2) {
                    this.a.z.k();
                    this.a.F.b(true);
                }
            }
        }
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
        if (this.a.H.r()) {
            final jjq a = this.a;
            if (a.L) {
                a.L();
                return;
            }
        }
        this.a.Q(seekBar.getProgress());
        this.a.a.set(0);
        this.a.F.b(false);
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        if (this.a.a.intValue() <= 1) {
            if (!this.a.H.r()) {
                final float floatValue = (float)((kkz)this.a.s).d;
                this.a.z.m(floatValue, 5);
                this.a.t.aR(floatValue);
            }
        }
        this.a.z.n();
        final jjq a = this.a;
        a.S = 0;
        a.R = 0;
    }
}
