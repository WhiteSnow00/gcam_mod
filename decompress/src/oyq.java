import android.opengl.GLES20;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyq implements Runnable
{
    private final /* synthetic */ int a;
    
    public oyq() {
    }
    
    public oyq(final int a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                GLES20.glFlush();
            }
            case 0: {}
        }
    }
    
    @Override
    public final String toString() {
        switch (this.a) {
            default: {
                return "glFlush";
            }
            case 0: {
                return "EmptyRunnable";
            }
        }
    }
}
