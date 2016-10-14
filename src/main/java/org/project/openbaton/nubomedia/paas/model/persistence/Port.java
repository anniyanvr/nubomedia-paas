/*
 *
 *  * (C) Copyright 2016 NUBOMEDIA (http://www.nubomedia.eu)
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *
 *
 */

package org.project.openbaton.nubomedia.paas.model.persistence;

import org.openbaton.catalogue.util.IdGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 * Created by maa on 08.10.15.
 */
@Entity
public class Port {
  @Id private String id;
  private int port;
  private int targetPort;
  private String protocol;

  public Port() {}

  public Port(int port, int targetPort, String protocol) {
    this.port = port;
    this.targetPort = targetPort;
    this.protocol = protocol;
  }

  @PrePersist
  public void ensureId() {
    id = IdGenerator.createUUID();
  }

  public String getId() {
    return id;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public int getTargetPort() {
    return targetPort;
  }

  public void setTargetPort(int targetPort) {
    this.targetPort = targetPort;
  }

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  @Override
  public String toString() {
    return "Port{"
        + "id='"
        + id
        + '\''
        + ", port="
        + port
        + ", targetPort="
        + targetPort
        + ", protocol='"
        + protocol
        + '\''
        + '}';
  }
}
