// Copyright (c) 2017, Baidu.com, Inc. All Rights Reserved

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.baidu.palo.analysis;

import com.baidu.palo.catalog.Column;
import com.baidu.palo.catalog.ColumnType;
import com.baidu.palo.qe.ShowResultSetMetaData;

// Show plugins statement.
// TODO(zhaochun): only for support MySQL
public class ShowPluginsStmt extends ShowStmt {
    private static final ShowResultSetMetaData META_DATA =
            ShowResultSetMetaData.builder()
                    .addColumn(new Column("Name", ColumnType.createVarchar(64)))
                    .addColumn(new Column("Status", ColumnType.createVarchar(10)))
                    .addColumn(new Column("Type", ColumnType.createVarchar(80)))
                    .addColumn(new Column("Library", ColumnType.createVarchar(64)))
                    .addColumn(new Column("License", ColumnType.createVarchar(80)))
                    .build();

    @Override
    public void analyze(Analyzer analyzer) {
    }

    @Override
    public String toSql() {
        return "SHOW PLUGINS";
    }

    @Override
    public String toString() {
        return toSql();
    }

    @Override
    public ShowResultSetMetaData getMetaData() {
        return META_DATA;
    }
}
