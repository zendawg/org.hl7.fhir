/*
 * XML Type:  date-primitive
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DatePrimitive
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML date-primitive(@http://hl7.org/fhir).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlDate
 */
public class DatePrimitiveImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.hl7.fhir.DatePrimitive, org.apache.xmlbeans.XmlGYear, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlDate
{
    private static final long serialVersionUID = 1L;
    
    public DatePrimitiveImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DatePrimitiveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
