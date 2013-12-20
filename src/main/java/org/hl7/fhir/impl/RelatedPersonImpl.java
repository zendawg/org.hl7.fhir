/*
 * XML Type:  RelatedPerson
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.RelatedPerson
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML RelatedPerson(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class RelatedPersonImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.RelatedPerson
{
    private static final long serialVersionUID = 1L;
    
    public RelatedPersonImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName PATIENT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "patient");
    private static final javax.xml.namespace.QName RELATIONSHIP$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "relationship");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName TELECOM$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "telecom");
    private static final javax.xml.namespace.QName GENDER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "gender");
    private static final javax.xml.namespace.QName ADDRESS$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "address");
    private static final javax.xml.namespace.QName PHOTO$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "photo");
    
    
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
     * Gets the "patient" element
     */
    public org.hl7.fhir.ResourceReference getPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PATIENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "patient" element
     */
    public void setPatient(org.hl7.fhir.ResourceReference patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "patient" element
     */
    public org.hl7.fhir.ResourceReference addNewPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PATIENT$2);
            return target;
        }
    }
    
    /**
     * Gets the "relationship" element
     */
    public org.hl7.fhir.CodeableConcept getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(RELATIONSHIP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relationship" element
     */
    public boolean isSetRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIP$4) != 0;
        }
    }
    
    /**
     * Sets the "relationship" element
     */
    public void setRelationship(org.hl7.fhir.CodeableConcept relationship)
    {
        generatedSetterHelperImpl(relationship, RELATIONSHIP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    public org.hl7.fhir.CodeableConcept addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(RELATIONSHIP$4);
            return target;
        }
    }
    
    /**
     * Unsets the "relationship" element
     */
    public void unsetRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIP$4, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.HumanName getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(NAME$6, 0);
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
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.HumanName name)
    {
        generatedSetterHelperImpl(name, NAME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.HumanName addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().add_element_user(NAME$6);
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
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets array of all "telecom" elements
     */
    public org.hl7.fhir.Contact[] getTelecomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELECOM$8, targetList);
            org.hl7.fhir.Contact[] result = new org.hl7.fhir.Contact[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "telecom" element
     */
    public org.hl7.fhir.Contact getTelecomArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(TELECOM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "telecom" element
     */
    public int sizeOfTelecomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELECOM$8);
        }
    }
    
    /**
     * Sets array of all "telecom" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTelecomArray(org.hl7.fhir.Contact[] telecomArray)
    {
        check_orphaned();
        arraySetterHelper(telecomArray, TELECOM$8);
    }
    
    /**
     * Sets ith "telecom" element
     */
    public void setTelecomArray(int i, org.hl7.fhir.Contact telecom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(TELECOM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telecom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "telecom" element
     */
    public org.hl7.fhir.Contact insertNewTelecom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().insert_element_user(TELECOM$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "telecom" element
     */
    public org.hl7.fhir.Contact addNewTelecom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().add_element_user(TELECOM$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "telecom" element
     */
    public void removeTelecom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELECOM$8, i);
        }
    }
    
    /**
     * Gets the "gender" element
     */
    public org.hl7.fhir.CodeableConcept getGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(GENDER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gender" element
     */
    public boolean isSetGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENDER$10) != 0;
        }
    }
    
    /**
     * Sets the "gender" element
     */
    public void setGender(org.hl7.fhir.CodeableConcept gender)
    {
        generatedSetterHelperImpl(gender, GENDER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "gender" element
     */
    public org.hl7.fhir.CodeableConcept addNewGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(GENDER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "gender" element
     */
    public void unsetGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENDER$10, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public org.hl7.fhir.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(ADDRESS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$12) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(org.hl7.fhir.Address address)
    {
        generatedSetterHelperImpl(address, ADDRESS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public org.hl7.fhir.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().add_element_user(ADDRESS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$12, 0);
        }
    }
    
    /**
     * Gets array of all "photo" elements
     */
    public org.hl7.fhir.Attachment[] getPhotoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHOTO$14, targetList);
            org.hl7.fhir.Attachment[] result = new org.hl7.fhir.Attachment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "photo" element
     */
    public org.hl7.fhir.Attachment getPhotoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PHOTO$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "photo" element
     */
    public int sizeOfPhotoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHOTO$14);
        }
    }
    
    /**
     * Sets array of all "photo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPhotoArray(org.hl7.fhir.Attachment[] photoArray)
    {
        check_orphaned();
        arraySetterHelper(photoArray, PHOTO$14);
    }
    
    /**
     * Sets ith "photo" element
     */
    public void setPhotoArray(int i, org.hl7.fhir.Attachment photo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PHOTO$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(photo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "photo" element
     */
    public org.hl7.fhir.Attachment insertNewPhoto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().insert_element_user(PHOTO$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "photo" element
     */
    public org.hl7.fhir.Attachment addNewPhoto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(PHOTO$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "photo" element
     */
    public void removePhoto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHOTO$14, i);
        }
    }
}
