/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thriftgen.activation;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class ActivationService {

  public interface Iface {

    public CoordinationContext createCoordinationContext(String coordinationType, CoordinationContext currentContext, int expires) throws TException;

  }

  public interface AsyncIface {

    public void createCoordinationContext(String coordinationType, CoordinationContext currentContext, int expires, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.createCoordinationContext_call> resultHandler) throws TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public CoordinationContext createCoordinationContext(String coordinationType, CoordinationContext currentContext, int expires) throws TException
    {
      send_createCoordinationContext(coordinationType, currentContext, expires);
      return recv_createCoordinationContext();
    }

    public void send_createCoordinationContext(String coordinationType, CoordinationContext currentContext, int expires) throws TException
    {
      createCoordinationContext_args args = new createCoordinationContext_args();
      args.setCoordinationType(coordinationType);
      args.setCurrentContext(currentContext);
      args.setExpires(expires);
      sendBase("createCoordinationContext", args);
    }

    public CoordinationContext recv_createCoordinationContext() throws TException
    {
      createCoordinationContext_result result = new createCoordinationContext_result();
      receiveBase(result, "createCoordinationContext");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "createCoordinationContext failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void createCoordinationContext(String coordinationType, CoordinationContext currentContext, int expires, org.apache.thrift.async.AsyncMethodCallback<createCoordinationContext_call> resultHandler) throws TException {
      checkReady();
      createCoordinationContext_call method_call = new createCoordinationContext_call(coordinationType, currentContext, expires, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class createCoordinationContext_call extends org.apache.thrift.async.TAsyncMethodCall {
      private String coordinationType;
      private CoordinationContext currentContext;
      private int expires;
      public createCoordinationContext_call(String coordinationType, CoordinationContext currentContext, int expires, org.apache.thrift.async.AsyncMethodCallback<createCoordinationContext_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.coordinationType = coordinationType;
        this.currentContext = currentContext;
        this.expires = expires;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("createCoordinationContext", org.apache.thrift.protocol.TMessageType.CALL, 0));
        createCoordinationContext_args args = new createCoordinationContext_args();
        args.setCoordinationType(coordinationType);
        args.setCurrentContext(currentContext);
        args.setExpires(expires);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public CoordinationContext getResult() throws TException {
        if (getState() != State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_createCoordinationContext();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("createCoordinationContext", new createCoordinationContext());
      return processMap;
    }

    public static class createCoordinationContext<I extends Iface> extends org.apache.thrift.ProcessFunction<I, createCoordinationContext_args> {
      public createCoordinationContext() {
        super("createCoordinationContext");
      }

      public createCoordinationContext_args getEmptyArgsInstance() {
        return new createCoordinationContext_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public createCoordinationContext_result getResult(I iface, createCoordinationContext_args args) throws TException {
        createCoordinationContext_result result = new createCoordinationContext_result();
        result.success = iface.createCoordinationContext(args.coordinationType, args.currentContext, args.expires);
        return result;
      }
    }

  }

  public static class createCoordinationContext_args implements org.apache.thrift.TBase<createCoordinationContext_args, createCoordinationContext_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("createCoordinationContext_args");

    private static final org.apache.thrift.protocol.TField COORDINATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("coordinationType", org.apache.thrift.protocol.TType.STRING, (short)1);
    private static final org.apache.thrift.protocol.TField CURRENT_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("currentContext", org.apache.thrift.protocol.TType.STRUCT, (short)2);
    private static final org.apache.thrift.protocol.TField EXPIRES_FIELD_DESC = new org.apache.thrift.protocol.TField("expires", org.apache.thrift.protocol.TType.I32, (short)3);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new createCoordinationContext_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new createCoordinationContext_argsTupleSchemeFactory());
    }

    public String coordinationType; // required
    public CoordinationContext currentContext; // required
    public int expires; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      COORDINATION_TYPE((short)1, "coordinationType"),
      CURRENT_CONTEXT((short)2, "currentContext"),
      EXPIRES((short)3, "expires");

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
          case 1: // COORDINATION_TYPE
            return COORDINATION_TYPE;
          case 2: // CURRENT_CONTEXT
            return CURRENT_CONTEXT;
          case 3: // EXPIRES
            return EXPIRES;
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
    private static final int __EXPIRES_ISSET_ID = 0;
    private byte __isset_bitfield = 0;
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.COORDINATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("coordinationType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
      tmpMap.put(_Fields.CURRENT_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("currentContext", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CoordinationContext.class)));
      tmpMap.put(_Fields.EXPIRES, new org.apache.thrift.meta_data.FieldMetaData("expires", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(createCoordinationContext_args.class, metaDataMap);
    }

    public createCoordinationContext_args() {
    }

    public createCoordinationContext_args(
      String coordinationType,
      CoordinationContext currentContext,
      int expires)
    {
      this();
      this.coordinationType = coordinationType;
      this.currentContext = currentContext;
      this.expires = expires;
      setExpiresIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public createCoordinationContext_args(createCoordinationContext_args other) {
      __isset_bitfield = other.__isset_bitfield;
      if (other.isSetCoordinationType()) {
        this.coordinationType = other.coordinationType;
      }
      if (other.isSetCurrentContext()) {
        this.currentContext = new CoordinationContext(other.currentContext);
      }
      this.expires = other.expires;
    }

    public createCoordinationContext_args deepCopy() {
      return new createCoordinationContext_args(this);
    }

    @Override
    public void clear() {
      this.coordinationType = null;
      this.currentContext = null;
      setExpiresIsSet(false);
      this.expires = 0;
    }

    public String getCoordinationType() {
      return this.coordinationType;
    }

    public createCoordinationContext_args setCoordinationType(String coordinationType) {
      this.coordinationType = coordinationType;
      return this;
    }

    public void unsetCoordinationType() {
      this.coordinationType = null;
    }

    /** Returns true if field coordinationType is set (has been assigned a value) and false otherwise */
    public boolean isSetCoordinationType() {
      return this.coordinationType != null;
    }

    public void setCoordinationTypeIsSet(boolean value) {
      if (!value) {
        this.coordinationType = null;
      }
    }

    public CoordinationContext getCurrentContext() {
      return this.currentContext;
    }

    public createCoordinationContext_args setCurrentContext(CoordinationContext currentContext) {
      this.currentContext = currentContext;
      return this;
    }

    public void unsetCurrentContext() {
      this.currentContext = null;
    }

    /** Returns true if field currentContext is set (has been assigned a value) and false otherwise */
    public boolean isSetCurrentContext() {
      return this.currentContext != null;
    }

    public void setCurrentContextIsSet(boolean value) {
      if (!value) {
        this.currentContext = null;
      }
    }

    public int getExpires() {
      return this.expires;
    }

    public createCoordinationContext_args setExpires(int expires) {
      this.expires = expires;
      setExpiresIsSet(true);
      return this;
    }

    public void unsetExpires() {
      __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXPIRES_ISSET_ID);
    }

    /** Returns true if field expires is set (has been assigned a value) and false otherwise */
    public boolean isSetExpires() {
      return EncodingUtils.testBit(__isset_bitfield, __EXPIRES_ISSET_ID);
    }

    public void setExpiresIsSet(boolean value) {
      __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXPIRES_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case COORDINATION_TYPE:
        if (value == null) {
          unsetCoordinationType();
        } else {
          setCoordinationType((String)value);
        }
        break;

      case CURRENT_CONTEXT:
        if (value == null) {
          unsetCurrentContext();
        } else {
          setCurrentContext((CoordinationContext)value);
        }
        break;

      case EXPIRES:
        if (value == null) {
          unsetExpires();
        } else {
          setExpires((Integer)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case COORDINATION_TYPE:
        return getCoordinationType();

      case CURRENT_CONTEXT:
        return getCurrentContext();

      case EXPIRES:
        return Integer.valueOf(getExpires());

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case COORDINATION_TYPE:
        return isSetCoordinationType();
      case CURRENT_CONTEXT:
        return isSetCurrentContext();
      case EXPIRES:
        return isSetExpires();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof createCoordinationContext_args)
        return this.equals((createCoordinationContext_args)that);
      return false;
    }

    public boolean equals(createCoordinationContext_args that) {
      if (that == null)
        return false;

      boolean this_present_coordinationType = true && this.isSetCoordinationType();
      boolean that_present_coordinationType = true && that.isSetCoordinationType();
      if (this_present_coordinationType || that_present_coordinationType) {
        if (!(this_present_coordinationType && that_present_coordinationType))
          return false;
        if (!this.coordinationType.equals(that.coordinationType))
          return false;
      }

      boolean this_present_currentContext = true && this.isSetCurrentContext();
      boolean that_present_currentContext = true && that.isSetCurrentContext();
      if (this_present_currentContext || that_present_currentContext) {
        if (!(this_present_currentContext && that_present_currentContext))
          return false;
        if (!this.currentContext.equals(that.currentContext))
          return false;
      }

      boolean this_present_expires = true;
      boolean that_present_expires = true;
      if (this_present_expires || that_present_expires) {
        if (!(this_present_expires && that_present_expires))
          return false;
        if (this.expires != that.expires)
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(createCoordinationContext_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      createCoordinationContext_args typedOther = (createCoordinationContext_args)other;

      lastComparison = Boolean.valueOf(isSetCoordinationType()).compareTo(typedOther.isSetCoordinationType());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetCoordinationType()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coordinationType, typedOther.coordinationType);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetCurrentContext()).compareTo(typedOther.isSetCurrentContext());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetCurrentContext()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currentContext, typedOther.currentContext);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetExpires()).compareTo(typedOther.isSetExpires());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetExpires()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expires, typedOther.expires);
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
      StringBuilder sb = new StringBuilder("createCoordinationContext_args(");
      boolean first = true;

      sb.append("coordinationType:");
      if (this.coordinationType == null) {
        sb.append("null");
      } else {
        sb.append(this.coordinationType);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("currentContext:");
      if (this.currentContext == null) {
        sb.append("null");
      } else {
        sb.append(this.currentContext);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("expires:");
      sb.append(this.expires);
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws TException {
      // check for required fields
      // check for sub-struct validity
      if (currentContext != null) {
        currentContext.validate();
      }
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
        // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
        __isset_bitfield = 0;
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class createCoordinationContext_argsStandardSchemeFactory implements SchemeFactory {
      public createCoordinationContext_argsStandardScheme getScheme() {
        return new createCoordinationContext_argsStandardScheme();
      }
    }

    private static class createCoordinationContext_argsStandardScheme extends StandardScheme<createCoordinationContext_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, createCoordinationContext_args struct) throws TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // COORDINATION_TYPE
              if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                struct.coordinationType = iprot.readString();
                struct.setCoordinationTypeIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 2: // CURRENT_CONTEXT
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.currentContext = new CoordinationContext();
                struct.currentContext.read(iprot);
                struct.setCurrentContextIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 3: // EXPIRES
              if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                struct.expires = iprot.readI32();
                struct.setExpiresIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, createCoordinationContext_args struct) throws TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.coordinationType != null) {
          oprot.writeFieldBegin(COORDINATION_TYPE_FIELD_DESC);
          oprot.writeString(struct.coordinationType);
          oprot.writeFieldEnd();
        }
        if (struct.currentContext != null) {
          oprot.writeFieldBegin(CURRENT_CONTEXT_FIELD_DESC);
          struct.currentContext.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldBegin(EXPIRES_FIELD_DESC);
        oprot.writeI32(struct.expires);
        oprot.writeFieldEnd();
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class createCoordinationContext_argsTupleSchemeFactory implements SchemeFactory {
      public createCoordinationContext_argsTupleScheme getScheme() {
        return new createCoordinationContext_argsTupleScheme();
      }
    }

    private static class createCoordinationContext_argsTupleScheme extends TupleScheme<createCoordinationContext_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, createCoordinationContext_args struct) throws TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetCoordinationType()) {
          optionals.set(0);
        }
        if (struct.isSetCurrentContext()) {
          optionals.set(1);
        }
        if (struct.isSetExpires()) {
          optionals.set(2);
        }
        oprot.writeBitSet(optionals, 3);
        if (struct.isSetCoordinationType()) {
          oprot.writeString(struct.coordinationType);
        }
        if (struct.isSetCurrentContext()) {
          struct.currentContext.write(oprot);
        }
        if (struct.isSetExpires()) {
          oprot.writeI32(struct.expires);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, createCoordinationContext_args struct) throws TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(3);
        if (incoming.get(0)) {
          struct.coordinationType = iprot.readString();
          struct.setCoordinationTypeIsSet(true);
        }
        if (incoming.get(1)) {
          struct.currentContext = new CoordinationContext();
          struct.currentContext.read(iprot);
          struct.setCurrentContextIsSet(true);
        }
        if (incoming.get(2)) {
          struct.expires = iprot.readI32();
          struct.setExpiresIsSet(true);
        }
      }
    }

  }

  public static class createCoordinationContext_result implements org.apache.thrift.TBase<createCoordinationContext_result, createCoordinationContext_result._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("createCoordinationContext_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new createCoordinationContext_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new createCoordinationContext_resultTupleSchemeFactory());
    }

    public CoordinationContext success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

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
          case 0: // SUCCESS
            return SUCCESS;
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
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CoordinationContext.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(createCoordinationContext_result.class, metaDataMap);
    }

    public createCoordinationContext_result() {
    }

    public createCoordinationContext_result(
      CoordinationContext success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public createCoordinationContext_result(createCoordinationContext_result other) {
      if (other.isSetSuccess()) {
        this.success = new CoordinationContext(other.success);
      }
    }

    public createCoordinationContext_result deepCopy() {
      return new createCoordinationContext_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public CoordinationContext getSuccess() {
      return this.success;
    }

    public createCoordinationContext_result setSuccess(CoordinationContext success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((CoordinationContext)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof createCoordinationContext_result)
        return this.equals((createCoordinationContext_result)that);
      return false;
    }

    public boolean equals(createCoordinationContext_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(createCoordinationContext_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      createCoordinationContext_result typedOther = (createCoordinationContext_result)other;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(typedOther.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, typedOther.success);
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
      StringBuilder sb = new StringBuilder("createCoordinationContext_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
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

    private static class createCoordinationContext_resultStandardSchemeFactory implements SchemeFactory {
      public createCoordinationContext_resultStandardScheme getScheme() {
        return new createCoordinationContext_resultStandardScheme();
      }
    }

    private static class createCoordinationContext_resultStandardScheme extends StandardScheme<createCoordinationContext_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, createCoordinationContext_result struct) throws TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new CoordinationContext();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, createCoordinationContext_result struct) throws TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class createCoordinationContext_resultTupleSchemeFactory implements SchemeFactory {
      public createCoordinationContext_resultTupleScheme getScheme() {
        return new createCoordinationContext_resultTupleScheme();
      }
    }

    private static class createCoordinationContext_resultTupleScheme extends TupleScheme<createCoordinationContext_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, createCoordinationContext_result struct) throws TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, createCoordinationContext_result struct) throws TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new CoordinationContext();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}