/*
 * XML Type:  SecurityEvent.Participant
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SecurityEventParticipant
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML SecurityEvent.Participant(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SecurityEventParticipantImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SecurityEventParticipant
{
    private static final long serialVersionUID = 1L;
    
    public SecurityEventParticipantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "role");
    private static final javax.xml.namespace.QName REFERENCE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reference");
    private static final javax.xml.namespace.QName USERID$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "userId");
    private static final javax.xml.namespace.QName ALTID$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "altId");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName REQUESTOR$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requestor");
    private static final javax.xml.namespace.QName MEDIA$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "media");
    private static final javax.xml.namespace.QName NETWORK$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "network");
    
    
    /**
     * Gets array of all "role" elements
     */
    public org.hl7.fhir.CodeableConcept[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$0, targetList);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROLE$0, i);
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
            return get_store().count_elements(ROLE$0);
        }
    }
    
    /**
     * Sets array of all "role" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRoleArray(org.hl7.fhir.CodeableConcept[] roleArray)
    {
        check_orphaned();
        arraySetterHelper(roleArray, ROLE$0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROLE$0, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(ROLE$0, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROLE$0);
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
            get_store().remove_element(ROLE$0, i);
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
     * Gets the "userId" element
     */
    public org.hl7.fhir.String getUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(USERID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "userId" element
     */
    public boolean isSetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERID$4) != 0;
        }
    }
    
    /**
     * Sets the "userId" element
     */
    public void setUserId(org.hl7.fhir.String userId)
    {
        generatedSetterHelperImpl(userId, USERID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userId" element
     */
    public org.hl7.fhir.String addNewUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(USERID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "userId" element
     */
    public void unsetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERID$4, 0);
        }
    }
    
    /**
     * Gets the "altId" element
     */
    public org.hl7.fhir.String getAltId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(ALTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "altId" element
     */
    public boolean isSetAltId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTID$6) != 0;
        }
    }
    
    /**
     * Sets the "altId" element
     */
    public void setAltId(org.hl7.fhir.String altId)
    {
        generatedSetterHelperImpl(altId, ALTID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "altId" element
     */
    public org.hl7.fhir.String addNewAltId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(ALTID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "altId" element
     */
    public void unsetAltId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTID$6, 0);
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
     * Gets the "requestor" element
     */
    public org.hl7.fhir.Boolean getRequestor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(REQUESTOR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestor" element
     */
    public void setRequestor(org.hl7.fhir.Boolean requestor)
    {
        generatedSetterHelperImpl(requestor, REQUESTOR$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestor" element
     */
    public org.hl7.fhir.Boolean addNewRequestor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(REQUESTOR$10);
            return target;
        }
    }
    
    /**
     * Gets the "media" element
     */
    public org.hl7.fhir.Coding getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(MEDIA$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "media" element
     */
    public boolean isSetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIA$12) != 0;
        }
    }
    
    /**
     * Sets the "media" element
     */
    public void setMedia(org.hl7.fhir.Coding media)
    {
        generatedSetterHelperImpl(media, MEDIA$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "media" element
     */
    public org.hl7.fhir.Coding addNewMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(MEDIA$12);
            return target;
        }
    }
    
    /**
     * Unsets the "media" element
     */
    public void unsetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIA$12, 0);
        }
    }
    
    /**
     * Gets the "network" element
     */
    public org.hl7.fhir.SecurityEventNetwork getNetwork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventNetwork target = null;
            target = (org.hl7.fhir.SecurityEventNetwork)get_store().find_element_user(NETWORK$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "network" element
     */
    public boolean isSetNetwork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NETWORK$14) != 0;
        }
    }
    
    /**
     * Sets the "network" element
     */
    public void setNetwork(org.hl7.fhir.SecurityEventNetwork network)
    {
        generatedSetterHelperImpl(network, NETWORK$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "network" element
     */
    public org.hl7.fhir.SecurityEventNetwork addNewNetwork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SecurityEventNetwork target = null;
            target = (org.hl7.fhir.SecurityEventNetwork)get_store().add_element_user(NETWORK$14);
            return target;
        }
    }
    
    /**
     * Unsets the "network" element
     */
    public void unsetNetwork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NETWORK$14, 0);
        }
    }
}
