// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.stats;

import java.util.Iterator;
import java.lang.ref.WeakReference;
import com.google.android.apps.camera.stats.timing.TimingSession;
import java.util.ArrayList;
import java.util.List;

public class Instrumentation
{
    private static Instrumentation a;
    private final List b;
    
    static {
        Instrumentation.a = null;
    }
    
    public Instrumentation() {
        this.b = new ArrayList();
    }
    
    public static void d(final Instrumentation a) {
        synchronized (Instrumentation.class) {
            Instrumentation.a = a;
        }
    }
    
    public static Instrumentation instance() {
        synchronized (Instrumentation.class) {
            return Instrumentation.a;
        }
    }
    
    public final TimingSession a(final Class clazz) {
        synchronized (this) {
            final List b = this.b(clazz);
            return (TimingSession)b.get(b.size() - 1);
        }
    }
    
    public final List b(final Class clazz) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                final TimingSession timingSession = ((WeakReference<TimingSession>)iterator.next()).get();
                if (timingSession != null && timingSession.getClass().equals(clazz)) {
                    list.add(timingSession);
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final WeakReference weakReference) {
        synchronized (this) {
            this.b.remove(weakReference.get());
        }
    }
    
    public final boolean e(final Class clazz) {
        monitorenter(this);
        try {
            final boolean b = !this.b(clazz).isEmpty();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(final TimingSession timingSession) {
        synchronized (this) {
            this.b.add(new WeakReference(timingSession));
            timingSession.b(new hve(this, timingSession));
        }
    }
}
