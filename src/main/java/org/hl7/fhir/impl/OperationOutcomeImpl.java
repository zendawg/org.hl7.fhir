/*
 * XML Type:  OperationOutcome
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.OperationOutcome
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML OperationOutcome(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class OperationOutcomeImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.OperationOutcome
{
    private static final long serialVersionUID = 1L;
    
    public OperationOutcomeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISSUE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "issue");
    
    
    /**
     * Gets array of all "issue" elements
     */
    public org.hl7.fhir.OperationOutcomeIssue[] getIssueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ISSUE$0, targetList);
            org.hl7.fhir.OperationOutcomeIssue[] result = new org.hl7.fhir.OperationOutcomeIssue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "issue" element
     */
    public org.hl7.fhir.OperationOutcomeIssue getIssueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcomeIssue target = null;
            target = (org.hl7.fhir.OperationOutcomeIssue)get_store().find_element_user(ISSUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "issue" element
     */
    public int sizeOfIssueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUE$0);
        }
    }
    
    /**
     * Sets array of all "issue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIssueArray(org.hl7.fhir.OperationOutcomeIssue[] issueArray)
    {
        check_orphaned();
        arraySetterHelper(issueArray, ISSUE$0);
    }
    
    /**
     * Sets ith "issue" element
     */
    public void setIssueArray(int i, org.hl7.fhir.OperationOutcomeIssue issue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcomeIssue target = null;
            target = (org.hl7.fhir.OperationOutcomeIssue)get_store().find_element_user(ISSUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(issue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "issue" element
     */
    public org.hl7.fhir.OperationOutcomeIssue insertNewIssue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcomeIssue target = null;
            target = (org.hl7.fhir.OperationOutcomeIssue)get_store().insert_element_user(ISSUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "issue" element
     */
    public org.hl7.fhir.OperationOutcomeIssue addNewIssue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.OperationOutcomeIssue target = null;
            target = (org.hl7.fhir.OperationOutcomeIssue)get_store().add_element_user(ISSUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "issue" element
     */
    public void removeIssue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUE$0, i);
        }
    }
}
