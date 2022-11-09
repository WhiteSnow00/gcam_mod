import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcr implements gca
{
    @Override
    public final gcu a(final gcb gcb) {
        final ArrayList list = new ArrayList();
        gct.b("no-images", gcb.b.isEmpty(), list);
        return gct.a("cancelled", list);
    }
}
