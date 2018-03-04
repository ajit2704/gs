/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sleepycat.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TCachePriority implements org.apache.thrift.TEnum {
  VERY_LOW(1),
  LOW(2),
  DEFAULT(3),
  HIGH(4),
  VERY_HIGH(5);

  private final int value;

  private TCachePriority(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TCachePriority findByValue(int value) { 
    switch (value) {
      case 1:
        return VERY_LOW;
      case 2:
        return LOW;
      case 3:
        return DEFAULT;
      case 4:
        return HIGH;
      case 5:
        return VERY_HIGH;
      default:
        return null;
    }
  }
}