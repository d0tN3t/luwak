package uk.co.flax.luwak.benchmark;

/*
 *   Copyright (c) 2015 Lemur Consulting Ltd.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import java.util.Set;

import uk.co.flax.luwak.InputDocument;
import uk.co.flax.luwak.QueryMatch;

public class ValidatorDocument<T extends QueryMatch> {

    private final InputDocument doc;
    private final Set<T> expectedMatches;

    public ValidatorDocument(InputDocument doc, Set<T> expectedMatches) {
        this.doc = doc;
        this.expectedMatches = expectedMatches;
    }

    public InputDocument getDocument() {
        return doc;
    }

    public Set<T> getExpectedMatches() {
        return expectedMatches;
    }
}
