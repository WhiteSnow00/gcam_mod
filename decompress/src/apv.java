import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import java.io.UnsupportedEncodingException;
import java.io.InputStreamReader;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.ErrorHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;
import org.xml.sax.InputSource;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apv
{
    private static final Object a;
    private static final DocumentBuilderFactory b;
    
    static {
        a = new Object();
        final DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
        instance.setNamespaceAware(true);
        instance.setIgnoringComments(true);
        try {
            instance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        }
        catch (final Exception ex) {}
        b = instance;
    }
    
    public static apf a(Object o) {
        aaf.e(o);
        final aqi aqi = new aqi();
        Label_0185: {
            if (o instanceof InputStream) {
                final InputStream inputStream = (InputStream)o;
                if (!aqi.b() && !aqi.c()) {
                    final Document document = b(new InputSource(inputStream));
                    break Label_0185;
                }
                try {
                    final Document document = c(new apj(inputStream), aqi);
                    break Label_0185;
                }
                catch (final IOException ex) {
                    throw new ape("Error reading the XML-file", 204, ex);
                }
            }
            if (o instanceof byte[]) {
                final Document document = c(new apj((byte[])o), aqi);
                break Label_0185;
            }
            final String s = (String)o;
            final InputSource inputSource = new InputSource(new StringReader(s));
            try {
                final Document document = b(inputSource);
                break Label_0185;
            }
            catch (final ape ape) {
                if (ape.a != 201 || !aqi.c()) {
                    throw ape;
                }
                final Document document = b(new InputSource(new apl(new StringReader(s))));
                final Object[] d = d(document, aqi.h(1), new Object[3]);
                if (d == null || d[1] != apv.a) {
                    return new apu();
                }
                int i = 0;
                final Node node = (Node)d[0];
                o = new apu();
                if (node.hasAttributes()) {
                    final apx a = ((apu)o).a;
                    while (i < node.getChildNodes().getLength()) {
                        final Node item = node.getChildNodes().item(i);
                        if (!acv.n(item)) {
                            acv.m((apu)o, a, item, true);
                        }
                        ++i;
                    }
                    final String s2 = (String)d[2];
                    if (!aqi.h(32)) {
                        apy.a((apu)o, aqi);
                    }
                    return (apf)o;
                }
                throw new ape("Invalid attributes of rdf:RDF element", 202);
            }
        }
    }
    
    private static Document b(final InputSource inputSource) {
        try {
            final DocumentBuilder documentBuilder = apv.b.newDocumentBuilder();
            documentBuilder.setErrorHandler(null);
            return documentBuilder.parse(inputSource);
        }
        catch (final IOException ex) {
            throw new ape("Error reading the XML-file", 204, ex);
        }
        catch (final ParserConfigurationException ex2) {
            throw new ape("XML Parser not correctly configured", 0, ex2);
        }
        catch (final SAXException ex3) {
            throw new ape("XML parsing failure", 201, ex3);
        }
    }
    
    private static Document c(final apj apj, final aqi aqi) {
        final InputSource inputSource = new InputSource(apj.a());
        try {
            return b(inputSource);
        }
        catch (final ape ape) {
            final int a = ape.a;
            if (a != 201 && a != 204) {
                throw ape;
            }
            apj apj2 = apj;
            if (aqi.b()) {
                apj2 = apj;
                if ("UTF-8".equals(apj.b())) {
                    final byte[] array = new byte[8];
                    apj2 = new apj(apj.b * 4 / 3);
                    final int n = 0;
                    int n2 = 0;
                    int n3 = 0;
                    int n4 = 0;
                    int n5 = 0;
                    while (true) {
                        final int b = apj.b;
                        if (n2 < b) {
                            if (n2 >= b) {
                                throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
                            }
                            final int n6 = apj.a[n2] & 0xFF;
                            switch (n3) {
                                default: {
                                    if (n6 < 127) {
                                        apj2.d(apj2.b + 1);
                                        apj2.a[apj2.b++] = (byte)n6;
                                        break;
                                    }
                                    if (n6 >= 192) {
                                        for (int n7 = n6, n4 = -1; n4 < 8 && (n7 & 0x80) == 0x80; ++n4, n7 += n7) {}
                                        array[n5] = (byte)n6;
                                        ++n5;
                                        n3 = 11;
                                        break;
                                    }
                                    apj2.c(aaf.h((byte)n6));
                                    break;
                                }
                                case 11: {
                                    if (n4 <= 0 || (n6 & 0xC0) != 0x80) {
                                        apj2.c(aaf.h(array[0]));
                                        n2 -= n5;
                                        n3 = 0;
                                        n5 = 0;
                                        break;
                                    }
                                    final int n8 = n5 + 1;
                                    array[n5] = (byte)n6;
                                    if (--n4 == 0) {
                                        apj2.e(array, n8);
                                        n3 = 0;
                                        n5 = 0;
                                        break;
                                    }
                                    n5 = n8;
                                    break;
                                }
                            }
                            ++n2;
                        }
                        else {
                            if (n3 == 11) {
                                for (int i = n; i < n5; ++i) {
                                    apj2.c(aaf.h(array[i]));
                                }
                                break;
                            }
                            break;
                        }
                    }
                }
            }
            if (aqi.c()) {
                try {
                    return b(new InputSource(new apl(new InputStreamReader(apj2.a(), apj2.b()))));
                }
                catch (final UnsupportedEncodingException ex) {
                    throw new ape("Unsupported Encoding", 9, ape);
                }
            }
            return b(new InputSource(apj2.a()));
        }
    }
    
    private static Object[] d(final Node node, final boolean b, final Object[] array) {
        final NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); ++i) {
            final Node item = childNodes.item(i);
            if (item.getNodeType() == 7) {
                final ProcessingInstruction processingInstruction = (ProcessingInstruction)item;
                if (processingInstruction.getTarget() == "xpacket") {
                    array[2] = processingInstruction.getData();
                    continue;
                }
            }
            if (item.getNodeType() != 3 && item.getNodeType() != 7) {
                final String namespaceURI = item.getNamespaceURI();
                final String localName = item.getLocalName();
                if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                    return d(item, false, array);
                }
                if (!b && "RDF".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                    array[0] = item;
                    array[1] = apv.a;
                    return array;
                }
                final Object[] d = d(item, b, array);
                if (d != null) {
                    return d;
                }
            }
        }
        return null;
    }
}
