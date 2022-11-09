import java.util.NavigableMap;
import android.util.Log;
import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public final class azs implements azk
{
    private static final Bitmap$Config a;
    private final azt b;
    private final Set c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;
    
    static {
        a = Bitmap$Config.ARGB_8888;
    }
    
    public azs(final long d) {
        final azy b = new azy();
        final HashSet set = new HashSet((Collection<? extends E>)Arrays.asList(Bitmap$Config.values()));
        set.add(null);
        set.remove(Bitmap$Config.HARDWARE);
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)set);
        this.d = d;
        this.b = b;
        this.c = unmodifiableSet;
    }
    
    private static Bitmap f(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        Bitmap$Config a = bitmap$Config;
        if (bitmap$Config == null) {
            a = azs.a;
        }
        return Bitmap.createBitmap(n, n2, a);
    }
    
    private final Bitmap g(int length, final int n, final Bitmap$Config bitmap$Config) {
        monitorenter(this);
        try {
            if (bitmap$Config != Bitmap$Config.HARDWARE) {
                final azt b = this.b;
                Bitmap$Config a;
                if ((a = bitmap$Config) == null) {
                    a = azs.a;
                }
                final int b2 = biv.b(length, n, a);
                final azw d = ((azy)b).f.d(b2, a);
                final boolean equals = Bitmap$Config.RGBA_F16.equals((Object)a);
                int i = 0;
                Bitmap$Config[] array = null;
                if (equals) {
                    array = azy.b;
                }
                else {
                    switch (azv.a[a.ordinal()]) {
                        default: {
                            array = new Bitmap$Config[] { a };
                            break;
                        }
                        case 4: {
                            array = azy.e;
                            break;
                        }
                        case 3: {
                            array = azy.d;
                            break;
                        }
                        case 2: {
                            array = azy.c;
                            break;
                        }
                        case 1: {
                            array = azy.a;
                            break;
                        }
                    }
                }
            Label_0303:
                while (true) {
                    while (i < array.length) {
                        final Bitmap$Config bitmap$Config2 = array[i];
                        final Integer n2 = ((azy)b).b(bitmap$Config2).ceilingKey(b2);
                        if (n2 != null && n2 <= b2 * 8) {
                            if (n2 == b2) {
                                if (bitmap$Config2 == null) {
                                    if (a == null) {
                                        final azw d2 = d;
                                        break Label_0303;
                                    }
                                }
                                else if (bitmap$Config2.equals((Object)a)) {
                                    break;
                                }
                            }
                            ((azy)b).f.c(d);
                            final azw d2 = ((azy)b).f.d(n2, bitmap$Config2);
                            final Bitmap bitmap = (Bitmap)((azy)b).g.a(d2);
                            if (bitmap != null) {
                                ((azy)b).c(d2.a, bitmap);
                                bitmap.reconfigure(length, n, a);
                            }
                            if (bitmap == null) {
                                ++this.g;
                            }
                            else {
                                ++this.f;
                                this.e -= biv.a(bitmap);
                                bitmap.setHasAlpha(true);
                                bitmap.setPremultiplied(true);
                            }
                            monitorexit(this);
                            return bitmap;
                        }
                        ++i;
                    }
                    final azw d2 = d;
                    continue Label_0303;
                }
            }
            final String value = String.valueOf(bitmap$Config);
            length = String.valueOf(value).length();
            final StringBuilder sb = new StringBuilder(length + 176);
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(value);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void h(final long n) {
        monitorenter(this);
        try {
            while (this.e > n) {
                final azt b = this.b;
                final Bitmap bitmap = (Bitmap)((azy)b).g.b();
                if (bitmap != null) {
                    ((azy)b).c(biv.a(bitmap), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        String.valueOf(String.valueOf(this.b)).length();
                    }
                    this.e = 0L;
                    monitorexit(this);
                    return;
                }
                this.e -= biv.a(bitmap);
                ++this.i;
                bitmap.recycle();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final Bitmap a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final Bitmap g = this.g(n, n2, bitmap$Config);
        Bitmap f;
        if (g != null) {
            g.eraseColor(0);
            f = g;
        }
        else {
            f = f(n, n2, bitmap$Config);
        }
        return f;
    }
    
    @Override
    public final Bitmap b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        final Bitmap g = this.g(n, n2, bitmap$Config);
        if (g == null) {
            return f(n, n2, bitmap$Config);
        }
        return g;
    }
    
    @Override
    public final void c() {
        this.h(0L);
    }
    
    @Override
    public final void d(final Bitmap bitmap) {
        monitorenter(this);
        if (bitmap != null) {
            Label_0242: {
                try {
                    if (bitmap.isRecycled()) {
                        throw new IllegalStateException("Cannot pool recycled bitmap");
                    }
                    if (bitmap.isMutable() && biv.a(bitmap) <= this.d && this.c.contains(bitmap.getConfig())) {
                        final int a = biv.a(bitmap);
                        final azt b = this.b;
                        final azw d = ((azy)b).f.d(biv.a(bitmap), bitmap.getConfig());
                        ((azy)b).g.c(d, bitmap);
                        final NavigableMap b2 = ((azy)b).b(bitmap.getConfig());
                        final Integer n = (Integer)b2.get(d.a);
                        final int a2 = d.a;
                        int n2;
                        if (n == null) {
                            n2 = 1;
                        }
                        else {
                            n2 = n + 1;
                        }
                        b2.put(a2, n2);
                        ++this.h;
                        this.e += a;
                        this.h(this.d);
                        monitorexit(this);
                        return;
                    }
                    bitmap.recycle();
                    monitorexit(this);
                    return;
                }
                finally {
                    break Label_0242;
                }
                throw new NullPointerException("Bitmap must not be null");
            }
            monitorexit(this);
        }
        throw new NullPointerException("Bitmap must not be null");
    }
    
    @Override
    public final void e(final int n) {
        if (n < 40 && n < 20) {
            if (n == 15) {
                this.h(this.d >> 1);
            }
            return;
        }
        this.c();
    }
}
