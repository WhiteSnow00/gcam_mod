import android.view.FrameMetrics;
import android.view.Window;
import android.content.Context;
import android.util.ArrayMap;
import android.view.Window$OnFrameMetricsAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class mij implements Window$OnFrameMetricsAvailableListener
{
    private final njp a;
    private final ArrayMap b;
    
    public mij(final Context context, final ArrayMap b) {
        this.a = nov.F(new mii(context));
        this.b = b;
    }
    
    public final void onFrameMetricsAvailable(Window b, final FrameMetrics frameMetrics, final int n) {
        if (frameMetrics.getMetric(9) == 1L) {
            return;
        }
        final int l = (int)(frameMetrics.getMetric(8) / 1000000L);
        final int intValue = (int)this.a.a();
        final int n2 = (int)(frameMetrics.getMetric(13) / 1000000L);
        b = (Window)this.b;
        monitorenter(b);
        try {
            for (int size = ((ArrayMap)b).size(), i = 0; i < size; ++i) {
                final mip mip = (mip)((ArrayMap)b).valueAt(i);
                if (l < 0) {
                    ++mip.k;
                }
                else {
                    ++mip.j;
                    if (n2 > 0) {
                        final int p3 = l - n2;
                        if (mip.p < p3) {
                            mip.p = p3;
                        }
                        final int[] g = mip.g;
                        final int abs = Math.abs(p3);
                        int n3 = 50;
                        int n5 = 0;
                        Label_0307: {
                            int n4 = 0;
                            Label_0253: {
                                if (abs <= 20) {
                                    n3 = 2;
                                    n4 = 0;
                                }
                                else if (abs <= 30) {
                                    n4 = 6;
                                    n3 = 5;
                                }
                                else if (abs <= 100) {
                                    n3 = 10;
                                    n4 = 9;
                                }
                                else {
                                    if (abs > 200) {
                                        if (abs <= 1000) {
                                            if (p3 >= -200) {
                                                n4 = 19;
                                                n3 = 100;
                                                break Label_0253;
                                            }
                                        }
                                        else if (p3 > 0) {
                                            n5 = n3;
                                            break Label_0307;
                                        }
                                        n5 = 0;
                                        break Label_0307;
                                    }
                                    n4 = 17;
                                }
                            }
                            if (p3 > 0) {
                                n5 = mip.c + (abs / n3 + n4);
                            }
                            else {
                                n5 = mip.c - (abs / n3 + n4);
                            }
                        }
                        ++g[n5];
                        if (l > n2) {
                            ++mip.h;
                            mip.m += l;
                        }
                        if (l > intValue) {
                            ++mip.i;
                            mip.n += l;
                        }
                    }
                    else if (l > intValue) {
                        ++mip.h;
                        mip.m += l;
                    }
                    final int[] f = mip.f;
                    int n6;
                    if (l <= 20) {
                        if (l >= 8) {
                            n6 = (l >> 1) - 2;
                        }
                        else {
                            n6 = l >> 2;
                        }
                    }
                    else if (l <= 30) {
                        n6 = l / 5 + 4;
                    }
                    else if (l <= 100) {
                        n6 = l / 10 + 7;
                    }
                    else if (l <= 200) {
                        n6 = l / 50 + 15;
                    }
                    else if (l <= 1000) {
                        n6 = l / 100 + 17;
                    }
                    else {
                        n6 = 27;
                    }
                    ++f[n6];
                    mip.k += n;
                    if (mip.l < l) {
                        mip.l = l;
                    }
                    mip.o += l;
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
