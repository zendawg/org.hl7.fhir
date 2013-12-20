/*
 * An XML document type.
 * Localname: head
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.HeadDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one head(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class HeadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.HeadDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEAD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "head");
    
    
    /**
     * Gets the "head" element
     */
    public org.w3.x1999.xhtml.HeadDocument.Head getHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.HeadDocument.Head target = null;
            target = (org.w3.x1999.xhtml.HeadDocument.Head)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "head" element
     */
    public void setHead(org.w3.x1999.xhtml.HeadDocument.Head head)
    {
        generatedSetterHelperImpl(head, HEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "head" element
     */
    public org.w3.x1999.xhtml.HeadDocument.Head addNewHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.HeadDocument.Head target = null;
            target = (org.w3.x1999.xhtml.HeadDocument.Head)get_store().add_element_user(HEAD$0);
            return target;
        }
    }
    /**
     * An XML head(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class HeadImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.HeadDocument.Head
    {
        private static final long serialVersionUID = 1L;
        
        public HeadImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCRIPT$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "script");
        private static final javax.xml.namespace.QName STYLE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "style");
        private static final javax.xml.namespace.QName META$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "meta");
        private static final javax.xml.namespace.QName LINK$6 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "link");
        private static final javax.xml.namespace.QName OBJECT$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "object");
        private static final javax.xml.namespace.QName TITLE$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "title");
        private static final javax.xml.namespace.QName BASE$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "base");
        private static final javax.xml.namespace.QName LANG$14 = 
            new javax.xml.namespace.QName("", "lang");
        private static final javax.xml.namespace.QName LANG2$16 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName DIR$18 = 
            new javax.xml.namespace.QName("", "dir");
        private static final javax.xml.namespace.QName ID$20 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName PROFILE$22 = 
            new javax.xml.namespace.QName("", "profile");
        
        
        /**
         * Gets array of all "script" elements
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script[] getScriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCRIPT$0, targetList);
                org.w3.x1999.xhtml.ScriptDocument.Script[] result = new org.w3.x1999.xhtml.ScriptDocument.Script[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "script" element
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script getScriptArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "script" element
         */
        public int sizeOfScriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCRIPT$0);
            }
        }
        
        /**
         * Sets array of all "script" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setScriptArray(org.w3.x1999.xhtml.ScriptDocument.Script[] scriptArray)
        {
            check_orphaned();
            arraySetterHelper(scriptArray, SCRIPT$0);
        }
        
        /**
         * Sets ith "script" element
         */
        public void setScriptArray(int i, org.w3.x1999.xhtml.ScriptDocument.Script script)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(script);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "script" element
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script insertNewScript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().insert_element_user(SCRIPT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "script" element
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script addNewScript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ScriptDocument.Script target = null;
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().add_element_user(SCRIPT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "script" element
         */
        public void removeScript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCRIPT$0, i);
            }
        }
        
        /**
         * Gets array of all "style" elements
         */
        public org.w3.x1999.xhtml.StyleDocument.Style[] getStyleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STYLE$2, targetList);
                org.w3.x1999.xhtml.StyleDocument.Style[] result = new org.w3.x1999.xhtml.StyleDocument.Style[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "style" element
         */
        public org.w3.x1999.xhtml.StyleDocument.Style getStyleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleDocument.Style target = null;
                target = (org.w3.x1999.xhtml.StyleDocument.Style)get_store().find_element_user(STYLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "style" element
         */
        public int sizeOfStyleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STYLE$2);
            }
        }
        
        /**
         * Sets array of all "style" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStyleArray(org.w3.x1999.xhtml.StyleDocument.Style[] styleArray)
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$2);
        }
        
        /**
         * Sets ith "style" element
         */
        public void setStyleArray(int i, org.w3.x1999.xhtml.StyleDocument.Style style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleDocument.Style target = null;
                target = (org.w3.x1999.xhtml.StyleDocument.Style)get_store().find_element_user(STYLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(style);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "style" element
         */
        public org.w3.x1999.xhtml.StyleDocument.Style insertNewStyle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleDocument.Style target = null;
                target = (org.w3.x1999.xhtml.StyleDocument.Style)get_store().insert_element_user(STYLE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "style" element
         */
        public org.w3.x1999.xhtml.StyleDocument.Style addNewStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleDocument.Style target = null;
                target = (org.w3.x1999.xhtml.StyleDocument.Style)get_store().add_element_user(STYLE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "style" element
         */
        public void removeStyle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STYLE$2, i);
            }
        }
        
        /**
         * Gets array of all "meta" elements
         */
        public org.w3.x1999.xhtml.MetaDocument.Meta[] getMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(META$4, targetList);
                org.w3.x1999.xhtml.MetaDocument.Meta[] result = new org.w3.x1999.xhtml.MetaDocument.Meta[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "meta" element
         */
        public org.w3.x1999.xhtml.MetaDocument.Meta getMetaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MetaDocument.Meta target = null;
                target = (org.w3.x1999.xhtml.MetaDocument.Meta)get_store().find_element_user(META$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "meta" element
         */
        public int sizeOfMetaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(META$4);
            }
        }
        
        /**
         * Sets array of all "meta" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMetaArray(org.w3.x1999.xhtml.MetaDocument.Meta[] metaArray)
        {
            check_orphaned();
            arraySetterHelper(metaArray, META$4);
        }
        
        /**
         * Sets ith "meta" element
         */
        public void setMetaArray(int i, org.w3.x1999.xhtml.MetaDocument.Meta meta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MetaDocument.Meta target = null;
                target = (org.w3.x1999.xhtml.MetaDocument.Meta)get_store().find_element_user(META$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(meta);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "meta" element
         */
        public org.w3.x1999.xhtml.MetaDocument.Meta insertNewMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MetaDocument.Meta target = null;
                target = (org.w3.x1999.xhtml.MetaDocument.Meta)get_store().insert_element_user(META$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "meta" element
         */
        public org.w3.x1999.xhtml.MetaDocument.Meta addNewMeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MetaDocument.Meta target = null;
                target = (org.w3.x1999.xhtml.MetaDocument.Meta)get_store().add_element_user(META$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "meta" element
         */
        public void removeMeta(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(META$4, i);
            }
        }
        
        /**
         * Gets array of all "link" elements
         */
        public org.w3.x1999.xhtml.LinkDocument.Link[] getLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINK$6, targetList);
                org.w3.x1999.xhtml.LinkDocument.Link[] result = new org.w3.x1999.xhtml.LinkDocument.Link[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "link" element
         */
        public org.w3.x1999.xhtml.LinkDocument.Link getLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LinkDocument.Link target = null;
                target = (org.w3.x1999.xhtml.LinkDocument.Link)get_store().find_element_user(LINK$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "link" element
         */
        public int sizeOfLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$6);
            }
        }
        
        /**
         * Sets array of all "link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkArray(org.w3.x1999.xhtml.LinkDocument.Link[] linkArray)
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$6);
        }
        
        /**
         * Sets ith "link" element
         */
        public void setLinkArray(int i, org.w3.x1999.xhtml.LinkDocument.Link link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LinkDocument.Link target = null;
                target = (org.w3.x1999.xhtml.LinkDocument.Link)get_store().find_element_user(LINK$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(link);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "link" element
         */
        public org.w3.x1999.xhtml.LinkDocument.Link insertNewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LinkDocument.Link target = null;
                target = (org.w3.x1999.xhtml.LinkDocument.Link)get_store().insert_element_user(LINK$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "link" element
         */
        public org.w3.x1999.xhtml.LinkDocument.Link addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LinkDocument.Link target = null;
                target = (org.w3.x1999.xhtml.LinkDocument.Link)get_store().add_element_user(LINK$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "link" element
         */
        public void removeLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$6, i);
            }
        }
        
        /**
         * Gets array of all "object" elements
         */
        public org.w3.x1999.xhtml.ObjectDocument.Object[] getObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OBJECT$8, targetList);
                org.w3.x1999.xhtml.ObjectDocument.Object[] result = new org.w3.x1999.xhtml.ObjectDocument.Object[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "object" element
         */
        public org.w3.x1999.xhtml.ObjectDocument.Object getObjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ObjectDocument.Object target = null;
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().find_element_user(OBJECT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "object" element
         */
        public int sizeOfObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECT$8);
            }
        }
        
        /**
         * Sets array of all "object" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setObjectArray(org.w3.x1999.xhtml.ObjectDocument.Object[] objectArray)
        {
            check_orphaned();
            arraySetterHelper(objectArray, OBJECT$8);
        }
        
        /**
         * Sets ith "object" element
         */
        public void setObjectArray(int i, org.w3.x1999.xhtml.ObjectDocument.Object object)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ObjectDocument.Object target = null;
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().find_element_user(OBJECT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(object);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "object" element
         */
        public org.w3.x1999.xhtml.ObjectDocument.Object insertNewObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ObjectDocument.Object target = null;
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().insert_element_user(OBJECT$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "object" element
         */
        public org.w3.x1999.xhtml.ObjectDocument.Object addNewObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ObjectDocument.Object target = null;
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().add_element_user(OBJECT$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "object" element
         */
        public void removeObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECT$8, i);
            }
        }
        
        /**
         * Gets the "title" element
         */
        public org.w3.x1999.xhtml.TitleDocument.Title getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TitleDocument.Title target = null;
                target = (org.w3.x1999.xhtml.TitleDocument.Title)get_store().find_element_user(TITLE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$10) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(org.w3.x1999.xhtml.TitleDocument.Title title)
        {
            generatedSetterHelperImpl(title, TITLE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "title" element
         */
        public org.w3.x1999.xhtml.TitleDocument.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TitleDocument.Title target = null;
                target = (org.w3.x1999.xhtml.TitleDocument.Title)get_store().add_element_user(TITLE$10);
                return target;
            }
        }
        
        /**
         * Unsets the "title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$10, 0);
            }
        }
        
        /**
         * Gets the "base" element
         */
        public org.w3.x1999.xhtml.BaseDocument.Base getBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BaseDocument.Base target = null;
                target = (org.w3.x1999.xhtml.BaseDocument.Base)get_store().find_element_user(BASE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "base" element
         */
        public boolean isSetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASE$12) != 0;
            }
        }
        
        /**
         * Sets the "base" element
         */
        public void setBase(org.w3.x1999.xhtml.BaseDocument.Base base)
        {
            generatedSetterHelperImpl(base, BASE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.w3.x1999.xhtml.BaseDocument.Base)get_store().add_element_user(BASE$12);
                return target;
            }
        }
        
        /**
         * Unsets the "base" element
         */
        public void unsetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASE$12, 0);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.w3.x1999.xhtml.LanguageCode xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LanguageCode target = null;
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$14);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$14) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$14);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.w3.x1999.xhtml.LanguageCode lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LanguageCode target = null;
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$14);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.LanguageCode)get_store().add_attribute_user(LANG$14);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$14);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$16);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG2$16) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang2(java.lang.String lang2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG2$16);
                }
                target.setStringValue(lang2);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang2(org.apache.xmlbeans.XmlLanguage lang2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG2$16);
                }
                target.set(lang2);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG2$16);
            }
        }
        
        /**
         * Gets the "dir" attribute
         */
        public org.w3.x1999.xhtml.HeadDocument.Head.Dir.Enum getDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$18);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.HeadDocument.Head.Dir.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        public org.w3.x1999.xhtml.HeadDocument.Head.Dir xgetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HeadDocument.Head.Dir target = null;
                target = (org.w3.x1999.xhtml.HeadDocument.Head.Dir)get_store().find_attribute_user(DIR$18);
                return target;
            }
        }
        
        /**
         * True if has "dir" attribute
         */
        public boolean isSetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIR$18) != null;
            }
        }
        
        /**
         * Sets the "dir" attribute
         */
        public void setDir(org.w3.x1999.xhtml.HeadDocument.Head.Dir.Enum dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$18);
                }
                target.setEnumValue(dir);
            }
        }
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        public void xsetDir(org.w3.x1999.xhtml.HeadDocument.Head.Dir dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HeadDocument.Head.Dir target = null;
                target = (org.w3.x1999.xhtml.HeadDocument.Head.Dir)get_store().find_attribute_user(DIR$18);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.HeadDocument.Head.Dir)get_store().add_attribute_user(DIR$18);
                }
                target.set(dir);
            }
        }
        
        /**
         * Unsets the "dir" attribute
         */
        public void unsetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIR$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
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
                return get_store().find_attribute_user(ID$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$20);
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
                get_store().remove_attribute(ID$20);
            }
        }
        
        /**
         * Gets the "profile" attribute
         */
        public java.lang.String getProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "profile" attribute
         */
        public org.w3.x1999.xhtml.URI xgetProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.URI target = null;
                target = (org.w3.x1999.xhtml.URI)get_store().find_attribute_user(PROFILE$22);
                return target;
            }
        }
        
        /**
         * True if has "profile" attribute
         */
        public boolean isSetProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROFILE$22) != null;
            }
        }
        
        /**
         * Sets the "profile" attribute
         */
        public void setProfile(java.lang.String profile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROFILE$22);
                }
                target.setStringValue(profile);
            }
        }
        
        /**
         * Sets (as xml) the "profile" attribute
         */
        public void xsetProfile(org.w3.x1999.xhtml.URI profile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.URI target = null;
                target = (org.w3.x1999.xhtml.URI)get_store().find_attribute_user(PROFILE$22);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.URI)get_store().add_attribute_user(PROFILE$22);
                }
                target.set(profile);
            }
        }
        
        /**
         * Unsets the "profile" attribute
         */
        public void unsetProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROFILE$22);
            }
        }
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.HeadDocument$Head$Dir.
         */
        public static class DirImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.HeadDocument.Head.Dir
        {
            private static final long serialVersionUID = 1L;
            
            public DirImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DirImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
