/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class CheckConstraintsRequest implements org.apache.thrift.TBase<CheckConstraintsRequest, CheckConstraintsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<CheckConstraintsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CheckConstraintsRequest");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("db_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TBL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tbl_name", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CheckConstraintsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CheckConstraintsRequestTupleSchemeFactory());
  }

  private String db_name; // required
  private String tbl_name; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "db_name"),
    TBL_NAME((short)2, "tbl_name");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TBL_NAME
          return TBL_NAME;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("db_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL_NAME, new org.apache.thrift.meta_data.FieldMetaData("tbl_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CheckConstraintsRequest.class, metaDataMap);
  }

  public CheckConstraintsRequest() {
  }

  public CheckConstraintsRequest(
    String db_name,
    String tbl_name)
  {
    this();
    this.db_name = db_name;
    this.tbl_name = tbl_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CheckConstraintsRequest(CheckConstraintsRequest other) {
    if (other.isSetDb_name()) {
      this.db_name = other.db_name;
    }
    if (other.isSetTbl_name()) {
      this.tbl_name = other.tbl_name;
    }
  }

  public CheckConstraintsRequest deepCopy() {
    return new CheckConstraintsRequest(this);
  }

  @Override
  public void clear() {
    this.db_name = null;
    this.tbl_name = null;
  }

  public String getDb_name() {
    return this.db_name;
  }

  public void setDb_name(String db_name) {
    this.db_name = db_name;
  }

  public void unsetDb_name() {
    this.db_name = null;
  }

  /** Returns true if field db_name is set (has been assigned a value) and false otherwise */
  public boolean isSetDb_name() {
    return this.db_name != null;
  }

  public void setDb_nameIsSet(boolean value) {
    if (!value) {
      this.db_name = null;
    }
  }

  public String getTbl_name() {
    return this.tbl_name;
  }

  public void setTbl_name(String tbl_name) {
    this.tbl_name = tbl_name;
  }

  public void unsetTbl_name() {
    this.tbl_name = null;
  }

  /** Returns true if field tbl_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTbl_name() {
    return this.tbl_name != null;
  }

  public void setTbl_nameIsSet(boolean value) {
    if (!value) {
      this.tbl_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDb_name();
      } else {
        setDb_name((String)value);
      }
      break;

    case TBL_NAME:
      if (value == null) {
        unsetTbl_name();
      } else {
        setTbl_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDb_name();

    case TBL_NAME:
      return getTbl_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDb_name();
    case TBL_NAME:
      return isSetTbl_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CheckConstraintsRequest)
      return this.equals((CheckConstraintsRequest)that);
    return false;
  }

  public boolean equals(CheckConstraintsRequest that) {
    if (that == null)
      return false;

    boolean this_present_db_name = true && this.isSetDb_name();
    boolean that_present_db_name = true && that.isSetDb_name();
    if (this_present_db_name || that_present_db_name) {
      if (!(this_present_db_name && that_present_db_name))
        return false;
      if (!this.db_name.equals(that.db_name))
        return false;
    }

    boolean this_present_tbl_name = true && this.isSetTbl_name();
    boolean that_present_tbl_name = true && that.isSetTbl_name();
    if (this_present_tbl_name || that_present_tbl_name) {
      if (!(this_present_tbl_name && that_present_tbl_name))
        return false;
      if (!this.tbl_name.equals(that.tbl_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_db_name = true && (isSetDb_name());
    list.add(present_db_name);
    if (present_db_name)
      list.add(db_name);

    boolean present_tbl_name = true && (isSetTbl_name());
    list.add(present_tbl_name);
    if (present_tbl_name)
      list.add(tbl_name);

    return list.hashCode();
  }

  @Override
  public int compareTo(CheckConstraintsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDb_name()).compareTo(other.isSetDb_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db_name, other.db_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTbl_name()).compareTo(other.isSetTbl_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTbl_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tbl_name, other.tbl_name);
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
    StringBuilder sb = new StringBuilder("CheckConstraintsRequest(");
    boolean first = true;

    sb.append("db_name:");
    if (this.db_name == null) {
      sb.append("null");
    } else {
      sb.append(this.db_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tbl_name:");
    if (this.tbl_name == null) {
      sb.append("null");
    } else {
      sb.append(this.tbl_name);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDb_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'db_name' is unset! Struct:" + toString());
    }

    if (!isSetTbl_name()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tbl_name' is unset! Struct:" + toString());
    }

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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CheckConstraintsRequestStandardSchemeFactory implements SchemeFactory {
    public CheckConstraintsRequestStandardScheme getScheme() {
      return new CheckConstraintsRequestStandardScheme();
    }
  }

  private static class CheckConstraintsRequestStandardScheme extends StandardScheme<CheckConstraintsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db_name = iprot.readString();
              struct.setDb_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TBL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tbl_name = iprot.readString();
              struct.setTbl_nameIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.db_name != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.db_name);
        oprot.writeFieldEnd();
      }
      if (struct.tbl_name != null) {
        oprot.writeFieldBegin(TBL_NAME_FIELD_DESC);
        oprot.writeString(struct.tbl_name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CheckConstraintsRequestTupleSchemeFactory implements SchemeFactory {
    public CheckConstraintsRequestTupleScheme getScheme() {
      return new CheckConstraintsRequestTupleScheme();
    }
  }

  private static class CheckConstraintsRequestTupleScheme extends TupleScheme<CheckConstraintsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.db_name);
      oprot.writeString(struct.tbl_name);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CheckConstraintsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.db_name = iprot.readString();
      struct.setDb_nameIsSet(true);
      struct.tbl_name = iprot.readString();
      struct.setTbl_nameIsSet(true);
    }
  }

}
