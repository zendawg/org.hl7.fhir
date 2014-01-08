/*
 * XML Type:  MedicationPrescription.DosageInstruction
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.MedicationPrescriptionDosageInstruction
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML MedicationPrescription.DosageInstruction(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationPrescriptionDosageInstructionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.MedicationPrescriptionDosageInstruction
{
    private static final long serialVersionUID = 1L;
    
    public MedicationPrescriptionDosageInstructionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    private static final javax.xml.namespace.QName ADDITIONALINSTRUCTIONS$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "additionalInstructions");
    private static final javax.xml.namespace.QName TIMINGDATETIME$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timingDateTime");
    private static final javax.xml.namespace.QName TIMINGPERIOD$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timingPeriod");
    private static final javax.xml.namespace.QName TIMINGSCHEDULE$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timingSchedule");
    private static final javax.xml.namespace.QName ASNEEDEDBOOLEAN$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "asNeededBoolean");
    private static final javax.xml.namespace.QName ASNEEDEDCODEABLECONCEPT$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "asNeededCodeableConcept");
    private static final javax.xml.namespace.QName SITE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "site");
    private static final javax.xml.namespace.QName ROUTE$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "route");
    private static final javax.xml.namespace.QName METHOD$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "method");
    private static final javax.xml.namespace.QName DOSEQUANTITY$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseQuantity");
    private static final javax.xml.namespace.QName RATE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "rate");
    private static final javax.xml.namespace.QName MAXDOSEPERPERIOD$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "maxDosePerPeriod");
    
    
    /**
     * Gets the "text" element
     */
    public org.hl7.fhir.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.hl7.fhir.String text)
    {
        generatedSetterHelperImpl(text, TEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public org.hl7.fhir.String addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$0, 0);
        }
    }
    
    /**
     * Gets the "additionalInstructions" element
     */
    public org.hl7.fhir.CodeableConcept getAdditionalInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ADDITIONALINSTRUCTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "additionalInstructions" element
     */
    public boolean isSetAdditionalInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALINSTRUCTIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "additionalInstructions" element
     */
    public void setAdditionalInstructions(org.hl7.fhir.CodeableConcept additionalInstructions)
    {
        generatedSetterHelperImpl(additionalInstructions, ADDITIONALINSTRUCTIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "additionalInstructions" element
     */
    public org.hl7.fhir.CodeableConcept addNewAdditionalInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ADDITIONALINSTRUCTIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "additionalInstructions" element
     */
    public void unsetAdditionalInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALINSTRUCTIONS$2, 0);
        }
    }
    
    /**
     * Gets the "timingDateTime" element
     */
    public org.hl7.fhir.DateTime getTimingDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(TIMINGDATETIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timingDateTime" element
     */
    public boolean isSetTimingDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMINGDATETIME$4) != 0;
        }
    }
    
    /**
     * Sets the "timingDateTime" element
     */
    public void setTimingDateTime(org.hl7.fhir.DateTime timingDateTime)
    {
        generatedSetterHelperImpl(timingDateTime, TIMINGDATETIME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timingDateTime" element
     */
    public org.hl7.fhir.DateTime addNewTimingDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(TIMINGDATETIME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "timingDateTime" element
     */
    public void unsetTimingDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMINGDATETIME$4, 0);
        }
    }
    
    /**
     * Gets the "timingPeriod" element
     */
    public org.hl7.fhir.Period getTimingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(TIMINGPERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timingPeriod" element
     */
    public boolean isSetTimingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMINGPERIOD$6) != 0;
        }
    }
    
    /**
     * Sets the "timingPeriod" element
     */
    public void setTimingPeriod(org.hl7.fhir.Period timingPeriod)
    {
        generatedSetterHelperImpl(timingPeriod, TIMINGPERIOD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timingPeriod" element
     */
    public org.hl7.fhir.Period addNewTimingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(TIMINGPERIOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "timingPeriod" element
     */
    public void unsetTimingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMINGPERIOD$6, 0);
        }
    }
    
    /**
     * Gets the "timingSchedule" element
     */
    public org.hl7.fhir.Schedule getTimingSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(TIMINGSCHEDULE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timingSchedule" element
     */
    public boolean isSetTimingSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMINGSCHEDULE$8) != 0;
        }
    }
    
    /**
     * Sets the "timingSchedule" element
     */
    public void setTimingSchedule(org.hl7.fhir.Schedule timingSchedule)
    {
        generatedSetterHelperImpl(timingSchedule, TIMINGSCHEDULE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timingSchedule" element
     */
    public org.hl7.fhir.Schedule addNewTimingSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(TIMINGSCHEDULE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "timingSchedule" element
     */
    public void unsetTimingSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMINGSCHEDULE$8, 0);
        }
    }
    
    /**
     * Gets the "asNeededBoolean" element
     */
    public org.hl7.fhir.Boolean getAsNeededBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ASNEEDEDBOOLEAN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "asNeededBoolean" element
     */
    public boolean isSetAsNeededBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASNEEDEDBOOLEAN$10) != 0;
        }
    }
    
    /**
     * Sets the "asNeededBoolean" element
     */
    public void setAsNeededBoolean(org.hl7.fhir.Boolean asNeededBoolean)
    {
        generatedSetterHelperImpl(asNeededBoolean, ASNEEDEDBOOLEAN$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "asNeededBoolean" element
     */
    public org.hl7.fhir.Boolean addNewAsNeededBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ASNEEDEDBOOLEAN$10);
            return target;
        }
    }
    
    /**
     * Unsets the "asNeededBoolean" element
     */
    public void unsetAsNeededBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASNEEDEDBOOLEAN$10, 0);
        }
    }
    
    /**
     * Gets the "asNeededCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept getAsNeededCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ASNEEDEDCODEABLECONCEPT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "asNeededCodeableConcept" element
     */
    public boolean isSetAsNeededCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASNEEDEDCODEABLECONCEPT$12) != 0;
        }
    }
    
    /**
     * Sets the "asNeededCodeableConcept" element
     */
    public void setAsNeededCodeableConcept(org.hl7.fhir.CodeableConcept asNeededCodeableConcept)
    {
        generatedSetterHelperImpl(asNeededCodeableConcept, ASNEEDEDCODEABLECONCEPT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "asNeededCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept addNewAsNeededCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ASNEEDEDCODEABLECONCEPT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "asNeededCodeableConcept" element
     */
    public void unsetAsNeededCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASNEEDEDCODEABLECONCEPT$12, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SITE$14, 0);
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
            return get_store().count_elements(SITE$14) != 0;
        }
    }
    
    /**
     * Sets the "site" element
     */
    public void setSite(org.hl7.fhir.CodeableConcept site)
    {
        generatedSetterHelperImpl(site, SITE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SITE$14);
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
            get_store().remove_element(SITE$14, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROUTE$16, 0);
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
            return get_store().count_elements(ROUTE$16) != 0;
        }
    }
    
    /**
     * Sets the "route" element
     */
    public void setRoute(org.hl7.fhir.CodeableConcept route)
    {
        generatedSetterHelperImpl(route, ROUTE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROUTE$16);
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
            get_store().remove_element(ROUTE$16, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(METHOD$18, 0);
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
            return get_store().count_elements(METHOD$18) != 0;
        }
    }
    
    /**
     * Sets the "method" element
     */
    public void setMethod(org.hl7.fhir.CodeableConcept method)
    {
        generatedSetterHelperImpl(method, METHOD$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(METHOD$18);
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
            get_store().remove_element(METHOD$18, 0);
        }
    }
    
    /**
     * Gets the "doseQuantity" element
     */
    public org.hl7.fhir.Quantity getDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(DOSEQUANTITY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "doseQuantity" element
     */
    public boolean isSetDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOSEQUANTITY$20) != 0;
        }
    }
    
    /**
     * Sets the "doseQuantity" element
     */
    public void setDoseQuantity(org.hl7.fhir.Quantity doseQuantity)
    {
        generatedSetterHelperImpl(doseQuantity, DOSEQUANTITY$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "doseQuantity" element
     */
    public org.hl7.fhir.Quantity addNewDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(DOSEQUANTITY$20);
            return target;
        }
    }
    
    /**
     * Unsets the "doseQuantity" element
     */
    public void unsetDoseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOSEQUANTITY$20, 0);
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
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(RATE$22, 0);
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
            return get_store().count_elements(RATE$22) != 0;
        }
    }
    
    /**
     * Sets the "rate" element
     */
    public void setRate(org.hl7.fhir.Ratio rate)
    {
        generatedSetterHelperImpl(rate, RATE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(RATE$22);
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
            get_store().remove_element(RATE$22, 0);
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
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(MAXDOSEPERPERIOD$24, 0);
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
            return get_store().count_elements(MAXDOSEPERPERIOD$24) != 0;
        }
    }
    
    /**
     * Sets the "maxDosePerPeriod" element
     */
    public void setMaxDosePerPeriod(org.hl7.fhir.Ratio maxDosePerPeriod)
    {
        generatedSetterHelperImpl(maxDosePerPeriod, MAXDOSEPERPERIOD$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(MAXDOSEPERPERIOD$24);
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
            get_store().remove_element(MAXDOSEPERPERIOD$24, 0);
        }
    }
}
