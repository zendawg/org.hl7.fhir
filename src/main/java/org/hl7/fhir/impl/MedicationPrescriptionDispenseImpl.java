/*
 * XML Type:  MedicationPrescription.Dispense
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPrescriptionDispense
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationPrescription.Dispense(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationPrescriptionDispenseImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationPrescriptionDispense
{
    private static final long serialVersionUID = 1L;
    
    public MedicationPrescriptionDispenseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDICATION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "medication");
    private static final javax.xml.namespace.QName VALIDITYPERIOD$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "validityPeriod");
    private static final javax.xml.namespace.QName NUMBEROFREPEATSALLOWED$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "numberOfRepeatsAllowed");
    private static final javax.xml.namespace.QName QUANTITY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "quantity");
    private static final javax.xml.namespace.QName EXPECTEDSUPPLYDURATION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "expectedSupplyDuration");
    
    
    /**
     * Gets the "medication" element
     */
    public org.hl7.fhir.ResourceReference getMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MEDICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "medication" element
     */
    public boolean isSetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDICATION$0) != 0;
        }
    }
    
    /**
     * Sets the "medication" element
     */
    public void setMedication(org.hl7.fhir.ResourceReference medication)
    {
        generatedSetterHelperImpl(medication, MEDICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "medication" element
     */
    public org.hl7.fhir.ResourceReference addNewMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MEDICATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "medication" element
     */
    public void unsetMedication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDICATION$0, 0);
        }
    }
    
    /**
     * Gets the "validityPeriod" element
     */
    public org.hl7.fhir.Period getValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(VALIDITYPERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validityPeriod" element
     */
    public boolean isSetValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDITYPERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "validityPeriod" element
     */
    public void setValidityPeriod(org.hl7.fhir.Period validityPeriod)
    {
        generatedSetterHelperImpl(validityPeriod, VALIDITYPERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validityPeriod" element
     */
    public org.hl7.fhir.Period addNewValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(VALIDITYPERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "validityPeriod" element
     */
    public void unsetValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDITYPERIOD$2, 0);
        }
    }
    
    /**
     * Gets the "numberOfRepeatsAllowed" element
     */
    public org.hl7.fhir.Integer getNumberOfRepeatsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(NUMBEROFREPEATSALLOWED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "numberOfRepeatsAllowed" element
     */
    public boolean isSetNumberOfRepeatsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFREPEATSALLOWED$4) != 0;
        }
    }
    
    /**
     * Sets the "numberOfRepeatsAllowed" element
     */
    public void setNumberOfRepeatsAllowed(org.hl7.fhir.Integer numberOfRepeatsAllowed)
    {
        generatedSetterHelperImpl(numberOfRepeatsAllowed, NUMBEROFREPEATSALLOWED$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "numberOfRepeatsAllowed" element
     */
    public org.hl7.fhir.Integer addNewNumberOfRepeatsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(NUMBEROFREPEATSALLOWED$4);
            return target;
        }
    }
    
    /**
     * Unsets the "numberOfRepeatsAllowed" element
     */
    public void unsetNumberOfRepeatsAllowed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFREPEATSALLOWED$4, 0);
        }
    }
    
    /**
     * Gets the "quantity" element
     */
    public org.hl7.fhir.Quantity getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(QUANTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(org.hl7.fhir.Quantity quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantity" element
     */
    public org.hl7.fhir.Quantity addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(QUANTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$6, 0);
        }
    }
    
    /**
     * Gets the "expectedSupplyDuration" element
     */
    public org.hl7.fhir.Duration getExpectedSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Duration target = null;
            target = (org.hl7.fhir.Duration)get_store().find_element_user(EXPECTEDSUPPLYDURATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expectedSupplyDuration" element
     */
    public boolean isSetExpectedSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDSUPPLYDURATION$8) != 0;
        }
    }
    
    /**
     * Sets the "expectedSupplyDuration" element
     */
    public void setExpectedSupplyDuration(org.hl7.fhir.Duration expectedSupplyDuration)
    {
        generatedSetterHelperImpl(expectedSupplyDuration, EXPECTEDSUPPLYDURATION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "expectedSupplyDuration" element
     */
    public org.hl7.fhir.Duration addNewExpectedSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Duration target = null;
            target = (org.hl7.fhir.Duration)get_store().add_element_user(EXPECTEDSUPPLYDURATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "expectedSupplyDuration" element
     */
    public void unsetExpectedSupplyDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDSUPPLYDURATION$8, 0);
        }
    }
}
