/*
 * XML Type:  dateTime-primitive
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DateTimePrimitive
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML dateTime-primitive(@http://hl7.org/fhir).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlDateTime
 */
public class DateTimePrimitiveImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.hl7.fhir.DateTimePrimitive, org.apache.xmlbeans.XmlGYear, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlDateTime
{
    private static final long serialVersionUID = 1L;
    
    public DateTimePrimitiveImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DateTimePrimitiveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
