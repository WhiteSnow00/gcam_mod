import java.util.Iterator;
import java.nio.charset.StandardCharsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ltp
{
    private final niz a;
    private boolean b;
    private String c;
    private int d;
    private final List e;
    
    public ltp(final niz a) {
        this.b = false;
        this.e = new ArrayList();
        this.a = a;
    }
    
    public final ByteBuffer a() {
        monitorenter(this);
        boolean b = true;
        try {
            this.b = true;
            final String c = this.c;
            final int d = this.d;
            final List e = this.e;
            final ArrayList list = new ArrayList();
            final byte[] bytes = c.getBytes(StandardCharsets.UTF_8);
            if (bytes.length != 4) {
                final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 23);
                sb.append("Major brand ");
                sb.append(c);
                sb.append(" is invalid");
                throw new IllegalArgumentException(sb.toString());
            }
            list.add(ByteBuffer.wrap(bytes));
            final ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(d);
            allocate.flip();
            list.add(allocate);
            for (final String s : e) {
                final byte[] bytes2 = s.getBytes(StandardCharsets.UTF_8);
                if (bytes2.length != 4) {
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 28);
                    sb2.append("Compatible brand ");
                    sb2.append(s);
                    sb2.append(" is invalid");
                    throw new IllegalArgumentException(sb2.toString());
                }
                list.add(ByteBuffer.wrap(bytes2));
            }
            final ByteBuffer i = ltl.i("ftyp", list);
            if (!this.a.g()) {
                monitorexit(this);
                return i;
            }
            final int n = (int)this.a.c() * 4 + 24;
            final ByteBuffer allocate2 = ByteBuffer.allocate(n);
            allocate2.put(i);
            allocate2.put(ltl.j("free", ByteBuffer.allocate(((int)this.a.c() - this.e.size()) * 4)));
            allocate2.flip();
            if (allocate2.remaining() != n) {
                b = false;
            }
            njo.o(b);
            monitorexit(this);
            return allocate2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final String s) {
        synchronized (this) {
            if (this.e.contains(s)) {
                return;
            }
            if (this.a.g() && this.e.size() + 1 > (int)this.a.c()) {
                final String value = String.valueOf(this.a.c());
                final StringBuilder sb = new StringBuilder(s.length() + 49 + String.valueOf(value).length());
                sb.append("Can't add brand ");
                sb.append(s);
                sb.append(" as it doesn't fit in the max of ");
                sb.append(value);
                throw new IllegalStateException(sb.toString());
            }
            if (!this.a.g() && this.b) {
                final StringBuilder sb2 = new StringBuilder(s.length() + 50);
                sb2.append("Can't add brand ");
                sb2.append(s);
                sb2.append(" as ftyp has already been written.");
                throw new IllegalStateException(sb2.toString());
            }
            this.e.add(s);
        }
    }
    
    public final void c() {
        synchronized (this) {
            if (!this.a.g() && this.b) {
                throw new IllegalStateException("Can't change major brand as ftyp has already been written");
            }
            this.c = "isom";
            this.d = 131072;
        }
    }
}
