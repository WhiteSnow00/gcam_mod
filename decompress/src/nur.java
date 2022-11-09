import dalvik.system.VMStack;

// 
// Decompiled by Procyon v0.6.0
// 

class nur extends nui
{
    public nur() {
    }
    
    @Override
    public nsm a(final Class clazz, final int n) {
        return nsm.a;
    }
    
    @Override
    public String b(final Class clazz) {
        if (nut.a) {
            try {
                if (clazz.equals(nut.o())) {
                    return VMStack.getStackClass2().getName();
                }
            }
            finally {}
        }
        if (nut.b) {
            final StackTraceElement a = nvw.a(clazz);
            if (a != null) {
                return a.getClassName();
            }
        }
        return null;
    }
}
