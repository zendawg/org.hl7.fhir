/*
 * An XML document type.
 * Localname: table
 * Namespace: http://www.w3.org/1999/xhtml
 * Java type: org.w3.x1999.xhtml.TableDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x1999.xhtml;


/**
 * A document containing one table(@http://www.w3.org/1999/xhtml) element.
 *
 * This is a complex type.
 */
public interface TableDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TableDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("table9e3bdoctype");
    
    /**
     * Gets the "table" element
     */
    org.w3.x1999.xhtml.TableDocument.Table getTable();
    
    /**
     * Sets the "table" element
     */
    void setTable(org.w3.x1999.xhtml.TableDocument.Table table);
    
    /**
     * Appends and returns a new empty "table" element
     */
    org.w3.x1999.xhtml.TableDocument.Table addNewTable();
    
    /**
     * An XML table(@http://www.w3.org/1999/xhtml).
     *
     * This is a complex type.
     */
    public interface Table extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Table.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("table8841elemtype");
        
        /**
         * Gets the "caption" element
         */
        org.w3.x1999.xhtml.CaptionDocument.Caption getCaption();
        
        /**
         * True if has "caption" element
         */
        boolean isSetCaption();
        
        /**
         * Sets the "caption" element
         */
        void setCaption(org.w3.x1999.xhtml.CaptionDocument.Caption caption);
        
        /**
         * Appends and returns a new empty "caption" element
         */
        org.w3.x1999.xhtml.CaptionDocument.Caption addNewCaption();
        
        /**
         * Unsets the "caption" element
         */
        void unsetCaption();
        
        /**
         * Gets array of all "col" elements
         */
        org.w3.x1999.xhtml.ColDocument.Col[] getColArray();
        
        /**
         * Gets ith "col" element
         */
        org.w3.x1999.xhtml.ColDocument.Col getColArray(int i);
        
        /**
         * Returns number of "col" element
         */
        int sizeOfColArray();
        
        /**
         * Sets array of all "col" element
         */
        void setColArray(org.w3.x1999.xhtml.ColDocument.Col[] colArray);
        
        /**
         * Sets ith "col" element
         */
        void setColArray(int i, org.w3.x1999.xhtml.ColDocument.Col col);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "col" element
         */
        org.w3.x1999.xhtml.ColDocument.Col insertNewCol(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "col" element
         */
        org.w3.x1999.xhtml.ColDocument.Col addNewCol();
        
        /**
         * Removes the ith "col" element
         */
        void removeCol(int i);
        
        /**
         * Gets array of all "colgroup" elements
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup[] getColgroupArray();
        
        /**
         * Gets ith "colgroup" element
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup getColgroupArray(int i);
        
        /**
         * Returns number of "colgroup" element
         */
        int sizeOfColgroupArray();
        
        /**
         * Sets array of all "colgroup" element
         */
        void setColgroupArray(org.w3.x1999.xhtml.ColgroupDocument.Colgroup[] colgroupArray);
        
        /**
         * Sets ith "colgroup" element
         */
        void setColgroupArray(int i, org.w3.x1999.xhtml.ColgroupDocument.Colgroup colgroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "colgroup" element
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup insertNewColgroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "colgroup" element
         */
        org.w3.x1999.xhtml.ColgroupDocument.Colgroup addNewColgroup();
        
        /**
         * Removes the ith "colgroup" element
         */
        void removeColgroup(int i);
        
        /**
         * Gets the "thead" element
         */
        org.w3.x1999.xhtml.TheadDocument.Thead getThead();
        
        /**
         * True if has "thead" element
         */
        boolean isSetThead();
        
        /**
         * Sets the "thead" element
         */
        void setThead(org.w3.x1999.xhtml.TheadDocument.Thead thead);
        
        /**
         * Appends and returns a new empty "thead" element
         */
        org.w3.x1999.xhtml.TheadDocument.Thead addNewThead();
        
        /**
         * Unsets the "thead" element
         */
        void unsetThead();
        
        /**
         * Gets the "tfoot" element
         */
        org.w3.x1999.xhtml.TfootDocument.Tfoot getTfoot();
        
        /**
         * True if has "tfoot" element
         */
        boolean isSetTfoot();
        
        /**
         * Sets the "tfoot" element
         */
        void setTfoot(org.w3.x1999.xhtml.TfootDocument.Tfoot tfoot);
        
        /**
         * Appends and returns a new empty "tfoot" element
         */
        org.w3.x1999.xhtml.TfootDocument.Tfoot addNewTfoot();
        
        /**
         * Unsets the "tfoot" element
         */
        void unsetTfoot();
        
        /**
         * Gets array of all "tbody" elements
         */
        org.w3.x1999.xhtml.TbodyDocument.Tbody[] getTbodyArray();
        
        /**
         * Gets ith "tbody" element
         */
        org.w3.x1999.xhtml.TbodyDocument.Tbody getTbodyArray(int i);
        
        /**
         * Returns number of "tbody" element
         */
        int sizeOfTbodyArray();
        
        /**
         * Sets array of all "tbody" element
         */
        void setTbodyArray(org.w3.x1999.xhtml.TbodyDocument.Tbody[] tbodyArray);
        
        /**
         * Sets ith "tbody" element
         */
        void setTbodyArray(int i, org.w3.x1999.xhtml.TbodyDocument.Tbody tbody);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tbody" element
         */
        org.w3.x1999.xhtml.TbodyDocument.Tbody insertNewTbody(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tbody" element
         */
        org.w3.x1999.xhtml.TbodyDocument.Tbody addNewTbody();
        
        /**
         * Removes the ith "tbody" element
         */
        void removeTbody(int i);
        
        /**
         * Gets array of all "tr" elements
         */
        org.w3.x1999.xhtml.TrDocument.Tr[] getTrArray();
        
        /**
         * Gets ith "tr" element
         */
        org.w3.x1999.xhtml.TrDocument.Tr getTrArray(int i);
        
        /**
         * Returns number of "tr" element
         */
        int sizeOfTrArray();
        
        /**
         * Sets array of all "tr" element
         */
        void setTrArray(org.w3.x1999.xhtml.TrDocument.Tr[] trArray);
        
        /**
         * Sets ith "tr" element
         */
        void setTrArray(int i, org.w3.x1999.xhtml.TrDocument.Tr tr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tr" element
         */
        org.w3.x1999.xhtml.TrDocument.Tr insertNewTr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tr" element
         */
        org.w3.x1999.xhtml.TrDocument.Tr addNewTr();
        
        /**
         * Removes the ith "tr" element
         */
        void removeTr(int i);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlID xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlID id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "class" attribute
         */
        java.util.List getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.apache.xmlbeans.XmlNMTOKENS xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.util.List class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.apache.xmlbeans.XmlNMTOKENS class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * Gets the "style" attribute
         */
        java.lang.String getStyle();
        
        /**
         * Gets (as xml) the "style" attribute
         */
        org.w3.x1999.xhtml.StyleSheet xgetStyle();
        
        /**
         * True if has "style" attribute
         */
        boolean isSetStyle();
        
        /**
         * Sets the "style" attribute
         */
        void setStyle(java.lang.String style);
        
        /**
         * Sets (as xml) the "style" attribute
         */
        void xsetStyle(org.w3.x1999.xhtml.StyleSheet style);
        
        /**
         * Unsets the "style" attribute
         */
        void unsetStyle();
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.w3.x1999.xhtml.Text xgetTitle();
        
        /**
         * True if has "title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.w3.x1999.xhtml.Text title);
        
        /**
         * Unsets the "title" attribute
         */
        void unsetTitle();
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.w3.x1999.xhtml.LanguageCode xgetLang();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.w3.x1999.xhtml.LanguageCode lang);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang2();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.XmlLanguage xgetLang2();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang2();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang2(java.lang.String lang2);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang2(org.apache.xmlbeans.XmlLanguage lang2);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang2();
        
        /**
         * Gets the "dir" attribute
         */
        org.w3.x1999.xhtml.TableDocument.Table.Dir.Enum getDir();
        
        /**
         * Gets (as xml) the "dir" attribute
         */
        org.w3.x1999.xhtml.TableDocument.Table.Dir xgetDir();
        
        /**
         * True if has "dir" attribute
         */
        boolean isSetDir();
        
        /**
         * Sets the "dir" attribute
         */
        void setDir(org.w3.x1999.xhtml.TableDocument.Table.Dir.Enum dir);
        
        /**
         * Sets (as xml) the "dir" attribute
         */
        void xsetDir(org.w3.x1999.xhtml.TableDocument.Table.Dir dir);
        
        /**
         * Unsets the "dir" attribute
         */
        void unsetDir();
        
        /**
         * Gets the "onclick" attribute
         */
        java.lang.String getOnclick();
        
        /**
         * Gets (as xml) the "onclick" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnclick();
        
        /**
         * True if has "onclick" attribute
         */
        boolean isSetOnclick();
        
        /**
         * Sets the "onclick" attribute
         */
        void setOnclick(java.lang.String onclick);
        
        /**
         * Sets (as xml) the "onclick" attribute
         */
        void xsetOnclick(org.w3.x1999.xhtml.Script onclick);
        
        /**
         * Unsets the "onclick" attribute
         */
        void unsetOnclick();
        
        /**
         * Gets the "ondblclick" attribute
         */
        java.lang.String getOndblclick();
        
        /**
         * Gets (as xml) the "ondblclick" attribute
         */
        org.w3.x1999.xhtml.Script xgetOndblclick();
        
        /**
         * True if has "ondblclick" attribute
         */
        boolean isSetOndblclick();
        
        /**
         * Sets the "ondblclick" attribute
         */
        void setOndblclick(java.lang.String ondblclick);
        
        /**
         * Sets (as xml) the "ondblclick" attribute
         */
        void xsetOndblclick(org.w3.x1999.xhtml.Script ondblclick);
        
        /**
         * Unsets the "ondblclick" attribute
         */
        void unsetOndblclick();
        
        /**
         * Gets the "onmousedown" attribute
         */
        java.lang.String getOnmousedown();
        
        /**
         * Gets (as xml) the "onmousedown" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmousedown();
        
        /**
         * True if has "onmousedown" attribute
         */
        boolean isSetOnmousedown();
        
        /**
         * Sets the "onmousedown" attribute
         */
        void setOnmousedown(java.lang.String onmousedown);
        
        /**
         * Sets (as xml) the "onmousedown" attribute
         */
        void xsetOnmousedown(org.w3.x1999.xhtml.Script onmousedown);
        
        /**
         * Unsets the "onmousedown" attribute
         */
        void unsetOnmousedown();
        
        /**
         * Gets the "onmouseup" attribute
         */
        java.lang.String getOnmouseup();
        
        /**
         * Gets (as xml) the "onmouseup" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseup();
        
        /**
         * True if has "onmouseup" attribute
         */
        boolean isSetOnmouseup();
        
        /**
         * Sets the "onmouseup" attribute
         */
        void setOnmouseup(java.lang.String onmouseup);
        
        /**
         * Sets (as xml) the "onmouseup" attribute
         */
        void xsetOnmouseup(org.w3.x1999.xhtml.Script onmouseup);
        
        /**
         * Unsets the "onmouseup" attribute
         */
        void unsetOnmouseup();
        
        /**
         * Gets the "onmouseover" attribute
         */
        java.lang.String getOnmouseover();
        
        /**
         * Gets (as xml) the "onmouseover" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseover();
        
        /**
         * True if has "onmouseover" attribute
         */
        boolean isSetOnmouseover();
        
        /**
         * Sets the "onmouseover" attribute
         */
        void setOnmouseover(java.lang.String onmouseover);
        
        /**
         * Sets (as xml) the "onmouseover" attribute
         */
        void xsetOnmouseover(org.w3.x1999.xhtml.Script onmouseover);
        
        /**
         * Unsets the "onmouseover" attribute
         */
        void unsetOnmouseover();
        
        /**
         * Gets the "onmousemove" attribute
         */
        java.lang.String getOnmousemove();
        
        /**
         * Gets (as xml) the "onmousemove" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmousemove();
        
        /**
         * True if has "onmousemove" attribute
         */
        boolean isSetOnmousemove();
        
        /**
         * Sets the "onmousemove" attribute
         */
        void setOnmousemove(java.lang.String onmousemove);
        
        /**
         * Sets (as xml) the "onmousemove" attribute
         */
        void xsetOnmousemove(org.w3.x1999.xhtml.Script onmousemove);
        
        /**
         * Unsets the "onmousemove" attribute
         */
        void unsetOnmousemove();
        
        /**
         * Gets the "onmouseout" attribute
         */
        java.lang.String getOnmouseout();
        
        /**
         * Gets (as xml) the "onmouseout" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnmouseout();
        
        /**
         * True if has "onmouseout" attribute
         */
        boolean isSetOnmouseout();
        
        /**
         * Sets the "onmouseout" attribute
         */
        void setOnmouseout(java.lang.String onmouseout);
        
        /**
         * Sets (as xml) the "onmouseout" attribute
         */
        void xsetOnmouseout(org.w3.x1999.xhtml.Script onmouseout);
        
        /**
         * Unsets the "onmouseout" attribute
         */
        void unsetOnmouseout();
        
        /**
         * Gets the "onkeypress" attribute
         */
        java.lang.String getOnkeypress();
        
        /**
         * Gets (as xml) the "onkeypress" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeypress();
        
        /**
         * True if has "onkeypress" attribute
         */
        boolean isSetOnkeypress();
        
        /**
         * Sets the "onkeypress" attribute
         */
        void setOnkeypress(java.lang.String onkeypress);
        
        /**
         * Sets (as xml) the "onkeypress" attribute
         */
        void xsetOnkeypress(org.w3.x1999.xhtml.Script onkeypress);
        
        /**
         * Unsets the "onkeypress" attribute
         */
        void unsetOnkeypress();
        
        /**
         * Gets the "onkeydown" attribute
         */
        java.lang.String getOnkeydown();
        
        /**
         * Gets (as xml) the "onkeydown" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeydown();
        
        /**
         * True if has "onkeydown" attribute
         */
        boolean isSetOnkeydown();
        
        /**
         * Sets the "onkeydown" attribute
         */
        void setOnkeydown(java.lang.String onkeydown);
        
        /**
         * Sets (as xml) the "onkeydown" attribute
         */
        void xsetOnkeydown(org.w3.x1999.xhtml.Script onkeydown);
        
        /**
         * Unsets the "onkeydown" attribute
         */
        void unsetOnkeydown();
        
        /**
         * Gets the "onkeyup" attribute
         */
        java.lang.String getOnkeyup();
        
        /**
         * Gets (as xml) the "onkeyup" attribute
         */
        org.w3.x1999.xhtml.Script xgetOnkeyup();
        
        /**
         * True if has "onkeyup" attribute
         */
        boolean isSetOnkeyup();
        
        /**
         * Sets the "onkeyup" attribute
         */
        void setOnkeyup(java.lang.String onkeyup);
        
        /**
         * Sets (as xml) the "onkeyup" attribute
         */
        void xsetOnkeyup(org.w3.x1999.xhtml.Script onkeyup);
        
        /**
         * Unsets the "onkeyup" attribute
         */
        void unsetOnkeyup();
        
        /**
         * Gets the "summary" attribute
         */
        java.lang.String getSummary();
        
        /**
         * Gets (as xml) the "summary" attribute
         */
        org.w3.x1999.xhtml.Text xgetSummary();
        
        /**
         * True if has "summary" attribute
         */
        boolean isSetSummary();
        
        /**
         * Sets the "summary" attribute
         */
        void setSummary(java.lang.String summary);
        
        /**
         * Sets (as xml) the "summary" attribute
         */
        void xsetSummary(org.w3.x1999.xhtml.Text summary);
        
        /**
         * Unsets the "summary" attribute
         */
        void unsetSummary();
        
        /**
         * Gets the "width" attribute
         */
        java.lang.String getWidth();
        
        /**
         * Gets (as xml) the "width" attribute
         */
        org.w3.x1999.xhtml.Length xgetWidth();
        
        /**
         * True if has "width" attribute
         */
        boolean isSetWidth();
        
        /**
         * Sets the "width" attribute
         */
        void setWidth(java.lang.String width);
        
        /**
         * Sets (as xml) the "width" attribute
         */
        void xsetWidth(org.w3.x1999.xhtml.Length width);
        
        /**
         * Unsets the "width" attribute
         */
        void unsetWidth();
        
        /**
         * Gets the "border" attribute
         */
        java.math.BigInteger getBorder();
        
        /**
         * Gets (as xml) the "border" attribute
         */
        org.w3.x1999.xhtml.Pixels xgetBorder();
        
        /**
         * True if has "border" attribute
         */
        boolean isSetBorder();
        
        /**
         * Sets the "border" attribute
         */
        void setBorder(java.math.BigInteger border);
        
        /**
         * Sets (as xml) the "border" attribute
         */
        void xsetBorder(org.w3.x1999.xhtml.Pixels border);
        
        /**
         * Unsets the "border" attribute
         */
        void unsetBorder();
        
        /**
         * Gets the "frame" attribute
         */
        org.w3.x1999.xhtml.TFrame.Enum getFrame();
        
        /**
         * Gets (as xml) the "frame" attribute
         */
        org.w3.x1999.xhtml.TFrame xgetFrame();
        
        /**
         * True if has "frame" attribute
         */
        boolean isSetFrame();
        
        /**
         * Sets the "frame" attribute
         */
        void setFrame(org.w3.x1999.xhtml.TFrame.Enum frame);
        
        /**
         * Sets (as xml) the "frame" attribute
         */
        void xsetFrame(org.w3.x1999.xhtml.TFrame frame);
        
        /**
         * Unsets the "frame" attribute
         */
        void unsetFrame();
        
        /**
         * Gets the "rules" attribute
         */
        org.w3.x1999.xhtml.TRules.Enum getRules();
        
        /**
         * Gets (as xml) the "rules" attribute
         */
        org.w3.x1999.xhtml.TRules xgetRules();
        
        /**
         * True if has "rules" attribute
         */
        boolean isSetRules();
        
        /**
         * Sets the "rules" attribute
         */
        void setRules(org.w3.x1999.xhtml.TRules.Enum rules);
        
        /**
         * Sets (as xml) the "rules" attribute
         */
        void xsetRules(org.w3.x1999.xhtml.TRules rules);
        
        /**
         * Unsets the "rules" attribute
         */
        void unsetRules();
        
        /**
         * Gets the "cellspacing" attribute
         */
        java.lang.String getCellspacing();
        
        /**
         * Gets (as xml) the "cellspacing" attribute
         */
        org.w3.x1999.xhtml.Length xgetCellspacing();
        
        /**
         * True if has "cellspacing" attribute
         */
        boolean isSetCellspacing();
        
        /**
         * Sets the "cellspacing" attribute
         */
        void setCellspacing(java.lang.String cellspacing);
        
        /**
         * Sets (as xml) the "cellspacing" attribute
         */
        void xsetCellspacing(org.w3.x1999.xhtml.Length cellspacing);
        
        /**
         * Unsets the "cellspacing" attribute
         */
        void unsetCellspacing();
        
        /**
         * Gets the "cellpadding" attribute
         */
        java.lang.String getCellpadding();
        
        /**
         * Gets (as xml) the "cellpadding" attribute
         */
        org.w3.x1999.xhtml.Length xgetCellpadding();
        
        /**
         * True if has "cellpadding" attribute
         */
        boolean isSetCellpadding();
        
        /**
         * Sets the "cellpadding" attribute
         */
        void setCellpadding(java.lang.String cellpadding);
        
        /**
         * Sets (as xml) the "cellpadding" attribute
         */
        void xsetCellpadding(org.w3.x1999.xhtml.Length cellpadding);
        
        /**
         * Unsets the "cellpadding" attribute
         */
        void unsetCellpadding();
        
        /**
         * An XML dir(@).
         *
         * This is an atomic type that is a restriction of org.w3.x1999.xhtml.TableDocument$Table$Dir.
         */
        public interface Dir extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dir.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s92E42043E21BA03841BD964CC980A9AA").resolveHandle("dir9b6cattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LTR = Enum.forString("ltr");
            static final Enum RTL = Enum.forString("rtl");
            
            static final int INT_LTR = Enum.INT_LTR;
            static final int INT_RTL = Enum.INT_RTL;
            
            /**
             * Enumeration value class for org.w3.x1999.xhtml.TableDocument$Table$Dir.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LTR
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_LTR = 1;
                static final int INT_RTL = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("ltr", INT_LTR),
                      new Enum("rtl", INT_RTL),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.w3.x1999.xhtml.TableDocument.Table.Dir newValue(java.lang.Object obj) {
                  return (org.w3.x1999.xhtml.TableDocument.Table.Dir) type.newValue( obj ); }
                
                public static org.w3.x1999.xhtml.TableDocument.Table.Dir newInstance() {
                  return (org.w3.x1999.xhtml.TableDocument.Table.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.w3.x1999.xhtml.TableDocument.Table.Dir newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.w3.x1999.xhtml.TableDocument.Table.Dir) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x1999.xhtml.TableDocument.Table newInstance() {
              return (org.w3.x1999.xhtml.TableDocument.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x1999.xhtml.TableDocument.Table newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x1999.xhtml.TableDocument.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x1999.xhtml.TableDocument newInstance() {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x1999.xhtml.TableDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x1999.xhtml.TableDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x1999.xhtml.TableDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.TableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x1999.xhtml.TableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x1999.xhtml.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
