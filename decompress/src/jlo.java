import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlo extends jlr
{
    private static List b;
    
    static {
        jlo.b = new ArrayList();
    }
    
    public jlo(final jmf jmf) {
        super(jmf);
        new HashSet();
    }
    
    public static void a() {
        monitorenter(jlo.class);
        try {
            final List b = jlo.b;
            if (b != null) {
                final Iterator iterator = b.iterator();
                while (iterator.hasNext()) {
                    ((Runnable)iterator.next()).run();
                }
                jlo.b = null;
            }
            monitorexit(jlo.class);
        }
        finally {
            monitorexit(jlo.class);
            while (true) {}
        }
    }
}
