import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzw extends bjf implements IInterface
{
    private final jyw a;
    private final nju b;
    private final Object c;
    private boolean d;
    
    public jzw() {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
    }
    
    public jzw(final jyw a, final nju b) {
        super("com.google.android.gms.learning.internal.IExampleStoreIteratorV2");
        this.c = new Object();
        this.d = false;
        this.a = a;
        this.b = b;
    }
    
    public final void b() {
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
                return;
            }
            this.d = true;
            this.a.close();
        }
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        boolean b = false;
        Label_0218: {
            jzv jzv = null;
            switch (n) {
                default: {
                    return false;
                }
                case 4: {
                    this.b();
                    break Label_0218;
                }
                case 3: {
                    parcel.readInt();
                    synchronized (this.c) {
                        if (this.d) {
                            Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
                            break Label_0218;
                        }
                        this.a.b();
                        break Label_0218;
                    }
                }
                case 2: {
                    final IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder == null) {
                        jzv = null;
                    }
                    else {
                        final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreIteratorCallbackV2");
                        if (queryLocalInterface instanceof jzv) {
                            jzv = (jzv)queryLocalInterface;
                        }
                        else {
                            jzv = new jzv(strongBinder);
                        }
                    }
                    if (jzv != null) {
                        b = true;
                        break;
                    }
                    break;
                }
            }
            njo.d(b);
            synchronized (this.c) {
                if (this.d) {
                    Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
                    monitorexit(this.c);
                }
                else {
                    this.a.a(new jzt(this, jzv, this.b));
                    monitorexit(this.c);
                }
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
