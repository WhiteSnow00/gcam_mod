import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class din implements dja
{
    public final Executor a;
    private final krr b;
    private final lyp c;
    private long d;
    private final gae e;
    
    public din(final gae e, final Executor a, final dsd dsd, final krr krr) {
        this.d = 0L;
        this.e = e;
        this.a = a;
        this.c = dsd.a("vesper");
        this.b = krr.a("GpuFBCtrl");
    }
    
    @Override
    public final oey a(final diz diz) {
        if (!diz.b.b()) {
            return ofi.n(new dih(diz.a));
        }
        return this.e.a(new dim(this, diz));
    }
    
    public final diy b(final diz diz) {
        synchronized (this) {
            long d = this.d;
            if (d == 0L) {
                d = GpuRetoucherNative.createRetoucher(true);
                this.d = d;
            }
            boolean b = false;
            njo.o(d != 0L);
            HardwareBuffer hardwareBuffer = diz.a.f();
            try {
                hardwareBuffer.getClass();
                if (hardwareBuffer.getFormat() == 1) {
                    b = true;
                }
                if (hardwareBuffer != null) {
                    hardwareBuffer.close();
                }
                final djb a = djb.a(diz.c);
                if (a.a.isEmpty()) {
                    return new dih(diz.a);
                }
                hardwareBuffer = diz.a.f();
                try {
                    hardwareBuffer.getClass();
                    final krr b2 = this.b;
                    final int c = diz.a.c();
                    final int b3 = diz.a.b();
                    final StringBuilder sb = new StringBuilder(70);
                    sb.append("Running GPU face retouch on an image of size ");
                    sb.append(c);
                    sb.append(" x ");
                    sb.append(b3);
                    b2.g(sb.toString());
                    final long d2 = this.d;
                    final boolean b4 = b ^ true;
                    final int c2 = diz.a.c();
                    final int b5 = diz.a.b();
                    final Object[] array = a.a.toArray();
                    final float b6 = a.b;
                    final hjc b7 = diz.b;
                    b7.getClass();
                    GpuRetoucherNative.process(d2, hardwareBuffer, b4, hardwareBuffer, b4, c2, b5, array, b6, b7.e);
                    if (hardwareBuffer != null) {
                        hardwareBuffer.close();
                    }
                    return new dig(diz.a, null, diz.b);
                }
                finally {
                    if (hardwareBuffer != null) {
                        try {
                            hardwareBuffer.close();
                        }
                        finally {
                            ((Throwable)diz).addSuppressed((Throwable)hardwareBuffer);
                        }
                    }
                }
            }
            finally {
                if (hardwareBuffer != null) {
                    try {
                        hardwareBuffer.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)diz).addSuppressed(t);
                    }
                }
            }
        }
    }
    
    public final void c() {
        synchronized (this) {
            final long d = this.d;
            if (d != 0L) {
                GpuRetoucherNative.releaseRetoucher(d);
                this.d = 0L;
            }
            this.c.close();
        }
    }
    
    @Override
    public final void close() {
        this.a.execute(new dik(this));
    }
}
