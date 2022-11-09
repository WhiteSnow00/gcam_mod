import android.support.wearable.complications.ComplicationData;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uh
{
    public final int a;
    public final Bundle b;
    
    public uh(final int a) {
        this.a = a;
        final Bundle b = new Bundle();
        this.b = b;
        if (a != 7 && a != 4) {
            return;
        }
        ComplicationData.j("IMAGE_STYLE", a);
        b.putInt("IMAGE_STYLE", 1);
    }
    
    public final ComplicationData a() {
        for (final String s : ComplicationData.a[this.a]) {
            if (!this.b.containsKey(s)) {
                final int a = this.a;
                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 39);
                sb.append("Field ");
                sb.append(s);
                sb.append(" is required for type ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
            if (this.b.containsKey("ICON_BURN_IN_PROTECTION") && !this.b.containsKey("ICON")) {
                throw new IllegalStateException("Field ICON must be provided when field ICON_BURN_IN_PROTECTION is provided.");
            }
            if (this.b.containsKey("SMALL_IMAGE_BURN_IN_PROTECTION") && !this.b.containsKey("SMALL_IMAGE")) {
                throw new IllegalStateException("Field SMALL_IMAGE must be provided when field SMALL_IMAGE_BURN_IN_PROTECTION is provided.");
            }
        }
        return new ComplicationData(this);
    }
}
