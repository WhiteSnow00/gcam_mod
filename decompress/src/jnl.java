import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class jnl
{
    public int a;
    public final ByteArrayOutputStream b;
    final /* synthetic */ jnm c;
    
    public jnl(final jnm c) {
        this.c = c;
        this.b = new ByteArrayOutputStream();
    }
    
    public final byte[] a() {
        return this.b.toByteArray();
    }
}
