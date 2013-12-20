/*
 * XML Type:  DocumentReference
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentReference
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DocumentReference(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DocumentReferenceImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.DocumentReference
{
    private static final long serialVersionUID = 1L;
    
    public DocumentReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MASTERIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "masterIdentifier");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SUBJECT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName CLASS1$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "class");
    private static final javax.xml.namespace.QName AUTHOR$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "author");
    private static final javax.xml.namespace.QName CUSTODIAN$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "custodian");
    private static final javax.xml.namespace.QName POLICYMANAGER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "policyManager");
    private static final javax.xml.namespace.QName AUTHENTICATOR$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "authenticator");
    private static final javax.xml.namespace.QName CREATED$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "created");
    private static final javax.xml.namespace.QName INDEXED$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "indexed");
    private static final javax.xml.namespace.QName STATUS$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName DOCSTATUS$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "docStatus");
    private static final javax.xml.namespace.QName RELATESTO$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "relatesTo");
    private static final javax.xml.namespace.QName DESCRIPTION$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName CONFIDENTIALITY$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "confidentiality");
    private static final javax.xml.namespace.QName PRIMARYLANGUAGE$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "primaryLanguage");
    private static final javax.xml.namespace.QName MIMETYPE$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mimeType");
    private static final javax.xml.namespace.QName FORMAT$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "format");
    private static final javax.xml.namespace.QName SIZE$38 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "size");
    private static final javax.xml.namespace.QName HASH$40 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "hash");
    private static final javax.xml.namespace.QName LOCATION$42 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName SERVICE$44 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "service");
    private static final javax.xml.namespace.QName CONTEXT$46 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "context");
    
    
    /**
     * Gets the "masterIdentifier" element
     */
    public org.hl7.fhir.Identifier getMasterIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(MASTERIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "masterIdentifier" element
     */
    public void setMasterIdentifier(org.hl7.fhir.Identifier masterIdentifier)
    {
        generatedSetterHelperImpl(masterIdentifier, MASTERIDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "masterIdentifier" element
     */
    public org.hl7.fhir.Identifier addNewMasterIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(MASTERIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$2, targetList);
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
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$2, i);
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
            return get_store().count_elements(IDENTIFIER$2);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$2);
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
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$2, i);
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
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$2, i);
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
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$2);
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
            get_store().remove_element(IDENTIFIER$2, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$4, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$4);
            return target;
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
     * Gets the "class" element
     */
    public org.hl7.fhir.CodeableConcept getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CLASS1$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "class" element
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLASS1$8) != 0;
        }
    }
    
    /**
     * Sets the "class" element
     */
    public void setClass1(org.hl7.fhir.CodeableConcept class1)
    {
        generatedSetterHelperImpl(class1, CLASS1$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "class" element
     */
    public org.hl7.fhir.CodeableConcept addNewClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CLASS1$8);
            return target;
        }
    }
    
    /**
     * Unsets the "class" element
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLASS1$8, 0);
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public org.hl7.fhir.ResourceReference[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$10, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public org.hl7.fhir.ResourceReference getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHOR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$10);
        }
    }
    
    /**
     * Sets array of all "author" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorArray(org.hl7.fhir.ResourceReference[] authorArray)
    {
        check_orphaned();
        arraySetterHelper(authorArray, AUTHOR$10);
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, org.hl7.fhir.ResourceReference author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHOR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public org.hl7.fhir.ResourceReference insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(AUTHOR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHOR$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$10, i);
        }
    }
    
    /**
     * Gets the "custodian" element
     */
    public org.hl7.fhir.ResourceReference getCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CUSTODIAN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "custodian" element
     */
    public boolean isSetCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTODIAN$12) != 0;
        }
    }
    
    /**
     * Sets the "custodian" element
     */
    public void setCustodian(org.hl7.fhir.ResourceReference custodian)
    {
        generatedSetterHelperImpl(custodian, CUSTODIAN$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    public org.hl7.fhir.ResourceReference addNewCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(CUSTODIAN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "custodian" element
     */
    public void unsetCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTODIAN$12, 0);
        }
    }
    
    /**
     * Gets the "policyManager" element
     */
    public org.hl7.fhir.Uri getPolicyManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(POLICYMANAGER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "policyManager" element
     */
    public boolean isSetPolicyManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICYMANAGER$14) != 0;
        }
    }
    
    /**
     * Sets the "policyManager" element
     */
    public void setPolicyManager(org.hl7.fhir.Uri policyManager)
    {
        generatedSetterHelperImpl(policyManager, POLICYMANAGER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "policyManager" element
     */
    public org.hl7.fhir.Uri addNewPolicyManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(POLICYMANAGER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "policyManager" element
     */
    public void unsetPolicyManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICYMANAGER$14, 0);
        }
    }
    
    /**
     * Gets the "authenticator" element
     */
    public org.hl7.fhir.ResourceReference getAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(AUTHENTICATOR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "authenticator" element
     */
    public boolean isSetAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATOR$16) != 0;
        }
    }
    
    /**
     * Sets the "authenticator" element
     */
    public void setAuthenticator(org.hl7.fhir.ResourceReference authenticator)
    {
        generatedSetterHelperImpl(authenticator, AUTHENTICATOR$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authenticator" element
     */
    public org.hl7.fhir.ResourceReference addNewAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(AUTHENTICATOR$16);
            return target;
        }
    }
    
    /**
     * Unsets the "authenticator" element
     */
    public void unsetAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATOR$16, 0);
        }
    }
    
    /**
     * Gets the "created" element
     */
    public org.hl7.fhir.DateTime getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(CREATED$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$18) != 0;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(org.hl7.fhir.DateTime created)
    {
        generatedSetterHelperImpl(created, CREATED$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "created" element
     */
    public org.hl7.fhir.DateTime addNewCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(CREATED$18);
            return target;
        }
    }
    
    /**
     * Unsets the "created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$18, 0);
        }
    }
    
    /**
     * Gets the "indexed" element
     */
    public org.hl7.fhir.Instant getIndexed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(INDEXED$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexed" element
     */
    public void setIndexed(org.hl7.fhir.Instant indexed)
    {
        generatedSetterHelperImpl(indexed, INDEXED$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexed" element
     */
    public org.hl7.fhir.Instant addNewIndexed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(INDEXED$20);
            return target;
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.DocumentReferenceStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceStatus target = null;
            target = (org.hl7.fhir.DocumentReferenceStatus)get_store().find_element_user(STATUS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.DocumentReferenceStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.DocumentReferenceStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceStatus target = null;
            target = (org.hl7.fhir.DocumentReferenceStatus)get_store().add_element_user(STATUS$22);
            return target;
        }
    }
    
    /**
     * Gets the "docStatus" element
     */
    public org.hl7.fhir.CodeableConcept getDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(DOCSTATUS$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docStatus" element
     */
    public boolean isSetDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCSTATUS$24) != 0;
        }
    }
    
    /**
     * Sets the "docStatus" element
     */
    public void setDocStatus(org.hl7.fhir.CodeableConcept docStatus)
    {
        generatedSetterHelperImpl(docStatus, DOCSTATUS$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "docStatus" element
     */
    public org.hl7.fhir.CodeableConcept addNewDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(DOCSTATUS$24);
            return target;
        }
    }
    
    /**
     * Unsets the "docStatus" element
     */
    public void unsetDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCSTATUS$24, 0);
        }
    }
    
    /**
     * Gets array of all "relatesTo" elements
     */
    public org.hl7.fhir.DocumentReferenceRelatesTo[] getRelatesToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATESTO$26, targetList);
            org.hl7.fhir.DocumentReferenceRelatesTo[] result = new org.hl7.fhir.DocumentReferenceRelatesTo[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatesTo" element
     */
    public org.hl7.fhir.DocumentReferenceRelatesTo getRelatesToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceRelatesTo target = null;
            target = (org.hl7.fhir.DocumentReferenceRelatesTo)get_store().find_element_user(RELATESTO$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatesTo" element
     */
    public int sizeOfRelatesToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATESTO$26);
        }
    }
    
    /**
     * Sets array of all "relatesTo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatesToArray(org.hl7.fhir.DocumentReferenceRelatesTo[] relatesToArray)
    {
        check_orphaned();
        arraySetterHelper(relatesToArray, RELATESTO$26);
    }
    
    /**
     * Sets ith "relatesTo" element
     */
    public void setRelatesToArray(int i, org.hl7.fhir.DocumentReferenceRelatesTo relatesTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceRelatesTo target = null;
            target = (org.hl7.fhir.DocumentReferenceRelatesTo)get_store().find_element_user(RELATESTO$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatesTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatesTo" element
     */
    public org.hl7.fhir.DocumentReferenceRelatesTo insertNewRelatesTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceRelatesTo target = null;
            target = (org.hl7.fhir.DocumentReferenceRelatesTo)get_store().insert_element_user(RELATESTO$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatesTo" element
     */
    public org.hl7.fhir.DocumentReferenceRelatesTo addNewRelatesTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceRelatesTo target = null;
            target = (org.hl7.fhir.DocumentReferenceRelatesTo)get_store().add_element_user(RELATESTO$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatesTo" element
     */
    public void removeRelatesTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATESTO$26, i);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$28, 0);
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
            return get_store().count_elements(DESCRIPTION$28) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$28);
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
            get_store().remove_element(DESCRIPTION$28, 0);
        }
    }
    
    /**
     * Gets array of all "confidentiality" elements
     */
    public org.hl7.fhir.CodeableConcept[] getConfidentialityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONFIDENTIALITY$30, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "confidentiality" element
     */
    public org.hl7.fhir.CodeableConcept getConfidentialityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CONFIDENTIALITY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "confidentiality" element
     */
    public int sizeOfConfidentialityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIDENTIALITY$30);
        }
    }
    
    /**
     * Sets array of all "confidentiality" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConfidentialityArray(org.hl7.fhir.CodeableConcept[] confidentialityArray)
    {
        check_orphaned();
        arraySetterHelper(confidentialityArray, CONFIDENTIALITY$30);
    }
    
    /**
     * Sets ith "confidentiality" element
     */
    public void setConfidentialityArray(int i, org.hl7.fhir.CodeableConcept confidentiality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CONFIDENTIALITY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(confidentiality);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "confidentiality" element
     */
    public org.hl7.fhir.CodeableConcept insertNewConfidentiality(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(CONFIDENTIALITY$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "confidentiality" element
     */
    public org.hl7.fhir.CodeableConcept addNewConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CONFIDENTIALITY$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "confidentiality" element
     */
    public void removeConfidentiality(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIDENTIALITY$30, i);
        }
    }
    
    /**
     * Gets the "primaryLanguage" element
     */
    public org.hl7.fhir.Code getPrimaryLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(PRIMARYLANGUAGE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "primaryLanguage" element
     */
    public boolean isSetPrimaryLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYLANGUAGE$32) != 0;
        }
    }
    
    /**
     * Sets the "primaryLanguage" element
     */
    public void setPrimaryLanguage(org.hl7.fhir.Code primaryLanguage)
    {
        generatedSetterHelperImpl(primaryLanguage, PRIMARYLANGUAGE$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "primaryLanguage" element
     */
    public org.hl7.fhir.Code addNewPrimaryLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(PRIMARYLANGUAGE$32);
            return target;
        }
    }
    
    /**
     * Unsets the "primaryLanguage" element
     */
    public void unsetPrimaryLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYLANGUAGE$32, 0);
        }
    }
    
    /**
     * Gets the "mimeType" element
     */
    public org.hl7.fhir.Code getMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(MIMETYPE$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mimeType" element
     */
    public void setMimeType(org.hl7.fhir.Code mimeType)
    {
        generatedSetterHelperImpl(mimeType, MIMETYPE$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mimeType" element
     */
    public org.hl7.fhir.Code addNewMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(MIMETYPE$34);
            return target;
        }
    }
    
    /**
     * Gets array of all "format" elements
     */
    public org.hl7.fhir.Uri[] getFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMAT$36, targetList);
            org.hl7.fhir.Uri[] result = new org.hl7.fhir.Uri[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "format" element
     */
    public org.hl7.fhir.Uri getFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(FORMAT$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "format" element
     */
    public int sizeOfFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$36);
        }
    }
    
    /**
     * Sets array of all "format" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFormatArray(org.hl7.fhir.Uri[] formatArray)
    {
        check_orphaned();
        arraySetterHelper(formatArray, FORMAT$36);
    }
    
    /**
     * Sets ith "format" element
     */
    public void setFormatArray(int i, org.hl7.fhir.Uri format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(FORMAT$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(format);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "format" element
     */
    public org.hl7.fhir.Uri insertNewFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().insert_element_user(FORMAT$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "format" element
     */
    public org.hl7.fhir.Uri addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(FORMAT$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "format" element
     */
    public void removeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$36, i);
        }
    }
    
    /**
     * Gets the "size" element
     */
    public org.hl7.fhir.Integer getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(SIZE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "size" element
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIZE$38) != 0;
        }
    }
    
    /**
     * Sets the "size" element
     */
    public void setSize(org.hl7.fhir.Integer size)
    {
        generatedSetterHelperImpl(size, SIZE$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "size" element
     */
    public org.hl7.fhir.Integer addNewSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(SIZE$38);
            return target;
        }
    }
    
    /**
     * Unsets the "size" element
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIZE$38, 0);
        }
    }
    
    /**
     * Gets the "hash" element
     */
    public org.hl7.fhir.String getHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(HASH$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hash" element
     */
    public boolean isSetHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HASH$40) != 0;
        }
    }
    
    /**
     * Sets the "hash" element
     */
    public void setHash(org.hl7.fhir.String hash)
    {
        generatedSetterHelperImpl(hash, HASH$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "hash" element
     */
    public org.hl7.fhir.String addNewHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(HASH$40);
            return target;
        }
    }
    
    /**
     * Unsets the "hash" element
     */
    public void unsetHash()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HASH$40, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public org.hl7.fhir.Uri getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(LOCATION$42, 0);
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
            return get_store().count_elements(LOCATION$42) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.hl7.fhir.Uri location)
    {
        generatedSetterHelperImpl(location, LOCATION$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.hl7.fhir.Uri addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(LOCATION$42);
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
            get_store().remove_element(LOCATION$42, 0);
        }
    }
    
    /**
     * Gets the "service" element
     */
    public org.hl7.fhir.DocumentReferenceService getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceService target = null;
            target = (org.hl7.fhir.DocumentReferenceService)get_store().find_element_user(SERVICE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "service" element
     */
    public boolean isSetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$44) != 0;
        }
    }
    
    /**
     * Sets the "service" element
     */
    public void setService(org.hl7.fhir.DocumentReferenceService service)
    {
        generatedSetterHelperImpl(service, SERVICE$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "service" element
     */
    public org.hl7.fhir.DocumentReferenceService addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceService target = null;
            target = (org.hl7.fhir.DocumentReferenceService)get_store().add_element_user(SERVICE$44);
            return target;
        }
    }
    
    /**
     * Unsets the "service" element
     */
    public void unsetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$44, 0);
        }
    }
    
    /**
     * Gets the "context" element
     */
    public org.hl7.fhir.DocumentReferenceContext getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceContext target = null;
            target = (org.hl7.fhir.DocumentReferenceContext)get_store().find_element_user(CONTEXT$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "context" element
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$46) != 0;
        }
    }
    
    /**
     * Sets the "context" element
     */
    public void setContext(org.hl7.fhir.DocumentReferenceContext context)
    {
        generatedSetterHelperImpl(context, CONTEXT$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "context" element
     */
    public org.hl7.fhir.DocumentReferenceContext addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DocumentReferenceContext target = null;
            target = (org.hl7.fhir.DocumentReferenceContext)get_store().add_element_user(CONTEXT$46);
            return target;
        }
    }
    
    /**
     * Unsets the "context" element
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$46, 0);
        }
    }
}
