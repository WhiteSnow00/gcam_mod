import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqa
{
    private final Map a;
    private final Map b;
    private final Map c;
    private final Pattern d;
    
    public aqa() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = Pattern.compile("[/*?\\[\\]]");
        try {
            this.c("http://www.w3.org/XML/1998/namespace", "xml");
            this.c("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
            this.c("http://purl.org/dc/elements/1.1/", "dc");
            this.c("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
            this.c("adobe:ns:meta/", "x");
            this.c("http://ns.adobe.com/iX/1.0/", "iX");
            this.c("http://ns.adobe.com/xap/1.0/", "xmp");
            this.c("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
            this.c("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
            this.c("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
            this.c("http://ns.adobe.com/xmp/note/", "xmpNote");
            this.c("http://ns.adobe.com/pdf/1.3/", "pdf");
            this.c("http://ns.adobe.com/pdfx/1.3/", "pdfx");
            this.c("http://www.npes.org/pdfx/ns/id/", "pdfxid");
            this.c("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
            this.c("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
            this.c("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
            this.c("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
            this.c("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
            this.c("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
            this.c("http://ns.adobe.com/photoshop/1.0/", "photoshop");
            this.c("http://ns.adobe.com/album/1.0/", "album");
            this.c("http://ns.adobe.com/exif/1.0/", "exif");
            this.c("http://ns.adobe.com/exif/1.0/aux/", "aux");
            this.c("http://ns.adobe.com/tiff/1.0/", "tiff");
            this.c("http://ns.adobe.com/png/1.0/", "png");
            this.c("http://ns.adobe.com/jpeg/1.0/", "jpeg");
            this.c("http://ns.adobe.com/jp2k/1.0/", "jp2k");
            this.c("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
            this.c("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
            this.c("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
            this.c("http://ns.adobe.com/asf/1.0/", "asf");
            this.c("http://ns.adobe.com/xmp/wav/1.0/", "wav");
            this.c("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
            this.c("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
            this.c("http://ns.adobe.com/xap/1.0/t/", "xmpT");
            this.c("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
            this.c("http://ns.adobe.com/xap/1.0/g/", "xmpG");
            this.c("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
            this.c("http://ns.adobe.com/xap/1.0/sType/Font#", "stFNT");
            this.c("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
            this.c("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
            this.c("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
            this.c("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
            this.c("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
            this.c("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
            this.c("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
            final aqf aqf = new aqf();
            aqf.f(1536, true);
            final aqf aqf2 = new aqf();
            aqf2.f(7680, true);
            this.d("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aqf);
            this.d("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
            this.d("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
            this.d("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
            this.d("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            this.d("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
            this.d("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", null);
            this.d("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            this.d("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aqf);
            this.d("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
            this.d("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            this.d("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            this.d("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            this.d("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", aqf2);
            this.d("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", aqf2);
            this.d("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aqf);
            this.d("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", aqf2);
            this.d("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", aqf2);
            this.d("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
            this.d("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
            this.d("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", aqf2);
            this.d("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
            this.d("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", aqf);
            this.d("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
            this.d("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            this.d("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
            this.d("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            this.d("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", aqf);
            this.d("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", aqf2);
            this.d("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
            this.d("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", aqf2);
            this.d("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
            this.d("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
            this.d("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", aqf2);
        }
        catch (final ape ape) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }
    
    public final String a(String s) {
        synchronized (this) {
            s = this.a.get(s);
            return s;
        }
    }
    
    public final String b(String s) {
        monitorenter(this);
        String concat = s;
        Label_0028: {
            if (s == null) {
                break Label_0028;
            }
            concat = s;
            try {
                if (!s.endsWith(":")) {
                    concat = s.concat(":");
                }
                s = (String)this.b.get(concat);
                return s;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final String c(final String s, String string) {
        monitorenter(this);
        try {
            aaf.g(s);
            if (string == null || string.length() == 0) {
                throw new ape("Empty prefix", 4);
            }
            final char char1 = string.charAt(string.length() - 1);
            int n = 1;
            String string2 = string;
            if (char1 != ':') {
                final StringBuilder sb = new StringBuilder(string.length() + 1);
                sb.append(string);
                sb.append(':');
                string2 = sb.toString();
            }
            if (!apn.f(string2.substring(0, string2.length() - 1))) {
                throw new ape("The prefix is a bad XML name", 201);
            }
            string = this.a.get(s);
            final String s2 = this.b.get(string2);
            if (string != null) {
                monitorexit(this);
                return string;
            }
            string = string2;
            if (s2 != null) {
                String substring;
                StringBuilder sb2;
                for (string = string2; this.b.containsKey(string); string = sb2.toString(), ++n) {
                    substring = string2.substring(0, string2.length() - 1);
                    sb2 = new StringBuilder(String.valueOf(substring).length() + 14);
                    sb2.append(substring);
                    sb2.append("_");
                    sb2.append(n);
                    sb2.append("_:");
                }
            }
            this.b.put(string, s);
            this.a.put(s, string);
            monitorexit(this);
            return string;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void d(String o, String concat, final String s, final String s2, aqf aqf) {
        synchronized (this) {
            aaf.g((String)o);
            aaf.f((String)concat);
            aaf.g(s);
            aaf.f(s2);
            if (aqf != null) {
                aqf = new aqf(acv.i(aqf.b(), null).a);
            }
            else {
                aqf = new aqf();
            }
            if (this.d.matcher((CharSequence)concat).find() || this.d.matcher(s2).find()) {
                throw new ape("Alias and actual property names must be simple", 102);
            }
            o = this.a((String)o);
            final String a = this.a(s);
            if (o == null) {
                throw new ape("Alias namespace is not registered", 101);
            }
            if (a == null) {
                throw new ape("Actual namespace is not registered", 101);
            }
            if (((String)concat).length() != 0) {
                o = ((String)o).concat((String)concat);
            }
            else {
                o = new String((String)o);
            }
            if (this.c.containsKey(o)) {
                throw new ape("Alias is already existing", 4);
            }
            final Map c = this.c;
            if (s2.length() != 0) {
                concat = a.concat(s2);
            }
            else {
                concat = new String(a);
            }
            if (!c.containsKey(concat)) {
                this.c.put(o, new apz(s, a, s2, aqf));
                return;
            }
            throw new ape("Actual property is already an alias, use the base property", 4);
        }
    }
    
    public final apz e(final String s) {
        synchronized (this) {
            return this.c.get(s);
        }
    }
}
