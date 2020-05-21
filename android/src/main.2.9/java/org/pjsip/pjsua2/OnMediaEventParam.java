/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnMediaEventParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnMediaEventParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnMediaEventParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnMediaEventParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEv(MediaEvent value) {
    pjsua2JNI.OnMediaEventParam_ev_set(swigCPtr, this, MediaEvent.getCPtr(value), value);
  }

  public MediaEvent getEv() {
    long cPtr = pjsua2JNI.OnMediaEventParam_ev_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MediaEvent(cPtr, false);
  }

  public OnMediaEventParam() {
    this(pjsua2JNI.new_OnMediaEventParam(), true);
  }

}
