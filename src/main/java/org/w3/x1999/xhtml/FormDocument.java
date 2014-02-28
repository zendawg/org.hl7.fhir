/*
 * An XML document type.
 * Localname: form
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.FormDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml;


/**
 * A document containing one form(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public interface FormDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("formb973doctype");
    
    /**
     * Gets the "form" element
     */
    org.w3.x1999.xhtml.FormDocument.Form getForm();
    
    /**
     * Sets the "form" element
     */
    void setForm(org.w3.x1999.xhtml.FormDocument.Form form);
    
    /**
     * Appends and returns a new empty "form" element
     */
    org.w3.x1999.xhtml.FormDocument.Form addNewForm();
    
    /**
     * An XML form(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public interface Form extends org.w3.x1999.xhtml.FormContent
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Form.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("form92d3elemtype");
        
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
        org.w3.x1999.xhtml.FormDocument.Form.Dir.Enum getDir();
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        org.w3.x1999.xhtml.FormDocument.Form.Dir xgetDir();
        
        /**
         * True if has "dir" attribute
         */
        boolean isSetDir();
        
        /**
         * Sets the "dir" attribute
         */
        void setDir(org.w3.x1999.xhtml.FormDocument.Form.Dir.Enum dir);
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        void xsetDir(org.w3.x1999.xhtml.FormDocument.Form.Dir dir);
        
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
         * Gets the "action" attribute
         */
        java.lang.String getAction();
        
        /**
         * Gets (as xml) the "action" attribute
         */
        org.w3.x1999.xhtml.URI xgetAction();
        
        /**
         * Sets the "action" attribute
         */
        void setAction(java.lang.String action);
        
        /**
         * Sets (as xml) the "action" attribute
         */
        void xsetAction(org.w3.x1999.xhtml.URI action);
        
        /**
         * Gets the "method" attribute
         */
        org.w3.x1999.xhtml.FormDocument.Form.Method.Enum getMethod();
        
        /**
         * Gets (as xml) the "method" attribute
         */
        org.w3.x1999.xhtml.FormDocument.Form.Method xgetMethod();
        
        /**
         * True if has "method" attribute
         */
        boolean isSetMethod();
        
        /**
         * Sets the "method" attribute
         */
        void setMethod(org.w3.x1999.xhtml.FormDocument.Form.Method.Enum method);
        
        /**
         * Sets (as xml) the "method" attribute
         */
        void xsetMethod(org.w3.x1999.xhtml.FormDocument.Form.Method method);
        
        /**
         * Unsets the "method" attribute
         */
        void unsetMethod();
        
        /**
         * Gets the "enctype" attribute
         */
        java.lang.String getEnctype();
        
        /**
         * Gets (as xml) the "enctype" attribute
         */
        org.w3.x1999.xhtml.ContentType xgetEnctype();
        
        /**
         * True if has "enctype" attribute
         */
        boolean isSetEnctype();
        
        /**
         * Sets the "enctype" attribute
         */
        void setEnctype(java.lang.String enctype);
        
        /**
         * Sets (as xml) the "enctype" attribute
         */
        void xsetEnctype(org.w3.x1999.xhtml.ContentType enctype);
        
        /**
         * Unsets the "enctype" attribute
         */
        void unsetEnctype();
        
        /**
         * Gets the "onsubmit" attribute
         */
        java.lang.String getOnsubmit();
        
        /**
         * Gets (as xml) the "onsubmit" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnsubmit();
        
        /**
         * True if has "onsubmit" attribute
         */
        boolean isSetOnsubmit();
        
        /**
         * Sets the "onsubmit" attribute
         */
        void setOnsubmit(java.lang.String onsubmit);
        
        /**
         * Sets (as xml) the "onsubmit" attribute
         */
        void xsetOnsubmit(org.w3.x1999.xhtml.Script onsubmit);
        
        /**
         * Unsets the "onsubmit" attribute
         */
        void unsetOnsubmit();
        
        /**
         * Gets the "onreset" attribute
         */
        java.lang.String getOnreset();
        
        /**
         * Gets (as xml) the "onreset" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnreset();
        
        /**
         * True if has "onreset" attribute
         */
        boolean isSetOnreset();
        
        /**
         * Sets the "onreset" attribute
         */
        void setOnreset(java.lang.String onreset);
        
        /**
         * Sets (as xml) the "onreset" attribute
         */
        void xsetOnreset(org.w3.x1999.xhtml.Script onreset);
        
        /**
         * Unsets the "onreset" attribute
         */
        void unsetOnreset();
        
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
         * Gets the "accept-charset" attribute
         */
        java.lang.String getAcceptCharset();
        
        /**
         * Gets (as xml) the "accept-charset" attribute
         */
        org.w3.x1999.xhtml.Charsets xgetAcceptCharset();
        
        /**
         * True if has "accept-charset" attribute
         */
        boolean isSetAcceptCharset();
        
        /**
         * Sets the "accept-charset" attribute
         */
        void setAcceptCharset(java.lang.String acceptCharset);
        
        /**
         * Sets (as xml) the "accept-charset" attribute
         */
        void xsetAcceptCharset(org.w3.x1999.xhtml.Charsets acceptCharset);
        
        /**
         * Unsets the "accept-charset" attribute
         */
        void unsetAcceptCharset();
        
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.FormDocument$Form$Dir.
         */
        public interface Dir extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("dir74beattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LTR = Enum.forString("ltr");
            static final Enum RTL = Enum.forString("rtl");
            
            static final int INT_LTR = Enum.INT_LTR;
            static final int INT_RTL = Enum.INT_RTL;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.FormDocument$Form$Dir.
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
                public static org.w3.x1999.xhtml.FormDocument.Form.Dir newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.FormDocument.Form.Dir) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.FormDocument.Form.Dir newInstance() {
                  return (org.w3.x1999.xhtml.FormDocument.Form.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.FormDocument.Form.Dir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.FormDocument.Form.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML method(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.FormDocument$Form$Method.
         */
        public interface Method extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Method.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("method2832attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum GET = Enum.forString("get");
            static final Enum POST = Enum.forString("post");
            
            static final int INT_GET = Enum.INT_GET;
            static final int INT_POST = Enum.INT_POST;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.FormDocument$Form$Method.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_GET
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
                
                static final int INT_GET = 1;
                static final int INT_POST = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("get", INT_GET),
                      new Enum("post", INT_POST),
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
                public static org.w3.x1999.xhtml.FormDocument.Form.Method newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.FormDocument.Form.Method) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.FormDocument.Form.Method newInstance() {
                  return (org.w3.x1999.xhtml.FormDocument.Form.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.FormDocument.Form.Method newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.FormDocument.Form.Method) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x1999.xhtml.FormDocument.Form newInstance() {
              return (org.w3.x1999.xhtml.FormDocument.Form) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x1999.xhtml.FormDocument.Form newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x1999.xhtml.FormDocument.Form) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xhtml.FormDocument newInstance() {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xhtml.FormDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xhtml.FormDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xhtml.FormDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.FormDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.FormDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
