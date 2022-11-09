import java.util.concurrent.locks.ReentrantLock;
import android.content.ContextWrapper;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aig
{
    public final aie a;
    public final Activity b;
    
    public aig(Context baseContext) {
        final ahu a = ahu.a;
        final ahu a2 = ahu.a;
        final Activity activity = null;
        if (a2 == null) {
            final ReentrantLock b = ahu.b;
            b.lock();
            try {
                if (ahu.a == null) {
                    ahp ahp;
                    try {
                        if (cgq.h(xn.b())) {
                            if (!new ahn(baseContext).d()) {}
                        }
                    }
                    finally {
                        ahp = null;
                    }
                    ahp ahp2;
                    if ((ahp2 = ahp) == null) {
                        try {
                            if (cgq.h(xo.e()) && !new aib(baseContext).f()) {}
                        }
                        finally {
                            ahp2 = null;
                        }
                    }
                    ahu.a = new ahu(ahp2);
                }
            }
            finally {
                b.unlock();
            }
        }
        final ahu a3 = ahu.a;
        a3.getClass();
        a3.getClass();
        this.a = a3;
        final aii a4 = aii.a;
        while (true) {
            while (baseContext instanceof ContextWrapper) {
                if (baseContext instanceof Activity) {
                    final Activity b2 = (Activity)baseContext;
                    if (b2 != null) {
                        this.b = b2;
                        return;
                    }
                    throw new IllegalArgumentException("Used non-visual Context to obtain an instance of WindowManager. Please use an Activity or a ContextWrapper around one instead.");
                }
                else {
                    baseContext = ((ContextWrapper)baseContext).getBaseContext();
                }
            }
            final Activity b2 = activity;
            continue;
        }
    }
}
