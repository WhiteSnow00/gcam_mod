import java.util.Arrays;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class new implements ney
{
    private final float a;
    
    public new(final float a) {
        this.a = a;
    }
    
    @Override
    public final float a(final RectF rectF) {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof new && this.a == ((new)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
}
