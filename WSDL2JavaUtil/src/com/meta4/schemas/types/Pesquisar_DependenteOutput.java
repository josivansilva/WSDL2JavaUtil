/**
 * Pesquisar_DependenteOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta4.schemas.types;

public class Pesquisar_DependenteOutput  implements java.io.Serializable {
    private com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteBlock cbr_Ifc_Ws_Vwdependente;

    private com.meta4.schemas.types.LogMessage[] logMessage;

    private double _return;

    public Pesquisar_DependenteOutput() {
    }

    public Pesquisar_DependenteOutput(
           com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteBlock cbr_Ifc_Ws_Vwdependente,
           com.meta4.schemas.types.LogMessage[] logMessage,
           double _return) {
           this.cbr_Ifc_Ws_Vwdependente = cbr_Ifc_Ws_Vwdependente;
           this.logMessage = logMessage;
           this._return = _return;
    }


    /**
     * Gets the cbr_Ifc_Ws_Vwdependente value for this Pesquisar_DependenteOutput.
     * 
     * @return cbr_Ifc_Ws_Vwdependente
     */
    public com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteBlock getCbr_Ifc_Ws_Vwdependente() {
        return cbr_Ifc_Ws_Vwdependente;
    }


    /**
     * Sets the cbr_Ifc_Ws_Vwdependente value for this Pesquisar_DependenteOutput.
     * 
     * @param cbr_Ifc_Ws_Vwdependente
     */
    public void setCbr_Ifc_Ws_Vwdependente(com.meta4.schemas.types.Cbr_Ifc_Ws_VwdependenteBlock cbr_Ifc_Ws_Vwdependente) {
        this.cbr_Ifc_Ws_Vwdependente = cbr_Ifc_Ws_Vwdependente;
    }


    /**
     * Gets the logMessage value for this Pesquisar_DependenteOutput.
     * 
     * @return logMessage
     */
    public com.meta4.schemas.types.LogMessage[] getLogMessage() {
        return logMessage;
    }


    /**
     * Sets the logMessage value for this Pesquisar_DependenteOutput.
     * 
     * @param logMessage
     */
    public void setLogMessage(com.meta4.schemas.types.LogMessage[] logMessage) {
        this.logMessage = logMessage;
    }


    /**
     * Gets the _return value for this Pesquisar_DependenteOutput.
     * 
     * @return _return
     */
    public double get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this Pesquisar_DependenteOutput.
     * 
     * @param _return
     */
    public void set_return(double _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pesquisar_DependenteOutput)) return false;
        Pesquisar_DependenteOutput other = (Pesquisar_DependenteOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cbr_Ifc_Ws_Vwdependente==null && other.getCbr_Ifc_Ws_Vwdependente()==null) || 
             (this.cbr_Ifc_Ws_Vwdependente!=null &&
              this.cbr_Ifc_Ws_Vwdependente.equals(other.getCbr_Ifc_Ws_Vwdependente()))) &&
            ((this.logMessage==null && other.getLogMessage()==null) || 
             (this.logMessage!=null &&
              java.util.Arrays.equals(this.logMessage, other.getLogMessage()))) &&
            this._return == other.get_return();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCbr_Ifc_Ws_Vwdependente() != null) {
            _hashCode += getCbr_Ifc_Ws_Vwdependente().hashCode();
        }
        if (getLogMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(get_return()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pesquisar_DependenteOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Pesquisar_DependenteOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cbr_Ifc_Ws_Vwdependente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cbr_Ifc_Ws_Vwdependente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "Cbr_Ifc_Ws_VwdependenteBlock"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.meta4.com/types", "LogMessage"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
