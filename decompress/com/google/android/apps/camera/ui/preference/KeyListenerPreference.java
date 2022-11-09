// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.preference;

import android.content.res.TypedArray;
import android.widget.Button;
import android.content.DialogInterface$OnKeyListener;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.app.AlertDialog;
import android.view.KeyEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.DialogPreference;

public class KeyListenerPreference extends DialogPreference
{
    public String a;
    public String b;
    
    public KeyListenerPreference(final Context context) {
        super(context);
        this.c();
    }
    
    public KeyListenerPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.c();
    }
    
    public KeyListenerPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c();
    }
    
    public KeyListenerPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.c();
    }
    
    public static String a(final KeyEvent keyEvent) {
        final int unicodeChar = keyEvent.getUnicodeChar();
        if (unicodeChar != 0 && unicodeChar != 10 && unicodeChar != 32) {
            final StringBuilder sb = new StringBuilder(1);
            sb.append((char)unicodeChar);
            return sb.toString();
        }
        String s = null;
        switch (keyEvent.getKeyCode()) {
            default: {
                s = "";
                break;
            }
            case 66: {
                s = "Enter";
                break;
            }
            case 62: {
                s = "Space";
                break;
            }
            case 59:
            case 60: {
                s = "Shift";
                break;
            }
            case 22: {
                s = "Right Arrow";
                break;
            }
            case 21: {
                s = "Left Arrow";
                break;
            }
            case 20: {
                s = "Down Arrow";
                break;
            }
            case 19: {
                s = "Up Arrow";
                break;
            }
        }
        return s;
    }
    
    private final void c() {
        this.b("-1");
    }
    
    public final void b(final String a) {
        this.a = a;
        if (a.equals("-1")) {
            this.b = "None";
        }
        else {
            this.b = a(new KeyEvent(0, Integer.parseInt(a)));
        }
        this.setSummary((CharSequence)this.b);
        this.persistString(a);
        this.notifyDependencyChange(this.shouldDisableDependents());
        this.notifyChanged();
    }
    
    protected final void onClick() {
        final String value = String.valueOf(this.getTitle());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 12);
        sb.append("Bind Key to ");
        sb.append(value);
        this.setDialogTitle((CharSequence)sb.toString());
        final String b = this.b;
        final String a = this.a;
        final StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 51 + String.valueOf(a).length());
        sb2.append("Current Key Bind: ");
        sb2.append(b);
        sb2.append(" (Key Code: ");
        sb2.append(a);
        sb2.append(")\nPress key to rebind");
        this.setDialogMessage((CharSequence)sb2.toString());
        this.setNegativeButtonText((CharSequence)"Reset");
        super.onClick();
        final AlertDialog alertDialog = (AlertDialog)this.getDialog();
        final ViewGroup viewGroup = (ViewGroup)alertDialog.findViewById(16908290);
        final TextView textView = (TextView)alertDialog.findViewById(16908299);
        final Button button = alertDialog.getButton(-1);
        final Button button2 = alertDialog.getButton(-2);
        viewGroup.setDescendantFocusability(393216);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        button.setEnabled(false);
        if (this.a.equals("-1")) {
            textView.setText((CharSequence)"Current Key Bind: None\nPress key to bind");
            button2.setVisibility(4);
        }
        alertDialog.getButton(-2).setOnClickListener((View$OnClickListener)new isj(this, textView, button2, button));
        alertDialog.setOnKeyListener((DialogInterface$OnKeyListener)new isk(this, textView, button, button2));
    }
    
    protected final void onDialogClosed(final boolean b) {
        super.onDialogClosed(b);
        if (b) {
            final String a = this.a;
            if (this.callChangeListener((Object)a)) {
                this.b(a);
            }
            this.setSummary((CharSequence)this.b);
        }
    }
    
    protected final Object onGetDefaultValue(final TypedArray typedArray, final int n) {
        String string;
        if ((string = typedArray.getString(n)) == null) {
            string = "-1";
        }
        return string;
    }
    
    protected final void onSetInitialValue(final boolean b, final Object o) {
        String persistedString;
        if (b) {
            persistedString = this.getPersistedString("-1");
        }
        else {
            persistedString = (String)o;
        }
        this.b(persistedString);
    }
}
