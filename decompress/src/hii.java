import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hii
{
    public final kse a;
    public final HashSet b;
    public boolean c;
    public final List d;
    
    public hii() {
        this(new ksb());
    }
    
    public hii(final kse a) {
        this.b = new HashSet();
        this.c = false;
        this.d = new ArrayList();
        this.a = a;
    }
    
    public final void a() {
        this.a.f("#notifyListeners");
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList(this.d);
            this.d.clear();
            monitorexit(this);
            for (int size = list.size(), i = 0; i < size; ++i) {
                ((gth)list.get(i)).a.close();
            }
            this.a.g();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean b() {
        return this.c && this.b.isEmpty();
    }
}
