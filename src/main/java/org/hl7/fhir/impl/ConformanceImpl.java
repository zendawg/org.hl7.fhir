/*
 * XML Type:  Conformance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Conformance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Conformance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConformanceImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Conformance
{
    private static final long serialVersionUID = 1L;
    
    public ConformanceImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName STATUS$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName EXPERIMENTAL$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "experimental");
    private static final javax.xml.namespace.QName DATE$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName SOFTWARE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "software");
    private static final javax.xml.namespace.QName IMPLEMENTATION$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "implementation");
    private static final javax.xml.namespace.QName FHIRVERSION$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "fhirVersion");
    private static final javax.xml.namespace.QName ACCEPTUNKNOWN$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "acceptUnknown");
    private static final javax.xml.namespace.QName FORMAT$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "format");
    private static final javax.xml.namespace.QName PROFILE$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "profile");
    private static final javax.xml.namespace.QName REST$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "rest");
    private static final javax.xml.namespace.QName MESSAGING$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "messaging");
    private static final javax.xml.namespace.QName DOCUMENT$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "document");
    
    
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
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4) != 0;
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
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, 0);
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
     * Gets the "status" element
     */
    public org.hl7.fhir.ConformanceStatementStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceStatementStatus target = null;
            target = (org.hl7.fhir.ConformanceStatementStatus)get_store().find_element_user(STATUS$12, 0);
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
            return get_store().count_elements(STATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.hl7.fhir.ConformanceStatementStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.ConformanceStatementStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceStatementStatus target = null;
            target = (org.hl7.fhir.ConformanceStatementStatus)get_store().add_element_user(STATUS$12);
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
            get_store().remove_element(STATUS$12, 0);
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
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(EXPERIMENTAL$14, 0);
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
            return get_store().count_elements(EXPERIMENTAL$14) != 0;
        }
    }
    
    /**
     * Sets the "experimental" element
     */
    public void setExperimental(org.hl7.fhir.Boolean experimental)
    {
        generatedSetterHelperImpl(experimental, EXPERIMENTAL$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(EXPERIMENTAL$14);
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
            get_store().remove_element(EXPERIMENTAL$14, 0);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$16);
            return target;
        }
    }
    
    /**
     * Gets the "software" element
     */
    public org.hl7.fhir.ConformanceSoftware getSoftware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSoftware target = null;
            target = (org.hl7.fhir.ConformanceSoftware)get_store().find_element_user(SOFTWARE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "software" element
     */
    public boolean isSetSoftware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWARE$18) != 0;
        }
    }
    
    /**
     * Sets the "software" element
     */
    public void setSoftware(org.hl7.fhir.ConformanceSoftware software)
    {
        generatedSetterHelperImpl(software, SOFTWARE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "software" element
     */
    public org.hl7.fhir.ConformanceSoftware addNewSoftware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceSoftware target = null;
            target = (org.hl7.fhir.ConformanceSoftware)get_store().add_element_user(SOFTWARE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "software" element
     */
    public void unsetSoftware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWARE$18, 0);
        }
    }
    
    /**
     * Gets the "implementation" element
     */
    public org.hl7.fhir.ConformanceImplementation getImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceImplementation target = null;
            target = (org.hl7.fhir.ConformanceImplementation)get_store().find_element_user(IMPLEMENTATION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "implementation" element
     */
    public boolean isSetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPLEMENTATION$20) != 0;
        }
    }
    
    /**
     * Sets the "implementation" element
     */
    public void setImplementation(org.hl7.fhir.ConformanceImplementation implementation)
    {
        generatedSetterHelperImpl(implementation, IMPLEMENTATION$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "implementation" element
     */
    public org.hl7.fhir.ConformanceImplementation addNewImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceImplementation target = null;
            target = (org.hl7.fhir.ConformanceImplementation)get_store().add_element_user(IMPLEMENTATION$20);
            return target;
        }
    }
    
    /**
     * Unsets the "implementation" element
     */
    public void unsetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPLEMENTATION$20, 0);
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
     * Gets the "acceptUnknown" element
     */
    public org.hl7.fhir.Boolean getAcceptUnknown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ACCEPTUNKNOWN$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "acceptUnknown" element
     */
    public void setAcceptUnknown(org.hl7.fhir.Boolean acceptUnknown)
    {
        generatedSetterHelperImpl(acceptUnknown, ACCEPTUNKNOWN$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "acceptUnknown" element
     */
    public org.hl7.fhir.Boolean addNewAcceptUnknown()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ACCEPTUNKNOWN$24);
            return target;
        }
    }
    
    /**
     * Gets array of all "format" elements
     */
    public org.hl7.fhir.Code[] getFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMAT$26, targetList);
            org.hl7.fhir.Code[] result = new org.hl7.fhir.Code[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "format" element
     */
    public org.hl7.fhir.Code getFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(FORMAT$26, i);
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
            return get_store().count_elements(FORMAT$26);
        }
    }
    
    /**
     * Sets array of all "format" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFormatArray(org.hl7.fhir.Code[] formatArray)
    {
        check_orphaned();
        arraySetterHelper(formatArray, FORMAT$26);
    }
    
    /**
     * Sets ith "format" element
     */
    public void setFormatArray(int i, org.hl7.fhir.Code format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(FORMAT$26, i);
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
    public org.hl7.fhir.Code insertNewFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().insert_element_user(FORMAT$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "format" element
     */
    public org.hl7.fhir.Code addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(FORMAT$26);
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
            get_store().remove_element(FORMAT$26, i);
        }
    }
    
    /**
     * Gets array of all "profile" elements
     */
    public org.hl7.fhir.ResourceReference[] getProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROFILE$28, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "profile" element
     */
    public org.hl7.fhir.ResourceReference getProfileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PROFILE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "profile" element
     */
    public int sizeOfProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROFILE$28);
        }
    }
    
    /**
     * Sets array of all "profile" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProfileArray(org.hl7.fhir.ResourceReference[] profileArray)
    {
        check_orphaned();
        arraySetterHelper(profileArray, PROFILE$28);
    }
    
    /**
     * Sets ith "profile" element
     */
    public void setProfileArray(int i, org.hl7.fhir.ResourceReference profile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PROFILE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(profile);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "profile" element
     */
    public org.hl7.fhir.ResourceReference insertNewProfile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(PROFILE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "profile" element
     */
    public org.hl7.fhir.ResourceReference addNewProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PROFILE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "profile" element
     */
    public void removeProfile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROFILE$28, i);
        }
    }
    
    /**
     * Gets array of all "rest" elements
     */
    public org.hl7.fhir.ConformanceRest[] getRestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REST$30, targetList);
            org.hl7.fhir.ConformanceRest[] result = new org.hl7.fhir.ConformanceRest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rest" element
     */
    public org.hl7.fhir.ConformanceRest getRestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceRest target = null;
            target = (org.hl7.fhir.ConformanceRest)get_store().find_element_user(REST$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rest" element
     */
    public int sizeOfRestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REST$30);
        }
    }
    
    /**
     * Sets array of all "rest" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRestArray(org.hl7.fhir.ConformanceRest[] restArray)
    {
        check_orphaned();
        arraySetterHelper(restArray, REST$30);
    }
    
    /**
     * Sets ith "rest" element
     */
    public void setRestArray(int i, org.hl7.fhir.ConformanceRest rest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceRest target = null;
            target = (org.hl7.fhir.ConformanceRest)get_store().find_element_user(REST$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rest" element
     */
    public org.hl7.fhir.ConformanceRest insertNewRest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceRest target = null;
            target = (org.hl7.fhir.ConformanceRest)get_store().insert_element_user(REST$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rest" element
     */
    public org.hl7.fhir.ConformanceRest addNewRest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceRest target = null;
            target = (org.hl7.fhir.ConformanceRest)get_store().add_element_user(REST$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "rest" element
     */
    public void removeRest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REST$30, i);
        }
    }
    
    /**
     * Gets array of all "messaging" elements
     */
    public org.hl7.fhir.ConformanceMessaging[] getMessagingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGING$32, targetList);
            org.hl7.fhir.ConformanceMessaging[] result = new org.hl7.fhir.ConformanceMessaging[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "messaging" element
     */
    public org.hl7.fhir.ConformanceMessaging getMessagingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceMessaging target = null;
            target = (org.hl7.fhir.ConformanceMessaging)get_store().find_element_user(MESSAGING$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "messaging" element
     */
    public int sizeOfMessagingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGING$32);
        }
    }
    
    /**
     * Sets array of all "messaging" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMessagingArray(org.hl7.fhir.ConformanceMessaging[] messagingArray)
    {
        check_orphaned();
        arraySetterHelper(messagingArray, MESSAGING$32);
    }
    
    /**
     * Sets ith "messaging" element
     */
    public void setMessagingArray(int i, org.hl7.fhir.ConformanceMessaging messaging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceMessaging target = null;
            target = (org.hl7.fhir.ConformanceMessaging)get_store().find_element_user(MESSAGING$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messaging);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messaging" element
     */
    public org.hl7.fhir.ConformanceMessaging insertNewMessaging(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceMessaging target = null;
            target = (org.hl7.fhir.ConformanceMessaging)get_store().insert_element_user(MESSAGING$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messaging" element
     */
    public org.hl7.fhir.ConformanceMessaging addNewMessaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceMessaging target = null;
            target = (org.hl7.fhir.ConformanceMessaging)get_store().add_element_user(MESSAGING$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "messaging" element
     */
    public void removeMessaging(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGING$32, i);
        }
    }
    
    /**
     * Gets array of all "document" elements
     */
    public org.hl7.fhir.ConformanceDocument1[] getDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENT$34, targetList);
            org.hl7.fhir.ConformanceDocument1[] result = new org.hl7.fhir.ConformanceDocument1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "document" element
     */
    public org.hl7.fhir.ConformanceDocument1 getDocumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceDocument1 target = null;
            target = (org.hl7.fhir.ConformanceDocument1)get_store().find_element_user(DOCUMENT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "document" element
     */
    public int sizeOfDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENT$34);
        }
    }
    
    /**
     * Sets array of all "document" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentArray(org.hl7.fhir.ConformanceDocument1[] documentArray)
    {
        check_orphaned();
        arraySetterHelper(documentArray, DOCUMENT$34);
    }
    
    /**
     * Sets ith "document" element
     */
    public void setDocumentArray(int i, org.hl7.fhir.ConformanceDocument1 document)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceDocument1 target = null;
            target = (org.hl7.fhir.ConformanceDocument1)get_store().find_element_user(DOCUMENT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(document);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "document" element
     */
    public org.hl7.fhir.ConformanceDocument1 insertNewDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceDocument1 target = null;
            target = (org.hl7.fhir.ConformanceDocument1)get_store().insert_element_user(DOCUMENT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "document" element
     */
    public org.hl7.fhir.ConformanceDocument1 addNewDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConformanceDocument1 target = null;
            target = (org.hl7.fhir.ConformanceDocument1)get_store().add_element_user(DOCUMENT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "document" element
     */
    public void removeDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENT$34, i);
        }
    }
}
