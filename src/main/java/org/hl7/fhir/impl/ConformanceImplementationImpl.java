/*
 * XML Type:  Conformance.Implementation
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceImplementation
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Implementation(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceImplementationImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceImplementation
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceImplementationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName URL$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "url");
    
    
    /**
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.hl7.fhir.String addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "url" element
     */
    public org.hl7.fhir.Uri getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$2) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(org.hl7.fhir.Uri url)
    {
        generatedSetterHelperImpl(url, URL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "url" element
     */
    public org.hl7.fhir.Uri addNewUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(URL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$2, 0);
        }
    }
}
