package com.yin.springboot.weixin.pay.entity.xml;

import com.thoughtworks.xstream.converters.basic.StringConverter;

public class XStreamCDataConverter extends StringConverter {
    public XStreamCDataConverter() {
    }

    public String toString(Object obj) {
        return "<![CDATA[" + super.toString(obj) + "]]>";
    }
}