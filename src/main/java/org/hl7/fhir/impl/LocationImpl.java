/*
 * XML Type:  Location
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Location
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Location(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class LocationImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Location
{
    private static final long serialVersionUID = 1L;
    
    public LocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName TELECOM$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "telecom");
    private static final javax.xml.namespace.QName ADDRESS$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "address");
    private static final javax.xml.namespace.QName PHYSICALTYPE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "physicalType");
    private static final javax.xml.namespace.QName POSITION$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "position");
    private static final javax.xml.namespace.QName MANAGINGORGANIZATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "managingOrganization");
    private static final javax.xml.namespace.QName STATUS$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName PARTOF$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "partOf");
    private static final javax.xml.namespace.QName MODE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mode");
    
    
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
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$2, 0);
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
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.String addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$2);
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
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.hl7.fhir.String addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$6, 0);
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
            return get_store().count_elements(TYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$6);
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
            get_store().remove_element(TYPE$6, 0);
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
     * Gets the "address" element
     */
    public org.hl7.fhir.Address getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(ADDRESS$10, 0);
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
            return get_store().count_elements(ADDRESS$10) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(org.hl7.fhir.Address address)
    {
        generatedSetterHelperImpl(address, ADDRESS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Address)get_store().add_element_user(ADDRESS$10);
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
            get_store().remove_element(ADDRESS$10, 0);
        }
    }
    
    /**
     * Gets the "physicalType" element
     */
    public org.hl7.fhir.CodeableConcept getPhysicalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(PHYSICALTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "physicalType" element
     */
    public boolean isSetPhysicalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHYSICALTYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "physicalType" element
     */
    public void setPhysicalType(org.hl7.fhir.CodeableConcept physicalType)
    {
        generatedSetterHelperImpl(physicalType, PHYSICALTYPE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "physicalType" element
     */
    public org.hl7.fhir.CodeableConcept addNewPhysicalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(PHYSICALTYPE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "physicalType" element
     */
    public void unsetPhysicalType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHYSICALTYPE$12, 0);
        }
    }
    
    /**
     * Gets the "position" element
     */
    public org.hl7.fhir.LocationPosition getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LocationPosition target = null;
            target = (org.hl7.fhir.LocationPosition)get_store().find_element_user(POSITION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "position" element
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$14) != 0;
        }
    }
    
    /**
     * Sets the "position" element
     */
    public void setPosition(org.hl7.fhir.LocationPosition position)
    {
        generatedSetterHelperImpl(position, POSITION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "position" element
     */
    public org.hl7.fhir.LocationPosition addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LocationPosition target = null;
            target = (org.hl7.fhir.LocationPosition)get_store().add_element_user(POSITION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "position" element
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$14, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MANAGINGORGANIZATION$16, 0);
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
            return get_store().count_elements(MANAGINGORGANIZATION$16) != 0;
        }
    }
    
    /**
     * Sets the "managingOrganization" element
     */
    public void setManagingOrganization(org.hl7.fhir.ResourceReference managingOrganization)
    {
        generatedSetterHelperImpl(managingOrganization, MANAGINGORGANIZATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MANAGINGORGANIZATION$16);
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
            get_store().remove_element(MANAGINGORGANIZATION$16, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.LocationStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LocationStatus target = null;
            target = (org.hl7.fhir.LocationStatus)get_store().find_element_user(STATUS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$18) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.LocationStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.LocationStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LocationStatus target = null;
            target = (org.hl7.fhir.LocationStatus)get_store().add_element_user(STATUS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$18, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PARTOF$20, 0);
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
            return get_store().count_elements(PARTOF$20) != 0;
        }
    }
    
    /**
     * Sets the "partOf" element
     */
    public void setPartOf(org.hl7.fhir.ResourceReference partOf)
    {
        generatedSetterHelperImpl(partOf, PARTOF$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PARTOF$20);
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
            get_store().remove_element(PARTOF$20, 0);
        }
    }
    
    /**
     * Gets the "mode" element
     */
    public org.hl7.fhir.LocationMode getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LocationMode target = null;
            target = (org.hl7.fhir.LocationMode)get_store().find_element_user(MODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mode" element
     */
    public boolean isSetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODE$22) != 0;
        }
    }
    
    /**
     * Sets the "mode" element
     */
    public void setMode(org.hl7.fhir.LocationMode mode)
    {
        generatedSetterHelperImpl(mode, MODE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mode" element
     */
    public org.hl7.fhir.LocationMode addNewMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.LocationMode target = null;
            target = (org.hl7.fhir.LocationMode)get_store().add_element_user(MODE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "mode" element
     */
    public void unsetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODE$22, 0);
        }
    }
}
