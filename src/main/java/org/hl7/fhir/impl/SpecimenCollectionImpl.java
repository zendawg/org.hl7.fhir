/*
 * XML Type:  Specimen.Collection
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.SpecimenCollection
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Specimen.Collection(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class SpecimenCollectionImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.SpecimenCollection
{
    private static final long serialVersionUID = 1L;
    
    public SpecimenCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTOR$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "collector");
    private static final javax.xml.namespace.QName COMMENT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "comment");
    private static final javax.xml.namespace.QName COLLECTEDTIME$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "collectedTime");
    private static final javax.xml.namespace.QName QUANTITY$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "quantity");
    private static final javax.xml.namespace.QName METHOD$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "method");
    private static final javax.xml.namespace.QName SOURCESITE$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "sourceSite");
    
    
    /**
     * Gets the "collector" element
     */
    public org.hl7.fhir.ResourceReference getCollector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(COLLECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "collector" element
     */
    public boolean isSetCollector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLECTOR$0) != 0;
        }
    }
    
    /**
     * Sets the "collector" element
     */
    public void setCollector(org.hl7.fhir.ResourceReference collector)
    {
        generatedSetterHelperImpl(collector, COLLECTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "collector" element
     */
    public org.hl7.fhir.ResourceReference addNewCollector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ResourceReference target = null;
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(COLLECTOR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "collector" element
     */
    public void unsetCollector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLECTOR$0, 0);
        }
    }
    
    /**
     * Gets array of all "comment" elements
     */
    public org.hl7.fhir.String[] getCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENT$2, targetList);
            org.hl7.fhir.String[] result = new org.hl7.fhir.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comment" element
     */
    public org.hl7.fhir.String getCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COMMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comment" element
     */
    public int sizeOfCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$2);
        }
    }
    
    /**
     * Sets array of all "comment" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCommentArray(org.hl7.fhir.String[] commentArray)
    {
        check_orphaned();
        arraySetterHelper(commentArray, COMMENT$2);
    }
    
    /**
     * Sets ith "comment" element
     */
    public void setCommentArray(int i, org.hl7.fhir.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(COMMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comment" element
     */
    public org.hl7.fhir.String insertNewComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().insert_element_user(COMMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comment" element
     */
    public org.hl7.fhir.String addNewComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(COMMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "comment" element
     */
    public void removeComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$2, i);
        }
    }
    
    /**
     * Gets the "collectedTime" element
     */
    public org.hl7.fhir.DateTime getCollectedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().find_element_user(COLLECTEDTIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collectedTime" element
     */
    public void setCollectedTime(org.hl7.fhir.DateTime collectedTime)
    {
        generatedSetterHelperImpl(collectedTime, COLLECTEDTIME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "collectedTime" element
     */
    public org.hl7.fhir.DateTime addNewCollectedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.DateTime target = null;
            target = (org.hl7.fhir.DateTime)get_store().add_element_user(COLLECTEDTIME$4);
            return target;
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
            target = (org.hl7.fhir.Quantity)get_store().find_element_user(QUANTITY$6, 0);
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
            return get_store().count_elements(QUANTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "quantity" element
     */
    public void setQuantity(org.hl7.fhir.Quantity quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Quantity)get_store().add_element_user(QUANTITY$6);
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
            get_store().remove_element(QUANTITY$6, 0);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(METHOD$8, 0);
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
            return get_store().count_elements(METHOD$8) != 0;
        }
    }
    
    /**
     * Sets the "method" element
     */
    public void setMethod(org.hl7.fhir.CodeableConcept method)
    {
        generatedSetterHelperImpl(method, METHOD$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(METHOD$8);
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
            get_store().remove_element(METHOD$8, 0);
        }
    }
    
    /**
     * Gets the "sourceSite" element
     */
    public org.hl7.fhir.CodeableConcept getSourceSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(SOURCESITE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceSite" element
     */
    public boolean isSetSourceSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCESITE$10) != 0;
        }
    }
    
    /**
     * Sets the "sourceSite" element
     */
    public void setSourceSite(org.hl7.fhir.CodeableConcept sourceSite)
    {
        generatedSetterHelperImpl(sourceSite, SOURCESITE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceSite" element
     */
    public org.hl7.fhir.CodeableConcept addNewSourceSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(SOURCESITE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "sourceSite" element
     */
    public void unsetSourceSite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCESITE$10, 0);
        }
    }
}
