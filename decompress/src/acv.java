import java.util.List;
import org.w3c.dom.NamedNodeMap;
import java.util.ArrayList;
import org.w3c.dom.Attr;
import org.w3c.dom.Node;
import java.util.Iterator;
import android.system.Os;
import java.io.FileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public class acv
{
    static long a(final FileDescriptor fileDescriptor, final long n, final int n2) {
        return Os.lseek(fileDescriptor, 0L, n2);
    }
    
    public static int d(final apx apx, final String s) {
        if (apx.g().d()) {
            for (int i = 1; i <= apx.a(); ++i) {
                final apx e = apx.e(i);
                if (e.t()) {
                    if ("xml:lang".equals(e.f(1).a)) {
                        if (s.equals(e.f(1).b)) {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }
        throw new ape("Language item must be used on array", 102);
    }
    
    public static apx e(final apx apx, final String s, final boolean b) {
        if (!apx.g().n() && !apx.g().o()) {
            if (!apx.f) {
                throw new ape("Named children only allowed for schemas and structs", 102);
            }
            if (apx.g().d()) {
                throw new ape("Named children not allowed for arrays", 102);
            }
            if (b) {
                apx.g().x(true);
            }
        }
        final apx c = apx.c(s);
        apx apx2;
        if ((apx2 = c) == null) {
            apx2 = c;
            if (b) {
                apx2 = new apx(s, new aqj());
                apx2.f = true;
                apx.k(apx2);
            }
        }
        return apx2;
    }
    
    public static apx f(apx apx, final aqd aqd, final boolean b, final aqj aqj) {
        if (aqd.a() != 0) {
            final apx g = g(apx, aqd.b(0).a, b);
            if (g == null) {
                return null;
            }
            if (g.f) {
                g.f = false;
                apx = g;
            }
            else {
                apx = null;
            }
            int n = 1;
            apx apx2 = apx;
            apx = g;
            try {
                while (true) {
                    Label_0941: {
                        if (n >= aqd.a()) {
                            break Label_0941;
                        }
                        final aqe b2 = aqd.b(n);
                        final int b3 = b2.b;
                        Label_0721: {
                            if (b3 == 1) {
                                apx = e(apx, b2.a, b);
                                break Label_0721;
                            }
                            Label_0695: {
                                if (b3 == 2) {
                                    final String substring = b2.a.substring(1);
                                    final apx d = apx.d(substring);
                                    if (d == null && b) {
                                        final apx apx3 = new apx(substring, null);
                                        apx3.f = true;
                                        apx.m(apx3);
                                        apx = apx3;
                                        break Label_0721;
                                    }
                                    apx = d;
                                    break Label_0721;
                                }
                                else {
                                    if (!apx.g().d()) {
                                        break Label_0695;
                                    }
                                    if (b3 == 3) {
                                        final String a = b2.a;
                                        try {
                                            final int int1 = Integer.parseInt(a.substring(1, a.length() - 1));
                                            if (int1 <= 0) {
                                                throw new ape("Array index must be larger than zero", 102);
                                            }
                                            int i = int1;
                                            if (b && (i = int1) == apx.a() + 1) {
                                                final apx apx4 = new apx("[]", null);
                                                apx4.f = true;
                                                apx.k(apx4);
                                                i = int1;
                                                break Label_0695;
                                            }
                                            break Label_0695;
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw new ape("Array index not digits.", 102);
                                        }
                                    }
                                }
                                try {
                                    int i;
                                    if (b3 == 4) {
                                        i = apx.a();
                                    }
                                    else if (b3 == 6) {
                                        final String[] g2 = apn.g(b2.a);
                                        final String s = g2[0];
                                        final String s2 = g2[1];
                                        int n2 = -1;
                                        int n5;
                                        for (int n3 = 1; n3 <= apx.a() && n2 < 0; ++n3, n2 = n5) {
                                            final apx e = apx.e(n3);
                                            if (!e.g().o()) {
                                                throw new ape("Field selector must be used on array of struct", 102);
                                            }
                                            int n4 = 1;
                                            while (true) {
                                                n5 = n2;
                                                if (n4 > e.a()) {
                                                    break;
                                                }
                                                final apx e2 = e.e(n4);
                                                if (s.equals(e2.a)) {
                                                    if (s2.equals(e2.b)) {
                                                        n5 = n3;
                                                        break;
                                                    }
                                                }
                                                ++n4;
                                            }
                                        }
                                        i = n2;
                                    }
                                    else {
                                        if (b3 != 5) {
                                            throw new ape("Unknown array indexing step in FollowXPathStep", 9);
                                        }
                                        final String[] g3 = apn.g(b2.a);
                                        final String s3 = g3[0];
                                        final String s4 = g3[1];
                                        final int d2 = b2.d;
                                        if ("xml:lang".equals(s3)) {
                                            i = d(apx, apn.a(s4));
                                            if (i < 0 && (d2 & 0x1000) > 0) {
                                                final apx apx5 = new apx("[]", null);
                                                apx5.m(new apx("xml:lang", "x-default", null));
                                                apx.l(1, apx5);
                                                i = 1;
                                            }
                                        }
                                        else {
                                            for (i = 1; i < apx.a(); ++i) {
                                                final Iterator j = apx.e(i).i();
                                                while (j.hasNext()) {
                                                    final apx apx6 = j.next();
                                                    if (s3.equals(apx6.a) && s4.equals(apx6.b)) {
                                                        break Label_0695;
                                                    }
                                                }
                                            }
                                            i = -1;
                                        }
                                    }
                                    if (i > 0 && i <= apx.a()) {
                                        apx = apx.e(i);
                                    }
                                    else {
                                        apx = null;
                                    }
                                    if (apx == null) {
                                        if (b) {
                                            k(apx2);
                                        }
                                        return null;
                                    }
                                    apx apx7;
                                    int n8;
                                    if (apx.f) {
                                        apx.f = false;
                                        int n7 = 0;
                                        Label_0869: {
                                            int n6;
                                            if ((n6 = n) == 1) {
                                                if (aqd.b(1).c) {
                                                    if (aqd.b(1).d != 0) {
                                                        apx.g().f(aqd.b(1).d, true);
                                                        n7 = 1;
                                                        break Label_0869;
                                                    }
                                                    n6 = 1;
                                                }
                                                else {
                                                    n6 = 1;
                                                }
                                            }
                                            if ((n7 = n6) < aqd.a() - 1) {
                                                n7 = n6;
                                                if (aqd.b(n6).b == 1) {
                                                    n7 = n6;
                                                    if (!apx.g().l()) {
                                                        apx.g().x(true);
                                                        n7 = n6;
                                                    }
                                                }
                                            }
                                        }
                                        apx7 = apx2;
                                        n8 = n7;
                                        if (apx2 == null) {
                                            apx7 = apx;
                                            n8 = n7;
                                        }
                                    }
                                    else {
                                        n8 = n;
                                        apx7 = apx2;
                                    }
                                    n = n8 + 1;
                                    apx2 = apx7;
                                    continue;
                                    iftrue(Label_0962:)(apx2 == null);
                                    apx.g().b(aqj);
                                    apx.e = apx.g();
                                    Label_0962: {
                                        return apx;
                                    }
                                    throw new ape("Indexing applied to non-array", 102);
                                }
                                catch (final ape ape) {
                                    if (apx2 != null) {
                                        k(apx2);
                                    }
                                    throw ape;
                                }
                            }
                        }
                    }
                }
            }
            catch (final ape ape2) {}
        }
        throw new ape("Empty XMPPath", 102);
    }
    
    public static apx g(final apx apx, final String s, final boolean b) {
        return h(apx, s, null, b);
    }
    
    public static apx h(apx apx, String c, final String s, final boolean b) {
        final apx c2 = apx.c(c);
        if (c2 == null) {
            if (b) {
                final aqj aqj = new aqj();
                aqj.f(Integer.MIN_VALUE, true);
                final apx apx2 = new apx(c, aqj);
                apx2.f = true;
                final String a = aph.a.a(c);
                if (a == null) {
                    if (s == null || s.length() == 0) {
                        throw new ape("Unregistered schema namespace URI", 101);
                    }
                    c = aph.a.c(c, s);
                }
                else {
                    c = a;
                }
                apx2.b = c;
                apx.k(apx2);
                apx = apx2;
            }
            else {
                apx = c2;
            }
        }
        else {
            apx = c2;
        }
        return apx;
    }
    
    public static aqj i(final aqj aqj, final Object o) {
        aqj aqj2 = aqj;
        if (aqj == null) {
            aqj2 = new aqj();
        }
        if (aqj2.i()) {
            aqj2.s();
        }
        if (aqj2.j()) {
            aqj2.t();
        }
        if (aqj2.k()) {
            aqj2.q();
        }
        if (aqj2.l() && o != null && o.toString().length() > 0) {
            throw new ape("Structs and arrays can't have values", 103);
        }
        aqj2.e(aqj2.a);
        return aqj2;
    }
    
    public static void j(final apx apx, final String s, final String s2) {
        final apx apx2 = new apx("[]", s2, null);
        final apx apx3 = new apx("xml:lang", s, null);
        apx2.m(apx3);
        if (!"x-default".equals(apx3.b)) {
            apx.k(apx2);
            return;
        }
        apx.l(1, apx2);
    }
    
    public static void k(final apx apx) {
        final apx c = apx.c;
        if (apx.g().m()) {
            c.q(apx);
        }
        else {
            c.o(apx);
        }
        if (!c.s() && c.g().n()) {
            c.c.o(c);
        }
    }
    
    public static void l(final apx apx) {
        if (apx.g().i()) {
            int i = 2;
            while (i <= apx.a()) {
                final apx e = apx.e(i);
                if (e.t() && "x-default".equals(e.f(1).b)) {
                    try {
                        apx.j().remove(i - 1);
                        apx.n();
                        apx.l(1, e);
                    }
                    catch (final ape ape) {}
                    if (i == 2) {
                        apx.e(2).b = e.b;
                        return;
                    }
                    break;
                }
                else {
                    ++i;
                }
            }
        }
    }
    
    public static void m(final apu apu, final apx apx, final Node node, final boolean b) {
        final int o = o(node);
        if (o != 8 && o != 0) {
            throw new ape("Node element must be rdf:Description or typed node", 202);
        }
        if (b && o == 0) {
            throw new ape("Top level typed node not allowed", 203);
        }
        int i = 0;
        int n = 0;
        while (i < node.getAttributes().getLength()) {
            final Node item = node.getAttributes().item(i);
            int n2 = n;
            if (!"xmlns".equals(item.getPrefix())) {
                if (item.getPrefix() == null && "xmlns".equals(item.getNodeName())) {
                    n2 = n;
                }
                else {
                    final int o2 = o(item);
                    switch (o2) {
                        default: {
                            throw new ape("Invalid nodeElement attribute", 202);
                        }
                        case 2:
                        case 3:
                        case 6: {
                            if (n <= 0) {
                                if (b && o2 == 3) {
                                    final String a = apx.a;
                                    if (a != null && a.length() > 0) {
                                        if (apx.a.equals(item.getNodeValue())) {
                                            n2 = 1;
                                            break;
                                        }
                                        throw new ape("Mismatched top level rdf:about values", 203);
                                    }
                                    else {
                                        apx.a = item.getNodeValue();
                                    }
                                }
                                n2 = 1;
                                break;
                            }
                            throw new ape("Mutally exclusive about, ID, nodeID attributes", 202);
                        }
                        case 0: {
                            p(apu, apx, item, item.getNodeValue(), b);
                            n2 = n;
                            break;
                        }
                    }
                }
            }
            ++i;
            n = n2;
        }
        t(apu, apx, node, b);
    }
    
    public static boolean n(final Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        final String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); ++i) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    private static int o(final Node node) {
        final String localName = node.getLocalName();
        final String namespaceURI = node.getNamespaceURI();
        String s;
        if (namespaceURI == null && ("about".equals(localName) || "ID".equals(localName)) && node instanceof Attr && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr)node).getOwnerElement().getNamespaceURI())) {
            s = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        else {
            s = namespaceURI;
        }
        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(s)) {
            if ("li".equals(localName)) {
                return 9;
            }
            if ("parseType".equals(localName)) {
                return 4;
            }
            if ("Description".equals(localName)) {
                return 8;
            }
            if ("about".equals(localName)) {
                return 3;
            }
            if ("resource".equals(localName)) {
                return 5;
            }
            if ("RDF".equals(localName)) {
                return 1;
            }
            if ("ID".equals(localName)) {
                return 2;
            }
            if ("nodeID".equals(localName)) {
                return 6;
            }
            if ("datatype".equals(localName)) {
                return 7;
            }
            if ("aboutEach".equals(localName)) {
                return 10;
            }
            if ("aboutEachPrefix".equals(localName)) {
                return 11;
            }
            if ("bagID".equals(localName)) {
                return 12;
            }
        }
        return 0;
    }
    
    private static apx p(final apu apu, apx apx, final Node node, final String s, final boolean b) {
        final aqa a = aph.a;
        final String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            String s2 = namespaceURI;
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                s2 = "http://purl.org/dc/elements/1.1/";
            }
            String s3;
            if ((s3 = a.a(s2)) == null) {
                String prefix;
                if (node.getPrefix() != null) {
                    prefix = node.getPrefix();
                }
                else {
                    prefix = "_dflt";
                }
                s3 = a.c(s2, prefix);
            }
            final String value = String.valueOf(s3);
            final String value2 = String.valueOf(node.getLocalName());
            String concat;
            if (value2.length() != 0) {
                concat = value.concat(value2);
            }
            else {
                concat = new String(value);
            }
            final aqj aqj = new aqj();
            boolean h = false;
            if (b) {
                final apx h2 = h(apu.a, s2, "_dflt", true);
                h2.f = false;
                apx = h2;
                if (a.e(concat) != null) {
                    apu.a.g = true;
                    h2.g = true;
                    h = true;
                    apx = h2;
                }
            }
            final boolean equals = "rdf:li".equals(concat);
            final boolean equals2 = "rdf:value".equals(concat);
            final apx apx2 = new apx(concat, s, aqj);
            apx2.h = h;
            if (!equals2) {
                apx.k(apx2);
            }
            else {
                apx.l(1, apx2);
                if (b || !apx.g().o()) {
                    throw new ape("Misplaced rdf:value element", 202);
                }
                apx.i = true;
            }
            if (equals) {
                if (!apx.g().d()) {
                    throw new ape("Misplaced rdf:li element", 202);
                }
                apx2.a = "[]";
            }
            return apx2;
        }
        throw new ape("XML namespace required for all elements and attributes", 202);
    }
    
    private static void q(final apx apx) {
        int i = 1;
        final apx e = apx.e(1);
        if (e.g().c()) {
            if (apx.g().c()) {
                throw new ape("Redundant xml:lang for rdf:value element", 203);
            }
            final apx f = e.f(1);
            e.q(f);
            apx.m(f);
        }
        while (i <= e.b()) {
            apx.m(e.f(i));
            ++i;
        }
        for (int j = 2; j <= apx.a(); ++j) {
            apx.m(apx.e(j));
        }
        apx.i = false;
        apx.g().x(false);
        apx.g().b(e.g());
        apx.b = e.b;
        apx.p();
        final Iterator h = e.h();
        while (h.hasNext()) {
            apx.k((apx)h.next());
        }
    }
    
    private static void r(final apu apu, final apx apx, final Node node, final boolean b) {
        if (node.hasChildNodes()) {
            throw new ape("Nested content not allowed with rdf:resource or property attributes", 202);
        }
        Node node2 = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            final int length = node.getAttributes().getLength();
            boolean b2 = true;
            if (n >= length) {
                final String s = "";
                final apx p4 = p(apu, apx, node, "", b);
                if (n2 == 0 && n3 == 0) {
                    if (n5 != 0) {
                        p4.g().x(true);
                    }
                    else {
                        b2 = false;
                    }
                }
                else {
                    String nodeValue;
                    if (node2 != null) {
                        nodeValue = node2.getNodeValue();
                    }
                    else {
                        nodeValue = s;
                    }
                    p4.b = nodeValue;
                    if (n2 == 0) {
                        p4.g().f(2, true);
                        b2 = false;
                    }
                    else {
                        b2 = false;
                    }
                }
                for (int i = 0; i < node.getAttributes().getLength(); ++i) {
                    final Node item = node.getAttributes().item(i);
                    if (item != node2) {
                        if (!"xmlns".equals(item.getPrefix())) {
                            if (item.getPrefix() != null || !"xmlns".equals(item.getNodeName())) {
                                switch (o(item)) {
                                    default: {
                                        throw new ape("Unrecognized attribute of empty property element", 202);
                                    }
                                    case 5: {
                                        u(p4, "rdf:resource", item.getNodeValue());
                                        break;
                                    }
                                    case 2:
                                    case 6: {
                                        break;
                                    }
                                    case 0: {
                                        if (!b2) {
                                            u(p4, item.getNodeName(), item.getNodeValue());
                                            break;
                                        }
                                        if ("xml:lang".equals(item.getNodeName())) {
                                            u(p4, "xml:lang", item.getNodeValue());
                                            break;
                                        }
                                        p(apu, p4, item, item.getNodeValue(), false);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            final Node item2 = node.getAttributes().item(n);
            Node node3;
            int n6;
            int n7;
            int n8;
            int n9;
            if (!"xmlns".equals(item2.getPrefix())) {
                if (item2.getPrefix() == null && "xmlns".equals(item2.getNodeName())) {
                    node3 = node2;
                    n6 = n2;
                    n7 = n3;
                    n8 = n4;
                    n9 = n5;
                }
                else {
                    node3 = node2;
                    n6 = n2;
                    n7 = n3;
                    n8 = n4;
                    n9 = n5;
                    switch (o(item2)) {
                        default: {
                            throw new ape("Unrecognized attribute of empty property element", 202);
                        }
                        case 6: {
                            if (n3 == 0) {
                                n8 = 1;
                                node3 = node2;
                                n6 = n2;
                                n7 = n3;
                                n9 = n5;
                                break;
                            }
                            throw new ape("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        }
                        case 5: {
                            if (n4 != 0) {
                                throw new ape("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                            }
                            if (n2 == 0) {
                                node3 = item2;
                                n6 = 0;
                                n7 = 1;
                                n8 = n4;
                                n9 = n5;
                                break;
                            }
                            throw new ape("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                        case 0: {
                            if ("value".equals(item2.getLocalName()) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item2.getNamespaceURI())) {
                                if (n3 == 0) {
                                    node3 = item2;
                                    n6 = 1;
                                    n7 = n3;
                                    n8 = n4;
                                    n9 = n5;
                                    break;
                                }
                                throw new ape("Empty property element can't have both rdf:value and rdf:resource", 203);
                            }
                            else {
                                node3 = node2;
                                n6 = n2;
                                n7 = n3;
                                n8 = n4;
                                n9 = n5;
                                if (!"xml:lang".equals(item2.getNodeName())) {
                                    n9 = 1;
                                    node3 = node2;
                                    n6 = n2;
                                    n7 = n3;
                                    n8 = n4;
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        case 2: {
                            break;
                        }
                    }
                }
            }
            else {
                n9 = n5;
                n8 = n4;
                n7 = n3;
                n6 = n2;
                node3 = node2;
            }
            ++n;
            node2 = node3;
            n2 = n6;
            n3 = n7;
            n4 = n8;
            n5 = n9;
        }
    }
    
    private static void s(final apu apu, apx p4, final Node node, final boolean b) {
        p4 = p(apu, p4, node, null, b);
        final int n = 0;
        for (int i = 0; i < node.getAttributes().getLength(); ++i) {
            final Node item = node.getAttributes().item(i);
            if (!"xmlns".equals(item.getPrefix())) {
                if (item.getPrefix() != null || !"xmlns".equals(item.getNodeName())) {
                    final String namespaceURI = item.getNamespaceURI();
                    final String localName = item.getLocalName();
                    if (!"xml:lang".equals(item.getNodeName())) {
                        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                            if ("ID".equals(localName)) {
                                continue;
                            }
                            if ("datatype".equals(localName)) {
                                continue;
                            }
                        }
                        throw new ape("Invalid attribute for literal property element", 202);
                    }
                    u(p4, "xml:lang", item.getNodeValue());
                }
            }
        }
        String concat = "";
        for (int j = n; j < node.getChildNodes().getLength(); ++j) {
            final Node item2 = node.getChildNodes().item(j);
            if (item2.getNodeType() != 3) {
                throw new ape("Invalid child of literal property element", 202);
            }
            final String value = String.valueOf(concat);
            final String value2 = String.valueOf(item2.getNodeValue());
            if (value2.length() != 0) {
                concat = value.concat(value2);
            }
            else {
                concat = new String(value);
            }
        }
        p4.b = concat;
    }
    
    private static void t(final apu apu, final apx apx, final Node node, final boolean b) {
    Label_1554:
        for (int i = 0; i < node.getChildNodes().getLength(); ++i) {
            final Node item = node.getChildNodes().item(i);
            if (!n(item)) {
                if (item.getNodeType() != 1) {
                    throw new ape("Expected property element node not found", 202);
                }
                final int o = o(item);
                if (o == 8 || o >= 10 || (o > 0 && o <= 7)) {
                    throw new ape("Invalid property element name", 202);
                }
                final NamedNodeMap attributes = item.getAttributes();
                List list = null;
                List list2;
                for (int j = 0; j < attributes.getLength(); ++j, list = list2) {
                    final Node item2 = attributes.item(j);
                    if (!"xmlns".equals(item2.getPrefix())) {
                        list2 = list;
                        if (item2.getPrefix() != null) {
                            continue;
                        }
                        list2 = list;
                        if (!"xmlns".equals(item2.getNodeName())) {
                            continue;
                        }
                    }
                    if ((list2 = list) == null) {
                        list2 = new ArrayList();
                    }
                    list2.add(item2.getNodeName());
                }
                if (list != null) {
                    for (int size = list.size(), k = 0; k < size; ++k) {
                        attributes.removeNamedItem((String)list.get(k));
                    }
                }
                if (attributes.getLength() > 3) {
                    r(apu, apx, item, b);
                }
                else {
                    int l = 0;
                    while (l < attributes.getLength()) {
                        final Node item3 = attributes.item(l);
                        final String localName = item3.getLocalName();
                        final String namespaceURI = item3.getNamespaceURI();
                        final String nodeValue = item3.getNodeValue();
                        if ("xml:lang".equals(item3.getNodeName()) && (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI))) {
                            ++l;
                        }
                        else {
                            if ("datatype".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                                s(apu, apx, item, b);
                                continue Label_1554;
                            }
                            if (!"parseType".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                                r(apu, apx, item, b);
                                continue Label_1554;
                            }
                            if ("Literal".equals(nodeValue)) {
                                throw new ape("ParseTypeLiteral property element not allowed", 203);
                            }
                            if ("Resource".equals(nodeValue)) {
                                final apx p4 = p(apu, apx, item, "", b);
                                p4.g().x(true);
                                for (int n = 0; n < item.getAttributes().getLength(); ++n) {
                                    final Node item4 = item.getAttributes().item(n);
                                    if (!"xmlns".equals(item4.getPrefix())) {
                                        if (item4.getPrefix() != null || !"xmlns".equals(item4.getNodeName())) {
                                            final String localName2 = item4.getLocalName();
                                            final String namespaceURI2 = item4.getNamespaceURI();
                                            if (!"xml:lang".equals(item4.getNodeName())) {
                                                if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI2)) {
                                                    if ("ID".equals(localName2)) {
                                                        continue;
                                                    }
                                                    if ("parseType".equals(localName2)) {
                                                        continue;
                                                    }
                                                }
                                                throw new ape("Invalid attribute for ParseTypeResource property element", 202);
                                            }
                                            u(p4, "xml:lang", item4.getNodeValue());
                                        }
                                    }
                                }
                                t(apu, p4, item, false);
                                if (p4.i) {
                                    q(p4);
                                }
                                continue Label_1554;
                            }
                            else {
                                if ("Collection".equals(nodeValue)) {
                                    throw new ape("ParseTypeCollection property element not allowed", 203);
                                }
                                throw new ape("ParseTypeOther property element not allowed", 203);
                            }
                        }
                    }
                    if (item.hasChildNodes()) {
                        int n2 = 0;
                        while (n2 < item.getChildNodes().getLength()) {
                            if (item.getChildNodes().item(n2).getNodeType() != 3) {
                                if (b && "iX:changes".equals(item.getNodeName())) {
                                    continue Label_1554;
                                }
                                final apx p5 = p(apu, apx, item, "", b);
                                for (int n3 = 0; n3 < item.getAttributes().getLength(); ++n3) {
                                    final Node item5 = item.getAttributes().item(n3);
                                    if (!"xmlns".equals(item5.getPrefix())) {
                                        if (item5.getPrefix() != null || !"xmlns".equals(item5.getNodeName())) {
                                            final String localName3 = item5.getLocalName();
                                            final String namespaceURI3 = item5.getNamespaceURI();
                                            if ("xml:lang".equals(item5.getNodeName())) {
                                                u(p5, "xml:lang", item5.getNodeValue());
                                            }
                                            else if (!"ID".equals(localName3) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI3)) {
                                                throw new ape("Invalid attribute for resource property element", 202);
                                            }
                                        }
                                    }
                                }
                                int n4 = 0;
                                int n5 = 0;
                                while (n4 < item.getChildNodes().getLength()) {
                                    final Node item6 = item.getChildNodes().item(n4);
                                    Label_1501: {
                                        if (!n(item6)) {
                                            if (item6.getNodeType() == 1) {
                                                if (n5 == 0) {
                                                    final boolean equals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item6.getNamespaceURI());
                                                    final String localName4 = item6.getLocalName();
                                                    if (equals && "Bag".equals(localName4)) {
                                                        p5.g().q();
                                                    }
                                                    else if (equals && "Seq".equals(localName4)) {
                                                        final aqj g = p5.g();
                                                        g.q();
                                                        g.t();
                                                    }
                                                    else if (equals && "Alt".equals(localName4)) {
                                                        final aqj g2 = p5.g();
                                                        g2.q();
                                                        g2.t();
                                                        g2.s();
                                                    }
                                                    else {
                                                        p5.g().x(true);
                                                        if (!equals) {
                                                            if (!"Description".equals(localName4)) {
                                                                final String namespaceURI4 = item6.getNamespaceURI();
                                                                if (namespaceURI4 == null) {
                                                                    throw new ape("All XML elements must be in a namespace", 203);
                                                                }
                                                                final StringBuilder sb = new StringBuilder(namespaceURI4.length() + 1 + String.valueOf(localName4).length());
                                                                sb.append(namespaceURI4);
                                                                sb.append(':');
                                                                sb.append(localName4);
                                                                u(p5, "rdf:type", sb.toString());
                                                            }
                                                        }
                                                    }
                                                    m(apu, p5, item6, false);
                                                    if (p5.i) {
                                                        q(p5);
                                                        n5 = 1;
                                                        break Label_1501;
                                                    }
                                                    if (p5.g().j() && p5.g().j() && p5.s()) {
                                                        final Iterator h = p5.h();
                                                        while (h.hasNext()) {
                                                            if (((apx)h.next()).g().c()) {
                                                                p5.g().r();
                                                                l(p5);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    n5 = 1;
                                                    break Label_1501;
                                                }
                                            }
                                            else if (n5 == 0) {
                                                throw new ape("Children of resource property element must be XML elements", 202);
                                            }
                                            throw new ape("Invalid child of resource property element", 202);
                                        }
                                    }
                                    ++n4;
                                }
                                if (n5 != 0) {
                                    continue Label_1554;
                                }
                                throw new ape("Missing child of resource property element", 202);
                            }
                            else {
                                ++n2;
                            }
                        }
                        s(apu, apx, item, b);
                    }
                    else {
                        r(apu, apx, item, b);
                    }
                }
            }
        }
    }
    
    private static void u(final apx apx, final String s, final String s2) {
        String a = s2;
        if ("xml:lang".equals(s)) {
            a = apn.a(s2);
        }
        apx.m(new apx(s, a, null));
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c(final int[] array) {
        return false;
    }
}
