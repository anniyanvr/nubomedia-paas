/*
 *
 *  * Copyright (c) 2016 Open Baton
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.project.openbaton.nubomedia.paas.exceptions;

/**
 * Created by maa on 21.10.15.
 */
public class ApplicationNotFoundException extends Exception {

  public ApplicationNotFoundException() {
    super();
  }

  public ApplicationNotFoundException(Throwable throwable) {
    super(throwable);
  }

  public ApplicationNotFoundException(String message) {
    super(message);
  }

  public ApplicationNotFoundException(String message, Throwable throwable) {
    super(message, throwable);
  }
}
