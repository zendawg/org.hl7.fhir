/*
 * XML Type:  OperationOutcome.Issue
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OperationOutcomeIssue
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML OperationOutcome.Issue(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class OperationOutcomeIssueImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.OperationOutcomeIssue
{
    private static final long serialVersionUID = 1L;
    
    public OperationOutcomeIssueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEVERITY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "severity");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName DETAILS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "details");
    private static final javax.xml.namespace.QName LOCATION$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    
    
    /**
     * Gets the "severity" element
     */
    public org.hl7.fhir.IssueSeverity getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.IssueSeverity target = null;
            target = (org.hl7.fhir.IssueSeverity)get_store().find_element_user(SEVERITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "severity" element
     */
    public void setSeverity(org.hl7.fhir.IssueSeverity severity)
    {
        generatedSetterHelperImpl(severity, SEVERITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "severity" element
     */
    public org.hl7.fhir.IssueSeverity addNewSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.IssueSeverity target = null;
            target = (org.hl7.fhir.IssueSeverity)get_store().add_element_user(SEVERITY$0);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.Coding getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(TYPE$2, 0);
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
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.Coding type)
    {
        generatedSetterHelperImpl(type, TYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.Coding addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(TYPE$2);
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
            get_store().remove_element(TYPE$2, 0);
        }
    }
    
    /**
     * Gets the "details" element
     */
    public org.hl7.fhir.String getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "details" element
     */
    public boolean isSetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$4) != 0;
        }
    }
    
    /**
     * Sets the "details" element
     */
    public void setDetails(org.hl7.fhir.String details)
    {
        generatedSetterHelperImpl(details, DETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "details" element
     */
    public org.hl7.fhir.String addNewDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DETAILS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "details" element
     */
    public void unsetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$4, 0);
        }
    }
    
    /**
     * Gets array of all "location" elements
     */
    public org.hl7.fhir.String[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$6, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.hl7.fhir.String getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LOCATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$6);
        }
    }
    
    /**
     * Sets array of all "location" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLocationArray(org.hl7.fhir.String[] locationArray)
    {
        check_orphaned();
        arraySetterHelper(locationArray, LOCATION$6);
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.hl7.fhir.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LOCATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    public org.hl7.fhir.String insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(LOCATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.hl7.fhir.String addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(LOCATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$6, i);
        }
    }
}
