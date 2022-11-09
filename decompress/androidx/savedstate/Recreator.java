// 
// Decompiled by Procyon v0.6.0
// 

package androidx.savedstate;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import android.os.Bundle;

public final class Recreator implements j
{
    private final aex a;
    
    public Recreator(final aex a) {
        this.a = a;
    }
    
    @Override
    public final void a(k k, g subclass) {
        if (subclass != g.a) {
            throw new AssertionError((Object)"Next event must be ON_CREATE");
        }
        k.aD().d(this);
        final Bundle a = this.a.A().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        final ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            final int size = stringArrayList.size();
            int i = 0;
            while (i < size) {
                k = (k)stringArrayList.get(i);
                try {
                    subclass = (g)Class.forName((String)k, false, Recreator.class.getClassLoader()).asSubclass(aet.class);
                    try {
                        final Constructor<Object> declaredConstructor = ((Class<Object>)subclass).getDeclaredConstructor((Class<?>[])new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            subclass = (g)declaredConstructor.newInstance(new Object[0]);
                            ((aet)subclass).a();
                            ++i;
                        }
                        catch (final Exception ex) {
                            subclass = (g)new StringBuilder();
                            ((StringBuilder)subclass).append("Failed to instantiate ");
                            ((StringBuilder)subclass).append((String)k);
                            throw new RuntimeException(((StringBuilder)subclass).toString(), ex);
                        }
                    }
                    catch (final NoSuchMethodException ex2) {
                        k = (k)new StringBuilder();
                        ((StringBuilder)k).append("Class");
                        ((StringBuilder)k).append(((Class)subclass).getSimpleName());
                        ((StringBuilder)k).append(" must have default constructor in order to be automatically recreated");
                        throw new IllegalStateException(((StringBuilder)k).toString(), ex2);
                    }
                }
                catch (final ClassNotFoundException ex3) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Class ");
                    sb.append((String)k);
                    sb.append(" wasn't found");
                    throw new RuntimeException(sb.toString(), ex3);
                }
                break;
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
}
