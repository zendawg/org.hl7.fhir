/*
 * XML Type:  SecurityEvent.Object
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventObject
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML SecurityEvent.Object(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SecurityEventObjectImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SecurityEventObject
{
    private static final long serialVersionUID = 1L;
    
    public SecurityEventObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName REFERENCE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reference");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName ROLE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "role");
    private static final javax.xml.namespace.QName LIFECYCLE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "lifecycle");
    private static final javax.xml.namespace.QName SENSITIVITY$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "sensitivity");
    private static final javax.xml.namespace.QName NAME$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName QUERY$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "query");
    private static final javax.xml.namespace.QName DETAIL$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "detail");
    
    
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
     * Gets the "reference" element
     */
    public org.hl7.fhir.ResourceReference getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reference" element
     */
    public boolean isSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(org.hl7.fhir.ResourceReference reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reference" element
     */
    public org.hl7.fhir.ResourceReference addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REFERENCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "reference" element
     */
    public void unsetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$2, 0);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.SecurityEventObjectType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObjectType target = null;
            target = (org.hl7.fhir.SecurityEventObjectType)get_store().find_element_user(TYPE$4, 0);
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
            return get_store().count_elements(TYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.SecurityEventObjectType type)
    {
        generatedSetterHelperImpl(type, TYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.SecurityEventObjectType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObjectType target = null;
            target = (org.hl7.fhir.SecurityEventObjectType)get_store().add_element_user(TYPE$4);
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
            get_store().remove_element(TYPE$4, 0);
        }
    }
    
    /**
     * Gets the "role" element
     */
    public org.hl7.fhir.SecurityEventObjectRole getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObjectRole target = null;
            target = (org.hl7.fhir.SecurityEventObjectRole)get_store().find_element_user(ROLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "role" element
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$6) != 0;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(org.hl7.fhir.SecurityEventObjectRole role)
    {
        generatedSetterHelperImpl(role, ROLE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "role" element
     */
    public org.hl7.fhir.SecurityEventObjectRole addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObjectRole target = null;
            target = (org.hl7.fhir.SecurityEventObjectRole)get_store().add_element_user(ROLE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "role" element
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$6, 0);
        }
    }
    
    /**
     * Gets the "lifecycle" element
     */
    public org.hl7.fhir.SecurityEventObjectLifecycle getLifecycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObjectLifecycle target = null;
            target = (org.hl7.fhir.SecurityEventObjectLifecycle)get_store().find_element_user(LIFECYCLE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lifecycle" element
     */
    public boolean isSetLifecycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIFECYCLE$8) != 0;
        }
    }
    
    /**
     * Sets the "lifecycle" element
     */
    public void setLifecycle(org.hl7.fhir.SecurityEventObjectLifecycle lifecycle)
    {
        generatedSetterHelperImpl(lifecycle, LIFECYCLE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lifecycle" element
     */
    public org.hl7.fhir.SecurityEventObjectLifecycle addNewLifecycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventObjectLifecycle target = null;
            target = (org.hl7.fhir.SecurityEventObjectLifecycle)get_store().add_element_user(LIFECYCLE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "lifecycle" element
     */
    public void unsetLifecycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIFECYCLE$8, 0);
        }
    }
    
    /**
     * Gets the "sensitivity" element
     */
    public org.hl7.fhir.CodeableConcept getSensitivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SENSITIVITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sensitivity" element
     */
    public boolean isSetSensitivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENSITIVITY$10) != 0;
        }
    }
    
    /**
     * Sets the "sensitivity" element
     */
    public void setSensitivity(org.hl7.fhir.CodeableConcept sensitivity)
    {
        generatedSetterHelperImpl(sensitivity, SENSITIVITY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sensitivity" element
     */
    public org.hl7.fhir.CodeableConcept addNewSensitivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SENSITIVITY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "sensitivity" element
     */
    public void unsetSensitivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENSITIVITY$10, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$12, 0);
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
            return get_store().count_elements(NAME$12) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$12);
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
            get_store().remove_element(NAME$12, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$14, 0);
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
            return get_store().count_elements(DESCRIPTION$14) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$14);
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
            get_store().remove_element(DESCRIPTION$14, 0);
        }
    }
    
    /**
     * Gets the "query" element
     */
    public org.hl7.fhir.Base64Binary getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(QUERY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "query" element
     */
    public boolean isSetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$16) != 0;
        }
    }
    
    /**
     * Sets the "query" element
     */
    public void setQuery(org.hl7.fhir.Base64Binary query)
    {
        generatedSetterHelperImpl(query, QUERY$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "query" element
     */
    public org.hl7.fhir.Base64Binary addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(QUERY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "query" element
     */
    public void unsetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$16, 0);
        }
    }
    
    /**
     * Gets array of all "detail" elements
     */
    public org.hl7.fhir.SecurityEventDetail[] getDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAIL$18, targetList);
            org.hl7.fhir.SecurityEventDetail[] result = new org.hl7.fhir.SecurityEventDetail[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "detail" element
     */
    public org.hl7.fhir.SecurityEventDetail getDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventDetail target = null;
            target = (org.hl7.fhir.SecurityEventDetail)get_store().find_element_user(DETAIL$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "detail" element
     */
    public int sizeOfDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$18);
        }
    }
    
    /**
     * Sets array of all "detail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDetailArray(org.hl7.fhir.SecurityEventDetail[] detailArray)
    {
        check_orphaned();
        arraySetterHelper(detailArray, DETAIL$18);
    }
    
    /**
     * Sets ith "detail" element
     */
    public void setDetailArray(int i, org.hl7.fhir.SecurityEventDetail detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventDetail target = null;
            target = (org.hl7.fhir.SecurityEventDetail)get_store().find_element_user(DETAIL$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(detail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "detail" element
     */
    public org.hl7.fhir.SecurityEventDetail insertNewDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventDetail target = null;
            target = (org.hl7.fhir.SecurityEventDetail)get_store().insert_element_user(DETAIL$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "detail" element
     */
    public org.hl7.fhir.SecurityEventDetail addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventDetail target = null;
            target = (org.hl7.fhir.SecurityEventDetail)get_store().add_element_user(DETAIL$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "detail" element
     */
    public void removeDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$18, i);
        }
    }
}
