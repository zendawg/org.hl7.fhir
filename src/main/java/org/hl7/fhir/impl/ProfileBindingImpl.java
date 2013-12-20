/*
 * XML Type:  Profile.Binding
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileBinding
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Binding(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileBindingImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileBinding
{
    private static final long serialVersionUID = 1L;
    
    public ProfileBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName ISEXTENSIBLE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "isExtensible");
    private static final javax.xml.namespace.QName CONFORMANCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "conformance");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName REFERENCEURI$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "referenceUri");
    private static final javax.xml.namespace.QName REFERENCERESOURCE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "referenceResource");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.String addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "isExtensible" element
     */
    public org.hl7.fhir.Boolean getIsExtensible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ISEXTENSIBLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "isExtensible" element
     */
    public void setIsExtensible(org.hl7.fhir.Boolean isExtensible)
    {
        generatedSetterHelperImpl(isExtensible, ISEXTENSIBLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "isExtensible" element
     */
    public org.hl7.fhir.Boolean addNewIsExtensible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ISEXTENSIBLE$2);
            return target;
        }
    }
    
    /**
     * Gets the "conformance" element
     */
    public org.hl7.fhir.BindingConformance getConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.BindingConformance target = null;
            target = (org.hl7.fhir.BindingConformance)get_store().find_element_user(CONFORMANCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conformance" element
     */
    public boolean isSetConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFORMANCE$4) != 0;
        }
    }
    
    /**
     * Sets the "conformance" element
     */
    public void setConformance(org.hl7.fhir.BindingConformance conformance)
    {
        generatedSetterHelperImpl(conformance, CONFORMANCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conformance" element
     */
    public org.hl7.fhir.BindingConformance addNewConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.BindingConformance target = null;
            target = (org.hl7.fhir.BindingConformance)get_store().add_element_user(CONFORMANCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "conformance" element
     */
    public void unsetConformance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFORMANCE$4, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets the "referenceUri" element
     */
    public org.hl7.fhir.Uri getReferenceUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(REFERENCEURI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "referenceUri" element
     */
    public boolean isSetReferenceUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEURI$8) != 0;
        }
    }
    
    /**
     * Sets the "referenceUri" element
     */
    public void setReferenceUri(org.hl7.fhir.Uri referenceUri)
    {
        generatedSetterHelperImpl(referenceUri, REFERENCEURI$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceUri" element
     */
    public org.hl7.fhir.Uri addNewReferenceUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(REFERENCEURI$8);
            return target;
        }
    }
    
    /**
     * Unsets the "referenceUri" element
     */
    public void unsetReferenceUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEURI$8, 0);
        }
    }
    
    /**
     * Gets the "referenceResource" element
     */
    public org.hl7.fhir.ResourceReference getReferenceResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REFERENCERESOURCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "referenceResource" element
     */
    public boolean isSetReferenceResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCERESOURCE$10) != 0;
        }
    }
    
    /**
     * Sets the "referenceResource" element
     */
    public void setReferenceResource(org.hl7.fhir.ResourceReference referenceResource)
    {
        generatedSetterHelperImpl(referenceResource, REFERENCERESOURCE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceResource" element
     */
    public org.hl7.fhir.ResourceReference addNewReferenceResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REFERENCERESOURCE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "referenceResource" element
     */
    public void unsetReferenceResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCERESOURCE$10, 0);
        }
    }
}
