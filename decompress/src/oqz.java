import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqz
{
    public final int a;
    public final oqy b;
    public final InputStream c;
    
    public oqz(final int a, final oqy b, final InputStream c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String a() {
        final String a = this.b.a("X-GUploader-UploadID");
        final int a2 = this.a;
        final String value = String.valueOf(this.b);
        String concat;
        if (a == null) {
            concat = "\n No upload id.";
        }
        else if (a.length() != 0) {
            concat = "\n Upload id: ".concat(a);
        }
        else {
            concat = new String("\n Upload id: ");
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30 + String.valueOf(concat).length());
        sb.append("HttpResponse:\n   ");
        sb.append(a2);
        sb.append("  ");
        sb.append(value);
        sb.append(concat);
        return sb.toString();
    }
}
