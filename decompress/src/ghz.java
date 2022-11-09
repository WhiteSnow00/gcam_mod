import com.google.android.apps.camera.stats.ViewfinderJankSession;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghz implements ghw
{
    private final ViewfinderJankSession a;
    private double b;
    
    public ghz(final ViewfinderJankSession a) {
        this.b = 33.0;
        this.a = a;
    }
    
    @Override
    public final void a(final ljm ljm, final double b, double n) {
        final ViewfinderJankSession a = this.a;
        ++a.d;
        n = this.b;
        Label_0185: {
            if (n > 33.0 && b > 33.0) {
                final double n2 = (b - n) / n;
                if (n2 >= 0.5) {
                    final Object a2 = a.a;
                    monitorenter(a2);
                    Label_0097: {
                        if (n2 < 0.5) {
                            break Label_0097;
                        }
                        try {
                            ++a.e;
                            break Label_0097;
                        }
                        finally {
                            monitorexit(a2);
                            while (true) {
                            Block_10:
                                while (true) {
                                    ++a.f;
                                    Block_11: {
                                        Label_0118: {
                                            break Label_0118;
                                            iftrue(Label_0174:)(n2 < 1.5);
                                            break Block_11;
                                        }
                                        iftrue(Label_0139:)(n2 < 5.0);
                                        break Block_10;
                                    }
                                    final nzd c = ViewfinderJankSession.c(ljm, b, n);
                                    a.c.add(c);
                                    a.a(c);
                                    Label_0174: {
                                        monitorexit(a2);
                                    }
                                    break Label_0185;
                                    iftrue(Label_0118:)(n2 < 1.5);
                                    continue;
                                }
                                ++a.g;
                                continue;
                            }
                        }
                    }
                }
            }
        }
        if (b > 33.0) {
            n = this.b;
            if (b > n) {
                this.b = (b + n * 10.0) / 11.0;
                return;
            }
            this.b = b;
        }
    }
}
