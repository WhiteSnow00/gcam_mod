import java.util.Set;
import android.content.ContentProviderResult;
import android.content.ContentProviderOperation$Builder;
import java.io.File;
import java.util.Iterator;
import java.io.IOException;
import android.os.RemoteException;
import android.content.OperationApplicationException;
import java.util.HashSet;
import java.util.Collection;
import java.util.Locale;
import android.content.ContentProviderOperation;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class llq implements lly
{
    final /* synthetic */ llr a;
    private final List b;
    private final llu c;
    private boolean d;
    
    public llq(final llr a, final llu c) {
        this.a = a;
        this.b = new ArrayList();
        this.d = false;
        this.c = c;
    }
    
    private final void c(final llw llw, final lmf lmf) {
        if (lmf.d()) {
            Uri uri;
            if (lou.d(lmf.e)) {
                uri = this.c.d;
            }
            else {
                uri = this.c.c;
            }
            final String authority = uri.getAuthority();
            authority.getClass();
            njo.s(authority.equals(llw.h().getAuthority()), "Expected URI with authority %s, instead found %s", authority, llw.h());
        }
    }
    
    @Override
    public final void a(final llw llw) {
        synchronized (this) {
            njo.o(this.d ^ true);
            this.c(llw, llw.i());
            this.b.add(new lml(llw, true, null, null));
        }
    }
    
    @Override
    public final void b(final llw llw, final lmf lmf, final lmb lmb) {
        synchronized (this) {
            final boolean d = this.d;
            boolean b = true;
            njo.o(d ^ true);
            if (llw.i() != lmf) {
                if (!llw.k()) {
                    b = false;
                }
            }
            njo.o(b);
            this.c(llw, lmf);
            this.b.add(new lml(llw, false, lmf, lmb));
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (!this.d) {
                this.d = true;
                Object d = null;
                try {
                    final ArrayList<ContentProviderOperation> list = new ArrayList<ContentProviderOperation>();
                    for (final lml lml : this.b) {
                        final File b = lml.a.i().b(this.c);
                        final lmf i = lml.a.i();
                        final String format = String.format(Locale.ROOT, "%s.%s", i.c, i.d);
                        if (lml.b) {
                            if (i.d()) {
                                d = lml.a.h();
                                ((OperationApplicationException)d).getClass();
                                list.add(ContentProviderOperation.newDelete((Uri)d).build());
                            }
                            else {
                                if (b.delete()) {
                                    continue;
                                }
                                this.a.a.h(String.format(Locale.ROOT, "Unable to delete file %s", b));
                            }
                        }
                        else {
                            final lmf c = lml.c;
                            d = format;
                            if (c != null) {
                                d = format;
                                if (c != i) {
                                    njo.p(i.d() == c.d(), "Can only rename a file within the same type of folder");
                                    final String format2 = String.format(Locale.ROOT, "%s.%s", c.c, c.d);
                                    final File b2 = c.b(this.c);
                                    d = format2;
                                    if (!i.d()) {
                                        d = format2;
                                        if (b.renameTo(b2)) {
                                            d = lml.a;
                                            ((lme)d).m(new lmk(b2, c, this.a.a));
                                            d = format2;
                                        }
                                    }
                                }
                            }
                            final llw a = lml.a;
                            if (!(a instanceof lmg)) {
                                continue;
                            }
                            njo.s(a.h().equals((Object)Uri.EMPTY) ^ true, "Cannot close file that doesn't exist in storage: % operation=%s", lml.a, lml);
                            final ContentProviderOperation$Builder update = ContentProviderOperation.newUpdate(lml.a.h());
                            final lmb d2 = lml.d;
                            lma lma;
                            if (d2 == null) {
                                lma = lmb.b();
                            }
                            else {
                                lma = lmb.c(d2);
                            }
                            lma.d(this.c.e, (String)d);
                            d = this.c;
                            lma.b(((llu)d).g, ((llu)d).i);
                            d = lma.a();
                            lml.d = (lmb)d;
                            list.add(update.withValues(((lmb)d).a()).build());
                        }
                    }
                    if (list.isEmpty()) {
                        this.a.a.f("No ContentProvider ops in publish.");
                        monitorexit(this);
                        return;
                    }
                    d = new HashSet(new nli(list, fzt.s));
                    njo.s(((Set)d).size() == 1, "Found multiple incompatible authorities %s when publishing transaction with contentproviderOps=%s", d, list);
                    d = this.c.b.applyBatch((String)nov.f((Iterable)d), (ArrayList)list);
                    njo.o(((Iterable)d).length == list.size());
                    for (int j = 0; j < ((llu)d).length; ++j) {
                        final ContentProviderResult contentProviderResult = d[j];
                        if (!((lml)this.b.get(j)).b) {
                            if (!list.get(j).isInsert()) {
                                njo.o(contentProviderResult.count == 1);
                            }
                        }
                    }
                    monitorexit(this);
                    return;
                }
                catch (final OperationApplicationException d) {}
                catch (final RemoteException ex) {}
                throw new IOException("Error inserting MediaStore record.", (Throwable)d);
            }
            throw new IllegalStateException("Cannot publish a closed transaction");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
