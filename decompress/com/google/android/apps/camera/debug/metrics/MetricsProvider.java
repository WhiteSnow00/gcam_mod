// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.debug.metrics;

import android.util.Printer;
import java.util.Set;
import java.util.Iterator;
import android.content.Context;
import java.util.Locale;
import java.util.Map;
import android.util.PrintWriterPrinter;
import java.io.PrintWriter;

public class MetricsProvider extends dbe
{
    public lip a;
    
    @Override
    public final void a(PrintWriter printWriter) {
        if (this.a == null) {
            final Context context = this.getContext();
            context.getClass();
            ((dbs)((egp)context.getApplicationContext()).c(dbs.class)).g(this);
        }
        final long nanoTime = System.nanoTime();
        final PrintWriterPrinter printWriterPrinter = new PrintWriterPrinter(printWriter);
        final lip a = this.a;
        nov.z(a);
        final lii a2 = a.a;
        printWriter = (PrintWriter)a2.a;
        monitorenter(printWriter);
        try {
            final lin a3 = a2.b.a;
            final lin lin = new lin();
            for (final Map.Entry<String, V> entry : a3.a.entrySet()) {
                final Map a4 = lin.a;
                final String s = entry.getKey();
                final lil lil = (lil)entry.getValue();
                final lil lil2 = new lil(lil.a);
                for (final Map.Entry<lhu, V> entry2 : lil.b.entrySet()) {
                    lil2.b.put(entry2.getKey(), ((lim)entry2.getValue()).a());
                }
                a4.put(s, lil2);
            }
            monitorexit(printWriter);
            final Iterator iterator3 = lin.a.values().iterator();
            while (iterator3.hasNext()) {
                printWriter = (PrintWriter)iterator3.next();
                Label_1044: {
                    if (printWriter == null) {
                        printWriter = (PrintWriter)"";
                    }
                    else {
                        if (((lil)printWriter).b().length == 0) {
                            final String a5 = ((lil)printWriter).a();
                            final Object[] b = lhu.a.b;
                            final Iterator iterator4 = ((lil)printWriter).b.entrySet().iterator();
                        Label_0355:
                            while (true) {
                                while (iterator4.hasNext()) {
                                    printWriter = (PrintWriter)iterator4.next();
                                    for (int i = 0; i < b.length; ++i) {
                                        if (b[i] != null && ((Map.Entry<lhu, V>)printWriter).getKey().b[i] != b[i]) {
                                            continue Label_0355;
                                        }
                                    }
                                    printWriter = (PrintWriter)((Map.Entry<K, lim>)printWriter).getValue();
                                    final String c = lio.c((lim)printWriter);
                                    printWriter = (PrintWriter)new StringBuilder(a5.length() + 2 + String.valueOf(c).length());
                                    ((StringBuilder)printWriter).append(a5);
                                    ((StringBuilder)printWriter).append(": ");
                                    ((StringBuilder)printWriter).append(c);
                                    printWriter = (PrintWriter)((StringBuilder)printWriter).toString();
                                    break Label_1044;
                                }
                                printWriter = null;
                                continue;
                            }
                        }
                        final lht[] b2 = ((lil)printWriter).b();
                        final Set entrySet = ((lil)printWriter).b.entrySet();
                        final int length = b2.length;
                        final int n = length + 1;
                        final int[] array = new int[n];
                        final String[][] array2 = new String[entrySet.size() + 1][n];
                        for (int j = 0; j < length; ++j) {
                            array2[0][j] = b2[j].a;
                            array[j] = b2[j].a.length();
                        }
                        array2[0][length] = "";
                        array[length] = 1;
                        final Iterator iterator5 = entrySet.iterator();
                        int n2 = 1;
                        while (iterator5.hasNext()) {
                            final Map.Entry<lhu, V> entry3 = (Map.Entry<lhu, V>)iterator5.next();
                            for (int k = 0; k < length; ++k) {
                                final String format = String.format(Locale.ROOT, "%s", entry3.getKey().b[k]);
                                array[k] = Math.max(array[k], format.length());
                                array2[n2][k] = format;
                            }
                            final String c2 = lio.c((lim)entry3.getValue());
                            array[length] = Math.max(array[length], c2.length());
                            array2[n2][length] = c2;
                            ++n2;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("  ");
                        int n3 = 0;
                        int n4;
                        while (true) {
                            n4 = length - 1;
                            if (n3 >= n4) {
                                break;
                            }
                            sb.append("%-");
                            sb.append(array[n3] + 1);
                            sb.append("s");
                            ++n3;
                        }
                        final String value = String.valueOf(sb);
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 2);
                        sb2.append(value);
                        sb2.append("%s");
                        final String string = sb2.toString();
                        sb.append("%-");
                        sb.append(array[n4]);
                        sb.append("s:%");
                        sb.append(array[length] + 1);
                        sb.append("s");
                        final String string2 = sb.toString();
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(((lil)printWriter).a());
                        sb3.append("\n");
                        sb3.append(String.format(Locale.ROOT, string, (Object[])array2[0]));
                        for (int l = 1; l < array2.length; ++l) {
                            sb3.append("\n");
                            sb3.append(String.format(Locale.ROOT, string2, (Object[])array2[l]));
                        }
                        printWriter = (PrintWriter)sb3.toString();
                    }
                }
                ((Printer)printWriterPrinter).println((String)printWriter);
            }
            final long nanoTime2 = System.nanoTime();
            printWriter = (PrintWriter)Locale.ROOT;
            final double n5 = (double)(nanoTime2 - nanoTime);
            Double.isNaN(n5);
            ((Printer)printWriterPrinter).println(String.format((Locale)printWriter, "\n\nMetrics dumped in %.6f ms", n5 / 1000000.0));
        }
        finally {
            monitorexit(printWriter);
            while (true) {}
        }
    }
}
