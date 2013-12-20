/*
 * XML Type:  ResourceNamesPlusBinary
 * Namespace: http://hl7.org/fhir
 * Java type: org.hl7.fhir.ResourceNamesPlusBinary
 *
 * Automatically generated - do not modify.
 */
package org.hl7.fhir.impl;
/**
 * An XML ResourceNamesPlusBinary(@http://hl7.org/fhir).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.hl7.fhir.ResourceType
 *     org.hl7.fhir.ResourceNamesPlusBinary$Member
 */
public class ResourceNamesPlusBinaryImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.hl7.fhir.ResourceNamesPlusBinary, org.hl7.fhir.ResourceType, org.hl7.fhir.ResourceNamesPlusBinary.Member
{
    private static final long serialVersionUID = 1L;
    
    public ResourceNamesPlusBinaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ResourceNamesPlusBinaryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of org.hl7.fhir.ResourceNamesPlusBinary$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.hl7.fhir.ResourceNamesPlusBinary.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
