/*
 * XML Type:  Questionnaire.Question
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.QuestionnaireQuestion
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Questionnaire.Question(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class QuestionnaireQuestionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.QuestionnaireQuestion
{
    private static final long serialVersionUID = 1L;
    
    public QuestionnaireQuestionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    private static final javax.xml.namespace.QName ANSWERDECIMAL$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "answerDecimal");
    private static final javax.xml.namespace.QName ANSWERINTEGER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "answerInteger");
    private static final javax.xml.namespace.QName ANSWERBOOLEAN$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "answerBoolean");
    private static final javax.xml.namespace.QName ANSWERDATE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "answerDate");
    private static final javax.xml.namespace.QName ANSWERSTRING$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "answerString");
    private static final javax.xml.namespace.QName ANSWERDATETIME$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "answerDateTime");
    private static final javax.xml.namespace.QName ANSWERINSTANT$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "answerInstant");
    private static final javax.xml.namespace.QName CHOICE$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "choice");
    private static final javax.xml.namespace.QName OPTIONS$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "options");
    private static final javax.xml.namespace.QName DATABOOLEAN$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataBoolean");
    private static final javax.xml.namespace.QName DATAINTEGER$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataInteger");
    private static final javax.xml.namespace.QName DATADECIMAL$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataDecimal");
    private static final javax.xml.namespace.QName DATABASE64BINARY$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataBase64Binary");
    private static final javax.xml.namespace.QName DATAINSTANT$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataInstant");
    private static final javax.xml.namespace.QName DATASTRING$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataString");
    private static final javax.xml.namespace.QName DATAURI$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataUri");
    private static final javax.xml.namespace.QName DATADATE$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataDate");
    private static final javax.xml.namespace.QName DATADATETIME$38 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataDateTime");
    private static final javax.xml.namespace.QName DATACODE$40 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataCode");
    private static final javax.xml.namespace.QName DATAOID$42 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataOid");
    private static final javax.xml.namespace.QName DATAUUID$44 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataUuid");
    private static final javax.xml.namespace.QName DATAID$46 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataId");
    private static final javax.xml.namespace.QName DATAATTACHMENT$48 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataAttachment");
    private static final javax.xml.namespace.QName DATAIDENTIFIER$50 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataIdentifier");
    private static final javax.xml.namespace.QName DATACODEABLECONCEPT$52 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataCodeableConcept");
    private static final javax.xml.namespace.QName DATACODING$54 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataCoding");
    private static final javax.xml.namespace.QName DATAQUANTITY$56 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataQuantity");
    private static final javax.xml.namespace.QName DATARANGE$58 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataRange");
    private static final javax.xml.namespace.QName DATAPERIOD$60 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataPeriod");
    private static final javax.xml.namespace.QName DATARATIO$62 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataRatio");
    private static final javax.xml.namespace.QName DATARESOURCE$64 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataResource");
    private static final javax.xml.namespace.QName DATASAMPLEDDATA$66 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataSampledData");
    private static final javax.xml.namespace.QName DATAHUMANNAME$68 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataHumanName");
    private static final javax.xml.namespace.QName DATAADDRESS$70 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataAddress");
    private static final javax.xml.namespace.QName DATACONTACT$72 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataContact");
    private static final javax.xml.namespace.QName DATASCHEDULE$74 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dataSchedule");
    private static final javax.xml.namespace.QName REMARKS$76 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "remarks");
    private static final javax.xml.namespace.QName GROUP$78 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "group");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.CodeableConcept getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.hl7.fhir.CodeableConcept name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.CodeableConcept addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(TEXT$2, 0);
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
            return get_store().count_elements(TEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(org.hl7.fhir.String text)
    {
        generatedSetterHelperImpl(text, TEXT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(TEXT$2);
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
            get_store().remove_element(TEXT$2, 0);
        }
    }
    
    /**
     * Gets the "answerDecimal" element
     */
    public org.hl7.fhir.Decimal getAnswerDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(ANSWERDECIMAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "answerDecimal" element
     */
    public boolean isSetAnswerDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWERDECIMAL$4) != 0;
        }
    }
    
    /**
     * Sets the "answerDecimal" element
     */
    public void setAnswerDecimal(org.hl7.fhir.Decimal answerDecimal)
    {
        generatedSetterHelperImpl(answerDecimal, ANSWERDECIMAL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "answerDecimal" element
     */
    public org.hl7.fhir.Decimal addNewAnswerDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(ANSWERDECIMAL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "answerDecimal" element
     */
    public void unsetAnswerDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWERDECIMAL$4, 0);
        }
    }
    
    /**
     * Gets the "answerInteger" element
     */
    public org.hl7.fhir.Integer getAnswerInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(ANSWERINTEGER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "answerInteger" element
     */
    public boolean isSetAnswerInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWERINTEGER$6) != 0;
        }
    }
    
    /**
     * Sets the "answerInteger" element
     */
    public void setAnswerInteger(org.hl7.fhir.Integer answerInteger)
    {
        generatedSetterHelperImpl(answerInteger, ANSWERINTEGER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "answerInteger" element
     */
    public org.hl7.fhir.Integer addNewAnswerInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(ANSWERINTEGER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "answerInteger" element
     */
    public void unsetAnswerInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWERINTEGER$6, 0);
        }
    }
    
    /**
     * Gets the "answerBoolean" element
     */
    public org.hl7.fhir.Boolean getAnswerBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ANSWERBOOLEAN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "answerBoolean" element
     */
    public boolean isSetAnswerBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWERBOOLEAN$8) != 0;
        }
    }
    
    /**
     * Sets the "answerBoolean" element
     */
    public void setAnswerBoolean(org.hl7.fhir.Boolean answerBoolean)
    {
        generatedSetterHelperImpl(answerBoolean, ANSWERBOOLEAN$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "answerBoolean" element
     */
    public org.hl7.fhir.Boolean addNewAnswerBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ANSWERBOOLEAN$8);
            return target;
        }
    }
    
    /**
     * Unsets the "answerBoolean" element
     */
    public void unsetAnswerBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWERBOOLEAN$8, 0);
        }
    }
    
    /**
     * Gets the "answerDate" element
     */
    public org.hl7.fhir.Date getAnswerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(ANSWERDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "answerDate" element
     */
    public boolean isSetAnswerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWERDATE$10) != 0;
        }
    }
    
    /**
     * Sets the "answerDate" element
     */
    public void setAnswerDate(org.hl7.fhir.Date answerDate)
    {
        generatedSetterHelperImpl(answerDate, ANSWERDATE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "answerDate" element
     */
    public org.hl7.fhir.Date addNewAnswerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(ANSWERDATE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "answerDate" element
     */
    public void unsetAnswerDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWERDATE$10, 0);
        }
    }
    
    /**
     * Gets the "answerString" element
     */
    public org.hl7.fhir.String getAnswerString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(ANSWERSTRING$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "answerString" element
     */
    public boolean isSetAnswerString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWERSTRING$12) != 0;
        }
    }
    
    /**
     * Sets the "answerString" element
     */
    public void setAnswerString(org.hl7.fhir.String answerString)
    {
        generatedSetterHelperImpl(answerString, ANSWERSTRING$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "answerString" element
     */
    public org.hl7.fhir.String addNewAnswerString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(ANSWERSTRING$12);
            return target;
        }
    }
    
    /**
     * Unsets the "answerString" element
     */
    public void unsetAnswerString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWERSTRING$12, 0);
        }
    }
    
    /**
     * Gets the "answerDateTime" element
     */
    public org.hl7.fhir.DateTime getAnswerDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(ANSWERDATETIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "answerDateTime" element
     */
    public boolean isSetAnswerDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWERDATETIME$14) != 0;
        }
    }
    
    /**
     * Sets the "answerDateTime" element
     */
    public void setAnswerDateTime(org.hl7.fhir.DateTime answerDateTime)
    {
        generatedSetterHelperImpl(answerDateTime, ANSWERDATETIME$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "answerDateTime" element
     */
    public org.hl7.fhir.DateTime addNewAnswerDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(ANSWERDATETIME$14);
            return target;
        }
    }
    
    /**
     * Unsets the "answerDateTime" element
     */
    public void unsetAnswerDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWERDATETIME$14, 0);
        }
    }
    
    /**
     * Gets the "answerInstant" element
     */
    public org.hl7.fhir.Instant getAnswerInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(ANSWERINSTANT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "answerInstant" element
     */
    public boolean isSetAnswerInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANSWERINSTANT$16) != 0;
        }
    }
    
    /**
     * Sets the "answerInstant" element
     */
    public void setAnswerInstant(org.hl7.fhir.Instant answerInstant)
    {
        generatedSetterHelperImpl(answerInstant, ANSWERINSTANT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "answerInstant" element
     */
    public org.hl7.fhir.Instant addNewAnswerInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(ANSWERINSTANT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "answerInstant" element
     */
    public void unsetAnswerInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANSWERINSTANT$16, 0);
        }
    }
    
    /**
     * Gets array of all "choice" elements
     */
    public org.hl7.fhir.Coding[] getChoiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHOICE$18, targetList);
            org.hl7.fhir.Coding[] result = new org.hl7.fhir.Coding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "choice" element
     */
    public org.hl7.fhir.Coding getChoiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CHOICE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "choice" element
     */
    public int sizeOfChoiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHOICE$18);
        }
    }
    
    /**
     * Sets array of all "choice" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setChoiceArray(org.hl7.fhir.Coding[] choiceArray)
    {
        check_orphaned();
        arraySetterHelper(choiceArray, CHOICE$18);
    }
    
    /**
     * Sets ith "choice" element
     */
    public void setChoiceArray(int i, org.hl7.fhir.Coding choice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(CHOICE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(choice);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "choice" element
     */
    public org.hl7.fhir.Coding insertNewChoice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().insert_element_user(CHOICE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "choice" element
     */
    public org.hl7.fhir.Coding addNewChoice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(CHOICE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "choice" element
     */
    public void removeChoice(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHOICE$18, i);
        }
    }
    
    /**
     * Gets the "options" element
     */
    public org.hl7.fhir.ResourceReference getOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(OPTIONS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "options" element
     */
    public boolean isSetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONS$20) != 0;
        }
    }
    
    /**
     * Sets the "options" element
     */
    public void setOptions(org.hl7.fhir.ResourceReference options)
    {
        generatedSetterHelperImpl(options, OPTIONS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "options" element
     */
    public org.hl7.fhir.ResourceReference addNewOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(OPTIONS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "options" element
     */
    public void unsetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONS$20, 0);
        }
    }
    
    /**
     * Gets the "dataBoolean" element
     */
    public org.hl7.fhir.Boolean getDataBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(DATABOOLEAN$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataBoolean" element
     */
    public boolean isSetDataBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABOOLEAN$22) != 0;
        }
    }
    
    /**
     * Sets the "dataBoolean" element
     */
    public void setDataBoolean(org.hl7.fhir.Boolean dataBoolean)
    {
        generatedSetterHelperImpl(dataBoolean, DATABOOLEAN$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataBoolean" element
     */
    public org.hl7.fhir.Boolean addNewDataBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(DATABOOLEAN$22);
            return target;
        }
    }
    
    /**
     * Unsets the "dataBoolean" element
     */
    public void unsetDataBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABOOLEAN$22, 0);
        }
    }
    
    /**
     * Gets the "dataInteger" element
     */
    public org.hl7.fhir.Integer getDataInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(DATAINTEGER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataInteger" element
     */
    public boolean isSetDataInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINTEGER$24) != 0;
        }
    }
    
    /**
     * Sets the "dataInteger" element
     */
    public void setDataInteger(org.hl7.fhir.Integer dataInteger)
    {
        generatedSetterHelperImpl(dataInteger, DATAINTEGER$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataInteger" element
     */
    public org.hl7.fhir.Integer addNewDataInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(DATAINTEGER$24);
            return target;
        }
    }
    
    /**
     * Unsets the "dataInteger" element
     */
    public void unsetDataInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINTEGER$24, 0);
        }
    }
    
    /**
     * Gets the "dataDecimal" element
     */
    public org.hl7.fhir.Decimal getDataDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(DATADECIMAL$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataDecimal" element
     */
    public boolean isSetDataDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATADECIMAL$26) != 0;
        }
    }
    
    /**
     * Sets the "dataDecimal" element
     */
    public void setDataDecimal(org.hl7.fhir.Decimal dataDecimal)
    {
        generatedSetterHelperImpl(dataDecimal, DATADECIMAL$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataDecimal" element
     */
    public org.hl7.fhir.Decimal addNewDataDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(DATADECIMAL$26);
            return target;
        }
    }
    
    /**
     * Unsets the "dataDecimal" element
     */
    public void unsetDataDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATADECIMAL$26, 0);
        }
    }
    
    /**
     * Gets the "dataBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary getDataBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(DATABASE64BINARY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataBase64Binary" element
     */
    public boolean isSetDataBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATABASE64BINARY$28) != 0;
        }
    }
    
    /**
     * Sets the "dataBase64Binary" element
     */
    public void setDataBase64Binary(org.hl7.fhir.Base64Binary dataBase64Binary)
    {
        generatedSetterHelperImpl(dataBase64Binary, DATABASE64BINARY$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary addNewDataBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(DATABASE64BINARY$28);
            return target;
        }
    }
    
    /**
     * Unsets the "dataBase64Binary" element
     */
    public void unsetDataBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATABASE64BINARY$28, 0);
        }
    }
    
    /**
     * Gets the "dataInstant" element
     */
    public org.hl7.fhir.Instant getDataInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(DATAINSTANT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataInstant" element
     */
    public boolean isSetDataInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINSTANT$30) != 0;
        }
    }
    
    /**
     * Sets the "dataInstant" element
     */
    public void setDataInstant(org.hl7.fhir.Instant dataInstant)
    {
        generatedSetterHelperImpl(dataInstant, DATAINSTANT$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataInstant" element
     */
    public org.hl7.fhir.Instant addNewDataInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(DATAINSTANT$30);
            return target;
        }
    }
    
    /**
     * Unsets the "dataInstant" element
     */
    public void unsetDataInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINSTANT$30, 0);
        }
    }
    
    /**
     * Gets the "dataString" element
     */
    public org.hl7.fhir.String getDataString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DATASTRING$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataString" element
     */
    public boolean isSetDataString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTRING$32) != 0;
        }
    }
    
    /**
     * Sets the "dataString" element
     */
    public void setDataString(org.hl7.fhir.String dataString)
    {
        generatedSetterHelperImpl(dataString, DATASTRING$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataString" element
     */
    public org.hl7.fhir.String addNewDataString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DATASTRING$32);
            return target;
        }
    }
    
    /**
     * Unsets the "dataString" element
     */
    public void unsetDataString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTRING$32, 0);
        }
    }
    
    /**
     * Gets the "dataUri" element
     */
    public org.hl7.fhir.Uri getDataUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(DATAURI$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataUri" element
     */
    public boolean isSetDataUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAURI$34) != 0;
        }
    }
    
    /**
     * Sets the "dataUri" element
     */
    public void setDataUri(org.hl7.fhir.Uri dataUri)
    {
        generatedSetterHelperImpl(dataUri, DATAURI$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataUri" element
     */
    public org.hl7.fhir.Uri addNewDataUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(DATAURI$34);
            return target;
        }
    }
    
    /**
     * Unsets the "dataUri" element
     */
    public void unsetDataUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAURI$34, 0);
        }
    }
    
    /**
     * Gets the "dataDate" element
     */
    public org.hl7.fhir.Date getDataDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(DATADATE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataDate" element
     */
    public boolean isSetDataDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATADATE$36) != 0;
        }
    }
    
    /**
     * Sets the "dataDate" element
     */
    public void setDataDate(org.hl7.fhir.Date dataDate)
    {
        generatedSetterHelperImpl(dataDate, DATADATE$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataDate" element
     */
    public org.hl7.fhir.Date addNewDataDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(DATADATE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "dataDate" element
     */
    public void unsetDataDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATADATE$36, 0);
        }
    }
    
    /**
     * Gets the "dataDateTime" element
     */
    public org.hl7.fhir.DateTime getDataDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(DATADATETIME$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataDateTime" element
     */
    public boolean isSetDataDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATADATETIME$38) != 0;
        }
    }
    
    /**
     * Sets the "dataDateTime" element
     */
    public void setDataDateTime(org.hl7.fhir.DateTime dataDateTime)
    {
        generatedSetterHelperImpl(dataDateTime, DATADATETIME$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataDateTime" element
     */
    public org.hl7.fhir.DateTime addNewDataDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(DATADATETIME$38);
            return target;
        }
    }
    
    /**
     * Unsets the "dataDateTime" element
     */
    public void unsetDataDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATADATETIME$38, 0);
        }
    }
    
    /**
     * Gets the "dataCode" element
     */
    public org.hl7.fhir.Code getDataCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(DATACODE$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataCode" element
     */
    public boolean isSetDataCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACODE$40) != 0;
        }
    }
    
    /**
     * Sets the "dataCode" element
     */
    public void setDataCode(org.hl7.fhir.Code dataCode)
    {
        generatedSetterHelperImpl(dataCode, DATACODE$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataCode" element
     */
    public org.hl7.fhir.Code addNewDataCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(DATACODE$40);
            return target;
        }
    }
    
    /**
     * Unsets the "dataCode" element
     */
    public void unsetDataCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACODE$40, 0);
        }
    }
    
    /**
     * Gets the "dataOid" element
     */
    public org.hl7.fhir.Oid getDataOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().find_element_user(DATAOID$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataOid" element
     */
    public boolean isSetDataOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOID$42) != 0;
        }
    }
    
    /**
     * Sets the "dataOid" element
     */
    public void setDataOid(org.hl7.fhir.Oid dataOid)
    {
        generatedSetterHelperImpl(dataOid, DATAOID$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataOid" element
     */
    public org.hl7.fhir.Oid addNewDataOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().add_element_user(DATAOID$42);
            return target;
        }
    }
    
    /**
     * Unsets the "dataOid" element
     */
    public void unsetDataOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOID$42, 0);
        }
    }
    
    /**
     * Gets the "dataUuid" element
     */
    public org.hl7.fhir.Uuid getDataUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uuid target = null;
            target = (org.hl7.fhir.Uuid)get_store().find_element_user(DATAUUID$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataUuid" element
     */
    public boolean isSetDataUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAUUID$44) != 0;
        }
    }
    
    /**
     * Sets the "dataUuid" element
     */
    public void setDataUuid(org.hl7.fhir.Uuid dataUuid)
    {
        generatedSetterHelperImpl(dataUuid, DATAUUID$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataUuid" element
     */
    public org.hl7.fhir.Uuid addNewDataUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uuid target = null;
            target = (org.hl7.fhir.Uuid)get_store().add_element_user(DATAUUID$44);
            return target;
        }
    }
    
    /**
     * Unsets the "dataUuid" element
     */
    public void unsetDataUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAUUID$44, 0);
        }
    }
    
    /**
     * Gets the "dataId" element
     */
    public org.hl7.fhir.Id getDataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(DATAID$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataId" element
     */
    public boolean isSetDataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAID$46) != 0;
        }
    }
    
    /**
     * Sets the "dataId" element
     */
    public void setDataId(org.hl7.fhir.Id dataId)
    {
        generatedSetterHelperImpl(dataId, DATAID$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataId" element
     */
    public org.hl7.fhir.Id addNewDataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(DATAID$46);
            return target;
        }
    }
    
    /**
     * Unsets the "dataId" element
     */
    public void unsetDataId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAID$46, 0);
        }
    }
    
    /**
     * Gets the "dataAttachment" element
     */
    public org.hl7.fhir.Attachment getDataAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(DATAATTACHMENT$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataAttachment" element
     */
    public boolean isSetDataAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAATTACHMENT$48) != 0;
        }
    }
    
    /**
     * Sets the "dataAttachment" element
     */
    public void setDataAttachment(org.hl7.fhir.Attachment dataAttachment)
    {
        generatedSetterHelperImpl(dataAttachment, DATAATTACHMENT$48, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataAttachment" element
     */
    public org.hl7.fhir.Attachment addNewDataAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(DATAATTACHMENT$48);
            return target;
        }
    }
    
    /**
     * Unsets the "dataAttachment" element
     */
    public void unsetDataAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAATTACHMENT$48, 0);
        }
    }
    
    /**
     * Gets the "dataIdentifier" element
     */
    public org.hl7.fhir.Identifier getDataIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(DATAIDENTIFIER$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataIdentifier" element
     */
    public boolean isSetDataIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAIDENTIFIER$50) != 0;
        }
    }
    
    /**
     * Sets the "dataIdentifier" element
     */
    public void setDataIdentifier(org.hl7.fhir.Identifier dataIdentifier)
    {
        generatedSetterHelperImpl(dataIdentifier, DATAIDENTIFIER$50, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataIdentifier" element
     */
    public org.hl7.fhir.Identifier addNewDataIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(DATAIDENTIFIER$50);
            return target;
        }
    }
    
    /**
     * Unsets the "dataIdentifier" element
     */
    public void unsetDataIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAIDENTIFIER$50, 0);
        }
    }
    
    /**
     * Gets the "dataCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept getDataCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(DATACODEABLECONCEPT$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataCodeableConcept" element
     */
    public boolean isSetDataCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACODEABLECONCEPT$52) != 0;
        }
    }
    
    /**
     * Sets the "dataCodeableConcept" element
     */
    public void setDataCodeableConcept(org.hl7.fhir.CodeableConcept dataCodeableConcept)
    {
        generatedSetterHelperImpl(dataCodeableConcept, DATACODEABLECONCEPT$52, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept addNewDataCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(DATACODEABLECONCEPT$52);
            return target;
        }
    }
    
    /**
     * Unsets the "dataCodeableConcept" element
     */
    public void unsetDataCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACODEABLECONCEPT$52, 0);
        }
    }
    
    /**
     * Gets the "dataCoding" element
     */
    public org.hl7.fhir.Coding getDataCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(DATACODING$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataCoding" element
     */
    public boolean isSetDataCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACODING$54) != 0;
        }
    }
    
    /**
     * Sets the "dataCoding" element
     */
    public void setDataCoding(org.hl7.fhir.Coding dataCoding)
    {
        generatedSetterHelperImpl(dataCoding, DATACODING$54, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataCoding" element
     */
    public org.hl7.fhir.Coding addNewDataCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(DATACODING$54);
            return target;
        }
    }
    
    /**
     * Unsets the "dataCoding" element
     */
    public void unsetDataCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACODING$54, 0);
        }
    }
    
    /**
     * Gets the "dataQuantity" element
     */
    public org.hl7.fhir.Quantity getDataQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(DATAQUANTITY$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataQuantity" element
     */
    public boolean isSetDataQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAQUANTITY$56) != 0;
        }
    }
    
    /**
     * Sets the "dataQuantity" element
     */
    public void setDataQuantity(org.hl7.fhir.Quantity dataQuantity)
    {
        generatedSetterHelperImpl(dataQuantity, DATAQUANTITY$56, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataQuantity" element
     */
    public org.hl7.fhir.Quantity addNewDataQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(DATAQUANTITY$56);
            return target;
        }
    }
    
    /**
     * Unsets the "dataQuantity" element
     */
    public void unsetDataQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAQUANTITY$56, 0);
        }
    }
    
    /**
     * Gets the "dataRange" element
     */
    public org.hl7.fhir.Range getDataRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().find_element_user(DATARANGE$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataRange" element
     */
    public boolean isSetDataRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARANGE$58) != 0;
        }
    }
    
    /**
     * Sets the "dataRange" element
     */
    public void setDataRange(org.hl7.fhir.Range dataRange)
    {
        generatedSetterHelperImpl(dataRange, DATARANGE$58, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataRange" element
     */
    public org.hl7.fhir.Range addNewDataRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().add_element_user(DATARANGE$58);
            return target;
        }
    }
    
    /**
     * Unsets the "dataRange" element
     */
    public void unsetDataRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARANGE$58, 0);
        }
    }
    
    /**
     * Gets the "dataPeriod" element
     */
    public org.hl7.fhir.Period getDataPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(DATAPERIOD$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataPeriod" element
     */
    public boolean isSetDataPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPERIOD$60) != 0;
        }
    }
    
    /**
     * Sets the "dataPeriod" element
     */
    public void setDataPeriod(org.hl7.fhir.Period dataPeriod)
    {
        generatedSetterHelperImpl(dataPeriod, DATAPERIOD$60, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataPeriod" element
     */
    public org.hl7.fhir.Period addNewDataPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(DATAPERIOD$60);
            return target;
        }
    }
    
    /**
     * Unsets the "dataPeriod" element
     */
    public void unsetDataPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPERIOD$60, 0);
        }
    }
    
    /**
     * Gets the "dataRatio" element
     */
    public org.hl7.fhir.Ratio getDataRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(DATARATIO$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataRatio" element
     */
    public boolean isSetDataRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARATIO$62) != 0;
        }
    }
    
    /**
     * Sets the "dataRatio" element
     */
    public void setDataRatio(org.hl7.fhir.Ratio dataRatio)
    {
        generatedSetterHelperImpl(dataRatio, DATARATIO$62, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataRatio" element
     */
    public org.hl7.fhir.Ratio addNewDataRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(DATARATIO$62);
            return target;
        }
    }
    
    /**
     * Unsets the "dataRatio" element
     */
    public void unsetDataRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARATIO$62, 0);
        }
    }
    
    /**
     * Gets the "dataResource" element
     */
    public org.hl7.fhir.ResourceReference getDataResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(DATARESOURCE$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataResource" element
     */
    public boolean isSetDataResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARESOURCE$64) != 0;
        }
    }
    
    /**
     * Sets the "dataResource" element
     */
    public void setDataResource(org.hl7.fhir.ResourceReference dataResource)
    {
        generatedSetterHelperImpl(dataResource, DATARESOURCE$64, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataResource" element
     */
    public org.hl7.fhir.ResourceReference addNewDataResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(DATARESOURCE$64);
            return target;
        }
    }
    
    /**
     * Unsets the "dataResource" element
     */
    public void unsetDataResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARESOURCE$64, 0);
        }
    }
    
    /**
     * Gets the "dataSampledData" element
     */
    public org.hl7.fhir.SampledData getDataSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().find_element_user(DATASAMPLEDDATA$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSampledData" element
     */
    public boolean isSetDataSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASAMPLEDDATA$66) != 0;
        }
    }
    
    /**
     * Sets the "dataSampledData" element
     */
    public void setDataSampledData(org.hl7.fhir.SampledData dataSampledData)
    {
        generatedSetterHelperImpl(dataSampledData, DATASAMPLEDDATA$66, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSampledData" element
     */
    public org.hl7.fhir.SampledData addNewDataSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().add_element_user(DATASAMPLEDDATA$66);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSampledData" element
     */
    public void unsetDataSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASAMPLEDDATA$66, 0);
        }
    }
    
    /**
     * Gets the "dataHumanName" element
     */
    public org.hl7.fhir.HumanName getDataHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(DATAHUMANNAME$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataHumanName" element
     */
    public boolean isSetDataHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAHUMANNAME$68) != 0;
        }
    }
    
    /**
     * Sets the "dataHumanName" element
     */
    public void setDataHumanName(org.hl7.fhir.HumanName dataHumanName)
    {
        generatedSetterHelperImpl(dataHumanName, DATAHUMANNAME$68, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataHumanName" element
     */
    public org.hl7.fhir.HumanName addNewDataHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().add_element_user(DATAHUMANNAME$68);
            return target;
        }
    }
    
    /**
     * Unsets the "dataHumanName" element
     */
    public void unsetDataHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAHUMANNAME$68, 0);
        }
    }
    
    /**
     * Gets the "dataAddress" element
     */
    public org.hl7.fhir.Address getDataAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(DATAADDRESS$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataAddress" element
     */
    public boolean isSetDataAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAADDRESS$70) != 0;
        }
    }
    
    /**
     * Sets the "dataAddress" element
     */
    public void setDataAddress(org.hl7.fhir.Address dataAddress)
    {
        generatedSetterHelperImpl(dataAddress, DATAADDRESS$70, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataAddress" element
     */
    public org.hl7.fhir.Address addNewDataAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().add_element_user(DATAADDRESS$70);
            return target;
        }
    }
    
    /**
     * Unsets the "dataAddress" element
     */
    public void unsetDataAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAADDRESS$70, 0);
        }
    }
    
    /**
     * Gets the "dataContact" element
     */
    public org.hl7.fhir.Contact getDataContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(DATACONTACT$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataContact" element
     */
    public boolean isSetDataContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONTACT$72) != 0;
        }
    }
    
    /**
     * Sets the "dataContact" element
     */
    public void setDataContact(org.hl7.fhir.Contact dataContact)
    {
        generatedSetterHelperImpl(dataContact, DATACONTACT$72, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataContact" element
     */
    public org.hl7.fhir.Contact addNewDataContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().add_element_user(DATACONTACT$72);
            return target;
        }
    }
    
    /**
     * Unsets the "dataContact" element
     */
    public void unsetDataContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONTACT$72, 0);
        }
    }
    
    /**
     * Gets the "dataSchedule" element
     */
    public org.hl7.fhir.Schedule getDataSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(DATASCHEDULE$74, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataSchedule" element
     */
    public boolean isSetDataSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASCHEDULE$74) != 0;
        }
    }
    
    /**
     * Sets the "dataSchedule" element
     */
    public void setDataSchedule(org.hl7.fhir.Schedule dataSchedule)
    {
        generatedSetterHelperImpl(dataSchedule, DATASCHEDULE$74, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataSchedule" element
     */
    public org.hl7.fhir.Schedule addNewDataSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(DATASCHEDULE$74);
            return target;
        }
    }
    
    /**
     * Unsets the "dataSchedule" element
     */
    public void unsetDataSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASCHEDULE$74, 0);
        }
    }
    
    /**
     * Gets the "remarks" element
     */
    public org.hl7.fhir.String getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(REMARKS$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$76) != 0;
        }
    }
    
    /**
     * Sets the "remarks" element
     */
    public void setRemarks(org.hl7.fhir.String remarks)
    {
        generatedSetterHelperImpl(remarks, REMARKS$76, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    public org.hl7.fhir.String addNewRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(REMARKS$76);
            return target;
        }
    }
    
    /**
     * Unsets the "remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$76, 0);
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public org.hl7.fhir.QuestionnaireGroup[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$78, targetList);
            org.hl7.fhir.QuestionnaireGroup[] result = new org.hl7.fhir.QuestionnaireGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public org.hl7.fhir.QuestionnaireGroup getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().find_element_user(GROUP$78, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$78);
        }
    }
    
    /**
     * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGroupArray(org.hl7.fhir.QuestionnaireGroup[] groupArray)
    {
        check_orphaned();
        arraySetterHelper(groupArray, GROUP$78);
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.hl7.fhir.QuestionnaireGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().find_element_user(GROUP$78, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.hl7.fhir.QuestionnaireGroup insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().insert_element_user(GROUP$78, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.hl7.fhir.QuestionnaireGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.QuestionnaireGroup target = null;
            target = (org.hl7.fhir.QuestionnaireGroup)get_store().add_element_user(GROUP$78);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$78, i);
        }
    }
}
