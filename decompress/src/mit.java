import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public class mit
{
    public static Object e(mno mno) {
        long clearCallingIdentity;
        try {
            mno = (mno)mno.a();
            return mno;
        }
        catch (final SecurityException ex) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            final mno mno2 = mno;
            final Object o = mno = (mno)mno2.a();
        }
        try {
            final mno mno2 = mno;
            mno = (mno)mno2.a();
            return mno;
        }
        finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
