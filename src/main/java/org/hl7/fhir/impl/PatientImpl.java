/*
 * XML Type:  Patient
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Patient
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Patient(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class PatientImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Patient
{
    private static final long serialVersionUID = 1L;
    
    public PatientImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName TELECOM$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "telecom");
    private static final javax.xml.namespace.QName GENDER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "gender");
    private static final javax.xml.namespace.QName BIRTHDATE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "birthDate");
    private static final javax.xml.namespace.QName DECEASEDBOOLEAN$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deceasedBoolean");
    private static final javax.xml.namespace.QName DECEASEDDATETIME$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "deceasedDateTime");
    private static final javax.xml.namespace.QName ADDRESS$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "address");
    private static final javax.xml.namespace.QName MARITALSTATUS$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "maritalStatus");
    private static final javax.xml.namespace.QName MULTIPLEBIRTHBOOLEAN$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "multipleBirthBoolean");
    private static final javax.xml.namespace.QName MULTIPLEBIRTHINTEGER$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "multipleBirthInteger");
    private static final javax.xml.namespace.QName PHOTO$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "photo");
    private static final javax.xml.namespace.QName CONTACT$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "contact");
    private static final javax.xml.namespace.QName ANIMAL$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "animal");
    private static final javax.xml.namespace.QName COMMUNICATION$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "communication");
    private static final javax.xml.namespace.QName CAREPROVIDER$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "careProvider");
    private static final javax.xml.namespace.QName MANAGINGORGANIZATION$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "managingOrganization");
    private static final javax.xml.namespace.QName LINK$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "link");
    private static final javax.xml.namespace.QName ACTIVE$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "active");
    
    
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
     * Gets array of all "name" elements
     */
    public org.hl7.fhir.HumanName[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$2, targetList);
            org.hl7.fhir.HumanName[] result = new org.hl7.fhir.HumanName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public org.hl7.fhir.HumanName getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(NAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2);
        }
    }
    
    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNameArray(org.hl7.fhir.HumanName[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$2);
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, org.hl7.fhir.HumanName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(NAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public org.hl7.fhir.HumanName insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().insert_element_user(NAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
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
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, i);
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
     * Gets the "gender" element
     */
    public org.hl7.fhir.CodeableConcept getGender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(GENDER$6, 0);
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
            return get_store().count_elements(GENDER$6) != 0;
        }
    }
    
    /**
     * Sets the "gender" element
     */
    public void setGender(org.hl7.fhir.CodeableConcept gender)
    {
        generatedSetterHelperImpl(gender, GENDER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(GENDER$6);
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
            get_store().remove_element(GENDER$6, 0);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(BIRTHDATE$8, 0);
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
            return get_store().count_elements(BIRTHDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "birthDate" element
     */
    public void setBirthDate(org.hl7.fhir.DateTime birthDate)
    {
        generatedSetterHelperImpl(birthDate, BIRTHDATE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(BIRTHDATE$8);
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
            get_store().remove_element(BIRTHDATE$8, 0);
        }
    }
    
    /**
     * Gets the "deceasedBoolean" element
     */
    public org.hl7.fhir.Boolean getDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(DECEASEDBOOLEAN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deceasedBoolean" element
     */
    public boolean isSetDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDBOOLEAN$10) != 0;
        }
    }
    
    /**
     * Sets the "deceasedBoolean" element
     */
    public void setDeceasedBoolean(org.hl7.fhir.Boolean deceasedBoolean)
    {
        generatedSetterHelperImpl(deceasedBoolean, DECEASEDBOOLEAN$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deceasedBoolean" element
     */
    public org.hl7.fhir.Boolean addNewDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(DECEASEDBOOLEAN$10);
            return target;
        }
    }
    
    /**
     * Unsets the "deceasedBoolean" element
     */
    public void unsetDeceasedBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDBOOLEAN$10, 0);
        }
    }
    
    /**
     * Gets the "deceasedDateTime" element
     */
    public org.hl7.fhir.DateTime getDeceasedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DECEASEDDATETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deceasedDateTime" element
     */
    public boolean isSetDeceasedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECEASEDDATETIME$12) != 0;
        }
    }
    
    /**
     * Sets the "deceasedDateTime" element
     */
    public void setDeceasedDateTime(org.hl7.fhir.DateTime deceasedDateTime)
    {
        generatedSetterHelperImpl(deceasedDateTime, DECEASEDDATETIME$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deceasedDateTime" element
     */
    public org.hl7.fhir.DateTime addNewDeceasedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DECEASEDDATETIME$12);
            return target;
        }
    }
    
    /**
     * Unsets the "deceasedDateTime" element
     */
    public void unsetDeceasedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECEASEDDATETIME$12, 0);
        }
    }
    
    /**
     * Gets array of all "address" elements
     */
    public org.hl7.fhir.Address[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$14, targetList);
            org.hl7.fhir.Address[] result = new org.hl7.fhir.Address[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "address" element
     */
    public org.hl7.fhir.Address getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(ADDRESS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "address" element
     */
    public int sizeOfAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$14);
        }
    }
    
    /**
     * Sets array of all "address" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddressArray(org.hl7.fhir.Address[] addressArray)
    {
        check_orphaned();
        arraySetterHelper(addressArray, ADDRESS$14);
    }
    
    /**
     * Sets ith "address" element
     */
    public void setAddressArray(int i, org.hl7.fhir.Address address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(ADDRESS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(address);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    public org.hl7.fhir.Address insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().insert_element_user(ADDRESS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    public org.hl7.fhir.Address addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().add_element_user(ADDRESS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "address" element
     */
    public void removeAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$14, i);
        }
    }
    
    /**
     * Gets the "maritalStatus" element
     */
    public org.hl7.fhir.CodeableConcept getMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(MARITALSTATUS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maritalStatus" element
     */
    public boolean isSetMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARITALSTATUS$16) != 0;
        }
    }
    
    /**
     * Sets the "maritalStatus" element
     */
    public void setMaritalStatus(org.hl7.fhir.CodeableConcept maritalStatus)
    {
        generatedSetterHelperImpl(maritalStatus, MARITALSTATUS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maritalStatus" element
     */
    public org.hl7.fhir.CodeableConcept addNewMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(MARITALSTATUS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "maritalStatus" element
     */
    public void unsetMaritalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARITALSTATUS$16, 0);
        }
    }
    
    /**
     * Gets the "multipleBirthBoolean" element
     */
    public org.hl7.fhir.Boolean getMultipleBirthBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(MULTIPLEBIRTHBOOLEAN$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "multipleBirthBoolean" element
     */
    public boolean isSetMultipleBirthBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTIPLEBIRTHBOOLEAN$18) != 0;
        }
    }
    
    /**
     * Sets the "multipleBirthBoolean" element
     */
    public void setMultipleBirthBoolean(org.hl7.fhir.Boolean multipleBirthBoolean)
    {
        generatedSetterHelperImpl(multipleBirthBoolean, MULTIPLEBIRTHBOOLEAN$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multipleBirthBoolean" element
     */
    public org.hl7.fhir.Boolean addNewMultipleBirthBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(MULTIPLEBIRTHBOOLEAN$18);
            return target;
        }
    }
    
    /**
     * Unsets the "multipleBirthBoolean" element
     */
    public void unsetMultipleBirthBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTIPLEBIRTHBOOLEAN$18, 0);
        }
    }
    
    /**
     * Gets the "multipleBirthInteger" element
     */
    public org.hl7.fhir.Integer getMultipleBirthInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(MULTIPLEBIRTHINTEGER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "multipleBirthInteger" element
     */
    public boolean isSetMultipleBirthInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MULTIPLEBIRTHINTEGER$20) != 0;
        }
    }
    
    /**
     * Sets the "multipleBirthInteger" element
     */
    public void setMultipleBirthInteger(org.hl7.fhir.Integer multipleBirthInteger)
    {
        generatedSetterHelperImpl(multipleBirthInteger, MULTIPLEBIRTHINTEGER$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multipleBirthInteger" element
     */
    public org.hl7.fhir.Integer addNewMultipleBirthInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(MULTIPLEBIRTHINTEGER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "multipleBirthInteger" element
     */
    public void unsetMultipleBirthInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MULTIPLEBIRTHINTEGER$20, 0);
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
            get_store().find_all_element_users(PHOTO$22, targetList);
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
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PHOTO$22, i);
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
            return get_store().count_elements(PHOTO$22);
        }
    }
    
    /**
     * Sets array of all "photo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPhotoArray(org.hl7.fhir.Attachment[] photoArray)
    {
        check_orphaned();
        arraySetterHelper(photoArray, PHOTO$22);
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
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(PHOTO$22, i);
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
            target = (org.hl7.fhir.Attachment)get_store().insert_element_user(PHOTO$22, i);
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
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(PHOTO$22);
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
            get_store().remove_element(PHOTO$22, i);
        }
    }
    
    /**
     * Gets array of all "contact" elements
     */
    public org.hl7.fhir.PatientContact[] getContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACT$24, targetList);
            org.hl7.fhir.PatientContact[] result = new org.hl7.fhir.PatientContact[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contact" element
     */
    public org.hl7.fhir.PatientContact getContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientContact target = null;
            target = (org.hl7.fhir.PatientContact)get_store().find_element_user(CONTACT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contact" element
     */
    public int sizeOfContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACT$24);
        }
    }
    
    /**
     * Sets array of all "contact" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContactArray(org.hl7.fhir.PatientContact[] contactArray)
    {
        check_orphaned();
        arraySetterHelper(contactArray, CONTACT$24);
    }
    
    /**
     * Sets ith "contact" element
     */
    public void setContactArray(int i, org.hl7.fhir.PatientContact contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientContact target = null;
            target = (org.hl7.fhir.PatientContact)get_store().find_element_user(CONTACT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    public org.hl7.fhir.PatientContact insertNewContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientContact target = null;
            target = (org.hl7.fhir.PatientContact)get_store().insert_element_user(CONTACT$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    public org.hl7.fhir.PatientContact addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientContact target = null;
            target = (org.hl7.fhir.PatientContact)get_store().add_element_user(CONTACT$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "contact" element
     */
    public void removeContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACT$24, i);
        }
    }
    
    /**
     * Gets the "animal" element
     */
    public org.hl7.fhir.PatientAnimal getAnimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientAnimal target = null;
            target = (org.hl7.fhir.PatientAnimal)get_store().find_element_user(ANIMAL$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "animal" element
     */
    public boolean isSetAnimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANIMAL$26) != 0;
        }
    }
    
    /**
     * Sets the "animal" element
     */
    public void setAnimal(org.hl7.fhir.PatientAnimal animal)
    {
        generatedSetterHelperImpl(animal, ANIMAL$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "animal" element
     */
    public org.hl7.fhir.PatientAnimal addNewAnimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientAnimal target = null;
            target = (org.hl7.fhir.PatientAnimal)get_store().add_element_user(ANIMAL$26);
            return target;
        }
    }
    
    /**
     * Unsets the "animal" element
     */
    public void unsetAnimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANIMAL$26, 0);
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
            get_store().find_all_element_users(COMMUNICATION$28, targetList);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(COMMUNICATION$28, i);
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
            return get_store().count_elements(COMMUNICATION$28);
        }
    }
    
    /**
     * Sets array of all "communication" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCommunicationArray(org.hl7.fhir.CodeableConcept[] communicationArray)
    {
        check_orphaned();
        arraySetterHelper(communicationArray, COMMUNICATION$28);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(COMMUNICATION$28, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(COMMUNICATION$28, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(COMMUNICATION$28);
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
            get_store().remove_element(COMMUNICATION$28, i);
        }
    }
    
    /**
     * Gets array of all "careProvider" elements
     */
    public org.hl7.fhir.ResourceReference[] getCareProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAREPROVIDER$30, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "careProvider" element
     */
    public org.hl7.fhir.ResourceReference getCareProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CAREPROVIDER$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "careProvider" element
     */
    public int sizeOfCareProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREPROVIDER$30);
        }
    }
    
    /**
     * Sets array of all "careProvider" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCareProviderArray(org.hl7.fhir.ResourceReference[] careProviderArray)
    {
        check_orphaned();
        arraySetterHelper(careProviderArray, CAREPROVIDER$30);
    }
    
    /**
     * Sets ith "careProvider" element
     */
    public void setCareProviderArray(int i, org.hl7.fhir.ResourceReference careProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CAREPROVIDER$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(careProvider);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "careProvider" element
     */
    public org.hl7.fhir.ResourceReference insertNewCareProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(CAREPROVIDER$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "careProvider" element
     */
    public org.hl7.fhir.ResourceReference addNewCareProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(CAREPROVIDER$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "careProvider" element
     */
    public void removeCareProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREPROVIDER$30, i);
        }
    }
    
    /**
     * Gets the "managingOrganization" element
     */
    public org.hl7.fhir.ResourceReference getManagingOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MANAGINGORGANIZATION$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "managingOrganization" element
     */
    public boolean isSetManagingOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANAGINGORGANIZATION$32) != 0;
        }
    }
    
    /**
     * Sets the "managingOrganization" element
     */
    public void setManagingOrganization(org.hl7.fhir.ResourceReference managingOrganization)
    {
        generatedSetterHelperImpl(managingOrganization, MANAGINGORGANIZATION$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "managingOrganization" element
     */
    public org.hl7.fhir.ResourceReference addNewManagingOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MANAGINGORGANIZATION$32);
            return target;
        }
    }
    
    /**
     * Unsets the "managingOrganization" element
     */
    public void unsetManagingOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANAGINGORGANIZATION$32, 0);
        }
    }
    
    /**
     * Gets array of all "link" elements
     */
    public org.hl7.fhir.PatientLink[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$34, targetList);
            org.hl7.fhir.PatientLink[] result = new org.hl7.fhir.PatientLink[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "link" element
     */
    public org.hl7.fhir.PatientLink getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientLink target = null;
            target = (org.hl7.fhir.PatientLink)get_store().find_element_user(LINK$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$34);
        }
    }
    
    /**
     * Sets array of all "link" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkArray(org.hl7.fhir.PatientLink[] linkArray)
    {
        check_orphaned();
        arraySetterHelper(linkArray, LINK$34);
    }
    
    /**
     * Sets ith "link" element
     */
    public void setLinkArray(int i, org.hl7.fhir.PatientLink link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientLink target = null;
            target = (org.hl7.fhir.PatientLink)get_store().find_element_user(LINK$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(link);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "link" element
     */
    public org.hl7.fhir.PatientLink insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientLink target = null;
            target = (org.hl7.fhir.PatientLink)get_store().insert_element_user(LINK$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "link" element
     */
    public org.hl7.fhir.PatientLink addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.PatientLink target = null;
            target = (org.hl7.fhir.PatientLink)get_store().add_element_user(LINK$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$34, i);
        }
    }
    
    /**
     * Gets the "active" element
     */
    public org.hl7.fhir.Boolean getActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ACTIVE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "active" element
     */
    public boolean isSetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVE$36) != 0;
        }
    }
    
    /**
     * Sets the "active" element
     */
    public void setActive(org.hl7.fhir.Boolean active)
    {
        generatedSetterHelperImpl(active, ACTIVE$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "active" element
     */
    public org.hl7.fhir.Boolean addNewActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ACTIVE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "active" element
     */
    public void unsetActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVE$36, 0);
        }
    }
}
