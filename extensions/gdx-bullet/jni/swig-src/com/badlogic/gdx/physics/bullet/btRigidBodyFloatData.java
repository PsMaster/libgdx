/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btRigidBodyFloatData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btRigidBodyFloatData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btRigidBodyFloatData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btRigidBodyFloatData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_collisionObjectData(btCollisionObjectFloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_collisionObjectData_set(swigCPtr, this, btCollisionObjectFloatData.getCPtr(value), value);
  }

  public btCollisionObjectFloatData getM_collisionObjectData() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_collisionObjectData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCollisionObjectFloatData(cPtr, false);
  }

  public void setM_invInertiaTensorWorld(SWIGTYPE_p_btMatrix3x3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_invInertiaTensorWorld_set(swigCPtr, this, SWIGTYPE_p_btMatrix3x3FloatData.getCPtr(value));
  }

  public SWIGTYPE_p_btMatrix3x3FloatData getM_invInertiaTensorWorld() {
    return new SWIGTYPE_p_btMatrix3x3FloatData(gdxBulletJNI.btRigidBodyFloatData_m_invInertiaTensorWorld_get(swigCPtr, this), true);
  }

  public void setM_linearVelocity(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_linearVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_linearVelocity() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_linearVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_angularVelocity(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_angularVelocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_angularVelocity() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_angularVelocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_angularFactor(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_angularFactor_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_angularFactor() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_angularFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_linearFactor(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_linearFactor_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_linearFactor() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_linearFactor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_gravity(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_gravity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_gravity() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_gravity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_gravity_acceleration(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_gravity_acceleration_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_gravity_acceleration() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_gravity_acceleration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_invInertiaLocal(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_invInertiaLocal_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_invInertiaLocal() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_invInertiaLocal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_totalForce(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_totalForce_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_totalForce() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_totalForce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_totalTorque(btVector3FloatData value) {
    gdxBulletJNI.btRigidBodyFloatData_m_totalTorque_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_totalTorque() {
    long cPtr = gdxBulletJNI.btRigidBodyFloatData_m_totalTorque_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_inverseMass(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_inverseMass_set(swigCPtr, this, value);
  }

  public float getM_inverseMass() {
    return gdxBulletJNI.btRigidBodyFloatData_m_inverseMass_get(swigCPtr, this);
  }

  public void setM_linearDamping(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_linearDamping_set(swigCPtr, this, value);
  }

  public float getM_linearDamping() {
    return gdxBulletJNI.btRigidBodyFloatData_m_linearDamping_get(swigCPtr, this);
  }

  public void setM_angularDamping(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_angularDamping_set(swigCPtr, this, value);
  }

  public float getM_angularDamping() {
    return gdxBulletJNI.btRigidBodyFloatData_m_angularDamping_get(swigCPtr, this);
  }

  public void setM_additionalDampingFactor(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_additionalDampingFactor_set(swigCPtr, this, value);
  }

  public float getM_additionalDampingFactor() {
    return gdxBulletJNI.btRigidBodyFloatData_m_additionalDampingFactor_get(swigCPtr, this);
  }

  public void setM_additionalLinearDampingThresholdSqr(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_additionalLinearDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public float getM_additionalLinearDampingThresholdSqr() {
    return gdxBulletJNI.btRigidBodyFloatData_m_additionalLinearDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setM_additionalAngularDampingThresholdSqr(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_additionalAngularDampingThresholdSqr_set(swigCPtr, this, value);
  }

  public float getM_additionalAngularDampingThresholdSqr() {
    return gdxBulletJNI.btRigidBodyFloatData_m_additionalAngularDampingThresholdSqr_get(swigCPtr, this);
  }

  public void setM_additionalAngularDampingFactor(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_additionalAngularDampingFactor_set(swigCPtr, this, value);
  }

  public float getM_additionalAngularDampingFactor() {
    return gdxBulletJNI.btRigidBodyFloatData_m_additionalAngularDampingFactor_get(swigCPtr, this);
  }

  public void setM_linearSleepingThreshold(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_linearSleepingThreshold_set(swigCPtr, this, value);
  }

  public float getM_linearSleepingThreshold() {
    return gdxBulletJNI.btRigidBodyFloatData_m_linearSleepingThreshold_get(swigCPtr, this);
  }

  public void setM_angularSleepingThreshold(float value) {
    gdxBulletJNI.btRigidBodyFloatData_m_angularSleepingThreshold_set(swigCPtr, this, value);
  }

  public float getM_angularSleepingThreshold() {
    return gdxBulletJNI.btRigidBodyFloatData_m_angularSleepingThreshold_get(swigCPtr, this);
  }

  public void setM_additionalDamping(int value) {
    gdxBulletJNI.btRigidBodyFloatData_m_additionalDamping_set(swigCPtr, this, value);
  }

  public int getM_additionalDamping() {
    return gdxBulletJNI.btRigidBodyFloatData_m_additionalDamping_get(swigCPtr, this);
  }

  public btRigidBodyFloatData() {
    this(gdxBulletJNI.new_btRigidBodyFloatData(), true);
  }

}
