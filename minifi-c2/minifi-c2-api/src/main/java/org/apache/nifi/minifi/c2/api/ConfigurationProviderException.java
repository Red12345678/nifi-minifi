/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.minifi.c2.api;

public class ConfigurationProviderException extends Exception {
    public ConfigurationProviderException(String message) {
        super(message);
    }

    public ConfigurationProviderException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigurationProviderException.Wrapper wrap() {
        return new Wrapper(this);
    }

    public static class Wrapper extends RuntimeException {
        public Wrapper(ConfigurationProviderException cause) {
            super(cause);
        }

        public ConfigurationProviderException unwrap() {
            return (ConfigurationProviderException) getCause();
        }
    }
}
