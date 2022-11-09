import java.util.concurrent.Future;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class gbe implements Runnable
{
    final /* synthetic */ gbf a;
    private final gyb b;
    private final ofn c;
    
    public gbe(final gbf a, final gyb b, final ofn c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        while (true) {
            try {
                final gbf a = this.a;
                final gyb b = this.b;
                a.e.f("allocateAndCompressJpeg");
                final int n = b.e.width() * 3 * b.e.height() / 2;
                final int n2 = n / 2;
                Object o = a.b.c(n2);
                Throwable t = null;
                Label_0663: {
                    try {
                        ByteBuffer byteBuffer = (ByteBuffer)((gyv)o).a();
                        if (byteBuffer == null) {
                            final StringBuilder sb = new StringBuilder(53);
                            sb.append("Failed to allocate buffer for JPEG: ");
                            sb.append(n2);
                            sb.append(" bytes");
                            throw new RuntimeException(sb.toString());
                        }
                        int n3 = a.d.b(b, byteBuffer.duplicate());
                        while (true) {
                            if (n3 > n2) {
                                ((gyv)o).close();
                                Object o2;
                                final gyv gyv = (gyv)(o2 = a.b.c(n));
                                try {
                                    final ByteBuffer byteBuffer2 = (ByteBuffer)gyv.a();
                                    if (byteBuffer2 == null) {
                                        o2 = gyv;
                                        o2 = gyv;
                                        o = new(java.lang.StringBuilder.class)();
                                        o2 = gyv;
                                        new StringBuilder(53);
                                        o2 = gyv;
                                        ((StringBuilder)o).append("Failed to allocate buffer for JPEG: ");
                                        o2 = gyv;
                                        ((StringBuilder)o).append(n);
                                        o2 = gyv;
                                        ((StringBuilder)o).append(" bytes");
                                        o2 = gyv;
                                        final RuntimeException ex = new RuntimeException(((StringBuilder)o).toString());
                                        o2 = gyv;
                                        throw ex;
                                    }
                                    o2 = gyv;
                                    n3 = a.d.b(b, byteBuffer2.duplicate());
                                    o = gyv;
                                    byteBuffer = byteBuffer2;
                                    if (n3 > 0) {
                                        o2 = o;
                                        byteBuffer.position(0);
                                        o2 = o;
                                        byteBuffer.limit(n3);
                                        o2 = o;
                                        byteBuffer.order(ByteOrder.nativeOrder());
                                        o2 = o;
                                        final byte[] array = new byte[n3];
                                        o2 = o;
                                        byteBuffer.get(array);
                                        o2 = o;
                                        a.e.g();
                                        ((gyv)o).close();
                                        o2 = kvj.b();
                                        o = this.b.c;
                                        o.getClass();
                                        o = ((Future<ljm>)o).get();
                                        final kre g = kre.g(this.b.e);
                                        final kra a2 = this.a.d.a(this.b);
                                        ((kvj)o2).f(g.a, g.b, a2, niz.i(o));
                                        ((kvj)o2).g(this.b.k);
                                        this.c.o(gaf.a(this.b.a.d(), array, g, a2.e, ((kvj)o2).a, this.a.c));
                                        if (!this.c.isDone() && !this.c.isCancelled()) {
                                            o2 = this.c;
                                            o = new RuntimeException("Unknown error while encoding imageToProcess");
                                            ((ofn)o2).a((Throwable)o);
                                        }
                                        return;
                                    }
                                }
                                finally {
                                    o = o2;
                                    break Label_0663;
                                }
                                final StringBuilder sb2 = new StringBuilder(57);
                                sb2.append("Error compressing jpeg: num bytes written was ");
                                sb2.append(n3);
                                throw new RuntimeException(sb2.toString());
                            }
                            continue;
                        }
                    }
                    finally {
                        final Throwable t2;
                        t = t2;
                    }
                }
                ((gyv)o).close();
                throw t;
            }
            catch (final Exception ex2) {}
            finally {
                Label_0766: {
                    if (!this.c.isDone() && !this.c.isCancelled()) {
                        this.c.a(new RuntimeException("Unknown error while encoding imageToProcess"));
                        break Label_0766;
                    }
                    break Label_0766;
                }
                while (true) {}
                Label_0728: {
                    return;
                }
                iftrue(Label_0728:)(this.c.isCancelled());
                final Object o2 = this.c;
                final Object o = new RuntimeException("Unknown error while encoding imageToProcess");
                continue;
            }
            break;
        }
    }
}
