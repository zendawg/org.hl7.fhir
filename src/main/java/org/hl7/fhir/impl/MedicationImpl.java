/*
 * XML Type:  Medication
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.Medication
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML Medication(@http://hl7.org/fhir).
 *
 * This is a complex type.
 */
public class MedicationImpl extends org.hl7.fhir.impl.ResourceImpl implements org.hl7.fhir.Medication
{
    private static final long serialVersionUID = 1L;
    
    public MedicationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "name");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "code");
    private static final javax.xml.namespace.QName ISBRAND$4 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "isBrand");
    private static final javax.xml.namespace.QName MANUFACTURER$6 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "manufacturer");
    private static final javax.xml.namespace.QName KIND$8 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "kind");
    private static final javax.xml.namespace.QName PRODUCT$10 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "product");
    private static final javax.xml.namespace.QName PACKAGE$12 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "package");
    
    
    /**
     * Gets the "name" element
     */
    public org.hl7.fhir.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().find_element_user(NAME$0, 0);
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
    public void setName(org.hl7.fhir.String name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.hl7.fhir.String addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.String target = null;
            target = (org.hl7.fhir.String)get_store().add_element_user(NAME$0);
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
     * Gets the "code" element
     */
    public org.hl7.fhir.CodeableConcept getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().find_element_user(CODE$2, 0);
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
    public void setCode(org.hl7.fhir.CodeableConcept code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public org.hl7.fhir.CodeableConcept addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.CodeableConcept target = null;
            target = (org.hl7.fhir.CodeableConcept)get_store().add_element_user(CODE$2);
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
     * Gets the "isBrand" element
     */
    public org.hl7.fhir.Boolean getIsBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().find_element_user(ISBRAND$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "isBrand" element
     */
    public boolean isSetIsBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBRAND$4) != 0;
        }
    }
    
    /**
     * Sets the "isBrand" element
     */
    public void setIsBrand(org.hl7.fhir.Boolean isBrand)
    {
        generatedSetterHelperImpl(isBrand, ISBRAND$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "isBrand" element
     */
    public org.hl7.fhir.Boolean addNewIsBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.Boolean target = null;
            target = (org.hl7.fhir.Boolean)get_store().add_element_user(ISBRAND$4);
            return target;
        }
    }
    
    /**
     * Unsets the "isBrand" element
     */
    public void unsetIsBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBRAND$4, 0);
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
            target = (org.hl7.fhir.ResourceReference)get_store().find_element_user(MANUFACTURER$6, 0);
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
            return get_store().count_elements(MANUFACTURER$6) != 0;
        }
    }
    
    /**
     * Sets the "manufacturer" element
     */
    public void setManufacturer(org.hl7.fhir.ResourceReference manufacturer)
    {
        generatedSetterHelperImpl(manufacturer, MANUFACTURER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.hl7.fhir.ResourceReference)get_store().add_element_user(MANUFACTURER$6);
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
            get_store().remove_element(MANUFACTURER$6, 0);
        }
    }
    
    /**
     * Gets the "kind" element
     */
    public org.hl7.fhir.MedicationKind getKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationKind target = null;
            target = (org.hl7.fhir.MedicationKind)get_store().find_element_user(KIND$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "kind" element
     */
    public boolean isSetKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KIND$8) != 0;
        }
    }
    
    /**
     * Sets the "kind" element
     */
    public void setKind(org.hl7.fhir.MedicationKind kind)
    {
        generatedSetterHelperImpl(kind, KIND$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "kind" element
     */
    public org.hl7.fhir.MedicationKind addNewKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationKind target = null;
            target = (org.hl7.fhir.MedicationKind)get_store().add_element_user(KIND$8);
            return target;
        }
    }
    
    /**
     * Unsets the "kind" element
     */
    public void unsetKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KIND$8, 0);
        }
    }
    
    /**
     * Gets the "product" element
     */
    public org.hl7.fhir.MedicationProduct getProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationProduct target = null;
            target = (org.hl7.fhir.MedicationProduct)get_store().find_element_user(PRODUCT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "product" element
     */
    public boolean isSetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCT$10) != 0;
        }
    }
    
    /**
     * Sets the "product" element
     */
    public void setProduct(org.hl7.fhir.MedicationProduct product)
    {
        generatedSetterHelperImpl(product, PRODUCT$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "product" element
     */
    public org.hl7.fhir.MedicationProduct addNewProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationProduct target = null;
            target = (org.hl7.fhir.MedicationProduct)get_store().add_element_user(PRODUCT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "product" element
     */
    public void unsetProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCT$10, 0);
        }
    }
    
    /**
     * Gets the "package" element
     */
    public org.hl7.fhir.MedicationPackage getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPackage target = null;
            target = (org.hl7.fhir.MedicationPackage)get_store().find_element_user(PACKAGE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "package" element
     */
    public boolean isSetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGE$12) != 0;
        }
    }
    
    /**
     * Sets the "package" element
     */
    public void setPackage(org.hl7.fhir.MedicationPackage xpackage)
    {
        generatedSetterHelperImpl(xpackage, PACKAGE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "package" element
     */
    public org.hl7.fhir.MedicationPackage addNewPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.MedicationPackage target = null;
            target = (org.hl7.fhir.MedicationPackage)get_store().add_element_user(PACKAGE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "package" element
     */
    public void unsetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGE$12, 0);
        }
    }
}
