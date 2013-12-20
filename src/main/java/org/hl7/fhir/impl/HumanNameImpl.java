/*
 * XML Type:  HumanName
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.HumanName
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML HumanName(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class HumanNameImpl extends org.hl7.fhir.impl.ElementImpl implements org.hl7.fhir.HumanName
{
    private static final long serialVersionUID = 1L;
    
    public HumanNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "use");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "text");
    private static final javax.xml.namespace.QName FAMILY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "family");
    private static final javax.xml.namespace.QName GIVEN$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "given");
    private static final javax.xml.namespace.QName PREFIX$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "prefix");
    private static final javax.xml.namespace.QName SUFFIX$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "suffix");
    private static final javax.xml.namespace.QName PERIOD$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "period");
    
    
    /**
     * Gets the "use" element
     */
    public org.hl7.fhir.NameUse getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.NameUse target = null;
            target = (org.hl7.fhir.NameUse)get_store().find_element_user(USE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "use" element
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USE$0) != 0;
        }
    }
    
    /**
     * Sets the "use" element
     */
    public void setUse(org.hl7.fhir.NameUse use)
    {
        generatedSetterHelperImpl(use, USE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "use" element
     */
    public org.hl7.fhir.NameUse addNewUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.NameUse target = null;
            target = (org.hl7.fhir.NameUse)get_store().add_element_user(USE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "use" element
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USE$0, 0);
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
     * Gets array of all "family" elements
     */
    public org.hl7.fhir.String[] getFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAMILY$4, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "family" element
     */
    public org.hl7.fhir.String getFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(FAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "family" element
     */
    public int sizeOfFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILY$4);
        }
    }
    
    /**
     * Sets array of all "family" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFamilyArray(org.hl7.fhir.String[] familyArray)
    {
        check_orphaned();
        arraySetterHelper(familyArray, FAMILY$4);
    }
    
    /**
     * Sets ith "family" element
     */
    public void setFamilyArray(int i, org.hl7.fhir.String family)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(FAMILY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(family);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "family" element
     */
    public org.hl7.fhir.String insertNewFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(FAMILY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    public org.hl7.fhir.String addNewFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(FAMILY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "family" element
     */
    public void removeFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILY$4, i);
        }
    }
    
    /**
     * Gets array of all "given" elements
     */
    public org.hl7.fhir.String[] getGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GIVEN$6, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "given" element
     */
    public org.hl7.fhir.String getGivenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(GIVEN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "given" element
     */
    public int sizeOfGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVEN$6);
        }
    }
    
    /**
     * Sets array of all "given" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGivenArray(org.hl7.fhir.String[] givenArray)
    {
        check_orphaned();
        arraySetterHelper(givenArray, GIVEN$6);
    }
    
    /**
     * Sets ith "given" element
     */
    public void setGivenArray(int i, org.hl7.fhir.String given)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(GIVEN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(given);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "given" element
     */
    public org.hl7.fhir.String insertNewGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(GIVEN$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "given" element
     */
    public org.hl7.fhir.String addNewGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(GIVEN$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "given" element
     */
    public void removeGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVEN$6, i);
        }
    }
    
    /**
     * Gets array of all "prefix" elements
     */
    public org.hl7.fhir.String[] getPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREFIX$8, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prefix" element
     */
    public org.hl7.fhir.String getPrefixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(PREFIX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prefix" element
     */
    public int sizeOfPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFIX$8);
        }
    }
    
    /**
     * Sets array of all "prefix" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPrefixArray(org.hl7.fhir.String[] prefixArray)
    {
        check_orphaned();
        arraySetterHelper(prefixArray, PREFIX$8);
    }
    
    /**
     * Sets ith "prefix" element
     */
    public void setPrefixArray(int i, org.hl7.fhir.String prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(PREFIX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prefix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    public org.hl7.fhir.String insertNewPrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(PREFIX$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    public org.hl7.fhir.String addNewPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(PREFIX$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "prefix" element
     */
    public void removePrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFIX$8, i);
        }
    }
    
    /**
     * Gets array of all "suffix" elements
     */
    public org.hl7.fhir.String[] getSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUFFIX$10, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "suffix" element
     */
    public org.hl7.fhir.String getSuffixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SUFFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "suffix" element
     */
    public int sizeOfSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFFIX$10);
        }
    }
    
    /**
     * Sets array of all "suffix" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSuffixArray(org.hl7.fhir.String[] suffixArray)
    {
        check_orphaned();
        arraySetterHelper(suffixArray, SUFFIX$10);
    }
    
    /**
     * Sets ith "suffix" element
     */
    public void setSuffixArray(int i, org.hl7.fhir.String suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(SUFFIX$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(suffix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suffix" element
     */
    public org.hl7.fhir.String insertNewSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(SUFFIX$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suffix" element
     */
    public org.hl7.fhir.String addNewSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(SUFFIX$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "suffix" element
     */
    public void removeSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFFIX$10, i);
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
            target = (org.hl7.fhir.Period)get_store().find_element_user(PERIOD$12, 0);
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
            return get_store().count_elements(PERIOD$12) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.hl7.fhir.Period period)
    {
        generatedSetterHelperImpl(period, PERIOD$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Period)get_store().add_element_user(PERIOD$12);
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
            get_store().remove_element(PERIOD$12, 0);
        }
    }
}
