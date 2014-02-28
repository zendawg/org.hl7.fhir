/*
 * XML Type:  ObservationRelationshipType-list
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ObservationRelationshipTypeList
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ObservationRelationshipType-list(@http://hl7.org/fhir).
 *
 * This is an atomic type that is a restriction of org.hl7.fhir.ObservationRelationshipTypeList.
 */
public interface ObservationRelationshipTypeList extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObservationRelationshipTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("observationrelationshiptypelist6f19type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum HAS_COMPONENT = Enum.forString("has-component");
    static final Enum HAS_MEMBER = Enum.forString("has-member");
    static final Enum DERIVED_FROM = Enum.forString("derived-from");
    static final Enum SEQUEL_TO = Enum.forString("sequel-to");
    static final Enum REPLACES = Enum.forString("replaces");
    static final Enum QUALIFIED_BY = Enum.forString("qualified-by");
    static final Enum INTERFERED_BY = Enum.forString("interfered-by");
    
    static final int INT_HAS_COMPONENT = Enum.INT_HAS_COMPONENT;
    static final int INT_HAS_MEMBER = Enum.INT_HAS_MEMBER;
    static final int INT_DERIVED_FROM = Enum.INT_DERIVED_FROM;
    static final int INT_SEQUEL_TO = Enum.INT_SEQUEL_TO;
    static final int INT_REPLACES = Enum.INT_REPLACES;
    static final int INT_QUALIFIED_BY = Enum.INT_QUALIFIED_BY;
    static final int INT_INTERFERED_BY = Enum.INT_INTERFERED_BY;
    
    /**
     * Enumeration value class for org.hl7.fhir.ObservationRelationshipTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_HAS_COMPONENT
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
        
        static final int INT_HAS_COMPONENT = 1;
        static final int INT_HAS_MEMBER = 2;
        static final int INT_DERIVED_FROM = 3;
        static final int INT_SEQUEL_TO = 4;
        static final int INT_REPLACES = 5;
        static final int INT_QUALIFIED_BY = 6;
        static final int INT_INTERFERED_BY = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("has-component", INT_HAS_COMPONENT),
                new Enum("has-member", INT_HAS_MEMBER),
                new Enum("derived-from", INT_DERIVED_FROM),
                new Enum("sequel-to", INT_SEQUEL_TO),
                new Enum("replaces", INT_REPLACES),
                new Enum("qualified-by", INT_QUALIFIED_BY),
                new Enum("interfered-by", INT_INTERFERED_BY),
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
        public static org.hl7.fhir.ObservationRelationshipTypeList newValue(java.lang.Object obj) {
          return (org.hl7.fhir.ObservationRelationshipTypeList) type.newValue( obj ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList newInstance() {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ObservationRelationshipTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ObservationRelationshipTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
