import j$.util.stream.Collectors;
import j$.util.function.Function;
import j$.util.Comparator$_CC;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cga implements oun
{
    private final pii a;
    
    public cga(final pii a) {
        this.a = a;
    }
    
    public final List a() {
        final List list = (List)Collection$_EL.stream((Collection)((ouo)this.a).a).sorted(Comparator$_CC.comparing((Function)cdd.d)).collect(Collectors.toList());
        pqf.k(list);
        return list;
    }
}
