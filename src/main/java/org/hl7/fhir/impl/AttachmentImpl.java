/*
 * XML Type:  Attachment
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Attachment
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Attachment(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class AttachmentImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.Attachment
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "contentType");
    private static final javax.xml.namespace.QName LANGUAGE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "language");
    private static final javax.xml.namespace.QName DATA$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "data");
    private static final javax.xml.namespace.QName URL$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "url");
    private static final javax.xml.namespace.QName SIZE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "size");
    private static final javax.xml.namespace.QName HASH$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "hash");
    private static final javax.xml.namespace.QName TITLE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "title");
    
    
    /**
     * Gets the "contentType" element
     */
    public org.hl7.fhir.Code getContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CONTENTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contentType" element
     */
    public void setContentType(org.hl7.fhir.Code contentType)
    {
        generatedSetterHelperImpl(contentType, CONTENTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contentType" element
     */
    public org.hl7.fhir.Code addNewContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(CONTENTTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "language" element
     */
    public org.hl7.fhir.Code getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(LANGUAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "language" element
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "language" element
     */
    public void setLanguage(org.hl7.fhir.Code language)
    {
        generatedSetterHelperImpl(language, LANGUAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "language" element
     */
    public org.hl7.fhir.Code addNewLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(LANGUAGE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "language" element
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGE$2, 0);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public org.hl7.fhir.Base64Binary getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$4) != 0;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(org.hl7.fhir.Base64Binary data)
    {
        generatedSetterHelperImpl(data, DATA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "data" element
     */
    public org.hl7.fhir.Base64Binary addNewData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(DATA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$4, 0);
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
            target = (org.hl7.fhir.Uri)get_store().find_element_user(URL$6, 0);
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
            return get_store().count_elements(URL$6) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(org.hl7.fhir.Uri url)
    {
        generatedSetterHelperImpl(url, URL$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Uri)get_store().add_element_user(URL$6);
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
            get_store().remove_element(URL$6, 0);
        }
    }
    
    /**
     * Gets the "size" element
     */
    public org.hl7.fhir.Integer getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(SIZE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$8) != 0;
        }
    }
    
    /**
     * Sets the "size" element
     */
    public void setSize(org.hl7.fhir.Integer size)
    {
        generatedSetterHelperImpl(size, SIZE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "size" element
     */
    public org.hl7.fhir.Integer addNewSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(SIZE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$8, 0);
        }
    }
    
    /**
     * Gets the "hash" element
     */
    public org.hl7.fhir.Base64Binary getHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(HASH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hash" element
     */
    public boolean isSetHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASH$10) != 0;
        }
    }
    
    /**
     * Sets the "hash" element
     */
    public void setHash(org.hl7.fhir.Base64Binary hash)
    {
        generatedSetterHelperImpl(hash, HASH$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "hash" element
     */
    public org.hl7.fhir.Base64Binary addNewHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(HASH$10);
            return target;
        }
    }
    
    /**
     * Unsets the "hash" element
     */
    public void unsetHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASH$10, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(TITLE$12, 0);
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
            return get_store().count_elements(TITLE$12) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(org.hl7.fhir.String title)
    {
        generatedSetterHelperImpl(title, TITLE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(TITLE$12);
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
            get_store().remove_element(TITLE$12, 0);
        }
    }
}
