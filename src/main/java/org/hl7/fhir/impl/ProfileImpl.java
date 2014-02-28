/*
 * XML Type:  Profile
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Profile
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Profile
{
    private static final long serialVersionUID = 1L;
    
    public ProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "version");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName PUBLISHER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "publisher");
    private static final javax.xml.namespace.QName TELECOM$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "telecom");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "description");
    private static final javax.xml.namespace.QName CODE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName EXPERIMENTAL$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "experimental");
    private static final javax.xml.namespace.QName DATE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName REQUIREMENTS$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requirements");
    private static final javax.xml.namespace.QName FHIRVERSION$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "fhirVersion");
    private static final javax.xml.namespace.QName MAPPING$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mapping");
    private static final javax.xml.namespace.QName STRUCTURE$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "structure");
    private static final javax.xml.namespace.QName EXTENSIONDEFN$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "extensionDefn");
    private static final javax.xml.namespace.QName QUERY$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "query");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.hl7.fhir.String getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(IDENTIFIER$0, 0);
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
    public void setIdentifier(org.hl7.fhir.String identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.hl7.fhir.String addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(IDENTIFIER$0);
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
     * Gets the "version" element
     */
    public org.hl7.fhir.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VERSION$2, 0);
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
            return get_store().count_elements(VERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(org.hl7.fhir.String version)
    {
        generatedSetterHelperImpl(version, VERSION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(VERSION$2);
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
            get_store().remove_element(VERSION$2, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Gets the "publisher" element
     */
    public org.hl7.fhir.String getPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(PUBLISHER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "publisher" element
     */
    public boolean isSetPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLISHER$6) != 0;
        }
    }
    
    /**
     * Sets the "publisher" element
     */
    public void setPublisher(org.hl7.fhir.String publisher)
    {
        generatedSetterHelperImpl(publisher, PUBLISHER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "publisher" element
     */
    public org.hl7.fhir.String addNewPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(PUBLISHER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "publisher" element
     */
    public void unsetPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLISHER$6, 0);
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
     * Gets the "description" element
     */
    public org.hl7.fhir.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DESCRIPTION$10, 0);
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
            return get_store().count_elements(DESCRIPTION$10) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.hl7.fhir.String description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DESCRIPTION$10);
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
            get_store().remove_element(DESCRIPTION$10, 0);
        }
    }
    
    /**
     * Gets array of all "code" elements
     */
    public org.hl7.fhir.Coding[] getCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODE$12, targetList);
            org.hl7.fhir.Coding[] result = new org.hl7.fhir.Coding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "code" element
     */
    public org.hl7.fhir.Coding getCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "code" element
     */
    public int sizeOfCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$12);
        }
    }
    
    /**
     * Sets array of all "code" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodeArray(org.hl7.fhir.Coding[] codeArray)
    {
        check_orphaned();
        arraySetterHelper(codeArray, CODE$12);
    }
    
    /**
     * Sets ith "code" element
     */
    public void setCodeArray(int i, org.hl7.fhir.Coding code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(code);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "code" element
     */
    public org.hl7.fhir.Coding insertNewCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().insert_element_user(CODE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "code" element
     */
    public org.hl7.fhir.Coding addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(CODE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "code" element
     */
    public void removeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$12, i);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.ResourceProfileStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceProfileStatus target = null;
            target = (org.hl7.fhir.ResourceProfileStatus)get_store().find_element_user(STATUS$14, 0);
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
    public void setStatus(org.hl7.fhir.ResourceProfileStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.ResourceProfileStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceProfileStatus target = null;
            target = (org.hl7.fhir.ResourceProfileStatus)get_store().add_element_user(STATUS$14);
            return target;
        }
    }
    
    /**
     * Gets the "experimental" element
     */
    public org.hl7.fhir.Boolean getExperimental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(EXPERIMENTAL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "experimental" element
     */
    public boolean isSetExperimental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPERIMENTAL$16) != 0;
        }
    }
    
    /**
     * Sets the "experimental" element
     */
    public void setExperimental(org.hl7.fhir.Boolean experimental)
    {
        generatedSetterHelperImpl(experimental, EXPERIMENTAL$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "experimental" element
     */
    public org.hl7.fhir.Boolean addNewExperimental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(EXPERIMENTAL$16);
            return target;
        }
    }
    
    /**
     * Unsets the "experimental" element
     */
    public void unsetExperimental()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPERIMENTAL$16, 0);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$18) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$18, 0);
        }
    }
    
    /**
     * Gets the "requirements" element
     */
    public org.hl7.fhir.String getRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(REQUIREMENTS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requirements" element
     */
    public boolean isSetRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREMENTS$20) != 0;
        }
    }
    
    /**
     * Sets the "requirements" element
     */
    public void setRequirements(org.hl7.fhir.String requirements)
    {
        generatedSetterHelperImpl(requirements, REQUIREMENTS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requirements" element
     */
    public org.hl7.fhir.String addNewRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(REQUIREMENTS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "requirements" element
     */
    public void unsetRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREMENTS$20, 0);
        }
    }
    
    /**
     * Gets the "fhirVersion" element
     */
    public org.hl7.fhir.Id getFhirVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(FHIRVERSION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fhirVersion" element
     */
    public boolean isSetFhirVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FHIRVERSION$22) != 0;
        }
    }
    
    /**
     * Sets the "fhirVersion" element
     */
    public void setFhirVersion(org.hl7.fhir.Id fhirVersion)
    {
        generatedSetterHelperImpl(fhirVersion, FHIRVERSION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fhirVersion" element
     */
    public org.hl7.fhir.Id addNewFhirVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(FHIRVERSION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "fhirVersion" element
     */
    public void unsetFhirVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FHIRVERSION$22, 0);
        }
    }
    
    /**
     * Gets array of all "mapping" elements
     */
    public org.hl7.fhir.ProfileMapping[] getMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPPING$24, targetList);
            org.hl7.fhir.ProfileMapping[] result = new org.hl7.fhir.ProfileMapping[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mapping" element
     */
    public org.hl7.fhir.ProfileMapping getMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping target = null;
            target = (org.hl7.fhir.ProfileMapping)get_store().find_element_user(MAPPING$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mapping" element
     */
    public int sizeOfMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPING$24);
        }
    }
    
    /**
     * Sets array of all "mapping" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMappingArray(org.hl7.fhir.ProfileMapping[] mappingArray)
    {
        check_orphaned();
        arraySetterHelper(mappingArray, MAPPING$24);
    }
    
    /**
     * Sets ith "mapping" element
     */
    public void setMappingArray(int i, org.hl7.fhir.ProfileMapping mapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping target = null;
            target = (org.hl7.fhir.ProfileMapping)get_store().find_element_user(MAPPING$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mapping" element
     */
    public org.hl7.fhir.ProfileMapping insertNewMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping target = null;
            target = (org.hl7.fhir.ProfileMapping)get_store().insert_element_user(MAPPING$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mapping" element
     */
    public org.hl7.fhir.ProfileMapping addNewMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping target = null;
            target = (org.hl7.fhir.ProfileMapping)get_store().add_element_user(MAPPING$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "mapping" element
     */
    public void removeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPING$24, i);
        }
    }
    
    /**
     * Gets array of all "structure" elements
     */
    public org.hl7.fhir.ProfileStructure[] getStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURE$26, targetList);
            org.hl7.fhir.ProfileStructure[] result = new org.hl7.fhir.ProfileStructure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "structure" element
     */
    public org.hl7.fhir.ProfileStructure getStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileStructure target = null;
            target = (org.hl7.fhir.ProfileStructure)get_store().find_element_user(STRUCTURE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "structure" element
     */
    public int sizeOfStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURE$26);
        }
    }
    
    /**
     * Sets array of all "structure" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStructureArray(org.hl7.fhir.ProfileStructure[] structureArray)
    {
        check_orphaned();
        arraySetterHelper(structureArray, STRUCTURE$26);
    }
    
    /**
     * Sets ith "structure" element
     */
    public void setStructureArray(int i, org.hl7.fhir.ProfileStructure structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileStructure target = null;
            target = (org.hl7.fhir.ProfileStructure)get_store().find_element_user(STRUCTURE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "structure" element
     */
    public org.hl7.fhir.ProfileStructure insertNewStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileStructure target = null;
            target = (org.hl7.fhir.ProfileStructure)get_store().insert_element_user(STRUCTURE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "structure" element
     */
    public org.hl7.fhir.ProfileStructure addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileStructure target = null;
            target = (org.hl7.fhir.ProfileStructure)get_store().add_element_user(STRUCTURE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "structure" element
     */
    public void removeStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURE$26, i);
        }
    }
    
    /**
     * Gets array of all "extensionDefn" elements
     */
    public org.hl7.fhir.ProfileExtensionDefn[] getExtensionDefnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENSIONDEFN$28, targetList);
            org.hl7.fhir.ProfileExtensionDefn[] result = new org.hl7.fhir.ProfileExtensionDefn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extensionDefn" element
     */
    public org.hl7.fhir.ProfileExtensionDefn getExtensionDefnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileExtensionDefn target = null;
            target = (org.hl7.fhir.ProfileExtensionDefn)get_store().find_element_user(EXTENSIONDEFN$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extensionDefn" element
     */
    public int sizeOfExtensionDefnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSIONDEFN$28);
        }
    }
    
    /**
     * Sets array of all "extensionDefn" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExtensionDefnArray(org.hl7.fhir.ProfileExtensionDefn[] extensionDefnArray)
    {
        check_orphaned();
        arraySetterHelper(extensionDefnArray, EXTENSIONDEFN$28);
    }
    
    /**
     * Sets ith "extensionDefn" element
     */
    public void setExtensionDefnArray(int i, org.hl7.fhir.ProfileExtensionDefn extensionDefn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileExtensionDefn target = null;
            target = (org.hl7.fhir.ProfileExtensionDefn)get_store().find_element_user(EXTENSIONDEFN$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extensionDefn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extensionDefn" element
     */
    public org.hl7.fhir.ProfileExtensionDefn insertNewExtensionDefn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileExtensionDefn target = null;
            target = (org.hl7.fhir.ProfileExtensionDefn)get_store().insert_element_user(EXTENSIONDEFN$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extensionDefn" element
     */
    public org.hl7.fhir.ProfileExtensionDefn addNewExtensionDefn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileExtensionDefn target = null;
            target = (org.hl7.fhir.ProfileExtensionDefn)get_store().add_element_user(EXTENSIONDEFN$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "extensionDefn" element
     */
    public void removeExtensionDefn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSIONDEFN$28, i);
        }
    }
    
    /**
     * Gets array of all "query" elements
     */
    public org.hl7.fhir.ProfileQuery[] getQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERY$30, targetList);
            org.hl7.fhir.ProfileQuery[] result = new org.hl7.fhir.ProfileQuery[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "query" element
     */
    public org.hl7.fhir.ProfileQuery getQueryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileQuery target = null;
            target = (org.hl7.fhir.ProfileQuery)get_store().find_element_user(QUERY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "query" element
     */
    public int sizeOfQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$30);
        }
    }
    
    /**
     * Sets array of all "query" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQueryArray(org.hl7.fhir.ProfileQuery[] queryArray)
    {
        check_orphaned();
        arraySetterHelper(queryArray, QUERY$30);
    }
    
    /**
     * Sets ith "query" element
     */
    public void setQueryArray(int i, org.hl7.fhir.ProfileQuery query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileQuery target = null;
            target = (org.hl7.fhir.ProfileQuery)get_store().find_element_user(QUERY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(query);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    public org.hl7.fhir.ProfileQuery insertNewQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileQuery target = null;
            target = (org.hl7.fhir.ProfileQuery)get_store().insert_element_user(QUERY$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    public org.hl7.fhir.ProfileQuery addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileQuery target = null;
            target = (org.hl7.fhir.ProfileQuery)get_store().add_element_user(QUERY$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "query" element
     */
    public void removeQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$30, i);
        }
    }
}
