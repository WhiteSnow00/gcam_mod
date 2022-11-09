// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import java.util.HashMap;
import android.view.Surface;
import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Iterator;

public class ExternalSurfaceManager
{
    private static final String b;
    public final orw a;
    private final Object c;
    private volatile osc d;
    private int e;
    private boolean f;
    
    static {
        b = ExternalSurfaceManager.class.getSimpleName();
    }
    
    public ExternalSurfaceManager(final long n) {
        final orw a = new orw(n);
        this.c = new Object();
        this.d = new osc();
        this.e = 1;
        this.a = a;
    }
    
    private final int a(final int n, final int n2, final osa osa, final boolean b) {
        synchronized (this.c) {
            final osc d = new osc(this.d);
            final int n3 = this.e++;
            d.a.put(n3, new orz(n3, n, n2, osa, b));
            this.d = d;
            return n3;
        }
    }
    
    private final void b(final osb osb) {
        final osc d = this.d;
        if (this.f && !d.a.isEmpty()) {
            for (final orz orz : d.a.values()) {
                orz.a();
                osb.a(orz);
            }
        }
        if (!d.b.isEmpty()) {
            final Iterator iterator2 = d.b.values().iterator();
            while (iterator2.hasNext()) {
                ((orz)iterator2.next()).c(this.a);
            }
        }
    }
    
    public static native void nativeCallback(final long p0);
    
    public static native void nativeUpdateSurface(final long p0, final int p1, final int p2, final long p3, final float[] p4);
    
    public void consumerAttachToCurrentGLContext() {
        this.f = true;
        final osc d = this.d;
        if (!d.a.isEmpty()) {
            final Iterator iterator = d.a.values().iterator();
            while (iterator.hasNext()) {
                ((orz)iterator.next()).a();
            }
        }
    }
    
    public void consumerAttachToCurrentGLContext(final Map map) {
        this.f = true;
        final osc d = this.d;
        if (!this.d.a.isEmpty()) {
            for (final Integer n : this.d.a.keySet()) {
                if (!map.containsKey(n)) {
                    Log.e(ExternalSurfaceManager.b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", n));
                    return;
                }
            }
        }
        if (!map.isEmpty()) {
            for (final Map.Entry<Object, V> entry : map.entrySet()) {
                if (d.a.containsKey(entry.getKey())) {
                    ((orz)d.a.get(entry.getKey())).b((int)entry.getValue());
                }
                else {
                    Log.e(ExternalSurfaceManager.b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
                }
            }
        }
    }
    
    public void consumerDetachFromCurrentGLContext() {
        this.f = false;
        final osc d = this.d;
        if (!d.a.isEmpty()) {
            for (final orz orz : d.a.values()) {
                if (orz.i) {
                    final osa b = orz.b;
                    if (b != null) {
                        b.a();
                    }
                    orz.g.detachFromGLContext();
                    orz.i = false;
                }
            }
        }
    }
    
    public void consumerUpdateManagedSurfaces() {
        this.b(new orv(this, 1));
    }
    
    public void consumerUpdateManagedSurfacesSequentially() {
        this.b(new orv(this));
    }
    
    public int createExternalSurface() {
        return this.a(-1, -1, null, false);
    }
    
    public int createExternalSurface(final int n, final int n2, final Runnable runnable, final Runnable runnable2, final Handler handler) {
        if (runnable != null && handler != null) {
            return this.a(n, n2, new orx(runnable, runnable2, handler), false);
        }
        throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
    }
    
    public int createExternalSurfaceWithNativeCallback(final int n, final int n2, final long n3, final long n4, final boolean b) {
        return this.a(n, n2, new ose(n3, n4), b);
    }
    
    public Surface getSurface(final int n) {
        final osc d = this.d;
        final HashMap a = d.a;
        final Integer value = n;
        if (!a.containsKey(value)) {
            final String b = ExternalSurfaceManager.b;
            final StringBuilder sb = new StringBuilder(58);
            sb.append("Surface with ID ");
            sb.append(n);
            sb.append(" does not exist, returning null");
            Log.e(b, sb.toString());
            return null;
        }
        final orz orz = d.a.get(value);
        if (!orz.i) {
            return null;
        }
        return orz.h;
    }
    
    public void releaseExternalSurface(final int n) {
        synchronized (this.c) {
            final osc d = new osc(this.d);
            final HashMap a = d.a;
            final Integer value = n;
            final orz orz = a.remove(value);
            if (orz != null) {
                d.b.put(value, orz);
                this.d = d;
            }
            else {
                final String b = ExternalSurfaceManager.b;
                final StringBuilder sb = new StringBuilder(48);
                sb.append("Not releasing nonexistent surface ID ");
                sb.append(n);
                Log.e(b, sb.toString());
            }
        }
    }
    
    public void shutdown() {
        final Object c = this.c;
        monitorenter(c);
        try {
            final osc d = this.d;
            this.d = new osc();
            if (!d.a.isEmpty()) {
                final Iterator iterator = d.a.entrySet().iterator();
                while (iterator.hasNext()) {
                    ((Map.Entry<K, orz>)iterator.next()).getValue().c(this.a);
                }
            }
            if (!d.b.isEmpty()) {
                final Iterator iterator2 = d.b.entrySet().iterator();
                while (iterator2.hasNext()) {
                    ((Map.Entry<K, orz>)iterator2.next()).getValue().c(this.a);
                }
            }
            monitorexit(c);
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
}
