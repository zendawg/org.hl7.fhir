/*
 * XML Type:  ValueSet
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSet
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.ValueSet
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName COPYRIGHT$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "copyright");
    private static final javax.xml.namespace.QName STATUS$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "status");
    private static final javax.xml.namespace.QName EXPERIMENTAL$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "experimental");
    private static final javax.xml.namespace.QName EXTENSIBLE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "extensible");
    private static final javax.xml.namespace.QName DATE$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName DEFINE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "define");
    private static final javax.xml.namespace.QName COMPOSE$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "compose");
    private static final javax.xml.namespace.QName EXPANSION$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "expansion");
    
    
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
     * Gets the "copyright" element
     */
    public org.hl7.fhir.String getCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COPYRIGHT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "copyright" element
     */
    public boolean isSetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COPYRIGHT$12) != 0;
        }
    }
    
    /**
     * Sets the "copyright" element
     */
    public void setCopyright(org.hl7.fhir.String copyright)
    {
        generatedSetterHelperImpl(copyright, COPYRIGHT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "copyright" element
     */
    public org.hl7.fhir.String addNewCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(COPYRIGHT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "copyright" element
     */
    public void unsetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COPYRIGHT$12, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.hl7.fhir.ValueSetStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetStatus target = null;
            target = (org.hl7.fhir.ValueSetStatus)get_store().find_element_user(STATUS$14, 0);
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
    public void setStatus(org.hl7.fhir.ValueSetStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.hl7.fhir.ValueSetStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetStatus target = null;
            target = (org.hl7.fhir.ValueSetStatus)get_store().add_element_user(STATUS$14);
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
     * Gets the "extensible" element
     */
    public org.hl7.fhir.Boolean getExtensible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(EXTENSIBLE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extensible" element
     */
    public boolean isSetExtensible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSIBLE$18) != 0;
        }
    }
    
    /**
     * Sets the "extensible" element
     */
    public void setExtensible(org.hl7.fhir.Boolean extensible)
    {
        generatedSetterHelperImpl(extensible, EXTENSIBLE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extensible" element
     */
    public org.hl7.fhir.Boolean addNewExtensible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(EXTENSIBLE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "extensible" element
     */
    public void unsetExtensible()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSIBLE$18, 0);
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
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$20, 0);
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
            return get_store().count_elements(DATE$20) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$20);
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
            get_store().remove_element(DATE$20, 0);
        }
    }
    
    /**
     * Gets the "define" element
     */
    public org.hl7.fhir.ValueSetDefine getDefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetDefine target = null;
            target = (org.hl7.fhir.ValueSetDefine)get_store().find_element_user(DEFINE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "define" element
     */
    public boolean isSetDefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINE$22) != 0;
        }
    }
    
    /**
     * Sets the "define" element
     */
    public void setDefine(org.hl7.fhir.ValueSetDefine define)
    {
        generatedSetterHelperImpl(define, DEFINE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "define" element
     */
    public org.hl7.fhir.ValueSetDefine addNewDefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetDefine target = null;
            target = (org.hl7.fhir.ValueSetDefine)get_store().add_element_user(DEFINE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "define" element
     */
    public void unsetDefine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINE$22, 0);
        }
    }
    
    /**
     * Gets the "compose" element
     */
    public org.hl7.fhir.ValueSetCompose getCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetCompose target = null;
            target = (org.hl7.fhir.ValueSetCompose)get_store().find_element_user(COMPOSE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "compose" element
     */
    public boolean isSetCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPOSE$24) != 0;
        }
    }
    
    /**
     * Sets the "compose" element
     */
    public void setCompose(org.hl7.fhir.ValueSetCompose compose)
    {
        generatedSetterHelperImpl(compose, COMPOSE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "compose" element
     */
    public org.hl7.fhir.ValueSetCompose addNewCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetCompose target = null;
            target = (org.hl7.fhir.ValueSetCompose)get_store().add_element_user(COMPOSE$24);
            return target;
        }
    }
    
    /**
     * Unsets the "compose" element
     */
    public void unsetCompose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPOSE$24, 0);
        }
    }
    
    /**
     * Gets the "expansion" element
     */
    public org.hl7.fhir.ValueSetExpansion getExpansion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetExpansion target = null;
            target = (org.hl7.fhir.ValueSetExpansion)get_store().find_element_user(EXPANSION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expansion" element
     */
    public boolean isSetExpansion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPANSION$26) != 0;
        }
    }
    
    /**
     * Sets the "expansion" element
     */
    public void setExpansion(org.hl7.fhir.ValueSetExpansion expansion)
    {
        generatedSetterHelperImpl(expansion, EXPANSION$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "expansion" element
     */
    public org.hl7.fhir.ValueSetExpansion addNewExpansion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetExpansion target = null;
            target = (org.hl7.fhir.ValueSetExpansion)get_store().add_element_user(EXPANSION$26);
            return target;
        }
    }
    
    /**
     * Unsets the "expansion" element
     */
    public void unsetExpansion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPANSION$26, 0);
        }
    }
}
