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
public class TCursorConfig implements org.apache.thrift.TBase<TCursorConfig, TCursorConfig._Fields>, java.io.Serializable, Cloneable, Comparable<TCursorConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCursorConfig");

  private static final org.apache.thrift.protocol.TField BULK_CURSOR_FIELD_DESC = new org.apache.thrift.protocol.TField("bulkCursor", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ISO_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("isoLevel", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCursorConfigStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCursorConfigTupleSchemeFactory());
  }

  public boolean bulkCursor; // optional
  public TIsolationLevel isoLevel; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BULK_CURSOR((short)1, "bulkCursor"),
    ISO_LEVEL((short)2, "isoLevel");

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
        case 1: // BULK_CURSOR
          return BULK_CURSOR;
        case 2: // ISO_LEVEL
          return ISO_LEVEL;
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
  private static final int __BULKCURSOR_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BULK_CURSOR,_Fields.ISO_LEVEL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BULK_CURSOR, new org.apache.thrift.meta_data.FieldMetaData("bulkCursor", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ISO_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("isoLevel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "TIsolationLevel")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCursorConfig.class, metaDataMap);
  }

  public TCursorConfig() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCursorConfig(TCursorConfig other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bulkCursor = other.bulkCursor;
    if (other.isSetIsoLevel()) {
      this.isoLevel = other.isoLevel;
    }
  }

  public TCursorConfig deepCopy() {
    return new TCursorConfig(this);
  }

  @Override
  public void clear() {
    setBulkCursorIsSet(false);
    this.bulkCursor = false;
    this.isoLevel = null;
  }

  public boolean isBulkCursor() {
    return this.bulkCursor;
  }

  public TCursorConfig setBulkCursor(boolean bulkCursor) {
    this.bulkCursor = bulkCursor;
    setBulkCursorIsSet(true);
    return this;
  }

  public void unsetBulkCursor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BULKCURSOR_ISSET_ID);
  }

  /** Returns true if field bulkCursor is set (has been assigned a value) and false otherwise */
  public boolean isSetBulkCursor() {
    return EncodingUtils.testBit(__isset_bitfield, __BULKCURSOR_ISSET_ID);
  }

  public void setBulkCursorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BULKCURSOR_ISSET_ID, value);
  }

  public TIsolationLevel getIsoLevel() {
    return this.isoLevel;
  }

  public TCursorConfig setIsoLevel(TIsolationLevel isoLevel) {
    this.isoLevel = isoLevel;
    return this;
  }

  public void unsetIsoLevel() {
    this.isoLevel = null;
  }

  /** Returns true if field isoLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetIsoLevel() {
    return this.isoLevel != null;
  }

  public void setIsoLevelIsSet(boolean value) {
    if (!value) {
      this.isoLevel = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BULK_CURSOR:
      if (value == null) {
        unsetBulkCursor();
      } else {
        setBulkCursor((Boolean)value);
      }
      break;

    case ISO_LEVEL:
      if (value == null) {
        unsetIsoLevel();
      } else {
        setIsoLevel((TIsolationLevel)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BULK_CURSOR:
      return Boolean.valueOf(isBulkCursor());

    case ISO_LEVEL:
      return getIsoLevel();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BULK_CURSOR:
      return isSetBulkCursor();
    case ISO_LEVEL:
      return isSetIsoLevel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCursorConfig)
      return this.equals((TCursorConfig)that);
    return false;
  }

  public boolean equals(TCursorConfig that) {
    if (that == null)
      return false;

    boolean this_present_bulkCursor = true && this.isSetBulkCursor();
    boolean that_present_bulkCursor = true && that.isSetBulkCursor();
    if (this_present_bulkCursor || that_present_bulkCursor) {
      if (!(this_present_bulkCursor && that_present_bulkCursor))
        return false;
      if (this.bulkCursor != that.bulkCursor)
        return false;
    }

    boolean this_present_isoLevel = true && this.isSetIsoLevel();
    boolean that_present_isoLevel = true && that.isSetIsoLevel();
    if (this_present_isoLevel || that_present_isoLevel) {
      if (!(this_present_isoLevel && that_present_isoLevel))
        return false;
      if (!this.isoLevel.equals(that.isoLevel))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_bulkCursor = true && (isSetBulkCursor());
    list.add(present_bulkCursor);
    if (present_bulkCursor)
      list.add(bulkCursor);

    boolean present_isoLevel = true && (isSetIsoLevel());
    list.add(present_isoLevel);
    if (present_isoLevel)
      list.add(isoLevel.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(TCursorConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBulkCursor()).compareTo(other.isSetBulkCursor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBulkCursor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bulkCursor, other.bulkCursor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsoLevel()).compareTo(other.isSetIsoLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsoLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isoLevel, other.isoLevel);
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
    StringBuilder sb = new StringBuilder("TCursorConfig(");
    boolean first = true;

    if (isSetBulkCursor()) {
      sb.append("bulkCursor:");
      sb.append(this.bulkCursor);
      first = false;
    }
    if (isSetIsoLevel()) {
      if (!first) sb.append(", ");
      sb.append("isoLevel:");
      if (this.isoLevel == null) {
        sb.append("null");
      } else {
        sb.append(this.isoLevel);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCursorConfigStandardSchemeFactory implements SchemeFactory {
    public TCursorConfigStandardScheme getScheme() {
      return new TCursorConfigStandardScheme();
    }
  }

  private static class TCursorConfigStandardScheme extends StandardScheme<TCursorConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCursorConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BULK_CURSOR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.bulkCursor = iprot.readBool();
              struct.setBulkCursorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ISO_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.isoLevel = com.sleepycat.thrift.TIsolationLevel.findByValue(iprot.readI32());
              struct.setIsoLevelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCursorConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBulkCursor()) {
        oprot.writeFieldBegin(BULK_CURSOR_FIELD_DESC);
        oprot.writeBool(struct.bulkCursor);
        oprot.writeFieldEnd();
      }
      if (struct.isoLevel != null) {
        if (struct.isSetIsoLevel()) {
          oprot.writeFieldBegin(ISO_LEVEL_FIELD_DESC);
          oprot.writeI32(struct.isoLevel.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCursorConfigTupleSchemeFactory implements SchemeFactory {
    public TCursorConfigTupleScheme getScheme() {
      return new TCursorConfigTupleScheme();
    }
  }

  private static class TCursorConfigTupleScheme extends TupleScheme<TCursorConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCursorConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBulkCursor()) {
        optionals.set(0);
      }
      if (struct.isSetIsoLevel()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBulkCursor()) {
        oprot.writeBool(struct.bulkCursor);
      }
      if (struct.isSetIsoLevel()) {
        oprot.writeI32(struct.isoLevel.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCursorConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.bulkCursor = iprot.readBool();
        struct.setBulkCursorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isoLevel = com.sleepycat.thrift.TIsolationLevel.findByValue(iprot.readI32());
        struct.setIsoLevelIsSet(true);
      }
    }
  }

}

