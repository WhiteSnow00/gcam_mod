import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dh
{
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e;
    
    public dh(final dd dd) {
        this.e = new ArrayList();
        this.a = dd.w;
        this.b = dd.x;
        this.c = dd.h();
        this.d = dd.d();
        final ArrayList q = dd.q;
        for (int size = q.size(), i = 0; i < size; ++i) {
            this.e.add(new dg((dc)q.get(i)));
        }
    }
}
