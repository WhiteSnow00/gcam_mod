import java.util.NoSuchElementException;
import android.media.SoundPool;
import android.media.SoundPool$OnLoadCompleteListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class htt implements SoundPool$OnLoadCompleteListener
{
    final /* synthetic */ htw a;
    
    public htt(final htw a) {
        this.a = a;
    }
    
    public final void onLoadComplete(SoundPool b, int n, final int n2) {
        b = (SoundPool)this.a.b;
        monitorenter(b);
        try {
            final htw a = this.a;
            if (!a.d) {
                Object b2 = a.b;
                monitorenter(b2);
                boolean b3 = false;
                int i = 0;
                try {
                    while (i < a.c.size()) {
                        final htv htv = (htv)a.c.valueAt(i);
                        if (htv.b == n) {
                            monitorexit(b2);
                            n = htv.a;
                            n = htv.b;
                            monitorexit(b);
                            if (n2 == 0) {
                                b3 = true;
                            }
                            htv.c.o(b3);
                            return;
                        }
                        ++i;
                    }
                    monitorexit(b2);
                    final StringBuilder sb = new StringBuilder(45);
                    sb.append("SoundInfo for sampleId ");
                    sb.append(n);
                    sb.append(" not found.");
                    b2 = new NoSuchElementException(sb.toString());
                    throw b2;
                }
                finally {
                    monitorexit(b2);
                }
            }
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
}
