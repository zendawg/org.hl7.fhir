/*
 * XML Type:  Device
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Device
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Device(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DeviceImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Device
{
    private static final long serialVersionUID = 1L;
    
    public DeviceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName MANUFACTURER$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "manufacturer");
    private static final javax.xml.namespace.QName MODEL$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "model");
    private static final javax.xml.namespace.QName VERSION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "version");
    private static final javax.xml.namespace.QName EXPIRY$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "expiry");
    private static final javax.xml.namespace.QName UDI$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "udi");
    private static final javax.xml.namespace.QName LOTNUMBER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "lotNumber");
    private static final javax.xml.namespace.QName OWNER$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "owner");
    private static final javax.xml.namespace.QName LOCATION$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName PATIENT$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "patient");
    private static final javax.xml.namespace.QName CONTACT$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "contact");
    private static final javax.xml.namespace.QName URL$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "url");
    
    
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
     * Gets the "manufacturer" element
     */
    public org.hl7.fhir.String getManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(MANUFACTURER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manufacturer" element
     */
    public boolean isSetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURER$4) != 0;
        }
    }
    
    /**
     * Sets the "manufacturer" element
     */
    public void setManufacturer(org.hl7.fhir.String manufacturer)
    {
        generatedSetterHelperImpl(manufacturer, MANUFACTURER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "manufacturer" element
     */
    public org.hl7.fhir.String addNewManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(MANUFACTURER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "manufacturer" element
     */
    public void unsetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURER$4, 0);
        }
    }
    
    /**
     * Gets the "model" element
     */
    public org.hl7.fhir.String getModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(MODEL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "model" element
     */
    public boolean isSetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODEL$6) != 0;
        }
    }
    
    /**
     * Sets the "model" element
     */
    public void setModel(org.hl7.fhir.String model)
    {
        generatedSetterHelperImpl(model, MODEL$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "model" element
     */
    public org.hl7.fhir.String addNewModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(MODEL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "model" element
     */
    public void unsetModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODEL$6, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public org.hl7.fhir.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VERSION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$8) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(org.hl7.fhir.String version)
    {
        generatedSetterHelperImpl(version, VERSION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public org.hl7.fhir.String addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(VERSION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$8, 0);
        }
    }
    
    /**
     * Gets the "expiry" element
     */
    public org.hl7.fhir.Date getExpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(EXPIRY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expiry" element
     */
    public boolean isSetExpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRY$10) != 0;
        }
    }
    
    /**
     * Sets the "expiry" element
     */
    public void setExpiry(org.hl7.fhir.Date expiry)
    {
        generatedSetterHelperImpl(expiry, EXPIRY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "expiry" element
     */
    public org.hl7.fhir.Date addNewExpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(EXPIRY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "expiry" element
     */
    public void unsetExpiry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRY$10, 0);
        }
    }
    
    /**
     * Gets the "udi" element
     */
    public org.hl7.fhir.String getUdi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(UDI$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "udi" element
     */
    public boolean isSetUdi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UDI$12) != 0;
        }
    }
    
    /**
     * Sets the "udi" element
     */
    public void setUdi(org.hl7.fhir.String udi)
    {
        generatedSetterHelperImpl(udi, UDI$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "udi" element
     */
    public org.hl7.fhir.String addNewUdi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(UDI$12);
            return target;
        }
    }
    
    /**
     * Unsets the "udi" element
     */
    public void unsetUdi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UDI$12, 0);
        }
    }
    
    /**
     * Gets the "lotNumber" element
     */
    public org.hl7.fhir.String getLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LOTNUMBER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lotNumber" element
     */
    public boolean isSetLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTNUMBER$14) != 0;
        }
    }
    
    /**
     * Sets the "lotNumber" element
     */
    public void setLotNumber(org.hl7.fhir.String lotNumber)
    {
        generatedSetterHelperImpl(lotNumber, LOTNUMBER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lotNumber" element
     */
    public org.hl7.fhir.String addNewLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(LOTNUMBER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "lotNumber" element
     */
    public void unsetLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTNUMBER$14, 0);
        }
    }
    
    /**
     * Gets the "owner" element
     */
    public org.hl7.fhir.ResourceReference getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(OWNER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "owner" element
     */
    public boolean isSetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNER$16) != 0;
        }
    }
    
    /**
     * Sets the "owner" element
     */
    public void setOwner(org.hl7.fhir.ResourceReference owner)
    {
        generatedSetterHelperImpl(owner, OWNER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "owner" element
     */
    public org.hl7.fhir.ResourceReference addNewOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(OWNER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "owner" element
     */
    public void unsetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNER$16, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public org.hl7.fhir.ResourceReference getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$18) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.hl7.fhir.ResourceReference location)
    {
        generatedSetterHelperImpl(location, LOCATION$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.hl7.fhir.ResourceReference addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LOCATION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$18, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PATIENT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "patient" element
     */
    public boolean isSetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PATIENT$20) != 0;
        }
    }
    
    /**
     * Sets the "patient" element
     */
    public void setPatient(org.hl7.fhir.ResourceReference patient)
    {
        generatedSetterHelperImpl(patient, PATIENT$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PATIENT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "patient" element
     */
    public void unsetPatient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PATIENT$20, 0);
        }
    }
    
    /**
     * Gets array of all "contact" elements
     */
    public org.hl7.fhir.Contact[] getContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACT$22, targetList);
            org.hl7.fhir.Contact[] result = new org.hl7.fhir.Contact[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contact" element
     */
    public org.hl7.fhir.Contact getContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(CONTACT$22, i);
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
            return get_store().count_elements(CONTACT$22);
        }
    }
    
    /**
     * Sets array of all "contact" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContactArray(org.hl7.fhir.Contact[] contactArray)
    {
        check_orphaned();
        arraySetterHelper(contactArray, CONTACT$22);
    }
    
    /**
     * Sets ith "contact" element
     */
    public void setContactArray(int i, org.hl7.fhir.Contact contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(CONTACT$22, i);
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
    public org.hl7.fhir.Contact insertNewContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().insert_element_user(CONTACT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    public org.hl7.fhir.Contact addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().add_element_user(CONTACT$22);
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
            get_store().remove_element(CONTACT$22, i);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public org.hl7.fhir.Uri getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(URL$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$24) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(org.hl7.fhir.Uri url)
    {
        generatedSetterHelperImpl(url, URL$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "url" element
     */
    public org.hl7.fhir.Uri addNewUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(URL$24);
            return target;
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$24, 0);
        }
    }
}
