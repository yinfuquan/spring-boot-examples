package com.yin.springboot.weixin.pay.entity.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
import java.io.Writer;
public class XStreamInitializer {
    private static final XppDriver XPP_DRIVER = new XppDriver() {
        public HierarchicalStreamWriter createWriter(Writer out) {
            return new PrettyPrintWriter(out, this.getNameCoder()) {
                private static final String PREFIX_CDATA = "<![CDATA[";
                private static final String SUFFIX_CDATA = "]]>";
                private static final String PREFIX_MEDIA_ID = "<MediaId>";
                private static final String SUFFIX_MEDIA_ID = "</MediaId>";

                protected void writeText(QuickWriter writer, String text) {
                    if (text.startsWith("<![CDATA[") && text.endsWith("]]>")) {
                        writer.write(text);
                    } else if (text.startsWith("<MediaId>") && text.endsWith("</MediaId>")) {
                        writer.write(text);
                    } else {
                        super.writeText(writer, text);
                    }

                }

                public String encodeNode(String name) {
                    return name;
                }
            };
        }
    };

    public XStreamInitializer() {
    }

    public static XStream getInstance() {
        XStream xstream = new XStream(new PureJavaReflectionProvider(), XPP_DRIVER);
        xstream.ignoreUnknownElements();
        xstream.setMode(1001);
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypesByWildcard(new String[]{"me.chanjar.weixin.**", "cn.binarywang.wx.**", "com.github.binarywang.**"});
        xstream.setClassLoader(Thread.currentThread().getContextClassLoader());
        return xstream;
    }
}
