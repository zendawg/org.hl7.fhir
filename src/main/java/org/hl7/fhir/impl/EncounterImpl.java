/*
 * XML Type:  Encounter
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Encounter
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Encounter(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class EncounterImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Encounter
{
    private static final long serialVersionUID = 1L;
    
    public EncounterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName CLASS1$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "class");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName SUBJECT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName PARTICIPANT$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "participant");
    private static final javax.xml.namespace.QName PERIOD$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName LENGTH$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "length");
    private static final javax.xml.namespace.QName REASON$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reason");
    private static final javax.xml.namespace.QName INDICATION$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "indication");
    private static final javax.xml.namespace.QName PRIORITY$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "priority");
    private static final javax.xml.namespace.QName HOSPITALIZATION$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "hospitalization");
    private static final javax.xml.namespace.QName LOCATION$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName SERVICEPROVIDER$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "serviceProvider");
    private static final javax.xml.namespace.QName PARTOF$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "partOf");
    
    
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
     * Gets the "status" element
     */
    public org.hl7.fhir.EncounterState getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterState target = null;
            target = (org.hl7.fhir.EncounterState)get_store().find_element_user(STATUS$2, 0);
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
    public void setStatus(org.hl7.fhir.EncounterState status)
    {
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.EncounterState addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterState target = null;
            target = (org.hl7.fhir.EncounterState)get_store().add_element_user(STATUS$2);
            return target;
        }
    }
    
    /**
     * Gets the "class" element
     */
    public org.hl7.fhir.EncounterClass getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterClass target = null;
            target = (org.hl7.fhir.EncounterClass)get_store().find_element_user(CLASS1$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "class" element
     */
    public void setClass1(org.hl7.fhir.EncounterClass class1)
    {
        generatedSetterHelperImpl(class1, CLASS1$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "class" element
     */
    public org.hl7.fhir.EncounterClass addNewClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterClass target = null;
            target = (org.hl7.fhir.EncounterClass)get_store().add_element_user(CLASS1$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "type" elements
     */
    public org.hl7.fhir.CodeableConcept[] getTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPE$6, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "type" element
     */
    public org.hl7.fhir.CodeableConcept getTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "type" element
     */
    public int sizeOfTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$6);
        }
    }
    
    /**
     * Sets array of all "type" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTypeArray(org.hl7.fhir.CodeableConcept[] typeArray)
    {
        check_orphaned();
        arraySetterHelper(typeArray, TYPE$6);
    }
    
    /**
     * Sets ith "type" element
     */
    public void setTypeArray(int i, org.hl7.fhir.CodeableConcept type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(type);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    public org.hl7.fhir.CodeableConcept insertNewType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(TYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    public org.hl7.fhir.CodeableConcept addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "type" element
     */
    public void removeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$6, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$8, 0);
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
            return get_store().count_elements(SUBJECT$8) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$8);
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
            get_store().remove_element(SUBJECT$8, 0);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public org.hl7.fhir.EncounterParticipant[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$10, targetList);
            org.hl7.fhir.EncounterParticipant[] result = new org.hl7.fhir.EncounterParticipant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public org.hl7.fhir.EncounterParticipant getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterParticipant target = null;
            target = (org.hl7.fhir.EncounterParticipant)get_store().find_element_user(PARTICIPANT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participant" element
     */
    public int sizeOfParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANT$10);
        }
    }
    
    /**
     * Sets array of all "participant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantArray(org.hl7.fhir.EncounterParticipant[] participantArray)
    {
        check_orphaned();
        arraySetterHelper(participantArray, PARTICIPANT$10);
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, org.hl7.fhir.EncounterParticipant participant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterParticipant target = null;
            target = (org.hl7.fhir.EncounterParticipant)get_store().find_element_user(PARTICIPANT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(participant);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public org.hl7.fhir.EncounterParticipant insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterParticipant target = null;
            target = (org.hl7.fhir.EncounterParticipant)get_store().insert_element_user(PARTICIPANT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public org.hl7.fhir.EncounterParticipant addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterParticipant target = null;
            target = (org.hl7.fhir.EncounterParticipant)get_store().add_element_user(PARTICIPANT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "participant" element
     */
    public void removeParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANT$10, i);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$12) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$12);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$12, 0);
        }
    }
    
    /**
     * Gets the "length" element
     */
    public org.hl7.fhir.Duration getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Duration target = null;
            target = (org.hl7.fhir.Duration)get_store().find_element_user(LENGTH$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "length" element
     */
    public boolean isSetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LENGTH$14) != 0;
        }
    }
    
    /**
     * Sets the "length" element
     */
    public void setLength(org.hl7.fhir.Duration length)
    {
        generatedSetterHelperImpl(length, LENGTH$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "length" element
     */
    public org.hl7.fhir.Duration addNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Duration target = null;
            target = (org.hl7.fhir.Duration)get_store().add_element_user(LENGTH$14);
            return target;
        }
    }
    
    /**
     * Unsets the "length" element
     */
    public void unsetLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LENGTH$14, 0);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public org.hl7.fhir.CodeableConcept getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reason" element
     */
    public boolean isSetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$16) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(org.hl7.fhir.CodeableConcept reason)
    {
        generatedSetterHelperImpl(reason, REASON$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reason" element
     */
    public org.hl7.fhir.CodeableConcept addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REASON$16);
            return target;
        }
    }
    
    /**
     * Unsets the "reason" element
     */
    public void unsetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$16, 0);
        }
    }
    
    /**
     * Gets the "indication" element
     */
    public org.hl7.fhir.ResourceReference getIndication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(INDICATION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "indication" element
     */
    public boolean isSetIndication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDICATION$18) != 0;
        }
    }
    
    /**
     * Sets the "indication" element
     */
    public void setIndication(org.hl7.fhir.ResourceReference indication)
    {
        generatedSetterHelperImpl(indication, INDICATION$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indication" element
     */
    public org.hl7.fhir.ResourceReference addNewIndication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(INDICATION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "indication" element
     */
    public void unsetIndication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDICATION$18, 0);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public org.hl7.fhir.CodeableConcept getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(PRIORITY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$20) != 0;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(org.hl7.fhir.CodeableConcept priority)
    {
        generatedSetterHelperImpl(priority, PRIORITY$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "priority" element
     */
    public org.hl7.fhir.CodeableConcept addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(PRIORITY$20);
            return target;
        }
    }
    
    /**
     * Unsets the "priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$20, 0);
        }
    }
    
    /**
     * Gets the "hospitalization" element
     */
    public org.hl7.fhir.EncounterHospitalization getHospitalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterHospitalization target = null;
            target = (org.hl7.fhir.EncounterHospitalization)get_store().find_element_user(HOSPITALIZATION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hospitalization" element
     */
    public boolean isSetHospitalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOSPITALIZATION$22) != 0;
        }
    }
    
    /**
     * Sets the "hospitalization" element
     */
    public void setHospitalization(org.hl7.fhir.EncounterHospitalization hospitalization)
    {
        generatedSetterHelperImpl(hospitalization, HOSPITALIZATION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "hospitalization" element
     */
    public org.hl7.fhir.EncounterHospitalization addNewHospitalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterHospitalization target = null;
            target = (org.hl7.fhir.EncounterHospitalization)get_store().add_element_user(HOSPITALIZATION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "hospitalization" element
     */
    public void unsetHospitalization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOSPITALIZATION$22, 0);
        }
    }
    
    /**
     * Gets array of all "location" elements
     */
    public org.hl7.fhir.EncounterLocation[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$24, targetList);
            org.hl7.fhir.EncounterLocation[] result = new org.hl7.fhir.EncounterLocation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.hl7.fhir.EncounterLocation getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterLocation target = null;
            target = (org.hl7.fhir.EncounterLocation)get_store().find_element_user(LOCATION$24, i);
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
            return get_store().count_elements(LOCATION$24);
        }
    }
    
    /**
     * Sets array of all "location" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocationArray(org.hl7.fhir.EncounterLocation[] locationArray)
    {
        check_orphaned();
        arraySetterHelper(locationArray, LOCATION$24);
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.hl7.fhir.EncounterLocation location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterLocation target = null;
            target = (org.hl7.fhir.EncounterLocation)get_store().find_element_user(LOCATION$24, i);
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
    public org.hl7.fhir.EncounterLocation insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterLocation target = null;
            target = (org.hl7.fhir.EncounterLocation)get_store().insert_element_user(LOCATION$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.hl7.fhir.EncounterLocation addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.EncounterLocation target = null;
            target = (org.hl7.fhir.EncounterLocation)get_store().add_element_user(LOCATION$24);
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
            get_store().remove_element(LOCATION$24, i);
        }
    }
    
    /**
     * Gets the "serviceProvider" element
     */
    public org.hl7.fhir.ResourceReference getServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SERVICEPROVIDER$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serviceProvider" element
     */
    public boolean isSetServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEPROVIDER$26) != 0;
        }
    }
    
    /**
     * Sets the "serviceProvider" element
     */
    public void setServiceProvider(org.hl7.fhir.ResourceReference serviceProvider)
    {
        generatedSetterHelperImpl(serviceProvider, SERVICEPROVIDER$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serviceProvider" element
     */
    public org.hl7.fhir.ResourceReference addNewServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SERVICEPROVIDER$26);
            return target;
        }
    }
    
    /**
     * Unsets the "serviceProvider" element
     */
    public void unsetServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEPROVIDER$26, 0);
        }
    }
    
    /**
     * Gets the "partOf" element
     */
    public org.hl7.fhir.ResourceReference getPartOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PARTOF$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "partOf" element
     */
    public boolean isSetPartOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTOF$28) != 0;
        }
    }
    
    /**
     * Sets the "partOf" element
     */
    public void setPartOf(org.hl7.fhir.ResourceReference partOf)
    {
        generatedSetterHelperImpl(partOf, PARTOF$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "partOf" element
     */
    public org.hl7.fhir.ResourceReference addNewPartOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PARTOF$28);
            return target;
        }
    }
    
    /**
     * Unsets the "partOf" element
     */
    public void unsetPartOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTOF$28, 0);
        }
    }
}
