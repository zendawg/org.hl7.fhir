/*
 * XML Type:  Provenance
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Provenance
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Provenance(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProvenanceImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Provenance
{
    private static final long serialVersionUID = 1L;
    
    public ProvenanceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "target");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName RECORDED$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "recorded");
    private static final javax.xml.namespace.QName REASON$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reason");
    private static final javax.xml.namespace.QName LOCATION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName POLICY$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "policy");
    private static final javax.xml.namespace.QName AGENT$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "agent");
    private static final javax.xml.namespace.QName ENTITY$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "entity");
    private static final javax.xml.namespace.QName INTEGRITYSIGNATURE$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "integritySignature");
    
    
    /**
     * Gets array of all "target" elements
     */
    public org.hl7.fhir.ResourceReference[] getTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGET$0, targetList);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(TARGET$0, i);
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
            return get_store().count_elements(TARGET$0);
        }
    }
    
    /**
     * Sets array of all "target" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTargetArray(org.hl7.fhir.ResourceReference[] targetValueArray)
    {
        check_orphaned();
        arraySetterHelper(targetValueArray, TARGET$0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(TARGET$0, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(TARGET$0, i);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(TARGET$0);
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
            get_store().remove_element(TARGET$0, i);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public org.hl7.fhir.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public org.hl7.fhir.Period addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$2, 0);
        }
    }
    
    /**
     * Gets the "recorded" element
     */
    public org.hl7.fhir.Instant getRecorded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(RECORDED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recorded" element
     */
    public void setRecorded(org.hl7.fhir.Instant recorded)
    {
        generatedSetterHelperImpl(recorded, RECORDED$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recorded" element
     */
    public org.hl7.fhir.Instant addNewRecorded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(RECORDED$4);
            return target;
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public org.hl7.fhir.CodeableConcept getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REASON$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reason" element
     */
    public boolean isSetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$6) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(org.hl7.fhir.CodeableConcept reason)
    {
        generatedSetterHelperImpl(reason, REASON$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reason" element
     */
    public org.hl7.fhir.CodeableConcept addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REASON$6);
            return target;
        }
    }
    
    /**
     * Unsets the "reason" element
     */
    public void unsetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$6, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public org.hl7.fhir.ResourceReference getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$8, 0);
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
            return get_store().count_elements(LOCATION$8) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.hl7.fhir.ResourceReference location)
    {
        generatedSetterHelperImpl(location, LOCATION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.hl7.fhir.ResourceReference addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LOCATION$8);
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
            get_store().remove_element(LOCATION$8, 0);
        }
    }
    
    /**
     * Gets array of all "policy" elements
     */
    public org.hl7.fhir.Uri[] getPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POLICY$10, targetList);
            org.hl7.fhir.Uri[] result = new org.hl7.fhir.Uri[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "policy" element
     */
    public org.hl7.fhir.Uri getPolicyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(POLICY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "policy" element
     */
    public int sizeOfPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLICY$10);
        }
    }
    
    /**
     * Sets array of all "policy" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPolicyArray(org.hl7.fhir.Uri[] policyArray)
    {
        check_orphaned();
        arraySetterHelper(policyArray, POLICY$10);
    }
    
    /**
     * Sets ith "policy" element
     */
    public void setPolicyArray(int i, org.hl7.fhir.Uri policy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(POLICY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(policy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "policy" element
     */
    public org.hl7.fhir.Uri insertNewPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().insert_element_user(POLICY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "policy" element
     */
    public org.hl7.fhir.Uri addNewPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(POLICY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "policy" element
     */
    public void removePolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLICY$10, i);
        }
    }
    
    /**
     * Gets array of all "agent" elements
     */
    public org.hl7.fhir.ProvenanceAgent[] getAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENT$12, targetList);
            org.hl7.fhir.ProvenanceAgent[] result = new org.hl7.fhir.ProvenanceAgent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "agent" element
     */
    public org.hl7.fhir.ProvenanceAgent getAgentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceAgent target = null;
            target = (org.hl7.fhir.ProvenanceAgent)get_store().find_element_user(AGENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "agent" element
     */
    public int sizeOfAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENT$12);
        }
    }
    
    /**
     * Sets array of all "agent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAgentArray(org.hl7.fhir.ProvenanceAgent[] agentArray)
    {
        check_orphaned();
        arraySetterHelper(agentArray, AGENT$12);
    }
    
    /**
     * Sets ith "agent" element
     */
    public void setAgentArray(int i, org.hl7.fhir.ProvenanceAgent agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceAgent target = null;
            target = (org.hl7.fhir.ProvenanceAgent)get_store().find_element_user(AGENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "agent" element
     */
    public org.hl7.fhir.ProvenanceAgent insertNewAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceAgent target = null;
            target = (org.hl7.fhir.ProvenanceAgent)get_store().insert_element_user(AGENT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "agent" element
     */
    public org.hl7.fhir.ProvenanceAgent addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceAgent target = null;
            target = (org.hl7.fhir.ProvenanceAgent)get_store().add_element_user(AGENT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "agent" element
     */
    public void removeAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENT$12, i);
        }
    }
    
    /**
     * Gets array of all "entity" elements
     */
    public org.hl7.fhir.ProvenanceEntity[] getEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTITY$14, targetList);
            org.hl7.fhir.ProvenanceEntity[] result = new org.hl7.fhir.ProvenanceEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entity" element
     */
    public org.hl7.fhir.ProvenanceEntity getEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceEntity target = null;
            target = (org.hl7.fhir.ProvenanceEntity)get_store().find_element_user(ENTITY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entity" element
     */
    public int sizeOfEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY$14);
        }
    }
    
    /**
     * Sets array of all "entity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntityArray(org.hl7.fhir.ProvenanceEntity[] entityArray)
    {
        check_orphaned();
        arraySetterHelper(entityArray, ENTITY$14);
    }
    
    /**
     * Sets ith "entity" element
     */
    public void setEntityArray(int i, org.hl7.fhir.ProvenanceEntity entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceEntity target = null;
            target = (org.hl7.fhir.ProvenanceEntity)get_store().find_element_user(ENTITY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    public org.hl7.fhir.ProvenanceEntity insertNewEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceEntity target = null;
            target = (org.hl7.fhir.ProvenanceEntity)get_store().insert_element_user(ENTITY$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    public org.hl7.fhir.ProvenanceEntity addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProvenanceEntity target = null;
            target = (org.hl7.fhir.ProvenanceEntity)get_store().add_element_user(ENTITY$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "entity" element
     */
    public void removeEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY$14, i);
        }
    }
    
    /**
     * Gets the "integritySignature" element
     */
    public org.hl7.fhir.String getIntegritySignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(INTEGRITYSIGNATURE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "integritySignature" element
     */
    public boolean isSetIntegritySignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGRITYSIGNATURE$16) != 0;
        }
    }
    
    /**
     * Sets the "integritySignature" element
     */
    public void setIntegritySignature(org.hl7.fhir.String integritySignature)
    {
        generatedSetterHelperImpl(integritySignature, INTEGRITYSIGNATURE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "integritySignature" element
     */
    public org.hl7.fhir.String addNewIntegritySignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(INTEGRITYSIGNATURE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "integritySignature" element
     */
    public void unsetIntegritySignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGRITYSIGNATURE$16, 0);
        }
    }
}
