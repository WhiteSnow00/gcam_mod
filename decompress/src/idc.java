import java.util.Set;
import java.util.HashMap;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public enum idc
{
    a("MANUAL_FPS_30_1X", 0, idb.a, 30, new double[] { 30.0, 6.0, 3.0, 1.0, 0.25 }), 
    b("MANUAL_FPS_60_2X", 1, idb.a, 60, new double[] { 60.0, 8.0, 4.0, 1.0, 0.25 });
    
    public final nnh c;
    public final idb d;
    public final int e;
    public final int f;
    
    private idc(final String s, int i, final idb idb, int ordinal, final double... array) {
        this.e = ordinal;
        this.f = 30;
        this.d = idb.b;
        ordinal = idb.ordinal();
        final HashMap h = nqb.h(5);
        for (i = 0; i < 5; ++i) {
            h.put(idb.values()[i + ordinal], array[i]);
        }
        final Set entrySet = h.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        }
        else {
            i = 4;
        }
        final nnf nnf = new nnf(i);
        nnf.c(entrySet);
        this.c = nnf.a();
    }
    
    public static kmt d(final idc idc) {
        for (final kmt kmt : kmt.values()) {
            final int e = idc.e;
            if (e == kmt.i && idc.f == kmt.j && e == kmt.k) {
                return kmt;
            }
        }
        throw new IllegalArgumentException("No camcorderCaptureRate found.");
    }
    
    public final double a(final double n) {
        for (final idb idb : idb.values()) {
            if (this.c.containsKey(idb)) {
                if ((double)this.c.get(idb) == n) {
                    final double n2 = this.f;
                    Double.isNaN(n2);
                    return n2 / n;
                }
            }
        }
        final StringBuilder sb = new StringBuilder(51);
        sb.append("Capture rate ");
        sb.append(n);
        sb.append(" is not valid.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final double b() {
        if (this.c.containsKey(this.d)) {
            return (double)this.c.get(this.d);
        }
        final Double n = (Double)this.c.get(idb.a);
        n.getClass();
        return n;
    }
    
    public final idb c(final double n) {
        for (final idb idb : idb.values()) {
            if (this.c.containsKey(idb)) {
                if ((double)this.c.get(idb) == n) {
                    return idb;
                }
            }
        }
        final StringBuilder sb = new StringBuilder(51);
        sb.append("Capture rate ");
        sb.append(n);
        sb.append(" is not valid.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final boolean e(final double n) {
        return this.c.containsValue(n);
    }
}
