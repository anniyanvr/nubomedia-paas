/*
 * Copyright (c) 2015 Fraunhofer FOKUS
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

package org.project.openbaton.nubomedia.paas.security.interfaces;

import org.project.openbaton.nubomedia.paas.model.persistence.security.User;

/**
 * Created by mpa on 30/04/15.
 */
public interface UserManagement {

  User getCurrentUser();

  /**
   *
   * @param user
   */
  User add(User user);

  /**
   *
   * @param user
   */
  void delete(User user);

  /**
   *
   * @param new_user
   */
  User update(User new_user);

  /**
   *
   * @return
   */
  Iterable<User> query();

  /**
   *
   * @param username
   */
  User query(String username);

  User queryDB(String currentUserName);

  void changePassword(String oldPwd, String newPwd);
}
