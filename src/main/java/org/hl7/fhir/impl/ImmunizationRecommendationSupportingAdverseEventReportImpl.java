/*
 * XML Type:  ImmunizationRecommendation.SupportingAdverseEventReport
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ImmunizationRecommendation.SupportingAdverseEventReport(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ImmunizationRecommendationSupportingAdverseEventReportImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ImmunizationRecommendationSupportingAdverseEventReport
{
    private static final long serialVersionUID = 1L;
    
    public ImmunizationRecommendationSupportingAdverseEventReportImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName REPORTTYPE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reportType");
    private static final javax.xml.namespace.QName REPORTDATE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reportDate");
    private static final javax.xml.namespace.QName TEXT$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    private static final javax.xml.namespace.QName REACTION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "reaction");
    
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Id[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            org.hl7.fhir.Id[] result = new org.hl7.fhir.Id[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.hl7.fhir.Id getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.hl7.fhir.Id[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$0);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.hl7.fhir.Id identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.hl7.fhir.Id insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    public org.hl7.fhir.Id addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
        }
    }
    
    /**
     * Gets the "reportType" element
     */
    public org.hl7.fhir.CodeableConcept getReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(REPORTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportType" element
     */
    public boolean isSetReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "reportType" element
     */
    public void setReportType(org.hl7.fhir.CodeableConcept reportType)
    {
        generatedSetterHelperImpl(reportType, REPORTTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reportType" element
     */
    public org.hl7.fhir.CodeableConcept addNewReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(REPORTTYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "reportType" element
     */
    public void unsetReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "reportDate" element
     */
    public org.hl7.fhir.DateTime getReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(REPORTDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportDate" element
     */
    public boolean isSetReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "reportDate" element
     */
    public void setReportDate(org.hl7.fhir.DateTime reportDate)
    {
        generatedSetterHelperImpl(reportDate, REPORTDATE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reportDate" element
     */
    public org.hl7.fhir.DateTime addNewReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(REPORTDATE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "reportDate" element
     */
    public void unsetReportDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTDATE$4, 0);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public org.hl7.fhir.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(TEXT$6, 0);
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
            return get_store().count_elements(TEXT$6) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.hl7.fhir.String text)
    {
        generatedSetterHelperImpl(text, TEXT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(TEXT$6);
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
            get_store().remove_element(TEXT$6, 0);
        }
    }
    
    /**
     * Gets array of all "reaction" elements
     */
    public org.hl7.fhir.ResourceReference[] getReactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REACTION$8, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reaction" element
     */
    public org.hl7.fhir.ResourceReference getReactionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REACTION$8, i);
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
            return get_store().count_elements(REACTION$8);
        }
    }
    
    /**
     * Sets array of all "reaction" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReactionArray(org.hl7.fhir.ResourceReference[] reactionArray)
    {
        check_orphaned();
        arraySetterHelper(reactionArray, REACTION$8);
    }
    
    /**
     * Sets ith "reaction" element
     */
    public void setReactionArray(int i, org.hl7.fhir.ResourceReference reaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REACTION$8, i);
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
    public org.hl7.fhir.ResourceReference insertNewReaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(REACTION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reaction" element
     */
    public org.hl7.fhir.ResourceReference addNewReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REACTION$8);
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
            get_store().remove_element(REACTION$8, i);
        }
    }
}
