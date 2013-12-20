/*
 * XML Type:  ValueSet.Concept
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ValueSetConcept
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ValueSet.Concept(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ValueSetConceptImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ValueSetConcept
{
    private static final long serialVersionUID = 1L;
    
    public ValueSetConceptImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName ABSTRACT$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "abstract");
    private static final javax.xml.namespace.QName DISPLAY$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "display");
    private static final javax.xml.namespace.QName DEFINITION$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "definition");
    private static final javax.xml.namespace.QName CONCEPT$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "concept");
    
    
    /**
     * Gets the "code" element
     */
    public org.hl7.fhir.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Code target = null;
            target = (org.hl7.fhir.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(org.hl7.fhir.Code code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.Code)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "abstract" element
     */
    public org.hl7.fhir.Boolean getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ABSTRACT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "abstract" element
     */
    public boolean isSetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACT$2) != 0;
        }
    }
    
    /**
     * Sets the "abstract" element
     */
    public void setAbstract(org.hl7.fhir.Boolean xabstract)
    {
        generatedSetterHelperImpl(xabstract, ABSTRACT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstract" element
     */
    public org.hl7.fhir.Boolean addNewAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "abstract" element
     */
    public void unsetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACT$2, 0);
        }
    }
    
    /**
     * Gets the "display" element
     */
    public org.hl7.fhir.String getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DISPLAY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "display" element
     */
    public boolean isSetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAY$4) != 0;
        }
    }
    
    /**
     * Sets the "display" element
     */
    public void setDisplay(org.hl7.fhir.String display)
    {
        generatedSetterHelperImpl(display, DISPLAY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "display" element
     */
    public org.hl7.fhir.String addNewDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DISPLAY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "display" element
     */
    public void unsetDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAY$4, 0);
        }
    }
    
    /**
     * Gets the "definition" element
     */
    public org.hl7.fhir.String getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(DEFINITION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "definition" element
     */
    public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITION$6) != 0;
        }
    }
    
    /**
     * Sets the "definition" element
     */
    public void setDefinition(org.hl7.fhir.String definition)
    {
        generatedSetterHelperImpl(definition, DEFINITION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definition" element
     */
    public org.hl7.fhir.String addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(DEFINITION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "definition" element
     */
    public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITION$6, 0);
        }
    }
    
    /**
     * Gets array of all "concept" elements
     */
    public org.hl7.fhir.ValueSetConcept[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$8, targetList);
            org.hl7.fhir.ValueSetConcept[] result = new org.hl7.fhir.ValueSetConcept[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "concept" element
     */
    public org.hl7.fhir.ValueSetConcept getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().find_element_user(CONCEPT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$8);
        }
    }
    
    /**
     * Sets array of all "concept" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setConceptArray(org.hl7.fhir.ValueSetConcept[] conceptArray)
    {
        check_orphaned();
        arraySetterHelper(conceptArray, CONCEPT$8);
    }
    
    /**
     * Sets ith "concept" element
     */
    public void setConceptArray(int i, org.hl7.fhir.ValueSetConcept concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().find_element_user(CONCEPT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    public org.hl7.fhir.ValueSetConcept insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().insert_element_user(CONCEPT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    public org.hl7.fhir.ValueSetConcept addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ValueSetConcept target = null;
            target = (org.hl7.fhir.ValueSetConcept)get_store().add_element_user(CONCEPT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$8, i);
        }
    }
}
