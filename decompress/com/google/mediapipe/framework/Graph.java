// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Graph
{
    private static final nsd a;
    private long b;
    private final List c;
    private Map d;
    private Map e;
    private boolean f;
    private boolean g;
    private Map h;
    private final Object i;
    
    static {
        a = nsd.g("com/google/mediapipe/framework/Graph");
    }
    
    public Graph() {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = false;
        this.g = false;
        this.h = new HashMap();
        this.i = new Object();
        this.b = this.nativeCreateGraph();
    }
    
    private static void l(final Map map, final String[] array, final long[] array2) {
        if (map.size() == array.length && map.size() == array2.length) {
            final Iterator iterator = map.entrySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
                array[n] = entry.getKey();
                array2[n] = ((Packet)entry.getValue()).getNativeHandle();
                ++n;
            }
            return;
        }
        throw new RuntimeException("Input array length doesn't match the map size!");
    }
    
    private native void nativeAddPacketCallback(final long p0, final String p1, final PacketCallback p2);
    
    private native long nativeAddSurfaceOutput(final long p0, final String p1);
    
    private native void nativeCloseAllPacketSources(final long p0);
    
    private native long nativeCreateGraph();
    
    private native void nativeLoadBinaryGraph(final long p0, final String p1);
    
    private native void nativeLoadBinaryGraphBytes(final long p0, final byte[] p1);
    
    private native void nativeMovePacketToInputStream(final long p0, final String p1, final long p2, final long p3);
    
    private native void nativeReleaseGraph(final long p0);
    
    private native void nativeSetParentGlContext(final long p0, final long p1);
    
    private native void nativeStartRunningGraph(final long p0, final String[] p1, final long[] p2, final String[] p3, final long[] p4);
    
    private native void nativeWaitUntilGraphDone(final long p0);
    
    public final long a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void b(final String s, final Packet packet, final long n) {
        monitorenter(this);
        try {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called.");
            if (this.g) {
                this.nativeMovePacketToInputStream(this.b, s, packet.getNativeHandle(), n);
                packet.release();
                monitorexit(this);
                return;
            }
            final Packet packet2 = new Packet(packet.nativeCopyPacket(packet.a));
            if (!this.h.containsKey(s)) {
                this.h.put(s, new ArrayList());
            }
            final List list = this.h.get(s);
            if (list.size() > 20) {
                for (final Map.Entry<Object, V> entry : this.e.entrySet()) {
                    if (entry.getValue() == null) {
                        a.k(Graph.a.b(), "Stream: %s might be missing.", entry.getKey(), '\u0c5a');
                    }
                }
                throw new RuntimeException("Graph is not started because of missing streams");
            }
            list.add(new oja(packet2, n));
            packet.release();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final String s, final PacketCallback packetCallback) {
        synchronized (this) {
            final long b = this.b;
            final boolean b2 = true;
            njo.p(b != 0L, "Invalid context, tearDown() might have been called already.");
            njo.o(!this.g && !this.f && b2);
            this.c.add(packetCallback);
            this.nativeAddPacketCallback(this.b, s, packetCallback);
        }
    }
    
    public final void d() {
        synchronized (this) {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called.");
            this.nativeCloseAllPacketSources(this.b);
        }
    }
    
    public final void e(final String s) {
        synchronized (this) {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called already.");
            this.nativeLoadBinaryGraph(this.b, s);
        }
    }
    
    public final void f(final byte[] array) {
        synchronized (this) {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called already.");
            this.nativeLoadBinaryGraphBytes(this.b, array);
        }
    }
    
    public final void g(final long n) {
        synchronized (this) {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called already.");
            njo.o(this.g ^ true);
            this.nativeSetParentGlContext(this.b, n);
        }
    }
    
    public final void h() {
        monitorenter(this);
        try {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called.");
            this.f = true;
            final Iterator iterator = this.e.entrySet().iterator();
            while (iterator.hasNext()) {
                if (((Map.Entry<K, Object>)iterator.next()).getValue() == null) {
                    monitorexit(this);
                    return;
                }
            }
            final String[] array = new String[this.d.size()];
            final long[] array2 = new long[this.d.size()];
            l(this.d, array, array2);
            final String[] array3 = new String[this.e.size()];
            final long[] array4 = new long[this.e.size()];
            l(this.e, array3, array4);
            this.nativeStartRunningGraph(this.b, array, array2, array3, array4);
            this.g = true;
            if (!this.h.isEmpty()) {
            Label_0342:
                for (final Map.Entry<K, ArrayList> entry : this.h.entrySet()) {
                    final ArrayList list = entry.getValue();
                    final int size = list.size();
                    int i = 0;
                    while (i < size) {
                        final oja oja = (oja)list.get(i);
                        try {
                            this.nativeMovePacketToInputStream(this.b, (String)entry.getKey(), oja.a.getNativeHandle(), oja.b);
                            oja.a.release();
                            ++i;
                            continue;
                        }
                        catch (final MediaPipeException ex) {
                            Graph.a.b().E(3160).x("AddPacket for stream: %s failed: %s.", entry.getKey(), ex.getMessage());
                            throw ex;
                        }
                        break Label_0342;
                    }
                }
                this.h.clear();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void i() {
        monitorenter(this);
        try {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called already.");
            final Iterator iterator = this.d.entrySet().iterator();
            while (iterator.hasNext()) {
                ((Map.Entry<K, Packet>)iterator.next()).getValue().release();
            }
            this.d.clear();
            for (final Map.Entry<K, Packet> entry : this.e.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().release();
                }
            }
            this.e.clear();
            final Iterator iterator3 = this.h.entrySet().iterator();
            while (iterator3.hasNext()) {
                final ArrayList list = ((Map.Entry<K, ArrayList>)iterator3.next()).getValue();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((oja)list.get(i)).a.release();
                }
            }
            this.h.clear();
            synchronized (this.i) {
                final long b = this.b;
                if (b != 0L) {
                    this.nativeReleaseGraph(b);
                    this.b = 0L;
                }
                monitorexit(this.i);
                this.c.clear();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void j() {
        synchronized (this) {
            njo.p(this.b != 0L, "Invalid context, tearDown() might have been called.");
            this.nativeWaitUntilGraphDone(this.b);
        }
    }
    
    public final void k(final String s) {
        synchronized (this) {
            final long b = this.b;
            final boolean b2 = true;
            njo.p(b != 0L, "Invalid context, tearDown() might have been called.");
            s.getClass();
            njo.o(!this.g && !this.f && b2);
            this.nativeAddSurfaceOutput(this.b, s);
        }
    }
}
