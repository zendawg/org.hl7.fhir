/*
 * XML Type:  Composition.Section
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CompositionSection
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Composition.Section(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CompositionSectionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.CompositionSection
{
    private static final long serialVersionUID = 1L;
    
    public CompositionSectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "title");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName SUBJECT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName CONTENT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "content");
    private static final javax.xml.namespace.QName SECTION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "section");
    
    
    /**
     * Gets the "title" element
     */
    public org.hl7.fhir.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TITLE$0, 0);
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
            return get_store().count_elements(TITLE$0) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(org.hl7.fhir.String title)
    {
        generatedSetterHelperImpl(title, TITLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(TITLE$0);
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
            get_store().remove_element(TITLE$0, 0);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$2) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$2, 0);
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
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$4) != 0;
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
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$4, 0);
        }
    }
    
    /**
     * Gets the "content" element
     */
    public org.hl7.fhir.ResourceReference getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CONTENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "content" element
     */
    public boolean isSetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$6) != 0;
        }
    }
    
    /**
     * Sets the "content" element
     */
    public void setContent(org.hl7.fhir.ResourceReference content)
    {
        generatedSetterHelperImpl(content, CONTENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "content" element
     */
    public org.hl7.fhir.ResourceReference addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(CONTENT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "content" element
     */
    public void unsetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$6, 0);
        }
    }
    
    /**
     * Gets array of all "section" elements
     */
    public org.hl7.fhir.CompositionSection[] getSectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SECTION$8, targetList);
            org.hl7.fhir.CompositionSection[] result = new org.hl7.fhir.CompositionSection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "section" element
     */
    public org.hl7.fhir.CompositionSection getSectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionSection target = null;
            target = (org.hl7.fhir.CompositionSection)get_store().find_element_user(SECTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "section" element
     */
    public int sizeOfSectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECTION$8);
        }
    }
    
    /**
     * Sets array of all "section" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSectionArray(org.hl7.fhir.CompositionSection[] sectionArray)
    {
        check_orphaned();
        arraySetterHelper(sectionArray, SECTION$8);
    }
    
    /**
     * Sets ith "section" element
     */
    public void setSectionArray(int i, org.hl7.fhir.CompositionSection section)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionSection target = null;
            target = (org.hl7.fhir.CompositionSection)get_store().find_element_user(SECTION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(section);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "section" element
     */
    public org.hl7.fhir.CompositionSection insertNewSection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionSection target = null;
            target = (org.hl7.fhir.CompositionSection)get_store().insert_element_user(SECTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "section" element
     */
    public org.hl7.fhir.CompositionSection addNewSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionSection target = null;
            target = (org.hl7.fhir.CompositionSection)get_store().add_element_user(SECTION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "section" element
     */
    public void removeSection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECTION$8, i);
        }
    }
}
