/*
 * XML Type:  ConceptMap.Map
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConceptMapMap
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ConceptMap.Map(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConceptMapMapImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConceptMapMap
{
    private static final long serialVersionUID = 1L;
    
    public ConceptMapMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName EQUIVALENCE$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "equivalence");
    private static final javax.xml.namespace.QName COMMENTS$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "comments");
    private static final javax.xml.namespace.QName PRODUCT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "product");
    
    
    /**
     * Gets the "system" element
     */
    public org.hl7.fhir.Uri getSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().find_element_user(SYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "system" element
     */
    public boolean isSetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEM$0) != 0;
        }
    }
    
    /**
     * Sets the "system" element
     */
    public void setSystem(org.hl7.fhir.Uri system)
    {
        generatedSetterHelperImpl(system, SYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "system" element
     */
    public org.hl7.fhir.Uri addNewSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Uri target = null;
            target = (org.hl7.fhir.Uri)get_store().add_element_user(SYSTEM$0);
            return target;
        }
    }
    
    /**
     * Unsets the "system" element
     */
    public void unsetSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEM$0, 0);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$2, 0);
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
    public void setCode(org.hl7.fhir.Code code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$2);
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
     * Gets the "equivalence" element
     */
    public org.hl7.fhir.ConceptMapEquivalence getEquivalence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapEquivalence target = null;
            target = (org.hl7.fhir.ConceptMapEquivalence)get_store().find_element_user(EQUIVALENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "equivalence" element
     */
    public void setEquivalence(org.hl7.fhir.ConceptMapEquivalence equivalence)
    {
        generatedSetterHelperImpl(equivalence, EQUIVALENCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "equivalence" element
     */
    public org.hl7.fhir.ConceptMapEquivalence addNewEquivalence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapEquivalence target = null;
            target = (org.hl7.fhir.ConceptMapEquivalence)get_store().add_element_user(EQUIVALENCE$4);
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
            target = (org.hl7.fhir.String)get_store().find_element_user(COMMENTS$6, 0);
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
            return get_store().count_elements(COMMENTS$6) != 0;
        }
    }
    
    /**
     * Sets the "comments" element
     */
    public void setComments(org.hl7.fhir.String comments)
    {
        generatedSetterHelperImpl(comments, COMMENTS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.String)get_store().add_element_user(COMMENTS$6);
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
            get_store().remove_element(COMMENTS$6, 0);
        }
    }
    
    /**
     * Gets array of all "product" elements
     */
    public org.hl7.fhir.ConceptMapDependsOn[] getProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCT$8, targetList);
            org.hl7.fhir.ConceptMapDependsOn[] result = new org.hl7.fhir.ConceptMapDependsOn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "product" element
     */
    public org.hl7.fhir.ConceptMapDependsOn getProductArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().find_element_user(PRODUCT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "product" element
     */
    public int sizeOfProductArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCT$8);
        }
    }
    
    /**
     * Sets array of all "product" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductArray(org.hl7.fhir.ConceptMapDependsOn[] productArray)
    {
        check_orphaned();
        arraySetterHelper(productArray, PRODUCT$8);
    }
    
    /**
     * Sets ith "product" element
     */
    public void setProductArray(int i, org.hl7.fhir.ConceptMapDependsOn product)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().find_element_user(PRODUCT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(product);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "product" element
     */
    public org.hl7.fhir.ConceptMapDependsOn insertNewProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().insert_element_user(PRODUCT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "product" element
     */
    public org.hl7.fhir.ConceptMapDependsOn addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().add_element_user(PRODUCT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "product" element
     */
    public void removeProduct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCT$8, i);
        }
    }
}
