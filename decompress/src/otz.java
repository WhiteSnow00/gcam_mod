import android.os.Parcelable;
import android.util.Log;
import android.os.Parcel;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otz extends bjf implements IInterface
{
    private final WeakReference a;
    private final /* synthetic */ int b;
    
    public otz() {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
    }
    
    public otz(final ControllerServiceBridge controllerServiceBridge) {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.a = new WeakReference((T)controllerServiceBridge);
    }
    
    public otz(final otv otv, final int b) {
        this.b = b;
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.a = new WeakReference((T)otv);
    }
    
    @Override
    protected final boolean x(int n, final Parcel parcel, final Parcel parcel2) {
        final int b = this.b;
        final boolean b2 = false;
        boolean b3 = false;
        switch (b) {
            default: {
                boolean b4 = false;
                switch (n) {
                    default: {
                        b4 = b2;
                        break;
                    }
                    case 12: {
                        final otm otm = (otm)bjg.a(parcel, otm.CREATOR);
                        final otv otv = (otv)this.a.get();
                        if (otv == null) {
                            b4 = true;
                            break;
                        }
                        n = ControllerServiceBridge.h;
                        if (otm.g != 0L) {
                            final long n2 = otm.a() - otm.g;
                            if (n2 > 300L) {
                                final StringBuilder sb = new StringBuilder(122);
                                sb.append("Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: ");
                                sb.append(n2);
                                Log.w("VrCtl.ServiceBridge", sb.toString());
                            }
                        }
                        otm.e(otv.c);
                        otv.a.b(otm);
                        otm.d();
                        b4 = true;
                        break;
                    }
                    case 11: {
                        final otq otq = (otq)bjg.a(parcel, otq.CREATOR);
                        final otv otv2 = (otv)this.a.get();
                        if (otv2 == null) {
                            b4 = true;
                            break;
                        }
                        otq.e = otv2.c;
                        otv2.a.c(otq);
                        return true;
                    }
                    case 10: {
                        final otn otn = (otn)bjg.a(parcel, otn.CREATOR);
                        final otv otv3 = (otv)this.a.get();
                        if (otv3 == null) {
                            b4 = true;
                            break;
                        }
                        otn.e(otv3.c);
                        otv3.a.a(otn);
                        otn.d();
                        return true;
                    }
                    case 9: {
                        final otv otv4 = (otv)this.a.get();
                        Object b5;
                        if (otv4 == null) {
                            b5 = null;
                        }
                        else {
                            b5 = otv4.b;
                        }
                        parcel2.writeNoException();
                        bjg.d(parcel2, (Parcelable)b5);
                        b4 = true;
                        break;
                    }
                    case 2: {
                        final int int1 = parcel.readInt();
                        n = parcel.readInt();
                        final otv otv5 = (otv)this.a.get();
                        if (otv5 == null) {
                            b4 = true;
                            break;
                        }
                        otv5.a.d(int1, n);
                        return true;
                    }
                    case 1: {
                        parcel2.writeNoException();
                        parcel2.writeInt(25);
                        return true;
                    }
                }
                return b4;
            }
            case 0: {
                switch (n) {
                    case 2: {
                        n = parcel.readInt();
                        final ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge)this.a.get();
                        if (controllerServiceBridge != null && n == 1) {
                            controllerServiceBridge.b.post((Runnable)new ott(controllerServiceBridge, 2));
                            return true;
                        }
                        b3 = true;
                        break;
                    }
                    case 1: {
                        parcel2.writeNoException();
                        parcel2.writeInt(25);
                        return true;
                    }
                }
                return b3;
            }
        }
    }
}
