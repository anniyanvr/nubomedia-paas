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

package org.project.openbaton.nubomedia.paas.model.persistence.security;

import org.openbaton.catalogue.util.IdGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User {

  @Id private String id;

  @Column(unique = true)
  private String username;

  private String password;

  private boolean enabled;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private Set<Role> roles;

  private String email;

  public boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "User{"
        + "id='"
        + id
        + '\''
        + ", username='"
        + username
        + '\''
        + ", password='"
        + password
        + '\''
        + ", enabled="
        + enabled
        + ", roles="
        + roles
        + ", email='"
        + email
        + '\''
        + '}';
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @PrePersist
  public void ensureId() {
    id = IdGenerator.createUUID();
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
