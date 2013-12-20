/*
 * XML Type:  ResourceReference
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ResourceReference
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ResourceReference(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ResourceReferenceImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.ResourceReference
{
    private static final long serialVersionUID = 1L;
    
    public ResourceReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reference");
    private static final javax.xml.namespace.QName DISPLAY$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "display");
    
    
    /**
     * Gets the "reference" element
     */
    public org.hl7.fhir.String getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reference" element
     */
    public boolean isSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$0) != 0;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(org.hl7.fhir.String reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reference" element
     */
    public org.hl7.fhir.String addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "reference" element
     */
    public void unsetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$0, 0);
        }
    }
    
    /**
     * Gets the "display" element
     */
    public org.hl7.fhir.String getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DISPLAY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "display" element
     */
    public boolean isSetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAY$2) != 0;
        }
    }
    
    /**
     * Sets the "display" element
     */
    public void setDisplay(org.hl7.fhir.String display)
    {
        generatedSetterHelperImpl(display, DISPLAY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "display" element
     */
    public org.hl7.fhir.String addNewDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DISPLAY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "display" element
     */
    public void unsetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAY$2, 0);
        }
    }
}
