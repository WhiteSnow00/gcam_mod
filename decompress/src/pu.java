import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import j$.util.concurrent.ConcurrentHashMap;
import android.graphics.RectF;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

final class pu
{
    public int a;
    public float b;
    public float c;
    public float d;
    public int[] e;
    public boolean f;
    public final TextView g;
    public final Context h;
    
    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
    
    public pu(final TextView g) {
        this.a = 0;
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = new int[0];
        this.f = false;
        this.g = g;
        this.h = g.getContext();
    }
    
    public static final int[] b(int[] array) {
        final int length = array.length;
        if (length == 0) {
            return array;
        }
        Arrays.sort(array);
        final ArrayList list = new ArrayList();
        final int n = 0;
        for (final int n2 : array) {
            if (n2 > 0) {
                final Integer value = n2;
                if (Collections.binarySearch(list, value) < 0) {
                    list.add(value);
                }
            }
        }
        if (length == list.size()) {
            return array;
        }
        final int size = list.size();
        array = new int[size];
        for (int j = n; j < size; ++j) {
            array[j] = (int)list.get(j);
        }
        return array;
    }
    
    public final boolean a() {
        return !(this.g instanceof ou);
    }
}
