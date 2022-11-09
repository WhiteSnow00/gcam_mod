import com.google.android.apps.lightcycle.panorama.NewTarget;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import j$.util.DesugarCollections;
import java.util.TreeMap;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ete
{
    public static final float a;
    public static final float b;
    public final Context c;
    public final Map d;
    public esc e;
    public esc f;
    public etr g;
    public etq h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public float[] l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public etp q;
    public final etd r;
    public boolean s;
    public boolean t;
    public float u;
    public long v;
    public final float[] w;
    public etc x;
    
    static {
        a = f(22.0f);
        b = f(12.0f);
    }
    
    public ete(final Context c) {
        this.d = DesugarCollections.synchronizedMap((Map)new TreeMap());
        this.i = new float[] { 0.0f, 0.0f, -1.0f, 1.0f };
        this.j = new float[4];
        this.k = new float[16];
        this.l = null;
        this.o = 0.0f;
        this.p = false;
        this.q = null;
        this.r = new etd();
        this.s = true;
        this.t = true;
        this.u = 0.1f;
        this.v = 0L;
        this.w = new float[16];
        this.c = c;
    }
    
    public static void c(final float[] array) {
        array[0] /= array[3];
        array[1] /= array[3];
        array[2] /= array[3];
        array[3] = 1.0f;
    }
    
    private static float f(final float n) {
        return n * 0.017453292f;
    }
    
    private static void g(final float[] array, final float[] array2) {
        array2[0] = array[0];
        array2[1] = array[1];
        array2[2] = array[2];
        array2[3] = 0.0f;
        array2[4] = array[3];
        array2[5] = array[4];
        array2[6] = array[5];
        array2[7] = 0.0f;
        array2[8] = array[6];
        array2[9] = array[7];
        array2[10] = array[8];
        array2[12] = (array2[11] = 0.0f);
        array2[14] = (array2[13] = 0.0f);
        array2[15] = 1.0f;
    }
    
    public final void a() {
        Object a = esh.a;
        monitorenter(a);
        try {
            if (!esh.b) {
                throw new IllegalStateException("State is not ready.");
            }
            final NewTarget[] getTargets = LightCycleNative.GetTargets();
            monitorexit(a);
            final float[] array = new float[16];
            this.d.clear();
            if (getTargets == null) {
                return;
            }
            for (int length = getTargets.length, i = 0; i < length; ++i) {
                a = getTargets[i];
                g(((NewTarget)a).orientation, array);
                this.d.put(((NewTarget)a).key, array.clone());
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void b(final float[] array) {
        this.d();
        Object a = esh.a;
        monitorenter(a);
        try {
            if (esh.b) {
                final NewTarget[] initTargets = LightCycleNative.InitTargets(array);
                monitorexit(a);
                if (initTargets != null) {
                    for (int length = initTargets.length, i = 0; i < length; ++i) {
                        a = new float[16];
                        g(initTargets[i].orientation, (float[])a);
                        this.d.put(initTargets[i].key, a);
                    }
                }
                this.s = true;
                this.t = true;
                this.u = 0.1f;
                this.v = 0L;
                return;
            }
            throw new IllegalStateException("State is not ready.");
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void d() {
        this.d.clear();
        esh.k();
    }
    
    public final void e(final int n) {
        boolean p = true;
        if (n != 3) {
            p = (n == 4 && p);
        }
        this.p = p;
    }
}
