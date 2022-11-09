import java.io.InputStream;
import android.content.res.Resources$NotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import android.content.Context;
import android.util.LruCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lng
{
    private static final int c;
    public final LruCache a;
    public pti b;
    private final LruCache d;
    private final Context e;
    private final Integer f;
    
    static {
        c = cp.b("DEFAULT");
    }
    
    public lng(final Context e, final LruCache d, final LruCache a) {
        this.e = e;
        this.f = 2131886095;
        this.d = d;
        this.a = a;
    }
    
    private static Map e(final List list, final nns nns) {
        final HashMap hashMap = new HashMap();
        for (final Integer n : list) {
            if (n >= nns.size()) {
                throw new lnf(String.format("CollectionBasisHolder index(%d) exceeds list size(%d)", n, nns.size()));
            }
            final ptc ptc = nns.get(n);
            int n2;
            if ((ptc.a & 0x2) != 0x0) {
                n2 = ptc.d;
            }
            else {
                n2 = lng.c;
            }
            final okt okt = (okt)ptc.H(5);
            okt.o(ptc);
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final ptc ptc2 = (ptc)okt.b;
            ptc2.a &= 0xFFFFFFFD;
            ptc2.d = 0;
            hashMap.put(n2, okt.h());
        }
        return hashMap;
    }
    
    public final ptf a(final int n) {
        final LruCache d = this.d;
        final Integer value = n;
        ptf ptf = (ptf)d.get((Object)value);
        if (ptf == null) {
            if (this.b == null) {
                this.b = this.c();
            }
            ptf = Collections.unmodifiableMap((Map<?, ? extends ptf>)this.b.a).get(value);
            if (ptf != null) {
                this.d.put((Object)value, (Object)ptf);
                return ptf;
            }
        }
        return ptf;
    }
    
    public final ptf b(final int n) {
        final ptf a = this.a(n);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException();
    }
    
    public final pti c() {
        final Context e = this.e;
        if (e != null) {
            try {
                final InputStream openRawResource = e.getResources().openRawResource((int)this.f);
                try {
                    final okb h = okb.H(openRawResource);
                    final okt m = pti.f.m();
                    final okm a = okm.a();
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    try {
                        omr.a.b(m.b).h(m.b, okc.p(h), a);
                        final pti pti = (pti)m.h();
                        final olj c = pti.c;
                        final olf d = pti.d;
                        if (c.size() == d.size()) {
                            final HashMap hashMap = new HashMap();
                            final nns j = nns.j(pti.e);
                            final Iterator<Object> iterator = d.iterator();
                            final Iterator<Object> iterator2 = c.iterator();
                            while (iterator.hasNext() && iterator2.hasNext()) {
                                final Integer n = iterator.next();
                                final ptf ptf = iterator2.next();
                                final Map e2 = e(ptf.e, j);
                                final olf f = ptf.f;
                                final oli g = ptf.g;
                                if (f.size() != g.size()) {
                                    throw new lnf(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", g.size(), f.size()));
                                }
                                final HashMap hashMap2 = new HashMap();
                                final Iterator<Object> iterator3 = f.iterator();
                                final Iterator<Object> iterator4 = g.iterator();
                                while (iterator4.hasNext() && iterator3.hasNext()) {
                                    final Long n2 = iterator4.next();
                                    final Map e3 = e(nns.m(iterator3.next()), j);
                                    final okt i = ptb.e.m();
                                    i.al(e3);
                                    hashMap2.put(n2, i.h());
                                }
                                final olj c2 = ptf.c;
                                final oli d2 = ptf.d;
                                if (c2.size() != d2.size()) {
                                    throw new lnf(String.format("TagNumbersList[%d] and CollectionBasisFieldList[%d] must have same size", d2.size(), c2.size()));
                                }
                                final Iterator<Object> iterator5 = d2.iterator();
                                final Iterator<Object> iterator6 = c2.iterator();
                                while (iterator5.hasNext() && iterator6.hasNext()) {
                                    final Long n3 = iterator5.next();
                                    final ptb ptb = iterator6.next();
                                    final Map e4 = e(ptb.d, j);
                                    ptb ptb2;
                                    if (hashMap2.containsKey(n3)) {
                                        final okt okt = (okt)ptb.H(5);
                                        okt.o(ptb);
                                        okt.o((oky)hashMap2.get(n3));
                                        ptb2 = (ptb)okt.h();
                                    }
                                    else {
                                        final okt okt2 = (okt)ptb.H(5);
                                        okt2.o(ptb);
                                        okt2.al(e4);
                                        if (okt2.c) {
                                            okt2.m();
                                            okt2.c = false;
                                        }
                                        ((ptb)okt2.b).d = oky.x();
                                        ptb2 = (ptb)okt2.h();
                                    }
                                    hashMap2.put(n3, ptb2);
                                }
                                final okt okt3 = (okt)ptf.H(5);
                                okt3.o(ptf);
                                if (okt3.c) {
                                    okt3.m();
                                    okt3.c = false;
                                }
                                final ptf ptf2 = (ptf)okt3.b;
                                final ome a2 = ptf2.a;
                                if (!a2.b) {
                                    ptf2.a = a2.a();
                                }
                                ptf2.a.putAll(e2);
                                if (okt3.c) {
                                    okt3.m();
                                    okt3.c = false;
                                }
                                ((ptf)okt3.b).e = oky.x();
                                if (okt3.c) {
                                    okt3.m();
                                    okt3.c = false;
                                }
                                final ptf ptf3 = (ptf)okt3.b;
                                final ome b = ptf3.b;
                                if (!b.b) {
                                    ptf3.b = b.a();
                                }
                                ptf3.b.putAll(hashMap2);
                                if (okt3.c) {
                                    okt3.m();
                                    okt3.c = false;
                                }
                                ((ptf)okt3.b).d = oky.z();
                                if (okt3.c) {
                                    okt3.m();
                                    okt3.c = false;
                                }
                                ((ptf)okt3.b).c = oky.B();
                                if (okt3.c) {
                                    okt3.m();
                                    okt3.c = false;
                                }
                                ((ptf)okt3.b).f = oky.x();
                                if (okt3.c) {
                                    okt3.m();
                                    okt3.c = false;
                                }
                                ((ptf)okt3.b).g = oky.z();
                                hashMap.put(n, okt3.h());
                            }
                            final okt k = pti.f.m();
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final pti pti2 = (pti)k.b;
                            final ome a3 = pti2.a;
                            if (!a3.b) {
                                pti2.a = a3.a();
                            }
                            pti2.a.putAll(hashMap);
                            final Map<Object, Object> unmodifiableMap = (Map<Object, Object>)Collections.unmodifiableMap((Map<? extends K, ? extends V>)pti.b);
                            if (k.c) {
                                k.m();
                                k.c = false;
                            }
                            final pti pti3 = (pti)k.b;
                            final ome b2 = pti3.b;
                            if (!b2.b) {
                                pti3.b = b2.a();
                            }
                            pti3.b.putAll(unmodifiableMap);
                            final pti pti4 = (pti)k.h();
                            if (openRawResource != null) {
                                openRawResource.close();
                            }
                            return pti4;
                        }
                        throw new lnf(String.format("ProtoHashNamesList[%d] and MessagesList[%d] must have same size", d.size(), c.size()));
                    }
                    catch (final RuntimeException ex) {
                        if (ex.getCause() instanceof IOException) {
                            throw (IOException)ex.getCause();
                        }
                        throw ex;
                    }
                }
                finally {
                    if (openRawResource != null) {
                        try {
                            openRawResource.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
            }
            catch (final Resources$NotFoundException ex2) {
                throw new IOException((Throwable)ex2);
            }
        }
        throw new IOException("No context to load resource from");
    }
    
    public final boolean d(final int n) {
        return this.a(n) != null;
    }
}
