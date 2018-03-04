//------------------------------------------------------------------------------
// <auto-generated />
//
// This file was automatically generated by SWIG (http://www.swig.org).
// Version 3.0.7
//
// Do not make changes to this file unless you know what you are doing--modify
// the SWIG interface file instead.
//------------------------------------------------------------------------------

namespace BerkeleyDB.Internal {

using global::System;
using global::System.Runtime.InteropServices;

internal class DB_TXN_TOKEN : global::System.IDisposable {
  private global::System.Runtime.InteropServices.HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal DB_TXN_TOKEN(global::System.IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new global::System.Runtime.InteropServices.HandleRef(this, cPtr);
  }

  internal static global::System.Runtime.InteropServices.HandleRef getCPtr(DB_TXN_TOKEN obj) {
    return (obj == null) ? new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero) : obj.swigCPtr;
  }

  ~DB_TXN_TOKEN() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != global::System.IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          libdb_csharpPINVOKE.delete_DB_TXN_TOKEN(swigCPtr);
        }
        swigCPtr = new global::System.Runtime.InteropServices.HandleRef(null, global::System.IntPtr.Zero);
      }
      global::System.GC.SuppressFinalize(this);
    }
  }

	internal DB_TXN_TOKEN(byte[] token) : this() {
		buf = token;
}

  internal byte[] buf {
    set {
      libdb_csharpPINVOKE.DB_TXN_TOKEN_buf_set(swigCPtr, value);
    } 
	get {
		byte[] ret = new byte[DbConstants.DB_TXN_TOKEN_SIZE];
		IntPtr cPtr = libdb_csharpPINVOKE.DB_TXN_TOKEN_buf_get(swigCPtr);
		Marshal.Copy(cPtr, ret, 0, ret.Length);
		return ret;
	}

  }

  internal DB_TXN_TOKEN() : this(libdb_csharpPINVOKE.new_DB_TXN_TOKEN(), true) {
  }

}

}