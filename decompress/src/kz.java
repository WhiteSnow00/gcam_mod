import java.lang.reflect.InvocationTargetException;
import android.content.ContextWrapper;
import android.content.Context;
import java.lang.reflect.Method;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class kz implements View$OnClickListener
{
    private final View a;
    private final String b;
    private Method c;
    private Context d;
    
    public kz(final View a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onClick(final View view) {
        Label_0219: {
            if (this.c == null) {
                Object d = this.a.getContext();
                while (d != null) {
                    try {
                        if (!((Context)d).isRestricted()) {
                            final Method method = ((Context)d).getClass().getMethod(this.b, View.class);
                            if (method != null) {
                                this.c = method;
                                this.d = (Context)d;
                                break Label_0219;
                            }
                        }
                    }
                    catch (final NoSuchMethodException ex) {}
                    if (d instanceof ContextWrapper) {
                        d = ((ContextWrapper)d).getBaseContext();
                    }
                    else {
                        d = null;
                    }
                }
                final int id = this.a.getId();
                String string;
                if (id == -1) {
                    string = "";
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(" with id '");
                    sb.append(this.a.getContext().getResources().getResourceEntryName(id));
                    sb.append("'");
                    string = sb.toString();
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not find method ");
                sb2.append(this.b);
                sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sb2.append(this.a.getClass());
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            try {
                this.c.invoke(this.d, view);
            }
            catch (final InvocationTargetException ex2) {
                throw new IllegalStateException("Could not execute method for android:onClick", ex2);
            }
            catch (final IllegalAccessException ex3) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", ex3);
            }
        }
    }
}
