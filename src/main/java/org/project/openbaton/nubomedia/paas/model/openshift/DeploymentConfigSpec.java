/*
 * Copyright (c) 2015-2016 Fraunhofer FOKUS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.project.openbaton.nubomedia.paas.model.openshift;

/**
 * Created by maa on 25/09/2015.
 */
public class DeploymentConfigSpec {

  private Template template;
  private int replicas;
  private Selector selector;
  private ImageChangeTrigger[] triggers;
  private Strategy strategy;

  public static class Strategy {
    String type;

    public Strategy(String type) {
      this.type = type;
    }

    public Strategy() {}

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }
  }

  public DeploymentConfigSpec(
      Template template,
      int replicas,
      Selector selectors,
      ImageChangeTrigger[] triggers,
      Strategy strategy) {
    this.template = template;
    this.replicas = replicas;
    this.selector = selectors;
    this.triggers = triggers;
    this.strategy = strategy;
  }

  public DeploymentConfigSpec() {}

  public Template getTemplate() {
    return template;
  }

  public void setTemplate(Template template) {
    this.template = template;
  }

  public int getReplicas() {
    return replicas;
  }

  public void setReplicas(int replicas) {
    this.replicas = replicas;
  }

  public Selector getSelector() {
    return selector;
  }

  public void setSelector(Selector selector) {
    this.selector = selector;
  }

  public ImageChangeTrigger[] getTriggers() {
    return triggers;
  }

  public void setTriggers(ImageChangeTrigger[] triggers) {
    this.triggers = triggers;
  }

  public Strategy getStrategy() {
    return strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}
