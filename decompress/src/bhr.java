// 
// Decompiled by Procyon v0.6.0
// 

public final class bhr implements bhl, bhj
{
    public volatile bhj a;
    public volatile bhj b;
    private final bhl c;
    private final Object d;
    private bhk e;
    private bhk f;
    private boolean g;
    
    public bhr(final Object d, final bhl c) {
        this.e = bhk.c;
        this.f = bhk.c;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final bhl a() {
        synchronized (this.d) {
            final bhl c = this.c;
            bhl a;
            if (c != null) {
                a = c.a();
            }
            else {
                a = this;
            }
            return a;
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != bhk.d && this.f != bhk.a) {
                    this.f = bhk.a;
                    this.b.b();
                }
                if (this.g && this.e != bhk.a) {
                    this.e = bhk.a;
                    this.a.b();
                }
            }
            finally {
                this.g = false;
            }
        }
    }
    
    @Override
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = bhk.c;
            this.f = bhk.c;
            this.b.c();
            this.a.c();
        }
    }
    
    @Override
    public final void d(final bhj bhj) {
        synchronized (this.d) {
            if (!bhj.equals(this.a)) {
                this.f = bhk.e;
                return;
            }
            this.e = bhk.e;
            final bhl c = this.c;
            if (c != null) {
                c.d(this);
            }
        }
    }
    
    @Override
    public final void e(final bhj bhj) {
        synchronized (this.d) {
            if (bhj.equals(this.b)) {
                this.f = bhk.d;
                return;
            }
            this.e = bhk.d;
            final bhl c = this.c;
            if (c != null) {
                c.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }
    
    @Override
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = bhk.b;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = bhk.b;
                this.a.f();
            }
        }
    }
    
    @Override
    public final boolean g(final bhj bhj) {
        final Object d = this.d;
        monitorenter(d);
        try {
            final bhl c = this.c;
            boolean b = false;
            if ((c == null || c.g(this)) && (bhj.equals(this.a) && this.e != bhk.b)) {
                b = true;
            }
            monitorexit(d);
            return b;
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    @Override
    public final boolean h(final bhj bhj) {
        final Object d = this.d;
        monitorenter(d);
        try {
            final bhl c = this.c;
            boolean b = false;
            if ((c == null || c.h(this)) && (bhj.equals(this.a) && !this.j())) {
                b = true;
            }
            monitorexit(d);
            return b;
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    @Override
    public final boolean i(final bhj bhj) {
        final Object d = this.d;
        monitorenter(d);
        try {
            final bhl c = this.c;
            final boolean b = true;
            boolean b2 = false;
            Label_0067: {
                if (c == null || c.i(this)) {
                    b2 = b;
                    if (bhj.equals(this.a)) {
                        break Label_0067;
                    }
                    if (this.e != bhk.d) {
                        b2 = b;
                        break Label_0067;
                    }
                }
                b2 = false;
            }
            monitorexit(d);
            return b2;
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    @Override
    public final boolean j() {
        synchronized (this.d) {
            final boolean j = this.b.j();
            boolean b = true;
            if (!j) {
                b = (this.a.j() && b);
            }
            return b;
        }
    }
    
    @Override
    public final boolean k() {
        synchronized (this.d) {
            return this.e == bhk.c;
        }
    }
    
    @Override
    public final boolean l() {
        synchronized (this.d) {
            return this.e == bhk.d;
        }
    }
    
    @Override
    public final boolean m(final bhj bhj) {
        if (bhj instanceof bhr) {
            final bhr bhr = (bhr)bhj;
            if (this.a == null) {
                if (bhr.a != null) {
                    return false;
                }
            }
            else if (!this.a.m(bhr.a)) {
                return false;
            }
            if (this.b == null) {
                if (bhr.b != null) {
                    return false;
                }
            }
            else if (!this.b.m(bhr.b)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean n() {
        synchronized (this.d) {
            return this.e == bhk.a;
        }
    }
}
