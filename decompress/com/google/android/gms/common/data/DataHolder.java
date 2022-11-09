// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.data;

import android.os.Parcelable;
import android.os.Parcel;
import android.util.Log;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import java.io.Closeable;

public final class DataHolder extends jwc implements Closeable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    boolean i;
    private boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(20);
        new jvh(new String[0]);
    }
    
    public DataHolder(final int a, final String[] b, final CursorWindow[] d, final int e, final Bundle f) {
        this.i = false;
        this.j = true;
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final int a(int n) {
        int n2 = 0;
        jvu.f(n >= 0 && n < this.h);
        int length;
        while (true) {
            final int[] g = this.g;
            length = g.length;
            if (n2 >= length) {
                break;
            }
            if (n < g[n2]) {
                --n2;
                break;
            }
            ++n2;
        }
        if ((n = n2) == length) {
            n = n2 - 1;
        }
        return n;
    }
    
    public final String b(final String s, final int n, final int n2) {
        this.c(s, n);
        return this.d[n2].getString(n, this.c.getInt(s));
    }
    
    public final void c(String concat, final int n) {
        final Bundle c = this.c;
        if (c == null || !c.containsKey(concat)) {
            if (concat.length() != 0) {
                concat = "No such column: ".concat(concat);
            }
            else {
                concat = new String("No such column: ");
            }
            throw new IllegalArgumentException(concat);
        }
        if (this.d()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (n >= 0 && n < this.h) {
            return;
        }
        throw new CursorIndexOutOfBoundsException(n, this.h);
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            if (!this.i) {
                this.i = true;
                int n = 0;
                while (true) {
                    final CursorWindow[] d = this.d;
                    if (n >= d.length) {
                        break;
                    }
                    d[n].close();
                    ++n;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            return this.i;
        }
    }
    
    @Override
    protected final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !this.d()) {
                this.close();
                final String string = this.toString();
                final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.w(parcel, 1, this.b);
        jwn.y(parcel, 2, (Parcelable[])this.d, n);
        jwn.n(parcel, 3, this.e);
        jwn.p(parcel, 4, this.f);
        jwn.n(parcel, 1000, this.a);
        jwn.i(parcel, g);
        if ((n & 0x1) != 0x0) {
            this.close();
        }
    }
}
