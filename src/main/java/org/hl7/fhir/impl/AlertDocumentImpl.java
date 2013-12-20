/*
 * An XML document type.
 * Localname: Alert
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AlertDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one Alert(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class AlertDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.AlertDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlertDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALERT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "Alert");
    
    
    /**
     * Gets the "Alert" element
     */
    public org.hl7.fhir.Alert getAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Alert target = null;
            target = (org.hl7.fhir.Alert)get_store().find_element_user(ALERT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Alert" element
     */
    public void setAlert(org.hl7.fhir.Alert alert)
    {
        generatedSetterHelperImpl(alert, ALERT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Alert" element
     */
    public org.hl7.fhir.Alert addNewAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Alert target = null;
            target = (org.hl7.fhir.Alert)get_store().add_element_user(ALERT$0);
            return target;
        }
    }
}
