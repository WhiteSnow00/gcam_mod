import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class hnq implements hhz
{
    final /* synthetic */ hnr a;
    private final Set b;
    
    public hnq(final hnr a) {
        this.a = a;
        this.b = new HashSet();
    }
    
    private final void a(final him him, final hio hio) {
        monitorenter(this);
        try {
            final hio a = hio.a;
            switch (hio.ordinal()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 12:
                case 14: {
                    if (this.b.add(him)) {
                        this.a.b.b(new hnp(this, 1));
                        break;
                    }
                    break;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void b(final him him) {
        synchronized (this) {
            if (this.b.remove(him)) {
                this.a.c.postDelayed((Runnable)new hnp(this), 3000L);
            }
        }
    }
    
    @Override
    public final void i(final him him) {
        this.b(him);
    }
    
    @Override
    public final void k(final him him) {
        this.b(him);
    }
    
    @Override
    public final void o(final him him, final hih hih, final hip hip) {
        this.a(him, hih.c);
    }
    
    @Override
    public final void v(final him him) {
        this.b(him);
    }
}
