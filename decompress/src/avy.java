import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avy implements awa
{
    final /* synthetic */ InputStream a;
    final /* synthetic */ azi b;
    
    public avy(final InputStream a, final azi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final avt avt) {
        try {
            return avt.a(this.a, this.b);
        }
        finally {
            this.a.reset();
        }
    }
}
