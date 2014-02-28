/*
 * XML Type:  base64Binary-primitive
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Base64BinaryPrimitive
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML base64Binary-primitive(@http://hl7.org/fhir).
 *
 * This is an atomic type that is a restriction of org.hl7.fhir.Base64BinaryPrimitive.
 */
public interface Base64BinaryPrimitive extends org.apache.xmlbeans.XmlBase64Binary
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Base64BinaryPrimitive.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("base64binaryprimitiveb016type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.Base64BinaryPrimitive newValue(java.lang.Object obj) {
          return (org.hl7.fhir.Base64BinaryPrimitive) type.newValue( obj ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive newInstance() {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.Base64BinaryPrimitive parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Base64BinaryPrimitive parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.Base64BinaryPrimitive parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.Base64BinaryPrimitive) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
