/*
 * XML Type:  CT_ShortHexNumber
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_ShortHexNumber(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTShortHexNumberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShortHexNumber
{
    
    public CTShortHexNumberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VAL$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "val");
    
    
    /**
     * Gets the "val" attribute
     */
    public byte[] getVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "val" attribute
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber xgetVal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().find_attribute_user(VAL$0);
            return target;
        }
    }
    
    /**
     * Sets the "val" attribute
     */
    public void setVal(byte[] val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAL$0);
            }
            target.setByteArrayValue(val);
        }
    }
    
    /**
     * Sets (as xml) the "val" attribute
     */
    public void xsetVal(org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber val)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().find_attribute_user(VAL$0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.STShortHexNumber)get_store().add_attribute_user(VAL$0);
            }
            target.set(val);
        }
    }
}