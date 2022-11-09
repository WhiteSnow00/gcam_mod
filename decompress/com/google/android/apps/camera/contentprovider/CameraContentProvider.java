// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.contentprovider;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import android.content.ContentProvider$PipeDataWriter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.content.ContentUris;
import android.os.ParcelFileDescriptor;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.os.Trace;
import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Bundle;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.ContentProvider;

public class CameraContentProvider extends ContentProvider
{
    private czd a;
    private ProviderInfo b;
    private volatile czc c;
    
    private final czc b() {
        final czc c;
        if ((c = this.c) == null) {
            synchronized (this) {
                if (this.c == null) {
                    final ProviderInfo b = this.b;
                    b.getClass();
                    final cze cze = new cze(this, b);
                    final HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent)this.getContext();
                    hasCameraContentProviderComponent.getClass();
                    final cyz cameraContentProviderComponent = hasCameraContentProviderComponent.cameraContentProviderComponent(cze);
                    cameraContentProviderComponent.b().a();
                    this.c = cameraContentProviderComponent.a();
                }
            }
        }
        return c;
    }
    
    protected final void a() {
        final czd a = this.a;
        if (a != null) {
            final String callingPackage = this.getCallingPackage();
            callingPackage.getClass();
            if (a.a(callingPackage)) {
                return;
            }
        }
        throw new SecurityException();
    }
    
    public final void attachInfo(final Context context, final ProviderInfo b) {
        super.attachInfo(context, this.b = b);
    }
    
    public final Bundle call(final String s, final String s2, final Bundle bundle) {
        this.a();
        if (TextUtils.equals((CharSequence)"version", (CharSequence)s)) {
            this.b();
            final Bundle bundle2 = new Bundle();
            bundle2.putInt("version", 3);
            return bundle2;
        }
        return super.call(s, s2, bundle);
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException("Delete not allowed on the CameraContentProvider");
    }
    
    public final String getType(final Uri uri) {
        return null;
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not allowed on the CameraContentProvider");
    }
    
    public final boolean onCreate() {
        Trace.beginSection("GCA_CameraContentProvider#onCreate");
        final Context context = this.getContext();
        context.getClass();
        final HasCameraContentProviderComponent hasCameraContentProviderComponent = (HasCameraContentProviderComponent)this.getContext();
        hasCameraContentProviderComponent.getClass();
        hasCameraContentProviderComponent.initAppComponent();
        this.a = new czd(context, new HashSet(Arrays.asList(context.getResources().getStringArray(2130903079))));
        Trace.endSection();
        return true;
    }
    
    public final ParcelFileDescriptor openFile(Uri uri, String s) {
        this.a();
        Trace.beginSection("GCA_SpecialTypes#openFile");
        final czc b = this.b();
        if (!"r".equals(s)) {
            final String value = String.valueOf(s);
            String concat;
            if (value.length() != 0) {
                concat = "Unsupported mode: ".concat(value);
            }
            else {
                concat = new String("Unsupported mode: ");
            }
            throw new IllegalArgumentException(concat);
        }
        int n2 = 0;
        switch (b.b.match(uri)) {
            default: {
                s = String.valueOf(uri);
                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 21);
                sb.append("Unrecognized format: ");
                sb.append(s);
                throw new IllegalArgumentException(sb.toString());
            }
            case 8: {
                try {
                    final dry e = b.e;
                    final int n = ++dry.b;
                    final StringBuilder sb2 = new StringBuilder(14);
                    sb2.append("[r");
                    sb2.append(n);
                    sb2.append("]");
                    s = sb2.toString();
                    final long id = ContentUris.parseId(uri);
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(s).length() + 24);
                    sb3.append(s);
                    sb3.append("[m");
                    sb3.append(id);
                    sb3.append("] ");
                    final String string = sb3.toString();
                    final nii a = nii.a;
                    final String queryParameter = uri.getQueryParameter("width");
                    final String queryParameter2 = uri.getQueryParameter("height");
                    niz i = a;
                    if (queryParameter != null) {
                        i = a;
                        if (queryParameter2 != null) {
                            i = niz.i(new Size(Integer.parseInt(queryParameter), Integer.parseInt(queryParameter2)));
                        }
                    }
                    final niz a2 = e.e.a(id);
                    if (!a2.g()) {
                        a.k(dry.a.b(), "%s ProcessingMedia does not exist in ProcessingMediaManager", string, '\u0386');
                        throw new dsb("ProcessingMedia does not exist in ProcessingMediaManager");
                    }
                    final aza a3 = ((dqu)a2.c()).a();
                    if (a3 == null) {
                        a.k(dry.a.b(), "%s DrawableResource is not set in ProcessingMedia", string, '\u0385');
                        throw new dsb("DrawableResource is not set in ProcessingMedia");
                    }
                    final kse c = e.c;
                    final StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 45);
                    sb4.append("CAM_ProcessingMedia");
                    sb4.append(string);
                    sb4.append("BitmapDrawable.getBitmap()");
                    c.f(sb4.toString());
                    Bitmap bitmap = jvh.d((Drawable)a3.c());
                    e.c.g();
                    if (i.g()) {
                        final kse c2 = e.c;
                        final String value2 = String.valueOf(i.c());
                        final StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 50 + String.valueOf(value2).length());
                        sb5.append("CAM_ProcessingMedia");
                        sb5.append(string);
                        sb5.append("Bitmap.createScaledBitmap#size=");
                        sb5.append(value2);
                        c2.f(sb5.toString());
                        final Size size = (Size)i.c();
                        final int width = bitmap.getWidth();
                        final int height = bitmap.getHeight();
                        int width2 = size.getWidth();
                        int height2 = size.getHeight();
                        if (width > width2 || height > height2) {
                            if (width / (float)height > width2 / (float)height2) {
                                height2 = height * width2 / width;
                            }
                            else {
                                width2 = width * height2 / height;
                            }
                            bitmap = Bitmap.createScaledBitmap(bitmap, width2, height2, false);
                        }
                        e.c.g();
                    }
                    final kse c3 = e.c;
                    final StringBuilder sb6 = new StringBuilder(String.valueOf(string).length() + 45);
                    sb6.append("CAM_ProcessingMedia");
                    sb6.append(string);
                    sb6.append("BitmapSerializer.serialize");
                    c3.f(sb6.toString());
                    try {
                        try {
                            final dsa d = e.d;
                            dsa f;
                            if (!i.g()) {
                                f = e.f;
                            }
                            else {
                                f = d;
                            }
                            final ByteArrayOutputStream a4 = f.a(bitmap);
                            e.c.g();
                            uri = (Uri)b.a.openPipeHelper(Uri.EMPTY, "", Bundle.EMPTY, (Object)"", (ContentProvider$PipeDataWriter)new drx(e, string, a4));
                        }
                        finally {}
                    }
                    catch (final IOException ex) {
                        throw new dsb(ex);
                    }
                    e.c.g();
                }
                catch (final dsb dsb) {
                    final String value3 = String.valueOf(uri);
                    s = dsb.getMessage();
                    final StringBuilder sb7 = new StringBuilder(String.valueOf(value3).length() + 35 + String.valueOf(s).length());
                    sb7.append("Cannot load thumbnail for URI= ");
                    sb7.append(value3);
                    sb7.append(" ex=");
                    sb7.append(s);
                    throw new FileNotFoundException(sb7.toString());
                }
            }
            case 5: {
                n2 = 2131166144;
                break;
            }
            case 4: {
                n2 = 2131166146;
                break;
            }
            case 3: {
                n2 = 2131166143;
                break;
            }
        }
        uri = (Uri)b.a(uri, n2);
        Trace.endSection();
        return (ParcelFileDescriptor)uri;
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        this.a();
        Trace.beginSection("GCA_SpecialTypes#query");
        final czc b = this.b();
        b.c.f("SpecialTypesQuery");
        final drd d = b.d;
        drc drc = null;
        switch (d.d.match(uri)) {
            default: {
                final String value = String.valueOf(uri);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
                sb.append("Unrecognized uri: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            case 7:
            case 8: {
                drc = d.c;
                break;
            }
            case 2: {
                drc = d.b;
                break;
            }
            case 1: {
                drc = d.a;
                break;
            }
        }
        final Cursor a = drc.a(uri, array);
        b.c.g();
        Trace.endSection();
        return a;
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("Update not allowed on the CameraContentProvider");
    }
}
