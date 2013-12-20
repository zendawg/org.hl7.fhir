/*
 * An XML document type.
 * Localname: AdverseReaction
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.AdverseReactionDocument
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * A document containing one AdverseReaction(@http://hl7.org/fhir) element.
 *
 * This is a complex type.
 */
public class AdverseReactionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.hl7.fhir.AdverseReactionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AdverseReactionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADVERSEREACTION$0 = 
        new javax.xml.namespace.QName("http://hl7.org/fhir", "AdverseReaction");
    
    
    /**
     * Gets the "AdverseReaction" element
     */
    public org.hl7.fhir.AdverseReaction getAdverseReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReaction target = null;
            target = (org.hl7.fhir.AdverseReaction)get_store().find_element_user(ADVERSEREACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AdverseReaction" element
     */
    public void setAdverseReaction(org.hl7.fhir.AdverseReaction adverseReaction)
    {
        generatedSetterHelperImpl(adverseReaction, ADVERSEREACTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AdverseReaction" element
     */
    public org.hl7.fhir.AdverseReaction addNewAdverseReaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.hl7.fhir.AdverseReaction target = null;
            target = (org.hl7.fhir.AdverseReaction)get_store().add_element_user(ADVERSEREACTION$0);
            return target;
        }
    }
}
