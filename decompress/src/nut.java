import dalvik.system.VMStack;
import android.util.Log;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nut extends nuj
{
    private static final boolean a;
    private static final boolean b;
    private static final nui c;
    
    static {
        a = nus.a();
        final String fingerprint = Build.FINGERPRINT;
        boolean b2 = true;
        if (fingerprint != null) {
            if (!"robolectric".equals(Build.FINGERPRINT)) {
                b2 = false;
            }
        }
        b = b2;
        Log.class.getName();
        c = new nur();
    }
    
    static Class o() {
        return VMStack.getStackClass2();
    }
    
    static String p() {
        try {
            return VMStack.getStackClass2().getName();
        }
        finally {
            return null;
        }
    }
    
    static boolean s() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", (Class<?>[])new Class[0]);
            return nus.class.getName().equals(p());
        }
        finally {
            return false;
        }
    }
    
    @Override
    protected ntl d(final String s) {
        ntl a;
        if (nuw.a.get() != null) {
            a = nuw.a.get().a(s);
        }
        else {
            a = new nuw(s.replace('$', '.'));
            nuu.a.offer(a);
            if (nuw.a.get() != null) {
                nuw.e();
                return a;
            }
        }
        return a;
    }
    
    @Override
    protected nui g() {
        return nut.c;
    }
    
    @Override
    protected nvb i() {
        return nux.a;
    }
    
    @Override
    protected String l() {
        return "platform: Android";
    }
}
