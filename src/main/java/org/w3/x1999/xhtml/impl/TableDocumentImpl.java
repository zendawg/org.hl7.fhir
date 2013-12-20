/*
 * An XML document type.
 * Localname: table
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.TableDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml.impl;
/**
 * A document containing one table(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public class TableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.TableDocument
{
    private static final long serialVersionUID = 1L;
    
    public TableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "table");
    
    
    /**
     * Gets the "table" element
     */
    public org.w3.x1999.xhtml.TableDocument.Table getTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TableDocument.Table target = null;
            target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().find_element_user(TABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "table" element
     */
    public void setTable(org.w3.x1999.xhtml.TableDocument.Table table)
    {
        generatedSetterHelperImpl(table, TABLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "table" element
     */
    public org.w3.x1999.xhtml.TableDocument.Table addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xhtml.TableDocument.Table target = null;
            target = (org.w3.x1999.xhtml.TableDocument.Table)get_store().add_element_user(TABLE$0);
            return target;
        }
    }
    /**
     * An XML table(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public static class TableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x1999.xhtml.TableDocument.Table
    {
        private static final long serialVersionUID = 1L;
        
        public TableImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAPTION$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "caption");
        private static final javax.xml.namespace.QName COL$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "col");
        private static final javax.xml.namespace.QName COLGROUP$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "colgroup");
        private static final javax.xml.namespace.QName THEAD$6 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "thead");
        private static final javax.xml.namespace.QName TFOOT$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "tfoot");
        private static final javax.xml.namespace.QName TBODY$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "tbody");
        private static final javax.xml.namespace.QName TR$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/1999/xhtml", "tr");
        private static final javax.xml.namespace.QName ID$14 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$16 = 
            new javax.xml.namespace.QName("", "class");
        private static final javax.xml.namespace.QName STYLE$18 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName TITLE$20 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName LANG$22 = 
            new javax.xml.namespace.QName("", "lang");
        private static final javax.xml.namespace.QName LANG2$24 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName DIR$26 = 
            new javax.xml.namespace.QName("", "dir");
        private static final javax.xml.namespace.QName ONCLICK$28 = 
            new javax.xml.namespace.QName("", "onclick");
        private static final javax.xml.namespace.QName ONDBLCLICK$30 = 
            new javax.xml.namespace.QName("", "ondblclick");
        private static final javax.xml.namespace.QName ONMOUSEDOWN$32 = 
            new javax.xml.namespace.QName("", "onmousedown");
        private static final javax.xml.namespace.QName ONMOUSEUP$34 = 
            new javax.xml.namespace.QName("", "onmouseup");
        private static final javax.xml.namespace.QName ONMOUSEOVER$36 = 
            new javax.xml.namespace.QName("", "onmouseover");
        private static final javax.xml.namespace.QName ONMOUSEMOVE$38 = 
            new javax.xml.namespace.QName("", "onmousemove");
        private static final javax.xml.namespace.QName ONMOUSEOUT$40 = 
            new javax.xml.namespace.QName("", "onmouseout");
        private static final javax.xml.namespace.QName ONKEYPRESS$42 = 
            new javax.xml.namespace.QName("", "onkeypress");
        private static final javax.xml.namespace.QName ONKEYDOWN$44 = 
            new javax.xml.namespace.QName("", "onkeydown");
        private static final javax.xml.namespace.QName ONKEYUP$46 = 
            new javax.xml.namespace.QName("", "onkeyup");
        private static final javax.xml.namespace.QName SUMMARY$48 = 
            new javax.xml.namespace.QName("", "summary");
        private static final javax.xml.namespace.QName WIDTH$50 = 
            new javax.xml.namespace.QName("", "width");
        private static final javax.xml.namespace.QName BORDER$52 = 
            new javax.xml.namespace.QName("", "border");
        private static final javax.xml.namespace.QName FRAME$54 = 
            new javax.xml.namespace.QName("", "frame");
        private static final javax.xml.namespace.QName RULES$56 = 
            new javax.xml.namespace.QName("", "rules");
        private static final javax.xml.namespace.QName CELLSPACING$58 = 
            new javax.xml.namespace.QName("", "cellspacing");
        private static final javax.xml.namespace.QName CELLPADDING$60 = 
            new javax.xml.namespace.QName("", "cellpadding");
        
        
        /**
         * Gets the "caption" element
         */
        public org.w3.x1999.xhtml.CaptionDocument.Caption getCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CaptionDocument.Caption target = null;
                target = (org.w3.x1999.xhtml.CaptionDocument.Caption)get_store().find_element_user(CAPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "caption" element
         */
        public boolean isSetCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CAPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "caption" element
         */
        public void setCaption(org.w3.x1999.xhtml.CaptionDocument.Caption caption)
        {
            generatedSetterHelperImpl(caption, CAPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "caption" element
         */
        public org.w3.x1999.xhtml.CaptionDocument.Caption addNewCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.CaptionDocument.Caption target = null;
                target = (org.w3.x1999.xhtml.CaptionDocument.Caption)get_store().add_element_user(CAPTION$0);
                return target;
            }
        }
        
        /**
         * Unsets the "caption" element
         */
        public void unsetCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CAPTION$0, 0);
            }
        }
        
        /**
         * Gets array of all "col" elements
         */
        public org.w3.x1999.xhtml.ColDocument.Col[] getColArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COL$2, targetList);
                org.w3.x1999.xhtml.ColDocument.Col[] result = new org.w3.x1999.xhtml.ColDocument.Col[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "col" element
         */
        public org.w3.x1999.xhtml.ColDocument.Col getColArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColDocument.Col target = null;
                target = (org.w3.x1999.xhtml.ColDocument.Col)get_store().find_element_user(COL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "col" element
         */
        public int sizeOfColArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COL$2);
            }
        }
        
        /**
         * Sets array of all "col" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setColArray(org.w3.x1999.xhtml.ColDocument.Col[] colArray)
        {
            check_orphaned();
            arraySetterHelper(colArray, COL$2);
        }
        
        /**
         * Sets ith "col" element
         */
        public void setColArray(int i, org.w3.x1999.xhtml.ColDocument.Col col)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColDocument.Col target = null;
                target = (org.w3.x1999.xhtml.ColDocument.Col)get_store().find_element_user(COL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(col);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "col" element
         */
        public org.w3.x1999.xhtml.ColDocument.Col insertNewCol(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColDocument.Col target = null;
                target = (org.w3.x1999.xhtml.ColDocument.Col)get_store().insert_element_user(COL$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "col" element
         */
        public org.w3.x1999.xhtml.ColDocument.Col addNewCol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColDocument.Col target = null;
                target = (org.w3.x1999.xhtml.ColDocument.Col)get_store().add_element_user(COL$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "col" element
         */
        public void removeCol(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COL$2, i);
            }
        }
        
        /**
         * Gets array of all "colgroup" elements
         */
        public org.w3.x1999.xhtml.ColgroupDocument.Colgroup[] getColgroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COLGROUP$4, targetList);
                org.w3.x1999.xhtml.ColgroupDocument.Colgroup[] result = new org.w3.x1999.xhtml.ColgroupDocument.Colgroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "colgroup" element
         */
        public org.w3.x1999.xhtml.ColgroupDocument.Colgroup getColgroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColgroupDocument.Colgroup target = null;
                target = (org.w3.x1999.xhtml.ColgroupDocument.Colgroup)get_store().find_element_user(COLGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "colgroup" element
         */
        public int sizeOfColgroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COLGROUP$4);
            }
        }
        
        /**
         * Sets array of all "colgroup" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setColgroupArray(org.w3.x1999.xhtml.ColgroupDocument.Colgroup[] colgroupArray)
        {
            check_orphaned();
            arraySetterHelper(colgroupArray, COLGROUP$4);
        }
        
        /**
         * Sets ith "colgroup" element
         */
        public void setColgroupArray(int i, org.w3.x1999.xhtml.ColgroupDocument.Colgroup colgroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColgroupDocument.Colgroup target = null;
                target = (org.w3.x1999.xhtml.ColgroupDocument.Colgroup)get_store().find_element_user(COLGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(colgroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "colgroup" element
         */
        public org.w3.x1999.xhtml.ColgroupDocument.Colgroup insertNewColgroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColgroupDocument.Colgroup target = null;
                target = (org.w3.x1999.xhtml.ColgroupDocument.Colgroup)get_store().insert_element_user(COLGROUP$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "colgroup" element
         */
        public org.w3.x1999.xhtml.ColgroupDocument.Colgroup addNewColgroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.ColgroupDocument.Colgroup target = null;
                target = (org.w3.x1999.xhtml.ColgroupDocument.Colgroup)get_store().add_element_user(COLGROUP$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "colgroup" element
         */
        public void removeColgroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COLGROUP$4, i);
            }
        }
        
        /**
         * Gets the "thead" element
         */
        public org.w3.x1999.xhtml.TheadDocument.Thead getThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TheadDocument.Thead target = null;
                target = (org.w3.x1999.xhtml.TheadDocument.Thead)get_store().find_element_user(THEAD$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "thead" element
         */
        public boolean isSetThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(THEAD$6) != 0;
            }
        }
        
        /**
         * Sets the "thead" element
         */
        public void setThead(org.w3.x1999.xhtml.TheadDocument.Thead thead)
        {
            generatedSetterHelperImpl(thead, THEAD$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "thead" element
         */
        public org.w3.x1999.xhtml.TheadDocument.Thead addNewThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TheadDocument.Thead target = null;
                target = (org.w3.x1999.xhtml.TheadDocument.Thead)get_store().add_element_user(THEAD$6);
                return target;
            }
        }
        
        /**
         * Unsets the "thead" element
         */
        public void unsetThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(THEAD$6, 0);
            }
        }
        
        /**
         * Gets the "tfoot" element
         */
        public org.w3.x1999.xhtml.TfootDocument.Tfoot getTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TfootDocument.Tfoot target = null;
                target = (org.w3.x1999.xhtml.TfootDocument.Tfoot)get_store().find_element_user(TFOOT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "tfoot" element
         */
        public boolean isSetTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TFOOT$8) != 0;
            }
        }
        
        /**
         * Sets the "tfoot" element
         */
        public void setTfoot(org.w3.x1999.xhtml.TfootDocument.Tfoot tfoot)
        {
            generatedSetterHelperImpl(tfoot, TFOOT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "tfoot" element
         */
        public org.w3.x1999.xhtml.TfootDocument.Tfoot addNewTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TfootDocument.Tfoot target = null;
                target = (org.w3.x1999.xhtml.TfootDocument.Tfoot)get_store().add_element_user(TFOOT$8);
                return target;
            }
        }
        
        /**
         * Unsets the "tfoot" element
         */
        public void unsetTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TFOOT$8, 0);
            }
        }
        
        /**
         * Gets array of all "tbody" elements
         */
        public org.w3.x1999.xhtml.TbodyDocument.Tbody[] getTbodyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TBODY$10, targetList);
                org.w3.x1999.xhtml.TbodyDocument.Tbody[] result = new org.w3.x1999.xhtml.TbodyDocument.Tbody[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tbody" element
         */
        public org.w3.x1999.xhtml.TbodyDocument.Tbody getTbodyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TbodyDocument.Tbody target = null;
                target = (org.w3.x1999.xhtml.TbodyDocument.Tbody)get_store().find_element_user(TBODY$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tbody" element
         */
        public int sizeOfTbodyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TBODY$10);
            }
        }
        
        /**
         * Sets array of all "tbody" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTbodyArray(org.w3.x1999.xhtml.TbodyDocument.Tbody[] tbodyArray)
        {
            check_orphaned();
            arraySetterHelper(tbodyArray, TBODY$10);
        }
        
        /**
         * Sets ith "tbody" element
         */
        public void setTbodyArray(int i, org.w3.x1999.xhtml.TbodyDocument.Tbody tbody)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TbodyDocument.Tbody target = null;
                target = (org.w3.x1999.xhtml.TbodyDocument.Tbody)get_store().find_element_user(TBODY$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tbody);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tbody" element
         */
        public org.w3.x1999.xhtml.TbodyDocument.Tbody insertNewTbody(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TbodyDocument.Tbody target = null;
                target = (org.w3.x1999.xhtml.TbodyDocument.Tbody)get_store().insert_element_user(TBODY$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tbody" element
         */
        public org.w3.x1999.xhtml.TbodyDocument.Tbody addNewTbody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TbodyDocument.Tbody target = null;
                target = (org.w3.x1999.xhtml.TbodyDocument.Tbody)get_store().add_element_user(TBODY$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "tbody" element
         */
        public void removeTbody(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TBODY$10, i);
            }
        }
        
        /**
         * Gets array of all "tr" elements
         */
        public org.w3.x1999.xhtml.TrDocument.Tr[] getTrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TR$12, targetList);
                org.w3.x1999.xhtml.TrDocument.Tr[] result = new org.w3.x1999.xhtml.TrDocument.Tr[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tr" element
         */
        public org.w3.x1999.xhtml.TrDocument.Tr getTrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TrDocument.Tr target = null;
                target = (org.w3.x1999.xhtml.TrDocument.Tr)get_store().find_element_user(TR$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tr" element
         */
        public int sizeOfTrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TR$12);
            }
        }
        
        /**
         * Sets array of all "tr" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTrArray(org.w3.x1999.xhtml.TrDocument.Tr[] trArray)
        {
            check_orphaned();
            arraySetterHelper(trArray, TR$12);
        }
        
        /**
         * Sets ith "tr" element
         */
        public void setTrArray(int i, org.w3.x1999.xhtml.TrDocument.Tr tr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TrDocument.Tr target = null;
                target = (org.w3.x1999.xhtml.TrDocument.Tr)get_store().find_element_user(TR$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(tr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tr" element
         */
        public org.w3.x1999.xhtml.TrDocument.Tr insertNewTr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TrDocument.Tr target = null;
                target = (org.w3.x1999.xhtml.TrDocument.Tr)get_store().insert_element_user(TR$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tr" element
         */
        public org.w3.x1999.xhtml.TrDocument.Tr addNewTr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TrDocument.Tr target = null;
                target = (org.w3.x1999.xhtml.TrDocument.Tr)get_store().add_element_user(TR$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "tr" element
         */
        public void removeTr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TR$12, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
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
                return get_store().find_attribute_user(ID$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$14);
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
                get_store().remove_attribute(ID$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$16);
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
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(CLASS1$16);
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
                return get_store().find_attribute_user(CLASS1$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$16);
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
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(CLASS1$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(CLASS1$16);
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
                get_store().remove_attribute(CLASS1$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$18);
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
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$18);
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
                return get_store().find_attribute_user(STYLE$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$18);
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
                target = (org.w3.x1999.xhtml.StyleSheet)get_store().find_attribute_user(STYLE$18);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.StyleSheet)get_store().add_attribute_user(STYLE$18);
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
                get_store().remove_attribute(STYLE$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$20);
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
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$20);
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
                return get_store().find_attribute_user(TITLE$20) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$20);
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
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(TITLE$20);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Text)get_store().add_attribute_user(TITLE$20);
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
                get_store().remove_attribute(TITLE$20);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$22);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$22);
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
                return get_store().find_attribute_user(LANG$22) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$22);
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
                target = (org.w3.x1999.xhtml.LanguageCode)get_store().find_attribute_user(LANG$22);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.LanguageCode)get_store().add_attribute_user(LANG$22);
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
                get_store().remove_attribute(LANG$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$24);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$24);
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
                return get_store().find_attribute_user(LANG2$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG2$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG2$24);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG2$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG2$24);
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
                get_store().remove_attribute(LANG2$24);
            }
        }
        
        /**
         * Gets the "dir" attribute
         */
        public org.w3.x1999.xhtml.TableDocument.Table.Dir.Enum getDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$26);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.TableDocument.Table.Dir.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        public org.w3.x1999.xhtml.TableDocument.Table.Dir xgetDir()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table.Dir target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table.Dir)get_store().find_attribute_user(DIR$26);
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
                return get_store().find_attribute_user(DIR$26) != null;
            }
        }
        
        /**
         * Sets the "dir" attribute
         */
        public void setDir(org.w3.x1999.xhtml.TableDocument.Table.Dir.Enum dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIR$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIR$26);
                }
                target.setEnumValue(dir);
            }
        }
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        public void xsetDir(org.w3.x1999.xhtml.TableDocument.Table.Dir dir)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TableDocument.Table.Dir target = null;
                target = (org.w3.x1999.xhtml.TableDocument.Table.Dir)get_store().find_attribute_user(DIR$26);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.TableDocument.Table.Dir)get_store().add_attribute_user(DIR$26);
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
                get_store().remove_attribute(DIR$26);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$28);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$28);
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
                return get_store().find_attribute_user(ONCLICK$28) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONCLICK$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONCLICK$28);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONCLICK$28);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONCLICK$28);
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
                get_store().remove_attribute(ONCLICK$28);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$30);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$30);
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
                return get_store().find_attribute_user(ONDBLCLICK$30) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONDBLCLICK$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONDBLCLICK$30);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONDBLCLICK$30);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONDBLCLICK$30);
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
                get_store().remove_attribute(ONDBLCLICK$30);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$32);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$32);
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
                return get_store().find_attribute_user(ONMOUSEDOWN$32) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEDOWN$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEDOWN$32);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEDOWN$32);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEDOWN$32);
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
                get_store().remove_attribute(ONMOUSEDOWN$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$34);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$34);
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
                return get_store().find_attribute_user(ONMOUSEUP$34) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEUP$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEUP$34);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEUP$34);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEUP$34);
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
                get_store().remove_attribute(ONMOUSEUP$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$36);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$36);
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
                return get_store().find_attribute_user(ONMOUSEOVER$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOVER$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOVER$36);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOVER$36);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOVER$36);
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
                get_store().remove_attribute(ONMOUSEOVER$36);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$38);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$38);
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
                return get_store().find_attribute_user(ONMOUSEMOVE$38) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEMOVE$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEMOVE$38);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEMOVE$38);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEMOVE$38);
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
                get_store().remove_attribute(ONMOUSEMOVE$38);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$40);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$40);
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
                return get_store().find_attribute_user(ONMOUSEOUT$40) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONMOUSEOUT$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONMOUSEOUT$40);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONMOUSEOUT$40);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONMOUSEOUT$40);
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
                get_store().remove_attribute(ONMOUSEOUT$40);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$42);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$42);
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
                return get_store().find_attribute_user(ONKEYPRESS$42) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYPRESS$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYPRESS$42);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYPRESS$42);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYPRESS$42);
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
                get_store().remove_attribute(ONKEYPRESS$42);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$44);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$44);
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
                return get_store().find_attribute_user(ONKEYDOWN$44) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYDOWN$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYDOWN$44);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYDOWN$44);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYDOWN$44);
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
                get_store().remove_attribute(ONKEYDOWN$44);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$46);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$46);
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
                return get_store().find_attribute_user(ONKEYUP$46) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ONKEYUP$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ONKEYUP$46);
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
                target = (org.w3.x1999.xhtml.Script)get_store().find_attribute_user(ONKEYUP$46);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Script)get_store().add_attribute_user(ONKEYUP$46);
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
                get_store().remove_attribute(ONKEYUP$46);
            }
        }
        
        /**
         * Gets the "summary" attribute
         */
        public java.lang.String getSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARY$48);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "summary" attribute
         */
        public org.w3.x1999.xhtml.Text xgetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Text target = null;
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(SUMMARY$48);
                return target;
            }
        }
        
        /**
         * True if has "summary" attribute
         */
        public boolean isSetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUMMARY$48) != null;
            }
        }
        
        /**
         * Sets the "summary" attribute
         */
        public void setSummary(java.lang.String summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARY$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUMMARY$48);
                }
                target.setStringValue(summary);
            }
        }
        
        /**
         * Sets (as xml) the "summary" attribute
         */
        public void xsetSummary(org.w3.x1999.xhtml.Text summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Text target = null;
                target = (org.w3.x1999.xhtml.Text)get_store().find_attribute_user(SUMMARY$48);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Text)get_store().add_attribute_user(SUMMARY$48);
                }
                target.set(summary);
            }
        }
        
        /**
         * Unsets the "summary" attribute
         */
        public void unsetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUMMARY$48);
            }
        }
        
        /**
         * Gets the "width" attribute
         */
        public java.lang.String getWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$50);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "width" attribute
         */
        public org.w3.x1999.xhtml.Length xgetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Length target = null;
                target = (org.w3.x1999.xhtml.Length)get_store().find_attribute_user(WIDTH$50);
                return target;
            }
        }
        
        /**
         * True if has "width" attribute
         */
        public boolean isSetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WIDTH$50) != null;
            }
        }
        
        /**
         * Sets the "width" attribute
         */
        public void setWidth(java.lang.String width)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$50);
                }
                target.setStringValue(width);
            }
        }
        
        /**
         * Sets (as xml) the "width" attribute
         */
        public void xsetWidth(org.w3.x1999.xhtml.Length width)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Length target = null;
                target = (org.w3.x1999.xhtml.Length)get_store().find_attribute_user(WIDTH$50);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Length)get_store().add_attribute_user(WIDTH$50);
                }
                target.set(width);
            }
        }
        
        /**
         * Unsets the "width" attribute
         */
        public void unsetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WIDTH$50);
            }
        }
        
        /**
         * Gets the "border" attribute
         */
        public java.math.BigInteger getBorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDER$52);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "border" attribute
         */
        public org.w3.x1999.xhtml.Pixels xgetBorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Pixels target = null;
                target = (org.w3.x1999.xhtml.Pixels)get_store().find_attribute_user(BORDER$52);
                return target;
            }
        }
        
        /**
         * True if has "border" attribute
         */
        public boolean isSetBorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BORDER$52) != null;
            }
        }
        
        /**
         * Sets the "border" attribute
         */
        public void setBorder(java.math.BigInteger border)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDER$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDER$52);
                }
                target.setBigIntegerValue(border);
            }
        }
        
        /**
         * Sets (as xml) the "border" attribute
         */
        public void xsetBorder(org.w3.x1999.xhtml.Pixels border)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Pixels target = null;
                target = (org.w3.x1999.xhtml.Pixels)get_store().find_attribute_user(BORDER$52);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Pixels)get_store().add_attribute_user(BORDER$52);
                }
                target.set(border);
            }
        }
        
        /**
         * Unsets the "border" attribute
         */
        public void unsetBorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BORDER$52);
            }
        }
        
        /**
         * Gets the "frame" attribute
         */
        public org.w3.x1999.xhtml.TFrame.Enum getFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$54);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.TFrame.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "frame" attribute
         */
        public org.w3.x1999.xhtml.TFrame xgetFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TFrame target = null;
                target = (org.w3.x1999.xhtml.TFrame)get_store().find_attribute_user(FRAME$54);
                return target;
            }
        }
        
        /**
         * True if has "frame" attribute
         */
        public boolean isSetFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FRAME$54) != null;
            }
        }
        
        /**
         * Sets the "frame" attribute
         */
        public void setFrame(org.w3.x1999.xhtml.TFrame.Enum frame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$54);
                }
                target.setEnumValue(frame);
            }
        }
        
        /**
         * Sets (as xml) the "frame" attribute
         */
        public void xsetFrame(org.w3.x1999.xhtml.TFrame frame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TFrame target = null;
                target = (org.w3.x1999.xhtml.TFrame)get_store().find_attribute_user(FRAME$54);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.TFrame)get_store().add_attribute_user(FRAME$54);
                }
                target.set(frame);
            }
        }
        
        /**
         * Unsets the "frame" attribute
         */
        public void unsetFrame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FRAME$54);
            }
        }
        
        /**
         * Gets the "rules" attribute
         */
        public org.w3.x1999.xhtml.TRules.Enum getRules()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULES$56);
                if (target == null)
                {
                    return null;
                }
                return (org.w3.x1999.xhtml.TRules.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "rules" attribute
         */
        public org.w3.x1999.xhtml.TRules xgetRules()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TRules target = null;
                target = (org.w3.x1999.xhtml.TRules)get_store().find_attribute_user(RULES$56);
                return target;
            }
        }
        
        /**
         * True if has "rules" attribute
         */
        public boolean isSetRules()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RULES$56) != null;
            }
        }
        
        /**
         * Sets the "rules" attribute
         */
        public void setRules(org.w3.x1999.xhtml.TRules.Enum rules)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULES$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RULES$56);
                }
                target.setEnumValue(rules);
            }
        }
        
        /**
         * Sets (as xml) the "rules" attribute
         */
        public void xsetRules(org.w3.x1999.xhtml.TRules rules)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.TRules target = null;
                target = (org.w3.x1999.xhtml.TRules)get_store().find_attribute_user(RULES$56);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.TRules)get_store().add_attribute_user(RULES$56);
                }
                target.set(rules);
            }
        }
        
        /**
         * Unsets the "rules" attribute
         */
        public void unsetRules()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RULES$56);
            }
        }
        
        /**
         * Gets the "cellspacing" attribute
         */
        public java.lang.String getCellspacing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLSPACING$58);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cellspacing" attribute
         */
        public org.w3.x1999.xhtml.Length xgetCellspacing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Length target = null;
                target = (org.w3.x1999.xhtml.Length)get_store().find_attribute_user(CELLSPACING$58);
                return target;
            }
        }
        
        /**
         * True if has "cellspacing" attribute
         */
        public boolean isSetCellspacing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CELLSPACING$58) != null;
            }
        }
        
        /**
         * Sets the "cellspacing" attribute
         */
        public void setCellspacing(java.lang.String cellspacing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLSPACING$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLSPACING$58);
                }
                target.setStringValue(cellspacing);
            }
        }
        
        /**
         * Sets (as xml) the "cellspacing" attribute
         */
        public void xsetCellspacing(org.w3.x1999.xhtml.Length cellspacing)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Length target = null;
                target = (org.w3.x1999.xhtml.Length)get_store().find_attribute_user(CELLSPACING$58);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Length)get_store().add_attribute_user(CELLSPACING$58);
                }
                target.set(cellspacing);
            }
        }
        
        /**
         * Unsets the "cellspacing" attribute
         */
        public void unsetCellspacing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CELLSPACING$58);
            }
        }
        
        /**
         * Gets the "cellpadding" attribute
         */
        public java.lang.String getCellpadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLPADDING$60);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cellpadding" attribute
         */
        public org.w3.x1999.xhtml.Length xgetCellpadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Length target = null;
                target = (org.w3.x1999.xhtml.Length)get_store().find_attribute_user(CELLPADDING$60);
                return target;
            }
        }
        
        /**
         * True if has "cellpadding" attribute
         */
        public boolean isSetCellpadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CELLPADDING$60) != null;
            }
        }
        
        /**
         * Sets the "cellpadding" attribute
         */
        public void setCellpadding(java.lang.String cellpadding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLPADDING$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLPADDING$60);
                }
                target.setStringValue(cellpadding);
            }
        }
        
        /**
         * Sets (as xml) the "cellpadding" attribute
         */
        public void xsetCellpadding(org.w3.x1999.xhtml.Length cellpadding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x1999.xhtml.Length target = null;
                target = (org.w3.x1999.xhtml.Length)get_store().find_attribute_user(CELLPADDING$60);
                if (target == null)
                {
                    target = (org.w3.x1999.xhtml.Length)get_store().add_attribute_user(CELLPADDING$60);
                }
                target.set(cellpadding);
            }
        }
        
        /**
         * Unsets the "cellpadding" attribute
         */
        public void unsetCellpadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CELLPADDING$60);
            }
        }
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.TableDocument$Table$Dir.
         */
        public static class DirImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.w3.x1999.xhtml.TableDocument.Table.Dir
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
