import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class deu
{
    public final DynamicDepthResult a;
    public final hbj b;
    
    public deu(final DynamicDepthResult a, final hbj b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        this.a.close();
        try (final hbj b = this.b) {}
    }
}
