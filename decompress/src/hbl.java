import java.util.Iterator;
import android.os.Parcel;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbl extends bjf implements IInterface
{
    final /* synthetic */ RemoteControlService a;
    
    public hbl() {
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
    }
    
    public hbl(final RemoteControlService a) {
        this.a = a;
        super("com.google.android.apps.camera.remotecontrol.IRemoteControlService");
    }
    
    public final boolean b() {
        final RemoteControlService a = this.a;
        final boolean b = a.b.c > 0;
        return a.f() && b;
    }
    
    @Override
    protected final boolean x(int n, final Parcel parcel, final Parcel parcel2) {
        boolean b = false;
        Label_0660: {
            switch (n) {
                default: {
                    return false;
                }
                case 8: {
                    final float float1 = parcel.readFloat();
                    if (this.a.f()) {
                        final hbm c = this.a.c();
                        c.f = float1;
                        c.g = System.currentTimeMillis();
                        final Iterator iterator = c.h.iterator();
                        while (iterator.hasNext()) {
                            ((itf)iterator.next()).a.f(float1);
                        }
                        break;
                    }
                    break;
                }
                case 7: {
                    final float float2 = parcel.readFloat();
                    if (this.a.f()) {
                        final hbm c2 = this.a.c();
                        c2.d = float2;
                        c2.e = System.currentTimeMillis();
                        final Iterator iterator2 = c2.h.iterator();
                        while (iterator2.hasNext()) {
                            ((itf)iterator2.next()).a.c(float2);
                        }
                        break;
                    }
                    break;
                }
                case 6: {
                    n = parcel.readInt();
                    if (!this.a.f()) {
                        break;
                    }
                    if (n >= 0 && n <= 100) {
                        final hbm c3 = this.a.c();
                        c3.c = n;
                        final Iterator iterator3 = c3.h.iterator();
                        while (iterator3.hasNext()) {
                            ((itf)iterator3.next()).a.b(n);
                        }
                        break;
                    }
                    RemoteControlService.a.b().E(2229).p("Ignoring invalid value for external case battery: %d", n);
                    break;
                }
                case 5: {
                    n = parcel.readInt();
                    final boolean f = bjg.f(parcel);
                    if (!this.a.f()) {
                        break;
                    }
                    final boolean b2 = this.b();
                    if (!b2 && n != 5) {
                        if (n != 6) {
                            break;
                        }
                    }
                    else {
                        switch (n) {
                            default: {
                                a.l(RemoteControlService.a.b(), "handleRemoteKeyEvent: Unknown Key event received. Ignoring it.", '\u08b4');
                                break Label_0660;
                            }
                            case 7: {
                                this.a.d(7, f);
                                break Label_0660;
                            }
                            case 6: {
                                break;
                            }
                            case 5: {
                                if (b2) {
                                    this.a.d(5, f);
                                    break Label_0660;
                                }
                                if (f) {
                                    this.a.e(true);
                                    break Label_0660;
                                }
                                break Label_0660;
                            }
                            case 4: {
                                this.a.d(4, f);
                                break Label_0660;
                            }
                            case 3: {
                                this.a.d(3, f);
                                break Label_0660;
                            }
                            case 2: {
                                this.a.d(2, f);
                                break Label_0660;
                            }
                            case 1: {
                                this.a.d(1, f);
                                break Label_0660;
                            }
                        }
                    }
                    if (b2) {
                        this.a.d(6, f);
                        break;
                    }
                    if (f) {
                        this.a.e(false);
                        break;
                    }
                    break;
                }
                case 4: {
                    n = parcel.readInt();
                    if (this.a.f()) {
                        final RemoteControlService a = this.a;
                        a.d = n;
                        final hbm c4 = a.c();
                        if (0x1 == (this.a.d & 0x1)) {
                            b = true;
                        }
                        c4.b = b;
                        break;
                    }
                    break;
                }
                case 3: {
                    final boolean b3 = this.b();
                    parcel2.writeNoException();
                    bjg.b(parcel2, b3);
                    break;
                }
                case 2: {
                    final boolean f2 = this.a.f();
                    parcel2.writeNoException();
                    bjg.b(parcel2, f2);
                    break;
                }
                case 1: {
                    parcel2.writeNoException();
                    parcel2.writeInt(2);
                    break;
                }
            }
        }
        return true;
    }
}
