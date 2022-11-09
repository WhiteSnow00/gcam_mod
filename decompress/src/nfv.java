import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class nfv implements Handler$Callback
{
    final /* synthetic */ nfx a;
    
    public nfv(final nfx a) {
        this.a = a;
    }
    
    public final boolean handleMessage(Message a) {
        switch (a.what) {
            default: {
                return false;
            }
            case 0: {
                final nfx a2 = this.a;
                final nfw nfw = (nfw)a.obj;
                a = (Message)a2.a;
                monitorenter(a);
                Label_0054: {
                    if (nfw == null) {
                        break Label_0054;
                    }
                    try {
                        monitorexit(a);
                        return true;
                        throw null;
                    }
                    finally {
                        monitorexit(a);
                    }
                }
                break;
            }
        }
    }
}
