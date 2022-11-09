import android.content.ContentProviderResult;
import android.content.ContentProviderOperation$Builder;
import java.io.File;
import java.util.Iterator;
import java.io.IOException;
import android.os.RemoteException;
import android.content.OperationApplicationException;
import java.util.concurrent.TimeUnit;
import android.provider.MediaStore$Files;
import android.net.Uri;
import java.util.Locale;
import android.content.ContentProviderOperation;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lln implements lly
{
    final /* synthetic */ llo a;
    private final List b;
    private final llu c;
    private boolean d;
    
    public lln(final llo a, final llu c) {
        this.a = a;
        this.b = new ArrayList();
        this.d = false;
        this.c = c;
    }
    
    @Override
    public final void a(final llw llw) {
        synchronized (this) {
            njo.o(this.d ^ true);
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
            this.b.add(new lml(llw, false, lmf, lmb));
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.d) {
                throw new IllegalStateException("Cannot publish a closed transaction");
            }
            final boolean b = true;
            this.d = true;
            this.a.a.f("media-transaction");
            try {
                try {
                    final ArrayList list = new ArrayList();
                    final ArrayList<ContentProviderOperation> list2 = new ArrayList<ContentProviderOperation>();
                    final Iterator iterator = this.b.iterator();
                    int i;
                    while (true) {
                        final boolean hasNext = iterator.hasNext();
                        i = 0;
                        if (!hasNext) {
                            break;
                        }
                        final lml lml = (lml)iterator.next();
                        final lmf j = lml.a.i();
                        final kse a = this.a.a;
                        final String value = String.valueOf(j);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 3);
                        sb.append("op-");
                        sb.append(value);
                        a.f(sb.toString());
                        Object b2 = j.b(this.c);
                        if (lml.b) {
                            try {
                                final krr b3 = this.a.b;
                                final String value2 = String.valueOf(lml.a.i().c());
                                String concat;
                                if (value2.length() != 0) {
                                    concat = "Deleting ".concat(value2);
                                }
                                else {
                                    concat = new String("Deleting ");
                                }
                                b3.f(concat);
                                this.a.a.f("delete");
                                if (((File)b2).delete()) {
                                    if (j.d()) {
                                        list2.add(ContentProviderOperation.newDelete(lml.a.h()).build());
                                        list.add(lml);
                                    }
                                }
                                else {
                                    this.a.b.h(String.format(Locale.ROOT, "Unable to delete file %s", b2));
                                }
                                this.a.a.g();
                            }
                            finally {
                                final Throwable t;
                                this.a.b.i(String.format(Locale.ROOT, "Unable to delete file %s", b2), t);
                            }
                        }
                        else {
                            final lmf c = lml.c;
                            if (c != null && c != j) {
                                final krr b4 = this.a.b;
                                final String c2 = lml.a.i().c();
                                final String c3 = lml.c.c();
                                final StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 11 + String.valueOf(c3).length());
                                sb2.append("Moving ");
                                sb2.append(c2);
                                sb2.append(" to ");
                                sb2.append(c3);
                                b4.f(sb2.toString());
                                this.a.a.f("move");
                                Label_0686: {
                                    Throwable t2 = null;
                                    Label_0655: {
                                        try {
                                            final lmf c4 = lml.c;
                                            final File b5 = c4.b(this.c);
                                            if (((File)b2).renameTo(b5)) {
                                                try {
                                                    final lme lme = (lme)lml.a;
                                                    b2 = new lmk(b5, c4, this.a.b);
                                                    lme.m((llv)b2);
                                                }
                                                finally {
                                                    b2 = b5;
                                                    break Label_0655;
                                                }
                                            }
                                            break Label_0686;
                                        }
                                        finally {
                                            final Throwable t3;
                                            t2 = t3;
                                        }
                                    }
                                    this.a.b.i(String.format(Locale.ROOT, "Unable to move file %s", b2), t2);
                                }
                                this.a.a.g();
                            }
                            if (!lml.a.i().d()) {
                                continue;
                            }
                            ContentProviderOperation$Builder contentProviderOperation$Builder;
                            if (Uri.EMPTY.equals((Object)lml.a.h())) {
                                contentProviderOperation$Builder = ContentProviderOperation.newInsert(MediaStore$Files.getContentUri("external"));
                            }
                            else {
                                contentProviderOperation$Builder = ContentProviderOperation.newUpdate(lml.a.h());
                            }
                            final lmb d = lml.d;
                            lma lma;
                            if (d == null) {
                                lma = lmb.b();
                            }
                            else {
                                lma = lmb.c(d);
                            }
                            if (lou.c(j.e)) {
                                lma.b("media_type", 1);
                            }
                            else if (lou.d(j.e)) {
                                lma.b("media_type", 3);
                            }
                            final String absolutePath = ((File)b2).getAbsolutePath();
                            final String name = ((File)b2).getName();
                            final String c5 = j.c;
                            lma.d("_data", absolutePath);
                            lma.c("_size", ((File)b2).length());
                            lma.d("_display_name", name);
                            lma.d("title", c5);
                            lma.c("date_modified", TimeUnit.MILLISECONDS.toSeconds(((File)b2).lastModified()));
                            lma.d("mime_type", j.e);
                            final lmb a2 = lma.a();
                            lml.d = a2;
                            list2.add(contentProviderOperation$Builder.withValues(a2.a()).build());
                            list.add(lml);
                            this.a.a.g();
                        }
                    }
                    kse kse;
                    if (list2.isEmpty()) {
                        this.a.b.f("No ContentProvider ops in publish.");
                        kse = this.a.a;
                    }
                    else {
                        this.a.a.f("apply");
                        final ContentProviderResult[] applyBatch = this.c.b.applyBatch("media", (ArrayList)list2);
                        njo.o(list.size() == list2.size());
                        njo.o(applyBatch.length == list.size() && b);
                        while (i < applyBatch.length) {
                            final ContentProviderResult contentProviderResult = applyBatch[i];
                            final lml lml2 = this.b.get(i);
                            if (!lml2.b) {
                                final krr b6 = this.a.b;
                                final String value3 = String.valueOf(lml2.a);
                                final String value4 = String.valueOf(contentProviderResult.uri);
                                final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 14 + String.valueOf(value4).length());
                                sb3.append("Published ");
                                sb3.append(value3);
                                sb3.append(" to ");
                                sb3.append(value4);
                                b6.f(sb3.toString());
                            }
                            ++i;
                        }
                        this.a.a.g();
                        kse = this.a.a;
                    }
                    kse.g();
                    monitorexit(this);
                    return;
                }
                finally {}
            }
            catch (final OperationApplicationException ex) {}
            catch (final RemoteException ex2) {}
            final OperationApplicationException ex;
            throw new IOException("Error inserting MediaStore record.", (Throwable)ex);
            this.a.a.g();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
