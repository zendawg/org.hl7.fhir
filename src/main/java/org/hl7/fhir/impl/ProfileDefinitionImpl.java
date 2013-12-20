/*
 * XML Type:  Profile.Definition
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ProfileDefinition
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Profile.Definition(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ProfileDefinitionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ProfileDefinition
{
    private static final long serialVersionUID = 1L;
    
    public ProfileDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHORT$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "short");
    private static final javax.xml.namespace.QName FORMAL$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "formal");
    private static final javax.xml.namespace.QName COMMENTS$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "comments");
    private static final javax.xml.namespace.QName REQUIREMENTS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "requirements");
    private static final javax.xml.namespace.QName SYNONYM$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "synonym");
    private static final javax.xml.namespace.QName MIN$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "min");
    private static final javax.xml.namespace.QName MAX$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "max");
    private static final javax.xml.namespace.QName TYPE$14 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "type");
    private static final javax.xml.namespace.QName NAMEREFERENCE$16 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "nameReference");
    private static final javax.xml.namespace.QName VALUEBOOLEAN$18 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueBoolean");
    private static final javax.xml.namespace.QName VALUEINTEGER$20 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueInteger");
    private static final javax.xml.namespace.QName VALUEDECIMAL$22 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueDecimal");
    private static final javax.xml.namespace.QName VALUEBASE64BINARY$24 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueBase64Binary");
    private static final javax.xml.namespace.QName VALUEINSTANT$26 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueInstant");
    private static final javax.xml.namespace.QName VALUESTRING$28 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueString");
    private static final javax.xml.namespace.QName VALUEURI$30 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueUri");
    private static final javax.xml.namespace.QName VALUEDATE$32 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueDate");
    private static final javax.xml.namespace.QName VALUEDATETIME$34 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueDateTime");
    private static final javax.xml.namespace.QName VALUECODE$36 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCode");
    private static final javax.xml.namespace.QName VALUEOID$38 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueOid");
    private static final javax.xml.namespace.QName VALUEUUID$40 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueUuid");
    private static final javax.xml.namespace.QName VALUEID$42 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueId");
    private static final javax.xml.namespace.QName VALUEATTACHMENT$44 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueAttachment");
    private static final javax.xml.namespace.QName VALUEIDENTIFIER$46 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueIdentifier");
    private static final javax.xml.namespace.QName VALUECODEABLECONCEPT$48 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCodeableConcept");
    private static final javax.xml.namespace.QName VALUECODING$50 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueCoding");
    private static final javax.xml.namespace.QName VALUEQUANTITY$52 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueQuantity");
    private static final javax.xml.namespace.QName VALUERANGE$54 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueRange");
    private static final javax.xml.namespace.QName VALUEPERIOD$56 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valuePeriod");
    private static final javax.xml.namespace.QName VALUERATIO$58 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueRatio");
    private static final javax.xml.namespace.QName VALUERESOURCE$60 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueResource");
    private static final javax.xml.namespace.QName VALUESAMPLEDDATA$62 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueSampledData");
    private static final javax.xml.namespace.QName VALUEHUMANNAME$64 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueHumanName");
    private static final javax.xml.namespace.QName VALUEADDRESS$66 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueAddress");
    private static final javax.xml.namespace.QName VALUECONTACT$68 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueContact");
    private static final javax.xml.namespace.QName VALUESCHEDULE$70 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "valueSchedule");
    private static final javax.xml.namespace.QName EXAMPLEBOOLEAN$72 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleBoolean");
    private static final javax.xml.namespace.QName EXAMPLEINTEGER$74 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleInteger");
    private static final javax.xml.namespace.QName EXAMPLEDECIMAL$76 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleDecimal");
    private static final javax.xml.namespace.QName EXAMPLEBASE64BINARY$78 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleBase64Binary");
    private static final javax.xml.namespace.QName EXAMPLEINSTANT$80 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleInstant");
    private static final javax.xml.namespace.QName EXAMPLESTRING$82 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleString");
    private static final javax.xml.namespace.QName EXAMPLEURI$84 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleUri");
    private static final javax.xml.namespace.QName EXAMPLEDATE$86 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleDate");
    private static final javax.xml.namespace.QName EXAMPLEDATETIME$88 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleDateTime");
    private static final javax.xml.namespace.QName EXAMPLECODE$90 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleCode");
    private static final javax.xml.namespace.QName EXAMPLEOID$92 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleOid");
    private static final javax.xml.namespace.QName EXAMPLEUUID$94 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleUuid");
    private static final javax.xml.namespace.QName EXAMPLEID$96 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleId");
    private static final javax.xml.namespace.QName EXAMPLEATTACHMENT$98 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleAttachment");
    private static final javax.xml.namespace.QName EXAMPLEIDENTIFIER$100 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleIdentifier");
    private static final javax.xml.namespace.QName EXAMPLECODEABLECONCEPT$102 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleCodeableConcept");
    private static final javax.xml.namespace.QName EXAMPLECODING$104 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleCoding");
    private static final javax.xml.namespace.QName EXAMPLEQUANTITY$106 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleQuantity");
    private static final javax.xml.namespace.QName EXAMPLERANGE$108 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleRange");
    private static final javax.xml.namespace.QName EXAMPLEPERIOD$110 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "examplePeriod");
    private static final javax.xml.namespace.QName EXAMPLERATIO$112 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleRatio");
    private static final javax.xml.namespace.QName EXAMPLERESOURCE$114 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleResource");
    private static final javax.xml.namespace.QName EXAMPLESAMPLEDDATA$116 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleSampledData");
    private static final javax.xml.namespace.QName EXAMPLEHUMANNAME$118 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleHumanName");
    private static final javax.xml.namespace.QName EXAMPLEADDRESS$120 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleAddress");
    private static final javax.xml.namespace.QName EXAMPLECONTACT$122 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleContact");
    private static final javax.xml.namespace.QName EXAMPLESCHEDULE$124 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "exampleSchedule");
    private static final javax.xml.namespace.QName MAXLENGTH$126 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "maxLength");
    private static final javax.xml.namespace.QName CONDITION$128 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "condition");
    private static final javax.xml.namespace.QName CONSTRAINT$130 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "constraint");
    private static final javax.xml.namespace.QName MUSTSUPPORT$132 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mustSupport");
    private static final javax.xml.namespace.QName ISMODIFIER$134 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "isModifier");
    private static final javax.xml.namespace.QName BINDING$136 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "binding");
    private static final javax.xml.namespace.QName MAPPING$138 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "mapping");
    
    
    /**
     * Gets the "short" element
     */
    public org.hl7.fhir.String getShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SHORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "short" element
     */
    public void setShort(org.hl7.fhir.String xshort)
    {
        generatedSetterHelperImpl(xshort, SHORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "short" element
     */
    public org.hl7.fhir.String addNewShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(SHORT$0);
            return target;
        }
    }
    
    /**
     * Gets the "formal" element
     */
    public org.hl7.fhir.String getFormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(FORMAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "formal" element
     */
    public void setFormal(org.hl7.fhir.String formal)
    {
        generatedSetterHelperImpl(formal, FORMAL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "formal" element
     */
    public org.hl7.fhir.String addNewFormal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(FORMAL$2);
            return target;
        }
    }
    
    /**
     * Gets the "comments" element
     */
    public org.hl7.fhir.String getComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COMMENTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "comments" element
     */
    public boolean isSetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTS$4) != 0;
        }
    }
    
    /**
     * Sets the "comments" element
     */
    public void setComments(org.hl7.fhir.String comments)
    {
        generatedSetterHelperImpl(comments, COMMENTS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "comments" element
     */
    public org.hl7.fhir.String addNewComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(COMMENTS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "comments" element
     */
    public void unsetComments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTS$4, 0);
        }
    }
    
    /**
     * Gets the "requirements" element
     */
    public org.hl7.fhir.String getRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(REQUIREMENTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requirements" element
     */
    public boolean isSetRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREMENTS$6) != 0;
        }
    }
    
    /**
     * Sets the "requirements" element
     */
    public void setRequirements(org.hl7.fhir.String requirements)
    {
        generatedSetterHelperImpl(requirements, REQUIREMENTS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requirements" element
     */
    public org.hl7.fhir.String addNewRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(REQUIREMENTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "requirements" element
     */
    public void unsetRequirements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREMENTS$6, 0);
        }
    }
    
    /**
     * Gets array of all "synonym" elements
     */
    public org.hl7.fhir.String[] getSynonymArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SYNONYM$8, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "synonym" element
     */
    public org.hl7.fhir.String getSynonymArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SYNONYM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "synonym" element
     */
    public int sizeOfSynonymArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYNONYM$8);
        }
    }
    
    /**
     * Sets array of all "synonym" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSynonymArray(org.hl7.fhir.String[] synonymArray)
    {
        check_orphaned();
        arraySetterHelper(synonymArray, SYNONYM$8);
    }
    
    /**
     * Sets ith "synonym" element
     */
    public void setSynonymArray(int i, org.hl7.fhir.String synonym)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SYNONYM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(synonym);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "synonym" element
     */
    public org.hl7.fhir.String insertNewSynonym(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(SYNONYM$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "synonym" element
     */
    public org.hl7.fhir.String addNewSynonym()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(SYNONYM$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "synonym" element
     */
    public void removeSynonym(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYNONYM$8, i);
        }
    }
    
    /**
     * Gets the "min" element
     */
    public org.hl7.fhir.Integer getMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(MIN$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "min" element
     */
    public void setMin(org.hl7.fhir.Integer min)
    {
        generatedSetterHelperImpl(min, MIN$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "min" element
     */
    public org.hl7.fhir.Integer addNewMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(MIN$10);
            return target;
        }
    }
    
    /**
     * Gets the "max" element
     */
    public org.hl7.fhir.String getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(MAX$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "max" element
     */
    public void setMax(org.hl7.fhir.String max)
    {
        generatedSetterHelperImpl(max, MAX$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "max" element
     */
    public org.hl7.fhir.String addNewMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(MAX$12);
            return target;
        }
    }
    
    /**
     * Gets array of all "type" elements
     */
    public org.hl7.fhir.ProfileType[] getTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPE$14, targetList);
            org.hl7.fhir.ProfileType[] result = new org.hl7.fhir.ProfileType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "type" element
     */
    public org.hl7.fhir.ProfileType getTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileType target = null;
            target = (org.hl7.fhir.ProfileType)get_store().find_element_user(TYPE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "type" element
     */
    public int sizeOfTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$14);
        }
    }
    
    /**
     * Sets array of all "type" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTypeArray(org.hl7.fhir.ProfileType[] typeArray)
    {
        check_orphaned();
        arraySetterHelper(typeArray, TYPE$14);
    }
    
    /**
     * Sets ith "type" element
     */
    public void setTypeArray(int i, org.hl7.fhir.ProfileType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileType target = null;
            target = (org.hl7.fhir.ProfileType)get_store().find_element_user(TYPE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(type);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    public org.hl7.fhir.ProfileType insertNewType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileType target = null;
            target = (org.hl7.fhir.ProfileType)get_store().insert_element_user(TYPE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    public org.hl7.fhir.ProfileType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileType target = null;
            target = (org.hl7.fhir.ProfileType)get_store().add_element_user(TYPE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "type" element
     */
    public void removeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$14, i);
        }
    }
    
    /**
     * Gets the "nameReference" element
     */
    public org.hl7.fhir.String getNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAMEREFERENCE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nameReference" element
     */
    public boolean isSetNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEREFERENCE$16) != 0;
        }
    }
    
    /**
     * Sets the "nameReference" element
     */
    public void setNameReference(org.hl7.fhir.String nameReference)
    {
        generatedSetterHelperImpl(nameReference, NAMEREFERENCE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nameReference" element
     */
    public org.hl7.fhir.String addNewNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NAMEREFERENCE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "nameReference" element
     */
    public void unsetNameReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEREFERENCE$16, 0);
        }
    }
    
    /**
     * Gets the "valueBoolean" element
     */
    public org.hl7.fhir.Boolean getValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(VALUEBOOLEAN$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueBoolean" element
     */
    public boolean isSetValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEBOOLEAN$18) != 0;
        }
    }
    
    /**
     * Sets the "valueBoolean" element
     */
    public void setValueBoolean(org.hl7.fhir.Boolean valueBoolean)
    {
        generatedSetterHelperImpl(valueBoolean, VALUEBOOLEAN$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueBoolean" element
     */
    public org.hl7.fhir.Boolean addNewValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(VALUEBOOLEAN$18);
            return target;
        }
    }
    
    /**
     * Unsets the "valueBoolean" element
     */
    public void unsetValueBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEBOOLEAN$18, 0);
        }
    }
    
    /**
     * Gets the "valueInteger" element
     */
    public org.hl7.fhir.Integer getValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(VALUEINTEGER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueInteger" element
     */
    public boolean isSetValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEINTEGER$20) != 0;
        }
    }
    
    /**
     * Sets the "valueInteger" element
     */
    public void setValueInteger(org.hl7.fhir.Integer valueInteger)
    {
        generatedSetterHelperImpl(valueInteger, VALUEINTEGER$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueInteger" element
     */
    public org.hl7.fhir.Integer addNewValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(VALUEINTEGER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "valueInteger" element
     */
    public void unsetValueInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEINTEGER$20, 0);
        }
    }
    
    /**
     * Gets the "valueDecimal" element
     */
    public org.hl7.fhir.Decimal getValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(VALUEDECIMAL$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueDecimal" element
     */
    public boolean isSetValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEDECIMAL$22) != 0;
        }
    }
    
    /**
     * Sets the "valueDecimal" element
     */
    public void setValueDecimal(org.hl7.fhir.Decimal valueDecimal)
    {
        generatedSetterHelperImpl(valueDecimal, VALUEDECIMAL$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueDecimal" element
     */
    public org.hl7.fhir.Decimal addNewValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(VALUEDECIMAL$22);
            return target;
        }
    }
    
    /**
     * Unsets the "valueDecimal" element
     */
    public void unsetValueDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEDECIMAL$22, 0);
        }
    }
    
    /**
     * Gets the "valueBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary getValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(VALUEBASE64BINARY$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueBase64Binary" element
     */
    public boolean isSetValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEBASE64BINARY$24) != 0;
        }
    }
    
    /**
     * Sets the "valueBase64Binary" element
     */
    public void setValueBase64Binary(org.hl7.fhir.Base64Binary valueBase64Binary)
    {
        generatedSetterHelperImpl(valueBase64Binary, VALUEBASE64BINARY$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary addNewValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(VALUEBASE64BINARY$24);
            return target;
        }
    }
    
    /**
     * Unsets the "valueBase64Binary" element
     */
    public void unsetValueBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEBASE64BINARY$24, 0);
        }
    }
    
    /**
     * Gets the "valueInstant" element
     */
    public org.hl7.fhir.Instant getValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(VALUEINSTANT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueInstant" element
     */
    public boolean isSetValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEINSTANT$26) != 0;
        }
    }
    
    /**
     * Sets the "valueInstant" element
     */
    public void setValueInstant(org.hl7.fhir.Instant valueInstant)
    {
        generatedSetterHelperImpl(valueInstant, VALUEINSTANT$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueInstant" element
     */
    public org.hl7.fhir.Instant addNewValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(VALUEINSTANT$26);
            return target;
        }
    }
    
    /**
     * Unsets the "valueInstant" element
     */
    public void unsetValueInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEINSTANT$26, 0);
        }
    }
    
    /**
     * Gets the "valueString" element
     */
    public org.hl7.fhir.String getValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(VALUESTRING$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueString" element
     */
    public boolean isSetValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESTRING$28) != 0;
        }
    }
    
    /**
     * Sets the "valueString" element
     */
    public void setValueString(org.hl7.fhir.String valueString)
    {
        generatedSetterHelperImpl(valueString, VALUESTRING$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueString" element
     */
    public org.hl7.fhir.String addNewValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(VALUESTRING$28);
            return target;
        }
    }
    
    /**
     * Unsets the "valueString" element
     */
    public void unsetValueString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESTRING$28, 0);
        }
    }
    
    /**
     * Gets the "valueUri" element
     */
    public org.hl7.fhir.Uri getValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(VALUEURI$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueUri" element
     */
    public boolean isSetValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEURI$30) != 0;
        }
    }
    
    /**
     * Sets the "valueUri" element
     */
    public void setValueUri(org.hl7.fhir.Uri valueUri)
    {
        generatedSetterHelperImpl(valueUri, VALUEURI$30, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueUri" element
     */
    public org.hl7.fhir.Uri addNewValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(VALUEURI$30);
            return target;
        }
    }
    
    /**
     * Unsets the "valueUri" element
     */
    public void unsetValueUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEURI$30, 0);
        }
    }
    
    /**
     * Gets the "valueDate" element
     */
    public org.hl7.fhir.Date getValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(VALUEDATE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueDate" element
     */
    public boolean isSetValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEDATE$32) != 0;
        }
    }
    
    /**
     * Sets the "valueDate" element
     */
    public void setValueDate(org.hl7.fhir.Date valueDate)
    {
        generatedSetterHelperImpl(valueDate, VALUEDATE$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueDate" element
     */
    public org.hl7.fhir.Date addNewValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(VALUEDATE$32);
            return target;
        }
    }
    
    /**
     * Unsets the "valueDate" element
     */
    public void unsetValueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEDATE$32, 0);
        }
    }
    
    /**
     * Gets the "valueDateTime" element
     */
    public org.hl7.fhir.DateTime getValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(VALUEDATETIME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueDateTime" element
     */
    public boolean isSetValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEDATETIME$34) != 0;
        }
    }
    
    /**
     * Sets the "valueDateTime" element
     */
    public void setValueDateTime(org.hl7.fhir.DateTime valueDateTime)
    {
        generatedSetterHelperImpl(valueDateTime, VALUEDATETIME$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueDateTime" element
     */
    public org.hl7.fhir.DateTime addNewValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(VALUEDATETIME$34);
            return target;
        }
    }
    
    /**
     * Unsets the "valueDateTime" element
     */
    public void unsetValueDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEDATETIME$34, 0);
        }
    }
    
    /**
     * Gets the "valueCode" element
     */
    public org.hl7.fhir.Code getValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(VALUECODE$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueCode" element
     */
    public boolean isSetValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECODE$36) != 0;
        }
    }
    
    /**
     * Sets the "valueCode" element
     */
    public void setValueCode(org.hl7.fhir.Code valueCode)
    {
        generatedSetterHelperImpl(valueCode, VALUECODE$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueCode" element
     */
    public org.hl7.fhir.Code addNewValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(VALUECODE$36);
            return target;
        }
    }
    
    /**
     * Unsets the "valueCode" element
     */
    public void unsetValueCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECODE$36, 0);
        }
    }
    
    /**
     * Gets the "valueOid" element
     */
    public org.hl7.fhir.Oid getValueOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().find_element_user(VALUEOID$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueOid" element
     */
    public boolean isSetValueOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEOID$38) != 0;
        }
    }
    
    /**
     * Sets the "valueOid" element
     */
    public void setValueOid(org.hl7.fhir.Oid valueOid)
    {
        generatedSetterHelperImpl(valueOid, VALUEOID$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueOid" element
     */
    public org.hl7.fhir.Oid addNewValueOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().add_element_user(VALUEOID$38);
            return target;
        }
    }
    
    /**
     * Unsets the "valueOid" element
     */
    public void unsetValueOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEOID$38, 0);
        }
    }
    
    /**
     * Gets the "valueUuid" element
     */
    public org.hl7.fhir.Uuid getValueUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uuid target = null;
            target = (org.hl7.fhir.Uuid)get_store().find_element_user(VALUEUUID$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueUuid" element
     */
    public boolean isSetValueUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEUUID$40) != 0;
        }
    }
    
    /**
     * Sets the "valueUuid" element
     */
    public void setValueUuid(org.hl7.fhir.Uuid valueUuid)
    {
        generatedSetterHelperImpl(valueUuid, VALUEUUID$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueUuid" element
     */
    public org.hl7.fhir.Uuid addNewValueUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uuid target = null;
            target = (org.hl7.fhir.Uuid)get_store().add_element_user(VALUEUUID$40);
            return target;
        }
    }
    
    /**
     * Unsets the "valueUuid" element
     */
    public void unsetValueUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEUUID$40, 0);
        }
    }
    
    /**
     * Gets the "valueId" element
     */
    public org.hl7.fhir.Id getValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(VALUEID$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueId" element
     */
    public boolean isSetValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEID$42) != 0;
        }
    }
    
    /**
     * Sets the "valueId" element
     */
    public void setValueId(org.hl7.fhir.Id valueId)
    {
        generatedSetterHelperImpl(valueId, VALUEID$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueId" element
     */
    public org.hl7.fhir.Id addNewValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(VALUEID$42);
            return target;
        }
    }
    
    /**
     * Unsets the "valueId" element
     */
    public void unsetValueId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEID$42, 0);
        }
    }
    
    /**
     * Gets the "valueAttachment" element
     */
    public org.hl7.fhir.Attachment getValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(VALUEATTACHMENT$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueAttachment" element
     */
    public boolean isSetValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEATTACHMENT$44) != 0;
        }
    }
    
    /**
     * Sets the "valueAttachment" element
     */
    public void setValueAttachment(org.hl7.fhir.Attachment valueAttachment)
    {
        generatedSetterHelperImpl(valueAttachment, VALUEATTACHMENT$44, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueAttachment" element
     */
    public org.hl7.fhir.Attachment addNewValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(VALUEATTACHMENT$44);
            return target;
        }
    }
    
    /**
     * Unsets the "valueAttachment" element
     */
    public void unsetValueAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEATTACHMENT$44, 0);
        }
    }
    
    /**
     * Gets the "valueIdentifier" element
     */
    public org.hl7.fhir.Identifier getValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(VALUEIDENTIFIER$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueIdentifier" element
     */
    public boolean isSetValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEIDENTIFIER$46) != 0;
        }
    }
    
    /**
     * Sets the "valueIdentifier" element
     */
    public void setValueIdentifier(org.hl7.fhir.Identifier valueIdentifier)
    {
        generatedSetterHelperImpl(valueIdentifier, VALUEIDENTIFIER$46, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueIdentifier" element
     */
    public org.hl7.fhir.Identifier addNewValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(VALUEIDENTIFIER$46);
            return target;
        }
    }
    
    /**
     * Unsets the "valueIdentifier" element
     */
    public void unsetValueIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEIDENTIFIER$46, 0);
        }
    }
    
    /**
     * Gets the "valueCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept getValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(VALUECODEABLECONCEPT$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueCodeableConcept" element
     */
    public boolean isSetValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECODEABLECONCEPT$48) != 0;
        }
    }
    
    /**
     * Sets the "valueCodeableConcept" element
     */
    public void setValueCodeableConcept(org.hl7.fhir.CodeableConcept valueCodeableConcept)
    {
        generatedSetterHelperImpl(valueCodeableConcept, VALUECODEABLECONCEPT$48, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept addNewValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(VALUECODEABLECONCEPT$48);
            return target;
        }
    }
    
    /**
     * Unsets the "valueCodeableConcept" element
     */
    public void unsetValueCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECODEABLECONCEPT$48, 0);
        }
    }
    
    /**
     * Gets the "valueCoding" element
     */
    public org.hl7.fhir.Coding getValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(VALUECODING$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueCoding" element
     */
    public boolean isSetValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECODING$50) != 0;
        }
    }
    
    /**
     * Sets the "valueCoding" element
     */
    public void setValueCoding(org.hl7.fhir.Coding valueCoding)
    {
        generatedSetterHelperImpl(valueCoding, VALUECODING$50, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueCoding" element
     */
    public org.hl7.fhir.Coding addNewValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(VALUECODING$50);
            return target;
        }
    }
    
    /**
     * Unsets the "valueCoding" element
     */
    public void unsetValueCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECODING$50, 0);
        }
    }
    
    /**
     * Gets the "valueQuantity" element
     */
    public org.hl7.fhir.Quantity getValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(VALUEQUANTITY$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueQuantity" element
     */
    public boolean isSetValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEQUANTITY$52) != 0;
        }
    }
    
    /**
     * Sets the "valueQuantity" element
     */
    public void setValueQuantity(org.hl7.fhir.Quantity valueQuantity)
    {
        generatedSetterHelperImpl(valueQuantity, VALUEQUANTITY$52, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueQuantity" element
     */
    public org.hl7.fhir.Quantity addNewValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(VALUEQUANTITY$52);
            return target;
        }
    }
    
    /**
     * Unsets the "valueQuantity" element
     */
    public void unsetValueQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEQUANTITY$52, 0);
        }
    }
    
    /**
     * Gets the "valueRange" element
     */
    public org.hl7.fhir.Range getValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().find_element_user(VALUERANGE$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueRange" element
     */
    public boolean isSetValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUERANGE$54) != 0;
        }
    }
    
    /**
     * Sets the "valueRange" element
     */
    public void setValueRange(org.hl7.fhir.Range valueRange)
    {
        generatedSetterHelperImpl(valueRange, VALUERANGE$54, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueRange" element
     */
    public org.hl7.fhir.Range addNewValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().add_element_user(VALUERANGE$54);
            return target;
        }
    }
    
    /**
     * Unsets the "valueRange" element
     */
    public void unsetValueRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUERANGE$54, 0);
        }
    }
    
    /**
     * Gets the "valuePeriod" element
     */
    public org.hl7.fhir.Period getValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(VALUEPERIOD$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valuePeriod" element
     */
    public boolean isSetValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEPERIOD$56) != 0;
        }
    }
    
    /**
     * Sets the "valuePeriod" element
     */
    public void setValuePeriod(org.hl7.fhir.Period valuePeriod)
    {
        generatedSetterHelperImpl(valuePeriod, VALUEPERIOD$56, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valuePeriod" element
     */
    public org.hl7.fhir.Period addNewValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(VALUEPERIOD$56);
            return target;
        }
    }
    
    /**
     * Unsets the "valuePeriod" element
     */
    public void unsetValuePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEPERIOD$56, 0);
        }
    }
    
    /**
     * Gets the "valueRatio" element
     */
    public org.hl7.fhir.Ratio getValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(VALUERATIO$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueRatio" element
     */
    public boolean isSetValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUERATIO$58) != 0;
        }
    }
    
    /**
     * Sets the "valueRatio" element
     */
    public void setValueRatio(org.hl7.fhir.Ratio valueRatio)
    {
        generatedSetterHelperImpl(valueRatio, VALUERATIO$58, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueRatio" element
     */
    public org.hl7.fhir.Ratio addNewValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(VALUERATIO$58);
            return target;
        }
    }
    
    /**
     * Unsets the "valueRatio" element
     */
    public void unsetValueRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUERATIO$58, 0);
        }
    }
    
    /**
     * Gets the "valueResource" element
     */
    public org.hl7.fhir.ResourceReference getValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(VALUERESOURCE$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueResource" element
     */
    public boolean isSetValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUERESOURCE$60) != 0;
        }
    }
    
    /**
     * Sets the "valueResource" element
     */
    public void setValueResource(org.hl7.fhir.ResourceReference valueResource)
    {
        generatedSetterHelperImpl(valueResource, VALUERESOURCE$60, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueResource" element
     */
    public org.hl7.fhir.ResourceReference addNewValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(VALUERESOURCE$60);
            return target;
        }
    }
    
    /**
     * Unsets the "valueResource" element
     */
    public void unsetValueResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUERESOURCE$60, 0);
        }
    }
    
    /**
     * Gets the "valueSampledData" element
     */
    public org.hl7.fhir.SampledData getValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().find_element_user(VALUESAMPLEDDATA$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueSampledData" element
     */
    public boolean isSetValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESAMPLEDDATA$62) != 0;
        }
    }
    
    /**
     * Sets the "valueSampledData" element
     */
    public void setValueSampledData(org.hl7.fhir.SampledData valueSampledData)
    {
        generatedSetterHelperImpl(valueSampledData, VALUESAMPLEDDATA$62, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueSampledData" element
     */
    public org.hl7.fhir.SampledData addNewValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().add_element_user(VALUESAMPLEDDATA$62);
            return target;
        }
    }
    
    /**
     * Unsets the "valueSampledData" element
     */
    public void unsetValueSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESAMPLEDDATA$62, 0);
        }
    }
    
    /**
     * Gets the "valueHumanName" element
     */
    public org.hl7.fhir.HumanName getValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(VALUEHUMANNAME$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueHumanName" element
     */
    public boolean isSetValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEHUMANNAME$64) != 0;
        }
    }
    
    /**
     * Sets the "valueHumanName" element
     */
    public void setValueHumanName(org.hl7.fhir.HumanName valueHumanName)
    {
        generatedSetterHelperImpl(valueHumanName, VALUEHUMANNAME$64, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueHumanName" element
     */
    public org.hl7.fhir.HumanName addNewValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().add_element_user(VALUEHUMANNAME$64);
            return target;
        }
    }
    
    /**
     * Unsets the "valueHumanName" element
     */
    public void unsetValueHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEHUMANNAME$64, 0);
        }
    }
    
    /**
     * Gets the "valueAddress" element
     */
    public org.hl7.fhir.Address getValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(VALUEADDRESS$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueAddress" element
     */
    public boolean isSetValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEADDRESS$66) != 0;
        }
    }
    
    /**
     * Sets the "valueAddress" element
     */
    public void setValueAddress(org.hl7.fhir.Address valueAddress)
    {
        generatedSetterHelperImpl(valueAddress, VALUEADDRESS$66, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueAddress" element
     */
    public org.hl7.fhir.Address addNewValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().add_element_user(VALUEADDRESS$66);
            return target;
        }
    }
    
    /**
     * Unsets the "valueAddress" element
     */
    public void unsetValueAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEADDRESS$66, 0);
        }
    }
    
    /**
     * Gets the "valueContact" element
     */
    public org.hl7.fhir.Contact getValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(VALUECONTACT$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueContact" element
     */
    public boolean isSetValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECONTACT$68) != 0;
        }
    }
    
    /**
     * Sets the "valueContact" element
     */
    public void setValueContact(org.hl7.fhir.Contact valueContact)
    {
        generatedSetterHelperImpl(valueContact, VALUECONTACT$68, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueContact" element
     */
    public org.hl7.fhir.Contact addNewValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().add_element_user(VALUECONTACT$68);
            return target;
        }
    }
    
    /**
     * Unsets the "valueContact" element
     */
    public void unsetValueContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECONTACT$68, 0);
        }
    }
    
    /**
     * Gets the "valueSchedule" element
     */
    public org.hl7.fhir.Schedule getValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(VALUESCHEDULE$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueSchedule" element
     */
    public boolean isSetValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUESCHEDULE$70) != 0;
        }
    }
    
    /**
     * Sets the "valueSchedule" element
     */
    public void setValueSchedule(org.hl7.fhir.Schedule valueSchedule)
    {
        generatedSetterHelperImpl(valueSchedule, VALUESCHEDULE$70, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueSchedule" element
     */
    public org.hl7.fhir.Schedule addNewValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(VALUESCHEDULE$70);
            return target;
        }
    }
    
    /**
     * Unsets the "valueSchedule" element
     */
    public void unsetValueSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUESCHEDULE$70, 0);
        }
    }
    
    /**
     * Gets the "exampleBoolean" element
     */
    public org.hl7.fhir.Boolean getExampleBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(EXAMPLEBOOLEAN$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleBoolean" element
     */
    public boolean isSetExampleBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEBOOLEAN$72) != 0;
        }
    }
    
    /**
     * Sets the "exampleBoolean" element
     */
    public void setExampleBoolean(org.hl7.fhir.Boolean exampleBoolean)
    {
        generatedSetterHelperImpl(exampleBoolean, EXAMPLEBOOLEAN$72, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleBoolean" element
     */
    public org.hl7.fhir.Boolean addNewExampleBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(EXAMPLEBOOLEAN$72);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleBoolean" element
     */
    public void unsetExampleBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEBOOLEAN$72, 0);
        }
    }
    
    /**
     * Gets the "exampleInteger" element
     */
    public org.hl7.fhir.Integer getExampleInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(EXAMPLEINTEGER$74, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleInteger" element
     */
    public boolean isSetExampleInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEINTEGER$74) != 0;
        }
    }
    
    /**
     * Sets the "exampleInteger" element
     */
    public void setExampleInteger(org.hl7.fhir.Integer exampleInteger)
    {
        generatedSetterHelperImpl(exampleInteger, EXAMPLEINTEGER$74, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleInteger" element
     */
    public org.hl7.fhir.Integer addNewExampleInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(EXAMPLEINTEGER$74);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleInteger" element
     */
    public void unsetExampleInteger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEINTEGER$74, 0);
        }
    }
    
    /**
     * Gets the "exampleDecimal" element
     */
    public org.hl7.fhir.Decimal getExampleDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().find_element_user(EXAMPLEDECIMAL$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleDecimal" element
     */
    public boolean isSetExampleDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEDECIMAL$76) != 0;
        }
    }
    
    /**
     * Sets the "exampleDecimal" element
     */
    public void setExampleDecimal(org.hl7.fhir.Decimal exampleDecimal)
    {
        generatedSetterHelperImpl(exampleDecimal, EXAMPLEDECIMAL$76, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleDecimal" element
     */
    public org.hl7.fhir.Decimal addNewExampleDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Decimal target = null;
            target = (org.hl7.fhir.Decimal)get_store().add_element_user(EXAMPLEDECIMAL$76);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleDecimal" element
     */
    public void unsetExampleDecimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEDECIMAL$76, 0);
        }
    }
    
    /**
     * Gets the "exampleBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary getExampleBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().find_element_user(EXAMPLEBASE64BINARY$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleBase64Binary" element
     */
    public boolean isSetExampleBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEBASE64BINARY$78) != 0;
        }
    }
    
    /**
     * Sets the "exampleBase64Binary" element
     */
    public void setExampleBase64Binary(org.hl7.fhir.Base64Binary exampleBase64Binary)
    {
        generatedSetterHelperImpl(exampleBase64Binary, EXAMPLEBASE64BINARY$78, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleBase64Binary" element
     */
    public org.hl7.fhir.Base64Binary addNewExampleBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Base64Binary target = null;
            target = (org.hl7.fhir.Base64Binary)get_store().add_element_user(EXAMPLEBASE64BINARY$78);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleBase64Binary" element
     */
    public void unsetExampleBase64Binary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEBASE64BINARY$78, 0);
        }
    }
    
    /**
     * Gets the "exampleInstant" element
     */
    public org.hl7.fhir.Instant getExampleInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().find_element_user(EXAMPLEINSTANT$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleInstant" element
     */
    public boolean isSetExampleInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEINSTANT$80) != 0;
        }
    }
    
    /**
     * Sets the "exampleInstant" element
     */
    public void setExampleInstant(org.hl7.fhir.Instant exampleInstant)
    {
        generatedSetterHelperImpl(exampleInstant, EXAMPLEINSTANT$80, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleInstant" element
     */
    public org.hl7.fhir.Instant addNewExampleInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Instant target = null;
            target = (org.hl7.fhir.Instant)get_store().add_element_user(EXAMPLEINSTANT$80);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleInstant" element
     */
    public void unsetExampleInstant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEINSTANT$80, 0);
        }
    }
    
    /**
     * Gets the "exampleString" element
     */
    public org.hl7.fhir.String getExampleString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(EXAMPLESTRING$82, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleString" element
     */
    public boolean isSetExampleString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLESTRING$82) != 0;
        }
    }
    
    /**
     * Sets the "exampleString" element
     */
    public void setExampleString(org.hl7.fhir.String exampleString)
    {
        generatedSetterHelperImpl(exampleString, EXAMPLESTRING$82, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleString" element
     */
    public org.hl7.fhir.String addNewExampleString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(EXAMPLESTRING$82);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleString" element
     */
    public void unsetExampleString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLESTRING$82, 0);
        }
    }
    
    /**
     * Gets the "exampleUri" element
     */
    public org.hl7.fhir.Uri getExampleUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(EXAMPLEURI$84, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleUri" element
     */
    public boolean isSetExampleUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEURI$84) != 0;
        }
    }
    
    /**
     * Sets the "exampleUri" element
     */
    public void setExampleUri(org.hl7.fhir.Uri exampleUri)
    {
        generatedSetterHelperImpl(exampleUri, EXAMPLEURI$84, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleUri" element
     */
    public org.hl7.fhir.Uri addNewExampleUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(EXAMPLEURI$84);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleUri" element
     */
    public void unsetExampleUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEURI$84, 0);
        }
    }
    
    /**
     * Gets the "exampleDate" element
     */
    public org.hl7.fhir.Date getExampleDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().find_element_user(EXAMPLEDATE$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleDate" element
     */
    public boolean isSetExampleDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEDATE$86) != 0;
        }
    }
    
    /**
     * Sets the "exampleDate" element
     */
    public void setExampleDate(org.hl7.fhir.Date exampleDate)
    {
        generatedSetterHelperImpl(exampleDate, EXAMPLEDATE$86, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleDate" element
     */
    public org.hl7.fhir.Date addNewExampleDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Date target = null;
            target = (org.hl7.fhir.Date)get_store().add_element_user(EXAMPLEDATE$86);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleDate" element
     */
    public void unsetExampleDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEDATE$86, 0);
        }
    }
    
    /**
     * Gets the "exampleDateTime" element
     */
    public org.hl7.fhir.DateTime getExampleDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(EXAMPLEDATETIME$88, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleDateTime" element
     */
    public boolean isSetExampleDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEDATETIME$88) != 0;
        }
    }
    
    /**
     * Sets the "exampleDateTime" element
     */
    public void setExampleDateTime(org.hl7.fhir.DateTime exampleDateTime)
    {
        generatedSetterHelperImpl(exampleDateTime, EXAMPLEDATETIME$88, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleDateTime" element
     */
    public org.hl7.fhir.DateTime addNewExampleDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(EXAMPLEDATETIME$88);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleDateTime" element
     */
    public void unsetExampleDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEDATETIME$88, 0);
        }
    }
    
    /**
     * Gets the "exampleCode" element
     */
    public org.hl7.fhir.Code getExampleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(EXAMPLECODE$90, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleCode" element
     */
    public boolean isSetExampleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLECODE$90) != 0;
        }
    }
    
    /**
     * Sets the "exampleCode" element
     */
    public void setExampleCode(org.hl7.fhir.Code exampleCode)
    {
        generatedSetterHelperImpl(exampleCode, EXAMPLECODE$90, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleCode" element
     */
    public org.hl7.fhir.Code addNewExampleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(EXAMPLECODE$90);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleCode" element
     */
    public void unsetExampleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLECODE$90, 0);
        }
    }
    
    /**
     * Gets the "exampleOid" element
     */
    public org.hl7.fhir.Oid getExampleOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().find_element_user(EXAMPLEOID$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleOid" element
     */
    public boolean isSetExampleOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEOID$92) != 0;
        }
    }
    
    /**
     * Sets the "exampleOid" element
     */
    public void setExampleOid(org.hl7.fhir.Oid exampleOid)
    {
        generatedSetterHelperImpl(exampleOid, EXAMPLEOID$92, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleOid" element
     */
    public org.hl7.fhir.Oid addNewExampleOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Oid target = null;
            target = (org.hl7.fhir.Oid)get_store().add_element_user(EXAMPLEOID$92);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleOid" element
     */
    public void unsetExampleOid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEOID$92, 0);
        }
    }
    
    /**
     * Gets the "exampleUuid" element
     */
    public org.hl7.fhir.Uuid getExampleUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uuid target = null;
            target = (org.hl7.fhir.Uuid)get_store().find_element_user(EXAMPLEUUID$94, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleUuid" element
     */
    public boolean isSetExampleUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEUUID$94) != 0;
        }
    }
    
    /**
     * Sets the "exampleUuid" element
     */
    public void setExampleUuid(org.hl7.fhir.Uuid exampleUuid)
    {
        generatedSetterHelperImpl(exampleUuid, EXAMPLEUUID$94, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleUuid" element
     */
    public org.hl7.fhir.Uuid addNewExampleUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uuid target = null;
            target = (org.hl7.fhir.Uuid)get_store().add_element_user(EXAMPLEUUID$94);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleUuid" element
     */
    public void unsetExampleUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEUUID$94, 0);
        }
    }
    
    /**
     * Gets the "exampleId" element
     */
    public org.hl7.fhir.Id getExampleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(EXAMPLEID$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleId" element
     */
    public boolean isSetExampleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEID$96) != 0;
        }
    }
    
    /**
     * Sets the "exampleId" element
     */
    public void setExampleId(org.hl7.fhir.Id exampleId)
    {
        generatedSetterHelperImpl(exampleId, EXAMPLEID$96, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleId" element
     */
    public org.hl7.fhir.Id addNewExampleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(EXAMPLEID$96);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleId" element
     */
    public void unsetExampleId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEID$96, 0);
        }
    }
    
    /**
     * Gets the "exampleAttachment" element
     */
    public org.hl7.fhir.Attachment getExampleAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().find_element_user(EXAMPLEATTACHMENT$98, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleAttachment" element
     */
    public boolean isSetExampleAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEATTACHMENT$98) != 0;
        }
    }
    
    /**
     * Sets the "exampleAttachment" element
     */
    public void setExampleAttachment(org.hl7.fhir.Attachment exampleAttachment)
    {
        generatedSetterHelperImpl(exampleAttachment, EXAMPLEATTACHMENT$98, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleAttachment" element
     */
    public org.hl7.fhir.Attachment addNewExampleAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Attachment target = null;
            target = (org.hl7.fhir.Attachment)get_store().add_element_user(EXAMPLEATTACHMENT$98);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleAttachment" element
     */
    public void unsetExampleAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEATTACHMENT$98, 0);
        }
    }
    
    /**
     * Gets the "exampleIdentifier" element
     */
    public org.hl7.fhir.Identifier getExampleIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().find_element_user(EXAMPLEIDENTIFIER$100, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleIdentifier" element
     */
    public boolean isSetExampleIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEIDENTIFIER$100) != 0;
        }
    }
    
    /**
     * Sets the "exampleIdentifier" element
     */
    public void setExampleIdentifier(org.hl7.fhir.Identifier exampleIdentifier)
    {
        generatedSetterHelperImpl(exampleIdentifier, EXAMPLEIDENTIFIER$100, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleIdentifier" element
     */
    public org.hl7.fhir.Identifier addNewExampleIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Identifier target = null;
            target = (org.hl7.fhir.Identifier)get_store().add_element_user(EXAMPLEIDENTIFIER$100);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleIdentifier" element
     */
    public void unsetExampleIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEIDENTIFIER$100, 0);
        }
    }
    
    /**
     * Gets the "exampleCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept getExampleCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(EXAMPLECODEABLECONCEPT$102, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleCodeableConcept" element
     */
    public boolean isSetExampleCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLECODEABLECONCEPT$102) != 0;
        }
    }
    
    /**
     * Sets the "exampleCodeableConcept" element
     */
    public void setExampleCodeableConcept(org.hl7.fhir.CodeableConcept exampleCodeableConcept)
    {
        generatedSetterHelperImpl(exampleCodeableConcept, EXAMPLECODEABLECONCEPT$102, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleCodeableConcept" element
     */
    public org.hl7.fhir.CodeableConcept addNewExampleCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(EXAMPLECODEABLECONCEPT$102);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleCodeableConcept" element
     */
    public void unsetExampleCodeableConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLECODEABLECONCEPT$102, 0);
        }
    }
    
    /**
     * Gets the "exampleCoding" element
     */
    public org.hl7.fhir.Coding getExampleCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().find_element_user(EXAMPLECODING$104, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleCoding" element
     */
    public boolean isSetExampleCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLECODING$104) != 0;
        }
    }
    
    /**
     * Sets the "exampleCoding" element
     */
    public void setExampleCoding(org.hl7.fhir.Coding exampleCoding)
    {
        generatedSetterHelperImpl(exampleCoding, EXAMPLECODING$104, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleCoding" element
     */
    public org.hl7.fhir.Coding addNewExampleCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Coding target = null;
            target = (org.hl7.fhir.Coding)get_store().add_element_user(EXAMPLECODING$104);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleCoding" element
     */
    public void unsetExampleCoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLECODING$104, 0);
        }
    }
    
    /**
     * Gets the "exampleQuantity" element
     */
    public org.hl7.fhir.Quantity getExampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(EXAMPLEQUANTITY$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleQuantity" element
     */
    public boolean isSetExampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEQUANTITY$106) != 0;
        }
    }
    
    /**
     * Sets the "exampleQuantity" element
     */
    public void setExampleQuantity(org.hl7.fhir.Quantity exampleQuantity)
    {
        generatedSetterHelperImpl(exampleQuantity, EXAMPLEQUANTITY$106, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleQuantity" element
     */
    public org.hl7.fhir.Quantity addNewExampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Quantity target = null;
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(EXAMPLEQUANTITY$106);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleQuantity" element
     */
    public void unsetExampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEQUANTITY$106, 0);
        }
    }
    
    /**
     * Gets the "exampleRange" element
     */
    public org.hl7.fhir.Range getExampleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().find_element_user(EXAMPLERANGE$108, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleRange" element
     */
    public boolean isSetExampleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLERANGE$108) != 0;
        }
    }
    
    /**
     * Sets the "exampleRange" element
     */
    public void setExampleRange(org.hl7.fhir.Range exampleRange)
    {
        generatedSetterHelperImpl(exampleRange, EXAMPLERANGE$108, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleRange" element
     */
    public org.hl7.fhir.Range addNewExampleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Range target = null;
            target = (org.hl7.fhir.Range)get_store().add_element_user(EXAMPLERANGE$108);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleRange" element
     */
    public void unsetExampleRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLERANGE$108, 0);
        }
    }
    
    /**
     * Gets the "examplePeriod" element
     */
    public org.hl7.fhir.Period getExamplePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().find_element_user(EXAMPLEPERIOD$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "examplePeriod" element
     */
    public boolean isSetExamplePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEPERIOD$110) != 0;
        }
    }
    
    /**
     * Sets the "examplePeriod" element
     */
    public void setExamplePeriod(org.hl7.fhir.Period examplePeriod)
    {
        generatedSetterHelperImpl(examplePeriod, EXAMPLEPERIOD$110, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "examplePeriod" element
     */
    public org.hl7.fhir.Period addNewExamplePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Period target = null;
            target = (org.hl7.fhir.Period)get_store().add_element_user(EXAMPLEPERIOD$110);
            return target;
        }
    }
    
    /**
     * Unsets the "examplePeriod" element
     */
    public void unsetExamplePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEPERIOD$110, 0);
        }
    }
    
    /**
     * Gets the "exampleRatio" element
     */
    public org.hl7.fhir.Ratio getExampleRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().find_element_user(EXAMPLERATIO$112, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleRatio" element
     */
    public boolean isSetExampleRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLERATIO$112) != 0;
        }
    }
    
    /**
     * Sets the "exampleRatio" element
     */
    public void setExampleRatio(org.hl7.fhir.Ratio exampleRatio)
    {
        generatedSetterHelperImpl(exampleRatio, EXAMPLERATIO$112, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleRatio" element
     */
    public org.hl7.fhir.Ratio addNewExampleRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Ratio target = null;
            target = (org.hl7.fhir.Ratio)get_store().add_element_user(EXAMPLERATIO$112);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleRatio" element
     */
    public void unsetExampleRatio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLERATIO$112, 0);
        }
    }
    
    /**
     * Gets the "exampleResource" element
     */
    public org.hl7.fhir.ResourceReference getExampleResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(EXAMPLERESOURCE$114, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleResource" element
     */
    public boolean isSetExampleResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLERESOURCE$114) != 0;
        }
    }
    
    /**
     * Sets the "exampleResource" element
     */
    public void setExampleResource(org.hl7.fhir.ResourceReference exampleResource)
    {
        generatedSetterHelperImpl(exampleResource, EXAMPLERESOURCE$114, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleResource" element
     */
    public org.hl7.fhir.ResourceReference addNewExampleResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(EXAMPLERESOURCE$114);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleResource" element
     */
    public void unsetExampleResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLERESOURCE$114, 0);
        }
    }
    
    /**
     * Gets the "exampleSampledData" element
     */
    public org.hl7.fhir.SampledData getExampleSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().find_element_user(EXAMPLESAMPLEDDATA$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleSampledData" element
     */
    public boolean isSetExampleSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLESAMPLEDDATA$116) != 0;
        }
    }
    
    /**
     * Sets the "exampleSampledData" element
     */
    public void setExampleSampledData(org.hl7.fhir.SampledData exampleSampledData)
    {
        generatedSetterHelperImpl(exampleSampledData, EXAMPLESAMPLEDDATA$116, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleSampledData" element
     */
    public org.hl7.fhir.SampledData addNewExampleSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.SampledData target = null;
            target = (org.hl7.fhir.SampledData)get_store().add_element_user(EXAMPLESAMPLEDDATA$116);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleSampledData" element
     */
    public void unsetExampleSampledData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLESAMPLEDDATA$116, 0);
        }
    }
    
    /**
     * Gets the "exampleHumanName" element
     */
    public org.hl7.fhir.HumanName getExampleHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().find_element_user(EXAMPLEHUMANNAME$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleHumanName" element
     */
    public boolean isSetExampleHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEHUMANNAME$118) != 0;
        }
    }
    
    /**
     * Sets the "exampleHumanName" element
     */
    public void setExampleHumanName(org.hl7.fhir.HumanName exampleHumanName)
    {
        generatedSetterHelperImpl(exampleHumanName, EXAMPLEHUMANNAME$118, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleHumanName" element
     */
    public org.hl7.fhir.HumanName addNewExampleHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.HumanName target = null;
            target = (org.hl7.fhir.HumanName)get_store().add_element_user(EXAMPLEHUMANNAME$118);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleHumanName" element
     */
    public void unsetExampleHumanName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEHUMANNAME$118, 0);
        }
    }
    
    /**
     * Gets the "exampleAddress" element
     */
    public org.hl7.fhir.Address getExampleAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().find_element_user(EXAMPLEADDRESS$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleAddress" element
     */
    public boolean isSetExampleAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLEADDRESS$120) != 0;
        }
    }
    
    /**
     * Sets the "exampleAddress" element
     */
    public void setExampleAddress(org.hl7.fhir.Address exampleAddress)
    {
        generatedSetterHelperImpl(exampleAddress, EXAMPLEADDRESS$120, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleAddress" element
     */
    public org.hl7.fhir.Address addNewExampleAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Address target = null;
            target = (org.hl7.fhir.Address)get_store().add_element_user(EXAMPLEADDRESS$120);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleAddress" element
     */
    public void unsetExampleAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLEADDRESS$120, 0);
        }
    }
    
    /**
     * Gets the "exampleContact" element
     */
    public org.hl7.fhir.Contact getExampleContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().find_element_user(EXAMPLECONTACT$122, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleContact" element
     */
    public boolean isSetExampleContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLECONTACT$122) != 0;
        }
    }
    
    /**
     * Sets the "exampleContact" element
     */
    public void setExampleContact(org.hl7.fhir.Contact exampleContact)
    {
        generatedSetterHelperImpl(exampleContact, EXAMPLECONTACT$122, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleContact" element
     */
    public org.hl7.fhir.Contact addNewExampleContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Contact target = null;
            target = (org.hl7.fhir.Contact)get_store().add_element_user(EXAMPLECONTACT$122);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleContact" element
     */
    public void unsetExampleContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLECONTACT$122, 0);
        }
    }
    
    /**
     * Gets the "exampleSchedule" element
     */
    public org.hl7.fhir.Schedule getExampleSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().find_element_user(EXAMPLESCHEDULE$124, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exampleSchedule" element
     */
    public boolean isSetExampleSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXAMPLESCHEDULE$124) != 0;
        }
    }
    
    /**
     * Sets the "exampleSchedule" element
     */
    public void setExampleSchedule(org.hl7.fhir.Schedule exampleSchedule)
    {
        generatedSetterHelperImpl(exampleSchedule, EXAMPLESCHEDULE$124, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exampleSchedule" element
     */
    public org.hl7.fhir.Schedule addNewExampleSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Schedule target = null;
            target = (org.hl7.fhir.Schedule)get_store().add_element_user(EXAMPLESCHEDULE$124);
            return target;
        }
    }
    
    /**
     * Unsets the "exampleSchedule" element
     */
    public void unsetExampleSchedule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXAMPLESCHEDULE$124, 0);
        }
    }
    
    /**
     * Gets the "maxLength" element
     */
    public org.hl7.fhir.Integer getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().find_element_user(MAXLENGTH$126, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maxLength" element
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXLENGTH$126) != 0;
        }
    }
    
    /**
     * Sets the "maxLength" element
     */
    public void setMaxLength(org.hl7.fhir.Integer maxLength)
    {
        generatedSetterHelperImpl(maxLength, MAXLENGTH$126, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    public org.hl7.fhir.Integer addNewMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Integer target = null;
            target = (org.hl7.fhir.Integer)get_store().add_element_user(MAXLENGTH$126);
            return target;
        }
    }
    
    /**
     * Unsets the "maxLength" element
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXLENGTH$126, 0);
        }
    }
    
    /**
     * Gets array of all "condition" elements
     */
    public org.hl7.fhir.Id[] getConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDITION$128, targetList);
            org.hl7.fhir.Id[] result = new org.hl7.fhir.Id[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "condition" element
     */
    public org.hl7.fhir.Id getConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(CONDITION$128, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "condition" element
     */
    public int sizeOfConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$128);
        }
    }
    
    /**
     * Sets array of all "condition" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConditionArray(org.hl7.fhir.Id[] conditionArray)
    {
        check_orphaned();
        arraySetterHelper(conditionArray, CONDITION$128);
    }
    
    /**
     * Sets ith "condition" element
     */
    public void setConditionArray(int i, org.hl7.fhir.Id condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().find_element_user(CONDITION$128, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condition" element
     */
    public org.hl7.fhir.Id insertNewCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().insert_element_user(CONDITION$128, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condition" element
     */
    public org.hl7.fhir.Id addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Id target = null;
            target = (org.hl7.fhir.Id)get_store().add_element_user(CONDITION$128);
            return target;
        }
    }
    
    /**
     * Removes the ith "condition" element
     */
    public void removeCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$128, i);
        }
    }
    
    /**
     * Gets array of all "constraint" elements
     */
    public org.hl7.fhir.ProfileConstraint[] getConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSTRAINT$130, targetList);
            org.hl7.fhir.ProfileConstraint[] result = new org.hl7.fhir.ProfileConstraint[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "constraint" element
     */
    public org.hl7.fhir.ProfileConstraint getConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileConstraint target = null;
            target = (org.hl7.fhir.ProfileConstraint)get_store().find_element_user(CONSTRAINT$130, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "constraint" element
     */
    public int sizeOfConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINT$130);
        }
    }
    
    /**
     * Sets array of all "constraint" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConstraintArray(org.hl7.fhir.ProfileConstraint[] constraintArray)
    {
        check_orphaned();
        arraySetterHelper(constraintArray, CONSTRAINT$130);
    }
    
    /**
     * Sets ith "constraint" element
     */
    public void setConstraintArray(int i, org.hl7.fhir.ProfileConstraint constraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileConstraint target = null;
            target = (org.hl7.fhir.ProfileConstraint)get_store().find_element_user(CONSTRAINT$130, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(constraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constraint" element
     */
    public org.hl7.fhir.ProfileConstraint insertNewConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileConstraint target = null;
            target = (org.hl7.fhir.ProfileConstraint)get_store().insert_element_user(CONSTRAINT$130, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constraint" element
     */
    public org.hl7.fhir.ProfileConstraint addNewConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileConstraint target = null;
            target = (org.hl7.fhir.ProfileConstraint)get_store().add_element_user(CONSTRAINT$130);
            return target;
        }
    }
    
    /**
     * Removes the ith "constraint" element
     */
    public void removeConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINT$130, i);
        }
    }
    
    /**
     * Gets the "mustSupport" element
     */
    public org.hl7.fhir.Boolean getMustSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(MUSTSUPPORT$132, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mustSupport" element
     */
    public boolean isSetMustSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MUSTSUPPORT$132) != 0;
        }
    }
    
    /**
     * Sets the "mustSupport" element
     */
    public void setMustSupport(org.hl7.fhir.Boolean mustSupport)
    {
        generatedSetterHelperImpl(mustSupport, MUSTSUPPORT$132, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mustSupport" element
     */
    public org.hl7.fhir.Boolean addNewMustSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(MUSTSUPPORT$132);
            return target;
        }
    }
    
    /**
     * Unsets the "mustSupport" element
     */
    public void unsetMustSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MUSTSUPPORT$132, 0);
        }
    }
    
    /**
     * Gets the "isModifier" element
     */
    public org.hl7.fhir.Boolean getIsModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ISMODIFIER$134, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "isModifier" element
     */
    public void setIsModifier(org.hl7.fhir.Boolean isModifier)
    {
        generatedSetterHelperImpl(isModifier, ISMODIFIER$134, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "isModifier" element
     */
    public org.hl7.fhir.Boolean addNewIsModifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ISMODIFIER$134);
            return target;
        }
    }
    
    /**
     * Gets the "binding" element
     */
    public org.hl7.fhir.ProfileBinding getBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileBinding target = null;
            target = (org.hl7.fhir.ProfileBinding)get_store().find_element_user(BINDING$136, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "binding" element
     */
    public boolean isSetBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINDING$136) != 0;
        }
    }
    
    /**
     * Sets the "binding" element
     */
    public void setBinding(org.hl7.fhir.ProfileBinding binding)
    {
        generatedSetterHelperImpl(binding, BINDING$136, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "binding" element
     */
    public org.hl7.fhir.ProfileBinding addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileBinding target = null;
            target = (org.hl7.fhir.ProfileBinding)get_store().add_element_user(BINDING$136);
            return target;
        }
    }
    
    /**
     * Unsets the "binding" element
     */
    public void unsetBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINDING$136, 0);
        }
    }
    
    /**
     * Gets array of all "mapping" elements
     */
    public org.hl7.fhir.ProfileMapping1[] getMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPPING$138, targetList);
            org.hl7.fhir.ProfileMapping1[] result = new org.hl7.fhir.ProfileMapping1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mapping" element
     */
    public org.hl7.fhir.ProfileMapping1 getMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping1 target = null;
            target = (org.hl7.fhir.ProfileMapping1)get_store().find_element_user(MAPPING$138, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mapping" element
     */
    public int sizeOfMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPING$138);
        }
    }
    
    /**
     * Sets array of all "mapping" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMappingArray(org.hl7.fhir.ProfileMapping1[] mappingArray)
    {
        check_orphaned();
        arraySetterHelper(mappingArray, MAPPING$138);
    }
    
    /**
     * Sets ith "mapping" element
     */
    public void setMappingArray(int i, org.hl7.fhir.ProfileMapping1 mapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping1 target = null;
            target = (org.hl7.fhir.ProfileMapping1)get_store().find_element_user(MAPPING$138, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mapping" element
     */
    public org.hl7.fhir.ProfileMapping1 insertNewMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping1 target = null;
            target = (org.hl7.fhir.ProfileMapping1)get_store().insert_element_user(MAPPING$138, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mapping" element
     */
    public org.hl7.fhir.ProfileMapping1 addNewMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ProfileMapping1 target = null;
            target = (org.hl7.fhir.ProfileMapping1)get_store().add_element_user(MAPPING$138);
            return target;
        }
    }
    
    /**
     * Removes the ith "mapping" element
     */
    public void removeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPING$138, i);
        }
    }
}
