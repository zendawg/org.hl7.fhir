/*
 * XML Type:  ConceptMap.Concept
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ConceptMapConcept
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ConceptMap.Concept(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class ConceptMapConceptImpl extends org.hl7.fhir.impl.BackboneElementImpl implements org.hl7.fhir.ConceptMapConcept
{
    private static final long serialVersionUID = 1L;
    
    public ConceptMapConceptImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEM$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "system");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName DEPENDSON$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "dependsOn");
    private static final javax.xml.namespace.QName MAP$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "map");
    
    
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
     * Gets array of all "dependsOn" elements
     */
    public org.hl7.fhir.ConceptMapDependsOn[] getDependsOnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPENDSON$4, targetList);
            org.hl7.fhir.ConceptMapDependsOn[] result = new org.hl7.fhir.ConceptMapDependsOn[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dependsOn" element
     */
    public org.hl7.fhir.ConceptMapDependsOn getDependsOnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().find_element_user(DEPENDSON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dependsOn" element
     */
    public int sizeOfDependsOnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPENDSON$4);
        }
    }
    
    /**
     * Sets array of all "dependsOn" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDependsOnArray(org.hl7.fhir.ConceptMapDependsOn[] dependsOnArray)
    {
        check_orphaned();
        arraySetterHelper(dependsOnArray, DEPENDSON$4);
    }
    
    /**
     * Sets ith "dependsOn" element
     */
    public void setDependsOnArray(int i, org.hl7.fhir.ConceptMapDependsOn dependsOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().find_element_user(DEPENDSON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dependsOn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dependsOn" element
     */
    public org.hl7.fhir.ConceptMapDependsOn insertNewDependsOn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().insert_element_user(DEPENDSON$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dependsOn" element
     */
    public org.hl7.fhir.ConceptMapDependsOn addNewDependsOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapDependsOn target = null;
            target = (org.hl7.fhir.ConceptMapDependsOn)get_store().add_element_user(DEPENDSON$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "dependsOn" element
     */
    public void removeDependsOn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPENDSON$4, i);
        }
    }
    
    /**
     * Gets array of all "map" elements
     */
    public org.hl7.fhir.ConceptMapMap[] getMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAP$6, targetList);
            org.hl7.fhir.ConceptMapMap[] result = new org.hl7.fhir.ConceptMapMap[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "map" element
     */
    public org.hl7.fhir.ConceptMapMap getMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapMap target = null;
            target = (org.hl7.fhir.ConceptMapMap)get_store().find_element_user(MAP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "map" element
     */
    public int sizeOfMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAP$6);
        }
    }
    
    /**
     * Sets array of all "map" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMapArray(org.hl7.fhir.ConceptMapMap[] mapArray)
    {
        check_orphaned();
        arraySetterHelper(mapArray, MAP$6);
    }
    
    /**
     * Sets ith "map" element
     */
    public void setMapArray(int i, org.hl7.fhir.ConceptMapMap map)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapMap target = null;
            target = (org.hl7.fhir.ConceptMapMap)get_store().find_element_user(MAP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(map);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "map" element
     */
    public org.hl7.fhir.ConceptMapMap insertNewMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapMap target = null;
            target = (org.hl7.fhir.ConceptMapMap)get_store().insert_element_user(MAP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "map" element
     */
    public org.hl7.fhir.ConceptMapMap addNewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.ConceptMapMap target = null;
            target = (org.hl7.fhir.ConceptMapMap)get_store().add_element_user(MAP$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "map" element
     */
    public void removeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAP$6, i);
        }
    }
}
