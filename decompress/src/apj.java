import java.io.ByteArrayInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apj
{
    public byte[] a;
    public int b;
    private String c;
    
    public apj(final int n) {
        this.c = null;
        this.a = new byte[n];
        this.b = 0;
    }
    
    public apj(final InputStream inputStream) {
        this.c = null;
        this.b = 0;
        this.a = new byte[16384];
        while (true) {
            final int read = inputStream.read(this.a, this.b, 16384);
            if (read <= 0) {
                break;
            }
            final int b = this.b + read;
            this.b = b;
            if (read != 16384) {
                break;
            }
            this.d(b + 16384);
        }
    }
    
    public apj(final byte[] a) {
        this.c = null;
        this.a = a;
        this.b = a.length;
    }
    
    public final InputStream a() {
        return new ByteArrayInputStream(this.a, 0, this.b);
    }
    
    public final String b() {
        if (this.c == null) {
            final int b = this.b;
            String c = "UTF-8";
            if (b < 2) {
                this.c = "UTF-8";
            }
            else {
                final byte[] a = this.a;
                final byte b2 = a[0];
                if (b2 == 0) {
                    if (b >= 4 && a[1] == 0) {
                        if ((a[2] & 0xFF) == 0xFE && (a[3] & 0xFF) == 0xFF) {
                            this.c = "UTF-32BE";
                        }
                        else {
                            this.c = "UTF-32";
                        }
                    }
                    else {
                        this.c = "UTF-16BE";
                    }
                }
                else {
                    final int n = b2 & 0xFF;
                    if (n < 128) {
                        if (a[1] != 0) {
                            this.c = "UTF-8";
                        }
                        else {
                            String c2;
                            if (b >= 4 && a[2] == 0) {
                                c2 = "UTF-32LE";
                            }
                            else {
                                c2 = "UTF-16LE";
                            }
                            this.c = c2;
                        }
                    }
                    else {
                        if (n != 239) {
                            c = "UTF-16";
                            if (n != 254) {
                                if (b >= 4 && a[2] == 0) {
                                    this.c = "UTF-32";
                                    return this.c;
                                }
                                this.c = "UTF-16";
                                return this.c;
                            }
                        }
                        this.c = c;
                    }
                }
            }
        }
        return this.c;
    }
    
    public final void c(final byte[] array) {
        this.e(array, array.length);
    }
    
    public final void d(final int n) {
        final byte[] a = this.a;
        final int length = a.length;
        if (n > length) {
            System.arraycopy(a, 0, this.a = new byte[length + length], 0, length);
        }
    }
    
    public final void e(final byte[] array, final int n) {
        this.d(this.b + n);
        System.arraycopy(array, 0, this.a, this.b, n);
        this.b += n;
    }
}
