/*
 * XML Type:  Composition.Event
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CompositionEvent
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Composition.Event(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CompositionEventImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.CompositionEvent
{
    private static final long serialVersionUID = 1L;
    
    public CompositionEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    private static final javax.xml.namespace.QName DETAIL$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "detail");
    
    
    /**
     * Gets array of all "code" elements
     */
    public org.hl7.fhir.CodeableConcept[] getCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODE$0, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "code" element
     */
    public org.hl7.fhir.CodeableConcept getCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$0, i);
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
            return get_store().count_elements(CODE$0);
        }
    }
    
    /**
     * Sets array of all "code" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodeArray(org.hl7.fhir.CodeableConcept[] codeArray)
    {
        check_orphaned();
        arraySetterHelper(codeArray, CODE$0);
    }
    
    /**
     * Sets ith "code" element
     */
    public void setCodeArray(int i, org.hl7.fhir.CodeableConcept code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$0, i);
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
    public org.hl7.fhir.CodeableConcept insertNewCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(CODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$0);
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
            get_store().remove_element(CODE$0, i);
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
     * Gets array of all "detail" elements
     */
    public org.hl7.fhir.ResourceReference[] getDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETAIL$4, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "detail" element
     */
    public org.hl7.fhir.ResourceReference getDetailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "detail" element
     */
    public int sizeOfDetailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAIL$4);
        }
    }
    
    /**
     * Sets array of all "detail" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDetailArray(org.hl7.fhir.ResourceReference[] detailArray)
    {
        check_orphaned();
        arraySetterHelper(detailArray, DETAIL$4);
    }
    
    /**
     * Sets ith "detail" element
     */
    public void setDetailArray(int i, org.hl7.fhir.ResourceReference detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DETAIL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(detail);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "detail" element
     */
    public org.hl7.fhir.ResourceReference insertNewDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(DETAIL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "detail" element
     */
    public org.hl7.fhir.ResourceReference addNewDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DETAIL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "detail" element
     */
    public void removeDetail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAIL$4, i);
        }
    }
}
