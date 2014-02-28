/*
 * XML Type:  ImagingModality-list
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImagingModalityList
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir;


/**
 * An XML ImagingModality-list(@http://hl7.org/fhir).
 *
 * This is an atomic type that is a restriction of org.hl7.fhir.ImagingModalityList.
 */
public interface ImagingModalityList extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImagingModalityList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9E39DC3B416F07EA0C8EBAFDA46576CE").resolveHandle("imagingmodalitylistdc7etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum AR = Enum.forString("AR");
    static final Enum BMD = Enum.forString("BMD");
    static final Enum BDUS = Enum.forString("BDUS");
    static final Enum EPS = Enum.forString("EPS");
    static final Enum CR = Enum.forString("CR");
    static final Enum CT = Enum.forString("CT");
    static final Enum DX = Enum.forString("DX");
    static final Enum ECG = Enum.forString("ECG");
    static final Enum ES = Enum.forString("ES");
    static final Enum XC = Enum.forString("XC");
    static final Enum GM = Enum.forString("GM");
    static final Enum HD = Enum.forString("HD");
    static final Enum IO = Enum.forString("IO");
    static final Enum IVOCT = Enum.forString("IVOCT");
    static final Enum IVUS = Enum.forString("IVUS");
    static final Enum KER = Enum.forString("KER");
    static final Enum LEN = Enum.forString("LEN");
    static final Enum MR = Enum.forString("MR");
    static final Enum MG = Enum.forString("MG");
    static final Enum NM = Enum.forString("NM");
    static final Enum OAM = Enum.forString("OAM");
    static final Enum OCT = Enum.forString("OCT");
    static final Enum OPM = Enum.forString("OPM");
    static final Enum OP = Enum.forString("OP");
    static final Enum OPR = Enum.forString("OPR");
    static final Enum OPT = Enum.forString("OPT");
    static final Enum OPV = Enum.forString("OPV");
    static final Enum PX = Enum.forString("PX");
    static final Enum PT = Enum.forString("PT");
    static final Enum RF = Enum.forString("RF");
    static final Enum RG = Enum.forString("RG");
    static final Enum SM = Enum.forString("SM");
    static final Enum SRF = Enum.forString("SRF");
    static final Enum US = Enum.forString("US");
    static final Enum VA = Enum.forString("VA");
    static final Enum XA = Enum.forString("XA");
    
    static final int INT_AR = Enum.INT_AR;
    static final int INT_BMD = Enum.INT_BMD;
    static final int INT_BDUS = Enum.INT_BDUS;
    static final int INT_EPS = Enum.INT_EPS;
    static final int INT_CR = Enum.INT_CR;
    static final int INT_CT = Enum.INT_CT;
    static final int INT_DX = Enum.INT_DX;
    static final int INT_ECG = Enum.INT_ECG;
    static final int INT_ES = Enum.INT_ES;
    static final int INT_XC = Enum.INT_XC;
    static final int INT_GM = Enum.INT_GM;
    static final int INT_HD = Enum.INT_HD;
    static final int INT_IO = Enum.INT_IO;
    static final int INT_IVOCT = Enum.INT_IVOCT;
    static final int INT_IVUS = Enum.INT_IVUS;
    static final int INT_KER = Enum.INT_KER;
    static final int INT_LEN = Enum.INT_LEN;
    static final int INT_MR = Enum.INT_MR;
    static final int INT_MG = Enum.INT_MG;
    static final int INT_NM = Enum.INT_NM;
    static final int INT_OAM = Enum.INT_OAM;
    static final int INT_OCT = Enum.INT_OCT;
    static final int INT_OPM = Enum.INT_OPM;
    static final int INT_OP = Enum.INT_OP;
    static final int INT_OPR = Enum.INT_OPR;
    static final int INT_OPT = Enum.INT_OPT;
    static final int INT_OPV = Enum.INT_OPV;
    static final int INT_PX = Enum.INT_PX;
    static final int INT_PT = Enum.INT_PT;
    static final int INT_RF = Enum.INT_RF;
    static final int INT_RG = Enum.INT_RG;
    static final int INT_SM = Enum.INT_SM;
    static final int INT_SRF = Enum.INT_SRF;
    static final int INT_US = Enum.INT_US;
    static final int INT_VA = Enum.INT_VA;
    static final int INT_XA = Enum.INT_XA;
    
    /**
     * Enumeration value class for org.hl7.fhir.ImagingModalityList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_AR
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
        
        static final int INT_AR = 1;
        static final int INT_BMD = 2;
        static final int INT_BDUS = 3;
        static final int INT_EPS = 4;
        static final int INT_CR = 5;
        static final int INT_CT = 6;
        static final int INT_DX = 7;
        static final int INT_ECG = 8;
        static final int INT_ES = 9;
        static final int INT_XC = 10;
        static final int INT_GM = 11;
        static final int INT_HD = 12;
        static final int INT_IO = 13;
        static final int INT_IVOCT = 14;
        static final int INT_IVUS = 15;
        static final int INT_KER = 16;
        static final int INT_LEN = 17;
        static final int INT_MR = 18;
        static final int INT_MG = 19;
        static final int INT_NM = 20;
        static final int INT_OAM = 21;
        static final int INT_OCT = 22;
        static final int INT_OPM = 23;
        static final int INT_OP = 24;
        static final int INT_OPR = 25;
        static final int INT_OPT = 26;
        static final int INT_OPV = 27;
        static final int INT_PX = 28;
        static final int INT_PT = 29;
        static final int INT_RF = 30;
        static final int INT_RG = 31;
        static final int INT_SM = 32;
        static final int INT_SRF = 33;
        static final int INT_US = 34;
        static final int INT_VA = 35;
        static final int INT_XA = 36;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("AR", INT_AR),
                new Enum("BMD", INT_BMD),
                new Enum("BDUS", INT_BDUS),
                new Enum("EPS", INT_EPS),
                new Enum("CR", INT_CR),
                new Enum("CT", INT_CT),
                new Enum("DX", INT_DX),
                new Enum("ECG", INT_ECG),
                new Enum("ES", INT_ES),
                new Enum("XC", INT_XC),
                new Enum("GM", INT_GM),
                new Enum("HD", INT_HD),
                new Enum("IO", INT_IO),
                new Enum("IVOCT", INT_IVOCT),
                new Enum("IVUS", INT_IVUS),
                new Enum("KER", INT_KER),
                new Enum("LEN", INT_LEN),
                new Enum("MR", INT_MR),
                new Enum("MG", INT_MG),
                new Enum("NM", INT_NM),
                new Enum("OAM", INT_OAM),
                new Enum("OCT", INT_OCT),
                new Enum("OPM", INT_OPM),
                new Enum("OP", INT_OP),
                new Enum("OPR", INT_OPR),
                new Enum("OPT", INT_OPT),
                new Enum("OPV", INT_OPV),
                new Enum("PX", INT_PX),
                new Enum("PT", INT_PT),
                new Enum("RF", INT_RF),
                new Enum("RG", INT_RG),
                new Enum("SM", INT_SM),
                new Enum("SRF", INT_SRF),
                new Enum("US", INT_US),
                new Enum("VA", INT_VA),
                new Enum("XA", INT_XA),
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
        public static org.hl7.fhir.ImagingModalityList newValue(java.lang.Object obj) {
          return (org.hl7.fhir.ImagingModalityList) type.newValue( obj ); }
        
        public static org.hl7.fhir.ImagingModalityList newInstance() {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.hl7.fhir.ImagingModalityList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.hl7.fhir.ImagingModalityList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.hl7.fhir.ImagingModalityList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImagingModalityList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.hl7.fhir.ImagingModalityList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.hl7.fhir.ImagingModalityList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
