/*
 * XML Type:  Other
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Other
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Other(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class OtherImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Other
{
    private static final long serialVersionUID = 1L;
    
    public OtherImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName AUTHOR$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "author");
    private static final javax.xml.namespace.QName CREATED$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "created");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.hl7.fhir.ResourceReference addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$2, 0);
        }
    }
    
    /**
     * Gets the "author" element
     */
    public org.hl7.fhir.ResourceReference getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "author" element
     */
    public boolean isSetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$4) != 0;
        }
    }
    
    /**
     * Sets the "author" element
     */
    public void setAuthor(org.hl7.fhir.ResourceReference author)
    {
        generatedSetterHelperImpl(author, AUTHOR$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "author" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHOR$4);
            return target;
        }
    }
    
    /**
     * Unsets the "author" element
     */
    public void unsetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$4, 0);
        }
    }
    
    /**
     * Gets the "created" element
     */
    public org.hl7.fhir.Date getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(CREATED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$6) != 0;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(org.hl7.fhir.Date created)
    {
        generatedSetterHelperImpl(created, CREATED$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "created" element
     */
    public org.hl7.fhir.Date addNewCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(CREATED$6);
            return target;
        }
    }
    
    /**
     * Unsets the "created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$6, 0);
        }
    }
}
