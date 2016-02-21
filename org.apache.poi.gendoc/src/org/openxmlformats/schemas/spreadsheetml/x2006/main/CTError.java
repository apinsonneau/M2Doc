/*
 * XML Type:  CT_Error
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Error(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTError extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTError.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cterrored27type");
    
    /**
     * Gets the "tpls" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples getTpls();
    
    /**
     * True if has "tpls" element
     */
    boolean isSetTpls();
    
    /**
     * Sets the "tpls" element
     */
    void setTpls(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples tpls);
    
    /**
     * Appends and returns a new empty "tpls" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTuples addNewTpls();
    
    /**
     * Unsets the "tpls" element
     */
    void unsetTpls();
    
    /**
     * Gets a List of "x" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX> getXList();
    
    /**
     * Gets array of all "x" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] getXArray();
    
    /**
     * Gets ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX getXArray(int i);
    
    /**
     * Returns number of "x" element
     */
    int sizeOfXArray();
    
    /**
     * Sets array of all "x" element
     */
    void setXArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX[] xArray);
    
    /**
     * Sets ith "x" element
     */
    void setXArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX x);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX insertNewX(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "x" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX addNewX();
    
    /**
     * Removes the ith "x" element
     */
    void removeX(int i);
    
    /**
     * Gets the "v" attribute
     */
    java.lang.String getV();
    
    /**
     * Gets (as xml) the "v" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetV();
    
    /**
     * Sets the "v" attribute
     */
    void setV(java.lang.String v);
    
    /**
     * Sets (as xml) the "v" attribute
     */
    void xsetV(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring v);
    
    /**
     * Gets the "u" attribute
     */
    boolean getU();
    
    /**
     * Gets (as xml) the "u" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetU();
    
    /**
     * True if has "u" attribute
     */
    boolean isSetU();
    
    /**
     * Sets the "u" attribute
     */
    void setU(boolean u);
    
    /**
     * Sets (as xml) the "u" attribute
     */
    void xsetU(org.apache.xmlbeans.XmlBoolean u);
    
    /**
     * Unsets the "u" attribute
     */
    void unsetU();
    
    /**
     * Gets the "f" attribute
     */
    boolean getF();
    
    /**
     * Gets (as xml) the "f" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetF();
    
    /**
     * True if has "f" attribute
     */
    boolean isSetF();
    
    /**
     * Sets the "f" attribute
     */
    void setF(boolean f);
    
    /**
     * Sets (as xml) the "f" attribute
     */
    void xsetF(org.apache.xmlbeans.XmlBoolean f);
    
    /**
     * Unsets the "f" attribute
     */
    void unsetF();
    
    /**
     * Gets the "c" attribute
     */
    java.lang.String getC();
    
    /**
     * Gets (as xml) the "c" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring xgetC();
    
    /**
     * True if has "c" attribute
     */
    boolean isSetC();
    
    /**
     * Sets the "c" attribute
     */
    void setC(java.lang.String c);
    
    /**
     * Sets (as xml) the "c" attribute
     */
    void xsetC(org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring c);
    
    /**
     * Unsets the "c" attribute
     */
    void unsetC();
    
    /**
     * Gets the "cp" attribute
     */
    long getCp();
    
    /**
     * Gets (as xml) the "cp" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCp();
    
    /**
     * True if has "cp" attribute
     */
    boolean isSetCp();
    
    /**
     * Sets the "cp" attribute
     */
    void setCp(long cp);
    
    /**
     * Sets (as xml) the "cp" attribute
     */
    void xsetCp(org.apache.xmlbeans.XmlUnsignedInt cp);
    
    /**
     * Unsets the "cp" attribute
     */
    void unsetCp();
    
    /**
     * Gets the "in" attribute
     */
    long getIn();
    
    /**
     * Gets (as xml) the "in" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetIn();
    
    /**
     * True if has "in" attribute
     */
    boolean isSetIn();
    
    /**
     * Sets the "in" attribute
     */
    void setIn(long in);
    
    /**
     * Sets (as xml) the "in" attribute
     */
    void xsetIn(org.apache.xmlbeans.XmlUnsignedInt in);
    
    /**
     * Unsets the "in" attribute
     */
    void unsetIn();
    
    /**
     * Gets the "bc" attribute
     */
    byte[] getBc();
    
    /**
     * Gets (as xml) the "bc" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetBc();
    
    /**
     * True if has "bc" attribute
     */
    boolean isSetBc();
    
    /**
     * Sets the "bc" attribute
     */
    void setBc(byte[] bc);
    
    /**
     * Sets (as xml) the "bc" attribute
     */
    void xsetBc(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex bc);
    
    /**
     * Unsets the "bc" attribute
     */
    void unsetBc();
    
    /**
     * Gets the "fc" attribute
     */
    byte[] getFc();
    
    /**
     * Gets (as xml) the "fc" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex xgetFc();
    
    /**
     * True if has "fc" attribute
     */
    boolean isSetFc();
    
    /**
     * Sets the "fc" attribute
     */
    void setFc(byte[] fc);
    
    /**
     * Sets (as xml) the "fc" attribute
     */
    void xsetFc(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnsignedIntHex fc);
    
    /**
     * Unsets the "fc" attribute
     */
    void unsetFc();
    
    /**
     * Gets the "i" attribute
     */
    boolean getI();
    
    /**
     * Gets (as xml) the "i" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetI();
    
    /**
     * True if has "i" attribute
     */
    boolean isSetI();
    
    /**
     * Sets the "i" attribute
     */
    void setI(boolean iValue);
    
    /**
     * Sets (as xml) the "i" attribute
     */
    void xsetI(org.apache.xmlbeans.XmlBoolean iValue);
    
    /**
     * Unsets the "i" attribute
     */
    void unsetI();
    
    /**
     * Gets the "un" attribute
     */
    boolean getUn();
    
    /**
     * Gets (as xml) the "un" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUn();
    
    /**
     * True if has "un" attribute
     */
    boolean isSetUn();
    
    /**
     * Sets the "un" attribute
     */
    void setUn(boolean un);
    
    /**
     * Sets (as xml) the "un" attribute
     */
    void xsetUn(org.apache.xmlbeans.XmlBoolean un);
    
    /**
     * Unsets the "un" attribute
     */
    void unsetUn();
    
    /**
     * Gets the "st" attribute
     */
    boolean getSt();
    
    /**
     * Gets (as xml) the "st" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSt();
    
    /**
     * True if has "st" attribute
     */
    boolean isSetSt();
    
    /**
     * Sets the "st" attribute
     */
    void setSt(boolean st);
    
    /**
     * Sets (as xml) the "st" attribute
     */
    void xsetSt(org.apache.xmlbeans.XmlBoolean st);
    
    /**
     * Unsets the "st" attribute
     */
    void unsetSt();
    
    /**
     * Gets the "b" attribute
     */
    boolean getB();
    
    /**
     * Gets (as xml) the "b" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetB();
    
    /**
     * True if has "b" attribute
     */
    boolean isSetB();
    
    /**
     * Sets the "b" attribute
     */
    void setB(boolean b);
    
    /**
     * Sets (as xml) the "b" attribute
     */
    void xsetB(org.apache.xmlbeans.XmlBoolean b);
    
    /**
     * Unsets the "b" attribute
     */
    void unsetB();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError newInstance() {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}