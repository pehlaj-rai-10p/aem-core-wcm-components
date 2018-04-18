/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2017 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.sandbox.models;

import javax.annotation.Nonnull;

import org.apache.sling.api.resource.Resource;

import com.adobe.cq.export.json.ComponentExporter;

/**
 * Defines the {@code Teaser} Sling Model for the {@code /apps/core/wcm/components/teaser} component.
 *
 * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
 */
public interface Teaser extends ComponentExporter {

    /**
     * Name of the resource property that will store if the image link should be hidden.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_HIDE_IMAGE_LINK = "hideImageLink";

    /**
     * Name of the resource property that will store if the title should be hidden.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_HIDE_TITLE = "hideTitle";

    /**
     * Name of the resource property that will store if the title link should be hidden.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_HIDE_TITLE_LINK = "hideTitleLink";

    /**
     * Name of the resource property that will store if the description should be hidden.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_HIDE_DESCRIPTION = "hideDescription";

    /**
     * Name of the resource property that will store if the description link should be hidden.
     *
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    String PN_HIDE_DESCRIPTION_LINK = "hideDescriptionLink";

    /**
     * Returns the URL to which this teaser links, if one was defined.
     *
     * @return the URL to which teaser links or {@code null}
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default String getLinkURL() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the image resource for this teaser.
     * @return the image resource for this teaser or {@code null}
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default Resource getImageResource() {
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if link should be hidden on the image.
     *
     * @return {@code true} if link should be hidden on the image, {@code false} otherwise
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default boolean isHideImageLink() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns this teaser's title, if one was defined.
     *
     * @return the teaser's title or {@code null}
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default String getTitle() {
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if link should be hidden on the title.
     *
     * @return {@code true} if link should be hidden on the title, {@code false} otherwise
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default boolean isHideTitleLink() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns this teaser's description, if one was defined.
     *
     * @return the teaser's description or {@code null}
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default String getDescription() {
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if link should be hidden on the description.
     *
     * @return {@code true} if link should be hidden on the description, {@code false} otherwise
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    default boolean isHideDescriptionLink() {
        throw new UnsupportedOperationException();
    }

    /**
     * @since com.adobe.cq.wcm.core.components.sandbox.models 1.0.0
     */
    @Nonnull
    @Override
    default String getExportedType() {
        throw new UnsupportedOperationException();
    }

}
