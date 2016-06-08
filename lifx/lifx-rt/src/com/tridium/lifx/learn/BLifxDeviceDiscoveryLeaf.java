/**
 * Copyright 2013 - All Rights Reserved.
 */
package com.tridium.lifx.learn;

import javax.baja.control.*;
import javax.baja.registry.TypeInfo;
import javax.baja.status.*;
import javax.baja.sys.*;
import javax.baja.nre.util.Array;
import javax.baja.nre.annotations.*;

import com.tridium.ndriver.discover.BNDiscoveryLeaf;
import com.tridium.ndriver.util.SfUtil;
import com.tridium.lifx.BLifxDevice;


/**
 * BLifxDeviceDiscoveryLeaf is container class for Device elements to display in 
 * Device discovery pane and pass to new Device callback.
 *
 * @author Aaron D'souza
 * @creation 05-Jun-16 
 */
public class BLifxDeviceDiscoveryLeaf
    extends BNDiscoveryLeaf
{
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/


////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BLifxDeviceDiscoveryLeaf.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  public BLifxDeviceDiscoveryLeaf() {}
  

  /* Called when adding new object based on this discovery leaf.   */
  public TypeInfo[] getValidDatabaseTypes()
  {
    return new TypeInfo[] { BLifxDevice.TYPE.getTypeInfo() };
  }
  
  /**
   * Override to specify the default name when adding this discovery object
   * to the station.
   */
  public String getDiscoveryName()
  {
    //
    // TODO - specify the default name for discovery entry
    //
    return "Lifx Bulb";
  }

  
  /* Called when adding new object based on this discovery leaf.   */
  public void updateTarget(BComponent target)
  {
    //
    // TODO - initialize values in new Device
    //
  }
  
  /**
   * Return true if the specified component is an existing representation
   * of this discovery object. 
   */
  public boolean isExisting(BComponent target) 
  { 
    //
    // TODO - return true if specified component represents this leaf
    //
    
    return false;
  }

 
}
