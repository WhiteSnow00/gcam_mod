import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppt
{
    private static final int a;
    private static final ReentrantReadWriteLock b;
    private static final WeakHashMap c;
    
    static {
        a = b(Throwable.class, -1);
        b = new ReentrantReadWriteLock();
        c = new WeakHashMap();
    }
    
    public static final Throwable a(Throwable a) {
        a.getClass();
        final boolean b = a instanceof pnu;
        final Throwable t = null;
        if (b) {
            Object a2;
            try {
                a = ((pnu)a).a();
            }
            finally {
                a2 = pip.a(a);
            }
            if (a2 instanceof pin) {
                a2 = t;
            }
            return (Throwable)a2;
        }
        final ReentrantReadWriteLock b2 = ppt.b;
        Object o = b2.readLock();
        ((ReentrantReadWriteLock.ReadLock)o).lock();
        try {
            final pky pky = ppt.c.get(a.getClass());
            ((ReentrantReadWriteLock.ReadLock)o).unlock();
            if (pky != null) {
                return (Throwable)pky.a(a);
            }
            final int a3 = ppt.a;
            o = a.getClass();
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            if (a3 != b((Class)o, 0)) {
                o = b2.readLock();
                int readHoldCount;
                if (b2.getWriteHoldCount() == 0) {
                    readHoldCount = b2.getReadHoldCount();
                }
                else {
                    readHoldCount = 0;
                }
                for (int i = 0; i < readHoldCount; ++i) {
                    ((ReentrantReadWriteLock.ReadLock)o).unlock();
                }
                final ReentrantReadWriteLock.WriteLock writeLock = b2.writeLock();
                writeLock.lock();
                try {
                    ppt.c.put(a.getClass(), pmt.e);
                    return null;
                }
                finally {
                    for (int j = n; j < readHoldCount; ++j) {
                        ((ReentrantReadWriteLock.ReadLock)o).lock();
                    }
                    writeLock.unlock();
                }
            }
            o = a.getClass().getConstructors();
            final nvf nvf = new nvf(3);
            o.getClass();
            o.getClass();
            final int length = ((T[])o).length;
            Object o2 = o;
            if (length != 0) {
                o = Arrays.copyOf((T[])o, length);
                o.getClass();
                o.getClass();
                o2 = o;
                if (((T[])o).length > 1) {
                    Arrays.sort((T[])o, nvf);
                    o2 = o;
                }
            }
            final Iterator iterator = pjf.s((Object[])o2).iterator();
            o = null;
            Object o3;
            do {
                o3 = o;
                if (!iterator.hasNext()) {
                    break;
                }
                final Constructor constructor = (Constructor)iterator.next();
                o = constructor.getParameterTypes();
                switch (((T[])o).length) {
                    default: {
                        o3 = null;
                        break;
                    }
                    case 2: {
                        if (plr.b(o[0], (Object)String.class) && plr.b(o[1], (Object)Throwable.class)) {
                            o3 = new pps(constructor, 1);
                            break;
                        }
                        o3 = null;
                        break;
                    }
                    case 1: {
                        o = o[0];
                        if (plr.b(o, Throwable.class)) {
                            o3 = new pps(constructor);
                            break;
                        }
                        if (plr.b(o, String.class)) {
                            o3 = new pps(constructor, 2);
                            break;
                        }
                        o3 = null;
                        break;
                    }
                    case 0: {
                        o3 = new pps(constructor, 3);
                        break;
                    }
                }
                o = o3;
            } while (o3 == null);
            o = ppt.b;
            final ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock)o).readLock();
            int readHoldCount2;
            if (((ReentrantReadWriteLock)o).getWriteHoldCount() == 0) {
                readHoldCount2 = ((ReentrantReadWriteLock)o).getReadHoldCount();
            }
            else {
                readHoldCount2 = 0;
            }
            for (int k = 0; k < readHoldCount2; ++k) {
                lock.unlock();
            }
            final ReentrantReadWriteLock.WriteLock writeLock2 = ((ReentrantReadWriteLock)o).writeLock();
            writeLock2.lock();
            try {
                final WeakHashMap c = ppt.c;
                final Class<? extends Throwable> class1 = a.getClass();
                if (o3 != null) {
                    o = o3;
                }
                else {
                    o = pmt.f;
                }
                c.put(class1, o);
                for (int l = n2; l < readHoldCount2; ++l) {
                    lock.lock();
                }
                writeLock2.unlock();
                if (o3 != null) {
                    return (Throwable)((pky)o3).a(a);
                }
                return null;
            }
            finally {
                for (int n4 = n3; n4 < readHoldCount2; ++n4) {
                    lock.lock();
                }
                writeLock2.unlock();
            }
        }
        finally {
            ((ReentrantReadWriteLock.ReadLock)o).unlock();
            while (true) {}
        }
    }
    
    private static final int b(Class clazz, final int n) {
        clazz.getClass();
        plu.b(clazz);
        int n2 = 0;
        Object a = null;
        try {
            Class superclass;
            int n5;
            do {
                final Field[] declaredFields = clazz.getDeclaredFields();
                final int length = declaredFields.length;
                int i = 0;
                int n3 = 0;
                while (i < length) {
                    int n4 = n3;
                    if (!Modifier.isStatic(declaredFields[i].getModifiers())) {
                        n4 = n3 + 1;
                    }
                    ++i;
                    n3 = n4;
                }
                n5 = n2 + n3;
                superclass = clazz.getSuperclass();
                n2 = n5;
            } while ((clazz = superclass) != null);
            n5;
        }
        finally {
            final Throwable t;
            a = pip.a(t);
        }
        Number value = (Number)a;
        if (a instanceof pin) {
            value = n;
        }
        return value.intValue();
    }
}
