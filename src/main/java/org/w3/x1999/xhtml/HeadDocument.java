/*
 * An XML document type.
 * Localname: head
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.HeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml;


/**
 * A document containing one head(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public interface HeadDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeadDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("head5dd7doctype");
    
    /**
     * Gets the "head" element
     */
    org.w3.x1999.xhtml.HeadDocument.Head getHead();
    
    /**
     * Sets the "head" element
     */
    void setHead(org.w3.x1999.xhtml.HeadDocument.Head head);
    
    /**
     * Appends and returns a new empty "head" element
     */
    org.w3.x1999.xhtml.HeadDocument.Head addNewHead();
    
    /**
     * An XML head(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public interface Head extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Head.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("head9a53elemtype");
        
        /**
         * Gets array of all "script" elements
         */
        org.w3.x1999.xhtml.ScriptDocument.Script[] getScriptArray();
        
        /**
         * Gets ith "script" element
         */
        org.w3.x1999.xhtml.ScriptDocument.Script getScriptArray(int i);
        
        /**
         * Returns number of "script" element
         */
        int sizeOfScriptArray();
        
        /**
         * Sets array of all "script" element
         */
        void setScriptArray(org.w3.x1999.xhtml.ScriptDocument.Script[] scriptArray);
        
        /**
         * Sets ith "script" element
         */
        void setScriptArray(int i, org.w3.x1999.xhtml.ScriptDocument.Script script);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "script" element
         */
        org.w3.x1999.xhtml.ScriptDocument.Script insertNewScript(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "script" element
         */
        org.w3.x1999.xhtml.ScriptDocument.Script addNewScript();
        
        /**
         * Removes the ith "script" element
         */
        void removeScript(int i);
        
        /**
         * Gets array of all "style" elements
         */
        org.w3.x1999.xhtml.StyleDocument.Style[] getStyleArray();
        
        /**
         * Gets ith "style" element
         */
        org.w3.x1999.xhtml.StyleDocument.Style getStyleArray(int i);
        
        /**
         * Returns number of "style" element
         */
        int sizeOfStyleArray();
        
        /**
         * Sets array of all "style" element
         */
        void setStyleArray(org.w3.x1999.xhtml.StyleDocument.Style[] styleArray);
        
        /**
         * Sets ith "style" element
         */
        void setStyleArray(int i, org.w3.x1999.xhtml.StyleDocument.Style style);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "style" element
         */
        org.w3.x1999.xhtml.StyleDocument.Style insertNewStyle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "style" element
         */
        org.w3.x1999.xhtml.StyleDocument.Style addNewStyle();
        
        /**
         * Removes the ith "style" element
         */
        void removeStyle(int i);
        
        /**
         * Gets array of all "meta" elements
         */
        org.w3.x1999.xhtml.MetaDocument.Meta[] getMetaArray();
        
        /**
         * Gets ith "meta" element
         */
        org.w3.x1999.xhtml.MetaDocument.Meta getMetaArray(int i);
        
        /**
         * Returns number of "meta" element
         */
        int sizeOfMetaArray();
        
        /**
         * Sets array of all "meta" element
         */
        void setMetaArray(org.w3.x1999.xhtml.MetaDocument.Meta[] metaArray);
        
        /**
         * Sets ith "meta" element
         */
        void setMetaArray(int i, org.w3.x1999.xhtml.MetaDocument.Meta meta);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "meta" element
         */
        org.w3.x1999.xhtml.MetaDocument.Meta insertNewMeta(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "meta" element
         */
        org.w3.x1999.xhtml.MetaDocument.Meta addNewMeta();
        
        /**
         * Removes the ith "meta" element
         */
        void removeMeta(int i);
        
        /**
         * Gets array of all "link" elements
         */
        org.w3.x1999.xhtml.LinkDocument.Link[] getLinkArray();
        
        /**
         * Gets ith "link" element
         */
        org.w3.x1999.xhtml.LinkDocument.Link getLinkArray(int i);
        
        /**
         * Returns number of "link" element
         */
        int sizeOfLinkArray();
        
        /**
         * Sets array of all "link" element
         */
        void setLinkArray(org.w3.x1999.xhtml.LinkDocument.Link[] linkArray);
        
        /**
         * Sets ith "link" element
         */
        void setLinkArray(int i, org.w3.x1999.xhtml.LinkDocument.Link link);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "link" element
         */
        org.w3.x1999.xhtml.LinkDocument.Link insertNewLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "link" element
         */
        org.w3.x1999.xhtml.LinkDocument.Link addNewLink();
        
        /**
         * Removes the ith "link" element
         */
        void removeLink(int i);
        
        /**
         * Gets array of all "object" elements
         */
        org.w3.x1999.xhtml.ObjectDocument.Object[] getObjectArray();
        
        /**
         * Gets ith "object" element
         */
        org.w3.x1999.xhtml.ObjectDocument.Object getObjectArray(int i);
        
        /**
         * Returns number of "object" element
         */
        int sizeOfObjectArray();
        
        /**
         * Sets array of all "object" element
         */
        void setObjectArray(org.w3.x1999.xhtml.ObjectDocument.Object[] objectArray);
        
        /**
         * Sets ith "object" element
         */
        void setObjectArray(int i, org.w3.x1999.xhtml.ObjectDocument.Object object);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "object" element
         */
        org.w3.x1999.xhtml.ObjectDocument.Object insertNewObject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "object" element
         */
        org.w3.x1999.xhtml.ObjectDocument.Object addNewObject();
        
        /**
         * Removes the ith "object" element
         */
        void removeObject(int i);
        
        /**
         * Gets the "title" element
         */
        org.w3.x1999.xhtml.TitleDocument.Title getTitle();
        
        /**
         * True if has "title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(org.w3.x1999.xhtml.TitleDocument.Title title);
        
        /**
         * Appends and returns a new empty "title" element
         */
        org.w3.x1999.xhtml.TitleDocument.Title addNewTitle();
        
        /**
         * Unsets the "title" element
         */
        void unsetTitle();
        
        /**
         * Gets the "base" element
         */
        org.w3.x1999.xhtml.BaseDocument.Base getBase();
        
        /**
         * True if has "base" element
         */
        boolean isSetBase();
        
        /**
         * Sets the "base" element
         */
        void setBase(org.w3.x1999.xhtml.BaseDocument.Base base);
        
        /**
         * Appends and returns a new empty "base" element
         */
        org.w3.x1999.xhtml.BaseDocument.Base addNewBase();
        
        /**
         * Unsets the "base" element
         */
        void unsetBase();
        
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
        org.w3.x1999.xhtml.HeadDocument.Head.Dir.Enum getDir();
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        org.w3.x1999.xhtml.HeadDocument.Head.Dir xgetDir();
        
        /**
         * True if has "dir" attribute
         */
        boolean isSetDir();
        
        /**
         * Sets the "dir" attribute
         */
        void setDir(org.w3.x1999.xhtml.HeadDocument.Head.Dir.Enum dir);
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        void xsetDir(org.w3.x1999.xhtml.HeadDocument.Head.Dir dir);
        
        /**
         * Unsets the "dir" attribute
         */
        void unsetDir();
        
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
         * Gets the "profile" attribute
         */
        java.lang.String getProfile();
        
        /**
         * Gets (as xml) the "profile" attribute
         */
        org.w3.x1999.xhtml.URI xgetProfile();
        
        /**
         * True if has "profile" attribute
         */
        boolean isSetProfile();
        
        /**
         * Sets the "profile" attribute
         */
        void setProfile(java.lang.String profile);
        
        /**
         * Sets (as xml) the "profile" attribute
         */
        void xsetProfile(org.w3.x1999.xhtml.URI profile);
        
        /**
         * Unsets the "profile" attribute
         */
        void unsetProfile();
        
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.HeadDocument$Head$Dir.
         */
        public interface Dir extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("dir7c3eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LTR = Enum.forString("ltr");
            static final Enum RTL = Enum.forString("rtl");
            
            static final int INT_LTR = Enum.INT_LTR;
            static final int INT_RTL = Enum.INT_RTL;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.HeadDocument$Head$Dir.
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
                public static org.w3.x1999.xhtml.HeadDocument.Head.Dir newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.HeadDocument.Head.Dir) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.HeadDocument.Head.Dir newInstance() {
                  return (org.w3.x1999.xhtml.HeadDocument.Head.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.HeadDocument.Head.Dir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.HeadDocument.Head.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x1999.xhtml.HeadDocument.Head newInstance() {
              return (org.w3.x1999.xhtml.HeadDocument.Head) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x1999.xhtml.HeadDocument.Head newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x1999.xhtml.HeadDocument.Head) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xhtml.HeadDocument newInstance() {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xhtml.HeadDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xhtml.HeadDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xhtml.HeadDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.HeadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.HeadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.HeadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
