/*
 * XML Type:  Immunization
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Immunization
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Immunization(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Immunization
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName VACCINETYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "vaccineType");
    private static final javax.xml.namespace.QName SUBJECT$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName REFUSEDINDICATOR$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "refusedIndicator");
    private static final javax.xml.namespace.QName REPORTED$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reported");
    private static final javax.xml.namespace.QName PERFORMER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "performer");
    private static final javax.xml.namespace.QName REQUESTER$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requester");
    private static final javax.xml.namespace.QName MANUFACTURER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "manufacturer");
    private static final javax.xml.namespace.QName LOCATION$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "location");
    private static final javax.xml.namespace.QName LOTNUMBER$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "lotNumber");
    private static final javax.xml.namespace.QName EXPIRATIONDATE$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "expirationDate");
    private static final javax.xml.namespace.QName SITE$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "site");
    private static final javax.xml.namespace.QName ROUTE$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "route");
    private static final javax.xml.namespace.QName DOSEQUANTITY$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "doseQuantity");
    private static final javax.xml.namespace.QName EXPLANATION$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "explanation");
    private static final javax.xml.namespace.QName REACTION$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reaction");
    private static final javax.xml.namespace.QName VACCINATIONPROTOCOL$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "vaccinationProtocol");
    
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.DateTime getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.DateTime date)
    {
        generatedSetterHelperImpl(date, DATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.DateTime addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATE$0);
            return target;
        }
    }
    
    /**
     * Gets the "vaccineType" element
     */
    public org.hl7.fhir.CodeableConcept getVaccineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VACCINETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vaccineType" element
     */
    public void setVaccineType(org.hl7.fhir.CodeableConcept vaccineType)
    {
        generatedSetterHelperImpl(vaccineType, VACCINETYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vaccineType" element
     */
    public org.hl7.fhir.CodeableConcept addNewVaccineType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VACCINETYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(org.hl7.fhir.ResourceReference subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public org.hl7.fhir.ResourceReference addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$4);
            return target;
        }
    }
    
    /**
     * Gets the "refusedIndicator" element
     */
    public org.hl7.fhir.Boolean getRefusedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(REFUSEDINDICATOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refusedIndicator" element
     */
    public void setRefusedIndicator(org.hl7.fhir.Boolean refusedIndicator)
    {
        generatedSetterHelperImpl(refusedIndicator, REFUSEDINDICATOR$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "refusedIndicator" element
     */
    public org.hl7.fhir.Boolean addNewRefusedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(REFUSEDINDICATOR$6);
            return target;
        }
    }
    
    /**
     * Gets the "reported" element
     */
    public org.hl7.fhir.Boolean getReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(REPORTED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reported" element
     */
    public void setReported(org.hl7.fhir.Boolean reported)
    {
        generatedSetterHelperImpl(reported, REPORTED$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reported" element
     */
    public org.hl7.fhir.Boolean addNewReported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(REPORTED$8);
            return target;
        }
    }
    
    /**
     * Gets the "performer" element
     */
    public org.hl7.fhir.ResourceReference getPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(PERFORMER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "performer" element
     */
    public boolean isSetPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$10) != 0;
        }
    }
    
    /**
     * Sets the "performer" element
     */
    public void setPerformer(org.hl7.fhir.ResourceReference performer)
    {
        generatedSetterHelperImpl(performer, PERFORMER$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "performer" element
     */
    public org.hl7.fhir.ResourceReference addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(PERFORMER$10);
            return target;
        }
    }
    
    /**
     * Unsets the "performer" element
     */
    public void unsetPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$10, 0);
        }
    }
    
    /**
     * Gets the "requester" element
     */
    public org.hl7.fhir.ResourceReference getRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REQUESTER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requester" element
     */
    public boolean isSetRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTER$12) != 0;
        }
    }
    
    /**
     * Sets the "requester" element
     */
    public void setRequester(org.hl7.fhir.ResourceReference requester)
    {
        generatedSetterHelperImpl(requester, REQUESTER$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requester" element
     */
    public org.hl7.fhir.ResourceReference addNewRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REQUESTER$12);
            return target;
        }
    }
    
    /**
     * Unsets the "requester" element
     */
    public void unsetRequester()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTER$12, 0);
        }
    }
    
    /**
     * Gets the "manufacturer" element
     */
    public org.hl7.fhir.ResourceReference getManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MANUFACTURER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manufacturer" element
     */
    public boolean isSetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURER$14) != 0;
        }
    }
    
    /**
     * Sets the "manufacturer" element
     */
    public void setManufacturer(org.hl7.fhir.ResourceReference manufacturer)
    {
        generatedSetterHelperImpl(manufacturer, MANUFACTURER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "manufacturer" element
     */
    public org.hl7.fhir.ResourceReference addNewManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MANUFACTURER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "manufacturer" element
     */
    public void unsetManufacturer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURER$14, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(LOCATION$16, 0);
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
            return get_store().count_elements(LOCATION$16) != 0;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.hl7.fhir.ResourceReference location)
    {
        generatedSetterHelperImpl(location, LOCATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(LOCATION$16);
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
            get_store().remove_element(LOCATION$16, 0);
        }
    }
    
    /**
     * Gets the "lotNumber" element
     */
    public org.hl7.fhir.String getLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(LOTNUMBER$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lotNumber" element
     */
    public boolean isSetLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTNUMBER$18) != 0;
        }
    }
    
    /**
     * Sets the "lotNumber" element
     */
    public void setLotNumber(org.hl7.fhir.String lotNumber)
    {
        generatedSetterHelperImpl(lotNumber, LOTNUMBER$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lotNumber" element
     */
    public org.hl7.fhir.String addNewLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(LOTNUMBER$18);
            return target;
        }
    }
    
    /**
     * Unsets the "lotNumber" element
     */
    public void unsetLotNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTNUMBER$18, 0);
        }
    }
    
    /**
     * Gets the "expirationDate" element
     */
    public org.hl7.fhir.Date getExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(EXPIRATIONDATE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "expirationDate" element
     */
    public boolean isSetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONDATE$20) != 0;
        }
    }
    
    /**
     * Sets the "expirationDate" element
     */
    public void setExpirationDate(org.hl7.fhir.Date expirationDate)
    {
        generatedSetterHelperImpl(expirationDate, EXPIRATIONDATE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "expirationDate" element
     */
    public org.hl7.fhir.Date addNewExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(EXPIRATIONDATE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "expirationDate" element
     */
    public void unsetExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONDATE$20, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SITE$22, 0);
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
            return get_store().count_elements(SITE$22) != 0;
        }
    }
    
    /**
     * Sets the "site" element
     */
    public void setSite(org.hl7.fhir.CodeableConcept site)
    {
        generatedSetterHelperImpl(site, SITE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SITE$22);
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
            get_store().remove_element(SITE$22, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(ROUTE$24, 0);
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
            return get_store().count_elements(ROUTE$24) != 0;
        }
    }
    
    /**
     * Sets the "route" element
     */
    public void setRoute(org.hl7.fhir.CodeableConcept route)
    {
        generatedSetterHelperImpl(route, ROUTE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(ROUTE$24);
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
            get_store().remove_element(ROUTE$24, 0);
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
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(DOSEQUANTITY$26, 0);
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
            return get_store().count_elements(DOSEQUANTITY$26) != 0;
        }
    }
    
    /**
     * Sets the "doseQuantity" element
     */
    public void setDoseQuantity(org.hl7.fhir.Quantity doseQuantity)
    {
        generatedSetterHelperImpl(doseQuantity, DOSEQUANTITY$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(DOSEQUANTITY$26);
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
            get_store().remove_element(DOSEQUANTITY$26, 0);
        }
    }
    
    /**
     * Gets the "explanation" element
     */
    public org.hl7.fhir.ImmunizationExplanation getExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationExplanation target = null;
            target = (org.hl7.fhir.ImmunizationExplanation)get_store().find_element_user(EXPLANATION$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "explanation" element
     */
    public boolean isSetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPLANATION$28) != 0;
        }
    }
    
    /**
     * Sets the "explanation" element
     */
    public void setExplanation(org.hl7.fhir.ImmunizationExplanation explanation)
    {
        generatedSetterHelperImpl(explanation, EXPLANATION$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "explanation" element
     */
    public org.hl7.fhir.ImmunizationExplanation addNewExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationExplanation target = null;
            target = (org.hl7.fhir.ImmunizationExplanation)get_store().add_element_user(EXPLANATION$28);
            return target;
        }
    }
    
    /**
     * Unsets the "explanation" element
     */
    public void unsetExplanation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPLANATION$28, 0);
        }
    }
    
    /**
     * Gets array of all "reaction" elements
     */
    public org.hl7.fhir.ImmunizationReaction[] getReactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REACTION$30, targetList);
            org.hl7.fhir.ImmunizationReaction[] result = new org.hl7.fhir.ImmunizationReaction[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reaction" element
     */
    public org.hl7.fhir.ImmunizationReaction getReactionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().find_element_user(REACTION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reaction" element
     */
    public int sizeOfReactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REACTION$30);
        }
    }
    
    /**
     * Sets array of all "reaction" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReactionArray(org.hl7.fhir.ImmunizationReaction[] reactionArray)
    {
        check_orphaned();
        arraySetterHelper(reactionArray, REACTION$30);
    }
    
    /**
     * Sets ith "reaction" element
     */
    public void setReactionArray(int i, org.hl7.fhir.ImmunizationReaction reaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().find_element_user(REACTION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reaction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reaction" element
     */
    public org.hl7.fhir.ImmunizationReaction insertNewReaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().insert_element_user(REACTION$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reaction" element
     */
    public org.hl7.fhir.ImmunizationReaction addNewReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationReaction target = null;
            target = (org.hl7.fhir.ImmunizationReaction)get_store().add_element_user(REACTION$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "reaction" element
     */
    public void removeReaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REACTION$30, i);
        }
    }
    
    /**
     * Gets the "vaccinationProtocol" element
     */
    public org.hl7.fhir.ImmunizationVaccinationProtocol getVaccinationProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationVaccinationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationVaccinationProtocol)get_store().find_element_user(VACCINATIONPROTOCOL$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "vaccinationProtocol" element
     */
    public boolean isSetVaccinationProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VACCINATIONPROTOCOL$32) != 0;
        }
    }
    
    /**
     * Sets the "vaccinationProtocol" element
     */
    public void setVaccinationProtocol(org.hl7.fhir.ImmunizationVaccinationProtocol vaccinationProtocol)
    {
        generatedSetterHelperImpl(vaccinationProtocol, VACCINATIONPROTOCOL$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vaccinationProtocol" element
     */
    public org.hl7.fhir.ImmunizationVaccinationProtocol addNewVaccinationProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ImmunizationVaccinationProtocol target = null;
            target = (org.hl7.fhir.ImmunizationVaccinationProtocol)get_store().add_element_user(VACCINATIONPROTOCOL$32);
            return target;
        }
    }
    
    /**
     * Unsets the "vaccinationProtocol" element
     */
    public void unsetVaccinationProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VACCINATIONPROTOCOL$32, 0);
        }
    }
}
