package com.huang.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author Huang Guojun
 * @Date 2018/11/14
 * @Discription
 */
public class JavaCollection {
    List addressList;
    Set  addressSet;
    Map addressMap;
    Properties addressProp;

    public List getAddressList() {
        return addressList;
    }

    public void setAddressList(List addressList) {
        System.out.println("List Elements :"  + addressList);
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set addressSet) {
        System.out.println("Set Elements :"  + addressSet);
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        return addressMap;
    }

    public void setAddressMap(Map addressMap) {
        System.out.println("Map Elements :"  + addressMap);
        this.addressMap = addressMap;
    }

    public Properties getAddressProp() {
        return addressProp;
    }

    public void setAddressProp(Properties addressProp) {
        System.out.println("Properties Elements :"  + addressProp);
        this.addressProp = addressProp;
    }
}
