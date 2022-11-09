import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvz
{
    public final UUID a;
    public final njn b;
    public final List c;
    public final List d;
    public final nju e;
    public int f;
    
    public bvz(final nju e) {
        this.a = UUID.randomUUID();
        this.f = 0;
        this.d = new ArrayList();
        this.c = new ArrayList();
        this.b = njn.b(e);
        this.e = e;
    }
}
