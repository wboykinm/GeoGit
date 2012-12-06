/* Copyright (c) 2011 TOPP - www.openplans.org. All rights reserved.
 * This code is licensed under the LGPL 2.1 license, available at the root
 * application directory.
 */
package org.geogit.storage;

import org.geogit.api.RevObject;

/**
 * Encapsulates a transaction.
 * <p>
 * Use the same ObjectInserter for a single transaction
 * </p>
 * 
 */
public class ObjectInserter {

    private ObjectDatabase objectDb;

    // TODO: transaction management
    /**
     * Constructs a new {@code ObjectInserter} with the given {@link ObjectDatabase}.
     * 
     * @param objectDatabase the database to insert to
     */
    public ObjectInserter(ObjectDatabase objectDatabase) {
        objectDb = objectDatabase;
    }

    /**
     * @param object
     */
    public void insert(RevObject object) {
        objectDb.put(object);
    }

}
