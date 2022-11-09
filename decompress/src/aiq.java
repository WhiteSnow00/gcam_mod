import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import android.util.Log;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiq
{
    public static final aiq a;
    private static final String c;
    public Map b;
    
    static {
        c = aiy.b("Data");
        a = cwx.c(new HashMap());
    }
    
    aiq() {
    }
    
    public aiq(final aiq aiq) {
        this.b = new HashMap(aiq.b);
    }
    
    public aiq(final Map map) {
        this.b = new HashMap(map);
    }
    
    public static aiq a(byte[] ex) {
        if (ex.length <= 10240) {
            final HashMap hashMap = new HashMap();
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])(Object)ex);
            Exception ex2 = null;
            Label_0178: {
                try {
                    ex = (IOException)new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i = ((ObjectInputStream)ex).readInt(); i > 0; --i) {
                            hashMap.put(((ObjectInputStream)ex).readUTF(), ((ObjectInputStream)ex).readObject());
                        }
                        try {
                            ((ObjectInputStream)ex).close();
                        }
                        catch (final IOException ex) {
                            Log.e(aiq.c, "Error in Data#fromByteArray: ", (Throwable)ex);
                        }
                        try {
                            byteArrayInputStream.close();
                            break Label_0178;
                        }
                        catch (final IOException ex) {
                            Log.e(aiq.c, "Error in Data#fromByteArray: ", (Throwable)ex);
                            break Label_0178;
                        }
                    }
                    catch (final ClassNotFoundException ex2) {}
                    catch (final IOException ex2) {}
                    finally {
                        ex2 = ex;
                        final IOException ex3;
                        ex = ex3;
                    }
                }
                catch (final ClassNotFoundException ex4) {}
                catch (final IOException ex5) {}
                finally {
                    break Label_0178;
                }
                final IOException ex6 = null;
                ex2 = ex;
                ex = ex6;
                try {
                    Log.e(aiq.c, "Error in Data#fromByteArray: ", (Throwable)ex2);
                    if (ex != null) {
                        try {
                            ((ObjectInputStream)ex).close();
                        }
                        catch (final IOException ex) {
                            Log.e(aiq.c, "Error in Data#fromByteArray: ", (Throwable)ex);
                        }
                    }
                    byteArrayInputStream.close();
                    return new aiq(hashMap);
                }
                finally {
                    ex2 = ex;
                    final IOException ex7;
                    ex = ex7;
                }
            }
            if (ex2 != null) {
                try {
                    ((ObjectInputStream)ex2).close();
                }
                catch (final IOException ex8) {
                    Log.e(aiq.c, "Error in Data#fromByteArray: ", (Throwable)ex8);
                }
            }
            try {
                byteArrayInputStream.close();
            }
            catch (final IOException ex9) {
                Log.e(aiq.c, "Error in Data#fromByteArray: ", (Throwable)ex9);
            }
            throw ex;
        }
        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
    }
    
    public static byte[] c(aiq ex) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final IOException ex2 = null;
        final IOException ex3 = null;
        Label_0249: {
            try {
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(((aiq)ex).b.size());
                    for (final Map.Entry<String, V> entry : ((aiq)ex).b.entrySet()) {
                        objectOutputStream.writeUTF(entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    }
                    catch (final IOException ex4) {
                        Log.e(aiq.c, "Error in Data#toByteArray: ", (Throwable)ex4);
                    }
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (final IOException ex5) {
                        Log.e(aiq.c, "Error in Data#toByteArray: ", (Throwable)ex5);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                catch (final IOException ex2) {}
            }
            catch (final IOException ex2) {
                ex = ex3;
            }
            finally {
                ex = ex2;
                break Label_0249;
            }
            try {
                Log.e(aiq.c, "Error in Data#toByteArray: ", (Throwable)ex2);
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (ex != null) {
                    try {
                        ((ObjectOutputStream)ex).close();
                    }
                    catch (final IOException ex) {
                        Log.e(aiq.c, "Error in Data#toByteArray: ", (Throwable)ex);
                    }
                }
                try {
                    byteArrayOutputStream.close();
                }
                catch (final IOException ex) {
                    Log.e(aiq.c, "Error in Data#toByteArray: ", (Throwable)ex);
                }
                return byteArray;
            }
            finally {}
        }
        if (ex != null) {
            try {
                ((ObjectOutputStream)ex).close();
            }
            catch (final IOException ex6) {
                Log.e(aiq.c, "Error in Data#toByteArray: ", (Throwable)ex6);
            }
        }
        try {
            byteArrayOutputStream.close();
        }
        catch (final IOException ex7) {
            Log.e(aiq.c, "Error in Data#toByteArray: ", (Throwable)ex7);
        }
        throw;
    }
    
    public static Boolean[] d(final boolean[] array) {
        final Boolean[] array2 = new Boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Byte[] e(final byte[] array) {
        final Byte[] array2 = new Byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Double[] f(final double[] array) {
        final Double[] array2 = new Double[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Float[] g(final float[] array) {
        final Float[] array2 = new Float[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Integer[] h(final int[] array) {
        final Integer[] array2 = new Integer[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public static Long[] i(final long[] array) {
        final Long[] array2 = new Long[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
    
    public final Map b() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final aiq aiq = (aiq)o;
        final Set keySet = this.b.keySet();
        if (!keySet.equals(aiq.b.keySet())) {
            return false;
        }
        for (final String s : keySet) {
            final Object value = this.b.get(s);
            final Object value2 = aiq.b.get(s);
            boolean b;
            if (value != null && value2 != null) {
                if (value instanceof Object[] && value2 instanceof Object[]) {
                    b = Arrays.deepEquals((Object[])value, (Object[])value2);
                }
                else {
                    b = value.equals(value2);
                }
            }
            else {
                b = (value == value2);
            }
            if (!b) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Data {");
        if (!this.b.isEmpty()) {
            for (final String s : this.b.keySet()) {
                sb.append(s);
                sb.append(" : ");
                final Object value = this.b.get(s);
                if (value instanceof Object[]) {
                    sb.append(Arrays.toString((Object[])value));
                }
                else {
                    sb.append(value);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
