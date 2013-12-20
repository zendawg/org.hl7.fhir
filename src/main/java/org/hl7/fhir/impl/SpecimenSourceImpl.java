/*
 * XML Type:  Specimen.Source
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SpecimenSource
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Specimen.Source(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SpecimenSourceImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SpecimenSource
{
    private static final long serialVersionUID = 1L;
    
    public SpecimenSourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "relationship");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "target");
    
    
    /**
     * Gets the "relationship" element
     */
    public org.hl7.fhir.HierarchicalRelationshipType getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HierarchicalRelationshipType target = null;
            target = (org.hl7.fhir.HierarchicalRelationshipType)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relationship" element
     */
    public void setRelationship(org.hl7.fhir.HierarchicalRelationshipType relationship)
    {
        generatedSetterHelperImpl(relationship, RELATIONSHIP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    public org.hl7.fhir.HierarchicalRelationshipType addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HierarchicalRelationshipType target = null;
            target = (org.hl7.fhir.HierarchicalRelationshipType)get_store().add_element_user(RELATIONSHIP$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "target" elements
     */
    public org.hl7.fhir.ResourceReference[] getTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGET$2, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "target" element
     */
    public org.hl7.fhir.ResourceReference getTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "target" element
     */
    public int sizeOfTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$2);
        }
    }
    
    /**
     * Sets array of all "target" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTargetArray(org.hl7.fhir.ResourceReference[] targetValueArray)
    {
        check_orphaned();
        arraySetterHelper(targetValueArray, TARGET$2);
    }
    
    /**
     * Sets ith "target" element
     */
    public void setTargetArray(int i, org.hl7.fhir.ResourceReference targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "target" element
     */
    public org.hl7.fhir.ResourceReference insertNewTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(TARGET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "target" element
     */
    public org.hl7.fhir.ResourceReference addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "target" element
     */
    public void removeTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$2, i);
        }
    }
}
