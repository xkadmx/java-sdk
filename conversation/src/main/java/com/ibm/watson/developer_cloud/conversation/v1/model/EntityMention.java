/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.conversation.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * An object describing a contextual entity mention.
 */
public class EntityMention extends GenericModel {

  @SerializedName("text")
  private String exampleText;
  @SerializedName("intent")
  private String intentName;
  private List<Long> location;

  /**
   * Gets the exampleText.
   *
   * The text of the user input example.
   *
   * @return the exampleText
   */
  public String getExampleText() {
    return exampleText;
  }

  /**
   * Gets the intentName.
   *
   * The name of the intent.
   *
   * @return the intentName
   */
  public String getIntentName() {
    return intentName;
  }

  /**
   * Gets the location.
   *
   * An array of zero-based character offsets that indicate where the entity mentions begin and end in the input text.
   *
   * @return the location
   */
  public List<Long> getLocation() {
    return location;
  }
}
