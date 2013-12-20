/*
 * XML Type:  DocumentManifest
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DocumentManifest
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DocumentManifest(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DocumentManifestImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.DocumentManifest
{
    private static final long serialVersionUID = 1L;
    
    public DocumentManifestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MASTERIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "masterIdentifier");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SUBJECT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName RECIPIENT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "recipient");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName AUTHOR$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "author");
    private static final javax.xml.namespace.QName CREATED$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "created");
    private static final javax.xml.namespace.QName SOURCE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "source");
    private static final javax.xml.namespace.QName STATUS$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName SUPERCEDES$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "supercedes");
    private static final javax.xml.namespace.QName DESCRIPTION$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName CONFIDENTIALITY$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "confidentiality");
    private static final javax.xml.namespace.QName CONTENT$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "content");
    
    
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
     * Gets array of all "subject" elements
     */
    public org.hl7.fhir.ResourceReference[] getSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBJECT$4, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subject" element
     */
    public int sizeOfSubjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$4);
        }
    }
    
    /**
     * Sets array of all "subject" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubjectArray(org.hl7.fhir.ResourceReference[] subjectArray)
    {
        check_orphaned();
        arraySetterHelper(subjectArray, SUBJECT$4);
    }
    
    /**
     * Sets ith "subject" element
     */
    public void setSubjectArray(int i, org.hl7.fhir.ResourceReference subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subject" element
     */
    public org.hl7.fhir.ResourceReference insertNewSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(SUBJECT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subject" element
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
     * Removes the ith "subject" element
     */
    public void removeSubject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$4, i);
        }
    }
    
    /**
     * Gets array of all "recipient" elements
     */
    public org.hl7.fhir.ResourceReference[] getRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECIPIENT$6, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recipient" element
     */
    public org.hl7.fhir.ResourceReference getRecipientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RECIPIENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recipient" element
     */
    public int sizeOfRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIPIENT$6);
        }
    }
    
    /**
     * Sets array of all "recipient" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRecipientArray(org.hl7.fhir.ResourceReference[] recipientArray)
    {
        check_orphaned();
        arraySetterHelper(recipientArray, RECIPIENT$6);
    }
    
    /**
     * Sets ith "recipient" element
     */
    public void setRecipientArray(int i, org.hl7.fhir.ResourceReference recipient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RECIPIENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recipient);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recipient" element
     */
    public org.hl7.fhir.ResourceReference insertNewRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(RECIPIENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recipient" element
     */
    public org.hl7.fhir.ResourceReference addNewRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RECIPIENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "recipient" element
     */
    public void removeRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIPIENT$6, i);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$8, 0);
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
            return get_store().count_elements(TYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$8);
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
            get_store().remove_element(TYPE$8, 0);
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
     * Gets the "created" element
     */
    public org.hl7.fhir.DateTime getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(CREATED$12, 0);
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
            return get_store().count_elements(CREATED$12) != 0;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(org.hl7.fhir.DateTime created)
    {
        generatedSetterHelperImpl(created, CREATED$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(CREATED$12);
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
            get_store().remove_element(CREATED$12, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.hl7.fhir.Uri getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SOURCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$14) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.hl7.fhir.Uri source)
    {
        generatedSetterHelperImpl(source, SOURCE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.hl7.fhir.Uri addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SOURCE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$14, 0);
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
            target = (org.hl7.fhir.DocumentReferenceStatus)get_store().find_element_user(STATUS$16, 0);
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
        generatedSetterHelperImpl(status, STATUS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DocumentReferenceStatus)get_store().add_element_user(STATUS$16);
            return target;
        }
    }
    
    /**
     * Gets the "supercedes" element
     */
    public org.hl7.fhir.ResourceReference getSupercedes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUPERCEDES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "supercedes" element
     */
    public boolean isSetSupercedes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPERCEDES$18) != 0;
        }
    }
    
    /**
     * Sets the "supercedes" element
     */
    public void setSupercedes(org.hl7.fhir.ResourceReference supercedes)
    {
        generatedSetterHelperImpl(supercedes, SUPERCEDES$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "supercedes" element
     */
    public org.hl7.fhir.ResourceReference addNewSupercedes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUPERCEDES$18);
            return target;
        }
    }
    
    /**
     * Unsets the "supercedes" element
     */
    public void unsetSupercedes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPERCEDES$18, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$20, 0);
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
            return get_store().count_elements(DESCRIPTION$20) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$20);
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
            get_store().remove_element(DESCRIPTION$20, 0);
        }
    }
    
    /**
     * Gets the "confidentiality" element
     */
    public org.hl7.fhir.CodeableConcept getConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CONFIDENTIALITY$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "confidentiality" element
     */
    public boolean isSetConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIDENTIALITY$22) != 0;
        }
    }
    
    /**
     * Sets the "confidentiality" element
     */
    public void setConfidentiality(org.hl7.fhir.CodeableConcept confidentiality)
    {
        generatedSetterHelperImpl(confidentiality, CONFIDENTIALITY$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "confidentiality" element
     */
    public org.hl7.fhir.CodeableConcept addNewConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CONFIDENTIALITY$22);
            return target;
        }
    }
    
    /**
     * Unsets the "confidentiality" element
     */
    public void unsetConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIDENTIALITY$22, 0);
        }
    }
    
    /**
     * Gets array of all "content" elements
     */
    public org.hl7.fhir.ResourceReference[] getContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENT$24, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "content" element
     */
    public org.hl7.fhir.ResourceReference getContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CONTENT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "content" element
     */
    public int sizeOfContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$24);
        }
    }
    
    /**
     * Sets array of all "content" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContentArray(org.hl7.fhir.ResourceReference[] contentArray)
    {
        check_orphaned();
        arraySetterHelper(contentArray, CONTENT$24);
    }
    
    /**
     * Sets ith "content" element
     */
    public void setContentArray(int i, org.hl7.fhir.ResourceReference content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(CONTENT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(content);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    public org.hl7.fhir.ResourceReference insertNewContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(CONTENT$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    public org.hl7.fhir.ResourceReference addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(CONTENT$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "content" element
     */
    public void removeContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$24, i);
        }
    }
}
