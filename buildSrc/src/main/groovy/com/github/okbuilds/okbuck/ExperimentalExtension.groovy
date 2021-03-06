package com.github.okbuilds.okbuck

import com.github.okbuilds.core.annotation.Experimental

@Experimental
class ExperimentalExtension {

    /**
     * Enable generation of robolectric rules.
     */
    boolean robolectric = false

    /**
     * Enable fetching source jars.
     */
    boolean sources = false

    /**
     * Enable generation of espresso test rules.
     */
    boolean espresso = false
}
