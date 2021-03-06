// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.components.bigquery.integration;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertThat;

import java.util.ServiceLoader;

import org.junit.Test;
import org.talend.components.api.ComponentInstaller;
import org.talend.components.bigquery.BigQueryComponentFamilyDefinition;

/**
 * Unit tests to ensure that {@link BigQueryComponentFamilyDefinition} was created as an extensible service.
 */
public class BigQueryComponentFamilyDefinitionTest {

    @Test
    public void testServiceLoader() throws Exception {
        ServiceLoader<ComponentInstaller> spiLoader = ServiceLoader.load(ComponentInstaller.class);
        assertThat(spiLoader, hasItem(isA(BigQueryComponentFamilyDefinition.class)));
    }
}
