import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class adz extends Handler
{
    final /* synthetic */ aec a;
    
    public adz(final aec a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                super.handleMessage(message);
                return;
            }
            case 1: {
                final aec a = this.a;
                while (true) {
                    Object b = a.b;
                    monitorenter(b);
                    try {
                        final int size = a.c.size();
                        if (size <= 0) {
                            monitorexit(b);
                            return;
                        }
                        final aea[] array = new aea[size];
                        a.c.toArray(array);
                        a.c.clear();
                        monitorexit(b);
                        for (int i = 0; i < size; ++i) {
                            b = array[i];
                            for (int size2 = ((aea)b).b.size(), j = 0; j < size2; ++j) {
                                final aeb aeb = ((aea)b).b.get(j);
                                if (!aeb.d) {
                                    aeb.b.onReceive(a.a, ((aea)b).a);
                                }
                            }
                        }
                    }
                    finally {
                        monitorexit(b);
                        while (true) {}
                    }
                }
                break;
            }
        }
    }
}
