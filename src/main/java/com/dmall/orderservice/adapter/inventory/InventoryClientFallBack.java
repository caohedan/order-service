package com.dmall.orderservice.adapter.inventory;


import org.springframework.stereotype.Component;

@Component
public class InventoryClientFallBack implements InventoryClient{

  @Override
  public String lock(Lock lock) {
    return "DOWN!!!!";
  }

  @Override
  public void unlock(String lockId) {

  }
}
