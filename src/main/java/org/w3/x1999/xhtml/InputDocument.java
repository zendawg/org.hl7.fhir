/*
 * An XML document type.
 * Localname: input
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.InputDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml;


/**
 * A document containing one input(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public interface InputDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InputDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("input53bfdoctype");
    
    /**
     * Gets the "input" element
     */
    org.w3.x1999.xhtml.InputDocument.Input getInput();
    
    /**
     * Sets the "input" element
     */
    void setInput(org.w3.x1999.xhtml.InputDocument.Input input);
    
    /**
     * Appends and returns a new empty "input" element
     */
    org.w3.x1999.xhtml.InputDocument.Input addNewInput();
    
    /**
     * An XML input(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public interface Input extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Input.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("input2f49elemtype");
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "class" attribute
         */
        java.util.List getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.apache.xmlbeans.XmlNMTOKENS xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.util.List class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.apache.xmlbeans.XmlNMTOKENS class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "style" attribute
         */
        java.lang.String getStyle();
        
        /**
         * Gets (as xml) the "style" attribute
         */
        org.w3.x1999.xhtml.StyleSheet xgetStyle();
        
        /**
         * True if has "style" attribute
         */
        boolean isSetStyle();
        
        /**
         * Sets the "style" attribute
         */
        void setStyle(java.lang.String style);
        
        /**
         * Sets (as xml) the "style" attribute
         */
        void xsetStyle(org.w3.x1999.xhtml.StyleSheet style);
        
        /**
         * Unsets the "style" attribute
         */
        void unsetStyle();
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.w3.x1999.xhtml.Text xgetTitle();
        
        /**
         * True if has "title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.w3.x1999.xhtml.Text title);
        
        /**
         * Unsets the "title" attribute
         */
        void unsetTitle();
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.w3.x1999.xhtml.LanguageCode xgetLang();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.w3.x1999.xhtml.LanguageCode lang);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang2();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.XmlLanguage xgetLang2();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang2();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang2(java.lang.String lang2);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang2(org.apache.xmlbeans.XmlLanguage lang2);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang2();
        
        /**
         * Gets the "dir" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Dir.Enum getDir();
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Dir xgetDir();
        
        /**
         * True if has "dir" attribute
         */
        boolean isSetDir();
        
        /**
         * Sets the "dir" attribute
         */
        void setDir(org.w3.x1999.xhtml.InputDocument.Input.Dir.Enum dir);
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        void xsetDir(org.w3.x1999.xhtml.InputDocument.Input.Dir dir);
        
        /**
         * Unsets the "dir" attribute
         */
        void unsetDir();
        
        /**
         * Gets the "onclick" attribute
         */
        java.lang.String getOnclick();
        
        /**
         * Gets (as xml) the "onclick" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnclick();
        
        /**
         * True if has "onclick" attribute
         */
        boolean isSetOnclick();
        
        /**
         * Sets the "onclick" attribute
         */
        void setOnclick(java.lang.String onclick);
        
        /**
         * Sets (as xml) the "onclick" attribute
         */
        void xsetOnclick(org.w3.x1999.xhtml.Script onclick);
        
        /**
         * Unsets the "onclick" attribute
         */
        void unsetOnclick();
        
        /**
         * Gets the "ondblclick" attribute
         */
        java.lang.String getOndblclick();
        
        /**
         * Gets (as xml) the "ondblclick" attribute
         */
        org.w3.x1999.xhtml.Script xgetOndblclick();
        
        /**
         * True if has "ondblclick" attribute
         */
        boolean isSetOndblclick();
        
        /**
         * Sets the "ondblclick" attribute
         */
        void setOndblclick(java.lang.String ondblclick);
        
        /**
         * Sets (as xml) the "ondblclick" attribute
         */
        void xsetOndblclick(org.w3.x1999.xhtml.Script ondblclick);
        
        /**
         * Unsets the "ondblclick" attribute
         */
        void unsetOndblclick();
        
        /**
         * Gets the "onmousedown" attribute
         */
        java.lang.String getOnmousedown();
        
        /**
         * Gets (as xml) the "onmousedown" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmousedown();
        
        /**
         * True if has "onmousedown" attribute
         */
        boolean isSetOnmousedown();
        
        /**
         * Sets the "onmousedown" attribute
         */
        void setOnmousedown(java.lang.String onmousedown);
        
        /**
         * Sets (as xml) the "onmousedown" attribute
         */
        void xsetOnmousedown(org.w3.x1999.xhtml.Script onmousedown);
        
        /**
         * Unsets the "onmousedown" attribute
         */
        void unsetOnmousedown();
        
        /**
         * Gets the "onmouseup" attribute
         */
        java.lang.String getOnmouseup();
        
        /**
         * Gets (as xml) the "onmouseup" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseup();
        
        /**
         * True if has "onmouseup" attribute
         */
        boolean isSetOnmouseup();
        
        /**
         * Sets the "onmouseup" attribute
         */
        void setOnmouseup(java.lang.String onmouseup);
        
        /**
         * Sets (as xml) the "onmouseup" attribute
         */
        void xsetOnmouseup(org.w3.x1999.xhtml.Script onmouseup);
        
        /**
         * Unsets the "onmouseup" attribute
         */
        void unsetOnmouseup();
        
        /**
         * Gets the "onmouseover" attribute
         */
        java.lang.String getOnmouseover();
        
        /**
         * Gets (as xml) the "onmouseover" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseover();
        
        /**
         * True if has "onmouseover" attribute
         */
        boolean isSetOnmouseover();
        
        /**
         * Sets the "onmouseover" attribute
         */
        void setOnmouseover(java.lang.String onmouseover);
        
        /**
         * Sets (as xml) the "onmouseover" attribute
         */
        void xsetOnmouseover(org.w3.x1999.xhtml.Script onmouseover);
        
        /**
         * Unsets the "onmouseover" attribute
         */
        void unsetOnmouseover();
        
        /**
         * Gets the "onmousemove" attribute
         */
        java.lang.String getOnmousemove();
        
        /**
         * Gets (as xml) the "onmousemove" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmousemove();
        
        /**
         * True if has "onmousemove" attribute
         */
        boolean isSetOnmousemove();
        
        /**
         * Sets the "onmousemove" attribute
         */
        void setOnmousemove(java.lang.String onmousemove);
        
        /**
         * Sets (as xml) the "onmousemove" attribute
         */
        void xsetOnmousemove(org.w3.x1999.xhtml.Script onmousemove);
        
        /**
         * Unsets the "onmousemove" attribute
         */
        void unsetOnmousemove();
        
        /**
         * Gets the "onmouseout" attribute
         */
        java.lang.String getOnmouseout();
        
        /**
         * Gets (as xml) the "onmouseout" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseout();
        
        /**
         * True if has "onmouseout" attribute
         */
        boolean isSetOnmouseout();
        
        /**
         * Sets the "onmouseout" attribute
         */
        void setOnmouseout(java.lang.String onmouseout);
        
        /**
         * Sets (as xml) the "onmouseout" attribute
         */
        void xsetOnmouseout(org.w3.x1999.xhtml.Script onmouseout);
        
        /**
         * Unsets the "onmouseout" attribute
         */
        void unsetOnmouseout();
        
        /**
         * Gets the "onkeypress" attribute
         */
        java.lang.String getOnkeypress();
        
        /**
         * Gets (as xml) the "onkeypress" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeypress();
        
        /**
         * True if has "onkeypress" attribute
         */
        boolean isSetOnkeypress();
        
        /**
         * Sets the "onkeypress" attribute
         */
        void setOnkeypress(java.lang.String onkeypress);
        
        /**
         * Sets (as xml) the "onkeypress" attribute
         */
        void xsetOnkeypress(org.w3.x1999.xhtml.Script onkeypress);
        
        /**
         * Unsets the "onkeypress" attribute
         */
        void unsetOnkeypress();
        
        /**
         * Gets the "onkeydown" attribute
         */
        java.lang.String getOnkeydown();
        
        /**
         * Gets (as xml) the "onkeydown" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeydown();
        
        /**
         * True if has "onkeydown" attribute
         */
        boolean isSetOnkeydown();
        
        /**
         * Sets the "onkeydown" attribute
         */
        void setOnkeydown(java.lang.String onkeydown);
        
        /**
         * Sets (as xml) the "onkeydown" attribute
         */
        void xsetOnkeydown(org.w3.x1999.xhtml.Script onkeydown);
        
        /**
         * Unsets the "onkeydown" attribute
         */
        void unsetOnkeydown();
        
        /**
         * Gets the "onkeyup" attribute
         */
        java.lang.String getOnkeyup();
        
        /**
         * Gets (as xml) the "onkeyup" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeyup();
        
        /**
         * True if has "onkeyup" attribute
         */
        boolean isSetOnkeyup();
        
        /**
         * Sets the "onkeyup" attribute
         */
        void setOnkeyup(java.lang.String onkeyup);
        
        /**
         * Sets (as xml) the "onkeyup" attribute
         */
        void xsetOnkeyup(org.w3.x1999.xhtml.Script onkeyup);
        
        /**
         * Unsets the "onkeyup" attribute
         */
        void unsetOnkeyup();
        
        /**
         * Gets the "accesskey" attribute
         */
        java.lang.String getAccesskey();
        
        /**
         * Gets (as xml) the "accesskey" attribute
         */
        org.w3.x1999.xhtml.Character xgetAccesskey();
        
        /**
         * True if has "accesskey" attribute
         */
        boolean isSetAccesskey();
        
        /**
         * Sets the "accesskey" attribute
         */
        void setAccesskey(java.lang.String accesskey);
        
        /**
         * Sets (as xml) the "accesskey" attribute
         */
        void xsetAccesskey(org.w3.x1999.xhtml.Character accesskey);
        
        /**
         * Unsets the "accesskey" attribute
         */
        void unsetAccesskey();
        
        /**
         * Gets the "tabindex" attribute
         */
        int getTabindex();
        
        /**
         * Gets (as xml) the "tabindex" attribute
         */
        org.w3.x1999.xhtml.TabindexNumber xgetTabindex();
        
        /**
         * True if has "tabindex" attribute
         */
        boolean isSetTabindex();
        
        /**
         * Sets the "tabindex" attribute
         */
        void setTabindex(int tabindex);
        
        /**
         * Sets (as xml) the "tabindex" attribute
         */
        void xsetTabindex(org.w3.x1999.xhtml.TabindexNumber tabindex);
        
        /**
         * Unsets the "tabindex" attribute
         */
        void unsetTabindex();
        
        /**
         * Gets the "onfocus" attribute
         */
        java.lang.String getOnfocus();
        
        /**
         * Gets (as xml) the "onfocus" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnfocus();
        
        /**
         * True if has "onfocus" attribute
         */
        boolean isSetOnfocus();
        
        /**
         * Sets the "onfocus" attribute
         */
        void setOnfocus(java.lang.String onfocus);
        
        /**
         * Sets (as xml) the "onfocus" attribute
         */
        void xsetOnfocus(org.w3.x1999.xhtml.Script onfocus);
        
        /**
         * Unsets the "onfocus" attribute
         */
        void unsetOnfocus();
        
        /**
         * Gets the "onblur" attribute
         */
        java.lang.String getOnblur();
        
        /**
         * Gets (as xml) the "onblur" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnblur();
        
        /**
         * True if has "onblur" attribute
         */
        boolean isSetOnblur();
        
        /**
         * Sets the "onblur" attribute
         */
        void setOnblur(java.lang.String onblur);
        
        /**
         * Sets (as xml) the "onblur" attribute
         */
        void xsetOnblur(org.w3.x1999.xhtml.Script onblur);
        
        /**
         * Unsets the "onblur" attribute
         */
        void unsetOnblur();
        
        /**
         * Gets the "type" attribute
         */
        org.w3.x1999.xhtml.InputType.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.w3.x1999.xhtml.InputType xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(org.w3.x1999.xhtml.InputType.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.w3.x1999.xhtml.InputType type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "name" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(org.apache.xmlbeans.XmlAnySimpleType name);
        
        /**
         * Appends and returns a new empty "name" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewName();
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * Gets the "value" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(org.apache.xmlbeans.XmlAnySimpleType value);
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewValue();
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * Gets the "checked" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Checked.Enum getChecked();
        
        /**
         * Gets (as xml) the "checked" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Checked xgetChecked();
        
        /**
         * True if has "checked" attribute
         */
        boolean isSetChecked();
        
        /**
         * Sets the "checked" attribute
         */
        void setChecked(org.w3.x1999.xhtml.InputDocument.Input.Checked.Enum checked);
        
        /**
         * Sets (as xml) the "checked" attribute
         */
        void xsetChecked(org.w3.x1999.xhtml.InputDocument.Input.Checked checked);
        
        /**
         * Unsets the "checked" attribute
         */
        void unsetChecked();
        
        /**
         * Gets the "disabled" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Disabled.Enum getDisabled();
        
        /**
         * Gets (as xml) the "disabled" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Disabled xgetDisabled();
        
        /**
         * True if has "disabled" attribute
         */
        boolean isSetDisabled();
        
        /**
         * Sets the "disabled" attribute
         */
        void setDisabled(org.w3.x1999.xhtml.InputDocument.Input.Disabled.Enum disabled);
        
        /**
         * Sets (as xml) the "disabled" attribute
         */
        void xsetDisabled(org.w3.x1999.xhtml.InputDocument.Input.Disabled disabled);
        
        /**
         * Unsets the "disabled" attribute
         */
        void unsetDisabled();
        
        /**
         * Gets the "readonly" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Readonly.Enum getReadonly();
        
        /**
         * Gets (as xml) the "readonly" attribute
         */
        org.w3.x1999.xhtml.InputDocument.Input.Readonly xgetReadonly();
        
        /**
         * True if has "readonly" attribute
         */
        boolean isSetReadonly();
        
        /**
         * Sets the "readonly" attribute
         */
        void setReadonly(org.w3.x1999.xhtml.InputDocument.Input.Readonly.Enum readonly);
        
        /**
         * Sets (as xml) the "readonly" attribute
         */
        void xsetReadonly(org.w3.x1999.xhtml.InputDocument.Input.Readonly readonly);
        
        /**
         * Unsets the "readonly" attribute
         */
        void unsetReadonly();
        
        /**
         * Gets the "size" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getSize();
        
        /**
         * True if has "size" attribute
         */
        boolean isSetSize();
        
        /**
         * Sets the "size" attribute
         */
        void setSize(org.apache.xmlbeans.XmlAnySimpleType size);
        
        /**
         * Appends and returns a new empty "size" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewSize();
        
        /**
         * Unsets the "size" attribute
         */
        void unsetSize();
        
        /**
         * Gets the "maxlength" attribute
         */
        java.math.BigInteger getMaxlength();
        
        /**
         * Gets (as xml) the "maxlength" attribute
         */
        org.w3.x1999.xhtml.Number xgetMaxlength();
        
        /**
         * True if has "maxlength" attribute
         */
        boolean isSetMaxlength();
        
        /**
         * Sets the "maxlength" attribute
         */
        void setMaxlength(java.math.BigInteger maxlength);
        
        /**
         * Sets (as xml) the "maxlength" attribute
         */
        void xsetMaxlength(org.w3.x1999.xhtml.Number maxlength);
        
        /**
         * Unsets the "maxlength" attribute
         */
        void unsetMaxlength();
        
        /**
         * Gets the "src" attribute
         */
        java.lang.String getSrc();
        
        /**
         * Gets (as xml) the "src" attribute
         */
        org.w3.x1999.xhtml.URI xgetSrc();
        
        /**
         * True if has "src" attribute
         */
        boolean isSetSrc();
        
        /**
         * Sets the "src" attribute
         */
        void setSrc(java.lang.String src);
        
        /**
         * Sets (as xml) the "src" attribute
         */
        void xsetSrc(org.w3.x1999.xhtml.URI src);
        
        /**
         * Unsets the "src" attribute
         */
        void unsetSrc();
        
        /**
         * Gets the "alt" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getAlt();
        
        /**
         * True if has "alt" attribute
         */
        boolean isSetAlt();
        
        /**
         * Sets the "alt" attribute
         */
        void setAlt(org.apache.xmlbeans.XmlAnySimpleType alt);
        
        /**
         * Appends and returns a new empty "alt" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewAlt();
        
        /**
         * Unsets the "alt" attribute
         */
        void unsetAlt();
        
        /**
         * Gets the "usemap" attribute
         */
        java.lang.String getUsemap();
        
        /**
         * Gets (as xml) the "usemap" attribute
         */
        org.w3.x1999.xhtml.URI xgetUsemap();
        
        /**
         * True if has "usemap" attribute
         */
        boolean isSetUsemap();
        
        /**
         * Sets the "usemap" attribute
         */
        void setUsemap(java.lang.String usemap);
        
        /**
         * Sets (as xml) the "usemap" attribute
         */
        void xsetUsemap(org.w3.x1999.xhtml.URI usemap);
        
        /**
         * Unsets the "usemap" attribute
         */
        void unsetUsemap();
        
        /**
         * Gets the "onselect" attribute
         */
        java.lang.String getOnselect();
        
        /**
         * Gets (as xml) the "onselect" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnselect();
        
        /**
         * True if has "onselect" attribute
         */
        boolean isSetOnselect();
        
        /**
         * Sets the "onselect" attribute
         */
        void setOnselect(java.lang.String onselect);
        
        /**
         * Sets (as xml) the "onselect" attribute
         */
        void xsetOnselect(org.w3.x1999.xhtml.Script onselect);
        
        /**
         * Unsets the "onselect" attribute
         */
        void unsetOnselect();
        
        /**
         * Gets the "onchange" attribute
         */
        java.lang.String getOnchange();
        
        /**
         * Gets (as xml) the "onchange" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnchange();
        
        /**
         * True if has "onchange" attribute
         */
        boolean isSetOnchange();
        
        /**
         * Sets the "onchange" attribute
         */
        void setOnchange(java.lang.String onchange);
        
        /**
         * Sets (as xml) the "onchange" attribute
         */
        void xsetOnchange(org.w3.x1999.xhtml.Script onchange);
        
        /**
         * Unsets the "onchange" attribute
         */
        void unsetOnchange();
        
        /**
         * Gets the "accept" attribute
         */
        java.lang.String getAccept();
        
        /**
         * Gets (as xml) the "accept" attribute
         */
        org.w3.x1999.xhtml.ContentTypes xgetAccept();
        
        /**
         * True if has "accept" attribute
         */
        boolean isSetAccept();
        
        /**
         * Sets the "accept" attribute
         */
        void setAccept(java.lang.String accept);
        
        /**
         * Sets (as xml) the "accept" attribute
         */
        void xsetAccept(org.w3.x1999.xhtml.ContentTypes accept);
        
        /**
         * Unsets the "accept" attribute
         */
        void unsetAccept();
        
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.InputDocument$Input$Dir.
         */
        public interface Dir extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("dir4274attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LTR = Enum.forString("ltr");
            static final Enum RTL = Enum.forString("rtl");
            
            static final int INT_LTR = Enum.INT_LTR;
            static final int INT_RTL = Enum.INT_RTL;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.InputDocument$Input$Dir.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LTR
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_LTR = 1;
                static final int INT_RTL = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("ltr", INT_LTR),
                      new Enum("rtl", INT_RTL),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x1999.xhtml.InputDocument.Input.Dir newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Dir) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Dir newInstance() {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Dir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML checked(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.InputDocument$Input$Checked.
         */
        public interface Checked extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Checked.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("checkedcb9aattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum CHECKED = Enum.forString("checked");
            
            static final int INT_CHECKED = Enum.INT_CHECKED;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.InputDocument$Input$Checked.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CHECKED
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_CHECKED = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("checked", INT_CHECKED),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x1999.xhtml.InputDocument.Input.Checked newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Checked) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Checked newInstance() {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Checked) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Checked newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Checked) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML disabled(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.InputDocument$Input$Disabled.
         */
        public interface Disabled extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Disabled.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("disabledd62dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum DISABLED = Enum.forString("disabled");
            
            static final int INT_DISABLED = Enum.INT_DISABLED;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.InputDocument$Input$Disabled.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_DISABLED
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_DISABLED = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("disabled", INT_DISABLED),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x1999.xhtml.InputDocument.Input.Disabled newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Disabled) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Disabled newInstance() {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Disabled) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Disabled newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Disabled) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML readonly(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.InputDocument$Input$Readonly.
         */
        public interface Readonly extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Readonly.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("readonlybc27attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum READONLY = Enum.forString("readonly");
            
            static final int INT_READONLY = Enum.INT_READONLY;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.InputDocument$Input$Readonly.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_READONLY
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_READONLY = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("readonly", INT_READONLY),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x1999.xhtml.InputDocument.Input.Readonly newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Readonly) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Readonly newInstance() {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Readonly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.InputDocument.Input.Readonly newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.InputDocument.Input.Readonly) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x1999.xhtml.InputDocument.Input newInstance() {
              return (org.w3.x1999.xhtml.InputDocument.Input) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x1999.xhtml.InputDocument.Input newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x1999.xhtml.InputDocument.Input) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xhtml.InputDocument newInstance() {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xhtml.InputDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xhtml.InputDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xhtml.InputDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.InputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.InputDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.InputDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
