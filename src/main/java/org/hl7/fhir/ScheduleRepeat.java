/*
 * XML Type:  Schedule.Repeat
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ScheduleRepeat
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML Schedule.Repeat(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public interface ScheduleRepeat extends org.hl7.fhir.Element
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleRepeat.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0D81A460DAE2D55E8CE901A6C9B1A88").resolveHandle("schedulerepeat252ctype");
    
    /**
     * Gets the "frequency" element
     */
    org.hl7.fhir.Integer getFrequency();
    
    /**
     * True if has "frequency" element
     */
    boolean isSetFrequency();
    
    /**
     * Sets the "frequency" element
     */
    void setFrequency(org.hl7.fhir.Integer frequency);
    
    /**
     * Appends and returns a new empty "frequency" element
     */
    org.hl7.fhir.Integer addNewFrequency();
    
    /**
     * Unsets the "frequency" element
     */
    void unsetFrequency();
    
    /**
     * Gets the "when" element
     */
    org.hl7.fhir.EventTiming getWhen();
    
    /**
     * True if has "when" element
     */
    boolean isSetWhen();
    
    /**
     * Sets the "when" element
     */
    void setWhen(org.hl7.fhir.EventTiming when);
    
    /**
     * Appends and returns a new empty "when" element
     */
    org.hl7.fhir.EventTiming addNewWhen();
    
    /**
     * Unsets the "when" element
     */
    void unsetWhen();
    
    /**
     * Gets the "duration" element
     */
    org.hl7.fhir.Decimal getDuration();
    
    /**
     * Sets the "duration" element
     */
    void setDuration(org.hl7.fhir.Decimal duration);
    
    /**
     * Appends and returns a new empty "duration" element
     */
    org.hl7.fhir.Decimal addNewDuration();
    
    /**
     * Gets the "units" element
     */
    org.hl7.fhir.UnitsOfTime getUnits();
    
    /**
     * Sets the "units" element
     */
    void setUnits(org.hl7.fhir.UnitsOfTime units);
    
    /**
     * Appends and returns a new empty "units" element
     */
    org.hl7.fhir.UnitsOfTime addNewUnits();
    
    /**
     * Gets the "count" element
     */
    org.hl7.fhir.Integer getCount();
    
    /**
     * True if has "count" element
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" element
     */
    void setCount(org.hl7.fhir.Integer count);
    
    /**
     * Appends and returns a new empty "count" element
     */
    org.hl7.fhir.Integer addNewCount();
    
    /**
     * Unsets the "count" element
     */
    void unsetCount();
    
    /**
     * Gets the "end" element
     */
    org.hl7.fhir.DateTime getEnd();
    
    /**
     * True if has "end" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "end" element
     */
    void setEnd(org.hl7.fhir.DateTime end);
    
    /**
     * Appends and returns a new empty "end" element
     */
    org.hl7.fhir.DateTime addNewEnd();
    
    /**
     * Unsets the "end" element
     */
    void unsetEnd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.hl7.fhir.ScheduleRepeat newInstance() {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ScheduleRepeat parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ScheduleRepeat parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ScheduleRepeat parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ScheduleRepeat parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ScheduleRepeat parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ScheduleRepeat) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
