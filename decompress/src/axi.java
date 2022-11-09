import android.database.Cursor;
import java.io.FileNotFoundException;
import java.io.File;
import android.text.TextUtils;
import java.io.IOException;
import android.content.Context;
import java.io.InputStream;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axi implements awp
{
    private final Uri a;
    private final axk b;
    private InputStream c;
    
    public axi(final Uri a, final axk b) {
        this.a = a;
        this.b = b;
    }
    
    public static axi b(final Context context, final Uri uri, final axj axj) {
        return new axi(uri, new axk(auf.b(context).c.b(), axj, auf.b(context).d, context.getContentResolver()));
    }
    
    @Override
    public final Class a() {
        return InputStream.class;
    }
    
    @Override
    public final void aI() {
    }
    
    @Override
    public final void d() {
        final InputStream c = this.c;
        if (c != null) {
            try {
                c.close();
            }
            catch (final IOException ex) {}
        }
    }
    
    @Override
    public final void f(auo auo, final awo awo) {
        try {
            axk b;
            Uri a;
            InputStream inputStream;
            InputStream inputStream2;
            while (true) {
                b = this.b;
                a = this.a;
                inputStream = null;
                inputStream2 = null;
                final auo auo2 = null;
                while (true) {
                    Label_0112: {
                        try {
                            auo = (auo)b.a.a(a);
                            if (auo != null) {
                                try {
                                    if (((Cursor)auo).moveToFirst()) {
                                        ((Cursor)auo).getString(0);
                                        ((Cursor)auo).close();
                                        break;
                                    }
                                }
                                catch (final SecurityException ex) {
                                    break Label_0112;
                                }
                                finally {
                                    goto Label_0096;
                                }
                            }
                            if (auo != null) {
                                ((Cursor)auo).close();
                            }
                            break;
                        }
                        catch (final SecurityException ex2) {
                            auo = null;
                        }
                        finally {
                            auo = auo2;
                        }
                    }
                    if (auo != null) {
                        continue;
                    }
                    break;
                }
                auo = null;
                break;
            }
            Label_0294: {
                if (TextUtils.isEmpty((CharSequence)auo)) {
                    auo = null;
                }
                else {
                    final File file = new File((String)auo);
                    if (file.exists() && file.length() > 0L) {
                        final Uri fromFile = Uri.fromFile(file);
                        try {
                            auo = (auo)b.c.openInputStream(fromFile);
                            break Label_0294;
                        }
                        catch (final NullPointerException ex3) {
                            final String value = String.valueOf(a);
                            final String value2 = String.valueOf(fromFile);
                            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 21 + String.valueOf(value2).length());
                            sb.append("NPE opening uri: ");
                            sb.append(value);
                            sb.append(" -> ");
                            sb.append(value2);
                            throw (FileNotFoundException)new FileNotFoundException(sb.toString()).initCause(ex3);
                        }
                    }
                    auo = null;
                }
            }
            int x = 0;
            Label_0447: {
                if (auo != null) {
                    final axk b2 = this.b;
                    final Uri a2 = this.a;
                    InputStream inputStream3 = null;
                    Label_0420: {
                        try {
                            final InputStream openInputStream = b2.c.openInputStream(a2);
                            try {
                                final int n = x = afo.x(b2.d, openInputStream, b2.b);
                                if (openInputStream != null) {
                                    try {
                                        openInputStream.close();
                                        x = n;
                                    }
                                    catch (final IOException ex4) {
                                        x = n;
                                    }
                                }
                                break Label_0447;
                            }
                            catch (final NullPointerException inputStream) {}
                            catch (final IOException inputStream) {}
                        }
                        catch (final NullPointerException ex5) {
                            break Label_0420;
                        }
                        catch (final IOException ex6) {
                            inputStream3 = inputStream2;
                        }
                        finally {
                            inputStream3 = inputStream;
                        }
                        try {
                            inputStream3.close();
                            goto Label_0403;
                        }
                        catch (final IOException ex7) {}
                    }
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                            x = -1;
                            break Label_0447;
                        }
                        catch (final IOException ex8) {}
                    }
                    x = -1;
                }
                else {
                    x = -1;
                }
            }
            Object c = auo;
            if (x != -1) {
                c = new awv((InputStream)auo, x);
            }
            awo.b(this.c = (InputStream)c);
        }
        catch (final FileNotFoundException ex9) {
            awo.e(ex9);
        }
    }
    
    @Override
    public final int g() {
        return 1;
    }
}
