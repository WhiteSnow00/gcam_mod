import java.lang.reflect.Method;
import java.util.List;
import androidx.window.extensions.ExtensionWindowLayoutInfo;
import java.util.ArrayList;
import androidx.window.extensions.ExtensionFoldingFeature;
import android.graphics.Rect;
import androidx.window.extensions.ExtensionInterface$ExtensionCallback;
import android.app.Activity;
import androidx.window.extensions.ExtensionProvider;
import android.content.Context;
import androidx.window.extensions.ExtensionInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahn implements ahp
{
    private final ExtensionInterface a;
    private final xn b;
    
    public ahn(final Context context) {
        final ExtensionInterface extensionImpl = ExtensionProvider.getExtensionImpl(context);
        final xn b = new xn(aii.a);
        this.a = extensionImpl;
        this.b = b;
        if (extensionImpl != null) {
            return;
        }
        throw new IllegalArgumentException("Extension provider returned null".toString());
    }
    
    @Override
    public final void a(final Activity activity) {
        final ExtensionInterface a = this.a;
        if (a == null) {
            return;
        }
        a.onWindowLayoutChangeListenerAdded(activity);
    }
    
    @Override
    public final void b(final Activity activity) {
        final ExtensionInterface a = this.a;
        if (a == null) {
            return;
        }
        a.onWindowLayoutChangeListenerRemoved(activity);
    }
    
    @Override
    public final void c(final aho aho) {
        final ahq ahq = new ahq(aho, this.b, null, null);
        final ExtensionInterface a = this.a;
        if (a == null) {
            return;
        }
        a.setExtensionCallback((ExtensionInterface$ExtensionCallback)ahq);
    }
    
    public final boolean d() {
        boolean b = false;
        try {
            final ExtensionInterface a = this.a;
            final Object o = null;
            Method method;
            if (a == null) {
                method = null;
            }
            else {
                final Class<? extends ExtensionInterface> class1 = a.getClass();
                if (class1 == null) {
                    method = null;
                }
                else {
                    method = class1.getMethod("setExtensionCallback", ExtensionInterface$ExtensionCallback.class);
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
                throw new NoSuchMethodException(plr.a("Illegal return type for 'setExtensionCallback': ", returnType));
            }
            final ExtensionInterface a2 = this.a;
            Method method2;
            if (a2 == null) {
                method2 = null;
            }
            else {
                final Class<? extends ExtensionInterface> class2 = a2.getClass();
                if (class2 == null) {
                    method2 = null;
                }
                else {
                    method2 = class2.getMethod("onWindowLayoutChangeListenerAdded", Activity.class);
                }
            }
            Object returnType2;
            if (method2 == null) {
                returnType2 = null;
            }
            else {
                returnType2 = method2.getReturnType();
            }
            if (!plr.b(returnType2, Void.TYPE)) {
                throw new NoSuchMethodException(plr.a("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType2));
            }
            final ExtensionInterface a3 = this.a;
            Method method3;
            if (a3 == null) {
                method3 = null;
            }
            else {
                final Class<? extends ExtensionInterface> class3 = a3.getClass();
                if (class3 == null) {
                    method3 = null;
                }
                else {
                    method3 = class3.getMethod("onWindowLayoutChangeListenerRemoved", Activity.class);
                }
            }
            Object returnType3;
            if (method3 == null) {
                returnType3 = o;
            }
            else {
                returnType3 = method3.getReturnType();
            }
            if (!plr.b(returnType3, Void.TYPE)) {
                throw new NoSuchMethodException(plr.a("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType3));
            }
            new ExtensionFoldingFeature(new Rect(0, 0, 100, 0), 1, 1).getBounds().getClass();
            new ExtensionWindowLayoutInfo((List)new ArrayList()).getDisplayFeatures().getClass();
        }
        finally {
            b = false;
        }
        return b;
    }
}
