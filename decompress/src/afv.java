// 
// Decompiled by Procyon v0.6.0
// 

class afv extends acv
{
    protected gy[] m;
    String n;
    int o;
    int p;
    
    public afv() {
        this.m = null;
        this.o = 0;
    }
    
    public afv(final afv afv) {
        this.m = null;
        this.o = 0;
        this.n = afv.n;
        final int p = afv.p;
        this.p = 0;
        this.m = gz.b(afv.m);
    }
    
    public gy[] getPathData() {
        return this.m;
    }
    
    public String getPathName() {
        return this.n;
    }
    
    public boolean o() {
        return false;
    }
    
    public void setPathData(final gy[] array) {
        final gy[] m = this.m;
        Label_0151: {
            if (m != null) {
                if (array != null) {
                    if (m.length == array.length) {
                        for (int i = 0; i < m.length; ++i) {
                            final gy gy = m[i];
                            final char a = gy.a;
                            final gy gy2 = array[i];
                            if (a != gy2.a || gy.b.length != gy2.b.length) {
                                break Label_0151;
                            }
                        }
                        final gy[] j = this.m;
                        for (int k = 0; k < array.length; ++k) {
                            j[k].a = array[k].a;
                            int n = 0;
                            while (true) {
                                final float[] b = array[k].b;
                                if (n >= b.length) {
                                    break;
                                }
                                j[k].b[n] = b[n];
                                ++n;
                            }
                        }
                        return;
                    }
                }
            }
        }
        this.m = gz.b(array);
    }
}
