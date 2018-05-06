/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\dubo\\Desktop\\demo\\DroidPlugin-master\\Test\\ApiTest\\src\\com\\example\\ApiTest\\Binder2.aidl
 */
package com.example.ApiTest;
/**
 * Created by zhangyong6 on 2016/1/25.
 */
public interface Binder2 extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.ApiTest.Binder2
{
private static final java.lang.String DESCRIPTOR = "com.example.ApiTest.Binder2";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.ApiTest.Binder2 interface,
 * generating a proxy if needed.
 */
public static com.example.ApiTest.Binder2 asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.ApiTest.Binder2))) {
return ((com.example.ApiTest.Binder2)iin);
}
return new com.example.ApiTest.Binder2.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_ping:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.ping(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_pingStr:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.pingStr(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.ApiTest.Binder2
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int ping(int inValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(inValue);
mRemote.transact(Stub.TRANSACTION_ping, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String pingStr(java.lang.String inValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(inValue);
mRemote.transact(Stub.TRANSACTION_pingStr, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_ping = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_pingStr = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public int ping(int inValue) throws android.os.RemoteException;
public java.lang.String pingStr(java.lang.String inValue) throws android.os.RemoteException;
}
