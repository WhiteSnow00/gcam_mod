import java.util.ListIterator;
import android.net.Uri;
import java.util.Iterator;
import java.util.Collection;
import android.util.Log;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrs
{
    private final Map a;
    private final Map b;
    private final List c;
    
    public mrs(final List list) {
        final List<mst> emptyList = Collections.emptyList();
        final List<Object> emptyList2 = Collections.emptyList();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        for (final mso mso : list) {
            if (TextUtils.isEmpty((CharSequence)mso.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            }
            else {
                final mso mso2 = this.a.put(mso.e(), mso);
                if (mso2 == null) {
                    continue;
                }
                final String canonicalName = mso2.getClass().getCanonicalName();
                final String canonicalName2 = mso.getClass().getCanonicalName();
                final StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                sb.append("Cannot override Backend ");
                sb.append(canonicalName);
                sb.append(" with ");
                sb.append(canonicalName2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        for (final mst mst : emptyList) {
            if (TextUtils.isEmpty((CharSequence)mst.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            }
            else {
                final mst mst2 = this.b.put(mst.a(), mst);
                if (mst2 == null) {
                    continue;
                }
                final String canonicalName3 = mst2.getClass().getCanonicalName();
                final String canonicalName4 = mst.getClass().getCanonicalName();
                final StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                sb2.append("Cannot to override Transform ");
                sb2.append(canonicalName3);
                sb2.append(" with ");
                sb2.append(canonicalName4);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        this.c.addAll(emptyList2);
    }
    
    public final mrq a(Uri build) {
        final nnn e = nns.e();
        final nns a = msk.a(build);
        for (int c = ((nql)a).c, i = 0; i < c; ++i) {
            final String s = a.get(i);
            final mst mst = this.b.get(s);
            if (mst == null) {
                final String value = String.valueOf(build);
                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 21 + String.valueOf(value).length());
                sb.append("No such transform: ");
                sb.append(s);
                sb.append(": ");
                sb.append(value);
                throw new msf(sb.toString());
            }
            e.g(mst);
        }
        final nns a2 = e.f().a();
        final mrp mrp = new mrp();
        final String scheme = build.getScheme();
        final mso a3 = this.a.get(scheme);
        if (a3 != null) {
            mrp.a = a3;
            mrp.c = this.c;
            mrp.b = a2;
            if (!a2.isEmpty()) {
                final ArrayList list = new ArrayList(build.getPathSegments());
                if (!list.isEmpty()) {
                    if (!build.getPath().endsWith("/")) {
                        String b = (String)list.get(list.size() - 1);
                        final ListIterator<Object> listIterator = a2.listIterator(a2.size());
                        while (listIterator.hasPrevious()) {
                            b = listIterator.previous().b();
                        }
                        list.set(list.size() - 1, b);
                        build = build.buildUpon().path(TextUtils.join((CharSequence)"/", (Iterable)list)).encodedFragment((String)null).build();
                    }
                }
            }
            mrp.d = build;
            return new mrq(mrp);
        }
        throw new msf(String.format("Cannot open, unregistered backend: %s", scheme));
    }
    
    public final Object b(final Uri uri, final mrr mrr) {
        return mrr.a(this.a(uri));
    }
    
    public final void c(final Uri uri, final Uri uri2) {
        final mrq a = this.a(uri);
        final mrq a2 = this.a(uri2);
        final mso a3 = a.a;
        if (a3 == a2.a) {
            a3.g(a.d, a2.d);
            return;
        }
        throw new msf("Cannot rename file across backends");
    }
    
    public final boolean d(final Uri uri) {
        final mrq a = this.a(uri);
        return a.a.f(a.d);
    }
}
