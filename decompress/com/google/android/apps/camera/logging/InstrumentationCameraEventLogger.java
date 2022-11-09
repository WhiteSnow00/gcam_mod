// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.logging;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class InstrumentationCameraEventLogger implements eyu
{
    private static final Integer a;
    private static final List b;
    
    static {
        a = 100;
        b = new ArrayList();
    }
    
    public static List getAndClearEvents() {
        final List b = InstrumentationCameraEventLogger.b;
        synchronized (b) {
            final ArrayList list = new ArrayList(b);
            b.clear();
            return list;
        }
    }
    
    @Override
    public final void a(final nxt nxt) {
        final List b = InstrumentationCameraEventLogger.b;
        synchronized (b) {
            if (b.size() == InstrumentationCameraEventLogger.a) {
                b.remove(b.size() - 1);
            }
            b.add(nxt);
        }
    }
}
