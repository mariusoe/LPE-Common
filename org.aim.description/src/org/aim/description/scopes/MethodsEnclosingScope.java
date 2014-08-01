/**
 * Copyright 2014 SAP AG
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
package org.aim.description.scopes;

/**
 * This is a common interface for all scopes referring to sets of method
 * enclosures.
 * 
 * @author Henning Schulz
 * 
 */
public abstract class MethodsEnclosingScope implements Scope {
	private final long id;

	public MethodsEnclosingScope(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return id;
	}
}