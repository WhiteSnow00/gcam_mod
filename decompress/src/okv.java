import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okv extends okt implements omk
{
    public okv() {
        final jkr c = jkr.c;
        throw null;
    }
    
    public okv(final okw okw) {
        super(okw);
    }
    
    public final okw ao() {
        if (this.c) {
            return (okw)this.b;
        }
        ((okw)this.b).f.e();
        return (okw)super.i();
    }
    
    public final void ap(final okk okk, Object value) {
        final Map az = oky.az;
        if (okk.a == super.a) {
            if (super.c) {
                this.m();
                super.c = false;
            }
            okp f = ((okw)this.b).f;
            if (f.c) {
                f = f.c();
                ((okw)this.b).f = f;
            }
            final okx d = okk.d;
            if (d.a() == onw.h) {
                value = ((olb)value).a();
            }
            f.l(d, value);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
    
    @Override
    public final void m() {
        super.m();
        final okw okw = (okw)this.b;
        okw.f = okw.f.c();
    }
}
