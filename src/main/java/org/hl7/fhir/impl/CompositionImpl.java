/*
 * XML Type:  Composition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Composition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Composition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CompositionImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Composition
{
    private static final long serialVersionUID = 1L;
    
    public CompositionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName CLASS1$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "class");
    private static final javax.xml.namespace.QName TITLE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "title");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName CONFIDENTIALITY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "confidentiality");
    private static final javax.xml.namespace.QName SUBJECT$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName AUTHOR$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "author");
    private static final javax.xml.namespace.QName ATTESTER$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "attester");
    private static final javax.xml.namespace.QName CUSTODIAN$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "custodian");
    private static final javax.xml.namespace.QName EVENT$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "event");
    private static final javax.xml.namespace.QName ENCOUNTER$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "encounter");
    private static final javax.xml.namespace.QName SECTION$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "section");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.hl7.fhir.Identifier identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, 0);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$2);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.CodeableConcept getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.CodeableConcept addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "class" element
     */
    public org.hl7.fhir.CodeableConcept getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CLASS1$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "class" element
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASS1$6) != 0;
        }
    }
    
    /**
     * Sets the "class" element
     */
    public void setClass1(org.hl7.fhir.CodeableConcept class1)
    {
        generatedSetterHelperImpl(class1, CLASS1$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "class" element
     */
    public org.hl7.fhir.CodeableConcept addNewClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CLASS1$6);
            return target;
        }
    }
    
    /**
     * Unsets the "class" element
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASS1$6, 0);
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
     * Gets the "status" element
     */
    public org.hl7.fhir.CompositionStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionStatus target = null;
            target = (org.hl7.fhir.CompositionStatus)get_store().find_element_user(STATUS$10, 0);
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
    public void setStatus(org.hl7.fhir.CompositionStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.CompositionStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionStatus target = null;
            target = (org.hl7.fhir.CompositionStatus)get_store().add_element_user(STATUS$10);
            return target;
        }
    }
    
    /**
     * Gets the "confidentiality" element
     */
    public org.hl7.fhir.Coding getConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CONFIDENTIALITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "confidentiality" element
     */
    public void setConfidentiality(org.hl7.fhir.Coding confidentiality)
    {
        generatedSetterHelperImpl(confidentiality, CONFIDENTIALITY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "confidentiality" element
     */
    public org.hl7.fhir.Coding addNewConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(CONFIDENTIALITY$12);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$14, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$14);
            return target;
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public org.hl7.fhir.ResourceReference[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$16, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public org.hl7.fhir.ResourceReference getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHOR$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$16);
        }
    }
    
    /**
     * Sets array of all "author" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorArray(org.hl7.fhir.ResourceReference[] authorArray)
    {
        check_orphaned();
        arraySetterHelper(authorArray, AUTHOR$16);
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, org.hl7.fhir.ResourceReference author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHOR$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public org.hl7.fhir.ResourceReference insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(AUTHOR$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHOR$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$16, i);
        }
    }
    
    /**
     * Gets array of all "attester" elements
     */
    public org.hl7.fhir.CompositionAttester[] getAttesterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTESTER$18, targetList);
            org.hl7.fhir.CompositionAttester[] result = new org.hl7.fhir.CompositionAttester[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attester" element
     */
    public org.hl7.fhir.CompositionAttester getAttesterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttester target = null;
            target = (org.hl7.fhir.CompositionAttester)get_store().find_element_user(ATTESTER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attester" element
     */
    public int sizeOfAttesterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTESTER$18);
        }
    }
    
    /**
     * Sets array of all "attester" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAttesterArray(org.hl7.fhir.CompositionAttester[] attesterArray)
    {
        check_orphaned();
        arraySetterHelper(attesterArray, ATTESTER$18);
    }
    
    /**
     * Sets ith "attester" element
     */
    public void setAttesterArray(int i, org.hl7.fhir.CompositionAttester attester)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttester target = null;
            target = (org.hl7.fhir.CompositionAttester)get_store().find_element_user(ATTESTER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attester);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attester" element
     */
    public org.hl7.fhir.CompositionAttester insertNewAttester(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttester target = null;
            target = (org.hl7.fhir.CompositionAttester)get_store().insert_element_user(ATTESTER$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attester" element
     */
    public org.hl7.fhir.CompositionAttester addNewAttester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionAttester target = null;
            target = (org.hl7.fhir.CompositionAttester)get_store().add_element_user(ATTESTER$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "attester" element
     */
    public void removeAttester(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTESTER$18, i);
        }
    }
    
    /**
     * Gets the "custodian" element
     */
    public org.hl7.fhir.ResourceReference getCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CUSTODIAN$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custodian" element
     */
    public boolean isSetCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTODIAN$20) != 0;
        }
    }
    
    /**
     * Sets the "custodian" element
     */
    public void setCustodian(org.hl7.fhir.ResourceReference custodian)
    {
        generatedSetterHelperImpl(custodian, CUSTODIAN$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    public org.hl7.fhir.ResourceReference addNewCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(CUSTODIAN$20);
            return target;
        }
    }
    
    /**
     * Unsets the "custodian" element
     */
    public void unsetCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTODIAN$20, 0);
        }
    }
    
    /**
     * Gets the "event" element
     */
    public org.hl7.fhir.CompositionEvent getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionEvent target = null;
            target = (org.hl7.fhir.CompositionEvent)get_store().find_element_user(EVENT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "event" element
     */
    public boolean isSetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$22) != 0;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(org.hl7.fhir.CompositionEvent event)
    {
        generatedSetterHelperImpl(event, EVENT$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public org.hl7.fhir.CompositionEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CompositionEvent target = null;
            target = (org.hl7.fhir.CompositionEvent)get_store().add_element_user(EVENT$22);
            return target;
        }
    }
    
    /**
     * Unsets the "event" element
     */
    public void unsetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$22, 0);
        }
    }
    
    /**
     * Gets the "encounter" element
     */
    public org.hl7.fhir.ResourceReference getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENCOUNTER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encounter" element
     */
    public boolean isSetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTER$24) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(org.hl7.fhir.ResourceReference encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    public org.hl7.fhir.ResourceReference addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENCOUNTER$24);
            return target;
        }
    }
    
    /**
     * Unsets the "encounter" element
     */
    public void unsetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTER$24, 0);
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
            get_store().find_all_element_users(SECTION$26, targetList);
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
            target = (org.hl7.fhir.CompositionSection)get_store().find_element_user(SECTION$26, i);
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
            return get_store().count_elements(SECTION$26);
        }
    }
    
    /**
     * Sets array of all "section" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSectionArray(org.hl7.fhir.CompositionSection[] sectionArray)
    {
        check_orphaned();
        arraySetterHelper(sectionArray, SECTION$26);
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
            target = (org.hl7.fhir.CompositionSection)get_store().find_element_user(SECTION$26, i);
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
            target = (org.hl7.fhir.CompositionSection)get_store().insert_element_user(SECTION$26, i);
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
            target = (org.hl7.fhir.CompositionSection)get_store().add_element_user(SECTION$26);
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
            get_store().remove_element(SECTION$26, i);
        }
    }
}
