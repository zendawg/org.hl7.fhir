/*
 * XML Type:  Specimen
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Specimen
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Specimen(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SpecimenImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Specimen
{
    private static final long serialVersionUID = 1L;
    
    public SpecimenImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName SOURCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName SUBJECT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName ACCESSIONIDENTIFIER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "accessionIdentifier");
    private static final javax.xml.namespace.QName RECEIVEDTIME$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "receivedTime");
    private static final javax.xml.namespace.QName COLLECTION$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "collection");
    private static final javax.xml.namespace.QName TREATMENT$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "treatment");
    private static final javax.xml.namespace.QName CONTAINER$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "container");
    
    
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
     * Gets the "type" element
     */
    public org.hl7.fhir.CodeableConcept getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$2, 0);
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
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$2);
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
            get_store().remove_element(TYPE$2, 0);
        }
    }
    
    /**
     * Gets array of all "source" elements
     */
    public org.hl7.fhir.SpecimenSource[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$4, targetList);
            org.hl7.fhir.SpecimenSource[] result = new org.hl7.fhir.SpecimenSource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "source" element
     */
    public org.hl7.fhir.SpecimenSource getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenSource target = null;
            target = (org.hl7.fhir.SpecimenSource)get_store().find_element_user(SOURCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$4);
        }
    }
    
    /**
     * Sets array of all "source" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSourceArray(org.hl7.fhir.SpecimenSource[] sourceArray)
    {
        check_orphaned();
        arraySetterHelper(sourceArray, SOURCE$4);
    }
    
    /**
     * Sets ith "source" element
     */
    public void setSourceArray(int i, org.hl7.fhir.SpecimenSource source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenSource target = null;
            target = (org.hl7.fhir.SpecimenSource)get_store().find_element_user(SOURCE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    public org.hl7.fhir.SpecimenSource insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenSource target = null;
            target = (org.hl7.fhir.SpecimenSource)get_store().insert_element_user(SOURCE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    public org.hl7.fhir.SpecimenSource addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenSource target = null;
            target = (org.hl7.fhir.SpecimenSource)get_store().add_element_user(SOURCE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$4, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$6, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$6);
            return target;
        }
    }
    
    /**
     * Gets the "accessionIdentifier" element
     */
    public org.hl7.fhir.Identifier getAccessionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(ACCESSIONIDENTIFIER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "accessionIdentifier" element
     */
    public boolean isSetAccessionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSIONIDENTIFIER$8) != 0;
        }
    }
    
    /**
     * Sets the "accessionIdentifier" element
     */
    public void setAccessionIdentifier(org.hl7.fhir.Identifier accessionIdentifier)
    {
        generatedSetterHelperImpl(accessionIdentifier, ACCESSIONIDENTIFIER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "accessionIdentifier" element
     */
    public org.hl7.fhir.Identifier addNewAccessionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(ACCESSIONIDENTIFIER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "accessionIdentifier" element
     */
    public void unsetAccessionIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSIONIDENTIFIER$8, 0);
        }
    }
    
    /**
     * Gets the "receivedTime" element
     */
    public org.hl7.fhir.DateTime getReceivedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(RECEIVEDTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "receivedTime" element
     */
    public boolean isSetReceivedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDTIME$10) != 0;
        }
    }
    
    /**
     * Sets the "receivedTime" element
     */
    public void setReceivedTime(org.hl7.fhir.DateTime receivedTime)
    {
        generatedSetterHelperImpl(receivedTime, RECEIVEDTIME$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "receivedTime" element
     */
    public org.hl7.fhir.DateTime addNewReceivedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(RECEIVEDTIME$10);
            return target;
        }
    }
    
    /**
     * Unsets the "receivedTime" element
     */
    public void unsetReceivedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDTIME$10, 0);
        }
    }
    
    /**
     * Gets the "collection" element
     */
    public org.hl7.fhir.SpecimenCollection getCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenCollection target = null;
            target = (org.hl7.fhir.SpecimenCollection)get_store().find_element_user(COLLECTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collection" element
     */
    public void setCollection(org.hl7.fhir.SpecimenCollection collection)
    {
        generatedSetterHelperImpl(collection, COLLECTION$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "collection" element
     */
    public org.hl7.fhir.SpecimenCollection addNewCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenCollection target = null;
            target = (org.hl7.fhir.SpecimenCollection)get_store().add_element_user(COLLECTION$12);
            return target;
        }
    }
    
    /**
     * Gets array of all "treatment" elements
     */
    public org.hl7.fhir.SpecimenTreatment[] getTreatmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TREATMENT$14, targetList);
            org.hl7.fhir.SpecimenTreatment[] result = new org.hl7.fhir.SpecimenTreatment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "treatment" element
     */
    public org.hl7.fhir.SpecimenTreatment getTreatmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenTreatment target = null;
            target = (org.hl7.fhir.SpecimenTreatment)get_store().find_element_user(TREATMENT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "treatment" element
     */
    public int sizeOfTreatmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TREATMENT$14);
        }
    }
    
    /**
     * Sets array of all "treatment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTreatmentArray(org.hl7.fhir.SpecimenTreatment[] treatmentArray)
    {
        check_orphaned();
        arraySetterHelper(treatmentArray, TREATMENT$14);
    }
    
    /**
     * Sets ith "treatment" element
     */
    public void setTreatmentArray(int i, org.hl7.fhir.SpecimenTreatment treatment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenTreatment target = null;
            target = (org.hl7.fhir.SpecimenTreatment)get_store().find_element_user(TREATMENT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(treatment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "treatment" element
     */
    public org.hl7.fhir.SpecimenTreatment insertNewTreatment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenTreatment target = null;
            target = (org.hl7.fhir.SpecimenTreatment)get_store().insert_element_user(TREATMENT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "treatment" element
     */
    public org.hl7.fhir.SpecimenTreatment addNewTreatment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenTreatment target = null;
            target = (org.hl7.fhir.SpecimenTreatment)get_store().add_element_user(TREATMENT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "treatment" element
     */
    public void removeTreatment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TREATMENT$14, i);
        }
    }
    
    /**
     * Gets array of all "container" elements
     */
    public org.hl7.fhir.SpecimenContainer[] getContainerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTAINER$16, targetList);
            org.hl7.fhir.SpecimenContainer[] result = new org.hl7.fhir.SpecimenContainer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "container" element
     */
    public org.hl7.fhir.SpecimenContainer getContainerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenContainer target = null;
            target = (org.hl7.fhir.SpecimenContainer)get_store().find_element_user(CONTAINER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "container" element
     */
    public int sizeOfContainerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINER$16);
        }
    }
    
    /**
     * Sets array of all "container" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContainerArray(org.hl7.fhir.SpecimenContainer[] containerArray)
    {
        check_orphaned();
        arraySetterHelper(containerArray, CONTAINER$16);
    }
    
    /**
     * Sets ith "container" element
     */
    public void setContainerArray(int i, org.hl7.fhir.SpecimenContainer container)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenContainer target = null;
            target = (org.hl7.fhir.SpecimenContainer)get_store().find_element_user(CONTAINER$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(container);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "container" element
     */
    public org.hl7.fhir.SpecimenContainer insertNewContainer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenContainer target = null;
            target = (org.hl7.fhir.SpecimenContainer)get_store().insert_element_user(CONTAINER$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "container" element
     */
    public org.hl7.fhir.SpecimenContainer addNewContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SpecimenContainer target = null;
            target = (org.hl7.fhir.SpecimenContainer)get_store().add_element_user(CONTAINER$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "container" element
     */
    public void removeContainer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINER$16, i);
        }
    }
}
