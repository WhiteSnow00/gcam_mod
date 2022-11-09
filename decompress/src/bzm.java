import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzm
{
    private niz a;
    
    public bzm() {
        this.a = nii.a;
    }
    
    public final niz a() {
        if (!this.a.g()) {
            return nii.a;
        }
        return niz.h(((Map)this.a.c()).get(1L));
    }
    
    public final niz b() {
        if (!this.a.g()) {
            return nii.a;
        }
        return niz.h(((Map)this.a.c()).get(0L));
    }
    
    public final void c(final Map map) {
        this.a = niz.h(map);
    }
}
