import java.util.concurrent.locks.Lock;
import java.lang.reflect.Method;
import java.util.ArrayList;
import androidx.window.sidecar.SidecarDisplayFeature;
import java.util.Iterator;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;
import androidx.window.sidecar.SidecarInterface$SidecarCallback;
import android.os.IBinder;
import android.view.View$OnAttachStateChangeListener;
import android.app.Activity;
import java.util.LinkedHashMap;
import androidx.window.sidecar.SidecarProvider;
import android.content.Context;
import java.util.Map;
import androidx.window.sidecar.SidecarInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aib implements ahp
{
    private final SidecarInterface a;
    private final ahw b;
    private final Map c;
    private aho d;
    
    public aib(final Context context) {
        final SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context);
        final ahw b = new ahw();
        this.a = sidecarImpl;
        this.b = b;
        this.c = new LinkedHashMap();
    }
    
    @Override
    public final void a(final Activity activity) {
        final IBinder c = aal.c(activity);
        if (c != null) {
            this.e(c, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ahz(this, activity));
    }
    
    @Override
    public final void b(final Activity activity) {
        final IBinder c = aal.c(activity);
        if (c == null) {
            return;
        }
        final SidecarInterface a = this.a;
        if (a != null) {
            a.onWindowLayoutChangeListenerRemoved(c);
        }
        final int size = this.c.size();
        this.c.remove(c);
        if (size == 1) {
            final SidecarInterface a2 = this.a;
            if (a2 != null) {
                a2.onDeviceStateListenersChanged(true);
            }
        }
    }
    
    @Override
    public final void c(final aho aho) {
        this.d = new ahx(aho);
        final SidecarInterface a = this.a;
        if (a == null) {
            return;
        }
        a.setSidecarCallback((SidecarInterface$SidecarCallback)new ahy(this.b, (SidecarInterface$SidecarCallback)new aia(this)));
    }
    
    public final aif d(final Activity activity) {
        final IBinder c = aal.c(activity);
        if (c == null) {
            return new aif(pja.a);
        }
        final SidecarInterface a = this.a;
        SidecarDeviceState deviceState = null;
        SidecarWindowLayoutInfo windowLayoutInfo;
        if (a == null) {
            windowLayoutInfo = null;
        }
        else {
            windowLayoutInfo = a.getWindowLayoutInfo(c);
        }
        final SidecarInterface a2 = this.a;
        if (a2 != null) {
            deviceState = a2.getDeviceState();
        }
        SidecarDeviceState sidecarDeviceState = deviceState;
        if (deviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return ahw.b(windowLayoutInfo, sidecarDeviceState);
    }
    
    public final void e(final IBinder binder, final Activity activity) {
        this.c.put(binder, activity);
        Object o = this.a;
        if (o != null) {
            ((SidecarInterface)o).onWindowLayoutChangeListenerAdded(binder);
        }
        if (this.c.size() == 1) {
            final SidecarInterface a = this.a;
            if (a != null) {
                a.onDeviceStateListenersChanged(false);
            }
        }
        final aho d = this.d;
        if (d == null) {
            return;
        }
        final aif d2 = this.d(activity);
        final ahx ahx = (ahx)d;
        o = ahx.b;
        ((Lock)o).lock();
        try {
            if (plr.b(d2, ((ahx)d).c.get(activity))) {
                ((Lock)o).unlock();
                return;
            }
            final aif aif = ((ahx)d).c.put(activity, d2);
            ((Lock)o).unlock();
            final Iterator iterator = ((ahr)ahx.a).a.d.iterator();
            while (iterator.hasNext()) {
                o = iterator.next();
                if (plr.b(((aht)o).a, activity)) {
                    ((aht)o).a(d2);
                }
            }
        }
        finally {
            ((Lock)o).unlock();
            while (true) {}
        }
    }
    
    public final boolean f() {
        boolean b = false;
        try {
            final SidecarInterface a = this.a;
            final Object o = null;
            Method method;
            if (a == null) {
                method = null;
            }
            else {
                final Class<? extends SidecarInterface> class1 = a.getClass();
                if (class1 == null) {
                    method = null;
                }
                else {
                    method = class1.getMethod("setSidecarCallback", SidecarInterface$SidecarCallback.class);
                }
            }
            Object returnType;
            if (method == null) {
                returnType = null;
            }
            else {
                returnType = method.getReturnType();
            }
            if (!plr.b(returnType, Void.TYPE)) {
                throw new NoSuchMethodException(plr.a("Illegal return type for 'setSidecarCallback': ", returnType));
            }
            final SidecarInterface a2 = this.a;
            if (a2 != null) {
                a2.getDeviceState();
            }
            final SidecarInterface a3 = this.a;
            if (a3 != null) {
                a3.onDeviceStateListenersChanged(true);
            }
            final SidecarInterface a4 = this.a;
            Method method2;
            if (a4 == null) {
                method2 = null;
            }
            else {
                final Class<? extends SidecarInterface> class2 = a4.getClass();
                if (class2 == null) {
                    method2 = null;
                }
                else {
                    method2 = class2.getMethod("getWindowLayoutInfo", IBinder.class);
                }
            }
            Object returnType2;
            if (method2 == null) {
                returnType2 = null;
            }
            else {
                returnType2 = method2.getReturnType();
            }
            if (!plr.b(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(plr.a("Illegal return type for 'getWindowLayoutInfo': ", returnType2));
            }
            final SidecarInterface a5 = this.a;
            Method method3;
            if (a5 == null) {
                method3 = null;
            }
            else {
                final Class<? extends SidecarInterface> class3 = a5.getClass();
                if (class3 == null) {
                    method3 = null;
                }
                else {
                    method3 = class3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                }
            }
            Object returnType3;
            if (method3 == null) {
                returnType3 = null;
            }
            else {
                returnType3 = method3.getReturnType();
            }
            if (plr.b(returnType3, Void.TYPE)) {
                final SidecarInterface a6 = this.a;
                Method method4;
                if (a6 == null) {
                    method4 = null;
                }
                else {
                    final Class<? extends SidecarInterface> class4 = a6.getClass();
                    if (class4 == null) {
                        method4 = null;
                    }
                    else {
                        method4 = class4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                    }
                }
                Object returnType4;
                if (method4 == null) {
                    returnType4 = o;
                }
                else {
                    returnType4 = method4.getReturnType();
                }
                if (plr.b(returnType4, Void.TYPE)) {
                    final SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                    Label_0393: {
                        try {
                            sidecarDeviceState.posture = 3;
                            break Label_0393;
                        }
                        catch (final NoSuchFieldError noSuchFieldError) {
                            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                            final Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class<?>[])new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                            if (invoke != null) {
                                if ((int)invoke == 3) {
                                    final SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                                    sidecarDisplayFeature.getRect().getClass();
                                    sidecarDisplayFeature.getType();
                                    final SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                                    try {
                                        final List displayFeatures = sidecarWindowLayoutInfo.displayFeatures;
                                        return b;
                                    }
                                    catch (final NoSuchFieldError noSuchFieldError2) {
                                        final ArrayList list = new ArrayList();
                                        list.add(sidecarDisplayFeature);
                                        SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, list);
                                        final Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class<?>[])new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                                        if (invoke2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                        }
                                        if (plr.b(list, invoke2)) {
                                            return b;
                                        }
                                        throw new Exception("Invalid display feature getter/setter");
                                    }
                                }
                                throw new Exception("Invalid device posture getter/setter");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    }
                }
                throw new NoSuchMethodException(plr.a("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType4));
            }
            throw new NoSuchMethodException(plr.a("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType3));
        }
        finally {
            b = false;
        }
        return b;
    }
}
