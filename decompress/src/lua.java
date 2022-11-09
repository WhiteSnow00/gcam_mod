import java.util.Arrays;
import java.io.FileInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lua
{
    public final niz a;
    
    static {
        nte.g("Mp4BoxFileSlicer");
    }
    
    public lua(final niz a) {
        this.a = a;
    }
    
    public static lua a() {
        return new lua(nii.a);
    }
    
    public static lua c(final FileInputStream fileInputStream) {
        final long size = fileInputStream.getChannel().size();
        if (size < 0L) {
            return a();
        }
        return new lua(niz.i(new luc(fileInputStream, 0L, size)));
    }
    
    public static lua d(final luc luc) {
        return new lua(niz.i(luc));
    }
    
    public final lua b() {
        if (!this.a.g()) {
            return a();
        }
        final luc luc = (luc)this.a.c();
        final lub a = lud.a(luc);
        niz niz;
        if (a.a != luc.a()) {
            niz = nii.a;
        }
        else {
            int n;
            if (!a.b) {
                n = 8;
            }
            else {
                n = 16;
            }
            final luc b = luc.b();
            final long n2 = luc.d + n;
            if (!lud.c(n2, b)) {
                niz = nii.a;
            }
            else {
                b.e(n2);
                niz = niz.i(b.c());
            }
        }
        return new lua(niz);
    }
    
    public final lua e(final String s) {
        return this.b().f(s);
    }
    
    public final lua f(final String s) {
        if (!this.a.g()) {
            return a();
        }
        final luc b = ((luc)this.a.c()).b();
        final byte[] a = lue.a(s);
        Object o = null;
        while (true) {
            final luc b2 = lud.b(b);
            if (b2 != null) {
                if (!Arrays.equals(lud.d(b2), a)) {
                    continue;
                }
                if (o != null) {
                    return a();
                }
                o = b2;
            }
            else {
                if (o == null) {
                    return a();
                }
                return new lua(niz.i(o));
            }
        }
    }
    
    public final luc g() {
        return (luc)this.a.c();
    }
}
