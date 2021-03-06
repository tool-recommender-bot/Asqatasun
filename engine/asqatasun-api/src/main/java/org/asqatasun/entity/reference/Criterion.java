/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2015  Asqatasun.org
 *
 * This file is part of Asqatasun.
 *
 * Asqatasun is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: asqatasun AT asqatasun DOT org
 */
package org.asqatasun.entity.reference;

import java.util.Collection;
import org.asqatasun.sdk.entity.Entity;
import org.asqatasun.sdk.entity.Reorderable;

/**
 * 
 * @author jkowalczyk
 */
public interface Criterion extends Entity, Reorderable {

    /**
     *
     * @param test
     *            the test to set
     */
    void addTest(Test test);

    /**
     *
     * @return the code
     */
    String getCode();

    /**
     *
     * @return the description
     */
    String getDescription();

    /**
     *
     * @return the label
     */
    String getLabel();

    /**
     *
     * @return the reference
     */
    Reference getReference();

    /**
     *
     * @return the url
     */
    String getUrl();

    /**
     *
     * @return the tests
     */
    Collection<Test> getTestList();

    /**
     *
     * @return the theme
     */
    Theme getTheme();

    /**
     *
     * @param code
     *            the code to set
     */
    void setCode(String code);

    /**
     *
     * @param description
     *            the description to set
     */
    void setDescription(String description);

    /**
     *
     * @param label
     *            the label to set
     */
    void setLabel(String label);

    /**
     *
     * @param reference
     *            the reference to set
     */
    void setReference(Reference reference);

    /**
     *
     * @param tests
     *            the tests to set
     */
    void setTestList(Collection<Test> tests);

    /**
     *
     * @param theme
     *            the theme to set
     */
    void setTheme(Theme theme);

    /**
     *
     * @param url
     *            the url to set
     */
    void setUrl(String url);

}