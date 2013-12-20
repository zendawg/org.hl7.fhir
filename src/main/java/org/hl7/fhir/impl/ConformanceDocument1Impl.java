/*
 * XML Type:  Conformance.Document
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConformanceDocument1
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance.Document(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceDocument1Impl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConformanceDocument1
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mode");
    private static final javax.xml.namespace.QName DOCUMENTATION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "documentation");
    private static final javax.xml.namespace.QName PROFILE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "profile");
    
    
    /**
     * Gets the "mode" element
     */
    public org.hl7.fhir.DocumentMode getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentMode target = null;
            target = (org.hl7.fhir.DocumentMode)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mode" element
     */
    public void setMode(org.hl7.fhir.DocumentMode mode)
    {
        generatedSetterHelperImpl(mode, MODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mode" element
     */
    public org.hl7.fhir.DocumentMode addNewMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentMode target = null;
            target = (org.hl7.fhir.DocumentMode)get_store().add_element_user(MODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "documentation" element
     */
    public org.hl7.fhir.String getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DOCUMENTATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentation" element
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$2) != 0;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.hl7.fhir.String documentation)
    {
        generatedSetterHelperImpl(documentation, DOCUMENTATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.hl7.fhir.String addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DOCUMENTATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "documentation" element
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$2, 0);
        }
    }
    
    /**
     * Gets the "profile" element
     */
    public org.hl7.fhir.ResourceReference getProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PROFILE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "profile" element
     */
    public void setProfile(org.hl7.fhir.ResourceReference profile)
    {
        generatedSetterHelperImpl(profile, PROFILE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "profile" element
     */
    public org.hl7.fhir.ResourceReference addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PROFILE$4);
            return target;
        }
    }
}
