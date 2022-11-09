import java.io.OutputStream;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ojg implements omj
{
    public int ay;
    
    public ojg() {
        this.ay = 0;
    }
    
    static final onj h() {
        return new onj();
    }
    
    public int c() {
        throw null;
    }
    
    @Override
    public final ojw d() {
        try {
            final int k = this.k();
            final ojw b = ojw.b;
            final byte[] array = new byte[k];
            final okg ai = okg.ai(array);
            this.aT(ai);
            return okn.g(ai, array);
        }
        catch (final IOException ex) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), ex);
        }
    }
    
    public void e(final int n) {
        throw null;
    }
    
    @Override
    public final void f(final OutputStream outputStream) {
        final okg aj = okg.aj(outputStream, okg.U(this.k()));
        this.aT(aj);
        aj.i();
    }
    
    @Override
    public final byte[] g() {
        try {
            final byte[] array = new byte[this.k()];
            final okg ai = okg.ai(array);
            this.aT(ai);
            ai.ak();
            return array;
        }
        catch (final IOException ex) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), ex);
        }
    }
}
