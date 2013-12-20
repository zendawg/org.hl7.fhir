/*
 * XML Type:  Practitioner
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Practitioner
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Practitioner(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class PractitionerImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Practitioner
{
    private static final long serialVersionUID = 1L;
    
    public PractitionerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName TELECOM$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "telecom");
    private static final javax.xml.namespace.QName ADDRESS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "address");
    private static final javax.xml.namespace.QName GENDER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "gender");
    private static final javax.xml.namespace.QName BIRTHDATE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "birthDate");
    private static final javax.xml.namespace.QName PHOTO$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "photo");
    private static final javax.xml.namespace.QName ORGANIZATION$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "organization");
    private static final javax.xml.namespace.QName ROLE$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "role");
    private static final javax.xml.namespace.QName SPECIALTY$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specialty");
    private static final javax.xml.namespace.QName PERIOD$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName LOCATION$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName QUALIFICATION$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "qualification");
    private static final javax.xml.namespace.QName COMMUNICATION$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "communication");
    
    
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
     * Gets the "name" element
     */
    public org.hl7.fhir.HumanName getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(NAME$2, 0);
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
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.HumanName name)
    {
        generatedSetterHelperImpl(name, NAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.HumanName)get_store().add_element_user(NAME$2);
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
            get_store().remove_element(NAME$2, 0);
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
            get_store().find_all_element_users(TELECOM$4, targetList);
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
            target = (org.hl7.fhir.Contact)get_store().find_element_user(TELECOM$4, i);
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
            return get_store().count_elements(TELECOM$4);
        }
    }
    
    /**
     * Sets array of all "telecom" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTelecomArray(org.hl7.fhir.Contact[] telecomArray)
    {
        check_orphaned();
        arraySetterHelper(telecomArray, TELECOM$4);
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
            target = (org.hl7.fhir.Contact)get_store().find_element_user(TELECOM$4, i);
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
            target = (org.hl7.fhir.Contact)get_store().insert_element_user(TELECOM$4, i);
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
            target = (org.hl7.fhir.Contact)get_store().add_element_user(TELECOM$4);
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
            get_store().remove_element(TELECOM$4, i);
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
            target = (org.hl7.fhir.Address)get_store().find_element_user(ADDRESS$6, 0);
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
            return get_store().count_elements(ADDRESS$6) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(org.hl7.fhir.Address address)
    {
        generatedSetterHelperImpl(address, ADDRESS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Address)get_store().add_element_user(ADDRESS$6);
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
            get_store().remove_element(ADDRESS$6, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(GENDER$8, 0);
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
            return get_store().count_elements(GENDER$8) != 0;
        }
    }
    
    /**
     * Sets the "gender" element
     */
    public void setGender(org.hl7.fhir.CodeableConcept gender)
    {
        generatedSetterHelperImpl(gender, GENDER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(GENDER$8);
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
            get_store().remove_element(GENDER$8, 0);
        }
    }
    
    /**
     * Gets the "birthDate" element
     */
    public org.hl7.fhir.DateTime getBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(BIRTHDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "birthDate" element
     */
    public boolean isSetBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "birthDate" element
     */
    public void setBirthDate(org.hl7.fhir.DateTime birthDate)
    {
        generatedSetterHelperImpl(birthDate, BIRTHDATE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "birthDate" element
     */
    public org.hl7.fhir.DateTime addNewBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(BIRTHDATE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "birthDate" element
     */
    public void unsetBirthDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHDATE$10, 0);
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
            get_store().find_all_element_users(PHOTO$12, targetList);
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
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PHOTO$12, i);
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
            return get_store().count_elements(PHOTO$12);
        }
    }
    
    /**
     * Sets array of all "photo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPhotoArray(org.hl7.fhir.Attachment[] photoArray)
    {
        check_orphaned();
        arraySetterHelper(photoArray, PHOTO$12);
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
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PHOTO$12, i);
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
            target = (org.hl7.fhir.Attachment)get_store().insert_element_user(PHOTO$12, i);
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
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(PHOTO$12);
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
            get_store().remove_element(PHOTO$12, i);
        }
    }
    
    /**
     * Gets the "organization" element
     */
    public org.hl7.fhir.ResourceReference getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ORGANIZATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organization" element
     */
    public boolean isSetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATION$14) != 0;
        }
    }
    
    /**
     * Sets the "organization" element
     */
    public void setOrganization(org.hl7.fhir.ResourceReference organization)
    {
        generatedSetterHelperImpl(organization, ORGANIZATION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "organization" element
     */
    public org.hl7.fhir.ResourceReference addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ORGANIZATION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "organization" element
     */
    public void unsetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATION$14, 0);
        }
    }
    
    /**
     * Gets array of all "role" elements
     */
    public org.hl7.fhir.CodeableConcept[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$16, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role" element
     */
    public org.hl7.fhir.CodeableConcept getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROLE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$16);
        }
    }
    
    /**
     * Sets array of all "role" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRoleArray(org.hl7.fhir.CodeableConcept[] roleArray)
    {
        check_orphaned();
        arraySetterHelper(roleArray, ROLE$16);
    }
    
    /**
     * Sets ith "role" element
     */
    public void setRoleArray(int i, org.hl7.fhir.CodeableConcept role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROLE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role" element
     */
    public org.hl7.fhir.CodeableConcept insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(ROLE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role" element
     */
    public org.hl7.fhir.CodeableConcept addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROLE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$16, i);
        }
    }
    
    /**
     * Gets array of all "specialty" elements
     */
    public org.hl7.fhir.CodeableConcept[] getSpecialtyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIALTY$18, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specialty" element
     */
    public org.hl7.fhir.CodeableConcept getSpecialtyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SPECIALTY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specialty" element
     */
    public int sizeOfSpecialtyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIALTY$18);
        }
    }
    
    /**
     * Sets array of all "specialty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecialtyArray(org.hl7.fhir.CodeableConcept[] specialtyArray)
    {
        check_orphaned();
        arraySetterHelper(specialtyArray, SPECIALTY$18);
    }
    
    /**
     * Sets ith "specialty" element
     */
    public void setSpecialtyArray(int i, org.hl7.fhir.CodeableConcept specialty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SPECIALTY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specialty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specialty" element
     */
    public org.hl7.fhir.CodeableConcept insertNewSpecialty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(SPECIALTY$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specialty" element
     */
    public org.hl7.fhir.CodeableConcept addNewSpecialty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SPECIALTY$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "specialty" element
     */
    public void removeSpecialty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIALTY$18, i);
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
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$20, 0);
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
            return get_store().count_elements(PERIOD$20) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$20);
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
            get_store().remove_element(PERIOD$20, 0);
        }
    }
    
    /**
     * Gets array of all "location" elements
     */
    public org.hl7.fhir.ResourceReference[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$22, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.hl7.fhir.ResourceReference getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$22, i);
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
            return get_store().count_elements(LOCATION$22);
        }
    }
    
    /**
     * Sets array of all "location" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocationArray(org.hl7.fhir.ResourceReference[] locationArray)
    {
        check_orphaned();
        arraySetterHelper(locationArray, LOCATION$22);
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.hl7.fhir.ResourceReference location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$22, i);
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
    public org.hl7.fhir.ResourceReference insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(LOCATION$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.hl7.fhir.ResourceReference addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LOCATION$22);
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
            get_store().remove_element(LOCATION$22, i);
        }
    }
    
    /**
     * Gets array of all "qualification" elements
     */
    public org.hl7.fhir.PractitionerQualification[] getQualificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUALIFICATION$24, targetList);
            org.hl7.fhir.PractitionerQualification[] result = new org.hl7.fhir.PractitionerQualification[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "qualification" element
     */
    public org.hl7.fhir.PractitionerQualification getQualificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PractitionerQualification target = null;
            target = (org.hl7.fhir.PractitionerQualification)get_store().find_element_user(QUALIFICATION$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "qualification" element
     */
    public int sizeOfQualificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUALIFICATION$24);
        }
    }
    
    /**
     * Sets array of all "qualification" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQualificationArray(org.hl7.fhir.PractitionerQualification[] qualificationArray)
    {
        check_orphaned();
        arraySetterHelper(qualificationArray, QUALIFICATION$24);
    }
    
    /**
     * Sets ith "qualification" element
     */
    public void setQualificationArray(int i, org.hl7.fhir.PractitionerQualification qualification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PractitionerQualification target = null;
            target = (org.hl7.fhir.PractitionerQualification)get_store().find_element_user(QUALIFICATION$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(qualification);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualification" element
     */
    public org.hl7.fhir.PractitionerQualification insertNewQualification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PractitionerQualification target = null;
            target = (org.hl7.fhir.PractitionerQualification)get_store().insert_element_user(QUALIFICATION$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qualification" element
     */
    public org.hl7.fhir.PractitionerQualification addNewQualification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PractitionerQualification target = null;
            target = (org.hl7.fhir.PractitionerQualification)get_store().add_element_user(QUALIFICATION$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "qualification" element
     */
    public void removeQualification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUALIFICATION$24, i);
        }
    }
    
    /**
     * Gets array of all "communication" elements
     */
    public org.hl7.fhir.CodeableConcept[] getCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMUNICATION$26, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "communication" element
     */
    public org.hl7.fhir.CodeableConcept getCommunicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(COMMUNICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "communication" element
     */
    public int sizeOfCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMUNICATION$26);
        }
    }
    
    /**
     * Sets array of all "communication" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCommunicationArray(org.hl7.fhir.CodeableConcept[] communicationArray)
    {
        check_orphaned();
        arraySetterHelper(communicationArray, COMMUNICATION$26);
    }
    
    /**
     * Sets ith "communication" element
     */
    public void setCommunicationArray(int i, org.hl7.fhir.CodeableConcept communication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(COMMUNICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(communication);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "communication" element
     */
    public org.hl7.fhir.CodeableConcept insertNewCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(COMMUNICATION$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "communication" element
     */
    public org.hl7.fhir.CodeableConcept addNewCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(COMMUNICATION$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "communication" element
     */
    public void removeCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMUNICATION$26, i);
        }
    }
}
