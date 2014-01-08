/*
 Copyright 2013 Red Hat, Inc. and/or its affiliates.

 This file is part of lightblue.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.redhat.lightblue.crud;

import java.util.HashMap;
import java.util.Map;

/**
 * Operators than can be used in an update expression
 */
public enum UpdateOperator {
    _set("$set"),
    _unset("$unset"),
    _add("$add"),
    _pop("$pop"),
    _remove("$remove"),
    _push("$push");

    private final String op;

    private static final Map<String, UpdateOperator> map;

    static {
        map = new HashMap<String, UpdateOperator>();
        map.put(_set.op, _set);
        map.put(_unset.op, _unset);
        map.put(_add.op, _add);
        map.put(_pop.op, _pop);
        map.put(_remove.op, _remove);
        map.put(_push.op, _push);
    }

    private UpdateOperator(String op) {
        this.op = op;
    }

    public String toString() {
        return op;
    }

    public static UpdateOperator fromString(String s) {
        return map.get(s);
    }
}
