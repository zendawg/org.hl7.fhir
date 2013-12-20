/*
 * An XML document type.
 * Localname: textarea
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.TextareaDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one textarea(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class TextareaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.TextareaDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextareaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTAREA$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "textarea");
    
    
    /**
     * Gets the "textarea" element
     */
    public org.w3.x1999.xhtml.TextareaDocument.Textarea getTextarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
            target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().find_element_user(TEXTAREA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "textarea" element
     */
    public void setTextarea(org.w3.x1999.xhtml.TextareaDocument.Textarea textarea)
    {
        generatedSetterHelperImpl(textarea, TEXTAREA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "textarea" element
     */
    public org.w3.x1999.xhtml.TextareaDocument.Textarea addNewTextarea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
            target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().add_element_user(TEXTAREA$0);
            return target;
        }
    }
    /**
     * An XML textarea(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class TextareaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.TextareaDocument.Textarea
    {
        private static final long serialVersionUID = 1L;
        
        public TextareaImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$2 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName STYLE$4 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName TITLE$6 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName LANG$8 = 
            new javax.xml.namespace.QName("", "lang");
        private static final javax.xml.namespace.QName LANG2$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName DIR$12 = 
            new javax.xml.namespace.QName("", "dir");
        private static final javax.xml.namespace.QName ONCLICK$14 = 
            new javax.xml.namespace.QName("", "onclick");
        private static final javax.xml.namespace.QName ONDBLCLICK$16 = 
            new javax.xml.namespace.QName("", "ondblclick");
        private static final javax.xml.namespace.QName ONMOUSEDOWN$18 = 
            new javax.xml.namespace.QName("", "onmousedown");
        private static final javax.xml.namespace.QName ONMOUSEUP$20 = 
            new javax.xml.namespace.QName("", "onmouseup");
        private static final javax.xml.namespace.QName ONMOUSEOVER$22 = 
            new javax.xml.namespace.QName("", "onmouseover");
        private static final javax.xml.namespace.QName ONMOUSEMOVE$24 = 
            new javax.xml.namespace.QName("", "onmousemove");
        private static final javax.xml.namespace.QName ONMOUSEOUT$26 = 
            new javax.xml.namespace.QName("", "onmouseout");
        private static final javax.xml.namespace.QName ONKEYPRESS$28 = 
            new javax.xml.namespace.QName("", "onkeypress");
        private static final javax.xml.namespace.QName ONKEYDOWN$30 = 
            new javax.xml.namespace.QName("", "onkeydown");
        private static final javax.xml.namespace.QName ONKEYUP$32 = 
            new javax.xml.namespace.QName("", "onkeyup");
        private static final javax.xml.namespace.QName ACCESSKEY$34 = 
            new javax.xml.namespace.QName("", "accesskey");
        private static final javax.xml.namespace.QName TABINDEX$36 = 
            new javax.xml.namespace.QName("", "tabindex");
        private static final javax.xml.namespace.QName ONFOCUS$38 = 
            new javax.xml.namespace.QName("", "onfocus");
        private static final javax.xml.namespace.QName ONBLUR$40 = 
            new javax.xml.namespace.QName("", "onblur");
        private static final javax.xml.namespace.QName NAME$42 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ROWS$44 = 
            new javax.xml.namespace.QName("", "rows");
        private static final javax.xml.namespace.QName COLS$46 = 
            new javax.xml.namespace.QName("", "cols");
        private static final javax.xml.namespace.QName DISABLED$48 = 
            new javax.xml.namespace.QName("", "disabled");
        private static final javax.xml.namespace.QName READONLY$50 = 
            new javax.xml.namespace.QName("", "readonly");
        private static final javax.xml.namespace.QName ONSELECT$52 = 
            new javax.xml.namespace.QName("", "onselect");
        private static final javax.xml.namespace.QName ONCHANGE$54 = 
            new javax.xml.namespace.QName("", "onchange");
        
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
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
                return get_store().find_attribute_user(ID$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
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
                get_store().remove_attribute(ID$0);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.util.List getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKENS xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKENS target = null;
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(CLASS1$2);
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$2) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.util.List class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$2);
                }
                target.setListValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.apache.xmlbeans.XmlNMTOKENS class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKENS target = null;
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(CLASS1$2);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$2);
            }
        }
        
        /**
         * Gets the "style" attribute
         */
        public java.lang.String getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "style" attribute
         */
        public org.w3.x1999.xhtml.StyleSheet xgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleSheet target = null;
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$4);
                return target;
            }
        }
        
        /**
         * True if has "style" attribute
         */
        public boolean isSetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STYLE$4) != null;
            }
        }
        
        /**
         * Sets the "style" attribute
         */
        public void setStyle(java.lang.String style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$4);
                }
                target.setStringValue(style);
            }
        }
        
        /**
         * Sets (as xml) the "style" attribute
         */
        public void xsetStyle(org.w3.x1999.xhtml.StyleSheet style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StyleSheet target = null;
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$4);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.StyleSheet)get_store().add_attribute_user(STYLE$4);
                }
                target.set(style);
            }
        }
        
        /**
         * Unsets the "style" attribute
         */
        public void unsetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STYLE$4);
            }
        }
        
        /**
         * Gets the "title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" attribute
         */
        public org.w3.x1999.xhtml.Text xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Text target = null;
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$6);
                return target;
            }
        }
        
        /**
         * True if has "title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$6) != null;
            }
        }
        
        /**
         * Sets the "title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$6);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" attribute
         */
        public void xsetTitle(org.w3.x1999.xhtml.Text title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Text target = null;
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Text)get_store().add_attribute_user(TITLE$6);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$8);
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
                return get_store().find_attribute_user(LANG$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$8);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$8);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.LanguageCode)get_store().add_attribute_user(LANG$8);
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
                get_store().remove_attribute(LANG$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$10);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$10);
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
                return get_store().find_attribute_user(LANG2$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG2$10);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG2$10);
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
                get_store().remove_attribute(LANG2$10);
            }
        }
        
        /**
         * Gets the "dir" attribute
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir.Enum getDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$12);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir xgetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir)get_store().find_attribute_user(DIR$12);
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
                return get_store().find_attribute_user(DIR$12) != null;
            }
        }
        
        /**
         * Sets the "dir" attribute
         */
        public void setDir(org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir.Enum dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$12);
                }
                target.setEnumValue(dir);
            }
        }
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        public void xsetDir(org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir)get_store().find_attribute_user(DIR$12);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir)get_store().add_attribute_user(DIR$12);
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
                get_store().remove_attribute(DIR$12);
            }
        }
        
        /**
         * Gets the "onclick" attribute
         */
        public java.lang.String getOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onclick" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$14);
                return target;
            }
        }
        
        /**
         * True if has "onclick" attribute
         */
        public boolean isSetOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONCLICK$14) != null;
            }
        }
        
        /**
         * Sets the "onclick" attribute
         */
        public void setOnclick(java.lang.String onclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONCLICK$14);
                }
                target.setStringValue(onclick);
            }
        }
        
        /**
         * Sets (as xml) the "onclick" attribute
         */
        public void xsetOnclick(org.w3.x1999.xhtml.Script onclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$14);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONCLICK$14);
                }
                target.set(onclick);
            }
        }
        
        /**
         * Unsets the "onclick" attribute
         */
        public void unsetOnclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONCLICK$14);
            }
        }
        
        /**
         * Gets the "ondblclick" attribute
         */
        public java.lang.String getOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ondblclick" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$16);
                return target;
            }
        }
        
        /**
         * True if has "ondblclick" attribute
         */
        public boolean isSetOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONDBLCLICK$16) != null;
            }
        }
        
        /**
         * Sets the "ondblclick" attribute
         */
        public void setOndblclick(java.lang.String ondblclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONDBLCLICK$16);
                }
                target.setStringValue(ondblclick);
            }
        }
        
        /**
         * Sets (as xml) the "ondblclick" attribute
         */
        public void xsetOndblclick(org.w3.x1999.xhtml.Script ondblclick)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$16);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONDBLCLICK$16);
                }
                target.set(ondblclick);
            }
        }
        
        /**
         * Unsets the "ondblclick" attribute
         */
        public void unsetOndblclick()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONDBLCLICK$16);
            }
        }
        
        /**
         * Gets the "onmousedown" attribute
         */
        public java.lang.String getOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmousedown" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$18);
                return target;
            }
        }
        
        /**
         * True if has "onmousedown" attribute
         */
        public boolean isSetOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEDOWN$18) != null;
            }
        }
        
        /**
         * Sets the "onmousedown" attribute
         */
        public void setOnmousedown(java.lang.String onmousedown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEDOWN$18);
                }
                target.setStringValue(onmousedown);
            }
        }
        
        /**
         * Sets (as xml) the "onmousedown" attribute
         */
        public void xsetOnmousedown(org.w3.x1999.xhtml.Script onmousedown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$18);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEDOWN$18);
                }
                target.set(onmousedown);
            }
        }
        
        /**
         * Unsets the "onmousedown" attribute
         */
        public void unsetOnmousedown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEDOWN$18);
            }
        }
        
        /**
         * Gets the "onmouseup" attribute
         */
        public java.lang.String getOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmouseup" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$20);
                return target;
            }
        }
        
        /**
         * True if has "onmouseup" attribute
         */
        public boolean isSetOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEUP$20) != null;
            }
        }
        
        /**
         * Sets the "onmouseup" attribute
         */
        public void setOnmouseup(java.lang.String onmouseup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEUP$20);
                }
                target.setStringValue(onmouseup);
            }
        }
        
        /**
         * Sets (as xml) the "onmouseup" attribute
         */
        public void xsetOnmouseup(org.w3.x1999.xhtml.Script onmouseup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$20);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEUP$20);
                }
                target.set(onmouseup);
            }
        }
        
        /**
         * Unsets the "onmouseup" attribute
         */
        public void unsetOnmouseup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEUP$20);
            }
        }
        
        /**
         * Gets the "onmouseover" attribute
         */
        public java.lang.String getOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmouseover" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$22);
                return target;
            }
        }
        
        /**
         * True if has "onmouseover" attribute
         */
        public boolean isSetOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEOVER$22) != null;
            }
        }
        
        /**
         * Sets the "onmouseover" attribute
         */
        public void setOnmouseover(java.lang.String onmouseover)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOVER$22);
                }
                target.setStringValue(onmouseover);
            }
        }
        
        /**
         * Sets (as xml) the "onmouseover" attribute
         */
        public void xsetOnmouseover(org.w3.x1999.xhtml.Script onmouseover)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$22);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOVER$22);
                }
                target.set(onmouseover);
            }
        }
        
        /**
         * Unsets the "onmouseover" attribute
         */
        public void unsetOnmouseover()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEOVER$22);
            }
        }
        
        /**
         * Gets the "onmousemove" attribute
         */
        public java.lang.String getOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmousemove" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$24);
                return target;
            }
        }
        
        /**
         * True if has "onmousemove" attribute
         */
        public boolean isSetOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEMOVE$24) != null;
            }
        }
        
        /**
         * Sets the "onmousemove" attribute
         */
        public void setOnmousemove(java.lang.String onmousemove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEMOVE$24);
                }
                target.setStringValue(onmousemove);
            }
        }
        
        /**
         * Sets (as xml) the "onmousemove" attribute
         */
        public void xsetOnmousemove(org.w3.x1999.xhtml.Script onmousemove)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$24);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEMOVE$24);
                }
                target.set(onmousemove);
            }
        }
        
        /**
         * Unsets the "onmousemove" attribute
         */
        public void unsetOnmousemove()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEMOVE$24);
            }
        }
        
        /**
         * Gets the "onmouseout" attribute
         */
        public java.lang.String getOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onmouseout" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$26);
                return target;
            }
        }
        
        /**
         * True if has "onmouseout" attribute
         */
        public boolean isSetOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONMOUSEOUT$26) != null;
            }
        }
        
        /**
         * Sets the "onmouseout" attribute
         */
        public void setOnmouseout(java.lang.String onmouseout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOUT$26);
                }
                target.setStringValue(onmouseout);
            }
        }
        
        /**
         * Sets (as xml) the "onmouseout" attribute
         */
        public void xsetOnmouseout(org.w3.x1999.xhtml.Script onmouseout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$26);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOUT$26);
                }
                target.set(onmouseout);
            }
        }
        
        /**
         * Unsets the "onmouseout" attribute
         */
        public void unsetOnmouseout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONMOUSEOUT$26);
            }
        }
        
        /**
         * Gets the "onkeypress" attribute
         */
        public java.lang.String getOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onkeypress" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$28);
                return target;
            }
        }
        
        /**
         * True if has "onkeypress" attribute
         */
        public boolean isSetOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONKEYPRESS$28) != null;
            }
        }
        
        /**
         * Sets the "onkeypress" attribute
         */
        public void setOnkeypress(java.lang.String onkeypress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYPRESS$28);
                }
                target.setStringValue(onkeypress);
            }
        }
        
        /**
         * Sets (as xml) the "onkeypress" attribute
         */
        public void xsetOnkeypress(org.w3.x1999.xhtml.Script onkeypress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$28);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYPRESS$28);
                }
                target.set(onkeypress);
            }
        }
        
        /**
         * Unsets the "onkeypress" attribute
         */
        public void unsetOnkeypress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONKEYPRESS$28);
            }
        }
        
        /**
         * Gets the "onkeydown" attribute
         */
        public java.lang.String getOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onkeydown" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$30);
                return target;
            }
        }
        
        /**
         * True if has "onkeydown" attribute
         */
        public boolean isSetOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONKEYDOWN$30) != null;
            }
        }
        
        /**
         * Sets the "onkeydown" attribute
         */
        public void setOnkeydown(java.lang.String onkeydown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYDOWN$30);
                }
                target.setStringValue(onkeydown);
            }
        }
        
        /**
         * Sets (as xml) the "onkeydown" attribute
         */
        public void xsetOnkeydown(org.w3.x1999.xhtml.Script onkeydown)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$30);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYDOWN$30);
                }
                target.set(onkeydown);
            }
        }
        
        /**
         * Unsets the "onkeydown" attribute
         */
        public void unsetOnkeydown()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONKEYDOWN$30);
            }
        }
        
        /**
         * Gets the "onkeyup" attribute
         */
        public java.lang.String getOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onkeyup" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$32);
                return target;
            }
        }
        
        /**
         * True if has "onkeyup" attribute
         */
        public boolean isSetOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONKEYUP$32) != null;
            }
        }
        
        /**
         * Sets the "onkeyup" attribute
         */
        public void setOnkeyup(java.lang.String onkeyup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYUP$32);
                }
                target.setStringValue(onkeyup);
            }
        }
        
        /**
         * Sets (as xml) the "onkeyup" attribute
         */
        public void xsetOnkeyup(org.w3.x1999.xhtml.Script onkeyup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$32);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYUP$32);
                }
                target.set(onkeyup);
            }
        }
        
        /**
         * Unsets the "onkeyup" attribute
         */
        public void unsetOnkeyup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONKEYUP$32);
            }
        }
        
        /**
         * Gets the "accesskey" attribute
         */
        public java.lang.String getAccesskey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESSKEY$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "accesskey" attribute
         */
        public org.w3.x1999.xhtml.Character xgetAccesskey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Character target = null;
                target = (org.w3.x1999.xhtml.Character)get_store().find_attribute_user(ACCESSKEY$34);
                return target;
            }
        }
        
        /**
         * True if has "accesskey" attribute
         */
        public boolean isSetAccesskey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ACCESSKEY$34) != null;
            }
        }
        
        /**
         * Sets the "accesskey" attribute
         */
        public void setAccesskey(java.lang.String accesskey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESSKEY$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCESSKEY$34);
                }
                target.setStringValue(accesskey);
            }
        }
        
        /**
         * Sets (as xml) the "accesskey" attribute
         */
        public void xsetAccesskey(org.w3.x1999.xhtml.Character accesskey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Character target = null;
                target = (org.w3.x1999.xhtml.Character)get_store().find_attribute_user(ACCESSKEY$34);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Character)get_store().add_attribute_user(ACCESSKEY$34);
                }
                target.set(accesskey);
            }
        }
        
        /**
         * Unsets the "accesskey" attribute
         */
        public void unsetAccesskey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ACCESSKEY$34);
            }
        }
        
        /**
         * Gets the "tabindex" attribute
         */
        public int getTabindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABINDEX$36);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "tabindex" attribute
         */
        public org.w3.x1999.xhtml.TabindexNumber xgetTabindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TabindexNumber target = null;
                target = (org.w3.x1999.xhtml.TabindexNumber)get_store().find_attribute_user(TABINDEX$36);
                return target;
            }
        }
        
        /**
         * True if has "tabindex" attribute
         */
        public boolean isSetTabindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TABINDEX$36) != null;
            }
        }
        
        /**
         * Sets the "tabindex" attribute
         */
        public void setTabindex(int tabindex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABINDEX$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABINDEX$36);
                }
                target.setIntValue(tabindex);
            }
        }
        
        /**
         * Sets (as xml) the "tabindex" attribute
         */
        public void xsetTabindex(org.w3.x1999.xhtml.TabindexNumber tabindex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TabindexNumber target = null;
                target = (org.w3.x1999.xhtml.TabindexNumber)get_store().find_attribute_user(TABINDEX$36);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.TabindexNumber)get_store().add_attribute_user(TABINDEX$36);
                }
                target.set(tabindex);
            }
        }
        
        /**
         * Unsets the "tabindex" attribute
         */
        public void unsetTabindex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TABINDEX$36);
            }
        }
        
        /**
         * Gets the "onfocus" attribute
         */
        public java.lang.String getOnfocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONFOCUS$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onfocus" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnfocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONFOCUS$38);
                return target;
            }
        }
        
        /**
         * True if has "onfocus" attribute
         */
        public boolean isSetOnfocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONFOCUS$38) != null;
            }
        }
        
        /**
         * Sets the "onfocus" attribute
         */
        public void setOnfocus(java.lang.String onfocus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONFOCUS$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONFOCUS$38);
                }
                target.setStringValue(onfocus);
            }
        }
        
        /**
         * Sets (as xml) the "onfocus" attribute
         */
        public void xsetOnfocus(org.w3.x1999.xhtml.Script onfocus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONFOCUS$38);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONFOCUS$38);
                }
                target.set(onfocus);
            }
        }
        
        /**
         * Unsets the "onfocus" attribute
         */
        public void unsetOnfocus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONFOCUS$38);
            }
        }
        
        /**
         * Gets the "onblur" attribute
         */
        public java.lang.String getOnblur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONBLUR$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onblur" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnblur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONBLUR$40);
                return target;
            }
        }
        
        /**
         * True if has "onblur" attribute
         */
        public boolean isSetOnblur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONBLUR$40) != null;
            }
        }
        
        /**
         * Sets the "onblur" attribute
         */
        public void setOnblur(java.lang.String onblur)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONBLUR$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONBLUR$40);
                }
                target.setStringValue(onblur);
            }
        }
        
        /**
         * Sets (as xml) the "onblur" attribute
         */
        public void xsetOnblur(org.w3.x1999.xhtml.Script onblur)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONBLUR$40);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONBLUR$40);
                }
                target.set(onblur);
            }
        }
        
        /**
         * Unsets the "onblur" attribute
         */
        public void unsetOnblur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONBLUR$40);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(NAME$42);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$42) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(org.apache.xmlbeans.XmlAnySimpleType name)
        {
            generatedSetterHelperImpl(name, NAME$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(NAME$42);
                return target;
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$42);
            }
        }
        
        /**
         * Gets the "rows" attribute
         */
        public java.math.BigInteger getRows()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWS$44);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "rows" attribute
         */
        public org.w3.x1999.xhtml.Number xgetRows()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Number target = null;
                target = (org.w3.x1999.xhtml.Number)get_store().find_attribute_user(ROWS$44);
                return target;
            }
        }
        
        /**
         * Sets the "rows" attribute
         */
        public void setRows(java.math.BigInteger rows)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWS$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWS$44);
                }
                target.setBigIntegerValue(rows);
            }
        }
        
        /**
         * Sets (as xml) the "rows" attribute
         */
        public void xsetRows(org.w3.x1999.xhtml.Number rows)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Number target = null;
                target = (org.w3.x1999.xhtml.Number)get_store().find_attribute_user(ROWS$44);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Number)get_store().add_attribute_user(ROWS$44);
                }
                target.set(rows);
            }
        }
        
        /**
         * Gets the "cols" attribute
         */
        public java.math.BigInteger getCols()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLS$46);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "cols" attribute
         */
        public org.w3.x1999.xhtml.Number xgetCols()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Number target = null;
                target = (org.w3.x1999.xhtml.Number)get_store().find_attribute_user(COLS$46);
                return target;
            }
        }
        
        /**
         * Sets the "cols" attribute
         */
        public void setCols(java.math.BigInteger cols)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLS$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLS$46);
                }
                target.setBigIntegerValue(cols);
            }
        }
        
        /**
         * Sets (as xml) the "cols" attribute
         */
        public void xsetCols(org.w3.x1999.xhtml.Number cols)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Number target = null;
                target = (org.w3.x1999.xhtml.Number)get_store().find_attribute_user(COLS$46);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Number)get_store().add_attribute_user(COLS$46);
                }
                target.set(cols);
            }
        }
        
        /**
         * Gets the "disabled" attribute
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled.Enum getDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$48);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "disabled" attribute
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled xgetDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled)get_store().find_attribute_user(DISABLED$48);
                return target;
            }
        }
        
        /**
         * True if has "disabled" attribute
         */
        public boolean isSetDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISABLED$48) != null;
            }
        }
        
        /**
         * Sets the "disabled" attribute
         */
        public void setDisabled(org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled.Enum disabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$48);
                }
                target.setEnumValue(disabled);
            }
        }
        
        /**
         * Sets (as xml) the "disabled" attribute
         */
        public void xsetDisabled(org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled disabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled)get_store().find_attribute_user(DISABLED$48);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled)get_store().add_attribute_user(DISABLED$48);
                }
                target.set(disabled);
            }
        }
        
        /**
         * Unsets the "disabled" attribute
         */
        public void unsetDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISABLED$48);
            }
        }
        
        /**
         * Gets the "readonly" attribute
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly.Enum getReadonly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$50);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "readonly" attribute
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly xgetReadonly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly)get_store().find_attribute_user(READONLY$50);
                return target;
            }
        }
        
        /**
         * True if has "readonly" attribute
         */
        public boolean isSetReadonly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(READONLY$50) != null;
            }
        }
        
        /**
         * Sets the "readonly" attribute
         */
        public void setReadonly(org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly.Enum readonly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READONLY$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READONLY$50);
                }
                target.setEnumValue(readonly);
            }
        }
        
        /**
         * Sets (as xml) the "readonly" attribute
         */
        public void xsetReadonly(org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly readonly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly)get_store().find_attribute_user(READONLY$50);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly)get_store().add_attribute_user(READONLY$50);
                }
                target.set(readonly);
            }
        }
        
        /**
         * Unsets the "readonly" attribute
         */
        public void unsetReadonly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(READONLY$50);
            }
        }
        
        /**
         * Gets the "onselect" attribute
         */
        public java.lang.String getOnselect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONSELECT$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onselect" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnselect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONSELECT$52);
                return target;
            }
        }
        
        /**
         * True if has "onselect" attribute
         */
        public boolean isSetOnselect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONSELECT$52) != null;
            }
        }
        
        /**
         * Sets the "onselect" attribute
         */
        public void setOnselect(java.lang.String onselect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONSELECT$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONSELECT$52);
                }
                target.setStringValue(onselect);
            }
        }
        
        /**
         * Sets (as xml) the "onselect" attribute
         */
        public void xsetOnselect(org.w3.x1999.xhtml.Script onselect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONSELECT$52);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONSELECT$52);
                }
                target.set(onselect);
            }
        }
        
        /**
         * Unsets the "onselect" attribute
         */
        public void unsetOnselect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONSELECT$52);
            }
        }
        
        /**
         * Gets the "onchange" attribute
         */
        public java.lang.String getOnchange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCHANGE$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "onchange" attribute
         */
        public org.w3.x1999.xhtml.Script xgetOnchange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCHANGE$54);
                return target;
            }
        }
        
        /**
         * True if has "onchange" attribute
         */
        public boolean isSetOnchange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ONCHANGE$54) != null;
            }
        }
        
        /**
         * Sets the "onchange" attribute
         */
        public void setOnchange(java.lang.String onchange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCHANGE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONCHANGE$54);
                }
                target.setStringValue(onchange);
            }
        }
        
        /**
         * Sets (as xml) the "onchange" attribute
         */
        public void xsetOnchange(org.w3.x1999.xhtml.Script onchange)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Script target = null;
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCHANGE$54);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONCHANGE$54);
                }
                target.set(onchange);
            }
        }
        
        /**
         * Unsets the "onchange" attribute
         */
        public void unsetOnchange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ONCHANGE$54);
            }
        }
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.TextareaDocument$Textarea$Dir.
         */
        public static class DirImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.TextareaDocument.Textarea.Dir
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
        /**
         * An XML disabled(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.TextareaDocument$Textarea$Disabled.
         */
        public static class DisabledImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.TextareaDocument.Textarea.Disabled
        {
            private static final long serialVersionUID = 1L;
            
            public DisabledImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DisabledImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML readonly(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.TextareaDocument$Textarea$Readonly.
         */
        public static class ReadonlyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.TextareaDocument.Textarea.Readonly
        {
            private static final long serialVersionUID = 1L;
            
            public ReadonlyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ReadonlyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
