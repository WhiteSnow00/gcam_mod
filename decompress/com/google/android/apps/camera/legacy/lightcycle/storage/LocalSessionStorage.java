// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.lightcycle.storage;

import java.io.Serializable;

public class LocalSessionStorage implements Serializable
{
    public String a;
    public hgx b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String c = this.c;
        final String f = this.f;
        final String d = this.d;
        final String e = this.e;
        final String g = this.g;
        final String h = this.h;
        final String i = this.i;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 129 + String.valueOf(c).length() + String.valueOf(f).length() + String.valueOf(d).length() + String.valueOf(e).length() + String.valueOf(g).length() + String.valueOf(h).length() + String.valueOf(i).length());
        sb.append("Session ID : ");
        sb.append(a);
        sb.append("\n BaseDir : ");
        sb.append(c);
        sb.append("\n sessionRelativeDir : ");
        sb.append(f);
        sb.append("\n SessionBaseDir : ");
        sb.append(d);
        sb.append("\n SessionDir : ");
        sb.append(e);
        sb.append("\n thumbnail : ");
        sb.append(g);
        sb.append("\n metadata : ");
        sb.append(h);
        sb.append("\n orientationFile : ");
        sb.append(i);
        return sb.toString();
    }
}
