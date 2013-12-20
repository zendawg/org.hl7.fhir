/*
 * An XML document type.
 * Localname: SecurityEvent
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one SecurityEvent(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class SecurityEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.SecurityEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYEVENT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "SecurityEvent");
    
    
    /**
     * Gets the "SecurityEvent" element
     */
    public org.hl7.fhir.SecurityEvent getSecurityEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEvent target = null;
            target = (org.hl7.fhir.SecurityEvent)get_store().find_element_user(SECURITYEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SecurityEvent" element
     */
    public void setSecurityEvent(org.hl7.fhir.SecurityEvent securityEvent)
    {
        generatedSetterHelperImpl(securityEvent, SECURITYEVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SecurityEvent" element
     */
    public org.hl7.fhir.SecurityEvent addNewSecurityEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEvent target = null;
            target = (org.hl7.fhir.SecurityEvent)get_store().add_element_user(SECURITYEVENT$0);
            return target;
        }
    }
}
