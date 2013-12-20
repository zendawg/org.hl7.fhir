/*
 * XML Type:  Condition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Condition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Condition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConditionImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Condition
{
    private static final long serialVersionUID = 1L;
    
    public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName ENCOUNTER$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "encounter");
    private static final javax.xml.namespace.QName ASSERTER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "asserter");
    private static final javax.xml.namespace.QName DATEASSERTED$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dateAsserted");
    private static final javax.xml.namespace.QName CODE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName CATEGORY$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "category");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName CERTAINTY$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "certainty");
    private static final javax.xml.namespace.QName SEVERITY$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "severity");
    private static final javax.xml.namespace.QName ONSETDATE$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "onsetDate");
    private static final javax.xml.namespace.QName ONSETAGE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "onsetAge");
    private static final javax.xml.namespace.QName ABATEMENTDATE$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "abatementDate");
    private static final javax.xml.namespace.QName ABATEMENTAGE$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "abatementAge");
    private static final javax.xml.namespace.QName ABATEMENTBOOLEAN$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "abatementBoolean");
    private static final javax.xml.namespace.QName STAGE$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "stage");
    private static final javax.xml.namespace.QName EVIDENCE$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "evidence");
    private static final javax.xml.namespace.QName LOCATION$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName RELATEDITEM$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "relatedItem");
    private static final javax.xml.namespace.QName NOTES$38 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "notes");
    
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            org.hl7.fhir.Identifier[] result = new org.hl7.fhir.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$0);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.hl7.fhir.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.hl7.fhir.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
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
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
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
     * Gets the "encounter" element
     */
    public org.hl7.fhir.ResourceReference getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENCOUNTER$4, 0);
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
            return get_store().count_elements(ENCOUNTER$4) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(org.hl7.fhir.ResourceReference encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENCOUNTER$4);
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
            get_store().remove_element(ENCOUNTER$4, 0);
        }
    }
    
    /**
     * Gets the "asserter" element
     */
    public org.hl7.fhir.ResourceReference getAsserter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ASSERTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "asserter" element
     */
    public boolean isSetAsserter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSERTER$6) != 0;
        }
    }
    
    /**
     * Sets the "asserter" element
     */
    public void setAsserter(org.hl7.fhir.ResourceReference asserter)
    {
        generatedSetterHelperImpl(asserter, ASSERTER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "asserter" element
     */
    public org.hl7.fhir.ResourceReference addNewAsserter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ASSERTER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "asserter" element
     */
    public void unsetAsserter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSERTER$6, 0);
        }
    }
    
    /**
     * Gets the "dateAsserted" element
     */
    public org.hl7.fhir.Date getDateAsserted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(DATEASSERTED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dateAsserted" element
     */
    public boolean isSetDateAsserted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEASSERTED$8) != 0;
        }
    }
    
    /**
     * Sets the "dateAsserted" element
     */
    public void setDateAsserted(org.hl7.fhir.Date dateAsserted)
    {
        generatedSetterHelperImpl(dateAsserted, DATEASSERTED$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateAsserted" element
     */
    public org.hl7.fhir.Date addNewDateAsserted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(DATEASSERTED$8);
            return target;
        }
    }
    
    /**
     * Unsets the "dateAsserted" element
     */
    public void unsetDateAsserted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEASSERTED$8, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$10, 0);
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
        generatedSetterHelperImpl(code, CODE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$10);
            return target;
        }
    }
    
    /**
     * Gets the "category" element
     */
    public org.hl7.fhir.CodeableConcept getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CATEGORY$12, 0);
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
            return get_store().count_elements(CATEGORY$12) != 0;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.hl7.fhir.CodeableConcept category)
    {
        generatedSetterHelperImpl(category, CATEGORY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CATEGORY$12);
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
            get_store().remove_element(CATEGORY$12, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.ConditionStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionStatus target = null;
            target = (org.hl7.fhir.ConditionStatus)get_store().find_element_user(STATUS$14, 0);
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
    public void setStatus(org.hl7.fhir.ConditionStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.ConditionStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionStatus target = null;
            target = (org.hl7.fhir.ConditionStatus)get_store().add_element_user(STATUS$14);
            return target;
        }
    }
    
    /**
     * Gets the "certainty" element
     */
    public org.hl7.fhir.CodeableConcept getCertainty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CERTAINTY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "certainty" element
     */
    public boolean isSetCertainty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CERTAINTY$16) != 0;
        }
    }
    
    /**
     * Sets the "certainty" element
     */
    public void setCertainty(org.hl7.fhir.CodeableConcept certainty)
    {
        generatedSetterHelperImpl(certainty, CERTAINTY$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "certainty" element
     */
    public org.hl7.fhir.CodeableConcept addNewCertainty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CERTAINTY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "certainty" element
     */
    public void unsetCertainty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CERTAINTY$16, 0);
        }
    }
    
    /**
     * Gets the "severity" element
     */
    public org.hl7.fhir.CodeableConcept getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SEVERITY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "severity" element
     */
    public boolean isSetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEVERITY$18) != 0;
        }
    }
    
    /**
     * Sets the "severity" element
     */
    public void setSeverity(org.hl7.fhir.CodeableConcept severity)
    {
        generatedSetterHelperImpl(severity, SEVERITY$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "severity" element
     */
    public org.hl7.fhir.CodeableConcept addNewSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SEVERITY$18);
            return target;
        }
    }
    
    /**
     * Unsets the "severity" element
     */
    public void unsetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEVERITY$18, 0);
        }
    }
    
    /**
     * Gets the "onsetDate" element
     */
    public org.hl7.fhir.Date getOnsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(ONSETDATE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "onsetDate" element
     */
    public boolean isSetOnsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONSETDATE$20) != 0;
        }
    }
    
    /**
     * Sets the "onsetDate" element
     */
    public void setOnsetDate(org.hl7.fhir.Date onsetDate)
    {
        generatedSetterHelperImpl(onsetDate, ONSETDATE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "onsetDate" element
     */
    public org.hl7.fhir.Date addNewOnsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(ONSETDATE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "onsetDate" element
     */
    public void unsetOnsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONSETDATE$20, 0);
        }
    }
    
    /**
     * Gets the "onsetAge" element
     */
    public org.hl7.fhir.Age getOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().find_element_user(ONSETAGE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "onsetAge" element
     */
    public boolean isSetOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONSETAGE$22) != 0;
        }
    }
    
    /**
     * Sets the "onsetAge" element
     */
    public void setOnsetAge(org.hl7.fhir.Age onsetAge)
    {
        generatedSetterHelperImpl(onsetAge, ONSETAGE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "onsetAge" element
     */
    public org.hl7.fhir.Age addNewOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().add_element_user(ONSETAGE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "onsetAge" element
     */
    public void unsetOnsetAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONSETAGE$22, 0);
        }
    }
    
    /**
     * Gets the "abatementDate" element
     */
    public org.hl7.fhir.Date getAbatementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(ABATEMENTDATE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "abatementDate" element
     */
    public boolean isSetAbatementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABATEMENTDATE$24) != 0;
        }
    }
    
    /**
     * Sets the "abatementDate" element
     */
    public void setAbatementDate(org.hl7.fhir.Date abatementDate)
    {
        generatedSetterHelperImpl(abatementDate, ABATEMENTDATE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abatementDate" element
     */
    public org.hl7.fhir.Date addNewAbatementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(ABATEMENTDATE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "abatementDate" element
     */
    public void unsetAbatementDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABATEMENTDATE$24, 0);
        }
    }
    
    /**
     * Gets the "abatementAge" element
     */
    public org.hl7.fhir.Age getAbatementAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().find_element_user(ABATEMENTAGE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "abatementAge" element
     */
    public boolean isSetAbatementAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABATEMENTAGE$26) != 0;
        }
    }
    
    /**
     * Sets the "abatementAge" element
     */
    public void setAbatementAge(org.hl7.fhir.Age abatementAge)
    {
        generatedSetterHelperImpl(abatementAge, ABATEMENTAGE$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abatementAge" element
     */
    public org.hl7.fhir.Age addNewAbatementAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Age target = null;
            target = (org.hl7.fhir.Age)get_store().add_element_user(ABATEMENTAGE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "abatementAge" element
     */
    public void unsetAbatementAge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABATEMENTAGE$26, 0);
        }
    }
    
    /**
     * Gets the "abatementBoolean" element
     */
    public org.hl7.fhir.Boolean getAbatementBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ABATEMENTBOOLEAN$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "abatementBoolean" element
     */
    public boolean isSetAbatementBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABATEMENTBOOLEAN$28) != 0;
        }
    }
    
    /**
     * Sets the "abatementBoolean" element
     */
    public void setAbatementBoolean(org.hl7.fhir.Boolean abatementBoolean)
    {
        generatedSetterHelperImpl(abatementBoolean, ABATEMENTBOOLEAN$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abatementBoolean" element
     */
    public org.hl7.fhir.Boolean addNewAbatementBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ABATEMENTBOOLEAN$28);
            return target;
        }
    }
    
    /**
     * Unsets the "abatementBoolean" element
     */
    public void unsetAbatementBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABATEMENTBOOLEAN$28, 0);
        }
    }
    
    /**
     * Gets the "stage" element
     */
    public org.hl7.fhir.ConditionStage getStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionStage target = null;
            target = (org.hl7.fhir.ConditionStage)get_store().find_element_user(STAGE$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stage" element
     */
    public boolean isSetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STAGE$30) != 0;
        }
    }
    
    /**
     * Sets the "stage" element
     */
    public void setStage(org.hl7.fhir.ConditionStage stage)
    {
        generatedSetterHelperImpl(stage, STAGE$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "stage" element
     */
    public org.hl7.fhir.ConditionStage addNewStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionStage target = null;
            target = (org.hl7.fhir.ConditionStage)get_store().add_element_user(STAGE$30);
            return target;
        }
    }
    
    /**
     * Unsets the "stage" element
     */
    public void unsetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STAGE$30, 0);
        }
    }
    
    /**
     * Gets array of all "evidence" elements
     */
    public org.hl7.fhir.ConditionEvidence[] getEvidenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVIDENCE$32, targetList);
            org.hl7.fhir.ConditionEvidence[] result = new org.hl7.fhir.ConditionEvidence[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "evidence" element
     */
    public org.hl7.fhir.ConditionEvidence getEvidenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionEvidence target = null;
            target = (org.hl7.fhir.ConditionEvidence)get_store().find_element_user(EVIDENCE$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "evidence" element
     */
    public int sizeOfEvidenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVIDENCE$32);
        }
    }
    
    /**
     * Sets array of all "evidence" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEvidenceArray(org.hl7.fhir.ConditionEvidence[] evidenceArray)
    {
        check_orphaned();
        arraySetterHelper(evidenceArray, EVIDENCE$32);
    }
    
    /**
     * Sets ith "evidence" element
     */
    public void setEvidenceArray(int i, org.hl7.fhir.ConditionEvidence evidence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionEvidence target = null;
            target = (org.hl7.fhir.ConditionEvidence)get_store().find_element_user(EVIDENCE$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(evidence);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "evidence" element
     */
    public org.hl7.fhir.ConditionEvidence insertNewEvidence(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionEvidence target = null;
            target = (org.hl7.fhir.ConditionEvidence)get_store().insert_element_user(EVIDENCE$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "evidence" element
     */
    public org.hl7.fhir.ConditionEvidence addNewEvidence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionEvidence target = null;
            target = (org.hl7.fhir.ConditionEvidence)get_store().add_element_user(EVIDENCE$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "evidence" element
     */
    public void removeEvidence(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVIDENCE$32, i);
        }
    }
    
    /**
     * Gets array of all "location" elements
     */
    public org.hl7.fhir.ConditionLocation[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$34, targetList);
            org.hl7.fhir.ConditionLocation[] result = new org.hl7.fhir.ConditionLocation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.hl7.fhir.ConditionLocation getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionLocation target = null;
            target = (org.hl7.fhir.ConditionLocation)get_store().find_element_user(LOCATION$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$34);
        }
    }
    
    /**
     * Sets array of all "location" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocationArray(org.hl7.fhir.ConditionLocation[] locationArray)
    {
        check_orphaned();
        arraySetterHelper(locationArray, LOCATION$34);
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.hl7.fhir.ConditionLocation location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionLocation target = null;
            target = (org.hl7.fhir.ConditionLocation)get_store().find_element_user(LOCATION$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    public org.hl7.fhir.ConditionLocation insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionLocation target = null;
            target = (org.hl7.fhir.ConditionLocation)get_store().insert_element_user(LOCATION$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.hl7.fhir.ConditionLocation addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionLocation target = null;
            target = (org.hl7.fhir.ConditionLocation)get_store().add_element_user(LOCATION$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$34, i);
        }
    }
    
    /**
     * Gets array of all "relatedItem" elements
     */
    public org.hl7.fhir.ConditionRelatedItem[] getRelatedItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDITEM$36, targetList);
            org.hl7.fhir.ConditionRelatedItem[] result = new org.hl7.fhir.ConditionRelatedItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedItem" element
     */
    public org.hl7.fhir.ConditionRelatedItem getRelatedItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionRelatedItem target = null;
            target = (org.hl7.fhir.ConditionRelatedItem)get_store().find_element_user(RELATEDITEM$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedItem" element
     */
    public int sizeOfRelatedItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDITEM$36);
        }
    }
    
    /**
     * Sets array of all "relatedItem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedItemArray(org.hl7.fhir.ConditionRelatedItem[] relatedItemArray)
    {
        check_orphaned();
        arraySetterHelper(relatedItemArray, RELATEDITEM$36);
    }
    
    /**
     * Sets ith "relatedItem" element
     */
    public void setRelatedItemArray(int i, org.hl7.fhir.ConditionRelatedItem relatedItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionRelatedItem target = null;
            target = (org.hl7.fhir.ConditionRelatedItem)get_store().find_element_user(RELATEDITEM$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedItem" element
     */
    public org.hl7.fhir.ConditionRelatedItem insertNewRelatedItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionRelatedItem target = null;
            target = (org.hl7.fhir.ConditionRelatedItem)get_store().insert_element_user(RELATEDITEM$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedItem" element
     */
    public org.hl7.fhir.ConditionRelatedItem addNewRelatedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConditionRelatedItem target = null;
            target = (org.hl7.fhir.ConditionRelatedItem)get_store().add_element_user(RELATEDITEM$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedItem" element
     */
    public void removeRelatedItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDITEM$36, i);
        }
    }
    
    /**
     * Gets the "notes" element
     */
    public org.hl7.fhir.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTES$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notes" element
     */
    public boolean isSetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$38) != 0;
        }
    }
    
    /**
     * Sets the "notes" element
     */
    public void setNotes(org.hl7.fhir.String notes)
    {
        generatedSetterHelperImpl(notes, NOTES$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "notes" element
     */
    public org.hl7.fhir.String addNewNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTES$38);
            return target;
        }
    }
    
    /**
     * Unsets the "notes" element
     */
    public void unsetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$38, 0);
        }
    }
}
