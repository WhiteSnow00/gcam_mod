import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode$ThreadPolicy$Builder;
import android.os.StrictMode;
import java.io.PrintStream;
import java.util.Iterator;
import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.io.Writer;
import java.io.File;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avg implements Closeable
{
    public final File a;
    public final int b;
    public Writer c;
    public int d;
    final ThreadPoolExecutor e;
    private final File f;
    private final File g;
    private final File h;
    private final int i;
    private final long j;
    private long k;
    private final LinkedHashMap l;
    private long m;
    private final Callable n;
    
    private avg(final File a, final long j) {
        this.k = 0L;
        this.l = new LinkedHashMap(0, 0.75f, true);
        this.m = 0L;
        this.e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new avc());
        this.n = new avb(this);
        this.a = a;
        this.i = 1;
        this.f = new File(a, "journal");
        this.g = new File(a, "journal.tmp");
        this.h = new File(a, "journal.bkp");
        this.b = 1;
        this.j = j;
    }
    
    public static avg g(final File file, final long n) {
        final File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            final File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            }
            else {
                n(file2, file3, false);
            }
        }
        final avg avg = new avg(file, n);
        if (avg.f.exists()) {
            try {
                avg.m();
                k(avg.g);
                final Iterator iterator = avg.l.values().iterator();
                while (iterator.hasNext()) {
                    final ave ave = (ave)iterator.next();
                    if (ave.f == null) {
                        for (int i = 0; i < avg.b; i = 1) {
                            avg.k += ave.b[0];
                        }
                    }
                    else {
                        ave.f = null;
                        for (int j = 0; j < avg.b; j = 1) {
                            k(ave.c());
                            k(ave.d());
                        }
                        iterator.remove();
                    }
                }
                return avg;
            }
            catch (final IOException ex) {
                final PrintStream out = System.out;
                final String value = String.valueOf(file);
                final String message = ex.getMessage();
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36 + String.valueOf(message).length());
                sb.append("DiskLruCache ");
                sb.append(value);
                sb.append(" is corrupt: ");
                sb.append(message);
                sb.append(", removing");
                out.println(sb.toString());
                avg.close();
                avj.b(avg.a);
            }
        }
        file.mkdirs();
        final avg avg2 = new avg(file, n);
        avg2.c();
        return avg2;
    }
    
    private final void i() {
        if (this.c != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }
    
    private static void j(final Writer writer) {
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    private static void k(final File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
    
    private static void l(final Writer writer) {
        final StrictMode$ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode$ThreadPolicy$Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        }
        finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
    
    private final void m() {
        final avi avi = new avi(new FileInputStream(this.f), avj.a);
        try {
            final String a = avi.a();
            final String a2 = avi.a();
            final String a3 = avi.a();
            final String a4 = avi.a();
            final String a5 = avi.a();
            if ("libcore.io.DiskLruCache".equals(a) && "1".equals(a2) && Integer.toString(this.i).equals(a3) && Integer.toString(this.b).equals(a4) && "".equals(a5)) {
                int n = 0;
                try {
                    String a6 = null;
                    Label_0523: {
                        String[] split;
                        while (true) {
                            a6 = avi.a();
                            final int index = a6.indexOf(32);
                            if (index == -1) {
                                final String value = String.valueOf(a6);
                                String concat;
                                if (value.length() != 0) {
                                    concat = "unexpected journal line: ".concat(value);
                                }
                                else {
                                    concat = new String("unexpected journal line: ");
                                }
                                throw new IOException(concat);
                            }
                            final int n2 = index + 1;
                            final int index2 = a6.indexOf(32, n2);
                            Label_0517: {
                                int n3;
                                String substring2;
                                if (index2 == -1) {
                                    final String substring = a6.substring(n2);
                                    n3 = index;
                                    substring2 = substring;
                                    if (index == 6) {
                                        if (a6.startsWith("REMOVE")) {
                                            this.l.remove(substring);
                                            break Label_0517;
                                        }
                                        n3 = 6;
                                        substring2 = substring;
                                    }
                                }
                                else {
                                    substring2 = a6.substring(n2, index2);
                                    n3 = index;
                                }
                                final ave ave = this.l.get(substring2);
                                ave ave3;
                                if (ave == null) {
                                    final ave ave2 = new ave(this, substring2);
                                    this.l.put(substring2, ave2);
                                    ave3 = ave2;
                                }
                                else {
                                    ave3 = ave;
                                }
                                int n4 = n3;
                                if (index2 != -1 && (n4 = n3) == 5) {
                                    if (a6.startsWith("CLEAN")) {
                                        split = a6.substring(index2 + 1).split(" ");
                                        ave.b(ave3);
                                        ave3.f = null;
                                        if (split.length == ave3.g.b) {
                                            int i = 0;
                                            try {
                                                while (i < split.length) {
                                                    ave3.b[i] = Long.parseLong(split[i]);
                                                    ++i;
                                                }
                                                break Label_0517;
                                            }
                                            catch (final NumberFormatException ex) {
                                                throw ave.e(split);
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    else {
                                        n4 = 5;
                                    }
                                }
                                if (index2 == -1 && n4 == 5 && a6.startsWith("DIRTY")) {
                                    ave3.f = new avd(this, ave3);
                                }
                                else if (index2 != -1 || n4 != 4 || !a6.startsWith("READ")) {
                                    break Label_0523;
                                }
                            }
                            ++n;
                        }
                        throw ave.e(split);
                    }
                    final String value2 = String.valueOf(a6);
                    String concat2;
                    if (value2.length() != 0) {
                        concat2 = "unexpected journal line: ".concat(value2);
                    }
                    else {
                        concat2 = new String("unexpected journal line: ");
                    }
                    throw new IOException(concat2);
                }
                catch (final EOFException ex2) {
                    this.d = n - this.l.size();
                    if (avi.b == -1) {
                        this.c();
                    }
                    else {
                        this.c = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, true), avj.a));
                    }
                    avj.a(avi);
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 35 + String.valueOf(a2).length() + String.valueOf(a4).length() + String.valueOf(a5).length());
            sb.append("unexpected journal header: [");
            sb.append(a);
            sb.append(", ");
            sb.append(a2);
            sb.append(", ");
            sb.append(a4);
            sb.append(", ");
            sb.append(a5);
            sb.append("]");
            throw new IOException(sb.toString());
        }
        finally {
            avj.a(avi);
            while (true) {}
        }
    }
    
    private static void n(final File file, final File file2, final boolean b) {
        if (b) {
            k(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }
    
    public final avf a(final String s) {
        monitorenter(this);
        try {
            this.i();
            final ave ave = this.l.get(s);
            if (ave != null && ave.e) {
                final File[] c = ave.c;
                for (int length = c.length, i = 0; i < length; i = 1) {
                    if (!c[0].exists()) {
                        monitorexit(this);
                        return null;
                    }
                }
                ++this.d;
                this.c.append((CharSequence)"READ");
                this.c.append(' ');
                this.c.append((CharSequence)s);
                this.c.append('\n');
                if (this.e()) {
                    this.e.submit((Callable<Object>)this.n);
                }
                final avf avf = new avf(ave.c);
                monitorexit(this);
                return avf;
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final avd avd, final boolean b) {
        monitorenter(this);
        try {
            final ave a = avd.a;
            if (a.f == avd) {
                int j;
                if (b && !a.e) {
                    for (int i = 0; i < this.b; i = 1) {
                        if (!avd.b[0]) {
                            avd.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index 0");
                        }
                        if (!a.d().exists()) {
                            avd.a();
                            monitorexit(this);
                            return;
                        }
                    }
                    j = 0;
                }
                else {
                    j = 0;
                }
                while (j < this.b) {
                    final File d = a.d();
                    if (b) {
                        if (d.exists()) {
                            final File c = a.c();
                            d.renameTo(c);
                            final long n = a.b[0];
                            final long length = c.length();
                            a.b[0] = length;
                            this.k = this.k - n + length;
                        }
                        j = 1;
                    }
                    else {
                        k(d);
                        j = 1;
                    }
                }
                ++this.d;
                a.f = null;
                if (a.e | b) {
                    ave.b(a);
                    this.c.append((CharSequence)"CLEAN");
                    this.c.append(' ');
                    this.c.append((CharSequence)a.a);
                    this.c.append((CharSequence)a.a());
                    this.c.append('\n');
                    if (b) {
                        ++this.m;
                    }
                }
                else {
                    this.l.remove(a.a);
                    this.c.append((CharSequence)"REMOVE");
                    this.c.append(' ');
                    this.c.append((CharSequence)a.a);
                    this.c.append('\n');
                }
                l(this.c);
                if (this.k > this.j || this.e()) {
                    this.e.submit((Callable<Object>)this.n);
                }
                monitorexit(this);
                return;
            }
            throw new IllegalStateException();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c() {
        monitorenter(this);
        try {
            final Writer c = this.c;
            if (c != null) {
                j(c);
            }
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), avj.a));
            try {
                writer.write("libcore.io.DiskLruCache");
                writer.write("\n");
                writer.write("1");
                writer.write("\n");
                writer.write(Integer.toString(this.i));
                writer.write("\n");
                writer.write(Integer.toString(this.b));
                writer.write("\n");
                writer.write("\n");
                for (final ave ave : this.l.values()) {
                    if (ave.f != null) {
                        final String a = ave.a;
                        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 7);
                        sb.append("DIRTY ");
                        sb.append(a);
                        sb.append('\n');
                        writer.write(sb.toString());
                    }
                    else {
                        final String a2 = ave.a;
                        final String a3 = ave.a();
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 7 + String.valueOf(a3).length());
                        sb2.append("CLEAN ");
                        sb2.append(a2);
                        sb2.append(a3);
                        sb2.append('\n');
                        writer.write(sb2.toString());
                    }
                }
                j(writer);
                if (this.f.exists()) {
                    n(this.f, this.h, true);
                }
                n(this.g, this.f, false);
                this.h.delete();
                writer = new OutputStreamWriter(new FileOutputStream(this.f, true), avj.a);
                this.c = new BufferedWriter(writer);
                monitorexit(this);
            }
            finally {
                j(writer);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (this.c == null) {
                monitorexit(this);
                return;
            }
            final ArrayList list = new ArrayList(this.l.values());
            for (int size = list.size(), i = 0; i < size; ++i) {
                final avd f = ((ave)list.get(i)).f;
                if (f != null) {
                    f.a();
                }
            }
            this.d();
            j(this.c);
            this.c = null;
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void d() {
        while (this.k > this.j) {
            this.h(this.l.entrySet().iterator().next().getKey());
        }
    }
    
    public final boolean e() {
        final int d = this.d;
        return d >= 2000 && d >= this.l.size();
    }
    
    public final avd f(final String s) {
        synchronized (this) {
            this.i();
            ave ave = this.l.get(s);
            if (ave == null) {
                ave = new ave(this, s);
                this.l.put(s, ave);
            }
            else if (ave.f != null) {
                return null;
            }
            final avd f = new avd(this, ave);
            ave.f = f;
            this.c.append((CharSequence)"DIRTY");
            this.c.append(' ');
            this.c.append((CharSequence)s);
            this.c.append('\n');
            l(this.c);
            return f;
        }
    }
    
    public final void h(final String s) {
        monitorenter(this);
        try {
            this.i();
            final ave ave = this.l.get(s);
            if (ave != null && ave.f == null) {
                for (int i = 0; i < this.b; i = 1) {
                    final File c = ave.c();
                    if (c.exists() && !c.delete()) {
                        final String value = String.valueOf(c);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
                        sb.append("failed to delete ");
                        sb.append(value);
                        throw new IOException(sb.toString());
                    }
                    final long k = this.k;
                    final long[] b = ave.b;
                    this.k = k - b[0];
                    b[0] = 0L;
                }
                ++this.d;
                this.c.append((CharSequence)"REMOVE");
                this.c.append(' ');
                this.c.append((CharSequence)s);
                this.c.append('\n');
                this.l.remove(s);
                if (this.e()) {
                    this.e.submit((Callable<Object>)this.n);
                }
                monitorexit(this);
                return;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
