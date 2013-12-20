/*
 * XML Type:  Procedure
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Procedure
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Procedure(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProcedureImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Procedure
{
    private static final long serialVersionUID = 1L;
    
    public ProcedureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "identifier");
    private static final javax.xml.namespace.QName SUBJECT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "subject");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName BODYSITE$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "bodySite");
    private static final javax.xml.namespace.QName INDICATION$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "indication");
    private static final javax.xml.namespace.QName PERFORMER$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "performer");
    private static final javax.xml.namespace.QName DATE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "date");
    private static final javax.xml.namespace.QName ENCOUNTER$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "encounter");
    private static final javax.xml.namespace.QName OUTCOME$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "outcome");
    private static final javax.xml.namespace.QName REPORT$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "report");
    private static final javax.xml.namespace.QName COMPLICATION$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "complication");
    private static final javax.xml.namespace.QName FOLLOWUP$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "followUp");
    private static final javax.xml.namespace.QName RELATEDITEM$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "relatedItem");
    private static final javax.xml.namespace.QName NOTES$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "notes");
    
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.hl7.fhir.Identifier[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            org.hl7.fhir.Identifier[] result = new org.hl7.fhir.Identifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.hl7.fhir.Identifier getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
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
    public void setIdentifierArray(org.hl7.fhir.Identifier[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$0);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.hl7.fhir.Identifier identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(IDENTIFIER$0, i);
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
    public org.hl7.fhir.Identifier insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    public org.hl7.fhir.Identifier addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(IDENTIFIER$0);
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
     * Gets the "subject" element
     */
    public org.hl7.fhir.ResourceReference getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(SUBJECT$2, 0);
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
        generatedSetterHelperImpl(subject, SUBJECT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(SUBJECT$2);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.hl7.fhir.CodeableConcept getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.hl7.fhir.CodeableConcept type)
    {
        generatedSetterHelperImpl(type, TYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.hl7.fhir.CodeableConcept addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "bodySite" elements
     */
    public org.hl7.fhir.CodeableConcept[] getBodySiteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BODYSITE$6, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept getBodySiteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(BODYSITE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bodySite" element
     */
    public int sizeOfBodySiteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BODYSITE$6);
        }
    }
    
    /**
     * Sets array of all "bodySite" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBodySiteArray(org.hl7.fhir.CodeableConcept[] bodySiteArray)
    {
        check_orphaned();
        arraySetterHelper(bodySiteArray, BODYSITE$6);
    }
    
    /**
     * Sets ith "bodySite" element
     */
    public void setBodySiteArray(int i, org.hl7.fhir.CodeableConcept bodySite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(BODYSITE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bodySite);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept insertNewBodySite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(BODYSITE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bodySite" element
     */
    public org.hl7.fhir.CodeableConcept addNewBodySite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(BODYSITE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "bodySite" element
     */
    public void removeBodySite(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BODYSITE$6, i);
        }
    }
    
    /**
     * Gets array of all "indication" elements
     */
    public org.hl7.fhir.CodeableConcept[] getIndicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INDICATION$8, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "indication" element
     */
    public org.hl7.fhir.CodeableConcept getIndicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(INDICATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "indication" element
     */
    public int sizeOfIndicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDICATION$8);
        }
    }
    
    /**
     * Sets array of all "indication" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIndicationArray(org.hl7.fhir.CodeableConcept[] indicationArray)
    {
        check_orphaned();
        arraySetterHelper(indicationArray, INDICATION$8);
    }
    
    /**
     * Sets ith "indication" element
     */
    public void setIndicationArray(int i, org.hl7.fhir.CodeableConcept indication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(INDICATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(indication);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "indication" element
     */
    public org.hl7.fhir.CodeableConcept insertNewIndication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(INDICATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "indication" element
     */
    public org.hl7.fhir.CodeableConcept addNewIndication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(INDICATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "indication" element
     */
    public void removeIndication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDICATION$8, i);
        }
    }
    
    /**
     * Gets array of all "performer" elements
     */
    public org.hl7.fhir.ProcedurePerformer[] getPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERFORMER$10, targetList);
            org.hl7.fhir.ProcedurePerformer[] result = new org.hl7.fhir.ProcedurePerformer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "performer" element
     */
    public org.hl7.fhir.ProcedurePerformer getPerformerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedurePerformer target = null;
            target = (org.hl7.fhir.ProcedurePerformer)get_store().find_element_user(PERFORMER$10, i);
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
            return get_store().count_elements(PERFORMER$10);
        }
    }
    
    /**
     * Sets array of all "performer" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPerformerArray(org.hl7.fhir.ProcedurePerformer[] performerArray)
    {
        check_orphaned();
        arraySetterHelper(performerArray, PERFORMER$10);
    }
    
    /**
     * Sets ith "performer" element
     */
    public void setPerformerArray(int i, org.hl7.fhir.ProcedurePerformer performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedurePerformer target = null;
            target = (org.hl7.fhir.ProcedurePerformer)get_store().find_element_user(PERFORMER$10, i);
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
    public org.hl7.fhir.ProcedurePerformer insertNewPerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedurePerformer target = null;
            target = (org.hl7.fhir.ProcedurePerformer)get_store().insert_element_user(PERFORMER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    public org.hl7.fhir.ProcedurePerformer addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedurePerformer target = null;
            target = (org.hl7.fhir.ProcedurePerformer)get_store().add_element_user(PERFORMER$10);
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
            get_store().remove_element(PERFORMER$10, i);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.hl7.fhir.Period getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(DATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "date" element
     */
    public boolean isSetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$12) != 0;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.hl7.fhir.Period date)
    {
        generatedSetterHelperImpl(date, DATE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.hl7.fhir.Period addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(DATE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "date" element
     */
    public void unsetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$12, 0);
        }
    }
    
    /**
     * Gets the "encounter" element
     */
    public org.hl7.fhir.ResourceReference getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(ENCOUNTER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encounter" element
     */
    public boolean isSetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTER$14) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(org.hl7.fhir.ResourceReference encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    public org.hl7.fhir.ResourceReference addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(ENCOUNTER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "encounter" element
     */
    public void unsetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTER$14, 0);
        }
    }
    
    /**
     * Gets the "outcome" element
     */
    public org.hl7.fhir.String getOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(OUTCOME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outcome" element
     */
    public boolean isSetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTCOME$16) != 0;
        }
    }
    
    /**
     * Sets the "outcome" element
     */
    public void setOutcome(org.hl7.fhir.String outcome)
    {
        generatedSetterHelperImpl(outcome, OUTCOME$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "outcome" element
     */
    public org.hl7.fhir.String addNewOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(OUTCOME$16);
            return target;
        }
    }
    
    /**
     * Unsets the "outcome" element
     */
    public void unsetOutcome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTCOME$16, 0);
        }
    }
    
    /**
     * Gets array of all "report" elements
     */
    public org.hl7.fhir.ResourceReference[] getReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORT$18, targetList);
            org.hl7.fhir.ResourceReference[] result = new org.hl7.fhir.ResourceReference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "report" element
     */
    public org.hl7.fhir.ResourceReference getReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REPORT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "report" element
     */
    public int sizeOfReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORT$18);
        }
    }
    
    /**
     * Sets array of all "report" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReportArray(org.hl7.fhir.ResourceReference[] reportArray)
    {
        check_orphaned();
        arraySetterHelper(reportArray, REPORT$18);
    }
    
    /**
     * Sets ith "report" element
     */
    public void setReportArray(int i, org.hl7.fhir.ResourceReference report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(REPORT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(report);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "report" element
     */
    public org.hl7.fhir.ResourceReference insertNewReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().insert_element_user(REPORT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "report" element
     */
    public org.hl7.fhir.ResourceReference addNewReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(REPORT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "report" element
     */
    public void removeReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORT$18, i);
        }
    }
    
    /**
     * Gets array of all "complication" elements
     */
    public org.hl7.fhir.CodeableConcept[] getComplicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPLICATION$20, targetList);
            org.hl7.fhir.CodeableConcept[] result = new org.hl7.fhir.CodeableConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "complication" element
     */
    public org.hl7.fhir.CodeableConcept getComplicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(COMPLICATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "complication" element
     */
    public int sizeOfComplicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLICATION$20);
        }
    }
    
    /**
     * Sets array of all "complication" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComplicationArray(org.hl7.fhir.CodeableConcept[] complicationArray)
    {
        check_orphaned();
        arraySetterHelper(complicationArray, COMPLICATION$20);
    }
    
    /**
     * Sets ith "complication" element
     */
    public void setComplicationArray(int i, org.hl7.fhir.CodeableConcept complication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(COMPLICATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(complication);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "complication" element
     */
    public org.hl7.fhir.CodeableConcept insertNewComplication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().insert_element_user(COMPLICATION$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "complication" element
     */
    public org.hl7.fhir.CodeableConcept addNewComplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(COMPLICATION$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "complication" element
     */
    public void removeComplication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLICATION$20, i);
        }
    }
    
    /**
     * Gets the "followUp" element
     */
    public org.hl7.fhir.String getFollowUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(FOLLOWUP$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "followUp" element
     */
    public boolean isSetFollowUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOLLOWUP$22) != 0;
        }
    }
    
    /**
     * Sets the "followUp" element
     */
    public void setFollowUp(org.hl7.fhir.String followUp)
    {
        generatedSetterHelperImpl(followUp, FOLLOWUP$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "followUp" element
     */
    public org.hl7.fhir.String addNewFollowUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(FOLLOWUP$22);
            return target;
        }
    }
    
    /**
     * Unsets the "followUp" element
     */
    public void unsetFollowUp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOLLOWUP$22, 0);
        }
    }
    
    /**
     * Gets array of all "relatedItem" elements
     */
    public org.hl7.fhir.ProcedureRelatedItem[] getRelatedItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDITEM$24, targetList);
            org.hl7.fhir.ProcedureRelatedItem[] result = new org.hl7.fhir.ProcedureRelatedItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedItem" element
     */
    public org.hl7.fhir.ProcedureRelatedItem getRelatedItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedureRelatedItem target = null;
            target = (org.hl7.fhir.ProcedureRelatedItem)get_store().find_element_user(RELATEDITEM$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedItem" element
     */
    public int sizeOfRelatedItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDITEM$24);
        }
    }
    
    /**
     * Sets array of all "relatedItem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedItemArray(org.hl7.fhir.ProcedureRelatedItem[] relatedItemArray)
    {
        check_orphaned();
        arraySetterHelper(relatedItemArray, RELATEDITEM$24);
    }
    
    /**
     * Sets ith "relatedItem" element
     */
    public void setRelatedItemArray(int i, org.hl7.fhir.ProcedureRelatedItem relatedItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedureRelatedItem target = null;
            target = (org.hl7.fhir.ProcedureRelatedItem)get_store().find_element_user(RELATEDITEM$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedItem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedItem" element
     */
    public org.hl7.fhir.ProcedureRelatedItem insertNewRelatedItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedureRelatedItem target = null;
            target = (org.hl7.fhir.ProcedureRelatedItem)get_store().insert_element_user(RELATEDITEM$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedItem" element
     */
    public org.hl7.fhir.ProcedureRelatedItem addNewRelatedItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProcedureRelatedItem target = null;
            target = (org.hl7.fhir.ProcedureRelatedItem)get_store().add_element_user(RELATEDITEM$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedItem" element
     */
    public void removeRelatedItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDITEM$24, i);
        }
    }
    
    /**
     * Gets the "notes" element
     */
    public org.hl7.fhir.String getNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NOTES$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "notes" element
     */
    public boolean isSetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$26) != 0;
        }
    }
    
    /**
     * Sets the "notes" element
     */
    public void setNotes(org.hl7.fhir.String notes)
    {
        generatedSetterHelperImpl(notes, NOTES$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "notes" element
     */
    public org.hl7.fhir.String addNewNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NOTES$26);
            return target;
        }
    }
    
    /**
     * Unsets the "notes" element
     */
    public void unsetNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$26, 0);
        }
    }
}
