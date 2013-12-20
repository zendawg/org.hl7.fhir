/*
 * XML Type:  MedicationAdministration.Dosage
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationAdministrationDosage
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationAdministration.Dosage(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationAdministrationDosageImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationAdministrationDosage
{
    private static final long serialVersionUID = 1L;
    
    public MedicationAdministrationDosageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMING$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timing");
    private static final javax.xml.namespace.QName SITE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "site");
    private static final javax.xml.namespace.QName ROUTE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "route");
    private static final javax.xml.namespace.QName METHOD$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "method");
    private static final javax.xml.namespace.QName QUANTITY$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "quantity");
    private static final javax.xml.namespace.QName RATE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "rate");
    private static final javax.xml.namespace.QName MAXDOSEPERPERIOD$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "maxDosePerPeriod");
    
    
    /**
     * Gets the "timing" element
     */
    public org.hl7.fhir.Schedule getTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(TIMING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timing" element
     */
    public boolean isSetTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMING$0) != 0;
        }
    }
    
    /**
     * Sets the "timing" element
     */
    public void setTiming(org.hl7.fhir.Schedule timing)
    {
        generatedSetterHelperImpl(timing, TIMING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timing" element
     */
    public org.hl7.fhir.Schedule addNewTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(TIMING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "timing" element
     */
    public void unsetTiming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMING$0, 0);
        }
    }
    
    /**
     * Gets the "site" element
     */
    public org.hl7.fhir.CodeableConcept getSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SITE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "site" element
     */
    public boolean isSetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITE$2) != 0;
        }
    }
    
    /**
     * Sets the "site" element
     */
    public void setSite(org.hl7.fhir.CodeableConcept site)
    {
        generatedSetterHelperImpl(site, SITE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "site" element
     */
    public org.hl7.fhir.CodeableConcept addNewSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SITE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "site" element
     */
    public void unsetSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITE$2, 0);
        }
    }
    
    /**
     * Gets the "route" element
     */
    public org.hl7.fhir.CodeableConcept getRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROUTE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "route" element
     */
    public boolean isSetRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTE$4) != 0;
        }
    }
    
    /**
     * Sets the "route" element
     */
    public void setRoute(org.hl7.fhir.CodeableConcept route)
    {
        generatedSetterHelperImpl(route, ROUTE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "route" element
     */
    public org.hl7.fhir.CodeableConcept addNewRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROUTE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "route" element
     */
    public void unsetRoute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTE$4, 0);
        }
    }
    
    /**
     * Gets the "method" element
     */
    public org.hl7.fhir.CodeableConcept getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(METHOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "method" element
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHOD$6) != 0;
        }
    }
    
    /**
     * Sets the "method" element
     */
    public void setMethod(org.hl7.fhir.CodeableConcept method)
    {
        generatedSetterHelperImpl(method, METHOD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "method" element
     */
    public org.hl7.fhir.CodeableConcept addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(METHOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "method" element
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHOD$6, 0);
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
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(QUANTITY$8, 0);
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
            return get_store().count_elements(QUANTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(org.hl7.fhir.Quantity quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(QUANTITY$8);
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
            get_store().remove_element(QUANTITY$8, 0);
        }
    }
    
    /**
     * Gets the "rate" element
     */
    public org.hl7.fhir.Ratio getRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(RATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rate" element
     */
    public boolean isSetRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATE$10) != 0;
        }
    }
    
    /**
     * Sets the "rate" element
     */
    public void setRate(org.hl7.fhir.Ratio rate)
    {
        generatedSetterHelperImpl(rate, RATE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rate" element
     */
    public org.hl7.fhir.Ratio addNewRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(RATE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "rate" element
     */
    public void unsetRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATE$10, 0);
        }
    }
    
    /**
     * Gets the "maxDosePerPeriod" element
     */
    public org.hl7.fhir.Ratio getMaxDosePerPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(MAXDOSEPERPERIOD$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxDosePerPeriod" element
     */
    public boolean isSetMaxDosePerPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXDOSEPERPERIOD$12) != 0;
        }
    }
    
    /**
     * Sets the "maxDosePerPeriod" element
     */
    public void setMaxDosePerPeriod(org.hl7.fhir.Ratio maxDosePerPeriod)
    {
        generatedSetterHelperImpl(maxDosePerPeriod, MAXDOSEPERPERIOD$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxDosePerPeriod" element
     */
    public org.hl7.fhir.Ratio addNewMaxDosePerPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(MAXDOSEPERPERIOD$12);
            return target;
        }
    }
    
    /**
     * Unsets the "maxDosePerPeriod" element
     */
    public void unsetMaxDosePerPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXDOSEPERPERIOD$12, 0);
        }
    }
}
