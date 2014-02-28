/*
 * XML Type:  InputType
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.InputType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml;


/**
 * An XML InputType(@http://www.w3.org/1999/xhtml).
 *
 * This is an atomic type that is a restriction of org.w3.x1999.xhtml.InputType.
 */
public interface InputType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InputType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("inputtype1135type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum TEXT = Enum.forString("text");
    static final Enum PASSWORD = Enum.forString("password");
    static final Enum CHECKBOX = Enum.forString("checkbox");
    static final Enum RADIO = Enum.forString("radio");
    static final Enum SUBMIT = Enum.forString("submit");
    static final Enum RESET = Enum.forString("reset");
    static final Enum FILE = Enum.forString("file");
    static final Enum HIDDEN = Enum.forString("hidden");
    static final Enum IMAGE = Enum.forString("image");
    static final Enum BUTTON = Enum.forString("button");
    
    static final int INT_TEXT = Enum.INT_TEXT;
    static final int INT_PASSWORD = Enum.INT_PASSWORD;
    static final int INT_CHECKBOX = Enum.INT_CHECKBOX;
    static final int INT_RADIO = Enum.INT_RADIO;
    static final int INT_SUBMIT = Enum.INT_SUBMIT;
    static final int INT_RESET = Enum.INT_RESET;
    static final int INT_FILE = Enum.INT_FILE;
    static final int INT_HIDDEN = Enum.INT_HIDDEN;
    static final int INT_IMAGE = Enum.INT_IMAGE;
    static final int INT_BUTTON = Enum.INT_BUTTON;
    
    /**
     * Enumeration value class for org.w3.x1999.xhtml.InputType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_TEXT
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
        
        static final int INT_TEXT = 1;
        static final int INT_PASSWORD = 2;
        static final int INT_CHECKBOX = 3;
        static final int INT_RADIO = 4;
        static final int INT_SUBMIT = 5;
        static final int INT_RESET = 6;
        static final int INT_FILE = 7;
        static final int INT_HIDDEN = 8;
        static final int INT_IMAGE = 9;
        static final int INT_BUTTON = 10;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("text", INT_TEXT),
                new Enum("password", INT_PASSWORD),
                new Enum("checkbox", INT_CHECKBOX),
                new Enum("radio", INT_RADIO),
                new Enum("submit", INT_SUBMIT),
                new Enum("reset", INT_RESET),
                new Enum("file", INT_FILE),
                new Enum("hidden", INT_HIDDEN),
                new Enum("image", INT_IMAGE),
                new Enum("button", INT_BUTTON),
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
        public static org.w3.x1999.xhtml.InputType newValue(java.lang.Object obj) {
          return (org.w3.x1999.xhtml.InputType) type.newValue( obj ); }
        
        public static org.w3.x1999.xhtml.InputType newInstance() {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xhtml.InputType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xhtml.InputType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xhtml.InputType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xhtml.InputType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xhtml.InputType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xhtml.InputType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xhtml.InputType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xhtml.InputType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.InputType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.InputType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.InputType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
