import java.util.ArrayList;
import android.os.ConditionVariable;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class eht
{
    final dxh a;
    final gtn b;
    final int c;
    final lkb d;
    final ofn e;
    final List f;
    final ofn g;
    final ofn h;
    final ConditionVariable i;
    final List j;
    int k;
    int l;
    long m;
    ehz n;
    
    public eht(final dxh a, final gtn b, final int c, final lkb d, final ofn e) {
        this.n = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new ArrayList();
        this.k = 0;
        this.l = 0;
        this.m = b.b.b.d();
        this.g = ofn.f();
        this.h = ofn.f();
        this.i = new ConditionVariable(true);
        this.j = new ArrayList();
    }
}
