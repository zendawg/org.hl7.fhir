/*
 * XML Type:  DiagnosticOrder.Event
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticOrderEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DiagnosticOrder.Event(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DiagnosticOrderEventImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DiagnosticOrderEvent
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticOrderEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName ACTOR$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "actor");
    
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.DiagnosticOrderStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderStatus target = null;
            target = (org.hl7.fhir.DiagnosticOrderStatus)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.DiagnosticOrderStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.DiagnosticOrderStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticOrderStatus target = null;
            target = (org.hl7.fhir.DiagnosticOrderStatus)get_store().add_element_user(STATUS$0);
            return target;
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$2);
            return target;
        }
    }
    
    /**
     * Gets the "actor" element
     */
    public org.hl7.fhir.ResourceReference getActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ACTOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "actor" element
     */
    public boolean isSetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTOR$4) != 0;
        }
    }
    
    /**
     * Sets the "actor" element
     */
    public void setActor(org.hl7.fhir.ResourceReference actor)
    {
        generatedSetterHelperImpl(actor, ACTOR$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "actor" element
     */
    public org.hl7.fhir.ResourceReference addNewActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ACTOR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "actor" element
     */
    public void unsetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTOR$4, 0);
        }
    }
}
