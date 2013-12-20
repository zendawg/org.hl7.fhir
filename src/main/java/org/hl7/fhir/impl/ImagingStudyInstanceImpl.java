/*
 * XML Type:  ImagingStudy.Instance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImagingStudyInstance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ImagingStudy.Instance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImagingStudyInstanceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImagingStudyInstance
{
    private static final long serialVersionUID = 1L;
    
    public ImagingStudyInstanceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMBER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "number");
    private static final javax.xml.namespace.QName UID$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "uid");
    private static final javax.xml.namespace.QName SOPCLASS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "sopclass");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName TITLE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "title");
    private static final javax.xml.namespace.QName URL$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "url");
    private static final javax.xml.namespace.QName ATTACHMENT$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "attachment");
    
    
    /**
     * Gets the "number" element
     */
    public org.hl7.fhir.Integer getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(NUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "number" element
     */
    public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBER$0) != 0;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(org.hl7.fhir.Integer number)
    {
        generatedSetterHelperImpl(number, NUMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "number" element
     */
    public org.hl7.fhir.Integer addNewNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(NUMBER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "number" element
     */
    public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBER$0, 0);
        }
    }
    
    /**
     * Gets the "uid" element
     */
    public org.hl7.fhir.Oid getUid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().find_element_user(UID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "uid" element
     */
    public void setUid(org.hl7.fhir.Oid uid)
    {
        generatedSetterHelperImpl(uid, UID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "uid" element
     */
    public org.hl7.fhir.Oid addNewUid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().add_element_user(UID$2);
            return target;
        }
    }
    
    /**
     * Gets the "sopclass" element
     */
    public org.hl7.fhir.Oid getSopclass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().find_element_user(SOPCLASS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sopclass" element
     */
    public void setSopclass(org.hl7.fhir.Oid sopclass)
    {
        generatedSetterHelperImpl(sopclass, SOPCLASS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sopclass" element
     */
    public org.hl7.fhir.Oid addNewSopclass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().add_element_user(SOPCLASS$4);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.String type)
    {
        generatedSetterHelperImpl(type, TYPE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.String addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$6, 0);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public org.hl7.fhir.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TITLE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$8) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(org.hl7.fhir.String title)
    {
        generatedSetterHelperImpl(title, TITLE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public org.hl7.fhir.String addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TITLE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$8, 0);
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
            target = (org.hl7.fhir.Uri)get_store().find_element_user(URL$10, 0);
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
            return get_store().count_elements(URL$10) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(org.hl7.fhir.Uri url)
    {
        generatedSetterHelperImpl(url, URL$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Uri)get_store().add_element_user(URL$10);
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
            get_store().remove_element(URL$10, 0);
        }
    }
    
    /**
     * Gets the "attachment" element
     */
    public org.hl7.fhir.ResourceReference getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ATTACHMENT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "attachment" element
     */
    public boolean isSetAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENT$12) != 0;
        }
    }
    
    /**
     * Sets the "attachment" element
     */
    public void setAttachment(org.hl7.fhir.ResourceReference attachment)
    {
        generatedSetterHelperImpl(attachment, ATTACHMENT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "attachment" element
     */
    public org.hl7.fhir.ResourceReference addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ATTACHMENT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "attachment" element
     */
    public void unsetAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENT$12, 0);
        }
    }
}
