/*
 * XML Type:  CarePlan.Simple
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.CarePlanSimple
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML CarePlan.Simple(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class CarePlanSimpleImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.CarePlanSimple
{
    private static final long serialVersionUID = 1L;
    
    public CarePlanSimpleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "category");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName TIMINGSCHEDULE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timingSchedule");
    private static final javax.xml.namespace.QName TIMINGPERIOD$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timingPeriod");
    private static final javax.xml.namespace.QName TIMINGSTRING$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "timingString");
    private static final javax.xml.namespace.QName LOCATION$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName PERFORMER$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "performer");
    private static final javax.xml.namespace.QName PRODUCT$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "product");
    private static final javax.xml.namespace.QName DAILYAMOUNT$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dailyAmount");
    private static final javax.xml.namespace.QName QUANTITY$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "quantity");
    private static final javax.xml.namespace.QName DETAILS$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "details");
    
    
    /**
     * Gets the "category" element
     */
    public org.hl7.fhir.CarePlanActivityCategory getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivityCategory target = null;
            target = (org.hl7.fhir.CarePlanActivityCategory)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.hl7.fhir.CarePlanActivityCategory category)
    {
        generatedSetterHelperImpl(category, CATEGORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public org.hl7.fhir.CarePlanActivityCategory addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CarePlanActivityCategory target = null;
            target = (org.hl7.fhir.CarePlanActivityCategory)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$2) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$2, 0);
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
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(TIMINGSCHEDULE$4, 0);
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
            return get_store().count_elements(TIMINGSCHEDULE$4) != 0;
        }
    }
    
    /**
     * Sets the "timingSchedule" element
     */
    public void setTimingSchedule(org.hl7.fhir.Schedule timingSchedule)
    {
        generatedSetterHelperImpl(timingSchedule, TIMINGSCHEDULE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(TIMINGSCHEDULE$4);
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
            get_store().remove_element(TIMINGSCHEDULE$4, 0);
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
     * Gets the "timingString" element
     */
    public org.hl7.fhir.String getTimingString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TIMINGSTRING$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timingString" element
     */
    public boolean isSetTimingString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMINGSTRING$8) != 0;
        }
    }
    
    /**
     * Sets the "timingString" element
     */
    public void setTimingString(org.hl7.fhir.String timingString)
    {
        generatedSetterHelperImpl(timingString, TIMINGSTRING$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "timingString" element
     */
    public org.hl7.fhir.String addNewTimingString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(TIMINGSTRING$8);
            return target;
        }
    }
    
    /**
     * Unsets the "timingString" element
     */
    public void unsetTimingString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMINGSTRING$8, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$10, 0);
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
            return get_store().count_elements(LOCATION$10) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.hl7.fhir.ResourceReference location)
    {
        generatedSetterHelperImpl(location, LOCATION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LOCATION$10);
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
            get_store().remove_element(LOCATION$10, 0);
        }
    }
    
    /**
     * Gets array of all "performer" elements
     */
    public org.hl7.fhir.ResourceReference[] getPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERFORMER$12, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "performer" element
     */
    public org.hl7.fhir.ResourceReference getPerformerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "performer" element
     */
    public int sizeOfPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$12);
        }
    }
    
    /**
     * Sets array of all "performer" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPerformerArray(org.hl7.fhir.ResourceReference[] performerArray)
    {
        check_orphaned();
        arraySetterHelper(performerArray, PERFORMER$12);
    }
    
    /**
     * Sets ith "performer" element
     */
    public void setPerformerArray(int i, org.hl7.fhir.ResourceReference performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(performer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    public org.hl7.fhir.ResourceReference insertNewPerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(PERFORMER$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    public org.hl7.fhir.ResourceReference addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PERFORMER$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "performer" element
     */
    public void removePerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$12, i);
        }
    }
    
    /**
     * Gets the "product" element
     */
    public org.hl7.fhir.ResourceReference getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PRODUCT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "product" element
     */
    public boolean isSetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCT$14) != 0;
        }
    }
    
    /**
     * Sets the "product" element
     */
    public void setProduct(org.hl7.fhir.ResourceReference product)
    {
        generatedSetterHelperImpl(product, PRODUCT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "product" element
     */
    public org.hl7.fhir.ResourceReference addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PRODUCT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "product" element
     */
    public void unsetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCT$14, 0);
        }
    }
    
    /**
     * Gets the "dailyAmount" element
     */
    public org.hl7.fhir.Quantity getDailyAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(DAILYAMOUNT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dailyAmount" element
     */
    public boolean isSetDailyAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DAILYAMOUNT$16) != 0;
        }
    }
    
    /**
     * Sets the "dailyAmount" element
     */
    public void setDailyAmount(org.hl7.fhir.Quantity dailyAmount)
    {
        generatedSetterHelperImpl(dailyAmount, DAILYAMOUNT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dailyAmount" element
     */
    public org.hl7.fhir.Quantity addNewDailyAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(DAILYAMOUNT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "dailyAmount" element
     */
    public void unsetDailyAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DAILYAMOUNT$16, 0);
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
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(QUANTITY$18, 0);
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
            return get_store().count_elements(QUANTITY$18) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(org.hl7.fhir.Quantity quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(QUANTITY$18);
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
            get_store().remove_element(QUANTITY$18, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(DETAILS$20, 0);
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
            return get_store().count_elements(DETAILS$20) != 0;
        }
    }
    
    /**
     * Sets the "details" element
     */
    public void setDetails(org.hl7.fhir.String details)
    {
        generatedSetterHelperImpl(details, DETAILS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(DETAILS$20);
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
            get_store().remove_element(DETAILS$20, 0);
        }
    }
}
