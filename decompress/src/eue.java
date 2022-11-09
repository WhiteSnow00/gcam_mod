import java.io.OutputStreamWriter;
import android.location.Location;
import java.text.ParseException;
import java.io.FileWriter;
import java.util.List;
import java.io.Serializable;
import java.util.Iterator;
import j$.util.DesugarTimeZone;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.os.Build;
import android.media.ExifInterface;
import java.io.FilenameFilter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Locale;
import java.text.NumberFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eue
{
    private static final nsd b;
    private static final NumberFormat c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/legacy/lightcycle/util/MetadataUtils");
        c = NumberFormat.getInstance(Locale.US);
    }
    
    public static float a(final Map map) {
        if (map == null) {
            return 0.0f;
        }
        final String s = map.get("cropped_area_width");
        final String s2 = map.get("full_pano_width");
        try {
            return Integer.parseInt(s) / (float)Integer.parseInt(s2) * 360.0f;
        }
        catch (final NumberFormatException ex) {
            return 0.0f;
        }
    }
    
    public static Map b(String s) {
        Object o = null;
        Object o2;
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
            try {
                s = (String)new HashMap();
                while (true) {
                    o = bufferedReader.readLine();
                    if (o == null) {
                        break;
                    }
                    o = ((String)o).split(",", 2);
                    if (((String)o).length != 2) {
                        continue;
                    }
                    ((Map<Object, String>)s).put(o[0], o[1].trim());
                }
                try {
                    bufferedReader.close();
                }
                catch (final IOException ex) {}
                return (Map)s;
            }
            catch (final IOException ex2) {}
        }
        catch (final IOException ex3) {
            o2 = null;
        }
        finally {
            o2 = o;
        }
        try {
            ((BufferedReader)o2).close();
            goto Label_0115;
        }
        catch (final IOException ex4) {}
        if (o2 != null) {
            try {
                ((BufferedReader)o2).close();
            }
            catch (final IOException ex5) {}
        }
        return null;
    }
    
    public static void c(String value, final Map map, String s, final boolean b, final boolean b2, final niz niz, long n, final boolean b3) {
        if (value != null) {
            if (new File(value).exists()) {
                final File[] listFiles = new File(s).listFiles(eud.a);
                if (listFiles.length > 0) {
                    s = listFiles[0].getAbsolutePath();
                }
                else {
                    s = null;
                }
                try {
                    final ExifInterface exifInterface = new ExifInterface(value);
                    if (s != null) {
                        exifInterface.setAttribute("Make", new ExifInterface(s).getAttribute("Make"));
                    }
                    else {
                        exifInterface.setAttribute("Make", Build.MANUFACTURER);
                    }
                    final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                    bitmapFactory$Options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(value, bitmapFactory$Options);
                    exifInterface.setAttribute("ImageWidth", String.valueOf(bitmapFactory$Options.outWidth));
                    exifInterface.setAttribute("ImageLength", String.valueOf(bitmapFactory$Options.outHeight));
                    final TimeZone default1 = TimeZone.getDefault();
                    final Date date = new Date(n);
                    final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(default1);
                    final String format = simpleDateFormat.format(date);
                    final String n2 = kwp.n(n);
                    final int offset = default1.getOffset(n);
                    final int abs = Math.abs(offset);
                    final StringBuilder sb = new StringBuilder();
                    s = "-";
                    if (offset >= 0) {
                        s = "+";
                    }
                    sb.append(s);
                    final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
                    n = abs;
                    sb.append(kwp.o(milliseconds.toHours(n)));
                    sb.append(":");
                    sb.append(kwp.o(TimeUnit.MILLISECONDS.toMinutes(n) % 60L));
                    s = sb.toString();
                    exifInterface.setAttribute("DateTime", format);
                    exifInterface.setAttribute("DateTimeOriginal", format);
                    exifInterface.setAttribute("DateTimeDigitized", format);
                    exifInterface.setAttribute("SubSecTime", n2);
                    exifInterface.setAttribute("SubSecTimeOriginal", n2);
                    exifInterface.setAttribute("SubSecTimeDigitized", n2);
                    exifInterface.setAttribute("OffsetTime", s);
                    exifInterface.setAttribute("OffsetTimeOriginal", s);
                    exifInterface.setAttribute("OffsetTimeDigitized", s);
                    exifInterface.setAttribute("Model", Build.MODEL);
                    if (map != null) {
                        final Iterator iterator = map.entrySet().iterator();
                        Double e2;
                        Double e = e2 = null;
                        Serializable i;
                        Double e3 = (Double)(i = e2);
                        while (iterator.hasNext()) {
                            final Map.Entry<String, String> entry = (Map.Entry<String, String>)iterator.next();
                            if (entry.getKey().equals("location_altitude")) {
                                e = e((Map.Entry)entry);
                            }
                            else if (entry.getKey().equals("location_latitude")) {
                                e2 = e((Map.Entry)entry);
                            }
                            else if (entry.getKey().equals("location_longitude")) {
                                e3 = e((Map.Entry)entry);
                            }
                            else if (entry.getKey().equals("location_provider")) {
                                exifInterface.setAttribute("GPSProcessingMethod", (String)entry.getValue());
                            }
                            else {
                                if (!entry.getKey().equals("location_time")) {
                                    continue;
                                }
                                i = i((Map.Entry)entry);
                            }
                        }
                        if (e != null) {
                            String s2;
                            if (e < 0.0) {
                                s2 = "1";
                            }
                            else {
                                s2 = "0";
                            }
                            exifInterface.setAttribute("GPSAltitudeRef", s2);
                        }
                        if (e2 != null && e3 != null) {
                            final String g = g(e2);
                            String s3;
                            if (e2 >= 0.0) {
                                s3 = "N";
                            }
                            else {
                                s3 = "S";
                            }
                            final String g2 = g(e3);
                            String s4;
                            if (e3 >= 0.0) {
                                s4 = "E";
                            }
                            else {
                                s4 = "W";
                            }
                            if (g != null && g2 != null) {
                                exifInterface.setAttribute("GPSLatitude", g);
                                exifInterface.setAttribute("GPSLatitudeRef", s3);
                                exifInterface.setAttribute("GPSLongitude", g2);
                                exifInterface.setAttribute("GPSLongitudeRef", s4);
                            }
                        }
                        if (i != null) {
                            final TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
                            final SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy:MM:dd", Locale.US);
                            simpleDateFormat2.setTimeZone(timeZone);
                            exifInterface.setAttribute("GPSDateStamp", simpleDateFormat2.format((Date)i));
                            final SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm:ss", Locale.US);
                            simpleDateFormat3.setTimeZone(timeZone);
                            exifInterface.setAttribute("GPSTimeStamp", simpleDateFormat3.format((Date)i));
                        }
                    }
                    exifInterface.saveAttributes();
                }
                catch (final IOException ex) {
                    if (value.length() != 0) {
                        "Write exif failed :".concat(value);
                    }
                    else {
                        new String("Write exif failed :");
                    }
                }
                if (!b2 && !niz.g()) {
                    return;
                }
                final apf a = lmx.a();
                Label_1712: {
                    if (!b2) {
                        break Label_1712;
                    }
                    try {
                        a.j("UsePanoramaViewer", b);
                        a.j("IsPhotosphere", b3);
                        a.c("http://ns.google.com/photos/1.0/panorama/", "ProjectionType", "equirectangular");
                        if (map != null) {
                            final Iterator iterator2 = map.entrySet().iterator();
                            Serializable f = null;
                            Serializable f3;
                            Integer f2 = (Integer)(f3 = f);
                            Serializable f5;
                            Integer f4 = (Integer)(f5 = f3);
                            Serializable j;
                            Integer f6 = (Integer)(j = f5);
                            Serializable f7;
                            Date k = (Date)(f7 = j);
                            Serializable f9;
                            Integer f8 = (Integer)(f9 = f7);
                            while (iterator2.hasNext()) {
                                final Map.Entry<String, V> entry2 = (Map.Entry<String, V>)iterator2.next();
                                if (entry2.getKey().equals("full_pano_width")) {
                                    f3 = f((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("full_pano_height")) {
                                    f4 = f((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("cropped_area_width")) {
                                    f = f((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("cropped_area_height")) {
                                    f2 = f((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("cropped_area_top")) {
                                    f5 = f((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("cropped_area_left")) {
                                    f6 = f((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("first_photo_time")) {
                                    j = i((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("last_photo_time")) {
                                    k = i((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("source_photos_count")) {
                                    f7 = f((Map.Entry)entry2);
                                }
                                else if (entry2.getKey().equals("pose_heading")) {
                                    f8 = f((Map.Entry)entry2);
                                }
                                else {
                                    if (!entry2.getKey().equals("yaw_correction_deg")) {
                                        continue;
                                    }
                                    f9 = f((Map.Entry)entry2);
                                }
                            }
                            if (f != null && f2 != null) {
                                a.k("CroppedAreaImageHeightPixels", f2);
                                a.k("CroppedAreaImageWidthPixels", (int)f);
                            }
                            if (f3 != null && f4 != null) {
                                a.k("FullPanoHeightPixels", f4);
                                a.k("FullPanoWidthPixels", (int)f3);
                            }
                            if (f5 != null && f6 != null) {
                                a.k("CroppedAreaTopPixels", (int)f5);
                                a.k("CroppedAreaLeftPixels", f6);
                            }
                            if (j != null) {
                                a.c("http://ns.google.com/photos/1.0/panorama/", "FirstPhotoDate", new apo((Date)j, DesugarTimeZone.getTimeZone("GMT")));
                            }
                            if (k != null) {
                                ((apu)a).d("http://ns.google.com/photos/1.0/panorama/", "LastPhotoDate", new apo(k, DesugarTimeZone.getTimeZone("GMT")), null);
                            }
                            if (f7 != null) {
                                a.k("SourcePhotosCount", (int)f7);
                            }
                            if (f8 != null && f9 != null) {
                                ((apu)a).d("http://ns.google.com/photos/1.0/panorama/", "PoseHeadingDegrees", new Double((f8 + (int)f9 + 720) % 360), null);
                            }
                        }
                        final BitmapFactory$Options bitmapFactory$Options2 = new BitmapFactory$Options();
                        bitmapFactory$Options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(value, bitmapFactory$Options2);
                        final int outWidth = bitmapFactory$Options2.outWidth;
                        final int outHeight = bitmapFactory$Options2.outHeight;
                        a.k("LargestValidInteriorRectLeft", 0);
                        a.k("LargestValidInteriorRectTop", 0);
                        a.k("LargestValidInteriorRectWidth", outWidth);
                        a.k("LargestValidInteriorRectHeight", outHeight);
                        if (niz.g()) {
                            lmx.k(a, (String)niz.c());
                        }
                        if (!lmx.h(value, a)) {
                            if (value.length() != 0) {
                                "Write XMP meta to file failed:".concat(value);
                                return;
                            }
                            new String("Write XMP meta to file failed:");
                        }
                    }
                    catch (final ape ape) {
                        value = String.valueOf(ape.getLocalizedMessage());
                        if (value.length() != 0) {
                            "Set xmp property failed:".concat(value);
                            return;
                        }
                        new String("Set xmp property failed:");
                    }
                }
            }
        }
    }
    
    public static void d(String value, List list) {
        if (list.size() == 0) {
            return;
        }
        Object c = null;
        final List list2 = null;
        Label_0457: {
            try {
                final FileWriter fileWriter = new FileWriter((String)value);
                try {
                    fileWriter.write(h("%s,%d\n", "first_photo_time", ((euf)list.get(0)).a));
                    fileWriter.write(h("%s,%d\n", "last_photo_time", ((euf)list.get(list.size() - 1)).a));
                    fileWriter.write(h("%s,%d\n", "source_photos_count", list.size()));
                    fileWriter.write(h("%s,%d\n", "pose_heading", ((euf)list.get(0)).d));
                    for (int i = list.size() - 1; i >= 0; --i) {
                        c = ((euf)list.get(i)).c;
                        if (c != null) {
                            fileWriter.write(h("%s,%f\n", "location_altitude", ((Location)c).getAltitude()));
                            fileWriter.write(h("%s,%f\n", "location_latitude", ((Location)c).getLatitude()));
                            fileWriter.write(h("%s,%f\n", "location_longitude", ((Location)c).getLongitude()));
                            fileWriter.write(h("%s,%s\n", "location_provider", ((Location)c).getProvider()));
                            fileWriter.write(h("%s,%d\n", "location_time", ((Location)c).getTime()));
                            break;
                        }
                    }
                    try {
                        fileWriter.close();
                        return;
                    }
                    catch (final IOException value) {
                        return;
                    }
                }
                catch (final IOException ex) {}
            }
            catch (final IOException ex2) {
                list = list2;
            }
            finally {
                list = (List)c;
                break Label_0457;
            }
            try {
                value = (IOException)String.valueOf(value);
                if (((String)value).length() != 0) {
                    "Could not write metadata file: ".concat((String)value);
                }
                else {
                    new String("Could not write metadata file: ");
                }
                if (list != null) {
                    try {
                        ((OutputStreamWriter)list).close();
                    }
                    catch (final IOException ex3) {}
                }
                return;
            }
            finally {}
        }
        if (list != null) {
            try {
                ((FileWriter)list).close();
            }
            catch (final IOException ex4) {}
        }
        throw value;
    }
    
    private static Double e(final Map.Entry entry) {
        try {
            return eue.c.parse(entry.getValue()).doubleValue();
        }
        catch (final ParseException ex) {
            eue.b.c().h(ex).E(1420).x("Parse double failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }
    
    private static Integer f(final Map.Entry entry) {
        try {
            return Integer.valueOf(entry.getValue());
        }
        catch (final NumberFormatException ex) {
            eue.b.c().h(ex).E(1421).x("Parse integer failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }
    
    private static String g(final double p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    java/lang/Math.abs:(D)D
        //     4: iconst_2       
        //     5: invokestatic    android/location/Location.convert:(DI)Ljava/lang/String;
        //     8: ldc             ":"
        //    10: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    13: astore_2       
        //    14: aload_2        
        //    15: arraylength    
        //    16: iconst_3       
        //    17: if_icmpeq       22
        //    20: aconst_null    
        //    21: areturn        
        //    22: getstatic       eue.c:Ljava/text/NumberFormat;
        //    25: aload_2        
        //    26: iconst_2       
        //    27: aaload         
        //    28: invokevirtual   java/text/NumberFormat.parse:(Ljava/lang/String;)Ljava/lang/Number;
        //    31: astore_3       
        //    32: aload_3        
        //    33: invokevirtual   java/lang/Number.floatValue:()F
        //    36: fstore          4
        //    38: aload_2        
        //    39: iconst_0       
        //    40: aaload         
        //    41: astore_3       
        //    42: aload_2        
        //    43: iconst_1       
        //    44: aaload         
        //    45: astore_2       
        //    46: new             Ljava/lang/StringBuilder;
        //    49: dup            
        //    50: aload_3        
        //    51: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    54: invokevirtual   java/lang/String.length:()I
        //    57: bipush          22
        //    59: iadd           
        //    60: aload_2        
        //    61: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    64: invokevirtual   java/lang/String.length:()I
        //    67: iadd           
        //    68: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    71: astore          5
        //    73: aload           5
        //    75: aload_3        
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: pop            
        //    80: aload           5
        //    82: ldc_w           "/1,"
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    88: pop            
        //    89: aload           5
        //    91: aload_2        
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: pop            
        //    96: aload           5
        //    98: ldc_w           "/1,"
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: pop            
        //   105: aload           5
        //   107: fload           4
        //   109: ldc_w           1000.0
        //   112: fmul           
        //   113: f2i            
        //   114: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   117: pop            
        //   118: aload           5
        //   120: ldc_w           "/1000"
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   126: pop            
        //   127: aload           5
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: areturn        
        //   133: astore_3       
        //   134: getstatic       eue.b:Lnsd;
        //   137: invokevirtual   nry.c:()Lnsu;
        //   140: checkcast       Lnsa;
        //   143: sipush          1422
        //   146: invokeinterface nsa.E:(I)Lnsu;
        //   151: checkcast       Lnsa;
        //   154: ldc_w           "Could not parse float: %s"
        //   157: aload_2        
        //   158: iconst_2       
        //   159: aaload         
        //   160: invokeinterface nsa.r:(Ljava/lang/String;Ljava/lang/Object;)V
        //   165: aconst_null    
        //   166: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  22     32     133    167    Ljava/text/ParseException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static String h(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    private static Date i(final Map.Entry entry) {
        try {
            return new Date(Long.parseLong(entry.getValue()));
        }
        catch (final NumberFormatException ex) {
            entry.getKey();
            entry.getValue();
            return null;
        }
    }
}
