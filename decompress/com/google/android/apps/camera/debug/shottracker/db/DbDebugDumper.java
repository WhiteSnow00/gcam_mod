// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.debug.shottracker.db;

import java.util.concurrent.locks.Lock;
import android.content.Context;
import java.util.HashMap;
import java.util.ArrayList;
import android.database.Cursor;
import java.util.Iterator;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.Temporal;
import j$.time.Duration;
import j$.time.Instant;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;

public class DbDebugDumper extends dbe
{
    private static final DateTimeFormatter a;
    
    static {
        a = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS").withZone(ZoneId.systemDefault());
    }
    
    private static void b(final Map map, final List list, final PrintWriter printWriter) {
        PrintWriter printWriter2 = printWriter;
        final Iterator iterator = list.iterator();
        long b = Long.MAX_VALUE;
        Object o = null;
        while (iterator.hasNext()) {
            final ddi ddi = (ddi)iterator.next();
            final ddc ddc = map.get(ddi.b);
            if (ddc != null) {
                PrintWriter printWriter3;
                Object o2;
                if (ddi.b != b) {
                    if (b < Long.MAX_VALUE) {
                        printWriter2.println("");
                        printWriter.flush();
                    }
                    final long a = ddc.a;
                    final String i = ddc.i;
                    final long j = ddc.j;
                    final String b2 = ddc.b;
                    final String h = ddc.h;
                    final long c = ddc.c;
                    final long d = ddc.d;
                    final long e = ddc.e;
                    final long f = ddc.f;
                    final long g = ddc.g;
                    final boolean l = ddc.l;
                    final StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 241 + String.valueOf(b2).length() + String.valueOf(h).length());
                    sb.append(a);
                    sb.append(" ");
                    sb.append(i);
                    sb.append("[pid=");
                    sb.append(j);
                    sb.append("] title=");
                    sb.append(b2);
                    sb.append(" captureSessionType=");
                    sb.append(h);
                    sb.append(" start=");
                    sb.append(c);
                    sb.append(" persisted=");
                    sb.append(d);
                    sb.append(" canceled=");
                    sb.append(e);
                    sb.append(" deleted=");
                    sb.append(f);
                    sb.append(" mostRecentEvent=");
                    sb.append(g);
                    sb.append(" failed=");
                    sb.append(l);
                    final String string = sb.toString();
                    printWriter3 = printWriter;
                    printWriter3.println(string);
                    o2 = null;
                }
                else {
                    final PrintWriter printWriter4 = printWriter2;
                    o2 = o;
                    printWriter3 = printWriter4;
                }
                final Instant ofEpochMilli = Instant.ofEpochMilli(ddi.c);
                Duration duration;
                if (o2 == null) {
                    duration = Duration.ZERO;
                }
                else {
                    duration = Duration.between((Temporal)o2, (Temporal)ofEpochMilli);
                }
                final long c2 = ddi.c;
                final String format = DbDebugDumper.a.format((TemporalAccessor)ofEpochMilli);
                final long millis = duration.toMillis();
                String s;
                if (millis >= 1000L) {
                    final double n = (double)millis;
                    Double.isNaN(n);
                    s = String.format("%10.3fs", n / 1000.0);
                }
                else {
                    s = String.format("      .%03ds", millis);
                }
                final String d2 = ddi.d;
                final StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 26 + String.valueOf(s).length() + String.valueOf(d2).length());
                sb2.append("  ");
                sb2.append(c2);
                sb2.append("  ");
                sb2.append(format);
                sb2.append(s);
                sb2.append(": ");
                sb2.append(d2);
                printWriter3.println(sb2.toString());
                b = ddi.b;
                printWriter2 = printWriter3;
                o = ofEpochMilli;
            }
        }
        printWriter.flush();
    }
    
    @Override
    public final void a(PrintWriter writeLock) {
        final Context context = this.getContext();
        context.getClass();
        final ao d = cp.d(context, ShotDatabase.class, "shot_db");
        d.c();
        final ShotDatabase shotDatabase = (ShotDatabase)d.a();
        final dcu r = shotDatabase.r();
        final at a = at.a("SELECT * FROM shots ORDER BY shot_id", 0);
        final dda dda = (dda)r;
        dda.a.g();
        Object o = gz.s(dda.a, a, false);
        Object a2 = a;
        Map<Long, ddc> map = null;
        Label_1195: {
            try {
                final int v = gz.v((Cursor)o, "shot_id");
                a2 = a;
                final int v2 = gz.v((Cursor)o, "title");
                a2 = a;
                final int v3 = gz.v((Cursor)o, "start_millis");
                a2 = a;
                final int v4 = gz.v((Cursor)o, "persisted_millis");
                a2 = a;
                final int v5 = gz.v((Cursor)o, "canceled_millis");
                a2 = a;
                final int v6 = gz.v((Cursor)o, "deleted_millis");
                a2 = a;
                final int v7 = gz.v((Cursor)o, "most_recent_event_millis");
                a2 = a;
                final int v8 = gz.v((Cursor)o, "capture_session_type");
                a2 = a;
                final int v9 = gz.v((Cursor)o, "capture_session_shot_id");
                a2 = a;
                final int v10 = gz.v((Cursor)o, "pid");
                a2 = a;
                final int v11 = gz.v((Cursor)o, "stuck");
                a2 = a;
                final int v12 = gz.v((Cursor)o, "failed");
                a2 = a;
                a2 = a;
                final ArrayList list = new ArrayList(((Cursor)o).getCount());
                while (true) {
                    a2 = a;
                    if (((Cursor)o).moveToNext()) {
                        try {
                            a2 = new ddc();
                            ((ddc)a2).a = ((Cursor)o).getLong(v);
                            if (((Cursor)o).isNull(v2)) {
                                ((ddc)a2).b = null;
                            }
                            else {
                                ((ddc)a2).b = ((Cursor)o).getString(v2);
                            }
                            ((ddc)a2).c = ((Cursor)o).getLong(v3);
                            ((ddc)a2).d = ((Cursor)o).getLong(v4);
                            ((ddc)a2).e = ((Cursor)o).getLong(v5);
                            ((ddc)a2).f = ((Cursor)o).getLong(v6);
                            ((ddc)a2).g = ((Cursor)o).getLong(v7);
                            if (((Cursor)o).isNull(v8)) {
                                ((ddc)a2).h = null;
                            }
                            else {
                                ((ddc)a2).h = ((Cursor)o).getString(v8);
                            }
                            if (((Cursor)o).isNull(v9)) {
                                ((ddc)a2).i = null;
                            }
                            else {
                                ((ddc)a2).i = ((Cursor)o).getString(v9);
                            }
                            ((ddc)a2).j = ((Cursor)o).getLong(v10);
                            ((ddc)a2).k = (((Cursor)o).getInt(v11) != 0);
                            ((ddc)a2).l = (((Cursor)o).getInt(v12) != 0);
                            list.add(a2);
                            continue;
                        }
                        finally {
                            break Label_1195;
                        }
                        break;
                    }
                    break;
                }
                ((Cursor)o).close();
                a.j();
                final ddd s = shotDatabase.s();
                a2 = at.a("SELECT * FROM shot_log ORDER BY shot_id DESC, sequence", 0);
                final ddh ddh = (ddh)s;
                ddh.a.g();
                o = gz.s(ddh.a, (aff)a2, false);
                try {
                    final int v13 = gz.v((Cursor)o, "sequence");
                    final int v14 = gz.v((Cursor)o, "shot_id");
                    final int v15 = gz.v((Cursor)o, "time_millis");
                    final int v16 = gz.v((Cursor)o, "message");
                    final ArrayList list2 = new ArrayList<ddi>(((Cursor)o).getCount());
                    while (((Cursor)o).moveToNext()) {
                        final ddi ddi = new ddi();
                        ddi.a = ((Cursor)o).getInt(v13);
                        ddi.b = ((Cursor)o).getLong(v14);
                        ddi.c = ((Cursor)o).getLong(v15);
                        if (((Cursor)o).isNull(v16)) {
                            ddi.d = null;
                        }
                        else {
                            ddi.d = ((Cursor)o).getString(v16);
                        }
                        list2.add(ddi);
                    }
                    ((Cursor)o).close();
                    ((at)a2).j();
                    a2 = new HashMap<Long, ddc>();
                    o = new HashMap<Long, ddc>();
                    for (final ddc ddc : list) {
                        if (!ddc.l && (ddc.d != 0L || ddc.e != 0L || ddc.f != 0L)) {
                            ((Map<Long, ddc>)a2).put(Long.valueOf(ddc.a), ddc);
                        }
                        else {
                            ((Map<Long, ddc>)o).put(Long.valueOf(ddc.a), ddc);
                        }
                    }
                    final int size = ((Map)o).size();
                    final int size2 = ((Map)a2).size();
                    final StringBuilder sb = new StringBuilder(44);
                    sb.append("DUMPING: ");
                    sb.append(size);
                    sb.append(" SUSPECT, ");
                    sb.append(size2);
                    sb.append(" OK");
                    writeLock.println(sb.toString());
                    writeLock.flush();
                    if (!((Map)o).isEmpty()) {
                        writeLock.println("\nSUSPECT SHOTS");
                        b((Map)o, list2, writeLock);
                    }
                    if (!((Map)a2).isEmpty()) {
                        writeLock.println("\nOK SHOTS");
                        b((Map)a2, list2, writeLock);
                    }
                    final int size3 = ((Map)o).size();
                    final int size4 = ((Map)a2).size();
                    final StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("\nDUMPED: ");
                    sb2.append(size3);
                    sb2.append(" SUSPECT, ");
                    sb2.append(size4);
                    sb2.append(" OK");
                    writeLock.println(sb2.toString());
                    writeLock.flush();
                    if (shotDatabase.l()) {
                        writeLock = (PrintWriter)shotDatabase.g.writeLock();
                        ((Lock)writeLock).lock();
                        try {
                            final jp l = shotDatabase.c.l;
                            shotDatabase.b.close();
                        }
                        finally {
                            ((Lock)writeLock).unlock();
                        }
                    }
                    return;
                }
                finally {
                    ((Cursor)o).close();
                    ((at)a2).j();
                }
            }
            finally {
                map = (Map<Long, ddc>)a2;
            }
        }
        ((Cursor)o).close();
        ((at)map).j();
        throw;
    }
}
