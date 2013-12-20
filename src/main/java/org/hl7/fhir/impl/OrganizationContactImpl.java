/*
 * XML Type:  Organization.Contact
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OrganizationContact
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Organization.Contact(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class OrganizationContactImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.OrganizationContact
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationContactImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PURPOSE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "purpose");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName TELECOM$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "telecom");
    private static final javax.xml.namespace.QName ADDRESS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "address");
    private static final javax.xml.namespace.QName GENDER$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "gender");
    
    
    /**
     * Gets the "purpose" element
     */
    public org.hl7.fhir.CodeableConcept getPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(PURPOSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "purpose" element
     */
    public boolean isSetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURPOSE$0) != 0;
        }
    }
    
    /**
     * Sets the "purpose" element
     */
    public void setPurpose(org.hl7.fhir.CodeableConcept purpose)
    {
        generatedSetterHelperImpl(purpose, PURPOSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "purpose" element
     */
    public org.hl7.fhir.CodeableConcept addNewPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(PURPOSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "purpose" element
     */
    public void unsetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURPOSE$0, 0);
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
}
