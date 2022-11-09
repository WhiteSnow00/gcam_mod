import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cxe
{
    public static final cxo a;
    public static final cxo b;
    private static final Map c;
    
    static {
        final nnt l = nnx.l();
        l.d(cxd.a, new cxc(0.0f, 0.0f, 0.0f));
        l.d(cxd.b, new cxc(83.0f, 83.0f, 65.0f));
        l.d(cxd.c, new cxc(77.0f, 77.0f, 65.0f));
        l.d(cxd.d, new cxc(80.9f, 76.9f, 65.0f));
        l.d(cxd.e, new cxc(74.0f, 74.0f, 55.0f));
        l.d(cxd.f, new cxc(540.0f, 63.0f, 55.0f));
        l.d(cxd.g, new cxc(722.0f, 73.0f, 70.0f));
        c = l.b();
        final cxn cxn = new cxn();
        cxn.a = "device_config";
        a = cxn.a();
        final cxn cxn2 = new cxn();
        cxn2.a = "camera.cutout_trial_size";
        b = cxn2.a();
    }
    
    public static cxc a(final cxl cxl, int intValue) {
        njo.q(intValue <= cxd.g.ordinal(), "Invalid device enum: %s", intValue);
        final cxc cxc = cxe.c.get(cxd.values()[intValue]);
        intValue = (int)cxl.a(cxe.b).c();
        if (cxc != null && intValue != 0) {
            return new cxc(cxc.a, cxc.b, intValue + 40.0f);
        }
        if (cxc != null) {
            return cxc;
        }
        return new cxc(0.0f, 0.0f, 0.0f);
    }
    
    public static void b(final cxq cxq, final liz liz) {
        cxq.o(cxe.b, 0);
        if (liz.e) {
            cxq.o(cxe.a, cxd.b.ordinal());
            return;
        }
        if (liz.g) {
            cxq.o(cxe.a, cxd.c.ordinal());
            return;
        }
        if (liz.f) {
            cxq.o(cxe.a, cxd.d.ordinal());
            return;
        }
        if (liz.h) {
            cxq.o(cxe.a, cxd.e.ordinal());
            return;
        }
        if (liz.i) {
            cxq.o(cxe.a, cxd.f.ordinal());
            return;
        }
        if (liz.j) {
            cxq.o(cxe.a, cxd.g.ordinal());
            return;
        }
        cxq.o(cxe.a, cxd.a.ordinal());
    }
}
