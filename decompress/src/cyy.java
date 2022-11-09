import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public enum cyy
{
    a;
    
    private final File c;
    
    private cyy() {
        this.c = new File("/sys/fs/selinux/enforce");
    }
    
    static cyx a() {
        final cyx cyx = new cyx();
        final cyy a = cyy.a;
        cyx.a = a.b();
        final boolean b = a.b();
        boolean b2 = true;
        Label_0204: {
            if (!b) {
                b2 = false;
            }
            else {
                InputStreamReader inputStreamReader = null;
                final InputStreamReader inputStreamReader2 = null;
                InputStreamReader inputStreamReader3 = null;
                InputStreamReader inputStreamReader5;
                try {
                    final InputStreamReader inputStreamReader4 = new InputStreamReader(new FileInputStream(a.c));
                    try {
                        if ((char)inputStreamReader4.read() == '1') {
                            try {
                                inputStreamReader4.close();
                            }
                            catch (final IOException inputStreamReader4) {}
                            break Label_0204;
                        }
                        try {
                            inputStreamReader4.close();
                        }
                        catch (final IOException inputStreamReader4) {}
                    }
                    catch (final IOException inputStreamReader3) {}
                    catch (final FileNotFoundException inputStreamReader3) {}
                    finally {
                        inputStreamReader = (inputStreamReader3 = inputStreamReader4);
                    }
                }
                catch (final IOException ex) {
                    inputStreamReader5 = inputStreamReader;
                    if (inputStreamReader5 != null) {
                        inputStreamReader5.close();
                        b2 = false;
                        break Label_0204;
                    }
                    b2 = false;
                    break Label_0204;
                }
                catch (final FileNotFoundException ex2) {
                    inputStreamReader5 = inputStreamReader2;
                }
                try {
                    inputStreamReader3.close();
                    goto Label_0156;
                }
                catch (final IOException ex3) {}
                if (inputStreamReader5 != null) {
                    inputStreamReader5.close();
                }
            }
        }
        cyx.b = b2;
        return cyx;
    }
    
    final boolean b() {
        return this.c.exists();
    }
}
