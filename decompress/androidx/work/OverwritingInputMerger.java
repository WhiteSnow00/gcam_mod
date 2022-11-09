// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends aiu
{
    @Override
    public final aiq a(final List list) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            hashMap2.putAll(((aiq)iterator.next()).b());
        }
        cwx.d(hashMap2, hashMap);
        return cwx.c(hashMap);
    }
}
