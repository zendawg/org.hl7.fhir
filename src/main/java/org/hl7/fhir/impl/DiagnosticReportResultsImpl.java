/*
 * XML Type:  DiagnosticReport.Results
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.DiagnosticReportResults
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML DiagnosticReport.Results(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class DiagnosticReportResultsImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.DiagnosticReportResults
{
    private static final long serialVersionUID = 1L;
    
    public DiagnosticReportResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName SPECIMEN$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "specimen");
    private static final javax.xml.namespace.QName GROUP$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "group");
    private static final javax.xml.namespace.QName RESULT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "result");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.CodeableConcept getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(NAME$0, 0);
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
    public void setName(org.hl7.fhir.CodeableConcept name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.CodeableConcept addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "specimen" element
     */
    public org.hl7.fhir.ResourceReference getSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SPECIMEN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "specimen" element
     */
    public boolean isSetSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIMEN$2) != 0;
        }
    }
    
    /**
     * Sets the "specimen" element
     */
    public void setSpecimen(org.hl7.fhir.ResourceReference specimen)
    {
        generatedSetterHelperImpl(specimen, SPECIMEN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "specimen" element
     */
    public org.hl7.fhir.ResourceReference addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SPECIMEN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "specimen" element
     */
    public void unsetSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIMEN$2, 0);
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public org.hl7.fhir.DiagnosticReportResults[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$4, targetList);
            org.hl7.fhir.DiagnosticReportResults[] result = new org.hl7.fhir.DiagnosticReportResults[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public org.hl7.fhir.DiagnosticReportResults getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportResults target = null;
            target = (org.hl7.fhir.DiagnosticReportResults)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$4);
        }
    }
    
    /**
     * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGroupArray(org.hl7.fhir.DiagnosticReportResults[] groupArray)
    {
        check_orphaned();
        arraySetterHelper(groupArray, GROUP$4);
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.hl7.fhir.DiagnosticReportResults group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportResults target = null;
            target = (org.hl7.fhir.DiagnosticReportResults)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.hl7.fhir.DiagnosticReportResults insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportResults target = null;
            target = (org.hl7.fhir.DiagnosticReportResults)get_store().insert_element_user(GROUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.hl7.fhir.DiagnosticReportResults addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DiagnosticReportResults target = null;
            target = (org.hl7.fhir.DiagnosticReportResults)get_store().add_element_user(GROUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$4, i);
        }
    }
    
    /**
     * Gets array of all "result" elements
     */
    public org.hl7.fhir.ResourceReference[] getResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESULT$6, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "result" element
     */
    public org.hl7.fhir.ResourceReference getResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESULT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "result" element
     */
    public int sizeOfResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$6);
        }
    }
    
    /**
     * Sets array of all "result" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResultArray(org.hl7.fhir.ResourceReference[] resultArray)
    {
        check_orphaned();
        arraySetterHelper(resultArray, RESULT$6);
    }
    
    /**
     * Sets ith "result" element
     */
    public void setResultArray(int i, org.hl7.fhir.ResourceReference result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(RESULT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(result);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "result" element
     */
    public org.hl7.fhir.ResourceReference insertNewResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(RESULT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "result" element
     */
    public org.hl7.fhir.ResourceReference addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(RESULT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "result" element
     */
    public void removeResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$6, i);
        }
    }
}
