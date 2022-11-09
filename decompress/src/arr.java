import android.hardware.Camera$PictureCallback;
import android.hardware.Camera$AutoFocusCallback;
import android.os.Handler;
import android.hardware.Camera$Parameters;
import android.hardware.Camera;

// 
// Decompiled by Procyon v0.6.0
// 

final class arr extends asx
{
    final /* synthetic */ asa a;
    private final atd b;
    private final int c;
    private final Camera d;
    private final asb e;
    
    public arr(final asa a, final atd b, final int c, final Camera d, final asb e) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    @Override
    public final int a() {
        return this.c;
    }
    
    @Deprecated
    @Override
    public final Camera$Parameters b() {
        final atc atc = new atc();
        final Camera$Parameters[] array = { null };
        try {
            this.a.f.b(new arj(this, array, atc), atc.b, "get parameters");
        }
        catch (final RuntimeException ex) {
            ((asa)this.b).g.c(ex);
        }
        return array[0];
    }
    
    @Override
    public final Handler c() {
        return this.a.d;
    }
    
    @Override
    public final atd d() {
        return this.b;
    }
    
    @Override
    public final atl e() {
        return new asb(this.e);
    }
    
    @Override
    public final atu f() {
        return new asc(this.e, this.b());
    }
    
    @Override
    public final atv g() {
        return this.a.e;
    }
    
    @Override
    public final atx h() {
        return this.a.f;
    }
    
    @Override
    public final void j(final Handler handler, final asg asg) {
        this.a.f.a(new arn(this, (Camera$AutoFocusCallback)new arm(this, handler, asg)));
    }
    
    @Override
    public final void m(final Handler handler, final esl esl) {
        this.a.f.a(new ark(this, handler, esl, 1));
    }
    
    @Override
    public final void n(final Handler handler, final esl esl) {
        this.a.f.a(new ark(this, handler, esl));
    }
    
    @Override
    public final void o(final atu atu) {
        this.s(atu, 6);
    }
    
    @Override
    public final void q(final Handler handler, final esn esn, final aso aso, final aso aso2) {
        final arp arp = new arp(this, handler, aso2);
        try {
            this.a.f.a(new arq(this, handler, esn, aso, (Camera$PictureCallback)arp));
        }
        catch (final RuntimeException ex) {
            ((asa)this.b).g.c(ex);
        }
    }
}
