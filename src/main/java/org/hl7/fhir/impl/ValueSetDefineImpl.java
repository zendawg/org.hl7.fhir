/*
 * XML Type:  ValueSet.Define
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetDefine
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet.Define(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetDefineImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ValueSetDefine
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetDefineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "version");
    private static final javax.xml.namespace.QName CASESENSITIVE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "caseSensitive");
    private static final javax.xml.namespace.QName CONCEPT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "concept");
    
    
    /**
     * Gets the "system" element
     */
    public org.hl7.fhir.Uri getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(org.hl7.fhir.Uri system)
    {
        generatedSetterHelperImpl(system, SYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "system" element
     */
    public org.hl7.fhir.Uri addNewSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SYSTEM$0);
            return target;
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
     * Gets the "caseSensitive" element
     */
    public org.hl7.fhir.Boolean getCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(CASESENSITIVE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "caseSensitive" element
     */
    public boolean isSetCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASESENSITIVE$4) != 0;
        }
    }
    
    /**
     * Sets the "caseSensitive" element
     */
    public void setCaseSensitive(org.hl7.fhir.Boolean caseSensitive)
    {
        generatedSetterHelperImpl(caseSensitive, CASESENSITIVE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "caseSensitive" element
     */
    public org.hl7.fhir.Boolean addNewCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(CASESENSITIVE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "caseSensitive" element
     */
    public void unsetCaseSensitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASESENSITIVE$4, 0);
        }
    }
    
    /**
     * Gets array of all "concept" elements
     */
    public org.hl7.fhir.ValueSetConcept[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$6, targetList);
            org.hl7.fhir.ValueSetConcept[] result = new org.hl7.fhir.ValueSetConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "concept" element
     */
    public org.hl7.fhir.ValueSetConcept getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().find_element_user(CONCEPT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$6);
        }
    }
    
    /**
     * Sets array of all "concept" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConceptArray(org.hl7.fhir.ValueSetConcept[] conceptArray)
    {
        check_orphaned();
        arraySetterHelper(conceptArray, CONCEPT$6);
    }
    
    /**
     * Sets ith "concept" element
     */
    public void setConceptArray(int i, org.hl7.fhir.ValueSetConcept concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().find_element_user(CONCEPT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    public org.hl7.fhir.ValueSetConcept insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().insert_element_user(CONCEPT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    public org.hl7.fhir.ValueSetConcept addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().add_element_user(CONCEPT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$6, i);
        }
    }
}
