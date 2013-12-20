/*
 * An XML document type.
 * Localname: base
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.BaseDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one base(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class BaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.BaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "base");
    
    
    /**
     * Gets the "base" element
     */
    public org.w3.x1999.xhtml.BaseDocument.Base getBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BaseDocument.Base target = null;
            target = (org.w3.x1999.xhtml.BaseDocument.Base)get_store().find_element_user(BASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "base" element
     */
    public void setBase(org.w3.x1999.xhtml.BaseDocument.Base base)
    {
        generatedSetterHelperImpl(base, BASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "base" element
     */
    public org.w3.x1999.xhtml.BaseDocument.Base addNewBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.BaseDocument.Base target = null;
            target = (org.w3.x1999.xhtml.BaseDocument.Base)get_store().add_element_user(BASE$0);
            return target;
        }
    }
    /**
     * An XML base(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class BaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.BaseDocument.Base
    {
        private static final long serialVersionUID = 1L;
        
        public BaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HREF$0 = 
            new javax.xml.namespace.QName("", "href");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "href" attribute
         */
        public java.lang.String getHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "href" attribute
         */
        public org.w3.x1999.xhtml.URI xgetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.URI target = null;
                target = (org.w3.x1999.xhtml.URI)get_store().find_attribute_user(HREF$0);
                return target;
            }
        }
        
        /**
         * Sets the "href" attribute
         */
        public void setHref(java.lang.String href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$0);
                }
                target.setStringValue(href);
            }
        }
        
        /**
         * Sets (as xml) the "href" attribute
         */
        public void xsetHref(org.w3.x1999.xhtml.URI href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.URI target = null;
                target = (org.w3.x1999.xhtml.URI)get_store().find_attribute_user(HREF$0);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.URI)get_store().add_attribute_user(HREF$0);
                }
                target.set(href);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$2) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlID target = null;
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$2);
            }
        }
    }
}
