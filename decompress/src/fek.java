import java.text.Format;
import android.os.ParcelFileDescriptor;
import android.database.Cursor;
import android.content.ContentResolver;
import android.content.ContentValues;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import android.content.ContentUris;
import android.os.CancellationSignal;
import android.provider.MediaStore$Video$Media;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fek implements hub
{
    private static final nsd a;
    private final AtomicBoolean b;
    private final Context c;
    private final llb d;
    private final eyt e;
    private final long f;
    private final boolean g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/ScanAndPublishPendingVideosBehavior");
    }
    
    public fek(final Context c, final llb d, final cxl cxl, final eyt e) {
        this.b = new AtomicBoolean(false);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = System.currentTimeMillis() / 1000L - 5L;
        this.g = cxl.k(cxw.x);
    }
    
    @Override
    public final void run() {
        try {
            if (this.b.getAndSet(true)) {
                return;
            }
            final ContentResolver contentResolver = this.c.getContentResolver();
            final String packageName = this.c.getPackageName();
            final Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-match-pending", 3);
            final long f = this.f;
            final StringBuilder sb = new StringBuilder(60);
            sb.append("owner_package_name = ? AND date_added < ");
            sb.append(f);
            bundle.putString("android:query-arg-sql-selection", sb.toString());
            bundle.putStringArray("android:query-arg-sql-selection-args", new String[] { packageName });
            final Cursor query = contentResolver.query(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, new String[] { "_id", "date_added" }, bundle, (CancellationSignal)null);
            Label_0689: {
                if (query == null) {
                    break Label_0689;
                }
                try {
                Block_9_Outer:
                    while (query.moveToNext()) {
                        final int int1 = query.getInt(0);
                        final long long1 = query.getLong(1);
                        Label_0392: {
                            if (this.g) {
                                final ParcelFileDescriptor openFileDescriptor = this.c.getContentResolver().openFileDescriptor(ContentUris.withAppendedId(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, (long)int1), "r", (CancellationSignal)null);
                                Label_0228: {
                                    if (openFileDescriptor != null) {
                                        break Label_0228;
                                    }
                                    try {
                                        fek.a.c().E(1580).p("Could not inspect video id %d as openFileDescriptor returned null", int1);
                                        continue Block_9_Outer;
                                        while (true) {
                                            final long statSize;
                                            fek.a.c().E(1579).H(int1, statSize);
                                            Label_0272: {
                                                break Label_0272;
                                                final FileInputStream fileInputStream;
                                                Label_0279: {
                                                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                                                }
                                                try {
                                                    if (!lua.c(fileInputStream).f("mdat").a.g()) {
                                                        fek.a.c().E(1578).p("Not restoring video id %d since it does not have an mdat box", int1);
                                                        fileInputStream.close();
                                                        break Label_0272;
                                                    }
                                                    fileInputStream.close();
                                                    openFileDescriptor.close();
                                                    break Label_0392;
                                                }
                                                finally {
                                                    try {
                                                        fileInputStream.close();
                                                    }
                                                    finally {
                                                        final Throwable t;
                                                        final Throwable t2;
                                                        t.addSuppressed(t2);
                                                    }
                                                }
                                            }
                                            openFileDescriptor.close();
                                            continue Block_9_Outer;
                                            statSize = openFileDescriptor.getStatSize();
                                            iftrue(Label_0279:)(statSize >= 200000L);
                                            continue;
                                        }
                                    }
                                    finally {
                                        if (openFileDescriptor != null) {
                                            try {
                                                openFileDescriptor.close();
                                            }
                                            finally {
                                                final Throwable t3;
                                                ((Throwable)contentResolver).addSuppressed(t3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Object o = this.d.j;
                        synchronized (o) {
                            final String format = ((Format)o).format(TimeUnit.SECONDS.toMillis(long1));
                            monitorexit(o);
                            o = this.d.c;
                            final StringBuilder sb2 = new StringBuilder(String.valueOf(o).length() + 9 + String.valueOf(format).length());
                            sb2.append((String)o);
                            sb2.append(format);
                            sb2.append(".RESTORED");
                            final String string = sb2.toString();
                            o = new ContentValues();
                            ((ContentValues)o).put("is_pending", Integer.valueOf(0));
                            ((ContentValues)o).put("_display_name", string);
                            contentResolver.update(ContentUris.withAppendedId(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, (long)int1), (ContentValues)o, (String)null, (String[])null);
                            fek.a.c().E(1576).p("Published still-pending video id %s", int1);
                            final long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                            o = this.e;
                            final okt m = nzm.d.m();
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final nzm nzm = (nzm)m.b;
                            final int a = nzm.a | 0x1;
                            nzm.a = a;
                            nzm.b = seconds - long1;
                            nzm.c = 3;
                            nzm.a = (a | 0x2);
                            ((eyt)o).g((nzm)m.h());
                            continue;
                        }
                        break;
                    }
                    query.close();
                }
                finally {
                    if (query != null) {
                        try {
                            query.close();
                        }
                        finally {
                            final Throwable t4;
                            final Throwable t5;
                            t4.addSuppressed(t5);
                        }
                    }
                    fek.a.c().E(1577).o("Got null cursor while restoring videos");
                }
            }
        }
        finally {
            final Throwable t6;
            a.m(fek.a.b(), "Failed to publish still-pending videos", '\u0627', t6);
        }
    }
}
