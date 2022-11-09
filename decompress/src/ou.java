import android.graphics.drawable.Drawable;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.Spannable;
import android.text.Selection;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.DragEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ou extends EditText
{
    private final oo a;
    private final ps b;
    
    public ou(final Context context, final AttributeSet set) {
        tl.a(context);
        super(context, set, 2130969045);
        tj.d((View)this, this.getContext());
        (this.a = new oo((View)this)).d(set, 2130969045);
        final ps b = new ps((TextView)this);
        (this.b = b).b(set, 2130969045);
        b.a();
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final oo a = this.a;
        if (a != null) {
            a.c();
        }
        final ps b = this.b;
        if (b != null) {
            b.a();
        }
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        jp.f(onCreateInputConnection, editorInfo, (View)this);
        final String[] y = ik.Y((View)this);
        if (onCreateInputConnection == null || y == null) {
            return onCreateInputConnection;
        }
        editorInfo.contentMimeTypes = y;
        final pc pc = new pc((View)this);
        if (editorInfo != null) {
            return (InputConnection)new abi(onCreateInputConnection, pc);
        }
        throw new IllegalArgumentException("editorInfo must be non-null");
    }
    
    public final boolean onDragEvent(final DragEvent dragEvent) {
        if (dragEvent.getLocalState() == null) {
            if (ik.Y((View)this) != null) {
                Context context = ((View)this).getContext();
                while (true) {
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            final Activity activity = (Activity)context;
                            if (activity == null) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Can't handle drop: no activity: view=");
                                sb.append(this);
                                sb.toString();
                                return super.onDragEvent(dragEvent);
                            }
                            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                                activity.requestDragAndDropPermissions(dragEvent);
                                final int offsetForPosition = ((TextView)this).getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                                ((TextView)this).beginBatchEdit();
                                try {
                                    Selection.setSelection((Spannable)this.getText(), offsetForPosition);
                                    ik.o((View)this, new hv(dragEvent.getClipData(), 3).a());
                                    return true;
                                }
                                finally {
                                    ((TextView)this).endBatchEdit();
                                }
                                return super.onDragEvent(dragEvent);
                            }
                            return super.onDragEvent(dragEvent);
                        }
                        else {
                            context = ((ContextWrapper)context).getBaseContext();
                        }
                    }
                    final Activity activity = null;
                    continue;
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }
    
    public final boolean onTextContextMenuItem(int c) {
        final int n = 16908337;
        int n3;
        if (c != 16908322) {
            final int n2;
            if ((n2 = c) != 16908337) {
                return super.onTextContextMenuItem(n2);
            }
            c = 16908337;
            n3 = n;
        }
        else {
            n3 = c;
        }
        if (ik.Y((View)this) != null) {
            final ClipboardManager clipboardManager = (ClipboardManager)((TextView)this).getContext().getSystemService("clipboard");
            ClipData primaryClip;
            if (clipboardManager == null) {
                primaryClip = null;
            }
            else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                final hv hv = new hv(primaryClip, 1);
                if (n3 == 16908322) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                hv.c = c;
                ik.o((View)this, hv.a());
            }
            return true;
        }
        int n2 = c;
        return super.onTextContextMenuItem(n2);
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final oo a = this.a;
        if (a != null) {
            a.i();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final oo a = this.a;
        if (a != null) {
            a.e(backgroundResource);
        }
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final ps b = this.b;
        if (b != null) {
            b.c(context, n);
        }
    }
}
