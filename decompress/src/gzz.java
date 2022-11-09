import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzz
{
    public static HashMap a(final has[] array) {
        final HashMap hashMap = new HashMap();
        for (final has has : array) {
            if (has.f.g()) {
                hashMap.put((int)has.a, has.f.c());
            }
        }
        return hashMap;
    }
}
