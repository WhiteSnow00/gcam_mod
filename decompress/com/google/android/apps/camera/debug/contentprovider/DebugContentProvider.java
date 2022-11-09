// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.debug.contentprovider;

import java.util.Iterator;
import android.database.Cursor;
import android.content.ContentValues;
import java.util.Map;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.net.Uri;
import android.content.Context;
import j$.util.stream.Collectors;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.ArrayList;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.List;
import j$.util.function.Predicate;
import android.content.ContentProvider;

public class DebugContentProvider extends ContentProvider
{
    private static final nsd b;
    public cxl a;
    private dbd c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/debug/contentprovider/DebugContentProvider");
    }
    
    public static final List b(final Class clazz, final Predicate predicate) {
        Instrumentation instance;
        try {
            instance = Instrumentation.instance();
        }
        catch (final NullPointerException ex) {
            instance = null;
        }
        if (instance == null) {
            a.l(DebugContentProvider.b.b(), "Could not get an instance of the instrumentation.", '\u02b8');
            return new ArrayList();
        }
        return (List)Collection$_EL.stream((Collection)instance.b(clazz)).filter(predicate).collect(Collectors.toList());
    }
    
    private final dbd c() {
        synchronized (this) {
            if (this.c == null) {
                final Context context = this.getContext();
                context.getClass();
                final dbd c = new dbd(String.valueOf(context.getPackageName()).concat(".DebugContentProvider"));
                c.b("startup_timing_latest", hvu.class, new dav(1));
                c.b("shutter_lag_latest", hwd.class, new dav());
                this.c = c;
            }
            return this.c;
        }
    }
    
    protected final cxl a() {
        synchronized (this) {
            if (this.a == null) {
                final Context context = this.getContext();
                context.getClass();
                ((daw)((egp)context.getApplicationContext()).c(daw.class)).f(this);
            }
            return this.a;
        }
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        a.l(DebugContentProvider.b.b(), "Delete not supported for DebugContentProvider.", '\u02b4');
        throw new IllegalArgumentException();
    }
    
    public final void dump(FileDescriptor a, final PrintWriter printWriter, String[] iterator) {
        try {
            final dbd c = this.c();
            printWriter.printf("%s,%s,%s,%s,%s", "path", "_id", "run", "name", "time_ns");
            printWriter.println();
            iterator = (String[])(Object)c.e.entrySet().iterator();
            while (((Iterator)(Object)iterator).hasNext()) {
                final Map.Entry<K, dbc> entry = ((Iterator<Map.Entry<K, dbc>>)(Object)iterator).next();
                a = (FileDescriptor)c.a(entry.getValue(), true, dbd.b);
                try {
                    while (((Cursor)a).moveToNext()) {
                        printWriter.printf("%s,%d,%d,%s,%d", entry.getKey(), ((Cursor)a).getInt(((Cursor)a).getColumnIndex("_id")), ((Cursor)a).getInt(((Cursor)a).getColumnIndex("run")), ((Cursor)a).getString(((Cursor)a).getColumnIndex("name")), ((Cursor)a).getLong(((Cursor)a).getColumnIndex("time_ns")));
                        printWriter.println();
                    }
                    ((Cursor)a).close();
                    continue;
                }
                finally {
                    try {
                        ((Cursor)a).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)printWriter).addSuppressed(t);
                    }
                }
                break;
            }
            if (this.a() != null) {
                printWriter.println();
            }
        }
        catch (final Exception ex) {
            a.m(DebugContentProvider.b.b(), "Dump exception", '\u02b9', ex);
        }
    }
    
    public final String getType(final Uri uri) {
        return null;
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        a.l(DebugContentProvider.b.b(), "Insert not supported for DebugContentProvider.", '\u02b7');
        throw new IllegalArgumentException();
    }
    
    public final boolean onCreate() {
        return true;
    }
    
    public final Cursor query(final Uri uri, String[] array, final String s, final String[] array2, final String s2) {
        final String callingPackage = this.getCallingPackage();
        if (callingPackage != null && ("com.android.shell".equals(callingPackage) || "root".equals(callingPackage))) {
            array = null;
            Object o;
            try {
                final dbd c = this.c();
                final njp njp = c.d.get(c.c.match(uri));
                if (njp == null) {
                    a.k(dbd.a.b(), "bad uri %s", uri, '\u02bb');
                    o = array;
                }
                else {
                    o = njp.a();
                }
            }
            catch (final Exception ex) {
                a.m(DebugContentProvider.b.b(), "Query exception", '\u02b6', ex);
                o = array;
            }
            return (Cursor)o;
        }
        throw new IllegalArgumentException();
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        a.l(DebugContentProvider.b.b(), "Update not supported for DebugContentProvider.", '\u02b5');
        throw new IllegalArgumentException();
    }
}
