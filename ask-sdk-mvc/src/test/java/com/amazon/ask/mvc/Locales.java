/*
    Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
 */

package com.amazon.ask.mvc;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 *
 */
public class Locales {
    public static final Locale en_US = Locale.forLanguageTag("en-US");
    public static final Locale en_GB = Locale.forLanguageTag("en-GB");
    public static final Locale fr_FR = Locale.forLanguageTag("fr-FR");
    public static final Locale de_DE = Locale.forLanguageTag("de-DE");

    public static List<Locale> values() {
        return Arrays.asList(en_US, en_GB, fr_FR, de_DE);
    }
}
