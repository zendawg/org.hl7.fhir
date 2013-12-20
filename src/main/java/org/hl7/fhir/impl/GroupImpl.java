/*
 * XML Type:  Group
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Group
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Group(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class GroupImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Group
{
    private static final long serialVersionUID = 1L;
    
    public GroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName ACTUAL$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "actual");
    private static final javax.xml.namespace.QName CODE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName QUANTITY$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "quantity");
    private static final javax.xml.namespace.QName CHARACTERISTIC$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "characteristic");
    private static final javax.xml.namespace.QName MEMBER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "member");
    
    
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
     * Gets the "type" element
     */
    public org.hl7.fhir.GroupType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.GroupType target = null;
            target = (org.hl7.fhir.GroupType)get_store().find_element_user(TYPE$2, 0);
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
    public void setType(org.hl7.fhir.GroupType type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.GroupType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.GroupType target = null;
            target = (org.hl7.fhir.GroupType)get_store().add_element_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "actual" element
     */
    public org.hl7.fhir.Boolean getActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ACTUAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "actual" element
     */
    public void setActual(org.hl7.fhir.Boolean actual)
    {
        generatedSetterHelperImpl(actual, ACTUAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "actual" element
     */
    public org.hl7.fhir.Boolean addNewActual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ACTUAL$4);
            return target;
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$6) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$6, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$8, 0);
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
            return get_store().count_elements(NAME$8) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$8);
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
            get_store().remove_element(NAME$8, 0);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public org.hl7.fhir.Integer getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(QUANTITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$10) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(org.hl7.fhir.Integer quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    public org.hl7.fhir.Integer addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(QUANTITY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$10, 0);
        }
    }
    
    /**
     * Gets array of all "characteristic" elements
     */
    public org.hl7.fhir.GroupCharacteristic[] getCharacteristicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHARACTERISTIC$12, targetList);
            org.hl7.fhir.GroupCharacteristic[] result = new org.hl7.fhir.GroupCharacteristic[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "characteristic" element
     */
    public org.hl7.fhir.GroupCharacteristic getCharacteristicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.GroupCharacteristic target = null;
            target = (org.hl7.fhir.GroupCharacteristic)get_store().find_element_user(CHARACTERISTIC$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "characteristic" element
     */
    public int sizeOfCharacteristicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERISTIC$12);
        }
    }
    
    /**
     * Sets array of all "characteristic" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCharacteristicArray(org.hl7.fhir.GroupCharacteristic[] characteristicArray)
    {
        check_orphaned();
        arraySetterHelper(characteristicArray, CHARACTERISTIC$12);
    }
    
    /**
     * Sets ith "characteristic" element
     */
    public void setCharacteristicArray(int i, org.hl7.fhir.GroupCharacteristic characteristic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.GroupCharacteristic target = null;
            target = (org.hl7.fhir.GroupCharacteristic)get_store().find_element_user(CHARACTERISTIC$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(characteristic);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "characteristic" element
     */
    public org.hl7.fhir.GroupCharacteristic insertNewCharacteristic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.GroupCharacteristic target = null;
            target = (org.hl7.fhir.GroupCharacteristic)get_store().insert_element_user(CHARACTERISTIC$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "characteristic" element
     */
    public org.hl7.fhir.GroupCharacteristic addNewCharacteristic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.GroupCharacteristic target = null;
            target = (org.hl7.fhir.GroupCharacteristic)get_store().add_element_user(CHARACTERISTIC$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "characteristic" element
     */
    public void removeCharacteristic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERISTIC$12, i);
        }
    }
    
    /**
     * Gets array of all "member" elements
     */
    public org.hl7.fhir.ResourceReference[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBER$14, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public org.hl7.fhir.ResourceReference getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MEMBER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$14);
        }
    }
    
    /**
     * Sets array of all "member" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMemberArray(org.hl7.fhir.ResourceReference[] memberArray)
    {
        check_orphaned();
        arraySetterHelper(memberArray, MEMBER$14);
    }
    
    /**
     * Sets ith "member" element
     */
    public void setMemberArray(int i, org.hl7.fhir.ResourceReference member)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MEMBER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(member);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public org.hl7.fhir.ResourceReference insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(MEMBER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public org.hl7.fhir.ResourceReference addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MEMBER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$14, i);
        }
    }
}
