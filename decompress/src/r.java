// 
// Decompiled by Procyon v0.6.0
// 

public abstract class r
{
    public final u c;
    boolean d;
    int e;
    final /* synthetic */ s f;
    
    public r(final s f, final u c) {
        this.f = f;
        this.e = -1;
        this.c = c;
    }
    
    public void b() {
    }
    
    public boolean c(final k k) {
        return false;
    }
    
    public final void d(final boolean d) {
        if (d == this.d) {
            return;
        }
        this.d = d;
        final s f = this.f;
        int n;
        if (!d) {
            n = -1;
        }
        else {
            n = 1;
        }
        final int d2 = f.d;
        f.d = n + d2;
        Label_0147: {
            if (f.e) {
                break Label_0147;
            }
            f.e = true;
            int n2 = d2;
            try {
                while (true) {
                    final int d3 = f.d;
                    if (n2 == d3) {
                        break;
                    }
                    boolean b = false;
                    Label_0100: {
                        if (n2 == 0) {
                            if (d3 > 0) {
                                n2 = 0;
                                b = true;
                                break Label_0100;
                            }
                            n2 = 0;
                        }
                        b = false;
                    }
                    final boolean b2 = n2 > 0 && d3 == 0;
                    if (b) {
                        f.d();
                    }
                    else if (b2) {
                        f.e();
                    }
                    n2 = d3;
                }
                f.e = false;
                if (this.d) {
                    this.f.b(this);
                }
            }
            finally {
                f.e = false;
                while (true) {}
            }
        }
    }
    
    public abstract boolean g();
}
