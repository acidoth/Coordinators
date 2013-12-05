/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftgen.activation;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidProtocol extends TException implements org.apache.thrift.TBase<InvalidProtocol, InvalidProtocol._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InvalidProtocol");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SUBCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("subcode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("reason", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InvalidProtocolStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InvalidProtocolTupleSchemeFactory());
  }

  public String code; // required
  public String subcode; // required
  public String reason; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    SUBCODE((short)2, "subcode"),
    REASON((short)3, "reason");

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
        case 1: // CODE
          return CODE;
        case 2: // SUBCODE
          return SUBCODE;
        case 3: // REASON
          return REASON;
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
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUBCODE, new org.apache.thrift.meta_data.FieldMetaData("subcode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REASON, new org.apache.thrift.meta_data.FieldMetaData("reason", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InvalidProtocol.class, metaDataMap);
  }

  public InvalidProtocol() {
  }

  public InvalidProtocol(
    String code,
    String subcode,
    String reason)
  {
    this();
    this.code = code;
    this.subcode = subcode;
    this.reason = reason;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InvalidProtocol(InvalidProtocol other) {
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetSubcode()) {
      this.subcode = other.subcode;
    }
    if (other.isSetReason()) {
      this.reason = other.reason;
    }
  }

  public InvalidProtocol deepCopy() {
    return new InvalidProtocol(this);
  }

  @Override
  public void clear() {
    this.code = null;
    this.subcode = null;
    this.reason = null;
  }

  public String getCode() {
    return this.code;
  }

  public InvalidProtocol setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public String getSubcode() {
    return this.subcode;
  }

  public InvalidProtocol setSubcode(String subcode) {
    this.subcode = subcode;
    return this;
  }

  public void unsetSubcode() {
    this.subcode = null;
  }

  /** Returns true if field subcode is set (has been assigned a value) and false otherwise */
  public boolean isSetSubcode() {
    return this.subcode != null;
  }

  public void setSubcodeIsSet(boolean value) {
    if (!value) {
      this.subcode = null;
    }
  }

  public String getReason() {
    return this.reason;
  }

  public InvalidProtocol setReason(String reason) {
    this.reason = reason;
    return this;
  }

  public void unsetReason() {
    this.reason = null;
  }

  /** Returns true if field reason is set (has been assigned a value) and false otherwise */
  public boolean isSetReason() {
    return this.reason != null;
  }

  public void setReasonIsSet(boolean value) {
    if (!value) {
      this.reason = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    case SUBCODE:
      if (value == null) {
        unsetSubcode();
      } else {
        setSubcode((String)value);
      }
      break;

    case REASON:
      if (value == null) {
        unsetReason();
      } else {
        setReason((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case SUBCODE:
      return getSubcode();

    case REASON:
      return getReason();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case SUBCODE:
      return isSetSubcode();
    case REASON:
      return isSetReason();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InvalidProtocol)
      return this.equals((InvalidProtocol)that);
    return false;
  }

  public boolean equals(InvalidProtocol that) {
    if (that == null)
      return false;

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_subcode = true && this.isSetSubcode();
    boolean that_present_subcode = true && that.isSetSubcode();
    if (this_present_subcode || that_present_subcode) {
      if (!(this_present_subcode && that_present_subcode))
        return false;
      if (!this.subcode.equals(that.subcode))
        return false;
    }

    boolean this_present_reason = true && this.isSetReason();
    boolean that_present_reason = true && that.isSetReason();
    if (this_present_reason || that_present_reason) {
      if (!(this_present_reason && that_present_reason))
        return false;
      if (!this.reason.equals(that.reason))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(InvalidProtocol other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    InvalidProtocol typedOther = (InvalidProtocol)other;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(typedOther.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, typedOther.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubcode()).compareTo(typedOther.isSetSubcode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubcode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subcode, typedOther.subcode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReason()).compareTo(typedOther.isSetReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReason()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reason, typedOther.reason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InvalidProtocol(");
    boolean first = true;

    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("subcode:");
    if (this.subcode == null) {
      sb.append("null");
    } else {
      sb.append(this.subcode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reason:");
    if (this.reason == null) {
      sb.append("null");
    } else {
      sb.append(this.reason);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (code == null) {
      throw new TProtocolException("Required field 'code' was not present! Struct: " + toString());
    }
    if (subcode == null) {
      throw new TProtocolException("Required field 'subcode' was not present! Struct: " + toString());
    }
    if (reason == null) {
      throw new TProtocolException("Required field 'reason' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class InvalidProtocolStandardSchemeFactory implements SchemeFactory {
    public InvalidProtocolStandardScheme getScheme() {
      return new InvalidProtocolStandardScheme();
    }
  }

  private static class InvalidProtocolStandardScheme extends StandardScheme<InvalidProtocol> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InvalidProtocol struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUBCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subcode = iprot.readString();
              struct.setSubcodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REASON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reason = iprot.readString();
              struct.setReasonIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InvalidProtocol struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.subcode != null) {
        oprot.writeFieldBegin(SUBCODE_FIELD_DESC);
        oprot.writeString(struct.subcode);
        oprot.writeFieldEnd();
      }
      if (struct.reason != null) {
        oprot.writeFieldBegin(REASON_FIELD_DESC);
        oprot.writeString(struct.reason);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InvalidProtocolTupleSchemeFactory implements SchemeFactory {
    public InvalidProtocolTupleScheme getScheme() {
      return new InvalidProtocolTupleScheme();
    }
  }

  private static class InvalidProtocolTupleScheme extends TupleScheme<InvalidProtocol> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InvalidProtocol struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.code);
      oprot.writeString(struct.subcode);
      oprot.writeString(struct.reason);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InvalidProtocol struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.code = iprot.readString();
      struct.setCodeIsSet(true);
      struct.subcode = iprot.readString();
      struct.setSubcodeIsSet(true);
      struct.reason = iprot.readString();
      struct.setReasonIsSet(true);
    }
  }

}

