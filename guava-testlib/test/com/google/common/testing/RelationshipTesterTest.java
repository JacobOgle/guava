/*
 * Copyright (C) 2012 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.testing;

import com.google.common.testing.RelationshipTester.ItemReporter;
import com.google.common.testing.RelationshipTester.RelationshipAssertion;

import junit.framework.TestCase;

/**
 * Tests for {@link RelationshipTester}.
 *
 * @author Ben Yu
 */
public class RelationshipTesterTest extends TestCase {

  public void testNulls(){
    new ClassSanityTester()
        .setDefault(RelationshipAssertion.class, new RelationshipAssertion<Object>() {
          @Override void assertRelated(Object item, Object related) {}
          @Override void assertUnrelated(Object item, Object unrelated) {}
        })
        .setDefault(ItemReporter.class, new ItemReporter())
        .testNulls(RelationshipTester.class);
  }
}
