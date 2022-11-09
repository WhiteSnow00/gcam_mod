import android.database.Cursor;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.util.concurrent.Executor;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Iterator;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.util.HashMap;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.TimeUnit;
import android.util.Log;
import java.util.Map;
import android.net.Uri;
import android.content.ContentResolver;
import android.os.OperationCanceledException;
import android.os.CancellationSignal;

// 
// Decompiled by Procyon v0.6.0
// 

final class mpb extends mpi
{
    static volatile boolean a;
    private static niz j;
    
    static {
        mpb.j = nii.a;
    }
    
    public mpb(final mny mny, final String s, final boolean b) {
        super(mny, s, b);
    }
    
    private final Map h(final ContentResolver ex, Uri query, final String[] array, final CancellationSignal cancellationSignal) {
        if (mpb.a) {
            Log.w("ContentProviderFlagStore", "Skipping content resolver query because of previous time outs.");
            return this.i();
        }
        final off d = this.d.b().d(new moz(cancellationSignal), 2000L, TimeUnit.MILLISECONDS);
        try {
            query = (Uri)((ContentResolver)ex).query(query, array, (String)null, (String[])null, (String)null, cancellationSignal);
            Label_0071: {
                if (query != null) {
                    break Label_0071;
                }
                try {
                    nnx nnx = nqq.a;
                    Label_0081: {
                        while (true) {
                            d.cancel(true);
                            if (query != null) {
                                ((Cursor)query).close();
                            }
                            return nnx;
                            final HashMap h;
                            h.put(((Cursor)query).getString(0), ((Cursor)query).getString(1));
                            break Label_0081;
                            Label_0114: {
                                nnx = nnx.n(h);
                            }
                            continue;
                        }
                        final HashMap h = nqb.h(((Cursor)query).getCount());
                    }
                    iftrue(Label_0114:)(!((Cursor)query).moveToNext());
                }
                finally {
                    if (query != null) {
                        try {
                            ((Cursor)query).close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)ex).addSuppressed(t);
                        }
                    }
                }
            }
        }
        catch (final OperationCanceledException ex) {}
        catch (final IllegalStateException ex) {}
        catch (final SQLiteException ex) {}
        catch (final SecurityException ex2) {}
        Log.e("ContentProviderFlagStore", "Could not read flags from ContentProvider, falling back to local stale flags", (Throwable)ex);
        if (ex instanceof OperationCanceledException) {
            mpb.a = true;
        }
        return this.i();
    }
    
    private final Map i() {
        final RandomAccessFile randomAccessFile = new RandomAccessFile(this.f(), "r");
        try {
            final mqp mqp = (mqp)oky.p(mqp.h, randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length()));
            final HashMap h = nqb.h(mqp.g.size() + 3);
            for (final mqq mqq : mqp.g) {
                final String d = mqq.d;
                String s = "";
                if (mqq.b == 5) {
                    s = (String)mqq.c;
                }
                h.put(d, s);
            }
            h.put("__phenotype_server_token", mqp.d);
            h.put("__phenotype_snapshot_token", mqp.b);
            h.put("__phenotype_configuration_version", Long.toString(mqp.e));
            final nnx n = nnx.n(h);
            randomAccessFile.close();
            return n;
        }
        finally {
            Label_0206: {
                try {
                    randomAccessFile.close();
                    break Label_0206;
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
            while (true) {}
        }
    }
    
    @Override
    protected final oey a() {
        throw new UnsupportedOperationException("ContentProvider backing should not commit mid-process.");
    }
    
    @Override
    protected final Map b() {
        final Uri a = mnw.a(this.e);
        if (mnv.a(this.d.e, a)) {
            synchronized (mpb.class) {
                if (!mpb.j.g()) {
                    try {
                        mpb.j = niz.i(jqh.a(this.d.e).b(this.d.e.getPackageManager().getPackageInfo("com.google.android.gms", 64)));
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        mpb.j = niz.i(false);
                        return nqq.a;
                    }
                }
                final boolean booleanValue = (boolean)mpb.j.c();
                monitorexit(mpb.class);
                if (booleanValue) {
                    final ContentResolver contentResolver = this.d.e.getContentResolver();
                    String[] array;
                    if (loq.b(this.d.e)) {
                        array = null;
                    }
                    else {
                        array = new String[] { "account", super.f };
                    }
                    final StrictMode$ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    while (true) {
                        try {
                            try {
                                final Map h = this.h(contentResolver, a, array, new CancellationSignal());
                                this.d.b().execute(new mpa(this, h));
                                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                                return h;
                            }
                            finally {}
                        }
                        catch (final Exception ex2) {
                            final String e = this.e;
                            final StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 57);
                            sb.append("Could not read flags for ");
                            sb.append(e);
                            sb.append(", falling back to default values");
                            Log.w("ContentProviderFlagStore", sb.toString(), (Throwable)ex2);
                            final nnx a2 = nqq.a;
                            continue;
                        }
                        break;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                }
            }
        }
        return nqq.a;
    }
    
    @Override
    protected final void c() {
        if (this.g.b != null) {
            kcs.b(this.d.e).k(this.e, super.f).g(this.d.b(), new mpm(new moy(this, this.g.b)));
        }
    }
    
    public final void e(final Map map) {
        final File f = this.f();
        if (map.isEmpty()) {
            if (f.exists()) {
                f.delete();
            }
            return;
        }
        final okt m = mqp.h.m();
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            if ("__phenotype_server_token".equals(entry.getKey())) {
                final String d = (String)map.get("__phenotype_server_token");
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final mqp mqp = (mqp)m.b;
                d.getClass();
                mqp.a |= 0x4;
                mqp.d = d;
            }
            else if ("__phenotype_snapshot_token".equals(entry.getKey())) {
                final String b = (String)map.get("__phenotype_snapshot_token");
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final mqp mqp2 = (mqp)m.b;
                b.getClass();
                mqp2.a |= 0x1;
                mqp2.b = b;
            }
            else if ("__phenotype_configuration_version".equals(entry.getKey())) {
                final long long1 = Long.parseLong((String)map.get("__phenotype_configuration_version"));
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final mqp mqp3 = (mqp)m.b;
                mqp3.a |= 0x8;
                mqp3.e = long1;
            }
            else {
                final okt i = mqq.e.m();
                final String d2 = entry.getKey();
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final mqq mqq = (mqq)i.b;
                d2.getClass();
                mqq.a |= 0x1;
                mqq.d = d2;
                final String c = (String)entry.getValue();
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final mqq mqq2 = (mqq)i.b;
                c.getClass();
                mqq2.b = 5;
                mqq2.c = c;
                m.am(i);
            }
        }
        final mqp mqp4 = (mqp)m.h();
        final File dir = super.d.e.getDir("phenotype_file", 0);
        final String e = super.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 8);
        sb.append("temp-");
        sb.append(e);
        sb.append(".pb");
        final File file = new File(dir, sb.toString());
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                mqp4.f(fileOutputStream);
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file.exists() && !file.renameTo(f)) {
                    Log.e("ContentProviderFlagStore", "Could not write Phenotype flags to backup local storage.");
                    file.delete();
                }
            }
            finally {
                try {
                    fileOutputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)map).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {
            Log.e("ContentProviderFlagStore", "Could not write Phenotype flags to temp local storage.");
            file.delete();
        }
    }
}
