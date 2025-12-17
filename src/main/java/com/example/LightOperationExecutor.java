package com.example;

import java.util.ArrayList;
import java.util.List;

public class LightOperationExecutor {
  private List<LightOperation> operations = new ArrayList<>();

  public void addOperation(LightOperation operation) {
    operations.add(operation);
  }

  public void executeOperations() {
    operations.forEach(LightOperation::execute);
    operations.clear();
  }
}
