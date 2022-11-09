import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class klh
{
    public final List a;
    public boolean b;
    public final kri c;
    public final Executor d;
    
    public klh(final kli kli, final kri c, final Executor d) {
        this.c = c;
        this.d = d;
        this.a = new ArrayList();
        for (int i = 0; i < kli.a.size(); ++i) {
            this.a.add(null);
        }
        this.b = false;
    }
}
