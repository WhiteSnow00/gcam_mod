import android.os.Parcel;
import android.util.LruCache;
import android.content.ContentResolver;
import android.content.Context;
import java.util.List;
import java.util.Iterator;
import android.os.TransactionTooLargeException;
import android.os.Parcelable;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayDeque;
import android.os.Looper;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.ArrayList;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class jpk extends jrs
{
    private final jpd a;
    
    public jpk(final jpd a, final jqw jqw) {
        final jqp a2 = jpg.a;
        super(jqw);
        this.a = a;
    }
    
    protected final void d(final jpm jpm) {
        Object o = new jpj(this);
        try {
            jpd jpd = this.a;
            final Iterator iterator = jpd.a.i.iterator();
        Label_0123:
            while (true) {
                while (iterator.hasNext()) {
                    if ((jpd = ((jpc)iterator.next()).a()) == null) {
                        final jpd jpd2 = null;
                        if (jpd2 == null) {
                            ((jpn)o).b(Status.a);
                            return;
                        }
                        final jpe h = jpd2.a.h;
                        final String f = jpd2.f;
                        final int d = ((ouf)jpd2.i.b).d;
                        String s;
                        if (f != null) {
                            s = f;
                            if (f.isEmpty()) {
                                s = null;
                            }
                        }
                        else {
                            s = null;
                        }
                        List<E> list;
                        if (s == null) {
                            list = (List<E>)new ArrayList<oug>();
                        }
                        else {
                            List<oug> list2;
                            if (((jpp)h).f == null) {
                                list2 = Collections.emptyList();
                            }
                            else {
                                final moh moh = (moh)jpp.c.get((Object)s);
                                moh moh2;
                                if (moh == null) {
                                    final moe moe = new moe(jpp.b, s, ouh.b);
                                    if ((moh2 = (moh)jpp.c.putIfAbsent((Object)s, (Object)moe)) == null) {
                                        moh2 = moe;
                                    }
                                }
                                else {
                                    moh2 = moh;
                                }
                                list2 = ((ouh)moh2.e()).a;
                            }
                            final ArrayList list3 = new ArrayList<Object>();
                            for (final oug oug : list2) {
                                if ((oug.a & 0x1) != 0x0) {
                                    final int b = oug.b;
                                    if (b != 0 && b != d) {
                                        continue;
                                    }
                                }
                                list3.add(oug);
                            }
                            list = list3;
                        }
                        final Iterator<E> iterator3 = list.iterator();
                        while (true) {
                            final boolean hasNext = iterator3.hasNext();
                            boolean b2 = false;
                            boolean b3 = false;
                            if (hasNext) {
                                final oug oug2 = iterator3.next();
                                final String c = oug2.c;
                                final Context f2 = ((jpp)h).f;
                                final boolean b4 = loq.b(f2);
                                long longValue = 0L;
                                Label_0632: {
                                    if (!b4) {
                                        if (jpp.e == null) {
                                            if (f2 == null) {
                                                break Label_0632;
                                            }
                                            if (jpp.d == null) {
                                                if (jwu.b(f2).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                                                    b3 = true;
                                                }
                                                jpp.d = b3;
                                            }
                                            if (jpp.d) {
                                                final ContentResolver contentResolver = f2.getContentResolver();
                                                final Object c2 = kir.c(contentResolver);
                                                Long value = (Long)kir.b(kir.i, "android_id", 0L);
                                                long n = 0L;
                                                if (value != null) {
                                                    n = value;
                                                }
                                                else {
                                                    final String f3 = kir.f(contentResolver, "android_id");
                                                    Label_0581: {
                                                        if (f3 == null) {
                                                            n = 0L;
                                                            break Label_0581;
                                                        }
                                                        try {
                                                            n = Long.parseLong(f3);
                                                            value = n;
                                                        }
                                                        catch (final NumberFormatException ex) {
                                                            n = 0L;
                                                        }
                                                    }
                                                    kir.e(c2, kir.i, "android_id", value);
                                                }
                                                jpp.e = n;
                                            }
                                            else {
                                                jpp.e = 0L;
                                            }
                                        }
                                        longValue = jpp.e;
                                    }
                                }
                                long n2;
                                if (c != null && !c.isEmpty()) {
                                    final byte[] bytes = c.getBytes(jpp.a);
                                    final ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
                                    allocate.put(bytes);
                                    allocate.putLong(longValue);
                                    n2 = lio.m(allocate.array());
                                }
                                else {
                                    n2 = lio.m(ByteBuffer.allocate(8).putLong(longValue).array());
                                }
                                final long d2 = oug2.d;
                                final long e = oug2.e;
                                if (d2 < 0L || e <= 0L) {
                                    continue;
                                }
                                long n3;
                                if (n2 >= 0L) {
                                    n3 = n2 % e;
                                }
                                else {
                                    n3 = (Long.MAX_VALUE % e + 1L + (n2 & Long.MAX_VALUE) % e) % e;
                                }
                                if (n3 >= d2) {
                                    this.j(Status.a);
                                    return;
                                }
                                continue;
                            }
                            else {
                                try {
                                    Object o2 = new(jpi.class)();
                                    final jpg a = jpd2.a;
                                    final String f4 = a.f;
                                    final Context e2 = a.e;
                                    if (jpg.d == -1) {
                                        synchronized (jpg.class) {
                                            if (jpg.d == -1) {
                                                try {
                                                    jpg.d = e2.getPackageManager().getPackageInfo(e2.getPackageName(), 0).versionCode;
                                                }
                                                catch (final PackageManager$NameNotFoundException ex2) {
                                                    Log.wtf("ClearcutLogger", "This can't happen.", (Throwable)ex2);
                                                }
                                            }
                                        }
                                    }
                                    final jpq jpq = new jpq(f4, jpg.d, jpd2.f, jpd2.e, jpd2.h, jpd2.a.g);
                                    final ouf ouf = (ouf)jpd2.i.h();
                                    final jpa g = jpd2.g;
                                    final ArrayList c3 = jpd2.c;
                                    String[] array;
                                    if (c3 != null) {
                                        array = c3.toArray(jpg.b);
                                    }
                                    else {
                                        array = null;
                                    }
                                    new jpi(jpq, ouf, g, array, true);
                                    final ouf i = ((jpi)o2).i;
                                    i.getClass();
                                    final okt okt = (okt)i.H(5);
                                    okt.o(i);
                                    final okv okv = (okv)okt;
                                    if (((jpi)o2).j != null && i.e.d() == 0) {
                                        final ojw t = ojw.t(((jpi)o2).j.a.g());
                                        if (okv.c) {
                                            okv.m();
                                            okv.c = false;
                                        }
                                        final ouf ouf2 = (ouf)okv.b;
                                        ouf2.a |= 0x400;
                                        ouf2.e = t;
                                    }
                                    ((jpi)o2).i = (ouf)okv.h();
                                    ((jpi)o2).b = ((jpi)o2).i.g();
                                    Object j = jpd2.j;
                                    Label_3714: {
                                        if (j != null) {
                                            final ouf k = ((jpi)o2).i;
                                            k.getClass();
                                            final ojw e3 = k.e;
                                            final lne a2 = ((loj)j).a;
                                            Object b5 = e3.B();
                                            final lni a3 = lnh.a;
                                            if (!Looper.getMainLooper().equals(Looper.myLooper())) {
                                                Object b6 = ((lnj)a3).f;
                                                final Context a4 = a2.a;
                                                final loh c4 = lnj.c;
                                                if (!log.b) {
                                                    synchronized (log.c) {
                                                        if (!log.b) {
                                                            log.b = true;
                                                            moh.h(a4);
                                                            final jqt b7 = kcs.b(a4);
                                                            b6 = String.valueOf(a4.getPackageName());
                                                            if (((String)b6).length() != 0) {
                                                                b6 = "com.google.android.libraries.consentverifier#".concat((String)b6);
                                                            }
                                                            else {
                                                                b6 = new String("com.google.android.libraries.consentverifier#");
                                                            }
                                                            final int a5 = c4.a(a4);
                                                            final String[] a6 = log.a;
                                                            final jtt a7 = jtu.a();
                                                            a7.a = new kcv((String)b6, a5, a6);
                                                            b7.e(a7.a()).f(new lod(b7, (String)b6));
                                                        }
                                                    }
                                                }
                                                Label_3648: {
                                                    if (!ovb.a.b().d()) {
                                                        final jpn jpn = (jpn)o;
                                                        o = o2;
                                                        b2 = true;
                                                        o2 = jpn;
                                                        b5 = j;
                                                        break Label_3648;
                                                    }
                                                    final Context a8 = a2.a;
                                                    final loh c5 = lnj.c;
                                                    Label_1546: {
                                                        if (lol.a != null && lol.c == lol.a(a8, c5)) {
                                                            break Label_1546;
                                                        }
                                                        b6 = lol.b;
                                                        synchronized (b6) {
                                                            final boolean a9 = lol.a(a8, c5);
                                                            if (lol.a == null || lol.c != a9) {
                                                                if (a9) {
                                                                    lol.a = new loi(new jpg(a8, "COLLECTION_BASIS_VERIFIER"));
                                                                }
                                                                else {
                                                                    lol.a = new loo();
                                                                }
                                                                lol.c = a9;
                                                            }
                                                            monitorexit(b6);
                                                            niz l = niz.i(lol.a);
                                                            Object o3 = o;
                                                            Object o4 = o2;
                                                            Object value2 = j;
                                                            niz niz = l;
                                                            Object o5 = b5;
                                                            Label_3357: {
                                                                try {
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    final lng lng = new lng(a2.a, ((lnj)a3).d, ((lnj)a3).e);
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    b6 = ((njd)l).a;
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    final okb m = okb.J((byte[])b5);
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    final ArrayDeque<lnk> arrayDeque = new ArrayDeque<lnk>();
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    final lon lon = new lon(lnj.c, lnj.b, (lok)b6, a2, ((byte[])b5).length, arrayDeque);
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    ptf ptf = lng.a(-969197918);
                                                                    if (ptf == null) {
                                                                        o3 = o;
                                                                        o4 = o2;
                                                                        value2 = j;
                                                                        niz = l;
                                                                        o5 = b5;
                                                                        if (ovb.c()) {
                                                                            o3 = o;
                                                                            o4 = o2;
                                                                            value2 = j;
                                                                            niz = l;
                                                                            o5 = b5;
                                                                            lon.a(lon.b(7));
                                                                        }
                                                                        final jpn jpn2 = (jpn)o;
                                                                        o = o2;
                                                                        o2 = jpn2;
                                                                        b5 = j;
                                                                        break Label_3648;
                                                                    }
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    if (!m.C()) {
                                                                        o3 = o;
                                                                        o4 = o2;
                                                                        value2 = j;
                                                                        niz = l;
                                                                        o5 = b5;
                                                                        if (!lnj.c(a2, lnj.e(ptf), lon, nii.a)) {
                                                                            final jpn jpn3 = (jpn)o;
                                                                            o = o2;
                                                                            b2 = false;
                                                                            o2 = jpn3;
                                                                            b5 = j;
                                                                            break Label_3648;
                                                                        }
                                                                    }
                                                                    o3 = o;
                                                                    o4 = o2;
                                                                    value2 = j;
                                                                    niz = l;
                                                                    o5 = b5;
                                                                    boolean b8 = lnj.a(lnj.e(ptf));
                                                                    int n4 = -969197918;
                                                                    Integer n5 = null;
                                                                    int d3 = 0;
                                                                    b6 = null;
                                                                    Object o6 = o2;
                                                                    o2 = o;
                                                                    int m2;
                                                                    int a10;
                                                                    int b9;
                                                                    Map<Object, Object> unmodifiableMap;
                                                                    long n6;
                                                                    boolean containsKey;
                                                                    int d4;
                                                                    lnk lnk;
                                                                    int c6;
                                                                    int intValue;
                                                                    okt b10;
                                                                    Integer value3 = null;
                                                                    int n7;
                                                                    boolean b11;
                                                                    List d5 = null;
                                                                    int b12;
                                                                    LruCache a11;
                                                                    Integer value4;
                                                                    Integer value5;
                                                                    ome b13;
                                                                    okt b14;
                                                                    ome b15;
                                                                    okt b16 = null;
                                                                    String c7 = null;
                                                                    ooj ooj;
                                                                    okt b17;
                                                                    Label_3072_Outer:Block_100_Outer:Label_2268_Outer:
                                                                    while (true) {
                                                                        o3 = o2;
                                                                        o4 = o6;
                                                                        value2 = j;
                                                                        niz = l;
                                                                        o5 = b5;
                                                                        if (!m.C()) {
                                                                            o3 = o2;
                                                                            o4 = o6;
                                                                            value2 = j;
                                                                            niz = l;
                                                                            o5 = b5;
                                                                            m2 = m.m();
                                                                            o3 = o2;
                                                                            o4 = o6;
                                                                            value2 = j;
                                                                            niz = l;
                                                                            o5 = b5;
                                                                            a10 = onx.a(m2);
                                                                            o = o6;
                                                                            try {
                                                                                b9 = onx.b(m2);
                                                                                try {
                                                                                    unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)ptf.b);
                                                                                    n6 = a10;
                                                                                    try {
                                                                                        value2 = n6;
                                                                                        containsKey = unmodifiableMap.containsKey(value2);
                                                                                        o6 = b5;
                                                                                        Label_2202: {
                                                                                            if (containsKey) {
                                                                                                break Label_2202;
                                                                                            }
                                                                                            Label_2163: {
                                                                                                if (!b8) {
                                                                                                    break Label_2163;
                                                                                                }
                                                                                                try {
                                                                                                    m.E(m2);
                                                                                                    b8 = true;
                                                                                                Label_2268:
                                                                                                    while (true) {
                                                                                                        Block_91_Outer:Label_2702_Outer:Label_2660_Outer:
                                                                                                        while (true) {
                                                                                                            Label_2614: {
                                                                                                                while (true) {
                                                                                                                Block_95_Outer:
                                                                                                                    while (true) {
                                                                                                                    Block_90:
                                                                                                                        while (true) {
                                                                                                                            Block_94: {
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                    Block_116_Outer:
                                                                                                                                        while (true) {
                                                                                                                                            Label_2304: {
                                                                                                                                                while (true) {
                                                                                                                                                Block_112_Outer:
                                                                                                                                                    while (true) {
                                                                                                                                                        if (n5 != null || b9 == 4) {
                                                                                                                                                            if (n5 == null) {
                                                                                                                                                                d4 = m.d();
                                                                                                                                                            }
                                                                                                                                                            else {
                                                                                                                                                                d4 = d3 + n5;
                                                                                                                                                            }
                                                                                                                                                            while (m.d() >= d4) {
                                                                                                                                                                if (m.d() > d4) {
                                                                                                                                                                    if (ovb.c()) {
                                                                                                                                                                        lon.a(lon.b(11));
                                                                                                                                                                    }
                                                                                                                                                                    b2 = false;
                                                                                                                                                                    b5 = j;
                                                                                                                                                                    break Label_3648;
                                                                                                                                                                }
                                                                                                                                                                if (arrayDeque.isEmpty()) {
                                                                                                                                                                    if (ovb.c()) {
                                                                                                                                                                        lon.a(lon.b(11));
                                                                                                                                                                    }
                                                                                                                                                                    b2 = false;
                                                                                                                                                                    b5 = j;
                                                                                                                                                                    break Label_3648;
                                                                                                                                                                }
                                                                                                                                                                lnk = arrayDeque.pop();
                                                                                                                                                                n4 = lnk.a;
                                                                                                                                                                n5 = lnk.b;
                                                                                                                                                                c6 = lnk.c;
                                                                                                                                                                b8 = lnk.d;
                                                                                                                                                                ptf = lng.b(n4);
                                                                                                                                                                if (n5 == null) {
                                                                                                                                                                    d3 = c6;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                                intValue = n5;
                                                                                                                                                                d3 = c6;
                                                                                                                                                                d4 = intValue + c6;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        b5 = o6;
                                                                                                                                                        o6 = o;
                                                                                                                                                        continue Label_3072_Outer;
                                                                                                                                                        Block_98: {
                                                                                                                                                            while (true) {
                                                                                                                                                                while (true) {
                                                                                                                                                                    Block_84: {
                                                                                                                                                                        Label_2192: {
                                                                                                                                                                            Label_2938: {
                                                                                                                                                                                Block_101: {
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        Label_2332_Outer:Block_97_Outer:
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            b10 = lon.b(10);
                                                                                                                                                                                            b10.B(n6);
                                                                                                                                                                                            lon.a(b10);
                                                                                                                                                                                            break Label_2938;
                                                                                                                                                                                            Label_2447: {
                                                                                                                                                                                                iftrue(Label_2464:)(((String)b6).startsWith("type.googleapis.com/"));
                                                                                                                                                                                            }
                                                                                                                                                                                            break Block_98;
                                                                                                                                                                                            Label_2712:
                                                                                                                                                                                            n4 = value3;
                                                                                                                                                                                            Block_89: {
                                                                                                                                                                                                Block_83: {
                                                                                                                                                                                                    Label_2265: {
                                                                                                                                                                                                    Block_114_Outer:
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                    Label_2751: {
                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                        Label_2332:
                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                Block_103: {
                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                        Label_2729: {
                                                                                                                                                                                                                                            break Label_2729;
                                                                                                                                                                                                                                            iftrue(Label_2702:)(!ovb.c());
                                                                                                                                                                                                                                            break Block_101;
                                                                                                                                                                                                                                            Label_2299:
                                                                                                                                                                                                                                            iftrue(Label_2948:)(b6 == null);
                                                                                                                                                                                                                                            break Label_2304;
                                                                                                                                                                                                                                            Label_2722:
                                                                                                                                                                                                                                            n4 = ((ptb)value2).b;
                                                                                                                                                                                                                                            break Label_2729;
                                                                                                                                                                                                                                            b9 = 3;
                                                                                                                                                                                                                                            n7 = 3;
                                                                                                                                                                                                                                            break Label_2332;
                                                                                                                                                                                                                                            b2 = false;
                                                                                                                                                                                                                                            b5 = j;
                                                                                                                                                                                                                                            break Label_3648;
                                                                                                                                                                                                                                            Label_2259:
                                                                                                                                                                                                                                            b9 = 4;
                                                                                                                                                                                                                                            break Label_2265;
                                                                                                                                                                                                                                            Label_2997:
                                                                                                                                                                                                                                            b2 = false;
                                                                                                                                                                                                                                            b5 = j;
                                                                                                                                                                                                                                            break Label_3648;
                                                                                                                                                                                                                                            iftrue(Label_2399:)(lng.d(((ptb)value2).b) || lnj.b(n4, a10));
                                                                                                                                                                                                                                            break Block_94;
                                                                                                                                                                                                                                            value3 = null;
                                                                                                                                                                                                                                            break Label_2614;
                                                                                                                                                                                                                                            Label_2388:
                                                                                                                                                                                                                                            m.E(m2);
                                                                                                                                                                                                                                            continue Block_112_Outer;
                                                                                                                                                                                                                                            iftrue(Label_2997:)(!ovb.c());
                                                                                                                                                                                                                                            break Label_2268;
                                                                                                                                                                                                                                            iftrue(Label_2286:)((((ptb)value2).a & 0x2) == 0x0);
                                                                                                                                                                                                                                            break Block_89;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        iftrue(Label_2741:)(n7 != 3);
                                                                                                                                                                                                                                        break Block_103;
                                                                                                                                                                                                                                        iftrue(Label_2325:)(b9 != 3);
                                                                                                                                                                                                                                        continue Label_2332_Outer;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    b2 = false;
                                                                                                                                                                                                                                    b5 = j;
                                                                                                                                                                                                                                    break Label_3648;
                                                                                                                                                                                                                                    iftrue(Label_2192:)(!ovb.c());
                                                                                                                                                                                                                                    break Block_83;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n5 = null;
                                                                                                                                                                                                                                break Label_2751;
                                                                                                                                                                                                                                Label_2328:
                                                                                                                                                                                                                                n7 = b9;
                                                                                                                                                                                                                                continue Label_2332;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            iftrue(Label_2886:)(b11);
                                                                                                                                                                                                                            continue Block_91_Outer;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        Label_2741:
                                                                                                                                                                                                                        n5 = m.j();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    d3 = m.d();
                                                                                                                                                                                                                    ptf = lng.b(n4);
                                                                                                                                                                                                                    b8 = (b8 || lnj.a(lnj.d((ptb)value2)) || lnj.a(lnj.e(ptf)));
                                                                                                                                                                                                                    iftrue(Label_2825:)((n5 != null && n5 <= 0) || (lnj.c(a2, lnj.d((ptb)value2), lon, niz.i(a10)) && lnj.c(a2, lnj.e(ptf), lon, nii.a)));
                                                                                                                                                                                                                    continue Block_97_Outer;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                d5 = lnj.d((ptb)value2);
                                                                                                                                                                                                                iftrue(Label_3007:)(b8 || lnj.a(d5));
                                                                                                                                                                                                                continue Block_91_Outer;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            Label_3288:
                                                                                                                                                                                                            throw new IllegalArgumentException();
                                                                                                                                                                                                            b6 = m.x();
                                                                                                                                                                                                            continue Block_112_Outer;
                                                                                                                                                                                                            iftrue(Label_2447:)(b6 != null);
                                                                                                                                                                                                            continue Block_114_Outer;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    b11 = false;
                                                                                                                                                                                                    continue Label_2268;
                                                                                                                                                                                                    Label_2464:
                                                                                                                                                                                                    b12 = cp.b(((String)b6).substring(20));
                                                                                                                                                                                                    try {
                                                                                                                                                                                                        a11 = lng.a;
                                                                                                                                                                                                        value4 = b12;
                                                                                                                                                                                                        value5 = (Integer)a11.get((Object)value4);
                                                                                                                                                                                                        if (value5 == null) {
                                                                                                                                                                                                            if (lng.b == null) {
                                                                                                                                                                                                                lng.b = lng.c();
                                                                                                                                                                                                            }
                                                                                                                                                                                                            b13 = lng.b.b;
                                                                                                                                                                                                            if (!b13.containsKey(value4)) {
                                                                                                                                                                                                                throw new IllegalArgumentException();
                                                                                                                                                                                                            }
                                                                                                                                                                                                            value5 = (int)b13.get(value4);
                                                                                                                                                                                                            lng.a.put((Object)value4, (Object)value5);
                                                                                                                                                                                                        }
                                                                                                                                                                                                        value3 = value5;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    catch (final IllegalArgumentException ex3) {
                                                                                                                                                                                                        value3 = null;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    break Label_2614;
                                                                                                                                                                                                }
                                                                                                                                                                                                b14 = lon.b(8);
                                                                                                                                                                                                b14.B(n6);
                                                                                                                                                                                                lon.a(b14);
                                                                                                                                                                                                break Label_2192;
                                                                                                                                                                                                Label_3061:
                                                                                                                                                                                                m.E(m2);
                                                                                                                                                                                                b6 = null;
                                                                                                                                                                                                continue Block_112_Outer;
                                                                                                                                                                                                b2 = false;
                                                                                                                                                                                                b5 = j;
                                                                                                                                                                                                break Label_3648;
                                                                                                                                                                                            }
                                                                                                                                                                                            break Label_2304;
                                                                                                                                                                                            iftrue(Label_2938:)(!ovb.c());
                                                                                                                                                                                            continue Block_100_Outer;
                                                                                                                                                                                        }
                                                                                                                                                                                        Label_2886: {
                                                                                                                                                                                            iftrue(Label_2948:)((((ptb)value2).a & 0x2) == 0x0 || !lng.d(((ptb)value2).b));
                                                                                                                                                                                        }
                                                                                                                                                                                        continue Block_116_Outer;
                                                                                                                                                                                    }
                                                                                                                                                                                    b15 = ptf.b;
                                                                                                                                                                                    iftrue(Label_3288:)(!b15.containsKey(value2));
                                                                                                                                                                                    break Block_84;
                                                                                                                                                                                }
                                                                                                                                                                                b16 = lon.b(9);
                                                                                                                                                                                c7 = njb.c((String)b6);
                                                                                                                                                                                iftrue(Label_2660:)(!b16.c);
                                                                                                                                                                                break Block_95_Outer;
                                                                                                                                                                                b2 = false;
                                                                                                                                                                                b5 = j;
                                                                                                                                                                                break Label_3648;
                                                                                                                                                                                iftrue(Label_2259:)(b9 == 4);
                                                                                                                                                                                break Block_91_Outer;
                                                                                                                                                                                Label_2286: {
                                                                                                                                                                                    iftrue(Label_2299:)(lnj.b(n4, a10));
                                                                                                                                                                                }
                                                                                                                                                                                break Block_90;
                                                                                                                                                                            }
                                                                                                                                                                            b2 = false;
                                                                                                                                                                            b5 = j;
                                                                                                                                                                            break Label_3648;
                                                                                                                                                                        }
                                                                                                                                                                        b2 = false;
                                                                                                                                                                        b5 = j;
                                                                                                                                                                        break Label_3648;
                                                                                                                                                                    }
                                                                                                                                                                    value2 = b15.get(value2);
                                                                                                                                                                    iftrue(Label_2265:)(b9 == 2 || b9 == 3);
                                                                                                                                                                    continue Label_2660_Outer;
                                                                                                                                                                }
                                                                                                                                                                Label_2399: {
                                                                                                                                                                    arrayDeque.push(new lnk(n4, n5, d3, b8, a10));
                                                                                                                                                                }
                                                                                                                                                                iftrue(Label_2722:)(!lnj.b(n4, a10));
                                                                                                                                                                continue Block_95_Outer;
                                                                                                                                                            }
                                                                                                                                                            Label_2325: {
                                                                                                                                                                continue Block_112_Outer;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        value3 = null;
                                                                                                                                                        break Label_2614;
                                                                                                                                                        Label_2825: {
                                                                                                                                                            b9 = n7;
                                                                                                                                                        }
                                                                                                                                                        b6 = null;
                                                                                                                                                        continue Block_112_Outer;
                                                                                                                                                    }
                                                                                                                                                    Label_3007: {
                                                                                                                                                        iftrue(Label_3037:)(lnj.c(a2, d5, lon, niz.i(a10)));
                                                                                                                                                    }
                                                                                                                                                    continue Label_2660_Outer;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iftrue(Label_2328:)(b9 == 2);
                                                                                                                                            continue Label_2702_Outer;
                                                                                                                                        }
                                                                                                                                        ooj = (ooj)b16.b;
                                                                                                                                        b6 = ooj.m;
                                                                                                                                        ooj.a |= 0x20;
                                                                                                                                        ooj.g = c7;
                                                                                                                                        lon.a(b16);
                                                                                                                                        continue Label_2268_Outer;
                                                                                                                                    }
                                                                                                                                    Label_3037: {
                                                                                                                                        iftrue(Label_3061:)(n4 != lnj.a || a10 != 1);
                                                                                                                                    }
                                                                                                                                    continue Block_95_Outer;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iftrue(Label_2388:)(lnj.c(a2, lnj.d((ptb)value2), lon, niz.i(a10)));
                                                                                                                            continue Label_2660_Outer;
                                                                                                                        }
                                                                                                                        continue Block_95_Outer;
                                                                                                                    }
                                                                                                                    b16.m();
                                                                                                                    b16.c = false;
                                                                                                                    continue;
                                                                                                                }
                                                                                                            }
                                                                                                            iftrue(Label_2712:)(value3 != null);
                                                                                                            continue Label_2268_Outer;
                                                                                                        }
                                                                                                        b11 = true;
                                                                                                        continue Label_2268;
                                                                                                    }
                                                                                                    b17 = lon.b(8);
                                                                                                    b17.B(n6);
                                                                                                    lon.a(b17);
                                                                                                }
                                                                                                catch (IOException b5) {
                                                                                                    b5 = j;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    catch (final IOException b6) {}
                                                                                }
                                                                                catch (final IOException b6) {}
                                                                            }
                                                                            catch (final IOException b6) {
                                                                                break Label_3357;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    o = o6;
                                                                    b5 = j;
                                                                    b2 = true;
                                                                    break Label_3648;
                                                                }
                                                                catch (IOException o) {
                                                                    o2 = o3;
                                                                    o = o4;
                                                                    b5 = o5;
                                                                    l = niz;
                                                                    j = value2;
                                                                }
                                                            }
                                                            Object o6 = b5;
                                                            b5 = j;
                                                            if (ovb.c()) {
                                                                final okt m3 = ooj.m.m();
                                                                b6 = a2.a.getPackageName();
                                                                if (m3.c) {
                                                                    m3.m();
                                                                    m3.c = false;
                                                                }
                                                                final ooj ooj2 = (ooj)m3.b;
                                                                b6.getClass();
                                                                ooj2.a |= 0x1;
                                                                ooj2.b = (String)b6;
                                                                final int a12 = lnj.c.a(a2.a);
                                                                if (m3.c) {
                                                                    m3.m();
                                                                    m3.c = false;
                                                                }
                                                                b6 = m3.b;
                                                                ((ooj)b6).a |= 0x2;
                                                                ((ooj)b6).c = a12;
                                                                ooj.j((ooj)b6);
                                                                if (m3.c) {
                                                                    m3.m();
                                                                    m3.c = false;
                                                                }
                                                                b6 = m3.b;
                                                                final int a13 = ((ooj)b6).a | 0x8;
                                                                ((ooj)b6).a = a13;
                                                                ((ooj)b6).e = -2032180703L;
                                                                final int length = o6.length;
                                                                ((ooj)b6).a = (a13 | 0x10);
                                                                ((ooj)b6).f = length;
                                                                ((ooj)b6).h = phn.j(5);
                                                                ((ooj)b6).a |= 0x40;
                                                                ((lok)((njd)l).a).a((ooj)m3.h());
                                                                b2 = false;
                                                            }
                                                            else {
                                                                b2 = false;
                                                            }
                                                            if (!ovb.a.b().f()) {
                                                                break Label_3714;
                                                            }
                                                            if (b2) {
                                                                break Label_3714;
                                                            }
                                                            this.f(new Status(10, b5.toString()));
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            throw new NetworkOnMainThreadException();
                                        }
                                        final jpn jpn4 = (jpn)o;
                                        o = o2;
                                        o2 = jpn4;
                                        try {
                                            final jpo jpo = (jpo)jpm.u();
                                            final Parcel a14 = jpo.a();
                                            bjg.e(a14, (IInterface)o2);
                                            bjg.c(a14, (Parcelable)o);
                                            jpo.A(1, a14);
                                            return;
                                        }
                                        catch (final TransactionTooLargeException ex4) {
                                            throw ex4;
                                        }
                                    }
                                }
                                catch (final RuntimeException ex5) {
                                    Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", (Throwable)ex5);
                                    this.f(new Status(10, "MessageProducer"));
                                    return;
                                }
                            }
                        }
                    }
                }
                final Iterator iterator4 = jpg.c.iterator();
                while (iterator4.hasNext()) {
                    if ((jpd = ((jpc)iterator4.next()).a()) == null) {
                        final jpd jpd2 = null;
                        continue Label_0123;
                    }
                }
                final jpd jpd2 = jpd;
                continue Label_0123;
            }
        }
        catch (final RuntimeException ex6) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", (Throwable)ex6);
            this.f(new Status(10, "EventModifier"));
        }
    }
}
