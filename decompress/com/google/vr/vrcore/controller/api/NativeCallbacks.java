// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

public final class NativeCallbacks implements ControllerServiceBridge$Callbacks
{
    private final long a;
    private boolean b;
    
    public NativeCallbacks(final long a) {
        this.a = a;
    }
    
    private native void handleAccelEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5);
    
    private native void handleBatteryEvent(final long p0, final int p1, final long p2, final boolean p3, final int p4);
    
    private native void handleButtonEvent(final long p0, final int p1, final long p2, final int p3, final boolean p4);
    
    private native void handleControllerRecentered(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5, final float p6);
    
    private native void handleGyroEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5);
    
    private native void handleOrientationEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5, final float p6);
    
    private native void handlePositionEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5);
    
    private native void handleServiceConnected(final long p0, final int p1);
    
    private native void handleServiceDisconnected(final long p0);
    
    private native void handleServiceFailed(final long p0);
    
    private native void handleServiceInitFailed(final long p0, final int p1);
    
    private native void handleServiceUnavailable(final long p0);
    
    private native void handleStateChanged(final long p0, final int p1, final int p2);
    
    private native void handleTouchEvent(final long p0, final int p1, final long p2, final int p3, final float p4, final float p5);
    
    private native void handleTrackingStatusEvent(final long p0, final int p1, final long p2, final int p3);
    
    private final void j(final otn otn) {
        final int n = 0;
        int n2 = 0;
        while (true) {
            while (!this.b) {
                final int l = otn.l;
                if (n2 >= l) {
                    int n3 = 0;
                    while (true) {
                        while (!this.b) {
                            final int n4 = otn.n;
                            if (n3 >= n4) {
                                int n5 = 0;
                                while (true) {
                                    while (!this.b) {
                                        final int p = otn.p;
                                        if (n5 >= p) {
                                            int n6 = 0;
                                            while (true) {
                                                while (!this.b) {
                                                    final int r = otn.r;
                                                    if (n6 >= r) {
                                                        int n7 = n;
                                                        while (!this.b) {
                                                            final int t = otn.t;
                                                            if (n7 >= t) {
                                                                break;
                                                            }
                                                            if (n7 >= t) {
                                                                throw new IndexOutOfBoundsException();
                                                            }
                                                            final otw otw = otn.u[n7];
                                                            this.handleTouchEvent(this.a, otw.e, otw.d, otw.b, otw.c, otw.f);
                                                            ++n7;
                                                        }
                                                        return;
                                                    }
                                                    if (n6 >= r) {
                                                        throw new IndexOutOfBoundsException();
                                                    }
                                                    final otq otq = otn.s[n6];
                                                    this.handleOrientationEvent(this.a, otq.e, otq.d, otq.a, otq.b, otq.c, otq.f);
                                                    ++n6;
                                                }
                                                int n7 = n;
                                                continue;
                                            }
                                        }
                                        if (n5 >= p) {
                                            throw new IndexOutOfBoundsException();
                                        }
                                        final oto oto = otn.q[n5];
                                        this.handleGyroEvent(this.a, oto.e, oto.d, oto.a, oto.b, oto.c);
                                        ++n5;
                                    }
                                    int n6 = 0;
                                    continue;
                                }
                            }
                            if (n3 >= n4) {
                                throw new IndexOutOfBoundsException();
                            }
                            final otk otk = otn.o[n3];
                            this.handleButtonEvent(this.a, otk.e, otk.d, otk.a, otk.b);
                            ++n3;
                        }
                        int n5 = 0;
                        continue;
                    }
                }
                if (n2 >= l) {
                    throw new IndexOutOfBoundsException();
                }
                final oth oth = otn.m[n2];
                this.handleAccelEvent(this.a, oth.e, oth.d, oth.a, oth.b, oth.c);
                ++n2;
            }
            int n3 = 0;
            continue;
        }
    }
    
    @Override
    public final void a(final otn otn) {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.j(otn);
        }
    }
    
    @Override
    public final void b(final otm otm) {
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return;
            }
            this.j(otm);
            final int n = 0;
            int n2 = 0;
            while (true) {
                while (!this.b) {
                    final int c = otm.c;
                    if (n2 >= c) {
                        int n3 = n;
                        while (!this.b) {
                            final int h = otm.h;
                            if (n3 < h) {
                                if (n3 >= h) {
                                    throw new IndexOutOfBoundsException();
                                }
                                final otx otx = otm.i[n3];
                                this.handleTrackingStatusEvent(this.a, otx.e, otx.d, otx.a);
                                ++n3;
                            }
                            else {
                                if (otm.e) {
                                    final otj f = otm.f;
                                    this.handleBatteryEvent(this.a, f.e, f.d, f.b, f.a);
                                    break;
                                }
                                break;
                            }
                        }
                        monitorexit(this);
                        return;
                    }
                    if (n2 >= c) {
                        throw new IndexOutOfBoundsException();
                    }
                    final otr otr = otm.d[n2];
                    this.handlePositionEvent(this.a, otr.e, otr.d, otr.a, otr.b, otr.c);
                    ++n2;
                }
                int n3 = n;
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final otq otq) {
        synchronized (this) {
            if (!this.b) {
                this.handleControllerRecentered(this.a, otq.e, otq.d, otq.a, otq.b, otq.c, otq.f);
            }
        }
    }
    
    public void close() {
        synchronized (this) {
            this.b = true;
        }
    }
    
    @Override
    public final void d(final int n, final int n2) {
        synchronized (this) {
            if (!this.b) {
                this.handleStateChanged(this.a, n, n2);
            }
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceDisconnected(this.a);
            }
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceFailed(this.a);
            }
        }
    }
    
    @Override
    public final void g(final int n) {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceInitFailed(this.a, n);
            }
        }
    }
    
    @Override
    public final void h() {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceUnavailable(this.a);
            }
        }
    }
    
    @Override
    public final void i() {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceConnected(this.a, 1);
            }
        }
    }
}
