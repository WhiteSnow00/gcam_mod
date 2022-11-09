// 
// Decompiled by Procyon v0.6.0
// 

public final class mas extends Exception
{
    public mas(String s) {
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "Failed to link shader program:\n".concat(s);
        }
        else {
            s = new String("Failed to link shader program:\n");
        }
        super(s);
    }
}
