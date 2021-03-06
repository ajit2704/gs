/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-9")
public class TGetWithPKeyResult implements org.apache.thrift.TBase<TGetWithPKeyResult, TGetWithPKeyResult._Fields>, java.io.Serializable, Cloneable, Comparable<TGetWithPKeyResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetWithPKeyResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TUPLE_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetWithPKeyResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetWithPKeyResultTupleSchemeFactory());
  }

  /**
   * 
   * @see TOperationStatus
   */
  public TOperationStatus status; // required
  public TKeyDataWithPKey tuple; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TOperationStatus
     */
    STATUS((short)1, "status"),
    TUPLE((short)2, "tuple");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // TUPLE
          return TUPLE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TUPLE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TOperationStatus.class)));
    tmpMap.put(_Fields.TUPLE, new org.apache.thrift.meta_data.FieldMetaData("tuple", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TKeyDataWithPKey.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetWithPKeyResult.class, metaDataMap);
  }

  public TGetWithPKeyResult() {
  }

  public TGetWithPKeyResult(
    TOperationStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetWithPKeyResult(TGetWithPKeyResult other) {
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetTuple()) {
      this.tuple = new TKeyDataWithPKey(other.tuple);
    }
  }

  public TGetWithPKeyResult deepCopy() {
    return new TGetWithPKeyResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.tuple = null;
  }

  /**
   * 
   * @see TOperationStatus
   */
  public TOperationStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see TOperationStatus
   */
  public TGetWithPKeyResult setStatus(TOperationStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public TKeyDataWithPKey getTuple() {
    return this.tuple;
  }

  public TGetWithPKeyResult setTuple(TKeyDataWithPKey tuple) {
    this.tuple = tuple;
    return this;
  }

  public void unsetTuple() {
    this.tuple = null;
  }

  /** Returns true if field tuple is set (has been assigned a value) and false otherwise */
  public boolean isSetTuple() {
    return this.tuple != null;
  }

  public void setTupleIsSet(boolean value) {
    if (!value) {
      this.tuple = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((TOperationStatus)value);
      }
      break;

    case TUPLE:
      if (value == null) {
        unsetTuple();
      } else {
        setTuple((TKeyDataWithPKey)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case TUPLE:
      return getTuple();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case TUPLE:
      return isSetTuple();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetWithPKeyResult)
      return this.equals((TGetWithPKeyResult)that);
    return false;
  }

  public boolean equals(TGetWithPKeyResult that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_tuple = true && this.isSetTuple();
    boolean that_present_tuple = true && that.isSetTuple();
    if (this_present_tuple || that_present_tuple) {
      if (!(this_present_tuple && that_present_tuple))
        return false;
      if (!this.tuple.equals(that.tuple))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_tuple = true && (isSetTuple());
    list.add(present_tuple);
    if (present_tuple)
      list.add(tuple);

    return list.hashCode();
  }

  @Override
  public int compareTo(TGetWithPKeyResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTuple()).compareTo(other.isSetTuple());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTuple()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple, other.tuple);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TGetWithPKeyResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetTuple()) {
      if (!first) sb.append(", ");
      sb.append("tuple:");
      if (this.tuple == null) {
        sb.append("null");
      } else {
        sb.append(this.tuple);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (tuple != null) {
      tuple.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TGetWithPKeyResultStandardSchemeFactory implements SchemeFactory {
    public TGetWithPKeyResultStandardScheme getScheme() {
      return new TGetWithPKeyResultStandardScheme();
    }
  }

  private static class TGetWithPKeyResultStandardScheme extends StandardScheme<TGetWithPKeyResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetWithPKeyResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.sleepycat.thrift.TOperationStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TUPLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tuple = new TKeyDataWithPKey();
              struct.tuple.read(iprot);
              struct.setTupleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetWithPKeyResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.tuple != null) {
        if (struct.isSetTuple()) {
          oprot.writeFieldBegin(TUPLE_FIELD_DESC);
          struct.tuple.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetWithPKeyResultTupleSchemeFactory implements SchemeFactory {
    public TGetWithPKeyResultTupleScheme getScheme() {
      return new TGetWithPKeyResultTupleScheme();
    }
  }

  private static class TGetWithPKeyResultTupleScheme extends TupleScheme<TGetWithPKeyResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetWithPKeyResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetTuple()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetTuple()) {
        struct.tuple.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetWithPKeyResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.status = com.sleepycat.thrift.TOperationStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tuple = new TKeyDataWithPKey();
        struct.tuple.read(iprot);
        struct.setTupleIsSet(true);
      }
    }
  }

}

