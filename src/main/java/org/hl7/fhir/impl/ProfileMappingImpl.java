/*
 * XML Type:  Profile.Mapping
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileMapping
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Mapping(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileMappingImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileMapping
{
    private static final long serialVersionUID = 1L;
    
    public ProfileMappingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTITY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identity");
    private static final javax.xml.namespace.QName URI$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "uri");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName COMMENTS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "comments");
    
    
    /**
     * Gets the "identity" element
     */
    public org.hl7.fhir.Id getIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(IDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identity" element
     */
    public void setIdentity(org.hl7.fhir.Id identity)
    {
        generatedSetterHelperImpl(identity, IDENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identity" element
     */
    public org.hl7.fhir.Id addNewIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(IDENTITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "uri" element
     */
    public org.hl7.fhir.Uri getUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(URI$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uri" element
     */
    public boolean isSetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URI$2) != 0;
        }
    }
    
    /**
     * Sets the "uri" element
     */
    public void setUri(org.hl7.fhir.Uri uri)
    {
        generatedSetterHelperImpl(uri, URI$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "uri" element
     */
    public org.hl7.fhir.Uri addNewUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(URI$2);
            return target;
        }
    }
    
    /**
     * Unsets the "uri" element
     */
    public void unsetUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URI$2, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, 0);
        }
    }
    
    /**
     * Gets the "comments" element
     */
    public org.hl7.fhir.String getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COMMENTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comments" element
     */
    public boolean isSetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTS$6) != 0;
        }
    }
    
    /**
     * Sets the "comments" element
     */
    public void setComments(org.hl7.fhir.String comments)
    {
        generatedSetterHelperImpl(comments, COMMENTS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "comments" element
     */
    public org.hl7.fhir.String addNewComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(COMMENTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "comments" element
     */
    public void unsetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTS$6, 0);
        }
    }
}
