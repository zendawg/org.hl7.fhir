/*
 * XML Type:  Alert
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Alert
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Alert(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class AlertImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Alert
{
    private static final long serialVersionUID = 1L;
    
    public AlertImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "category");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName SUBJECT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName AUTHOR$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "author");
    private static final javax.xml.namespace.QName NOTE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "note");
    
    
    /**
     * Gets the "category" element
     */
    public org.hl7.fhir.CodeableConcept getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$0) != 0;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.hl7.fhir.CodeableConcept category)
    {
        generatedSetterHelperImpl(category, CATEGORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public org.hl7.fhir.CodeableConcept addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$0, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.AlertStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AlertStatus target = null;
            target = (org.hl7.fhir.AlertStatus)get_store().find_element_user(STATUS$2, 0);
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
    public void setStatus(org.hl7.fhir.AlertStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.AlertStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AlertStatus target = null;
            target = (org.hl7.fhir.AlertStatus)get_store().add_element_user(STATUS$2);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$4);
            return target;
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHOR$6, 0);
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
            return get_store().count_elements(AUTHOR$6) != 0;
        }
    }
    
    /**
     * Sets the "author" element
     */
    public void setAuthor(org.hl7.fhir.ResourceReference author)
    {
        generatedSetterHelperImpl(author, AUTHOR$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHOR$6);
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
            get_store().remove_element(AUTHOR$6, 0);
        }
    }
    
    /**
     * Gets the "note" element
     */
    public org.hl7.fhir.String getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "note" element
     */
    public void setNote(org.hl7.fhir.String note)
    {
        generatedSetterHelperImpl(note, NOTE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "note" element
     */
    public org.hl7.fhir.String addNewNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTE$8);
            return target;
        }
    }
}
