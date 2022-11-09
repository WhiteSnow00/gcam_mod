// 
// Decompiled by Procyon v0.6.0
// 

public final class mat extends Exception
{
    public mat(String s) {
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "Failed to compile shader:\n".concat(s);
        }
        else {
            s = new String("Failed to compile shader:\n");
        }
        super(s);
    }
}
