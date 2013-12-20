/*
 * An XML document type.
 * Localname: fieldset
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.FieldsetDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one fieldset(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class FieldsetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.FieldsetDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldsetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDSET$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "fieldset");
    
    
    /**
     * Gets the "fieldset" element
     */
    public org.w3.x1999.xhtml.FieldsetDocument.Fieldset getFieldset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
            target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().find_element_user(FIELDSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fieldset" element
     */
    public void setFieldset(org.w3.x1999.xhtml.FieldsetDocument.Fieldset fieldset)
    {
        generatedSetterHelperImpl(fieldset, FIELDSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fieldset" element
     */
    public org.w3.x1999.xhtml.FieldsetDocument.Fieldset addNewFieldset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
            target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().add_element_user(FIELDSET$0);
            return target;
        }
    }
    /**
     * An XML fieldset(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class FieldsetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.FieldsetDocument.Fieldset
    {
        private static final long serialVersionUID = 1L;
        
        public FieldsetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEGEND$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "legend");
        private static final javax.xml.namespace.QName P$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "p");
        private static final javax.xml.namespace.QName H1$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h1");
        private static final javax.xml.namespace.QName H2$6 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h2");
        private static final javax.xml.namespace.QName H3$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h3");
        private static final javax.xml.namespace.QName H4$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h4");
        private static final javax.xml.namespace.QName H5$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h5");
        private static final javax.xml.namespace.QName H6$14 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "h6");
        private static final javax.xml.namespace.QName DIV$16 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "div");
        private static final javax.xml.namespace.QName UL$18 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "ul");
        private static final javax.xml.namespace.QName OL$20 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "ol");
        private static final javax.xml.namespace.QName DL$22 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "dl");
        private static final javax.xml.namespace.QName PRE$24 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "pre");
        private static final javax.xml.namespace.QName HR$26 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "hr");
        private static final javax.xml.namespace.QName BLOCKQUOTE$28 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "blockquote");
        private static final javax.xml.namespace.QName ADDRESS$30 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "address");
        private static final javax.xml.namespace.QName FIELDSET$32 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "fieldset");
        private static final javax.xml.namespace.QName TABLE$34 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "table");
        private static final javax.xml.namespace.QName FORM$36 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "form");
        private static final javax.xml.namespace.QName A$38 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "a");
        private static final javax.xml.namespace.QName BR$40 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "br");
        private static final javax.xml.namespace.QName SPAN$42 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "span");
        private static final javax.xml.namespace.QName BDO$44 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "bdo");
        private static final javax.xml.namespace.QName MAP$46 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "map");
        private static final javax.xml.namespace.QName OBJECT$48 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "object");
        private static final javax.xml.namespace.QName IMG$50 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "img");
        private static final javax.xml.namespace.QName TT$52 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "tt");
        private static final javax.xml.namespace.QName I$54 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "i");
        private static final javax.xml.namespace.QName B$56 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "b");
        private static final javax.xml.namespace.QName BIG$58 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "big");
        private static final javax.xml.namespace.QName SMALL$60 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "small");
        private static final javax.xml.namespace.QName EM$62 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "em");
        private static final javax.xml.namespace.QName STRONG$64 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "strong");
        private static final javax.xml.namespace.QName DFN$66 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "dfn");
        private static final javax.xml.namespace.QName CODE$68 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "code");
        private static final javax.xml.namespace.QName Q$70 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "q");
        private static final javax.xml.namespace.QName SAMP$72 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "samp");
        private static final javax.xml.namespace.QName KBD$74 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "kbd");
        private static final javax.xml.namespace.QName VAR$76 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "var");
        private static final javax.xml.namespace.QName CITE$78 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "cite");
        private static final javax.xml.namespace.QName ABBR$80 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "abbr");
        private static final javax.xml.namespace.QName ACRONYM$82 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "acronym");
        private static final javax.xml.namespace.QName SUB$84 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "sub");
        private static final javax.xml.namespace.QName SUP$86 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "sup");
        private static final javax.xml.namespace.QName INPUT$88 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "input");
        private static final javax.xml.namespace.QName SELECT$90 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "select");
        private static final javax.xml.namespace.QName TEXTAREA$92 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "textarea");
        private static final javax.xml.namespace.QName LABEL$94 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "label");
        private static final javax.xml.namespace.QName BUTTON$96 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "button");
        private static final javax.xml.namespace.QName NOSCRIPT$98 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "noscript");
        private static final javax.xml.namespace.QName INS$100 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "ins");
        private static final javax.xml.namespace.QName DEL$102 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "del");
        private static final javax.xml.namespace.QName SCRIPT$104 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "script");
        private static final javax.xml.namespace.QName ID$106 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$108 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName STYLE$110 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName TITLE$112 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName LANG$114 = 
            new javax.xml.namespace.QName("", "lang");
        private static final javax.xml.namespace.QName LANG2$116 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName DIR$118 = 
            new javax.xml.namespace.QName("", "dir");
        private static final javax.xml.namespace.QName ONCLICK$120 = 
            new javax.xml.namespace.QName("", "onclick");
        private static final javax.xml.namespace.QName ONDBLCLICK$122 = 
            new javax.xml.namespace.QName("", "ondblclick");
        private static final javax.xml.namespace.QName ONMOUSEDOWN$124 = 
            new javax.xml.namespace.QName("", "onmousedown");
        private static final javax.xml.namespace.QName ONMOUSEUP$126 = 
            new javax.xml.namespace.QName("", "onmouseup");
        private static final javax.xml.namespace.QName ONMOUSEOVER$128 = 
            new javax.xml.namespace.QName("", "onmouseover");
        private static final javax.xml.namespace.QName ONMOUSEMOVE$130 = 
            new javax.xml.namespace.QName("", "onmousemove");
        private static final javax.xml.namespace.QName ONMOUSEOUT$132 = 
            new javax.xml.namespace.QName("", "onmouseout");
        private static final javax.xml.namespace.QName ONKEYPRESS$134 = 
            new javax.xml.namespace.QName("", "onkeypress");
        private static final javax.xml.namespace.QName ONKEYDOWN$136 = 
            new javax.xml.namespace.QName("", "onkeydown");
        private static final javax.xml.namespace.QName ONKEYUP$138 = 
            new javax.xml.namespace.QName("", "onkeyup");
        
        
        /**
         * Gets the "legend" element
         */
        public org.w3.x1999.xhtml.LegendDocument.Legend getLegend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LegendDocument.Legend target = null;
                target = (org.w3.x1999.xhtml.LegendDocument.Legend)get_store().find_element_user(LEGEND$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "legend" element
         */
        public void setLegend(org.w3.x1999.xhtml.LegendDocument.Legend legend)
        {
            generatedSetterHelperImpl(legend, LEGEND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "legend" element
         */
        public org.w3.x1999.xhtml.LegendDocument.Legend addNewLegend()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LegendDocument.Legend target = null;
                target = (org.w3.x1999.xhtml.LegendDocument.Legend)get_store().add_element_user(LEGEND$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "p" elements
         */
        public org.w3.x1999.xhtml.PDocument.P[] getPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(P$2, targetList);
                org.w3.x1999.xhtml.PDocument.P[] result = new org.w3.x1999.xhtml.PDocument.P[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "p" element
         */
        public org.w3.x1999.xhtml.PDocument.P getPArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().find_element_user(P$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "p" element
         */
        public int sizeOfPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(P$2);
            }
        }
        
        /**
         * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPArray(org.w3.x1999.xhtml.PDocument.P[] pArray)
        {
            check_orphaned();
            arraySetterHelper(pArray, P$2);
        }
        
        /**
         * Sets ith "p" element
         */
        public void setPArray(int i, org.w3.x1999.xhtml.PDocument.P p)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().find_element_user(P$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(p);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "p" element
         */
        public org.w3.x1999.xhtml.PDocument.P insertNewP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().insert_element_user(P$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "p" element
         */
        public org.w3.x1999.xhtml.PDocument.P addNewP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PDocument.P target = null;
                target = (org.w3.x1999.xhtml.PDocument.P)get_store().add_element_user(P$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "p" element
         */
        public void removeP(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(P$2, i);
            }
        }
        
        /**
         * Gets array of all "h1" elements
         */
        public org.w3.x1999.xhtml.H1Document.H1[] getH1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H1$4, targetList);
                org.w3.x1999.xhtml.H1Document.H1[] result = new org.w3.x1999.xhtml.H1Document.H1[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h1" element
         */
        public org.w3.x1999.xhtml.H1Document.H1 getH1Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().find_element_user(H1$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h1" element
         */
        public int sizeOfH1Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H1$4);
            }
        }
        
        /**
         * Sets array of all "h1" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH1Array(org.w3.x1999.xhtml.H1Document.H1[] h1Array)
        {
            check_orphaned();
            arraySetterHelper(h1Array, H1$4);
        }
        
        /**
         * Sets ith "h1" element
         */
        public void setH1Array(int i, org.w3.x1999.xhtml.H1Document.H1 h1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().find_element_user(H1$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h1);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h1" element
         */
        public org.w3.x1999.xhtml.H1Document.H1 insertNewH1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().insert_element_user(H1$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h1" element
         */
        public org.w3.x1999.xhtml.H1Document.H1 addNewH1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H1Document.H1 target = null;
                target = (org.w3.x1999.xhtml.H1Document.H1)get_store().add_element_user(H1$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "h1" element
         */
        public void removeH1(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H1$4, i);
            }
        }
        
        /**
         * Gets array of all "h2" elements
         */
        public org.w3.x1999.xhtml.H2Document.H2[] getH2Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H2$6, targetList);
                org.w3.x1999.xhtml.H2Document.H2[] result = new org.w3.x1999.xhtml.H2Document.H2[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h2" element
         */
        public org.w3.x1999.xhtml.H2Document.H2 getH2Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().find_element_user(H2$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h2" element
         */
        public int sizeOfH2Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H2$6);
            }
        }
        
        /**
         * Sets array of all "h2" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH2Array(org.w3.x1999.xhtml.H2Document.H2[] h2Array)
        {
            check_orphaned();
            arraySetterHelper(h2Array, H2$6);
        }
        
        /**
         * Sets ith "h2" element
         */
        public void setH2Array(int i, org.w3.x1999.xhtml.H2Document.H2 h2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().find_element_user(H2$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h2);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h2" element
         */
        public org.w3.x1999.xhtml.H2Document.H2 insertNewH2(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().insert_element_user(H2$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h2" element
         */
        public org.w3.x1999.xhtml.H2Document.H2 addNewH2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H2Document.H2 target = null;
                target = (org.w3.x1999.xhtml.H2Document.H2)get_store().add_element_user(H2$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "h2" element
         */
        public void removeH2(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H2$6, i);
            }
        }
        
        /**
         * Gets array of all "h3" elements
         */
        public org.w3.x1999.xhtml.H3Document.H3[] getH3Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H3$8, targetList);
                org.w3.x1999.xhtml.H3Document.H3[] result = new org.w3.x1999.xhtml.H3Document.H3[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h3" element
         */
        public org.w3.x1999.xhtml.H3Document.H3 getH3Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().find_element_user(H3$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h3" element
         */
        public int sizeOfH3Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H3$8);
            }
        }
        
        /**
         * Sets array of all "h3" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH3Array(org.w3.x1999.xhtml.H3Document.H3[] h3Array)
        {
            check_orphaned();
            arraySetterHelper(h3Array, H3$8);
        }
        
        /**
         * Sets ith "h3" element
         */
        public void setH3Array(int i, org.w3.x1999.xhtml.H3Document.H3 h3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().find_element_user(H3$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h3);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h3" element
         */
        public org.w3.x1999.xhtml.H3Document.H3 insertNewH3(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().insert_element_user(H3$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h3" element
         */
        public org.w3.x1999.xhtml.H3Document.H3 addNewH3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H3Document.H3 target = null;
                target = (org.w3.x1999.xhtml.H3Document.H3)get_store().add_element_user(H3$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "h3" element
         */
        public void removeH3(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H3$8, i);
            }
        }
        
        /**
         * Gets array of all "h4" elements
         */
        public org.w3.x1999.xhtml.H4Document.H4[] getH4Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H4$10, targetList);
                org.w3.x1999.xhtml.H4Document.H4[] result = new org.w3.x1999.xhtml.H4Document.H4[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h4" element
         */
        public org.w3.x1999.xhtml.H4Document.H4 getH4Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().find_element_user(H4$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h4" element
         */
        public int sizeOfH4Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H4$10);
            }
        }
        
        /**
         * Sets array of all "h4" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH4Array(org.w3.x1999.xhtml.H4Document.H4[] h4Array)
        {
            check_orphaned();
            arraySetterHelper(h4Array, H4$10);
        }
        
        /**
         * Sets ith "h4" element
         */
        public void setH4Array(int i, org.w3.x1999.xhtml.H4Document.H4 h4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().find_element_user(H4$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h4);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h4" element
         */
        public org.w3.x1999.xhtml.H4Document.H4 insertNewH4(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().insert_element_user(H4$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h4" element
         */
        public org.w3.x1999.xhtml.H4Document.H4 addNewH4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H4Document.H4 target = null;
                target = (org.w3.x1999.xhtml.H4Document.H4)get_store().add_element_user(H4$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "h4" element
         */
        public void removeH4(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H4$10, i);
            }
        }
        
        /**
         * Gets array of all "h5" elements
         */
        public org.w3.x1999.xhtml.H5Document.H5[] getH5Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H5$12, targetList);
                org.w3.x1999.xhtml.H5Document.H5[] result = new org.w3.x1999.xhtml.H5Document.H5[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h5" element
         */
        public org.w3.x1999.xhtml.H5Document.H5 getH5Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().find_element_user(H5$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h5" element
         */
        public int sizeOfH5Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H5$12);
            }
        }
        
        /**
         * Sets array of all "h5" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH5Array(org.w3.x1999.xhtml.H5Document.H5[] h5Array)
        {
            check_orphaned();
            arraySetterHelper(h5Array, H5$12);
        }
        
        /**
         * Sets ith "h5" element
         */
        public void setH5Array(int i, org.w3.x1999.xhtml.H5Document.H5 h5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().find_element_user(H5$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h5);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h5" element
         */
        public org.w3.x1999.xhtml.H5Document.H5 insertNewH5(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().insert_element_user(H5$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h5" element
         */
        public org.w3.x1999.xhtml.H5Document.H5 addNewH5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H5Document.H5 target = null;
                target = (org.w3.x1999.xhtml.H5Document.H5)get_store().add_element_user(H5$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "h5" element
         */
        public void removeH5(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H5$12, i);
            }
        }
        
        /**
         * Gets array of all "h6" elements
         */
        public org.w3.x1999.xhtml.H6Document.H6[] getH6Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(H6$14, targetList);
                org.w3.x1999.xhtml.H6Document.H6[] result = new org.w3.x1999.xhtml.H6Document.H6[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "h6" element
         */
        public org.w3.x1999.xhtml.H6Document.H6 getH6Array(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().find_element_user(H6$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "h6" element
         */
        public int sizeOfH6Array()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(H6$14);
            }
        }
        
        /**
         * Sets array of all "h6" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setH6Array(org.w3.x1999.xhtml.H6Document.H6[] h6Array)
        {
            check_orphaned();
            arraySetterHelper(h6Array, H6$14);
        }
        
        /**
         * Sets ith "h6" element
         */
        public void setH6Array(int i, org.w3.x1999.xhtml.H6Document.H6 h6)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().find_element_user(H6$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(h6);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "h6" element
         */
        public org.w3.x1999.xhtml.H6Document.H6 insertNewH6(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().insert_element_user(H6$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "h6" element
         */
        public org.w3.x1999.xhtml.H6Document.H6 addNewH6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.H6Document.H6 target = null;
                target = (org.w3.x1999.xhtml.H6Document.H6)get_store().add_element_user(H6$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "h6" element
         */
        public void removeH6(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(H6$14, i);
            }
        }
        
        /**
         * Gets array of all "div" elements
         */
        public org.w3.x1999.xhtml.DivDocument.Div[] getDivArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIV$16, targetList);
                org.w3.x1999.xhtml.DivDocument.Div[] result = new org.w3.x1999.xhtml.DivDocument.Div[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "div" element
         */
        public org.w3.x1999.xhtml.DivDocument.Div getDivArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().find_element_user(DIV$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "div" element
         */
        public int sizeOfDivArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIV$16);
            }
        }
        
        /**
         * Sets array of all "div" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDivArray(org.w3.x1999.xhtml.DivDocument.Div[] divArray)
        {
            check_orphaned();
            arraySetterHelper(divArray, DIV$16);
        }
        
        /**
         * Sets ith "div" element
         */
        public void setDivArray(int i, org.w3.x1999.xhtml.DivDocument.Div div)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().find_element_user(DIV$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(div);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "div" element
         */
        public org.w3.x1999.xhtml.DivDocument.Div insertNewDiv(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().insert_element_user(DIV$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "div" element
         */
        public org.w3.x1999.xhtml.DivDocument.Div addNewDiv()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DivDocument.Div target = null;
                target = (org.w3.x1999.xhtml.DivDocument.Div)get_store().add_element_user(DIV$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "div" element
         */
        public void removeDiv(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIV$16, i);
            }
        }
        
        /**
         * Gets array of all "ul" elements
         */
        public org.w3.x1999.xhtml.UlDocument.Ul[] getUlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UL$18, targetList);
                org.w3.x1999.xhtml.UlDocument.Ul[] result = new org.w3.x1999.xhtml.UlDocument.Ul[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ul" element
         */
        public org.w3.x1999.xhtml.UlDocument.Ul getUlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().find_element_user(UL$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ul" element
         */
        public int sizeOfUlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UL$18);
            }
        }
        
        /**
         * Sets array of all "ul" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setUlArray(org.w3.x1999.xhtml.UlDocument.Ul[] ulArray)
        {
            check_orphaned();
            arraySetterHelper(ulArray, UL$18);
        }
        
        /**
         * Sets ith "ul" element
         */
        public void setUlArray(int i, org.w3.x1999.xhtml.UlDocument.Ul ul)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().find_element_user(UL$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ul);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ul" element
         */
        public org.w3.x1999.xhtml.UlDocument.Ul insertNewUl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().insert_element_user(UL$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ul" element
         */
        public org.w3.x1999.xhtml.UlDocument.Ul addNewUl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.UlDocument.Ul target = null;
                target = (org.w3.x1999.xhtml.UlDocument.Ul)get_store().add_element_user(UL$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "ul" element
         */
        public void removeUl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UL$18, i);
            }
        }
        
        /**
         * Gets array of all "ol" elements
         */
        public org.w3.x1999.xhtml.OlDocument.Ol[] getOlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OL$20, targetList);
                org.w3.x1999.xhtml.OlDocument.Ol[] result = new org.w3.x1999.xhtml.OlDocument.Ol[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ol" element
         */
        public org.w3.x1999.xhtml.OlDocument.Ol getOlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().find_element_user(OL$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ol" element
         */
        public int sizeOfOlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OL$20);
            }
        }
        
        /**
         * Sets array of all "ol" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOlArray(org.w3.x1999.xhtml.OlDocument.Ol[] olArray)
        {
            check_orphaned();
            arraySetterHelper(olArray, OL$20);
        }
        
        /**
         * Sets ith "ol" element
         */
        public void setOlArray(int i, org.w3.x1999.xhtml.OlDocument.Ol ol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().find_element_user(OL$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ol);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ol" element
         */
        public org.w3.x1999.xhtml.OlDocument.Ol insertNewOl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().insert_element_user(OL$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ol" element
         */
        public org.w3.x1999.xhtml.OlDocument.Ol addNewOl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.OlDocument.Ol target = null;
                target = (org.w3.x1999.xhtml.OlDocument.Ol)get_store().add_element_user(OL$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "ol" element
         */
        public void removeOl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OL$20, i);
            }
        }
        
        /**
         * Gets array of all "dl" elements
         */
        public org.w3.x1999.xhtml.DlDocument.Dl[] getDlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DL$22, targetList);
                org.w3.x1999.xhtml.DlDocument.Dl[] result = new org.w3.x1999.xhtml.DlDocument.Dl[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dl" element
         */
        public org.w3.x1999.xhtml.DlDocument.Dl getDlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().find_element_user(DL$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dl" element
         */
        public int sizeOfDlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DL$22);
            }
        }
        
        /**
         * Sets array of all "dl" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDlArray(org.w3.x1999.xhtml.DlDocument.Dl[] dlArray)
        {
            check_orphaned();
            arraySetterHelper(dlArray, DL$22);
        }
        
        /**
         * Sets ith "dl" element
         */
        public void setDlArray(int i, org.w3.x1999.xhtml.DlDocument.Dl dl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().find_element_user(DL$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dl);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dl" element
         */
        public org.w3.x1999.xhtml.DlDocument.Dl insertNewDl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().insert_element_user(DL$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dl" element
         */
        public org.w3.x1999.xhtml.DlDocument.Dl addNewDl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DlDocument.Dl target = null;
                target = (org.w3.x1999.xhtml.DlDocument.Dl)get_store().add_element_user(DL$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "dl" element
         */
        public void removeDl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DL$22, i);
            }
        }
        
        /**
         * Gets array of all "pre" elements
         */
        public org.w3.x1999.xhtml.PreDocument.Pre[] getPreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PRE$24, targetList);
                org.w3.x1999.xhtml.PreDocument.Pre[] result = new org.w3.x1999.xhtml.PreDocument.Pre[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "pre" element
         */
        public org.w3.x1999.xhtml.PreDocument.Pre getPreArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().find_element_user(PRE$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "pre" element
         */
        public int sizeOfPreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PRE$24);
            }
        }
        
        /**
         * Sets array of all "pre" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPreArray(org.w3.x1999.xhtml.PreDocument.Pre[] preArray)
        {
            check_orphaned();
            arraySetterHelper(preArray, PRE$24);
        }
        
        /**
         * Sets ith "pre" element
         */
        public void setPreArray(int i, org.w3.x1999.xhtml.PreDocument.Pre pre)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().find_element_user(PRE$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(pre);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pre" element
         */
        public org.w3.x1999.xhtml.PreDocument.Pre insertNewPre(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().insert_element_user(PRE$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pre" element
         */
        public org.w3.x1999.xhtml.PreDocument.Pre addNewPre()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.PreDocument.Pre target = null;
                target = (org.w3.x1999.xhtml.PreDocument.Pre)get_store().add_element_user(PRE$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "pre" element
         */
        public void removePre(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PRE$24, i);
            }
        }
        
        /**
         * Gets array of all "hr" elements
         */
        public org.w3.x1999.xhtml.HrDocument.Hr[] getHrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HR$26, targetList);
                org.w3.x1999.xhtml.HrDocument.Hr[] result = new org.w3.x1999.xhtml.HrDocument.Hr[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "hr" element
         */
        public org.w3.x1999.xhtml.HrDocument.Hr getHrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().find_element_user(HR$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "hr" element
         */
        public int sizeOfHrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HR$26);
            }
        }
        
        /**
         * Sets array of all "hr" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setHrArray(org.w3.x1999.xhtml.HrDocument.Hr[] hrArray)
        {
            check_orphaned();
            arraySetterHelper(hrArray, HR$26);
        }
        
        /**
         * Sets ith "hr" element
         */
        public void setHrArray(int i, org.w3.x1999.xhtml.HrDocument.Hr hr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().find_element_user(HR$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "hr" element
         */
        public org.w3.x1999.xhtml.HrDocument.Hr insertNewHr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().insert_element_user(HR$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hr" element
         */
        public org.w3.x1999.xhtml.HrDocument.Hr addNewHr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.HrDocument.Hr target = null;
                target = (org.w3.x1999.xhtml.HrDocument.Hr)get_store().add_element_user(HR$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "hr" element
         */
        public void removeHr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HR$26, i);
            }
        }
        
        /**
         * Gets array of all "blockquote" elements
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[] getBlockquoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BLOCKQUOTE$28, targetList);
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[] result = new org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "blockquote" element
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote getBlockquoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().find_element_user(BLOCKQUOTE$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "blockquote" element
         */
        public int sizeOfBlockquoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BLOCKQUOTE$28);
            }
        }
        
        /**
         * Sets array of all "blockquote" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBlockquoteArray(org.w3.x1999.xhtml.BlockquoteDocument.Blockquote[] blockquoteArray)
        {
            check_orphaned();
            arraySetterHelper(blockquoteArray, BLOCKQUOTE$28);
        }
        
        /**
         * Sets ith "blockquote" element
         */
        public void setBlockquoteArray(int i, org.w3.x1999.xhtml.BlockquoteDocument.Blockquote blockquote)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().find_element_user(BLOCKQUOTE$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(blockquote);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "blockquote" element
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote insertNewBlockquote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().insert_element_user(BLOCKQUOTE$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "blockquote" element
         */
        public org.w3.x1999.xhtml.BlockquoteDocument.Blockquote addNewBlockquote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BlockquoteDocument.Blockquote target = null;
                target = (org.w3.x1999.xhtml.BlockquoteDocument.Blockquote)get_store().add_element_user(BLOCKQUOTE$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "blockquote" element
         */
        public void removeBlockquote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BLOCKQUOTE$28, i);
            }
        }
        
        /**
         * Gets array of all "address" elements
         */
        public org.w3.x1999.xhtml.AddressDocument.Address[] getAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESS$30, targetList);
                org.w3.x1999.xhtml.AddressDocument.Address[] result = new org.w3.x1999.xhtml.AddressDocument.Address[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "address" element
         */
        public org.w3.x1999.xhtml.AddressDocument.Address getAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().find_element_user(ADDRESS$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "address" element
         */
        public int sizeOfAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$30);
            }
        }
        
        /**
         * Sets array of all "address" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAddressArray(org.w3.x1999.xhtml.AddressDocument.Address[] addressArray)
        {
            check_orphaned();
            arraySetterHelper(addressArray, ADDRESS$30);
        }
        
        /**
         * Sets ith "address" element
         */
        public void setAddressArray(int i, org.w3.x1999.xhtml.AddressDocument.Address address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().find_element_user(ADDRESS$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(address);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "address" element
         */
        public org.w3.x1999.xhtml.AddressDocument.Address insertNewAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().insert_element_user(ADDRESS$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "address" element
         */
        public org.w3.x1999.xhtml.AddressDocument.Address addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AddressDocument.Address target = null;
                target = (org.w3.x1999.xhtml.AddressDocument.Address)get_store().add_element_user(ADDRESS$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "address" element
         */
        public void removeAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$30, i);
            }
        }
        
        /**
         * Gets array of all "fieldset" elements
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset[] getFieldsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDSET$32, targetList);
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset[] result = new org.w3.x1999.xhtml.FieldsetDocument.Fieldset[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fieldset" element
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset getFieldsetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().find_element_user(FIELDSET$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fieldset" element
         */
        public int sizeOfFieldsetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDSET$32);
            }
        }
        
        /**
         * Sets array of all "fieldset" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldsetArray(org.w3.x1999.xhtml.FieldsetDocument.Fieldset[] fieldsetArray)
        {
            check_orphaned();
            arraySetterHelper(fieldsetArray, FIELDSET$32);
        }
        
        /**
         * Sets ith "fieldset" element
         */
        public void setFieldsetArray(int i, org.w3.x1999.xhtml.FieldsetDocument.Fieldset fieldset)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().find_element_user(FIELDSET$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fieldset);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fieldset" element
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset insertNewFieldset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().insert_element_user(FIELDSET$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fieldset" element
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset addNewFieldset()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset)get_store().add_element_user(FIELDSET$32);
                return target;
            }
        }
        
        /**
         * Removes the ith "fieldset" element
         */
        public void removeFieldset(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDSET$32, i);
            }
        }
        
        /**
         * Gets array of all "table" elements
         */
        public org.w3.x1999.xhtml.TableDocument.Table[] getTableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TABLE$34, targetList);
                org.w3.x1999.xhtml.TableDocument.Table[] result = new org.w3.x1999.xhtml.TableDocument.Table[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "table" element
         */
        public org.w3.x1999.xhtml.TableDocument.Table getTableArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().find_element_user(TABLE$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "table" element
         */
        public int sizeOfTableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TABLE$34);
            }
        }
        
        /**
         * Sets array of all "table" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTableArray(org.w3.x1999.xhtml.TableDocument.Table[] tableArray)
        {
            check_orphaned();
            arraySetterHelper(tableArray, TABLE$34);
        }
        
        /**
         * Sets ith "table" element
         */
        public void setTableArray(int i, org.w3.x1999.xhtml.TableDocument.Table table)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().find_element_user(TABLE$34, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(table);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "table" element
         */
        public org.w3.x1999.xhtml.TableDocument.Table insertNewTable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().insert_element_user(TABLE$34, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "table" element
         */
        public org.w3.x1999.xhtml.TableDocument.Table addNewTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().add_element_user(TABLE$34);
                return target;
            }
        }
        
        /**
         * Removes the ith "table" element
         */
        public void removeTable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TABLE$34, i);
            }
        }
        
        /**
         * Gets array of all "form" elements
         */
        public org.w3.x1999.xhtml.FormDocument.Form[] getFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FORM$36, targetList);
                org.w3.x1999.xhtml.FormDocument.Form[] result = new org.w3.x1999.xhtml.FormDocument.Form[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "form" element
         */
        public org.w3.x1999.xhtml.FormDocument.Form getFormArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().find_element_user(FORM$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "form" element
         */
        public int sizeOfFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORM$36);
            }
        }
        
        /**
         * Sets array of all "form" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFormArray(org.w3.x1999.xhtml.FormDocument.Form[] formArray)
        {
            check_orphaned();
            arraySetterHelper(formArray, FORM$36);
        }
        
        /**
         * Sets ith "form" element
         */
        public void setFormArray(int i, org.w3.x1999.xhtml.FormDocument.Form form)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().find_element_user(FORM$36, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(form);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "form" element
         */
        public org.w3.x1999.xhtml.FormDocument.Form insertNewForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().insert_element_user(FORM$36, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "form" element
         */
        public org.w3.x1999.xhtml.FormDocument.Form addNewForm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FormDocument.Form target = null;
                target = (org.w3.x1999.xhtml.FormDocument.Form)get_store().add_element_user(FORM$36);
                return target;
            }
        }
        
        /**
         * Removes the ith "form" element
         */
        public void removeForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORM$36, i);
            }
        }
        
        /**
         * Gets array of all "a" elements
         */
        public org.w3.x1999.xhtml.ADocument.A[] getAArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(A$38, targetList);
                org.w3.x1999.xhtml.ADocument.A[] result = new org.w3.x1999.xhtml.ADocument.A[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "a" element
         */
        public org.w3.x1999.xhtml.ADocument.A getAArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ADocument.A target = null;
                target = (org.w3.x1999.xhtml.ADocument.A)get_store().find_element_user(A$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "a" element
         */
        public int sizeOfAArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(A$38);
            }
        }
        
        /**
         * Sets array of all "a" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAArray(org.w3.x1999.xhtml.ADocument.A[] aArray)
        {
            check_orphaned();
            arraySetterHelper(aArray, A$38);
        }
        
        /**
         * Sets ith "a" element
         */
        public void setAArray(int i, org.w3.x1999.xhtml.ADocument.A a)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ADocument.A target = null;
                target = (org.w3.x1999.xhtml.ADocument.A)get_store().find_element_user(A$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(a);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "a" element
         */
        public org.w3.x1999.xhtml.ADocument.A insertNewA(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ADocument.A target = null;
                target = (org.w3.x1999.xhtml.ADocument.A)get_store().insert_element_user(A$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "a" element
         */
        public org.w3.x1999.xhtml.ADocument.A addNewA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ADocument.A target = null;
                target = (org.w3.x1999.xhtml.ADocument.A)get_store().add_element_user(A$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "a" element
         */
        public void removeA(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(A$38, i);
            }
        }
        
        /**
         * Gets array of all "br" elements
         */
        public org.w3.x1999.xhtml.BrDocument.Br[] getBrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BR$40, targetList);
                org.w3.x1999.xhtml.BrDocument.Br[] result = new org.w3.x1999.xhtml.BrDocument.Br[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "br" element
         */
        public org.w3.x1999.xhtml.BrDocument.Br getBrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BrDocument.Br target = null;
                target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().find_element_user(BR$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "br" element
         */
        public int sizeOfBrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BR$40);
            }
        }
        
        /**
         * Sets array of all "br" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBrArray(org.w3.x1999.xhtml.BrDocument.Br[] brArray)
        {
            check_orphaned();
            arraySetterHelper(brArray, BR$40);
        }
        
        /**
         * Sets ith "br" element
         */
        public void setBrArray(int i, org.w3.x1999.xhtml.BrDocument.Br br)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BrDocument.Br target = null;
                target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().find_element_user(BR$40, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(br);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "br" element
         */
        public org.w3.x1999.xhtml.BrDocument.Br insertNewBr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BrDocument.Br target = null;
                target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().insert_element_user(BR$40, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "br" element
         */
        public org.w3.x1999.xhtml.BrDocument.Br addNewBr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BrDocument.Br target = null;
                target = (org.w3.x1999.xhtml.BrDocument.Br)get_store().add_element_user(BR$40);
                return target;
            }
        }
        
        /**
         * Removes the ith "br" element
         */
        public void removeBr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BR$40, i);
            }
        }
        
        /**
         * Gets array of all "span" elements
         */
        public org.w3.x1999.xhtml.SpanDocument.Span[] getSpanArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPAN$42, targetList);
                org.w3.x1999.xhtml.SpanDocument.Span[] result = new org.w3.x1999.xhtml.SpanDocument.Span[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "span" element
         */
        public org.w3.x1999.xhtml.SpanDocument.Span getSpanArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SpanDocument.Span target = null;
                target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().find_element_user(SPAN$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "span" element
         */
        public int sizeOfSpanArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPAN$42);
            }
        }
        
        /**
         * Sets array of all "span" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSpanArray(org.w3.x1999.xhtml.SpanDocument.Span[] spanArray)
        {
            check_orphaned();
            arraySetterHelper(spanArray, SPAN$42);
        }
        
        /**
         * Sets ith "span" element
         */
        public void setSpanArray(int i, org.w3.x1999.xhtml.SpanDocument.Span span)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SpanDocument.Span target = null;
                target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().find_element_user(SPAN$42, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(span);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "span" element
         */
        public org.w3.x1999.xhtml.SpanDocument.Span insertNewSpan(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SpanDocument.Span target = null;
                target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().insert_element_user(SPAN$42, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "span" element
         */
        public org.w3.x1999.xhtml.SpanDocument.Span addNewSpan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SpanDocument.Span target = null;
                target = (org.w3.x1999.xhtml.SpanDocument.Span)get_store().add_element_user(SPAN$42);
                return target;
            }
        }
        
        /**
         * Removes the ith "span" element
         */
        public void removeSpan(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPAN$42, i);
            }
        }
        
        /**
         * Gets array of all "bdo" elements
         */
        public org.w3.x1999.xhtml.BdoDocument.Bdo[] getBdoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BDO$44, targetList);
                org.w3.x1999.xhtml.BdoDocument.Bdo[] result = new org.w3.x1999.xhtml.BdoDocument.Bdo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "bdo" element
         */
        public org.w3.x1999.xhtml.BdoDocument.Bdo getBdoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
                target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().find_element_user(BDO$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "bdo" element
         */
        public int sizeOfBdoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BDO$44);
            }
        }
        
        /**
         * Sets array of all "bdo" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBdoArray(org.w3.x1999.xhtml.BdoDocument.Bdo[] bdoArray)
        {
            check_orphaned();
            arraySetterHelper(bdoArray, BDO$44);
        }
        
        /**
         * Sets ith "bdo" element
         */
        public void setBdoArray(int i, org.w3.x1999.xhtml.BdoDocument.Bdo bdo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
                target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().find_element_user(BDO$44, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bdo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "bdo" element
         */
        public org.w3.x1999.xhtml.BdoDocument.Bdo insertNewBdo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
                target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().insert_element_user(BDO$44, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "bdo" element
         */
        public org.w3.x1999.xhtml.BdoDocument.Bdo addNewBdo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BdoDocument.Bdo target = null;
                target = (org.w3.x1999.xhtml.BdoDocument.Bdo)get_store().add_element_user(BDO$44);
                return target;
            }
        }
        
        /**
         * Removes the ith "bdo" element
         */
        public void removeBdo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BDO$44, i);
            }
        }
        
        /**
         * Gets array of all "map" elements
         */
        public org.w3.x1999.xhtml.MapDocument.Map[] getMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MAP$46, targetList);
                org.w3.x1999.xhtml.MapDocument.Map[] result = new org.w3.x1999.xhtml.MapDocument.Map[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "map" element
         */
        public org.w3.x1999.xhtml.MapDocument.Map getMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MapDocument.Map target = null;
                target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().find_element_user(MAP$46, i);
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
                return get_store().count_elements(MAP$46);
            }
        }
        
        /**
         * Sets array of all "map" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMapArray(org.w3.x1999.xhtml.MapDocument.Map[] mapArray)
        {
            check_orphaned();
            arraySetterHelper(mapArray, MAP$46);
        }
        
        /**
         * Sets ith "map" element
         */
        public void setMapArray(int i, org.w3.x1999.xhtml.MapDocument.Map map)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MapDocument.Map target = null;
                target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().find_element_user(MAP$46, i);
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
        public org.w3.x1999.xhtml.MapDocument.Map insertNewMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MapDocument.Map target = null;
                target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().insert_element_user(MAP$46, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "map" element
         */
        public org.w3.x1999.xhtml.MapDocument.Map addNewMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.MapDocument.Map target = null;
                target = (org.w3.x1999.xhtml.MapDocument.Map)get_store().add_element_user(MAP$46);
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
                get_store().remove_element(MAP$46, i);
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
                get_store().find_all_element_users(OBJECT$48, targetList);
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
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().find_element_user(OBJECT$48, i);
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
                return get_store().count_elements(OBJECT$48);
            }
        }
        
        /**
         * Sets array of all "object" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setObjectArray(org.w3.x1999.xhtml.ObjectDocument.Object[] objectArray)
        {
            check_orphaned();
            arraySetterHelper(objectArray, OBJECT$48);
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
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().find_element_user(OBJECT$48, i);
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
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().insert_element_user(OBJECT$48, i);
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
                target = (org.w3.x1999.xhtml.ObjectDocument.Object)get_store().add_element_user(OBJECT$48);
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
                get_store().remove_element(OBJECT$48, i);
            }
        }
        
        /**
         * Gets array of all "img" elements
         */
        public org.w3.x1999.xhtml.ImgDocument.Img[] getImgArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IMG$50, targetList);
                org.w3.x1999.xhtml.ImgDocument.Img[] result = new org.w3.x1999.xhtml.ImgDocument.Img[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "img" element
         */
        public org.w3.x1999.xhtml.ImgDocument.Img getImgArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ImgDocument.Img target = null;
                target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().find_element_user(IMG$50, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "img" element
         */
        public int sizeOfImgArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMG$50);
            }
        }
        
        /**
         * Sets array of all "img" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setImgArray(org.w3.x1999.xhtml.ImgDocument.Img[] imgArray)
        {
            check_orphaned();
            arraySetterHelper(imgArray, IMG$50);
        }
        
        /**
         * Sets ith "img" element
         */
        public void setImgArray(int i, org.w3.x1999.xhtml.ImgDocument.Img img)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ImgDocument.Img target = null;
                target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().find_element_user(IMG$50, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(img);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "img" element
         */
        public org.w3.x1999.xhtml.ImgDocument.Img insertNewImg(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ImgDocument.Img target = null;
                target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().insert_element_user(IMG$50, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "img" element
         */
        public org.w3.x1999.xhtml.ImgDocument.Img addNewImg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ImgDocument.Img target = null;
                target = (org.w3.x1999.xhtml.ImgDocument.Img)get_store().add_element_user(IMG$50);
                return target;
            }
        }
        
        /**
         * Removes the ith "img" element
         */
        public void removeImg(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMG$50, i);
            }
        }
        
        /**
         * Gets array of all "tt" elements
         */
        public org.w3.x1999.xhtml.TtDocument.Tt[] getTtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TT$52, targetList);
                org.w3.x1999.xhtml.TtDocument.Tt[] result = new org.w3.x1999.xhtml.TtDocument.Tt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tt" element
         */
        public org.w3.x1999.xhtml.TtDocument.Tt getTtArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TtDocument.Tt target = null;
                target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().find_element_user(TT$52, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tt" element
         */
        public int sizeOfTtArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TT$52);
            }
        }
        
        /**
         * Sets array of all "tt" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTtArray(org.w3.x1999.xhtml.TtDocument.Tt[] ttArray)
        {
            check_orphaned();
            arraySetterHelper(ttArray, TT$52);
        }
        
        /**
         * Sets ith "tt" element
         */
        public void setTtArray(int i, org.w3.x1999.xhtml.TtDocument.Tt tt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TtDocument.Tt target = null;
                target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().find_element_user(TT$52, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tt);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tt" element
         */
        public org.w3.x1999.xhtml.TtDocument.Tt insertNewTt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TtDocument.Tt target = null;
                target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().insert_element_user(TT$52, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tt" element
         */
        public org.w3.x1999.xhtml.TtDocument.Tt addNewTt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TtDocument.Tt target = null;
                target = (org.w3.x1999.xhtml.TtDocument.Tt)get_store().add_element_user(TT$52);
                return target;
            }
        }
        
        /**
         * Removes the ith "tt" element
         */
        public void removeTt(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TT$52, i);
            }
        }
        
        /**
         * Gets array of all "i" elements
         */
        public org.w3.x1999.xhtml.IDocument.I[] getIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(I$54, targetList);
                org.w3.x1999.xhtml.IDocument.I[] result = new org.w3.x1999.xhtml.IDocument.I[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "i" element
         */
        public org.w3.x1999.xhtml.IDocument.I getIArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.IDocument.I target = null;
                target = (org.w3.x1999.xhtml.IDocument.I)get_store().find_element_user(I$54, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "i" element
         */
        public int sizeOfIArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(I$54);
            }
        }
        
        /**
         * Sets array of all "i" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIArray(org.w3.x1999.xhtml.IDocument.I[] iValueArray)
        {
            check_orphaned();
            arraySetterHelper(iValueArray, I$54);
        }
        
        /**
         * Sets ith "i" element
         */
        public void setIArray(int i, org.w3.x1999.xhtml.IDocument.I iValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.IDocument.I target = null;
                target = (org.w3.x1999.xhtml.IDocument.I)get_store().find_element_user(I$54, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(iValue);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "i" element
         */
        public org.w3.x1999.xhtml.IDocument.I insertNewI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.IDocument.I target = null;
                target = (org.w3.x1999.xhtml.IDocument.I)get_store().insert_element_user(I$54, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "i" element
         */
        public org.w3.x1999.xhtml.IDocument.I addNewI()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.IDocument.I target = null;
                target = (org.w3.x1999.xhtml.IDocument.I)get_store().add_element_user(I$54);
                return target;
            }
        }
        
        /**
         * Removes the ith "i" element
         */
        public void removeI(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(I$54, i);
            }
        }
        
        /**
         * Gets array of all "b" elements
         */
        public org.w3.x1999.xhtml.BDocument.B[] getBArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(B$56, targetList);
                org.w3.x1999.xhtml.BDocument.B[] result = new org.w3.x1999.xhtml.BDocument.B[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "b" element
         */
        public org.w3.x1999.xhtml.BDocument.B getBArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BDocument.B target = null;
                target = (org.w3.x1999.xhtml.BDocument.B)get_store().find_element_user(B$56, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "b" element
         */
        public int sizeOfBArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(B$56);
            }
        }
        
        /**
         * Sets array of all "b" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBArray(org.w3.x1999.xhtml.BDocument.B[] bArray)
        {
            check_orphaned();
            arraySetterHelper(bArray, B$56);
        }
        
        /**
         * Sets ith "b" element
         */
        public void setBArray(int i, org.w3.x1999.xhtml.BDocument.B b)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BDocument.B target = null;
                target = (org.w3.x1999.xhtml.BDocument.B)get_store().find_element_user(B$56, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(b);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "b" element
         */
        public org.w3.x1999.xhtml.BDocument.B insertNewB(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BDocument.B target = null;
                target = (org.w3.x1999.xhtml.BDocument.B)get_store().insert_element_user(B$56, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "b" element
         */
        public org.w3.x1999.xhtml.BDocument.B addNewB()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BDocument.B target = null;
                target = (org.w3.x1999.xhtml.BDocument.B)get_store().add_element_user(B$56);
                return target;
            }
        }
        
        /**
         * Removes the ith "b" element
         */
        public void removeB(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(B$56, i);
            }
        }
        
        /**
         * Gets array of all "big" elements
         */
        public org.w3.x1999.xhtml.BigDocument.Big[] getBigArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BIG$58, targetList);
                org.w3.x1999.xhtml.BigDocument.Big[] result = new org.w3.x1999.xhtml.BigDocument.Big[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "big" element
         */
        public org.w3.x1999.xhtml.BigDocument.Big getBigArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BigDocument.Big target = null;
                target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().find_element_user(BIG$58, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "big" element
         */
        public int sizeOfBigArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BIG$58);
            }
        }
        
        /**
         * Sets array of all "big" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBigArray(org.w3.x1999.xhtml.BigDocument.Big[] bigArray)
        {
            check_orphaned();
            arraySetterHelper(bigArray, BIG$58);
        }
        
        /**
         * Sets ith "big" element
         */
        public void setBigArray(int i, org.w3.x1999.xhtml.BigDocument.Big big)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BigDocument.Big target = null;
                target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().find_element_user(BIG$58, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(big);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "big" element
         */
        public org.w3.x1999.xhtml.BigDocument.Big insertNewBig(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BigDocument.Big target = null;
                target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().insert_element_user(BIG$58, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "big" element
         */
        public org.w3.x1999.xhtml.BigDocument.Big addNewBig()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.BigDocument.Big target = null;
                target = (org.w3.x1999.xhtml.BigDocument.Big)get_store().add_element_user(BIG$58);
                return target;
            }
        }
        
        /**
         * Removes the ith "big" element
         */
        public void removeBig(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BIG$58, i);
            }
        }
        
        /**
         * Gets array of all "small" elements
         */
        public org.w3.x1999.xhtml.SmallDocument.Small[] getSmallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SMALL$60, targetList);
                org.w3.x1999.xhtml.SmallDocument.Small[] result = new org.w3.x1999.xhtml.SmallDocument.Small[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "small" element
         */
        public org.w3.x1999.xhtml.SmallDocument.Small getSmallArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SmallDocument.Small target = null;
                target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().find_element_user(SMALL$60, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "small" element
         */
        public int sizeOfSmallArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SMALL$60);
            }
        }
        
        /**
         * Sets array of all "small" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSmallArray(org.w3.x1999.xhtml.SmallDocument.Small[] smallArray)
        {
            check_orphaned();
            arraySetterHelper(smallArray, SMALL$60);
        }
        
        /**
         * Sets ith "small" element
         */
        public void setSmallArray(int i, org.w3.x1999.xhtml.SmallDocument.Small small)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SmallDocument.Small target = null;
                target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().find_element_user(SMALL$60, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(small);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "small" element
         */
        public org.w3.x1999.xhtml.SmallDocument.Small insertNewSmall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SmallDocument.Small target = null;
                target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().insert_element_user(SMALL$60, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "small" element
         */
        public org.w3.x1999.xhtml.SmallDocument.Small addNewSmall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SmallDocument.Small target = null;
                target = (org.w3.x1999.xhtml.SmallDocument.Small)get_store().add_element_user(SMALL$60);
                return target;
            }
        }
        
        /**
         * Removes the ith "small" element
         */
        public void removeSmall(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SMALL$60, i);
            }
        }
        
        /**
         * Gets array of all "em" elements
         */
        public org.w3.x1999.xhtml.EmDocument.Em[] getEmArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EM$62, targetList);
                org.w3.x1999.xhtml.EmDocument.Em[] result = new org.w3.x1999.xhtml.EmDocument.Em[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "em" element
         */
        public org.w3.x1999.xhtml.EmDocument.Em getEmArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.EmDocument.Em target = null;
                target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().find_element_user(EM$62, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "em" element
         */
        public int sizeOfEmArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EM$62);
            }
        }
        
        /**
         * Sets array of all "em" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEmArray(org.w3.x1999.xhtml.EmDocument.Em[] emArray)
        {
            check_orphaned();
            arraySetterHelper(emArray, EM$62);
        }
        
        /**
         * Sets ith "em" element
         */
        public void setEmArray(int i, org.w3.x1999.xhtml.EmDocument.Em em)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.EmDocument.Em target = null;
                target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().find_element_user(EM$62, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(em);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "em" element
         */
        public org.w3.x1999.xhtml.EmDocument.Em insertNewEm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.EmDocument.Em target = null;
                target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().insert_element_user(EM$62, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "em" element
         */
        public org.w3.x1999.xhtml.EmDocument.Em addNewEm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.EmDocument.Em target = null;
                target = (org.w3.x1999.xhtml.EmDocument.Em)get_store().add_element_user(EM$62);
                return target;
            }
        }
        
        /**
         * Removes the ith "em" element
         */
        public void removeEm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EM$62, i);
            }
        }
        
        /**
         * Gets array of all "strong" elements
         */
        public org.w3.x1999.xhtml.StrongDocument.Strong[] getStrongArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRONG$64, targetList);
                org.w3.x1999.xhtml.StrongDocument.Strong[] result = new org.w3.x1999.xhtml.StrongDocument.Strong[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "strong" element
         */
        public org.w3.x1999.xhtml.StrongDocument.Strong getStrongArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StrongDocument.Strong target = null;
                target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().find_element_user(STRONG$64, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "strong" element
         */
        public int sizeOfStrongArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRONG$64);
            }
        }
        
        /**
         * Sets array of all "strong" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStrongArray(org.w3.x1999.xhtml.StrongDocument.Strong[] strongArray)
        {
            check_orphaned();
            arraySetterHelper(strongArray, STRONG$64);
        }
        
        /**
         * Sets ith "strong" element
         */
        public void setStrongArray(int i, org.w3.x1999.xhtml.StrongDocument.Strong strong)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StrongDocument.Strong target = null;
                target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().find_element_user(STRONG$64, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(strong);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "strong" element
         */
        public org.w3.x1999.xhtml.StrongDocument.Strong insertNewStrong(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StrongDocument.Strong target = null;
                target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().insert_element_user(STRONG$64, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "strong" element
         */
        public org.w3.x1999.xhtml.StrongDocument.Strong addNewStrong()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.StrongDocument.Strong target = null;
                target = (org.w3.x1999.xhtml.StrongDocument.Strong)get_store().add_element_user(STRONG$64);
                return target;
            }
        }
        
        /**
         * Removes the ith "strong" element
         */
        public void removeStrong(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRONG$64, i);
            }
        }
        
        /**
         * Gets array of all "dfn" elements
         */
        public org.w3.x1999.xhtml.DfnDocument.Dfn[] getDfnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DFN$66, targetList);
                org.w3.x1999.xhtml.DfnDocument.Dfn[] result = new org.w3.x1999.xhtml.DfnDocument.Dfn[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dfn" element
         */
        public org.w3.x1999.xhtml.DfnDocument.Dfn getDfnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
                target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().find_element_user(DFN$66, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dfn" element
         */
        public int sizeOfDfnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DFN$66);
            }
        }
        
        /**
         * Sets array of all "dfn" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDfnArray(org.w3.x1999.xhtml.DfnDocument.Dfn[] dfnArray)
        {
            check_orphaned();
            arraySetterHelper(dfnArray, DFN$66);
        }
        
        /**
         * Sets ith "dfn" element
         */
        public void setDfnArray(int i, org.w3.x1999.xhtml.DfnDocument.Dfn dfn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
                target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().find_element_user(DFN$66, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dfn);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dfn" element
         */
        public org.w3.x1999.xhtml.DfnDocument.Dfn insertNewDfn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
                target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().insert_element_user(DFN$66, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dfn" element
         */
        public org.w3.x1999.xhtml.DfnDocument.Dfn addNewDfn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DfnDocument.Dfn target = null;
                target = (org.w3.x1999.xhtml.DfnDocument.Dfn)get_store().add_element_user(DFN$66);
                return target;
            }
        }
        
        /**
         * Removes the ith "dfn" element
         */
        public void removeDfn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DFN$66, i);
            }
        }
        
        /**
         * Gets array of all "code" elements
         */
        public org.w3.x1999.xhtml.CodeDocument.Code[] getCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODE$68, targetList);
                org.w3.x1999.xhtml.CodeDocument.Code[] result = new org.w3.x1999.xhtml.CodeDocument.Code[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "code" element
         */
        public org.w3.x1999.xhtml.CodeDocument.Code getCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CodeDocument.Code target = null;
                target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().find_element_user(CODE$68, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "code" element
         */
        public int sizeOfCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODE$68);
            }
        }
        
        /**
         * Sets array of all "code" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCodeArray(org.w3.x1999.xhtml.CodeDocument.Code[] codeArray)
        {
            check_orphaned();
            arraySetterHelper(codeArray, CODE$68);
        }
        
        /**
         * Sets ith "code" element
         */
        public void setCodeArray(int i, org.w3.x1999.xhtml.CodeDocument.Code code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CodeDocument.Code target = null;
                target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().find_element_user(CODE$68, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(code);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "code" element
         */
        public org.w3.x1999.xhtml.CodeDocument.Code insertNewCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CodeDocument.Code target = null;
                target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().insert_element_user(CODE$68, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "code" element
         */
        public org.w3.x1999.xhtml.CodeDocument.Code addNewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CodeDocument.Code target = null;
                target = (org.w3.x1999.xhtml.CodeDocument.Code)get_store().add_element_user(CODE$68);
                return target;
            }
        }
        
        /**
         * Removes the ith "code" element
         */
        public void removeCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODE$68, i);
            }
        }
        
        /**
         * Gets array of all "q" elements
         */
        public org.w3.x1999.xhtml.QDocument.Q[] getQArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(Q$70, targetList);
                org.w3.x1999.xhtml.QDocument.Q[] result = new org.w3.x1999.xhtml.QDocument.Q[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "q" element
         */
        public org.w3.x1999.xhtml.QDocument.Q getQArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.QDocument.Q target = null;
                target = (org.w3.x1999.xhtml.QDocument.Q)get_store().find_element_user(Q$70, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "q" element
         */
        public int sizeOfQArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(Q$70);
            }
        }
        
        /**
         * Sets array of all "q" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setQArray(org.w3.x1999.xhtml.QDocument.Q[] qArray)
        {
            check_orphaned();
            arraySetterHelper(qArray, Q$70);
        }
        
        /**
         * Sets ith "q" element
         */
        public void setQArray(int i, org.w3.x1999.xhtml.QDocument.Q q)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.QDocument.Q target = null;
                target = (org.w3.x1999.xhtml.QDocument.Q)get_store().find_element_user(Q$70, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(q);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "q" element
         */
        public org.w3.x1999.xhtml.QDocument.Q insertNewQ(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.QDocument.Q target = null;
                target = (org.w3.x1999.xhtml.QDocument.Q)get_store().insert_element_user(Q$70, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "q" element
         */
        public org.w3.x1999.xhtml.QDocument.Q addNewQ()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.QDocument.Q target = null;
                target = (org.w3.x1999.xhtml.QDocument.Q)get_store().add_element_user(Q$70);
                return target;
            }
        }
        
        /**
         * Removes the ith "q" element
         */
        public void removeQ(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(Q$70, i);
            }
        }
        
        /**
         * Gets array of all "samp" elements
         */
        public org.w3.x1999.xhtml.SampDocument.Samp[] getSampArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SAMP$72, targetList);
                org.w3.x1999.xhtml.SampDocument.Samp[] result = new org.w3.x1999.xhtml.SampDocument.Samp[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "samp" element
         */
        public org.w3.x1999.xhtml.SampDocument.Samp getSampArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SampDocument.Samp target = null;
                target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().find_element_user(SAMP$72, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "samp" element
         */
        public int sizeOfSampArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SAMP$72);
            }
        }
        
        /**
         * Sets array of all "samp" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSampArray(org.w3.x1999.xhtml.SampDocument.Samp[] sampArray)
        {
            check_orphaned();
            arraySetterHelper(sampArray, SAMP$72);
        }
        
        /**
         * Sets ith "samp" element
         */
        public void setSampArray(int i, org.w3.x1999.xhtml.SampDocument.Samp samp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SampDocument.Samp target = null;
                target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().find_element_user(SAMP$72, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(samp);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "samp" element
         */
        public org.w3.x1999.xhtml.SampDocument.Samp insertNewSamp(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SampDocument.Samp target = null;
                target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().insert_element_user(SAMP$72, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "samp" element
         */
        public org.w3.x1999.xhtml.SampDocument.Samp addNewSamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SampDocument.Samp target = null;
                target = (org.w3.x1999.xhtml.SampDocument.Samp)get_store().add_element_user(SAMP$72);
                return target;
            }
        }
        
        /**
         * Removes the ith "samp" element
         */
        public void removeSamp(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SAMP$72, i);
            }
        }
        
        /**
         * Gets array of all "kbd" elements
         */
        public org.w3.x1999.xhtml.KbdDocument.Kbd[] getKbdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KBD$74, targetList);
                org.w3.x1999.xhtml.KbdDocument.Kbd[] result = new org.w3.x1999.xhtml.KbdDocument.Kbd[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "kbd" element
         */
        public org.w3.x1999.xhtml.KbdDocument.Kbd getKbdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
                target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().find_element_user(KBD$74, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "kbd" element
         */
        public int sizeOfKbdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KBD$74);
            }
        }
        
        /**
         * Sets array of all "kbd" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKbdArray(org.w3.x1999.xhtml.KbdDocument.Kbd[] kbdArray)
        {
            check_orphaned();
            arraySetterHelper(kbdArray, KBD$74);
        }
        
        /**
         * Sets ith "kbd" element
         */
        public void setKbdArray(int i, org.w3.x1999.xhtml.KbdDocument.Kbd kbd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
                target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().find_element_user(KBD$74, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(kbd);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "kbd" element
         */
        public org.w3.x1999.xhtml.KbdDocument.Kbd insertNewKbd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
                target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().insert_element_user(KBD$74, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "kbd" element
         */
        public org.w3.x1999.xhtml.KbdDocument.Kbd addNewKbd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.KbdDocument.Kbd target = null;
                target = (org.w3.x1999.xhtml.KbdDocument.Kbd)get_store().add_element_user(KBD$74);
                return target;
            }
        }
        
        /**
         * Removes the ith "kbd" element
         */
        public void removeKbd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KBD$74, i);
            }
        }
        
        /**
         * Gets array of all "var" elements
         */
        public org.w3.x1999.xhtml.VarDocument.Var[] getVarArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VAR$76, targetList);
                org.w3.x1999.xhtml.VarDocument.Var[] result = new org.w3.x1999.xhtml.VarDocument.Var[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "var" element
         */
        public org.w3.x1999.xhtml.VarDocument.Var getVarArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.VarDocument.Var target = null;
                target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().find_element_user(VAR$76, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "var" element
         */
        public int sizeOfVarArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VAR$76);
            }
        }
        
        /**
         * Sets array of all "var" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setVarArray(org.w3.x1999.xhtml.VarDocument.Var[] varArray)
        {
            check_orphaned();
            arraySetterHelper(varArray, VAR$76);
        }
        
        /**
         * Sets ith "var" element
         */
        public void setVarArray(int i, org.w3.x1999.xhtml.VarDocument.Var var)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.VarDocument.Var target = null;
                target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().find_element_user(VAR$76, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(var);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "var" element
         */
        public org.w3.x1999.xhtml.VarDocument.Var insertNewVar(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.VarDocument.Var target = null;
                target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().insert_element_user(VAR$76, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "var" element
         */
        public org.w3.x1999.xhtml.VarDocument.Var addNewVar()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.VarDocument.Var target = null;
                target = (org.w3.x1999.xhtml.VarDocument.Var)get_store().add_element_user(VAR$76);
                return target;
            }
        }
        
        /**
         * Removes the ith "var" element
         */
        public void removeVar(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VAR$76, i);
            }
        }
        
        /**
         * Gets array of all "cite" elements
         */
        public org.w3.x1999.xhtml.CiteDocument.Cite[] getCiteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CITE$78, targetList);
                org.w3.x1999.xhtml.CiteDocument.Cite[] result = new org.w3.x1999.xhtml.CiteDocument.Cite[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "cite" element
         */
        public org.w3.x1999.xhtml.CiteDocument.Cite getCiteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CiteDocument.Cite target = null;
                target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().find_element_user(CITE$78, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "cite" element
         */
        public int sizeOfCiteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CITE$78);
            }
        }
        
        /**
         * Sets array of all "cite" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCiteArray(org.w3.x1999.xhtml.CiteDocument.Cite[] citeArray)
        {
            check_orphaned();
            arraySetterHelper(citeArray, CITE$78);
        }
        
        /**
         * Sets ith "cite" element
         */
        public void setCiteArray(int i, org.w3.x1999.xhtml.CiteDocument.Cite cite)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CiteDocument.Cite target = null;
                target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().find_element_user(CITE$78, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(cite);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "cite" element
         */
        public org.w3.x1999.xhtml.CiteDocument.Cite insertNewCite(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CiteDocument.Cite target = null;
                target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().insert_element_user(CITE$78, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "cite" element
         */
        public org.w3.x1999.xhtml.CiteDocument.Cite addNewCite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CiteDocument.Cite target = null;
                target = (org.w3.x1999.xhtml.CiteDocument.Cite)get_store().add_element_user(CITE$78);
                return target;
            }
        }
        
        /**
         * Removes the ith "cite" element
         */
        public void removeCite(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CITE$78, i);
            }
        }
        
        /**
         * Gets array of all "abbr" elements
         */
        public org.w3.x1999.xhtml.AbbrDocument.Abbr[] getAbbrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ABBR$80, targetList);
                org.w3.x1999.xhtml.AbbrDocument.Abbr[] result = new org.w3.x1999.xhtml.AbbrDocument.Abbr[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "abbr" element
         */
        public org.w3.x1999.xhtml.AbbrDocument.Abbr getAbbrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
                target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().find_element_user(ABBR$80, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "abbr" element
         */
        public int sizeOfAbbrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ABBR$80);
            }
        }
        
        /**
         * Sets array of all "abbr" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAbbrArray(org.w3.x1999.xhtml.AbbrDocument.Abbr[] abbrArray)
        {
            check_orphaned();
            arraySetterHelper(abbrArray, ABBR$80);
        }
        
        /**
         * Sets ith "abbr" element
         */
        public void setAbbrArray(int i, org.w3.x1999.xhtml.AbbrDocument.Abbr abbr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
                target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().find_element_user(ABBR$80, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(abbr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "abbr" element
         */
        public org.w3.x1999.xhtml.AbbrDocument.Abbr insertNewAbbr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
                target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().insert_element_user(ABBR$80, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "abbr" element
         */
        public org.w3.x1999.xhtml.AbbrDocument.Abbr addNewAbbr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AbbrDocument.Abbr target = null;
                target = (org.w3.x1999.xhtml.AbbrDocument.Abbr)get_store().add_element_user(ABBR$80);
                return target;
            }
        }
        
        /**
         * Removes the ith "abbr" element
         */
        public void removeAbbr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ABBR$80, i);
            }
        }
        
        /**
         * Gets array of all "acronym" elements
         */
        public org.w3.x1999.xhtml.AcronymDocument.Acronym[] getAcronymArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ACRONYM$82, targetList);
                org.w3.x1999.xhtml.AcronymDocument.Acronym[] result = new org.w3.x1999.xhtml.AcronymDocument.Acronym[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "acronym" element
         */
        public org.w3.x1999.xhtml.AcronymDocument.Acronym getAcronymArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
                target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().find_element_user(ACRONYM$82, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "acronym" element
         */
        public int sizeOfAcronymArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACRONYM$82);
            }
        }
        
        /**
         * Sets array of all "acronym" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAcronymArray(org.w3.x1999.xhtml.AcronymDocument.Acronym[] acronymArray)
        {
            check_orphaned();
            arraySetterHelper(acronymArray, ACRONYM$82);
        }
        
        /**
         * Sets ith "acronym" element
         */
        public void setAcronymArray(int i, org.w3.x1999.xhtml.AcronymDocument.Acronym acronym)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
                target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().find_element_user(ACRONYM$82, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(acronym);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "acronym" element
         */
        public org.w3.x1999.xhtml.AcronymDocument.Acronym insertNewAcronym(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
                target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().insert_element_user(ACRONYM$82, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "acronym" element
         */
        public org.w3.x1999.xhtml.AcronymDocument.Acronym addNewAcronym()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.AcronymDocument.Acronym target = null;
                target = (org.w3.x1999.xhtml.AcronymDocument.Acronym)get_store().add_element_user(ACRONYM$82);
                return target;
            }
        }
        
        /**
         * Removes the ith "acronym" element
         */
        public void removeAcronym(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACRONYM$82, i);
            }
        }
        
        /**
         * Gets array of all "sub" elements
         */
        public org.w3.x1999.xhtml.SubDocument.Sub[] getSubArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUB$84, targetList);
                org.w3.x1999.xhtml.SubDocument.Sub[] result = new org.w3.x1999.xhtml.SubDocument.Sub[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sub" element
         */
        public org.w3.x1999.xhtml.SubDocument.Sub getSubArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SubDocument.Sub target = null;
                target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().find_element_user(SUB$84, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sub" element
         */
        public int sizeOfSubArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUB$84);
            }
        }
        
        /**
         * Sets array of all "sub" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSubArray(org.w3.x1999.xhtml.SubDocument.Sub[] subArray)
        {
            check_orphaned();
            arraySetterHelper(subArray, SUB$84);
        }
        
        /**
         * Sets ith "sub" element
         */
        public void setSubArray(int i, org.w3.x1999.xhtml.SubDocument.Sub sub)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SubDocument.Sub target = null;
                target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().find_element_user(SUB$84, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sub);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sub" element
         */
        public org.w3.x1999.xhtml.SubDocument.Sub insertNewSub(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SubDocument.Sub target = null;
                target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().insert_element_user(SUB$84, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sub" element
         */
        public org.w3.x1999.xhtml.SubDocument.Sub addNewSub()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SubDocument.Sub target = null;
                target = (org.w3.x1999.xhtml.SubDocument.Sub)get_store().add_element_user(SUB$84);
                return target;
            }
        }
        
        /**
         * Removes the ith "sub" element
         */
        public void removeSub(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUB$84, i);
            }
        }
        
        /**
         * Gets array of all "sup" elements
         */
        public org.w3.x1999.xhtml.SupDocument.Sup[] getSupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUP$86, targetList);
                org.w3.x1999.xhtml.SupDocument.Sup[] result = new org.w3.x1999.xhtml.SupDocument.Sup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sup" element
         */
        public org.w3.x1999.xhtml.SupDocument.Sup getSupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SupDocument.Sup target = null;
                target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().find_element_user(SUP$86, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sup" element
         */
        public int sizeOfSupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUP$86);
            }
        }
        
        /**
         * Sets array of all "sup" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSupArray(org.w3.x1999.xhtml.SupDocument.Sup[] supArray)
        {
            check_orphaned();
            arraySetterHelper(supArray, SUP$86);
        }
        
        /**
         * Sets ith "sup" element
         */
        public void setSupArray(int i, org.w3.x1999.xhtml.SupDocument.Sup sup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SupDocument.Sup target = null;
                target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().find_element_user(SUP$86, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sup" element
         */
        public org.w3.x1999.xhtml.SupDocument.Sup insertNewSup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SupDocument.Sup target = null;
                target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().insert_element_user(SUP$86, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sup" element
         */
        public org.w3.x1999.xhtml.SupDocument.Sup addNewSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SupDocument.Sup target = null;
                target = (org.w3.x1999.xhtml.SupDocument.Sup)get_store().add_element_user(SUP$86);
                return target;
            }
        }
        
        /**
         * Removes the ith "sup" element
         */
        public void removeSup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUP$86, i);
            }
        }
        
        /**
         * Gets array of all "input" elements
         */
        public org.w3.x1999.xhtml.InputDocument.Input[] getInputArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INPUT$88, targetList);
                org.w3.x1999.xhtml.InputDocument.Input[] result = new org.w3.x1999.xhtml.InputDocument.Input[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "input" element
         */
        public org.w3.x1999.xhtml.InputDocument.Input getInputArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InputDocument.Input target = null;
                target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().find_element_user(INPUT$88, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "input" element
         */
        public int sizeOfInputArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INPUT$88);
            }
        }
        
        /**
         * Sets array of all "input" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setInputArray(org.w3.x1999.xhtml.InputDocument.Input[] inputArray)
        {
            check_orphaned();
            arraySetterHelper(inputArray, INPUT$88);
        }
        
        /**
         * Sets ith "input" element
         */
        public void setInputArray(int i, org.w3.x1999.xhtml.InputDocument.Input input)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InputDocument.Input target = null;
                target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().find_element_user(INPUT$88, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(input);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "input" element
         */
        public org.w3.x1999.xhtml.InputDocument.Input insertNewInput(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InputDocument.Input target = null;
                target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().insert_element_user(INPUT$88, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "input" element
         */
        public org.w3.x1999.xhtml.InputDocument.Input addNewInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InputDocument.Input target = null;
                target = (org.w3.x1999.xhtml.InputDocument.Input)get_store().add_element_user(INPUT$88);
                return target;
            }
        }
        
        /**
         * Removes the ith "input" element
         */
        public void removeInput(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INPUT$88, i);
            }
        }
        
        /**
         * Gets array of all "select" elements
         */
        public org.w3.x1999.xhtml.SelectDocument.Select[] getSelectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SELECT$90, targetList);
                org.w3.x1999.xhtml.SelectDocument.Select[] result = new org.w3.x1999.xhtml.SelectDocument.Select[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "select" element
         */
        public org.w3.x1999.xhtml.SelectDocument.Select getSelectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SelectDocument.Select target = null;
                target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().find_element_user(SELECT$90, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "select" element
         */
        public int sizeOfSelectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SELECT$90);
            }
        }
        
        /**
         * Sets array of all "select" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSelectArray(org.w3.x1999.xhtml.SelectDocument.Select[] selectArray)
        {
            check_orphaned();
            arraySetterHelper(selectArray, SELECT$90);
        }
        
        /**
         * Sets ith "select" element
         */
        public void setSelectArray(int i, org.w3.x1999.xhtml.SelectDocument.Select select)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SelectDocument.Select target = null;
                target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().find_element_user(SELECT$90, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(select);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "select" element
         */
        public org.w3.x1999.xhtml.SelectDocument.Select insertNewSelect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SelectDocument.Select target = null;
                target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().insert_element_user(SELECT$90, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "select" element
         */
        public org.w3.x1999.xhtml.SelectDocument.Select addNewSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.SelectDocument.Select target = null;
                target = (org.w3.x1999.xhtml.SelectDocument.Select)get_store().add_element_user(SELECT$90);
                return target;
            }
        }
        
        /**
         * Removes the ith "select" element
         */
        public void removeSelect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SELECT$90, i);
            }
        }
        
        /**
         * Gets array of all "textarea" elements
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea[] getTextareaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TEXTAREA$92, targetList);
                org.w3.x1999.xhtml.TextareaDocument.Textarea[] result = new org.w3.x1999.xhtml.TextareaDocument.Textarea[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "textarea" element
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea getTextareaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().find_element_user(TEXTAREA$92, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "textarea" element
         */
        public int sizeOfTextareaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TEXTAREA$92);
            }
        }
        
        /**
         * Sets array of all "textarea" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTextareaArray(org.w3.x1999.xhtml.TextareaDocument.Textarea[] textareaArray)
        {
            check_orphaned();
            arraySetterHelper(textareaArray, TEXTAREA$92);
        }
        
        /**
         * Sets ith "textarea" element
         */
        public void setTextareaArray(int i, org.w3.x1999.xhtml.TextareaDocument.Textarea textarea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().find_element_user(TEXTAREA$92, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(textarea);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "textarea" element
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea insertNewTextarea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().insert_element_user(TEXTAREA$92, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "textarea" element
         */
        public org.w3.x1999.xhtml.TextareaDocument.Textarea addNewTextarea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TextareaDocument.Textarea target = null;
                target = (org.w3.x1999.xhtml.TextareaDocument.Textarea)get_store().add_element_user(TEXTAREA$92);
                return target;
            }
        }
        
        /**
         * Removes the ith "textarea" element
         */
        public void removeTextarea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TEXTAREA$92, i);
            }
        }
        
        /**
         * Gets array of all "label" elements
         */
        public org.w3.x1999.xhtml.LabelDocument.Label[] getLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LABEL$94, targetList);
                org.w3.x1999.xhtml.LabelDocument.Label[] result = new org.w3.x1999.xhtml.LabelDocument.Label[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "label" element
         */
        public org.w3.x1999.xhtml.LabelDocument.Label getLabelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LabelDocument.Label target = null;
                target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().find_element_user(LABEL$94, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "label" element
         */
        public int sizeOfLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABEL$94);
            }
        }
        
        /**
         * Sets array of all "label" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLabelArray(org.w3.x1999.xhtml.LabelDocument.Label[] labelArray)
        {
            check_orphaned();
            arraySetterHelper(labelArray, LABEL$94);
        }
        
        /**
         * Sets ith "label" element
         */
        public void setLabelArray(int i, org.w3.x1999.xhtml.LabelDocument.Label label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LabelDocument.Label target = null;
                target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().find_element_user(LABEL$94, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(label);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "label" element
         */
        public org.w3.x1999.xhtml.LabelDocument.Label insertNewLabel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LabelDocument.Label target = null;
                target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().insert_element_user(LABEL$94, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "label" element
         */
        public org.w3.x1999.xhtml.LabelDocument.Label addNewLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.LabelDocument.Label target = null;
                target = (org.w3.x1999.xhtml.LabelDocument.Label)get_store().add_element_user(LABEL$94);
                return target;
            }
        }
        
        /**
         * Removes the ith "label" element
         */
        public void removeLabel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABEL$94, i);
            }
        }
        
        /**
         * Gets array of all "button" elements
         */
        public org.w3.x1999.xhtml.ButtonDocument.Button[] getButtonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BUTTON$96, targetList);
                org.w3.x1999.xhtml.ButtonDocument.Button[] result = new org.w3.x1999.xhtml.ButtonDocument.Button[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "button" element
         */
        public org.w3.x1999.xhtml.ButtonDocument.Button getButtonArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ButtonDocument.Button target = null;
                target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().find_element_user(BUTTON$96, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "button" element
         */
        public int sizeOfButtonArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BUTTON$96);
            }
        }
        
        /**
         * Sets array of all "button" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setButtonArray(org.w3.x1999.xhtml.ButtonDocument.Button[] buttonArray)
        {
            check_orphaned();
            arraySetterHelper(buttonArray, BUTTON$96);
        }
        
        /**
         * Sets ith "button" element
         */
        public void setButtonArray(int i, org.w3.x1999.xhtml.ButtonDocument.Button button)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ButtonDocument.Button target = null;
                target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().find_element_user(BUTTON$96, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(button);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "button" element
         */
        public org.w3.x1999.xhtml.ButtonDocument.Button insertNewButton(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ButtonDocument.Button target = null;
                target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().insert_element_user(BUTTON$96, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "button" element
         */
        public org.w3.x1999.xhtml.ButtonDocument.Button addNewButton()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ButtonDocument.Button target = null;
                target = (org.w3.x1999.xhtml.ButtonDocument.Button)get_store().add_element_user(BUTTON$96);
                return target;
            }
        }
        
        /**
         * Removes the ith "button" element
         */
        public void removeButton(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BUTTON$96, i);
            }
        }
        
        /**
         * Gets array of all "noscript" elements
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript[] getNoscriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOSCRIPT$98, targetList);
                org.w3.x1999.xhtml.NoscriptDocument.Noscript[] result = new org.w3.x1999.xhtml.NoscriptDocument.Noscript[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "noscript" element
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript getNoscriptArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().find_element_user(NOSCRIPT$98, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "noscript" element
         */
        public int sizeOfNoscriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOSCRIPT$98);
            }
        }
        
        /**
         * Sets array of all "noscript" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNoscriptArray(org.w3.x1999.xhtml.NoscriptDocument.Noscript[] noscriptArray)
        {
            check_orphaned();
            arraySetterHelper(noscriptArray, NOSCRIPT$98);
        }
        
        /**
         * Sets ith "noscript" element
         */
        public void setNoscriptArray(int i, org.w3.x1999.xhtml.NoscriptDocument.Noscript noscript)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().find_element_user(NOSCRIPT$98, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(noscript);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "noscript" element
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript insertNewNoscript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().insert_element_user(NOSCRIPT$98, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "noscript" element
         */
        public org.w3.x1999.xhtml.NoscriptDocument.Noscript addNewNoscript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.NoscriptDocument.Noscript target = null;
                target = (org.w3.x1999.xhtml.NoscriptDocument.Noscript)get_store().add_element_user(NOSCRIPT$98);
                return target;
            }
        }
        
        /**
         * Removes the ith "noscript" element
         */
        public void removeNoscript(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOSCRIPT$98, i);
            }
        }
        
        /**
         * Gets array of all "ins" elements
         */
        public org.w3.x1999.xhtml.InsDocument.Ins[] getInsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INS$100, targetList);
                org.w3.x1999.xhtml.InsDocument.Ins[] result = new org.w3.x1999.xhtml.InsDocument.Ins[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ins" element
         */
        public org.w3.x1999.xhtml.InsDocument.Ins getInsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().find_element_user(INS$100, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ins" element
         */
        public int sizeOfInsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INS$100);
            }
        }
        
        /**
         * Sets array of all "ins" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setInsArray(org.w3.x1999.xhtml.InsDocument.Ins[] insArray)
        {
            check_orphaned();
            arraySetterHelper(insArray, INS$100);
        }
        
        /**
         * Sets ith "ins" element
         */
        public void setInsArray(int i, org.w3.x1999.xhtml.InsDocument.Ins ins)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().find_element_user(INS$100, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ins);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ins" element
         */
        public org.w3.x1999.xhtml.InsDocument.Ins insertNewIns(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().insert_element_user(INS$100, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ins" element
         */
        public org.w3.x1999.xhtml.InsDocument.Ins addNewIns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.InsDocument.Ins target = null;
                target = (org.w3.x1999.xhtml.InsDocument.Ins)get_store().add_element_user(INS$100);
                return target;
            }
        }
        
        /**
         * Removes the ith "ins" element
         */
        public void removeIns(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INS$100, i);
            }
        }
        
        /**
         * Gets array of all "del" elements
         */
        public org.w3.x1999.xhtml.DelDocument.Del[] getDelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEL$102, targetList);
                org.w3.x1999.xhtml.DelDocument.Del[] result = new org.w3.x1999.xhtml.DelDocument.Del[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "del" element
         */
        public org.w3.x1999.xhtml.DelDocument.Del getDelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().find_element_user(DEL$102, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "del" element
         */
        public int sizeOfDelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEL$102);
            }
        }
        
        /**
         * Sets array of all "del" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDelArray(org.w3.x1999.xhtml.DelDocument.Del[] delArray)
        {
            check_orphaned();
            arraySetterHelper(delArray, DEL$102);
        }
        
        /**
         * Sets ith "del" element
         */
        public void setDelArray(int i, org.w3.x1999.xhtml.DelDocument.Del del)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().find_element_user(DEL$102, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(del);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "del" element
         */
        public org.w3.x1999.xhtml.DelDocument.Del insertNewDel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().insert_element_user(DEL$102, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "del" element
         */
        public org.w3.x1999.xhtml.DelDocument.Del addNewDel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.DelDocument.Del target = null;
                target = (org.w3.x1999.xhtml.DelDocument.Del)get_store().add_element_user(DEL$102);
                return target;
            }
        }
        
        /**
         * Removes the ith "del" element
         */
        public void removeDel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEL$102, i);
            }
        }
        
        /**
         * Gets array of all "script" elements
         */
        public org.w3.x1999.xhtml.ScriptDocument.Script[] getScriptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCRIPT$104, targetList);
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
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$104, i);
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
                return get_store().count_elements(SCRIPT$104);
            }
        }
        
        /**
         * Sets array of all "script" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setScriptArray(org.w3.x1999.xhtml.ScriptDocument.Script[] scriptArray)
        {
            check_orphaned();
            arraySetterHelper(scriptArray, SCRIPT$104);
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
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().find_element_user(SCRIPT$104, i);
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
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().insert_element_user(SCRIPT$104, i);
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
                target = (org.w3.x1999.xhtml.ScriptDocument.Script)get_store().add_element_user(SCRIPT$104);
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
                get_store().remove_element(SCRIPT$104, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$106);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$106);
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
                return get_store().find_attribute_user(ID$106) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$106);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$106);
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
                get_store().remove_attribute(ID$106);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$108);
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
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(CLASS1$108);
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
                return get_store().find_attribute_user(CLASS1$108) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$108);
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
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(CLASS1$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(CLASS1$108);
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
                get_store().remove_attribute(CLASS1$108);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$110);
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
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$110);
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
                return get_store().find_attribute_user(STYLE$110) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$110);
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
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$110);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.StyleSheet)get_store().add_attribute_user(STYLE$110);
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
                get_store().remove_attribute(STYLE$110);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$112);
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
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$112);
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
                return get_store().find_attribute_user(TITLE$112) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$112);
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
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$112);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Text)get_store().add_attribute_user(TITLE$112);
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
                get_store().remove_attribute(TITLE$112);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$114);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$114);
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
                return get_store().find_attribute_user(LANG$114) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$114);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$114);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.LanguageCode)get_store().add_attribute_user(LANG$114);
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
                get_store().remove_attribute(LANG$114);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$116);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$116);
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
                return get_store().find_attribute_user(LANG2$116) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG2$116);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG2$116);
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
                get_store().remove_attribute(LANG2$116);
            }
        }
        
        /**
         * Gets the "dir" attribute
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir.Enum getDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$118);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        public org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir xgetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir)get_store().find_attribute_user(DIR$118);
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
                return get_store().find_attribute_user(DIR$118) != null;
            }
        }
        
        /**
         * Sets the "dir" attribute
         */
        public void setDir(org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir.Enum dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$118);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$118);
                }
                target.setEnumValue(dir);
            }
        }
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        public void xsetDir(org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir target = null;
                target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir)get_store().find_attribute_user(DIR$118);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir)get_store().add_attribute_user(DIR$118);
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
                get_store().remove_attribute(DIR$118);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$120);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$120);
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
                return get_store().find_attribute_user(ONCLICK$120) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$120);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONCLICK$120);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$120);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONCLICK$120);
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
                get_store().remove_attribute(ONCLICK$120);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$122);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$122);
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
                return get_store().find_attribute_user(ONDBLCLICK$122) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$122);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONDBLCLICK$122);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$122);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONDBLCLICK$122);
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
                get_store().remove_attribute(ONDBLCLICK$122);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$124);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$124);
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
                return get_store().find_attribute_user(ONMOUSEDOWN$124) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$124);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEDOWN$124);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$124);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEDOWN$124);
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
                get_store().remove_attribute(ONMOUSEDOWN$124);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$126);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$126);
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
                return get_store().find_attribute_user(ONMOUSEUP$126) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$126);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEUP$126);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$126);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEUP$126);
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
                get_store().remove_attribute(ONMOUSEUP$126);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$128);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$128);
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
                return get_store().find_attribute_user(ONMOUSEOVER$128) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$128);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOVER$128);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$128);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOVER$128);
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
                get_store().remove_attribute(ONMOUSEOVER$128);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$130);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$130);
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
                return get_store().find_attribute_user(ONMOUSEMOVE$130) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$130);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEMOVE$130);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$130);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEMOVE$130);
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
                get_store().remove_attribute(ONMOUSEMOVE$130);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$132);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$132);
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
                return get_store().find_attribute_user(ONMOUSEOUT$132) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$132);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOUT$132);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$132);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOUT$132);
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
                get_store().remove_attribute(ONMOUSEOUT$132);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$134);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$134);
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
                return get_store().find_attribute_user(ONKEYPRESS$134) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$134);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYPRESS$134);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$134);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYPRESS$134);
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
                get_store().remove_attribute(ONKEYPRESS$134);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$136);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$136);
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
                return get_store().find_attribute_user(ONKEYDOWN$136) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$136);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYDOWN$136);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$136);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYDOWN$136);
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
                get_store().remove_attribute(ONKEYDOWN$136);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$138);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$138);
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
                return get_store().find_attribute_user(ONKEYUP$138) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$138);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYUP$138);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$138);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYUP$138);
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
                get_store().remove_attribute(ONKEYUP$138);
            }
        }
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.FieldsetDocument$Fieldset$Dir.
         */
        public static class DirImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.FieldsetDocument.Fieldset.Dir
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
